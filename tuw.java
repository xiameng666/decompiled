import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class tuw {
    public final tvg b;
    public final tvi c;
    public final byte[] d;

    public tuw(tvi tvi0, byte[] arr_b, tvg tvg0) {
        this.c = tvi0;
        this.d = (byte[])arr_b.clone();
        this.b = tvg0;
    }

    public static int l(ByteArrayInputStream byteArrayInputStream0) {
        if(byteArrayInputStream0.available() <= 0) {
            throw new IllegalArgumentException("No data to parse length");
        }
        int v = byteArrayInputStream0.read();
        if(v == 0xFF) {
            if(byteArrayInputStream0.available() >= 2) {
                return new tww(new byte[]{((byte)byteArrayInputStream0.read()), ((byte)byteArrayInputStream0.read())}).a();
            }
            throw new IllegalArgumentException("No data to parse 3 byte length");
        }
        return v;
    }

    public byte[] m() {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(this.c.a());
            byteArrayOutputStream0.write(tuw.o(this.d.length));
            byteArrayOutputStream0.write(this.d);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    public byte[] n() {
        return this.d;
    }

    public static byte[] o(int v) {
        if(v <= 0xFFFE) {
            return v <= 0xFE ? new byte[]{((byte)v)} : new byte[]{-1, ((byte)(v >> 8)), ((byte)v)};
        }
        throw new IllegalArgumentException("size is too big");
    }
}

