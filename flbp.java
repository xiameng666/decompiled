import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

public final class flbp {
    public static final int a = 0;
    private static final String b = "flbp";

    static {
    }

    public static gged_interceptors a(JSONArray jSONArray0) {
        ggdy ggdy0 = new ggdy();
        for(int v = 0; true; ++v) {
            try {
                if(v >= jSONArray0.length()) {
                    break;
                }
                ggdy0.i(jSONArray0.getString(v));
            }
            catch(JSONException unused_ex) {
                flbj.c(flbp.b, "JSON string somehow failed to be converted to String.");
                return ggna.a;
            }
        }
        return ggdy0.h();
    }

    public static gged_interceptors b(Collection collection0, gfsi gfsi0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: collection0) {
            gfsx gfsx0 = (gfsx)gfsi0.apply(object0);
            if(gfsx0.i()) {
                ggdy0.i(gfsx0.d());
            }
        }
        return ggdy0.h();
    }

    public static gged_interceptors c(Collection collection0, gfsi gfsi0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: collection0) {
            ggdy0.i(gfsi0.apply(object0));
        }
        return ggdy0.h();
    }

    public static ArrayList d(Collection collection0, gfsi gfsi0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            arrayList0.add(gfsi0.apply(object0));
        }
        return arrayList0;
    }
}

