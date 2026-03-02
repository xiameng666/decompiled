import android.util.SparseArray;
import java.util.Arrays;

public final class ajlp {
    public static final SparseArray a;
    public static final SparseArray b;
    public static final SparseArray c;
    public final int d;
    public final int e;
    public final int f;

    static {
        SparseArray sparseArray0 = new SparseArray();
        ajlp.a = sparseArray0;
        SparseArray sparseArray1 = new SparseArray();
        ajlp.b = sparseArray1;
        SparseArray sparseArray2 = new SparseArray();
        ajlp.c = sparseArray2;
        sparseArray0.put(1, "absent");
        sparseArray0.put(0, "present");
        sparseArray0.put(2, "unknown");
        sparseArray0.put(3, "secondary");
        sparseArray0.put(4, "background");
        sparseArray1.put(10, "enabled");
        sparseArray1.put(11, "disabled");
        sparseArray1.put(12, "unknown");
        sparseArray2.put(20, "enabled");
        sparseArray2.put(21, "disabled");
        sparseArray2.put(22, "unsupported");
    }

    public ajlp(int v, int v1, int v2) {
        boolean z = true;
        batl.b(ajlp.a.get(v) != null);
        batl.b(ajlp.b.get(v1) != null);
        if(ajlp.c.get(v2) == null) {
            z = false;
        }
        batl.b(z);
        this.d = v;
        this.e = v1;
        this.f = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ajlp) && this.d == ((ajlp)object0).d && this.e == ((ajlp)object0).e && this.f == ((ajlp)object0).f;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.d), ((int)this.e), ((int)this.f)});
    }

    @Override
    public final String toString() {
        return String.format("{user_present=%d, screen_lock=%d, trust_agent=%d}", ((int)this.d), ((int)this.e), ((int)this.f));
    }
}

