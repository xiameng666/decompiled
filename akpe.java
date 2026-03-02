import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.managed.AppContextProvider;

public class akpe extends xnz implements eixj, ejbp {
    private ejaj h;
    private volatile eizl i;
    private final Object j;
    public boolean k;

    public akpe() {
        this.j = new Object();
        this.k = false;
        this.gz(new akpd(this));
    }

    public final eizl b() {
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

    @Override  // ejbp
    public final ejbo g() {
        return this.b();
    }

    @Override  // xnz
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.b().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // xnz
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.b().b();
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
}

