import java.util.Enumeration;
import java.util.HashMap;

final class bnt implements Enumeration {
    int a;

    public bnt() {
        this.a = 0;
    }

    @Override
    public final boolean hasMoreElements() {
        return this.a < 4;
    }

    @Override
    public final Object nextElement() {
        Object object0 = new HashMap();
        bnz[] arr_bnz = bnx.b[this.a];
        for(int v = 0; v < arr_bnz.length; ++v) {
            bnz bnz0 = arr_bnz[v];
            ((HashMap)object0).put(bnz0.b, bnz0);
        }
        ++this.a;
        return object0;
    }
}

