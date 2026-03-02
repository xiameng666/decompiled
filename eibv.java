import android.os.Bundle;
import androidx.preference.TwoStatePreference;

public final class eibv {
    public final ohv a;
    public final TwoStatePreference b;
    public final eibu c;
    public final alm d;
    public cjbx e;
    public Boolean f;
    public final int g;
    private final eibt h;
    private final eibs i;
    private final String j;

    public eibv(ohv ohv0, TwoStatePreference twoStatePreference0, alm alm0, eibu eibu0) {
        this.h = new eibt(this);
        this.i = new eibs(this);
        this.a = ohv0;
        this.b = twoStatePreference0;
        this.c = eibu0;
        this.d = alm0;
        this.g = 1;
        this.j = "SwitchLockscreenGuard__" + twoStatePreference0.s + "__pending_value";
    }

    public final void a(Bundle bundle0) {
        if(bundle0 != null) {
            String s = this.j;
            if(bundle0.containsKey(s)) {
                this.c(bundle0.getBoolean(s));
                return;
            }
        }
        this.d();
    }

    public final void b(Bundle bundle0) {
        Boolean boolean0 = this.f;
        if(boolean0 != null) {
            bundle0.putBoolean(this.j, boolean0.booleanValue());
        }
    }

    public final void c(boolean z) {
        this.f = Boolean.valueOf(z);
        this.b.H(false);
        this.b.n = null;
        if(this.e != null) {
            return;
        }
        this.e = cjbx.b(this.a, this.i);
    }

    public final void d() {
        this.f = null;
        this.e = null;
        this.b.H(true);
        this.b.n = this.h;
    }
}

