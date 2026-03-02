import android.view.View;

public final class zrx extends kdl {
    final aaem a;

    public zrx(aaem aaem0) {
        this.a = aaem0;
        super();
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        ibuq.f(view0, "host");
        super.c(view0, khb0);
        String s = ((zno)this.a).c;
        if(s.length() > 0) {
            khb0.n(new kgx(kgx.e.a(), s));
        }
    }
}

