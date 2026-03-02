import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.android.settingslib.widget.IntroPreference;
import com.google.android.gms.libs.layoutpreference.LayoutPreference;
import com.google.android.gms.permissions.serviceinfo.ui.BannerPreference;
import com.google.android.gms.permissions.serviceinfo.ui.ServicePreference;
import com.google.android.gms.permissions.serviceinfo.ui.TwoTargetServicePreference;

public final class ehnb extends ehmx {
    public cmec ah;
    public static final int ai;

    @Override  // ehmx
    public final View K() {
        View view0 = ((LayoutPreference)ehnc.a(this, "intro")).k(0x7F0B2457);  // id:view_consumer_services_intro
        ibuq.d(view0, "null cannot be cast to non-null type android.view.View");
        return view0;
    }

    @Override  // ehmx
    public final cmec L() {
        return this.T();
    }

    @Override  // ehmx
    public final ServicePreference M(Context context0, ehpq ehpq0, ehne ehne0) {
        ibuq.f(context0, "context");
        ibuq.f(ehpq0, "service");
        return new ServicePreference(context0, this.T(), ehpq0.g, ehne0, ehpq0.a, ehpq0.c.a());
    }

    @Override  // ehmx
    public final TwoTargetServicePreference N(Context context0, ehpq ehpq0, ehne ehne0) {
        ibuq.f(context0, "context");
        ibuq.f(ehpq0, "service");
        return new TwoTargetServicePreference(context0, this.T(), new ehmy(), ehpq0.g, ehne0, ehpq0.a, ehpq0.c.a());
    }

    @Override  // ehmx
    public final void P(boolean z) {
        if(z) {
            PackageManager packageManager0 = ehnc.b(this).getPackageManager();
            int v = 0;
            ApplicationInfo applicationInfo0 = (bbqa.c() ? packageManager0.getPackageInfo("com.google.android.gms", PackageManager.PackageInfoFlags.of(0L)) : packageManager0.getPackageInfo("com.google.android.gms", 0)).applicationInfo;
            if(applicationInfo0 != null) {
                v = applicationInfo0.uid;
            }
            UserHandle userHandle0 = UserHandle.getUserHandleForUid(v);
            ibuq.e(userHandle0, "getUserHandleForUid(...)");
            Drawable drawable0 = ehnc.b(this).getDrawable(0x7F080321);
            if(drawable0 == null) {
                throw new IllegalArgumentException("unable to find drawable: 2131231521");
            }
            Drawable drawable1 = packageManager0.getUserBadgedIcon(drawable0, userHandle0);
            ibuq.e(drawable1, "getUserBadgedIcon(...)");
            Context context0 = this.A().j;
            ibuq.e(context0, "getContext(...)");
            if(ehnn.a(context0)) {
                ((IntroPreference)ehnc.a(this, "service_info_intro_preference")).J(drawable1);
                return;
            }
            View view0 = this.K().findViewById(0x7F0B126A);  // id:entity_header_icon
            ibuq.e(view0, "findViewById(...)");
            ((ImageView)view0).setImageDrawable(drawable1);
        }
    }

    @Override  // ehmx
    public final BannerPreference Q(Context context0, cmec cmec0, hgiq hgiq0) {
        ibuq.f(context0, "context");
        ibuq.f(cmec0, "gmsCoreMetrics");
        ibuq.f(hgiq0, "serviceId");
        return new BannerPreference(context0, cmec0, 0x27D93, hgiq0);
    }

    @Override  // ehmx
    public final void R(ehpq ehpq0) {
        ibuq.f(ehpq0, "service");
    }

    @Override  // ehmx
    public final void S(ehpq ehpq0, Preference preference0) {
        ibuq.f(ehpq0, "service");
        ibuq.e(preference0.j, "getContext(...)");
        if(ehnn.a(preference0.j)) {
            ehpq.a(new ehmz(((TwoTargetServicePreference)preference0)));
            return;
        }
        ehpq.a(new ehna(((ServicePreference)preference0)));
    }

    public final cmec T() {
        cmec cmec0 = this.ah;
        if(cmec0 != null) {
            return cmec0;
        }
        ibuq.j("gmsCoreMetrics");
        return null;
    }

    public final void U(cmec cmec0) {
        ibuq.f(cmec0, "<set-?>");
        this.ah = cmec0;
    }

    @Override  // ehmx
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        ehkx.b(this);
        super.onAttach(context0);
    }
}

