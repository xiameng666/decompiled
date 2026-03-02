import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class thu extends thp implements tgk {
    public tfd e;

    public thu(tib tib0, byte[] arr_b, thz thz0) {
        super(tib0, arr_b, thz0);
        this.e = null;
        this.e = tfc.c(arr_b);
    }

    @Override  // tgk
    public final boolean a(byte[] arr_b) {
        return tgm.b(this.e, arr_b);
    }

    @Override  // tgk
    public final byte[] b(byte[] arr_b) {
        byte[] arr_b1 = tgm.e(this.e, arr_b);
        if(arr_b1 != null) {
            return arr_b1;
        }
        throw new IllegalArgumentException("No such tag " + tjs.b(arr_b));
    }

    @Override  // thp
    public final byte[] d() {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(new byte[]{this.c.a, this.c.b});
            byte[] arr_b = this.e.a();
            if(arr_b.length > 0xFFFE) {
                throw new IllegalArgumentException("size is too big");
            }
            byteArrayOutputStream0.write((arr_b.length <= 0xFE ? new byte[]{((byte)arr_b.length)} : new byte[]{-1, ((byte)(arr_b.length >> 8)), ((byte)arr_b.length)}));
            byteArrayOutputStream0.write(arr_b);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    @Override  // thp
    public final byte[] e() {
        return this.e.a();
    }

    public final boolean f(tfg tfg0) {
        return tgm.a(this.e, tfg0);
    }

    public final byte[] g(tfg tfg0) {
        return tgm.c(this.e, tfg0);
    }

    @Override
    public final String toString() {
        return this.e.toString();
    }
}

