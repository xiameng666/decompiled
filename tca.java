import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public abstract class tca {
    public final tch b;
    public final tcj c;
    public final byte[] d;

    public tca(tcj tcj0, byte[] arr_b, tch tch0) {
        this.c = tcj0;
        this.d = (byte[])arr_b.clone();
        this.b = tch0;
    }

    public static int c(ByteArrayInputStream byteArrayInputStream0) {
        if(byteArrayInputStream0.available() <= 0) {
            throw new IllegalArgumentException("No data to parse length");
        }
        int v = byteArrayInputStream0.read();
        if(v == 0xFF) {
            if(byteArrayInputStream0.available() >= 2) {
                return new teh(new byte[]{((byte)byteArrayInputStream0.read()), ((byte)byteArrayInputStream0.read())}).a();
            }
            throw new IllegalArgumentException("No data to parse 3 byte length");
        }
        return v;
    }

    public byte[] d() {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(this.c.a());
            byteArrayOutputStream0.write(tca.f(this.d.length));
            byteArrayOutputStream0.write(this.d);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    public byte[] e() {
        return this.d;
    }

    public static byte[] f(int v) {
        if(v <= 0xFFFE) {
            return v <= 0xFE ? new byte[]{((byte)v)} : new byte[]{-1, ((byte)(v >> 8)), ((byte)v)};
        }
        throw new IllegalArgumentException("size is too big");
    }

    public abstract boolean g(szi arg1);
}

