import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.multidevice.sync.AppContextProvider;

public class ctir extends xnb implements eixj, ejbp {
    public boolean e;
    private ejaj f;
    private volatile eizj g;
    private final Object h;

    public ctir() {
        this.h = new Object();
        this.e = false;
        this.b();
    }

    ctir(int v) {
        super(v);
        this.h = new Object();
        this.e = false;
        this.b();
    }

    public final eizj a() {
        if(this.g == null) {
            Object object0 = this.h;
            synchronized(object0) {
                if(this.g == null) {
                    this.g = new eizj(this);
                }
            }
            return this.g;
        }
        return this.g;
    }

    private final void b() {
        this.addOnContextAvailableListener(new ctiq(this));
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

    @Override  // xnb
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.a().b();
        this.f = ejaj0;
        if(ejaj0.c()) {
            this.f.b(this.getDefaultViewModelCreationExtras());
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    protected final void onDestroy() {
        super.onDestroy();
        ejaj ejaj0 = this.f;
        if(ejaj0 != null) {
            ejaj0.a();
        }
    }
}

