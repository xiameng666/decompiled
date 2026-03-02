import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.location.reporting.service.ReportingAndroidChimeraService;

public final class fxsx implements cjuo {
    public final ReportingAndroidChimeraService a;

    public fxsx(ReportingAndroidChimeraService reportingAndroidChimeraService0) {
        this.a = reportingAndroidChimeraService0;
    }

    @Override  // cjuo
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        String s = getServiceRequest0.f;
        Bundle bundle0 = getServiceRequest0.i;
        String s1 = null;
        if(bundle0 != null) {
            String s2 = bundle0.getString("real_client_package_name");
            if(!TextUtils.isEmpty(s2)) {
                s1 = s2;
            }
        }
        cjtn0.c(new cnue(this.a, s, s1));
    }
}

