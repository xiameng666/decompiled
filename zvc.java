import android.view.View;

public final class zvc extends kdl {
    final String a;

    public zvc(String s) {
        this.a = s;
        super();
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        ibuq.f(view0, "host");
        super.c(view0, khb0);
        khb0.n(new kgx(kgx.e.a(), this.a));
    }
}

