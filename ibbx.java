import j..util.Objects;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

final class ibbx extends OutputStream {
    public final List a;
    final ibca b;
    private ibfv c;

    public ibbx(ibca ibca0) {
        Objects.requireNonNull(ibca0);
        this.b = ibca0;
        super();
        this.a = new ArrayList();
    }

    @Override
    public final void write(int v) {
        if(this.c != null && this.c.b() > 0) {
            this.c.c(((byte)v));
            return;
        }
        this.write(new byte[]{((byte)v)}, 0, 1);
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        if(this.c == null) {
            ibfv ibfv0 = this.b.g.a(Math.max(0x1000, v1));
            this.c = ibfv0;
            this.a.add(ibfv0);
        }
        while(v1 > 0) {
            int v2 = Math.min(v1, this.c.b());
            if(v2 == 0) {
                int v3 = this.c.a();
                ibfv ibfv1 = this.b.g.a(Math.max(v1, v3 + v3));
                this.c = ibfv1;
                this.a.add(ibfv1);
            }
            else {
                this.c.d(arr_b, v, v2);
                v += v2;
                v1 -= v2;
            }
        }
    }
}

