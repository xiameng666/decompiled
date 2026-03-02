import android.content.SharedPreferences.Editor;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;

public final class crxx extends bbln {
    public crxx() {
        super(9);
    }

    @Override
    public final void run() {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = new bakc(AppContextProvider.a(), "mdp-svc-data", true, null).edit();
            sharedPreferences$Editor0.putBoolean("retry-active", false);
            sharedPreferences$Editor0.putInt("retry-count", -1);
            sharedPreferences$Editor0.apply();
        }
        catch(bakb bakb0) {
            a.ae(ChimeraPeriodicUpdaterService.a.j(), "SharedPreferences failed to reset retry status.", bakb0);
        }
    }
}

