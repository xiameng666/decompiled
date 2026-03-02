import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment.SavedState;

public final class lmb implements ibts {
    public final fm a;
    public final lmg b;
    public final Context c;
    public final Class d;
    public final gui e;
    public final lmi f;
    public final Bundle g;
    public final int h;

    public lmb(fm fm0, lmg lmg0, Context context0, Class class0, gui gui0, lmi lmi0, Bundle bundle0, int v) {
        this.a = fm0;
        this.b = lmg0;
        this.c = context0;
        this.d = class0;
        this.e = gui0;
        this.f = lmi0;
        this.g = bundle0;
        this.h = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gqb gqb0 = (gqb)object0;
        ibuz ibuz0 = new ibuz();
        lmg lmg0 = this.b;
        int v = lmg0.b().getId();
        fm fm0 = this.a;
        du du0 = fm0.g(v);
        lmi lmi0 = this.f;
        if(du0 == null) {
            this.c.getClassLoader();
            du du1 = fm0.l().b(this.d.getName());
            du1.setInitialSavedState(((Fragment.SavedState)lmi0.a.a()));
            du1.setArguments(this.g);
            ca ca0 = new ca(fm0);
            ca0.C();
            ca0.E(lmg0.b(), du1, String.valueOf(this.h));
            if(fm0.au()) {
                ibuz0.a = true;
                du1.getLifecycle().c(new lmd(ibuz0, du1));
                ca0.g();
            }
            else {
                ca0.f();
            }
            du0 = du1;
        }
        fm0.S(lmg0.b());
        ibts ibts0 = (ibts)this.e.a();
        ibuq.d(du0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment");
        ibts0.a(du0);
        return new lme(fm0, du0, lmi0, ibuz0);
    }
}

