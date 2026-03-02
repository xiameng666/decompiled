import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.credential.manager.AppContextProvider;

public class bgjo extends bgju implements eixj, ejbp {
    public boolean j;
    private ejaj k;
    private volatile eizj l;
    private final Object m;

    public bgjo() {
        this.m = new Object();
        this.j = false;
        this.addOnContextAvailableListener(new bgjn(this));
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

    @Override  // xoi
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.a().b();
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

