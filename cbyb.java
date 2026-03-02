import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;

public final class cbyb implements gftc {
    @Override  // gftc
    public final boolean a(Object object0) {
        if(!TextUtils.equals(((gqhv)object0).c, huln.d())) {
            String s = ((gqhv)object0).c;
            PackageManager packageManager0 = AppContextProvider.a().getPackageManager();
            try {
                packageManager0.getPackageInfo(s, 0);
                return false;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                return true;
            }
        }
        return false;
    }
}

