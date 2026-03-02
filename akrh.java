import android.content.Context;
import android.util.TypedValue;
import com.google.android.setupdesign.GlifLayout;

public final class akrh {
    public static final void a(GlifLayout glifLayout0) {
        ibuq.f(glifLayout0, "glifLayout");
        if(jys.d() && gaec.t(glifLayout0.getContext())) {
            glifLayout0.M(null);
        }
    }

    public static final void b(GlifLayout glifLayout0) {
        ibuq.f(glifLayout0, "glifLayout");
        if(jys.d() && gaec.t(glifLayout0.getContext())) {
            glifLayout0.M(glifLayout0.getContext().getDrawable(0x7F080686));  // drawable:gs_work_vd_theme_24
            gafm gafm0 = glifLayout0.t(gahz.class);
            ibuq.e(gafm0, "getMixin(...)");
            Context context0 = glifLayout0.getContext();
            ibuq.e(context0, "getContext(...)");
            TypedValue typedValue0 = new TypedValue();
            context0.getTheme().resolveAttribute(0x7F04030C, typedValue0, true);  // attr:colorPrimary
            ((gahz)gafm0).g(context0.getColor(typedValue0.resourceId));
        }
    }
}

