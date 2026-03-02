import android.view.View;

public final class ekmv extends kdl {
    final String a;

    public ekmv(String s) {
        this.a = s;
        super();
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        super.c(view0, khb0);
        String s = this.a;
        if(!bbqr.d(s)) {
            khb0.n(new kgx(kgx.e.a(), s));
        }
    }
}

