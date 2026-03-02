import com.google.android.gms.crisisalerts.settings.debug.CrisisAlertsGoogleInternalSettingChimeraActivity;
import java.util.Comparator;

public final class bgvn implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        if(((gxog)object0) != null) {
            if(((gxog)object1) == null) {
                return 0;
            }
            hguc hguc0 = ((gxog)object0).c;
            if(hguc0 == null) {
                hguc0 = hguc.a;
            }
            hgtu hgtu0 = hguc0.c == null ? hgtu.a : hguc0.c;
            hguc hguc1 = ((gxog)object1).c;
            if(hguc1 == null) {
                hguc1 = hguc.a;
            }
            return CrisisAlertsGoogleInternalSettingChimeraActivity.a(hgtu0, (hguc1.c == null ? hgtu.a : hguc1.c));
        }
        return 0;
    }
}

