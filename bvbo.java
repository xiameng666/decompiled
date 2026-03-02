import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.googlesettings.AppContextProvider;

public abstract class bvbo extends clvs implements eixj, ejbp {
    private ejaj j;
    private volatile eizj k;
    private final Object l;
    public boolean t;

    public bvbo() {
        this.l = new Object();
        this.t = false;
        this.addOnContextAvailableListener(new bvbn(this));
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.n();
    }

    @Override  // xnb
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.n().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    public final eizj n() {
        if(this.k == null) {
            Object object0 = this.l;
            synchronized(object0) {
                if(this.k == null) {
                    this.k = new eizj(this);
                }
            }
            return this.k;
        }
        return this.k;
    }

    @Override  // eoow
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.n().b();
        this.j = ejaj0;
        if(ejaj0.c()) {
            this.j.b(this.getDefaultViewModelCreationExtras());
        }
    }

    @Override  // xni
    protected final void onDestroy() {
        super.onDestroy();
        ejaj ejaj0 = this.j;
        if(ejaj0 != null) {
            ejaj0.a();
        }
    }
}

