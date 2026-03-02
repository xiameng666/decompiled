import android.content.Context;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class asi implements bks {
    public final Object a;
    public final Map b;
    private final aod c;
    private final awt d;
    private final Context e;

    public asi(Context context0, aod aod0, Object object0, Set set0) {
        this.a = new Object();
        this.b = new HashMap();
        this.c = aod0;
        this.e = context0;
        this.d = (awt)object0;
        try {
            this.a(new ArrayList(set0));
        }
        catch(bjg bjg0) {
            throw (bjg0.getCause() instanceof baf) ? ((baf)bjg0.getCause()) : new baf(bjg0);
        }
    }

    @Override  // bks
    public final void a(List list0) {
        HashMap hashMap0 = new HashMap();
        synchronized(this.a) {
            HashSet hashSet0 = new HashSet(list0);
            hashSet0.removeAll(this.b.keySet());
        }
        try {
            for(Object object0: hashSet0) {
                String s = (String)object0;
                bes bes0 = bes.e;
                if(Build.VERSION.SDK_INT >= 35) {
                    bes0 = new aob(this.e, s, this.d);
                }
                hashMap0.put(s, new avf(this.e, s, this.d, this.c, bes0));
            }
        }
        catch(baf | RuntimeException exception0) {
            throw new bjg("Failed to create SupportedSurfaceCombination", exception0);
        }
        synchronized(this.a) {
            HashMap hashMap1 = new HashMap();
            for(Object object2: list0) {
                String s1 = (String)object2;
                Map map0 = this.b;
                if(map0.containsKey(s1)) {
                    hashMap1.put(s1, ((avf)map0.get(s1)));
                }
                else {
                    hashMap1.put(s1, ((avf)hashMap0.get(s1)));
                }
            }
            this.b.clear();
            this.b.putAll(hashMap1);
        }
    }
}

