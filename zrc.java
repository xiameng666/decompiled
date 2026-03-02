import android.view.View;

public final class zrc extends kdl {
    final znm a;

    public zrc(znm znm0) {
        this.a = znm0;
        super();
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        ibuq.f(view0, "host");
        super.c(view0, khb0);
        String s = this.a.a.m;
        ibuq.e(s, "getExpandCardAccessibilityTapText(...)");
        if(!this.a.c && s.length() > 0) {
            khb0.n(new kgx(kgx.e.a(), s));
        }
    }
}

