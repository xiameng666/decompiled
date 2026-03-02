import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fdug extends fdpj {
    public final felo q;
    public final AtomicBoolean r;

    public fdug(Context context0, fdsh fdsh0, fdyy fdyy0, fdyq fdyq0, fdvl fdvl0, fdxu fdxu0, bsoj bsoj0, felo felo0) {
        super(context0, fdsh0, fdyy0, fdyq0, fdvl0, fdxu0, true, bsoj0);
        this.r = new AtomicBoolean(false);
        this.q = felo0;
        if(felo0.c.contains(this)) {
            felo.j("addRestrictedConnectionListenerAndNotifyExisting(): Not adding listener since it is already present.", new Object[0]);
        }
        else {
            felo0.c.add(this);
            for(Object object0: felo0.b.keySet()) {
                ffaz ffaz0 = (ffaz)felo0.b.get(((String)object0));
                this.K();
            }
        }
        super.i();
    }

    @Override  // fdpj
    protected final boolean C() {
        return ffem.a().getBoolean("local_cloudsync_enabled", true);
    }

    @Override  // fdpj
    public final boolean F() {
        return super.F() && !this.r.get();
    }

    public final void K() {
        if(hzys.c()) {
            boolean z = this.F();
            this.r.set(true);
            if(z) {
                Log.e("CloudSync", "CloudSync should not be pre-enabled on a watch expected to be on a restricted connection. Turning it off now.");
                this.n(true);
            }
        }
    }

    @Override  // fdpj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("Is a restricted device: " + this.r);
        super.md(bbpd0, z, z1);
    }

    @Override  // fdpj
    public final void z(boolean z) {
        boolean z1 = this.F();
        SharedPreferences.Editor sharedPreferences$Editor0 = ffem.a().edit();
        sharedPreferences$Editor0.putBoolean("local_cloudsync_enabled", z);
        sharedPreferences$Editor0.apply();
        synchronized(this.f) {
            this.d = this.B();
        }
        this.n(z1);
    }
}

