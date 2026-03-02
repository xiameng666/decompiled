import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import java.util.Iterator;

public final class any implements ibth {
    public final aob a;

    public any(aob aob0) {
        this.a = aob0;
    }

    @Override  // ibth
    public final Object a() {
        PackageInfo packageInfo0;
        try {
            packageInfo0 = this.a.a.getPackageManager().getPackageInfo("com.google.android.gms", 0x84);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return Boolean.valueOf(ibuq.m(null, Boolean.valueOf(false)));
        }
        if(packageInfo0.services == null) {
            return Boolean.valueOf(ibuq.m(Boolean.valueOf(false), Boolean.valueOf(false)));
        }
        Iterator iterator0 = ibug.a(packageInfo0.services);
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ServiceInfo serviceInfo0 = (ServiceInfo)object0;
            if(serviceInfo0.metaData != null && serviceInfo0.metaData.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                return Boolean.valueOf(ibuq.m(Boolean.valueOf(true), Boolean.valueOf(false)));
            }
        }
        return Boolean.valueOf(ibuq.m(Boolean.valueOf(false), Boolean.valueOf(false)));
    }
}

