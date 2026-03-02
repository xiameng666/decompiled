import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class hlup {
    private static final glwa a;
    private final hlus b;
    private final String c;
    private final hluq d;
    private final Map e;
    private final String f;
    private final hlur g;

    static {
        hlup.a = new glwa("_-!.~\'()*", false);
    }

    public hlup(hlus hlus0, String s, hluq hluq0, Map map0, int v) {
        if((v & 8) != 0) {
            map0 = ibpt.a;
        }
        if((v & 4) != 0) {
            hluq0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        ibuq.f(hlus0, "deepLinkType");
        ibuq.f(map0, "queryParameters");
        super();
        this.b = hlus0;
        this.c = s;
        this.d = hluq0;
        this.e = map0;
        this.f = null;
        this.g = null;
    }

    public final glwc a() {
        glwd glwd0 = new glwd();
        glwd0.a = (String)this.b.d.get(0);
        glwd0.b = (String)this.b.e.get(0);
        List list0 = ibpo.at(this.b.f);
        String s = this.c;
        if(s != null) {
            list0.add("account");
            list0.add(s);
        }
        hluq hluq0 = this.d;
        if(hluq0 != null) {
            list0.add("device");
            list0.addAll(ibpo.g(new String[]{String.valueOf(2), hluq0.a}));
        }
        if(!list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(hlup.a.a(((String)object0)));
            }
            glwd0.c = ibpo.aK(arrayList0, "/", "/", null, null, 60);
        }
        for(Object object1: this.e.entrySet()) {
            glwd0.d(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
        }
        return glwd0.a();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof hlup)) {
            return false;
        }
        if(this.b != ((hlup)object0).b) {
            return false;
        }
        if(!ibuq.m(this.c, ((hlup)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((hlup)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((hlup)object0).e)) {
            return false;
        }
        return ibuq.m(null, null) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        hluq hluq0 = this.d;
        if(hluq0 != null) {
            v1 = hluq0.hashCode();
        }
        return (((v + v2) * 0x1F + v1) * 0x1F + this.e.hashCode()) * 961;
    }

    @Override
    public final String toString() {
        return "DeepLinkData(deepLinkType=" + this.b + ", account=" + this.c + ", deviceIdentifier=" + this.d + ", queryParameters=" + this.e + ", fragment=null, lsIdentifier=null)";
    }
}

