import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public final class ue {
    public final SparseArray a;
    public int b;
    final Set c;

    public ue() {
        this.a = new SparseArray();
        this.b = 0;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }

    public final ud a(int v) {
        SparseArray sparseArray0 = this.a;
        ud ud0 = (ud)sparseArray0.get(v);
        if(ud0 == null) {
            ud0 = new ud();
            sparseArray0.put(v, ud0);
        }
        return ud0;
    }

    public final void b() {
        ++this.b;
    }

    public final void c() {
        --this.b;
    }

    static final long d(long v, long v1) {
        return v == 0L ? v1 : v / 4L * 3L + v1 / 4L;
    }
}

