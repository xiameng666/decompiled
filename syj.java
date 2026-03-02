import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class syj implements Serializable {
    public byte[] a;

    static {
        tek.c(syk.a.b, false);
    }

    public syj() {
    }

    public syj(byte[] arr_b) {
        this.a = arr_b;
    }

    public syj(byte[] arr_b, byte[] arr_b1) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream0.write(arr_b);
            byteArrayOutputStream0.write(arr_b1);
            this.a = byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    public final byte[] a() {
        return this.a == null ? null : ((byte[])this.a.clone());
    }

    @Override
    public final String toString() {
        return tek.c(this.a, false);
    }
}

