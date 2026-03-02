import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.preference.PreferenceCategory;
import com.android.settingslib.widget.AppPreference;
import com.android.settingslib.widget.ZeroStatePreference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class eknf implements ibts {
    public final PreferenceCategory a;
    public final ZeroStatePreference b;
    public final Activity c;

    public eknf(PreferenceCategory preferenceCategory0, ZeroStatePreference zeroStatePreference0, Activity activity0) {
        this.a = preferenceCategory0;
        this.b = zeroStatePreference0;
        this.c = activity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ApplicationInfo applicationInfo0;
        Activity activity0;
        PreferenceCategory preferenceCategory0 = this.a;
        preferenceCategory0.ah();
        ZeroStatePreference zeroStatePreference0 = this.b;
        if(zeroStatePreference0 != null) {
            zeroStatePreference0.T(((List)object0).isEmpty());
        }
        ibuq.c(((List)object0));
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = ((List)object0).iterator();
        while(true) {
            activity0 = this.c;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            String s = (String)object1;
            try {
                applicationInfo0 = null;
                applicationInfo0 = activity0.getPackageManager().getApplicationInfo(s, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(applicationInfo0 != null) {
                arrayList0.add(applicationInfo0);
            }
        }
        for(Object object2: arrayList0) {
            AppPreference appPreference0 = new AppPreference(activity0);
            appPreference0.L(((ApplicationInfo)object2).packageName);
            appPreference0.S(activity0.getPackageManager().getApplicationLabel(((ApplicationInfo)object2)));
            appPreference0.J(((ApplicationInfo)object2).loadIcon(activity0.getPackageManager()));
            appPreference0.N(false);
            preferenceCategory0.am(appPreference0);
        }
        return ibom.a;
    }
}

