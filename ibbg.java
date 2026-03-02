import j..util.Objects;
import java.util.Collections;

final class ibbg extends iaou {
    final ibbh a;

    public ibbg(ibbh ibbh0) {
        Objects.requireNonNull(ibbh0);
        this.a = ibbh0;
        super();
    }

    @Override  // iaou
    public final String a() {
        return this.a.b;
    }

    @Override  // iaou
    public final void c() {
    }

    @Override  // iaou
    public final void d(iaoq iaoq0) {
        iaor iaor0 = new iaor();
        iaor0.a = new iapm(null, Collections.singletonList(new ialw(this.a.a)));
        iaor0.b = iakk.a;
        iaoq0.a(iaor0.a());
    }
}

