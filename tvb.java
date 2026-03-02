import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class tvb extends tuw implements tts {
    private syc a;

    public tvb(tvi tvi0, byte[] arr_b, tvg tvg0) {
        super(tvi0, arr_b, tvg0);
        this.a = null;
        this.a = syb.c(arr_b);
    }

    @Override  // tts
    public final boolean j(byte[] arr_b) {
        return ttu.b(this.a, arr_b);
    }

    @Override  // tts
    public final byte[] k(byte[] arr_b) {
        byte[] arr_b1 = ttu.e(this.a, arr_b);
        if(arr_b1 != null) {
            return arr_b1;
        }
        throw new IllegalArgumentException("No such tag " + twz.b(arr_b));
    }

    @Override  // tuw
    public final byte[] m() {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(this.c.a());
            byte[] arr_b = this.a.a();
            byteArrayOutputStream0.write(tuw.o(arr_b.length));
            byteArrayOutputStream0.write(arr_b);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    @Override  // tuw
    public final byte[] n() {
        return this.a.a();
    }

    public final boolean p(syf syf0) {
        return ttu.a(this.a, syf0);
    }

    public final byte[] q(syf syf0) {
        return ttu.c(this.a, syf0);
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

