import j..util.Objects;
import java.io.IOException;

final class czte implements gema {
    final String a;
    final cztg b;

    public czte(cztg cztg0, String s) {
        this.a = s;
        Objects.requireNonNull(cztg0);
        this.b = cztg0;
        super();
    }

    @Override  // gema
    public final void a(gelz gelz0) {
        cztd cztd0 = new cztd(this, gelz0, this.a);
        this.b.a(cztd0);
    }

    @Override  // gema
    public final void b(IOException iOException0) {
        czke.j(this.a, 4, gymt.c, gymd.bw, iOException0.getMessage());
    }
}

