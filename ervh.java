import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.spatula.settings.AppContextProvider;

public abstract class ervh extends clvw implements eixj, ejbp {
    public boolean j;
    private ejaj k;
    private volatile eizj l;
    private final Object m;

    public ervh() {
        this.m = new Object();
        this.j = false;
        this.addOnContextAvailableListener(new ervg(this));
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.l();
    }

    @Override  // xnb
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.l().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    public final eizj l() {
        if(this.l == null) {
            Object object0 = this.m;
            synchronized(object0) {
                if(this.l == null) {
                    this.l = new eizj(this);
                }
            }
            return this.l;
        }
        return this.l;
    }

    @Override  // clvw
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.l().b();
        this.k = ejaj0;
        if(ejaj0.c()) {
            this.k.b(this.getDefaultViewModelCreationExtras());
        }
    }

    @Override  // xni
    protected final void onDestroy() {
        super.onDestroy();
        ejaj ejaj0 = this.k;
        if(ejaj0 != null) {
            ejaj0.a();
        }
    }
}

