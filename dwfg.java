import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;

public final class dwfg implements evqf {
    public final dwfo a;

    public dwfg(dwfo dwfo0) {
        this.a = dwfo0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        int v = ((ModuleAvailabilityResponse)object0).b;
        dwfo dwfo0 = this.a;
        if(v == 0) {
            dwfo0.E(3);
            return;
        }
        if(v == 1) {
            dwfo0.E(2);
            return;
        }
        dwfo0.E(4);
    }
}

