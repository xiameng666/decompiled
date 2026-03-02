import android.content.Context;
import com.google.android.gms.mdm.settings.QrlSettingsChimeraActivity;

public final class cqoi implements eibu {
    public final cqpi a;

    public cqoi(cqpi cqpi0) {
        this.a = cqpi0;
    }

    @Override  // eibu
    public final boolean a(boolean z) {
        cqpi cqpi0 = this.a;
        Context context0 = cqpi0.requireContext();
        cqix.p.a(context0, z);
        cqpi0.ag = z;
        cqpi0.T();
        cqqn.c(cqrb.a(cqpi0.requireContext(), hgzp.dA));
        if(!z) {
            hxwm hxwm0 = hxwm.a;
            if(hxwm0.d().h()) {
                QrlSettingsChimeraActivity qrlSettingsChimeraActivity0 = cqpi0.M();
                String s = hxwm.f();
                boolean z1 = hxwm0.d().n();
                new cmkm(bbcu.dX, s, z1, null, null, null, null).a(qrlSettingsChimeraActivity0.getContainerActivity(), hxwm.f());
            }
        }
        return true;
    }
}

