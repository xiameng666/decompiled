import j..util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class ialv {
    static final gfss a;
    public static final ialv b;
    public final Map c;
    public final byte[] d;

    static {
        ialv.a = gfss.d(',');
        ialv ialv0 = new ialv();
        ialv ialv1 = new ialv(new iale(), true, ialv0);
        ialv.b = new ialv(ialf.a, false, ialv1);
    }

    private ialv() {
        this.c = new LinkedHashMap(0);
        this.d = new byte[0];
    }

    private ialv(ialt ialt0, boolean z, ialv ialv0) {
        String s = ialt0.c();
        gftb.b(((boolean)(s.contains(",") ^ 1)), "Comma is currently not allowed in message encoding");
        int v = ialv0.c.size();
        String s1 = ialt0.c();
        if(!ialv0.c.containsKey(s1)) {
            ++v;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
        for(Object object0: ialv0.c.values()) {
            ialu ialu0 = (ialu)object0;
            String s2 = ialu0.a.c();
            if(!s2.equals(s)) {
                linkedHashMap0.put(s2, new ialu(ialu0.a, ialu0.b));
            }
        }
        linkedHashMap0.put(s, new ialu(ialt0, z));
        Map map0 = DesugarCollections.unmodifiableMap(linkedHashMap0);
        this.c = map0;
        gfss gfss0 = ialv.a;
        HashSet hashSet0 = new HashSet(map0.size());
        for(Object object1: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            if(((ialu)map$Entry0.getValue()).b) {
                hashSet0.add(((String)map$Entry0.getKey()));
            }
        }
        this.d = gfss0.b(DesugarCollections.unmodifiableSet(hashSet0)).getBytes(Charset.forName("US-ASCII"));
    }
}

