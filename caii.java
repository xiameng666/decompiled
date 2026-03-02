import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.intrusiondetection.AppContextProvider;

public abstract class caii extends clvw implements eixj, ejbp {
    private ejaj j;
    public boolean k;
    private volatile eizj l;
    private final Object m;

    public caii() {
        this.m = new Object();
        this.k = false;
        this.addOnContextAvailableListener(new caih(this));
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

