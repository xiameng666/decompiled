import android.content.Context;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public final class atuv {
    public final Context a;
    public final long b;
    public int c;
    private static final long d;
    private static final int e;
    private static final int f;
    private final int g;
    private final int h;

    static {
        atuv.d = hqqp.a.b().a();
        atuv.e = (int)hqqp.a.b().b();
        atuv.f = (int)hqqp.a.b().c();
    }

    public atuv(Context context0) {
        this.a = context0;
        Long.valueOf(atuv.d).getClass();
        this.b = atuv.d;
        this.g = atuv.e;
        this.h = atuv.f;
    }

    public final void a() {
        if(this.c > 0 && this.c < this.g + this.h) {
            return;
        }
        synchronized(atuv.class) {
            cjpc cjpc0 = avjn.e(this.a);
            Map map0 = cjpd.d(cjpc0);
            int v1 = map0.size();
            this.c = v1;
            int v2 = this.g;
            if(v1 < this.h + v2) {
                return;
            }
            TreeMap treeMap0 = new TreeMap();
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if((map$Entry0.getValue() instanceof Long)) {
                    treeMap0.put(((Long)map$Entry0.getValue()), ((String)map$Entry0.getKey()));
                }
            }
            cjpa cjpa0 = cjpc0.c();
            for(Object object1: treeMap0.entrySet()) {
                cjpa0.j(((String)((Map.Entry)object1).getValue()));
                int v3 = this.c;
                if(v3 > 0) {
                    --v3;
                    this.c = v3;
                }
                if(v3 <= v2) {
                    break;
                }
            }
            cjpd.f(cjpa0);
        }
    }
}

