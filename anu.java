import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;

public final class anu implements ibth {
    public final aob a;

    public anu(aob aob0) {
        this.a = aob0;
    }

    @Override  // ibth
    public final Object a() {
        PackageInfo packageInfo0;
        aob aob0 = this.a;
        Context context0 = aob0.a;
        bur bur0 = Build.VERSION.SDK_INT < 35 ? null : new bur(context0);
        try {
            packageInfo0 = context0.getPackageManager().getPackageInfo("com.google.android.gms", 0x84);
            if(packageInfo0.services != null) {
                goto label_5;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return buu.a(aob0.b, null, bur0);
    label_5:
        ServiceInfo[] arr_serviceInfo = packageInfo0.services;
        String s = null;
        for(int v = 0; v < arr_serviceInfo.length; ++v) {
            ServiceInfo serviceInfo0 = arr_serviceInfo[v];
            if(serviceInfo0.metaData != null) {
                String s1 = serviceInfo0.metaData.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY");
                if(s1 != null) {
                    if(s != null) {
                        throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                    }
                    s = s1;
                    continue;
                }
            }
        }
        if(s != null) {
            try {
                bur bur1 = (bur)Class.forName(s).getConstructor(Context.class).newInstance(context0);
                return buu.a(aob0.b, bur1, bur0);
            }
            catch(Exception exception0) {
                throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", exception0);
            }
        }
        return buu.a(aob0.b, null, bur0);
    }
}

