import j..util.Objects;
import java.io.IOException;

final class czum implements gelg {
    final czun a;
    private final String b;
    private final int c;

    public czum(czun czun0, String s, int v) {
        Objects.requireNonNull(czun0);
        this.a = czun0;
        super();
        this.b = s;
        this.c = v;
    }

    @Override  // gelg
    public final void h() {
        Objects.requireNonNull(this.a.c);
        czuk czuk0 = new czuk(this.a.c);
        this.a.j(czuk0);
    }

    @Override  // gelg
    public final void i() {
        czuj czuj0 = new czuj(this);
        this.a.j(czuj0);
    }

    @Override  // gelg
    public final void j(IOException iOException0) {
        czul czul0 = new czul(this, iOException0);
        this.a.j(czul0);
    }

    @Override  // gelg
    public final void k(byte[] arr_b) {
        this.a.n(this.b, this.c, true, arr_b);
    }
}

