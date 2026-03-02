import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.preference.Preference;
import com.google.android.gms.permissions.serviceinfo.ui.BannerPreference;
import com.google.android.gms.permissions.serviceinfo.ui.ServicePreference;
import com.google.android.gms.permissions.serviceinfo.ui.TwoTargetServicePreference;

public abstract class ehmx extends skp {
    public ehpa ag;
    public static final bboh d;

    static {
        ehmx.d = bboh.b("ConsumerServicesFragment", bbcu.dO);
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.H(0x7F190086, s);  // xml:consumer_services_preferences
    }

    public abstract View K();

    public abstract cmec L();

    public abstract ServicePreference M(Context arg1, ehpq arg2, ehne arg3);

    public TwoTargetServicePreference N(Context context0, ehpq ehpq0, ehne ehne0) {
        throw null;
    }

    public final void O(int v) {
        Context context0 = this.A().j;
        ibuq.e(context0, "getContext(...)");
        if(ehnn.a(context0)) {
            ehnc.a(this, "service_info_loading_preference").T(v == 0);
            return;
        }
        Object object0 = kfb.b(this.K(), 0x7F0B0F0A);  // id:circular_progress_indicator
        ibuq.e(object0, "requireViewById(...)");
        ((ProgressBar)object0).setVisibility(v);
    }

    public abstract void P(boolean arg1);

    public abstract BannerPreference Q(Context arg1, cmec arg2, hgiq arg3);

    public abstract void R(ehpq arg1);

    public abstract void S(ehpq arg1, Preference arg2);

    @Override  // du
    public void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        lso lso0 = new lso(((xob)context0), new ehpd(((xob)context0)));
        Bundle bundle0 = this.getArguments();
        int v = bundle0 == null ? 0 : bundle0.getInt("UserServiceId");
        hgiq hgiq0 = hgiq.b(v) == null ? hgiq.a : hgiq.b(v);
        ibuq.f(hgiq0, "userServiceId");
        String s = String.valueOf(hgiq0.a());
        ibuq.f(s, "key");
        ibwv ibwv0 = ibtf.d(ehpa.class);
        this.ag = (ehpa)lso0.b.a(ibwv0, s);
    }

    @Override  // skp
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        icbb.b(lpt.a(this), null, null, new ehmw(this, null), 3);
    }
}

