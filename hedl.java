import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class hedl {
    public static List a(byte[] arr_b) {
        ArrayList arrayList0 = new ArrayList();
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        try {
            while(true) {
                if(!byteBuffer0.hasRemaining()) {
                    return gged_interceptors.i(arrayList0);
                }
                int v = byteBuffer0.getInt();
                byte[] arr_b1 = new byte[v];
                byteBuffer0.get(arr_b1, 0, v);
                Object object0 = null;
                if(v >= 36) {
                    ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b1);
                    long v1 = byteBuffer1.getLong();
                    int v2 = byteBuffer1.getInt();
                    int v3 = byteBuffer1.getInt();
                    float f = byteBuffer1.getFloat();
                    float f1 = byteBuffer1.getFloat();
                    float f2 = byteBuffer1.getFloat();
                    float f3 = byteBuffer1.getFloat();
                    String s = null;
                    if(byteBuffer1.get() > 0) {
                        byte[] arr_b2 = new byte[v - 37];
                        byteBuffer1.get(arr_b2, 0, v - 37);
                        try {
                            s = new String(arr_b2, "US-ASCII");
                        }
                        catch(UnsupportedEncodingException unused_ex) {
                        }
                    }
                    object0 = new cjgh(v1, v2, v3, f, f1, f2, f3, s, byteBuffer1.getInt());
                }
                if(object0 != null) {
                    arrayList0.add(object0);
                }
            }
        }
        catch(BufferUnderflowException unused_ex) {
            return ggna.a;
        }
    }
}

