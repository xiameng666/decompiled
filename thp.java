import java.io.ByteArrayInputStream;

public class thp {
    public final thz b;
    public final tib c;
    public final byte[] d;

    public thp(tib tib0, byte[] arr_b, thz thz0) {
        this.c = tib0;
        this.d = (byte[])arr_b.clone();
        this.b = thz0;
    }

    public static int c(ByteArrayInputStream byteArrayInputStream0) {
        if(byteArrayInputStream0.available() <= 0) {
            throw new IllegalArgumentException("No data to parse length");
        }
        int v = byteArrayInputStream0.read();
        if(v == 0xFF) {
            if(byteArrayInputStream0.available() >= 2) {
                return new tjp(new byte[]{((byte)byteArrayInputStream0.read()), ((byte)byteArrayInputStream0.read())}).a();
            }
            throw new IllegalArgumentException("No data to parse 3 byte length");
        }
        return v;
    }

    public byte[] d() {
        throw null;
    }

    public byte[] e() {
        return this.d;
    }
}

