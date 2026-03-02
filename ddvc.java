import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.nearby.AppContextProvider;

public class ddvc extends xnb implements eixj, ejbp {
    private ejaj e;
    public boolean f;
    private volatile eizj g;
    private final Object h;

    public ddvc() {
        this.h = new Object();
        this.f = false;
        this.b();
    }

    ddvc(int v) {
        super(v);
        this.h = new Object();
        this.f = false;
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
        this.addOnContextAvailableListener(new ddvb(this));
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
}

