import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public abstract class fusr {
    public final long a;
    protected final fuwh b;
    protected boolean c;
    private static final Map d;

    static {
        EnumMap enumMap0 = new EnumMap(fuwh.class);
        fusr.d = enumMap0;
        Integer integer0 = (int)0;
        enumMap0.put(fuwh.a, integer0);
        enumMap0.put(fuwh.l, Integer.valueOf(16));
        enumMap0.put(fuwh.m, Integer.valueOf(17));
        enumMap0.put(fuwh.p, integer0);
        enumMap0.put(fuwh.b, Integer.valueOf(1));
        enumMap0.put(fuwh.c, Integer.valueOf(2));
        enumMap0.put(fuwh.d, Integer.valueOf(7));
        enumMap0.put(fuwh.e, Integer.valueOf(8));
        enumMap0.put(fuwh.f, Integer.valueOf(3));
        Integer integer1 = (int)4;
        enumMap0.put(fuwh.g, integer1);
        enumMap0.put(fuwh.h, Integer.valueOf(5));
        enumMap0.put(fuwh.i, integer1);
        enumMap0.put(fuwh.j, Integer.valueOf(9));
        enumMap0.put(fuwh.k, Integer.valueOf(15));
        enumMap0.put(fuwh.n, Integer.valueOf(18));
        enumMap0.put(fuwh.o, Integer.valueOf(19));
        enumMap0.put(fuwh.p, Integer.valueOf(20));
        enumMap0.put(fuwh.q, Integer.valueOf(21));
    }

    public fusr(long v) {
        this.c = true;
        this.a = v;
        String s = humr.g();
        fuwh fuwh0 = null;
        if(s.length() > 0) {
            try {
                fuwh0 = (fuwh)Enum.valueOf(fuwh.class, s);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        this.b = fuwh0;
    }

    public static int a(fvsf fvsf0, int v, long v1) {
        long v2 = fvsf0.d(v) - v1;
        while(v >= 0) {
            if(fvsf0.d(v) <= v2) {
                return v;
            }
            --v;
        }
        return ((double)(fvsf0.d(0) - v2)) <= ((double)v1) * 0.1 ? 0 : -1;
    }

    public abstract fvuv b(long arg1, long arg2, fvsf arg3);

    public static List c(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(new DetectedActivity(((int)(((Integer)fusr.d.get(((fuwi)object0).a)))), ((fuwi)object0).b));
        }
        return list1;
    }

    public void d() {
        this.c = true;
    }
}

