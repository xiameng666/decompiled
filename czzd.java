import j..util.Objects;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.webrtc.DataChannel.Buffer;
import org.webrtc.DataChannel;

final class czzd extends OutputStream {
    final czze a;

    public czzd(czze czze0) {
        Objects.requireNonNull(czze0);
        this.a = czze0;
        super();
    }

    @Override
    public final void close() {
        this.a.h();
    }

    @Override
    public final void write(int v) {
        this.write(new byte[]{((byte)v)}, 0, 1);
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        if(((long)v1) > hvog.aE()) {
            throw new IOException(String.format("Attempted to write more than %dMB to data channel.", hvog.aE()));
        }
        czze czze0 = this.a;
        long v2 = hvog.aE();
        long v3 = hvol.ar() ? hvog.a.bk().dh() : hvog.a.bk().dd();
        while(!czze0.l() && czze0.h.a() + ((long)v1) > v2) {
            Object object0 = czze0.i;
            synchronized(object0) {
                try {
                    object0.wait(v3);
                }
                catch(InterruptedException unused_ex) {
                    czze0.h();
                    Thread.currentThread().interrupt();
                }
            }
        }
        czze czze1 = this.a;
        if(czze1.l()) {
            throw new IOException("Cannot write: WebRtcSocket output stream is closed.");
        }
        DataChannel dataChannel0 = czze1.h;
        if(dataChannel0 != null) {
            DataChannel.Buffer dataChannel$Buffer0 = new DataChannel.Buffer(ByteBuffer.wrap(arr_b, v, v1), true);
            dataChannel0.c();
            byte[] arr_b1 = new byte[dataChannel$Buffer0.a.remaining()];
            dataChannel$Buffer0.a.get(arr_b1);
            if(dataChannel0.nativeSend(arr_b1, dataChannel$Buffer0.b)) {
                return;
            }
        }
        throw new IOException("Failed to send bytes over data channel.");
    }
}

