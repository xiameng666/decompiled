import android.content.Context;
import j..util.Optional;

public final class fxhq {
    public final Context a;
    public final fxmv b;

    public fxhq(Context context0) {
        this.a = context0;
        this.b = new fxmv(((int)huqb.e()), new fxhp());
    }

    final void a(hguc hguc0, int v) {
        hgtu hgtu0 = hguc0.c == null ? hgtu.a : hguc0.c;
        this.b((hguc0.c == null ? hgtu.a : hguc0.c).c, hfyn.b((hgtu0.d == null ? hfwn.a : hgtu0.d)), v, Optional.empty());
    }

    final void b(String s, long v, int v1, Optional optional0) {
        fxnb.c(s, v, fxhn.d(v1), (optional0.isPresent() ? optional0.map(new fxho()) : Optional.empty()));
        fxmv.a(v);
        Object[] arr_object = {s, fxmv.a(v), v1};
        this.b.f(4, "%s:%s %d", arr_object);
    }
}

