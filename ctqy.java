import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.multidevice.sync.AppContextProvider;

public class ctqy extends xnb implements eixj, ejbp {
    private ejaj e;
    private volatile eizj f;
    private final Object g;
    public boolean n;

    public ctqy() {
        this.g = new Object();
        this.n = false;
        this.a();
    }

    ctqy(int v) {
        super(v);
        this.g = new Object();
        this.n = false;
        this.a();
    }

    private final void a() {
        this.addOnContextAvailableListener(new ctqx(this));
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.r();
    }

    @Override  // xnb
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.r().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // xnb
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.r().b();
        this.e = ejaj0;
        if(ejaj0.c()) {
            this.e.b(this.getDefaultViewModelCreationExtras());
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    protected final void onDestroy() {
        super.onDestroy();
        ejaj ejaj0 = this.e;
        if(ejaj0 != null) {
            ejaj0.a();
        }
    }

    public final eizj r() {
        if(this.f == null) {
            Object object0 = this.g;
            synchronized(object0) {
                if(this.f == null) {
                    this.f = new eizj(this);
                }
            }
            return this.f;
        }
        return this.f;
    }
}

