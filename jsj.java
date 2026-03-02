import java.util.ArrayList;
import java.util.List;

final class jsj {
    public static int a;
    jsn b;
    final ArrayList c;

    public jsj(jsn jsn0) {
        this.b = null;
        this.c = new ArrayList();
        ++jsj.a;
        this.b = jsn0;
    }

    public final long a(jsc jsc0, long v) {
        jsn jsn0 = jsc0.d;
        if((jsn0 instanceof jsh)) {
            return v;
        }
        List list0 = jsc0.j;
        int v1 = list0.size();
        long v3 = v;
        for(int v2 = 0; v2 < v1; ++v2) {
            jsa jsa0 = (jsa)list0.get(v2);
            if((jsa0 instanceof jsc) && ((jsc)jsa0).d != jsn0) {
                v3 = Math.min(v3, this.a(((jsc)jsa0), ((long)((jsc)jsa0).e) + v));
            }
        }
        if(jsc0 == jsn0.j) {
            long v4 = v - jsn0.a();
            return Math.min(Math.min(v3, this.a(jsn0.i, v4)), v4 - ((long)jsn0.i.e));
        }
        return v3;
    }

    public final long b(jsc jsc0, long v) {
        jsn jsn0 = jsc0.d;
        if((jsn0 instanceof jsh)) {
            return v;
        }
        List list0 = jsc0.j;
        int v1 = list0.size();
        long v3 = v;
        for(int v2 = 0; v2 < v1; ++v2) {
            jsa jsa0 = (jsa)list0.get(v2);
            if((jsa0 instanceof jsc) && ((jsc)jsa0).d != jsn0) {
                v3 = Math.max(v3, this.b(((jsc)jsa0), ((long)((jsc)jsa0).e) + v));
            }
        }
        if(jsc0 == jsn0.i) {
            long v4 = v + jsn0.a();
            return Math.max(Math.max(v3, this.b(jsn0.j, v4)), v4 - ((long)jsn0.j.e));
        }
        return v3;
    }
}

