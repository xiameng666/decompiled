import android.content.pm.PackageManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService;

public final class eqdo implements cjuo {
    public final TargetDeviceChimeraService a;

    public eqdo(TargetDeviceChimeraService targetDeviceChimeraService0) {
        this.a = targetDeviceChimeraService0;
    }

    @Override  // cjuo
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        String s = getServiceRequest0.f;
        TargetDeviceChimeraService targetDeviceChimeraService0 = this.a;
        PackageManager packageManager0 = targetDeviceChimeraService0.getPackageManager();
        targetDeviceChimeraService0.getPackageManager();
        hyim.m();
        new barf(s).a();
        Feature[] arr_feature = getServiceRequest0.k;
        if(arr_feature != null && arr_feature.length != 0) {
            if(arr_feature[0].equals(epvj.a)) {
                if(targetDeviceChimeraService0.c == null) {
                    targetDeviceChimeraService0.c = new eqvt(targetDeviceChimeraService0.d, targetDeviceChimeraService0, erpq.b(s, targetDeviceChimeraService0), s, getServiceRequest0.p);
                }
                cjtn0.c(targetDeviceChimeraService0.c);
            }
            return;
        }
        if(targetDeviceChimeraService0.b == null) {
            targetDeviceChimeraService0.b = new eqfd(targetDeviceChimeraService0.d, targetDeviceChimeraService0, targetDeviceChimeraService0.a, erpq.b(s, targetDeviceChimeraService0), erpq.c(s, packageManager0), s, getServiceRequest0.p);
        }
        cjtn0.c(targetDeviceChimeraService0.b);
    }
}

