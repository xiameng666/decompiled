import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class sxn implements Serializable {
    private byte[] a;

    static {
        twz.c(sxo.a.b, false);
    }

    public sxn() {
    }

    public sxn(byte[] arr_b) {
        this.a = arr_b;
    }

    public sxn(byte[] arr_b, byte[] arr_b1) {
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
        return twz.c(this.a, false);
    }
}

