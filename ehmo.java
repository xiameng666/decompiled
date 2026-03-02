import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;
import com.android.settingslib.widget.TopIntroPreference;
import com.google.android.gms.libs.layoutpreference.LayoutPreference;
import com.google.android.gms.permissions.serviceinfo.ui.BannerPreference;
import com.google.android.gms.permissions.serviceinfo.ui.LearnMoreFooterPreference;

public abstract class ehmo extends skp {
    public hgiq ag;
    public ehoq ah;
    public static final bboh d;

    static {
        ehmo.d = bboh.b("ComplexServiceInfoFragment", bbcu.dO);
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.H(this.O(), s);
    }

    public abstract int K();

    public abstract int L();

    public abstract int M();

    public abstract int N();

    public abstract int O();

    public abstract cmec P();

    public final void Q(String s) {
        ((LearnMoreFooterPreference)ehnc.a(this, "service_footer")).S(s);
    }

    public final void R(String s, String s1) {
        LayoutPreference layoutPreference0 = (LayoutPreference)ehnc.a(this, "service_intro");
        TopIntroPreference topIntroPreference0 = (TopIntroPreference)this.iO("service_top_intro");
        PreferenceCategory preferenceCategory0 = (PreferenceCategory)this.iO("complex_services_category");
        Context context0 = this.A().j;
        ibuq.e(context0, "getContext(...)");
        if(ehnn.a(context0)) {
            layoutPreference0.T(false);
            if(topIntroPreference0 != null) {
                topIntroPreference0.T(true);
            }
            if(preferenceCategory0 != null) {
                preferenceCategory0.T(true);
            }
            String s2 = s1.length() <= 0 ? "" : "\n\n" + s1;
            String s3 = String.valueOf(s);
            if(topIntroPreference0 != null) {
                topIntroPreference0.S(s3 + s2);
            }
            return;
        }
        View view0 = layoutPreference0.k(this.N());
        ibuq.c(view0);
        Object object0 = kfb.b(view0, this.M());
        ibuq.e(object0, "requireViewById(...)");
        ((TextView)object0).setText(s);
        Object object1 = kfb.b(view0, this.K());
        ibuq.e(object1, "requireViewById(...)");
        if(s1.length() > 0) {
            ((TextView)object1).setVisibility(0);
            ((TextView)object1).setText(s1);
            return;
        }
        ((TextView)object1).setVisibility(8);
    }

    public abstract void S(String arg1);

    public abstract BannerPreference T(Context arg1, cmec arg2, hgiq arg3);

    @Override  // du
    public void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        Bundle bundle0 = this.getArguments();
        if(bundle0 == null) {
            throw new IllegalStateException("Missing bundle");
        }
        int v = bundle0.getInt("UserServiceId", 0);
        hgiq hgiq0 = hgiq.b(v);
        if(hgiq0 == null) {
            throw new IllegalStateException("Unknown UserServiceId: " + v);
        }
        this.ag = hgiq0;
        Context context1 = ((xob)context0).getApplicationContext();
        ibuq.e(context1, "getApplicationContext(...)");
        hgiq hgiq1 = this.ag;
        if(hgiq1 == null) {
            ibuq.j("userServiceId");
            hgiq1 = null;
        }
        this.ah = (ehoq)new lso(((xob)context0), new ehom(context1, hgiq1)).b(new ibuk(ehoq.class));
    }

    @Override  // skp
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        icbb.b(lpt.a(this), null, null, new ehml(this, null), 3);
    }
}

