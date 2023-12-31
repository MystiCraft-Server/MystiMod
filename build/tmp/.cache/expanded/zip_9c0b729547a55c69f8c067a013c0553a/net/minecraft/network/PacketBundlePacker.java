package net.minecraft.network;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.network.protocol.BundlerInfo;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketFlow;

public class PacketBundlePacker extends MessageToMessageDecoder<Packet<?>> {
   @Nullable
   private BundlerInfo.Bundler currentBundler;
   @Nullable
   private BundlerInfo infoForCurrentBundler;
   private final PacketFlow flow;

   public PacketBundlePacker(PacketFlow pFlow) {
      this.flow = pFlow;
   }

   protected void decode(ChannelHandlerContext pContext, Packet<?> pPacket, List<Object> p_265368_) throws Exception {
      BundlerInfo.Provider bundlerinfo$provider = pContext.channel().attr(BundlerInfo.BUNDLER_PROVIDER).get();
      if (bundlerinfo$provider == null) {
         throw new DecoderException("Bundler not configured: " + pPacket);
      } else {
         BundlerInfo bundlerinfo = bundlerinfo$provider.getBundlerInfo(this.flow);
         if (this.currentBundler != null) {
            if (this.infoForCurrentBundler != bundlerinfo) {
               throw new DecoderException("Bundler handler changed during bundling");
            }

            Packet<?> packet = this.currentBundler.addPacket(pPacket);
            if (packet != null) {
               this.infoForCurrentBundler = null;
               this.currentBundler = null;
               p_265368_.add(packet);
            }
         } else {
            BundlerInfo.Bundler bundlerinfo$bundler = bundlerinfo.startPacketBundling(pPacket);
            if (bundlerinfo$bundler != null) {
               this.currentBundler = bundlerinfo$bundler;
               this.infoForCurrentBundler = bundlerinfo;
            } else {
               p_265368_.add(pPacket);
            }
         }

      }
   }
}