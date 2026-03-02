import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.managed.AppContextProvider;

public class akpg extends bagc implements eixj, ejbp {
    public boolean A;
    private ejaj h;
    private volatile eizl i;
    private final Object j;

    public akpg() {
        this.j = new Object();
        this.A = false;
        this.gz(new akpf(this));
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.z();
    }

    @Override  // xnz
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.z().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // bagc
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.z().b();
        this.h = ejaj0;
        if(ejaj0.c()) {
            this.h.b(ltv.a);
        }
    }

    @Override  // xnz
    protected final void onDestroy() {
        super.onDestroy();
        ejaj ejaj0 = this.h;
        if(ejaj0 != null) {
            ejaj0.a();
        }
    }

    public final eizl z() {
        if(this.i == null) {
            Object object0 = this.j;
            synchronized(object0) {
                if(this.i == null) {
                    this.i = new eizl(this);
                }
            }
            return this.i;
        }
        return this.i;
    }
}

