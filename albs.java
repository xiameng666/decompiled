import android.content.Context;
import android.provider.Settings.Global;
import android.provider.Settings.SettingNotFoundException;

public final class albs {
    public static final baun a;
    public final cdzd b;
    private final Context c;

    static {
        albs.a = new baun("ProximityAuth", new String[]{"GMSExoClearcutLogger"});
    }

    public albs(Context context0, cdzd cdzd0) {
        this.c = context0;
        this.b = cdzd0;
        try {
            if(Settings.Global.getInt(context0.getContentResolver(), "multi_cb") == 1) {
                albs.a.h("CC-LOG-Checkbox optin status=%s", new Object[]{Boolean.valueOf(true)});
                return;
            }
            albs.a.m("CC-LOG-Not opted into usage reporting.", new Object[0]);
        }
        catch(Settings.SettingNotFoundException settings$SettingNotFoundException0) {
            albs.a.n("CC-LOG-Checkbox settings cannot be fetched.", settings$SettingNotFoundException0, new Object[0]);
        }
    }

    public final boolean a() {
        try {
            if(Settings.Global.getInt(this.c.getContentResolver(), "multi_cb") == 1) {
                return true;
            }
        }
        catch(Settings.SettingNotFoundException unused_ex) {
            albs.a.j("CC-LOG-Couldn\'t read go/checkbox.", new Object[0]);
        }
        return false;
    }
}

