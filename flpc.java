import j..util.Objects;
import java.util.HashMap;

public final class flpc {
    public static gfsx a(HashMap hashMap0) {
        try {
            fmgs fmgs0 = fmgt.a();
            if(hashMap0.containsKey("A11Y_TEXT")) {
                fmgs0.b(((String)hashMap0.get("A11Y_TEXT")));
            }
            if(hashMap0.containsKey("LIGHTER_ICON")) {
                gfsx gfsx0 = floh.a(((HashMap)hashMap0.get("LIGHTER_ICON")));
                Objects.requireNonNull(fmgs0);
                flbl.b(gfsx0, new floz(fmgs0));
            }
            fmgs0.g(((String)hashMap0.get("TEXT")));
            fmgs0.a = (fmbi)flbl.a(flbm.b(hashMap0.get("ACTION")), new flpa()).d();
            fmgs0.h(((Integer)hashMap0.get("TEXT_COLOR")).intValue());
            fmgs0.c(((Integer)hashMap0.get("BACKGROUND_COLOR")).intValue());
            fmgs0.d(((Integer)hashMap0.get("BORDER_COLOR")).intValue());
            fmgs0.e(((Boolean)hashMap0.get("ENABLED")).booleanValue());
            return gfsx.m(fmgs0.a());
        }
        catch(NullPointerException | IllegalStateException exception0) {
            flbj.d("RCButtonsConverters", "failed to convert Map to RichCardButton", exception0);
            return gfqx.a;
        }
    }

    public static HashMap b(fmgt fmgt0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("TEXT", fmgt0.a);
        flow flow0 = new flow(hashMap0, fmgt0);
        flbl.b(fmgt0.b, flow0);
        flox flox0 = new flox(hashMap0);
        flbl.b(fmgt0.c, flox0);
        hashMap0.put("ACTION", flnq.b(fmgt0.d));
        hashMap0.put("TEXT_COLOR", Integer.valueOf(fmgt0.e));
        hashMap0.put("BACKGROUND_COLOR", Integer.valueOf(fmgt0.f));
        hashMap0.put("BORDER_COLOR", Integer.valueOf(fmgt0.g));
        hashMap0.put("ENABLED", Boolean.valueOf(fmgt0.h));
        return hashMap0;
    }
}

