import java.util.ConcurrentModificationException;

public final class bxg {
    public static final int a(bxf bxf0, int v) {
        try {
            return caa.a(bxf0.a, bxf0.c, v);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int b(bxf bxf0, Object object0, int v) {
        int v1 = bxf0.c;
        if(v1 == 0) {
            return -1;
        }
        int v2 = bxg.a(bxf0, v);
        if(v2 < 0 || ibuq.m(object0, bxf0.b[v2])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && bxf0.a[v3] == v; ++v3) {
            if(ibuq.m(object0, bxf0.b[v3])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && bxf0.a[v4] == v; --v4) {
            if(ibuq.m(object0, bxf0.b[v4])) {
                return v4;
            }
        }
        return ~v3;
    }

    public static final int c(bxf bxf0) {
        return bxg.b(bxf0, null, 0);
    }

    public static final void d(bxf bxf0, int v) {
        bxf0.a = new int[v];
        bxf0.b = new Object[v];
    }
}

