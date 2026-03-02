import android.app.Application;
import com.google.android.gms.chimera.modules.setupservices.AppContextProvider;
import com.google.android.gms.setupservices.CoverSheetWelcomeChimeraActivity;

public abstract class epdk extends eozn implements eixj {
    private boolean j;

    public epdk() {
        this.j = false;
        this.gz(new epdj(this));
    }

    @Override  // epdi
    protected final void F() {
        if(!this.j) {
            this.j = true;
            ((eozq)this.h()).e(((CoverSheetWelcomeChimeraActivity)this));
        }
    }

    @Override  // eixj, epdi
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }
}

