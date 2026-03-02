import com.google.android.gms.accountsettings.widget.WelcomeHeaderCollapsingView;

public final class aaww implements ibth {
    public final WelcomeHeaderCollapsingView a;

    public aaww(WelcomeHeaderCollapsingView welcomeHeaderCollapsingView0) {
        this.a = welcomeHeaderCollapsingView0;
    }

    @Override  // ibth
    public final Object a() {
        WelcomeHeaderCollapsingView welcomeHeaderCollapsingView0 = this.a;
        aabl aabl0 = welcomeHeaderCollapsingView0.a;
        if(aabl0 == null) {
            ibuq.j("accountParticleDiscUtilsFactory");
            aabl0 = null;
        }
        return aabl0.a(welcomeHeaderCollapsingView0.e, true);
    }
}

