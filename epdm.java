import android.app.Application;
import com.google.android.gms.chimera.modules.setupservices.AppContextProvider;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;

public abstract class epdm extends eozn implements eixj {
    private boolean j;

    public epdm() {
        this.j = false;
        this.gz(new epdl(this));
    }

    @Override  // epdi
    protected final void F() {
        if(!this.j) {
            this.j = true;
            ((epdc)this.h()).f(((GoogleServicesChimeraActivity)this));
        }
    }

    @Override  // eixj, epdi
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }
}

