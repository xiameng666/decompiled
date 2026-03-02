import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class aqwf {
    public final HashMap a;
    public final HashSet b;
    public final HashSet c;

    public aqwf() {
        this.a = new HashMap();
        this.b = new HashSet();
        this.c = new HashSet();
    }

    public final void a(String s, byte[] arr_b) {
        this.a.put(s, arr_b);
        this.c.remove(s);
    }

    public final void b(String s) {
        Iterator iterator0 = this.a.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((String)((Map.Entry)object0).getKey()).startsWith(s)) {
                iterator0.remove();
            }
        }
        Iterator iterator1 = this.c.iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            if(((String)object1).startsWith(s)) {
                iterator1.remove();
            }
        }
        this.b.add(s);
    }
}

