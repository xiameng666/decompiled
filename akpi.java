import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.managed.AppContextProvider;

public class akpi extends bagc implements eixj, ejbp {
    private ejaj h;
    public boolean i;
    private volatile eizl j;
    private final Object k;

    public akpi() {
        this.k = new Object();
        this.i = false;
        this.gz(new akph(this));
    }

    public final eizl c() {
        if(this.j == null) {
            Object object0 = this.k;
            synchronized(object0) {
                if(this.j == null) {
                    this.j = new eizl(this);
                }
            }
            return this.j;
        }
        return this.j;
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.c();
    }

    @Override  // xnz
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.c().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // bagc
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.c().b();
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

