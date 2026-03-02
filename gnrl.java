import java.io.InputStream;
import java.io.OutputStream;

abstract class gnrl implements gmno {
    @Override  // gmno
    public final InputStream a(InputStream inputStream0, byte[] arr_b) {
        return new gnrz(this, inputStream0, arr_b);
    }

    @Override  // gmno
    public final OutputStream b(OutputStream outputStream0, byte[] arr_b) {
        return new gnsa(this, outputStream0, arr_b);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract gnrx g();

    public abstract gnry h(byte[] arg1);
}

