import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

public final class bjb implements bks {
    public final Object a;
    public final Map b;
    public final Set c;
    public gmcd d;
    public jqt e;
    public aox f;

    public bjb() {
        this.a = new Object();
        this.b = new LinkedHashMap();
        this.c = new HashSet();
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
                hashMap0.put(((String)object0), this.f.b(((String)object0)));
            }
        }
        catch(baf baf0) {
            throw new bjg("Failed to create CameraInternal", baf0);
        }
        synchronized(this.a) {
            Map map0 = this.b;
            HashSet hashSet1 = new HashSet(map0.keySet());
            hashSet1.removeAll(list0);
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: hashSet1) {
                arrayList0.add(((bin)map0.get(((String)object2))));
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object3: list0) {
                String s = (String)object3;
                if(map0.containsKey(s)) {
                    linkedHashMap0.put(s, ((bin)map0.get(s)));
                }
                else {
                    linkedHashMap0.put(s, ((bin)hashMap0.get(s)));
                }
            }
            map0.clear();
            map0.putAll(linkedHashMap0);
            for(Object object4: arrayList0) {
                bin bin0 = (bin)object4;
                if(bin0 != null) {
                    bin0.r();
                }
            }
        }
    }

    public final bin b(String s) {
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        bin bin0 = (bin)this.b.get(s);
        if(bin0 != null) {
            FIN.finallyCodeBegin$NT(v);
            return bin0;
        }
        throw new IllegalArgumentException("Invalid camera: " + s);
    }

    public final LinkedHashSet c() {
        synchronized(this.a) {
        }
        return new LinkedHashSet(this.b.values());
    }
}

