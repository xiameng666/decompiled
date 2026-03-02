import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.smartdevice.AppContextProvider;

public class ercg extends xnj implements eixj, ejbp {
    public boolean h;
    private ejaj i;
    private volatile eizl j;
    private final Object k;

    public ercg() {
        this.k = new Object();
        this.h = false;
        this.gz(new ercf(this));
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.l();
    }

    @Override  // xnz
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.l().h();
    }

    @Override  // eixj
    public final Application iP() {
        if(hrui.c()) {
            return eixi.a(this.getBaseContext().getApplicationContext());
        }
        return AppContextProvider.c == null ? null : AppContextProvider.c.b;
    }

    public final eizl l() {
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
        ejaj ejaj0 = this.l().b();
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

