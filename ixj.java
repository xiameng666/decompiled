import java.util.List;

public final class ixj {
    // This method was un-flattened
    public static final int a(List list0, int v) {
        int v4;
        int v1 = ((ixk)ibpo.W(list0)).b;
        if(v > ((ixk)ibpo.W(list0)).b) {
            jie.a(a.z(v1, v, "Index ", " should be less or equal than last line\'s end "));
        }
        int v2 = list0.size() - 1;
        int v3 = 0;
        while(v3 <= v2) {
            v4 = v3 + v2 >>> 1;
            ixk ixk0 = (ixk)list0.get(v4);
            if(ixk0.a <= v && ixk0.b <= v) {
                v3 = v4 + 1;
            }
            else {
                v2 = v4 - 1;
            }
        }
        v4 = -(v3 + 1);
        if(v4 >= 0 && v4 < list0.size()) {
            return v4;
        }
        jie.a(("Found paragraph index " + v4 + " should be in range [0, " + list0.size() + ").\nDebug info: index=" + v + ", paragraphs=[" + jlz.c(list0, null, null, null, new ixi(), 0x1F) + ']'));
        return v4;
    }

    // This method was un-flattened
    public static final int b(List list0, int v) {
        int v1 = list0.size() - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            ixk ixk0 = (ixk)list0.get(v3);
            if(ixk0.c <= v && ixk0.d <= v) {
                v2 = v3 + 1;
            }
            else {
                v1 = v3 - 1;
            }
        }
        return -(v2 + 1);
    }

    // This method was un-flattened
    public static final int c(List list0, float f) {
        if(Float.compare(f, 0.0f) <= 0) {
            return 0;
        }
        if((f >= ((ixk)ibpo.W(list0)).f)) {
            return ibpo.d(list0);
        }
        int v = list0.size() - 1;
        int v1 = 0;
        while(v1 <= v) {
            int v2 = v1 + v >>> 1;
            ixk ixk0 = (ixk)list0.get(v2);
            if(ixk0.e <= f && (ixk0.f <= f)) {
                v1 = v2 + 1;
            }
            else {
                v = v2 - 1;
            }
        }
        return -(v1 + 1);
    }

    public static final void d(List list0, long v, ibts ibts0) {
        int v1 = ixj.a(list0, jbk.d(v));
        int v2 = list0.size();
        while(v1 < v2) {
            ixk ixk0 = (ixk)list0.get(v1);
            int v3 = ixk0.a;
            if(v3 >= jbk.c(v)) {
                break;
            }
            if(v3 != ixk0.b) {
                ibts0.a(ixk0);
            }
            ++v1;
        }
    }
}

