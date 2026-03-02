import android.util.LruCache;
import com.google.android.gms.phenotype.ExperimentTokens;
import j..util.Objects;

final class eird extends LruCache {
    final eirf a;

    public eird(eirf eirf0, int v) {
        Objects.requireNonNull(eirf0);
        this.a = eirf0;
        super(v);
    }

    @Override  // android.util.LruCache
    protected final void entryRemoved(boolean z, Object object0, Object object1, Object object2) {
        synchronized(this.a.c) {
            super.entryRemoved(z, ((eire)object0), ((ExperimentTokens)object1), ((ExperimentTokens)object2));
            this.a.d.remove(((eire)object0));
        }
    }

    @Override  // android.util.LruCache
    protected final int sizeOf(Object object0, Object object1) {
        int v2;
        String s = ((eire)object0).a;
        int v = 0;
        if(s == null) {
            v2 = 0;
        }
        else {
            int v1 = s.length();
            v2 = v1 + v1;
        }
        String s1 = ((eire)object0).b;
        if(s1 != null) {
            int v3 = s1.length();
            v = v3 + v3;
        }
        int v4 = ((eire)object0).c.length();
        return v2 + v + (v4 + v4) + 4 + ((ExperimentTokens)object1).a();
    }
}

