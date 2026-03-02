import com.google.android.gms.cast.framework.devicesuggestions.DeviceSuggestionResult;
import java.util.LinkedHashMap;
import java.util.Map;

public final class aueh {
    public static final Map a;

    static {
        aueh.a = new LinkedHashMap();
    }

    public static final void a(String s, DeviceSuggestionResult deviceSuggestionResult0) {
        ibuq.f(s, "clientAppName");
        auei auei0 = (auei)aueh.a.get(s);
        if(auei0 != null) {
            auei0.d = deviceSuggestionResult0;
        }
    }

    public static final auei b(String s) {
        ibuq.f(s, "clientAppName");
        auei auei0 = new auei(auej.a(s), new LinkedHashMap());
        aueh.a.put(s, auei0);
        return auei0;
    }

    public static final DeviceSuggestionResult c(String s) {
        ibuq.f(s, "clientAppName");
        auei auei0 = (auei)aueh.a.get(s);
        return auei0 == null ? null : auei0.d;
    }

    public static final Map d(String s) {
        ibuq.f(s, "clientAppName");
        auei auei0 = (auei)aueh.a.get(s);
        return auei0 == null ? null : auei0.c;
    }

    public static final Map e() {
        return ibpz.q(aueh.a);
    }
}

