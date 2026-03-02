import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

public final class aavi implements gful_cronetEngineProvider {
    public final aavk a;

    public aavi(aavk aavk0) {
        this.a = aavk0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Context context0 = this.a.c;
        String[] arr_s = aavk.a;
        int v = 0;
        while(v < 2) {
            String s = arr_s[v];
            try {
                return context0.getPackageManager().getPackageInfo(s, 0).versionName;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                ++v;
            }
        }
        return null;
    }
}

