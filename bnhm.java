import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Random;

final class bnhm {
    public WritableByteChannel a;
    private static final bboh b;
    private final Random c;

    static {
        bnhm.b = bnaa.e("WebSocketWriter");
    }

    public bnhm() {
        this.c = new Random();
    }

    final void a(byte[] arr_b) {
        int v1;
        synchronized(this) {
            ((ggtj)bnhm.b.h()).x("send()");
            bmzx.c("HYBRID_WEBSOCKET_WRITER_STARTED", null);
            if(arr_b.length <= 0xFFFF && arr_b.length >= 0x7E) {
                v1 = 8;
            }
            else {
                v1 = arr_b.length <= 0xFFFF ? 6 : 14;
            }
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(v1 + arr_b.length);
            byteBuffer0.put((byte)0x82);
            if(arr_b.length < 0x7E) {
                byteBuffer0.put(((byte)(arr_b.length | 0x80)));
            }
            else if(arr_b.length <= 0xFFFF) {
                byteBuffer0.put(-2);
                byteBuffer0.putShort(((short)arr_b.length));
            }
            else {
                byteBuffer0.put(-1);
                byteBuffer0.putInt(0);
                byteBuffer0.putInt(arr_b.length);
            }
            byte[] arr_b1 = new byte[4];
            this.c.nextBytes(arr_b1);
            byteBuffer0.put(arr_b1);
            for(int v2 = 0; v2 < arr_b.length; ++v2) {
                byteBuffer0.put(((byte)(arr_b[v2] ^ arr_b1[v2 % 4])));
            }
            byteBuffer0.flip();
            this.a.write(byteBuffer0);
        }
    }
}

