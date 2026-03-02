import android.app.Activity;
import android.content.Context;

final class eknq implements evqc, evqf {
    final eknt a;

    public eknq(eknt eknt0) {
        this.a = eknt0;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Context context0 = this.a.getContext();
        if(context0 == null) {
            return;
        }
        eknp.a(context0, "IsVerifyAppsEnabledListener", exception0);
    }

    @Override  // evqf
    public final void gw(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        eknt eknt0 = this.a;
        Activity activity0 = ekne.a(eknt0);
        if(activity0 == null) {
            return;
        }
        if(z) {
            ekob ekob0 = eknt0.ai;
            if(ekob0 == null) {
                ibuq.j("safeBrowsingPreferenceController");
                ekob0 = null;
            }
            eknt.M(activity0, fhqu.a(ekob0.a.a()), eknt0.ag);
            return;
        }
        eknt0.L(1);
    }
}

