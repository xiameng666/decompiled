import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.crisisalerts.AppContextProvider;

public abstract class bgvf extends bbry implements eixj, ejbp {
    private ejaj j;
    private volatile eizj k;
    private final Object l;
    public boolean o;

    public bgvf() {
        this.l = new Object();
        this.o = false;
        this.addOnContextAvailableListener(new bgve(this));
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.p();
    }

    @Override  // xnb
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.p().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // bbry
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.p().b();
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

    public final eizj p() {
        if(this.k == null) {
            Object object0 = this.l;
            synchronized(object0) {
                if(this.k == null) {
                    this.k = new eizj(this);
                }
            }
            return this.k;
        }
        return this.k;
    }
}

