import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class tcd extends tca implements tat {
    public szf e;

    public tcd(tcj tcj0, byte[] arr_b, tch tch0) {
        super(tcj0, arr_b, tch0);
        this.e = null;
        this.e = sze.c(arr_b);
    }

    @Override  // tat
    public final boolean a(byte[] arr_b) {
        return tav.b(this.e, arr_b);
    }

    @Override  // tat
    public final byte[] b(byte[] arr_b) {
        byte[] arr_b1 = tav.d(this.e, arr_b);
        if(arr_b1 != null) {
            return arr_b1;
        }
        throw new IllegalArgumentException("No such tag " + tek.b(arr_b));
    }

    @Override  // tca
    public final byte[] d() {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(this.c.a());
            byte[] arr_b = this.e.a();
            byteArrayOutputStream0.write(tca.f(arr_b.length));
            byteArrayOutputStream0.write(arr_b);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    @Override  // tca
    public final byte[] e() {
        return this.e.a();
    }

    @Override  // tca
    public final boolean g(szi szi0) {
        return tav.a(this.e, szi0);
    }

    public final byte[] h(szi szi0) {
        return tav.c(this.e, szi0);
    }

    @Override
    public final String toString() {
        return this.e.toString();
    }
}

