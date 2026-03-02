import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.smartdevice.d2d.SourceDeviceChimeraService;

public final class epzy implements cjuo {
    public final SourceDeviceChimeraService a;

    public epzy(SourceDeviceChimeraService sourceDeviceChimeraService0) {
        this.a = sourceDeviceChimeraService0;
    }

    @Override  // cjuo
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        String s = getServiceRequest0.f;
        SourceDeviceChimeraService sourceDeviceChimeraService0 = this.a;
        boolean z = erpq.c(s, sourceDeviceChimeraService0.getPackageManager());
        new barf(s).a();
        Feature[] arr_feature = getServiceRequest0.k;
        if(arr_feature != null && arr_feature.length != 0) {
            if(arr_feature[0].equals(epvj.a)) {
                if(sourceDeviceChimeraService0.c == null) {
                    sourceDeviceChimeraService0.c = new eqvg(sourceDeviceChimeraService0.d, sourceDeviceChimeraService0, erpq.b(s, sourceDeviceChimeraService0), getServiceRequest0.f, getServiceRequest0.p);
                }
                cjtn0.c(sourceDeviceChimeraService0.c);
            }
            return;
        }
        if(sourceDeviceChimeraService0.b == null) {
            sourceDeviceChimeraService0.b = new eqbt(sourceDeviceChimeraService0.d, sourceDeviceChimeraService0, sourceDeviceChimeraService0.a, z, getServiceRequest0.f, getServiceRequest0.p);
        }
        cjtn0.c(sourceDeviceChimeraService0.b);
    }
}

