import java.security.Key;
import java.util.Map;

public final class svo implements swc {
    private final Map a;

    public svo(Map map0) {
        this.a = map0;
    }

    @Override  // swc
    public final sxd a(srk srk0, byte[] arr_b) {
        String s = str.b(arr_b);
        Key key0 = (Key)this.a.get(s);
        return key0 == null ? sxd.a : new sxd(new svn(srk0, key0));
    }
}

