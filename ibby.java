import j..util.Objects;
import java.io.OutputStream;

final class ibby extends OutputStream {
    final ibca a;

    public ibby(ibca ibca0) {
        Objects.requireNonNull(ibca0);
        this.a = ibca0;
        super();
    }

    @Override
    public final void write(int v) {
        this.write(new byte[]{((byte)v)}, 0, 1);
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        this.a.d(arr_b, v, v1);
    }
}

