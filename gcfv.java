import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class gcfv {
    public static final Object a(JSONObject jSONObject0, String s, Class class0) {
        ibuq.f(jSONObject0, "<this>");
        try {
            Object object0 = jSONObject0.get(s);
            ibuq.e(object0, "get(...)");
            if(class0.isInstance(object0)) {
                return object0;
            }
            gavm.c("BE_JU_02", a.L(class0, s, "Field ", " is not of type "));
            throw new ibnm();
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public static final Object b(JSONObject jSONObject0, String s, Class class0) {
        ibuq.f(jSONObject0, "<this>");
        Object object0 = gcfv.a(jSONObject0, s, class0);
        gavm.b(object0, "BE_JU_01", a.a(s, "Field ", " is not present"), 4);
        return object0;
    }

    public static final void c(JSONObject jSONObject0, List list0) {
        ibuq.f(list0, "entries");
        for(Object object0: list0) {
            jSONObject0.put(((String)((ibns)object0).a), ((ibns)object0).b);
        }
    }
}

