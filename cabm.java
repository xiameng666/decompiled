import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class cabm implements View.OnClickListener {
    final boolean a;
    final cabp b;

    public cabm(cabp cabp0, boolean z) {
        this.a = z;
        Objects.requireNonNull(cabp0);
        this.b = cabp0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        cabp cabp0 = this.b;
        cabp.y(cabp0);
        String s = cabp0.a;
        bzwe bzwe0 = cabp0.b.a;
        aztw aztw0 = cabp0.b.D;
        batl.s(aztw0);
        bzvw bzvw0 = new bzvw(bzwe0, aztw0, s);
        aztw0.c(bzvw0);
        evql evql0 = batf.c(bzvw0);
        evql0.b(new cabl(this));
        evql0.A(new cabk(this));
        if(this.a) {
            cabp0.ah.l("OptInFragment.noThanks");
            return;
        }
        cabp0.ah.l("OptInFragment.notNow");
    }
}

