import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.instantapps.ui.OptInChimeraActivity;
import j..util.Objects;

final class cabj implements View.OnClickListener {
    final cabp a;

    public cabj(cabp cabp0) {
        Objects.requireNonNull(cabp0);
        this.a = cabp0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        cabp cabp0 = this.a;
        cabp.y(cabp0);
        OptInChimeraActivity optInChimeraActivity0 = cabp0.d;
        int v = optInChimeraActivity0.k.getPaddingBottom();
        int v1 = optInChimeraActivity0.j.getMeasuredHeight();
        int v2 = optInChimeraActivity0.k.getMeasuredHeight() - v1;
        if(optInChimeraActivity0.j.getScrollY() < v2 - v) {
            optInChimeraActivity0.j.smoothScrollBy(0, v1);
            return;
        }
        cabp0.ah.l("OptInFragment.optIn");
        String s = cabp0.a;
        bzwe bzwe0 = cabp0.b.a;
        aztw aztw0 = cabp0.b.D;
        batl.b(((boolean)(TextUtils.isEmpty(s) ^ 1)));
        bzvz bzvz0 = new bzvz(bzwe0, aztw0, s);
        aztw0.c(bzvz0);
        evql evql0 = batf.c(bzvz0);
        evql0.b(new cabo(cabp0));
        evql0.A(new cabn(cabp0));
    }
}

