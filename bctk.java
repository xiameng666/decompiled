import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import java.util.ArrayList;
import java.util.Arrays;

public final class bctk implements bcwm {
    public final xpa a;
    public final int b;
    public final ArrayList c;
    private final QueryFilterParameters d;

    public bctk(xpa xpa0, int v, ArrayList arrayList0, QueryFilterParameters queryFilterParameters0) {
        this.a = xpa0;
        this.b = v;
        this.c = arrayList0;
        this.d = queryFilterParameters0;
    }

    @Override  // bcwm
    public final QueryFilterParameters a() {
        return this.d;
    }

    public final boolean b() {
        return this.c != null && !this.c.isEmpty();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof bctk)) {
            return false;
        }
        if(this.b() != ((bctk)object0).b()) {
            return false;
        }
        if(this.b()) {
            ArrayList arrayList0 = ((bctk)object0).c;
            ArrayList arrayList1 = this.c;
            if(arrayList0.size() != arrayList1.size()) {
                return false;
            }
            int v = arrayList1.size();
            int v1 = 0;
            while(v1 < v) {
                boolean z = arrayList0.contains(((bctj)arrayList1.get(v1)));
                ++v1;
                if(!z) {
                    return false;
                }
            }
        }
        return this.d.equals(((bctk)object0).d);
    }

    @Override
    public final int hashCode() {
        ArrayList arrayList0 = this.c;
        int v = 0;
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            int v2 = 0;
            while(v < v1) {
                v2 += Arrays.hashCode(new Object[]{((bctj)arrayList0.get(v))});
                ++v;
            }
            v = v2;
        }
        return v + Arrays.hashCode(new Object[]{this.d});
    }
}

