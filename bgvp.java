import com.google.android.gms.crisisalerts.settings.debug.CrisisAlertsGoogleInternalSettingChimeraActivity;
import java.util.Comparator;

public final class bgvp implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        if(((gxoi)object0) != null) {
            if(((gxoi)object1) == null) {
                return 0;
            }
            hgtu hgtu0 = ((gxoi)object0).c;
            if(hgtu0 == null) {
                hgtu0 = hgtu.a;
            }
            hgtu hgtu1 = ((gxoi)object1).c;
            if(hgtu1 == null) {
                hgtu1 = hgtu.a;
            }
            return CrisisAlertsGoogleInternalSettingChimeraActivity.a(hgtu0, hgtu1);
        }
        return 0;
    }
}

