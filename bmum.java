import j..util.Objects;
import java.util.HashSet;

final class bmum implements glzn {
    public bmum(bmuz bmuz0) {
        Objects.requireNonNull(bmuz0);
        super();
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        HashSet hashSet0 = new HashSet();
        int v = ((gged_interceptors)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            hashSet0.add(Integer.valueOf(((hery)((gged_interceptors)object0).get(v1)).o));
        }
        return gmbu.i(hashSet0);
    }
}

