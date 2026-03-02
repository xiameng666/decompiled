import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.crisisalerts.AppContextProvider;

public class bgvh extends xos implements eixj, ejbp {
    private ejaj j;
    public boolean k;
    private volatile eizj l;
    private final Object m;

    public bgvh() {
        this.m = new Object();
        this.k = false;
        this.addOnContextAvailableListener(new bgvg(this));
    }

    public final eizj a() {
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

    @Override  // ejbp
    public final ejbo g() {
        return this.a();
    }

    @Override  // xnb
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.a().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // xos
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.a().b();
        this.j = ejaj0;
        if(ejaj0.c()) {
            this.j.b(this.getDefaultViewModelCreationExtras());
        }
    }

    @Override  // xoi
    protected final void onDestroy() {
        super.onDestroy();
        ejaj ejaj0 = this.j;
        if(ejaj0 != null) {
            ejaj0.a();
        }
    }
}

