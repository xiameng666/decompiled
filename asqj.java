import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.backup.settings.AppContextProvider;

public class asqj extends xos implements eixj, ejbp {
    private ejaj j;
    private volatile eizj k;
    public boolean l;
    private final Object m;

    public asqj() {
        this.m = new Object();
        this.l = false;
        this.addOnContextAvailableListener(new asqi(this));
    }

    public final eizj a() {
        if(this.k == null) {
            Object object0 = this.m;
            synchronized(object0) {
                if(this.k == null) {
                    this.k = new eizj(this);
                }
            }
            return this.k;
        }
        return this.k;
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
    protected void onCreate(Bundle bundle0) {
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

