import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.managed.AppContextProvider;

public class akpk extends bagc implements eixj, ejbp {
    private ejaj h;
    private volatile eizl i;
    private final Object j;
    public boolean q;

    public akpk() {
        this.j = new Object();
        this.q = false;
        this.gz(new akpj(this));
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.w();
    }

    @Override  // ejbo
    public final Object h() {
        return this.w().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // bagc
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.w().b();
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

    public final eizl w() {
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

