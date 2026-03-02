import android.view.View;
import j..util.Objects;

final class foct extends fnjf {
    final View a;
    final int b;
    final focu c;

    public foct(focu focu0, View view0, int v) {
        this.a = view0;
        this.b = v;
        Objects.requireNonNull(focu0);
        this.c = focu0;
        super();
    }

    @Override  // fnjf
    public final void b(Object object0) {
        focs focs0 = new focs(this, this.a, this.b, object0);
        this.a.post(focs0);
    }
}

