import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import java.util.List;

public final class fvvv extends tk {
    private final List a;
    private final EAlertUxArgs e;
    private final fvvz f;

    public fvvv(EAlertUxArgs eAlertUxArgs0, List list0, fvvz fvvz0) {
        batl.b(list0 != null && !list0.isEmpty());
        this.e = eAlertUxArgs0;
        this.a = list0;
        this.f = fvvz0;
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final int dx(int v) {
        return fxmo.values()[v].ordinal();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        switch(((fxmo)this.a.get(v)).ordinal()) {
            case 0: {
                return new uq(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0300, viewGroup0, false));  // layout:ealert_be_alert_card_sdk21
            }
            case 1: {
                return new uq(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0311, viewGroup0, false));  // layout:ealert_stay_safer_daynight
            }
            case 2: {
                EAlertUxArgs eAlertUxArgs0 = this.e;
                return eAlertUxArgs0 != null ? new fvwn(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0307, viewGroup0, false), eAlertUxArgs0) : null;  // layout:ealert_local_map_card
            }
            case 4: {
                return new uq(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E030C, viewGroup0, false));  // layout:ealert_safety_tips_daynight
            }
            case 5: {
                return new fvvu(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02FF, viewGroup0, false), this.e);  // layout:ealert_about
            }
            case 6: {
                return new fvwa(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0312, viewGroup0, false), this.f, this.e);  // layout:ealert_survey
            }
            default: {
                return null;
            }
        }
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
    }
}

