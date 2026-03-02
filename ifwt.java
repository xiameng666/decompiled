import j..util.DesugarCollections;
import java.util.Map;
import java.util.StringTokenizer;

public final class ifwt {
    private final Map a;

    public ifwt(Map map0) {
        this.a = map0;
    }

    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    public static int[] b(String s) {
        try {
            if(s.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer0 = new StringTokenizer(s, ".");
            int v = stringTokenizer0.countTokens();
            int[] arr_v = new int[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_v[v1] = Integer.parseInt(stringTokenizer0.nextToken());
            }
            return arr_v;
        }
        catch(RuntimeException runtimeException0) {
            throw new IllegalArgumentException(a.a(s, "Unable to parse HTTP flags version string: `", "`"), runtimeException0);
        }
    }
}

