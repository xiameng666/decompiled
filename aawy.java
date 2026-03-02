import android.view.View;

public final class aawy extends kdl {
    final String a;

    public aawy(String s) {
        this.a = s;
        super();
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        ibuq.f(view0, "host");
        super.c(view0, khb0);
        String s = this.a;
        if(s != null && !ibzk.D(s)) {
            khb0.n(new kgx(kgx.e.a(), s));
        }
    }
}

