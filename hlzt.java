import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class hlzt implements hlyb {
    private static final Pattern a;

    static {
        hlzt.a = Pattern.compile("[0-9]+");
    }

    @Override  // hlyb
    public final hlym a(String s, hlxv hlxv0, int v, int v1, Map map0) {
        if(s.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        Collection collection0 = this.b();
        if(collection0 != null && !collection0.contains(hlxv0)) {
            throw new IllegalArgumentException("Can only encode " + collection0.toString() + ", but got " + hlxv0);
        }
        int v2 = this.e();
        hlxx hlxx0 = hlxx.f;
        if(map0.containsKey(hlxx0)) {
            v2 = Integer.parseInt(map0.get(hlxx0).toString());
        }
        boolean[] arr_z = this.c(s);
        int v3 = v2 + arr_z.length;
        int v4 = Math.max(0, v3);
        int v5 = Math.max(1, 0);
        int v6 = v4 / v3;
        hlym hlym0 = new hlym(v4, v5);
        int v7 = (v4 - arr_z.length * v6) / 2;
        int v8 = 0;
        while(v8 < arr_z.length) {
            if(arr_z[v8]) {
                hlym0.c(v7, 0, v6, v5);
            }
            ++v8;
            v7 += v6;
        }
        return hlym0;
    }

    protected Collection b() {
        throw null;
    }

    public abstract boolean[] c(String arg1);

    protected static int d(boolean[] arr_z, int v, int[] arr_v, boolean z) {
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v3 = arr_v[v1];
            int v4 = 0;
            while(v4 < v3) {
                arr_z[v] = (int)z;
                ++v4;
                ++v;
            }
            v2 += v3;
            z = ((int)z) ^ 1;
        }
        return v2;
    }

    public int e() {
        return 10;
    }

    protected static void f(String s) {
        if(hlzt.a.matcher(s).matches()) {
            return;
        }
        throw new IllegalArgumentException("Input should only contain digits 0-9");
    }
}

