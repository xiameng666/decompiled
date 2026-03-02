import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fvsn {
    public ArrayList a;
    public List b;
    public long c;

    public fvsn() {
        throw null;
    }

    public fvsn(byte[] arr_b) {
        this.a = new ArrayList();
    }

    public final Boolean a(long v, long v1, long v2) {
        return this.e(0, v, v1, v2);
    }

    public final Boolean b(long v, long v1, long v2) {
        return this.e(1, v, v1, v2);
    }

    public final Boolean c(long v, long v1, long v2) {
        return this.e(2, v, v1, v2);
    }

    public static fuur d(fuus fuus0, long v, fuus fuus1, long v1) {
        return new fuur(fuus0.b - v, fuus1.b + v1, fuus0.a);
    }

    private final Boolean e(int v, long v1, long v2, long v3) {
        long v8;
        long v7;
        List list0 = this.b;
        if(list0 != null) {
            Iterator iterator0 = list0.iterator();
            long v4 = 0L;
            long v5 = 0L;
            while(true) {
                int v6 = Long.compare(v1, v2);
                v7 = v6 <= 0 ? v1 : v2;
                v8 = v6 <= 0 ? v2 : v1;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                fuur fuur0 = (fuur)object0;
                long v9 = Math.max(v7, fuur0.a);
                long v10 = Math.min(v8, fuur0.b);
                if(v10 > v9) {
                    long v11 = v10 - v9;
                    if(fuur0.c == v) {
                        v4 += v11;
                    }
                    v5 += v11;
                }
            }
            long v12 = v8 - v7;
            if(v4 > Math.min(Math.max(v12 - 1L, 0L), v3)) {
                return Boolean.TRUE;
            }
            return v12 - v5 > 30000L ? null : Boolean.FALSE;
        }
        return null;
    }
}

