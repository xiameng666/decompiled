import android.app.ActivityManager.OnUidImportanceListener;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Iterator;

public final class atok implements ActivityManager.OnUidImportanceListener {
    public final ator a;
    public final ichm b;

    public atok(ator ator0, ichm ichm0) {
        this.a = ator0;
        this.b = ichm0;
    }

    public final void onUidImportance(int v, int v1) {
        String[] arr_s = null;
        try {
            arr_s = this.a.c.getPackagesForUid(v);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            ((ggtj)((ggtj)ator.a.j()).s(packageManager$NameNotFoundException0)).z("Could not get package name for UID: %d", v);
        }
        catch(SecurityException securityException0) {
            ((ggtj)((ggtj)ator.a.j()).s(securityException0)).z("Could not get package name for UID: %d", v);
        }
        if(arr_s != null) {
            Iterator iterator0 = ibug.a(arr_s);
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                if(v1 == 100 && ator.l(s)) {
                    ((ggtj)ator.a.h()).B("Target Banking App in foreground: %s", s);
                    ibuq.c(s);
                    this.b.b(s);
                    return;
                }
            }
        }
    }
}

