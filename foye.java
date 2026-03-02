import j..util.Objects;
import java.util.concurrent.TimeUnit;

final class foye implements foqo {
    final gmch a;
    final foyg b;

    public foye(foyg foyg0, gmch gmch0) {
        this.a = gmch0;
        Objects.requireNonNull(foyg0);
        this.b = foyg0;
        super();
    }

    @Override  // foqo
    public final void g(fokg fokg0) {
        this.b.d.a(3, fokg0.a);
        this.b.a();
        foyc foyc0 = new foyc(this, fokg0);
        this.b.f = this.a.g(foyc0, 10L, TimeUnit.SECONDS);
    }

    @Override  // foqo
    public final void j(fokg fokg0) {
        this.b.d.a(4, fokg0.a);
        this.b.a();
        foyd foyd0 = new foyd(this, fokg0);
        this.b.e = this.a.g(foyd0, 10L, TimeUnit.SECONDS);
    }
}

