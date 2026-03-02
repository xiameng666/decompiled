import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class feru {
    public static void a(OutputStream outputStream0, byte[] arr_b) {
        byte[] arr_b1 = new byte[arr_b.length + 4];
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b1);
        byteBuffer0.putShort(((short)(arr_b.length + 4)));
        byteBuffer0.putShort(0);
        byteBuffer0.put(arr_b);
        outputStream0.write(arr_b1);
        if(Log.isLoggable("WearIoStream", 2)) {
            ffmn.e("WearIoStream", "write: %s", new Object[]{ghjc.f.o(arr_b1)});
        }
    }

    public static void b(InputStream inputStream0, byte[] arr_b, int v) {
        int v1 = 0;
        while(v1 < v) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 <= 0) {
                throw new IOException("Input stream interrupted while reading");
            }
            v1 += v2;
            continue;
        }
    }
}

