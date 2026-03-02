import android.content.Intent;
import com.google.android.gms.instantapps.ui.OptInChimeraActivity;
import j..util.Objects;

final class cabo implements evqf {
    final cabp a;

    public cabo(cabp cabp0) {
        Objects.requireNonNull(cabp0);
        this.a = cabp0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        OptInChimeraActivity optInChimeraActivity0 = this.a.ag;
        String s = this.a.a;
        optInChimeraActivity0.setResult(-1, new Intent().putExtra("authAccount", s));
        if(bzvh.b(optInChimeraActivity0)) {
            optInChimeraActivity0.a();
            return;
        }
        optInChimeraActivity0.g();
    }
}

