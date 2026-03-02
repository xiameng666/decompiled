import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.managed.AppContextProvider;

public class akpm extends xnj implements eixj, ejbp {
    public boolean h;
    private ejaj i;
    private volatile eizl j;
    private final Object k;

    public akpm() {
        this.k = new Object();
        this.h = false;
        this.gz(new akpl(this));
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.k();
    }

    @Override  // xnz
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.k().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    public final eizl k() {
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

    @Override  // xnj
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.k().b();
        this.i = ejaj0;
        if(ejaj0.c()) {
            this.i.b(ltv.a);
        }
    }

    @Override  // xnj
    public void onDestroy() {
        super.onDestroy();
        ejaj ejaj0 = this.i;
        if(ejaj0 != null) {
            ejaj0.a();
        }
    }
}

