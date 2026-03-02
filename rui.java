import android.content.Context;
import android.os.PersistableBundle;
import java.util.List;

@rja(a = "DescriptiveTaskMetadata")
public final class rui implements rnt {
    public static final ruh a;
    private final sei b;
    private final sei c;
    private final seg d;
    private final List e;

    static {
        rui.a = new ruh();
    }

    public rui() {
        this(null, null, null, null, 15);
    }

    public rui(sei sei0, sei sei1, seg seg0, List list0) {
        ibuq.f(list0, "childDescriptiveTaskMetadata");
        super();
        this.b = sei0;
        this.c = sei1;
        this.d = seg0;
        this.e = list0;
    }

    public rui(sei sei0, sei sei1, seg seg0, List list0, int v) {
        if((v & 8) != 0) {
            list0 = ibps.a;
        }
        if((v & 4) != 0) {
            seg0 = null;
        }
        if((v & 2) != 0) {
            sei1 = null;
        }
        if(1 == (v & 1)) {
            sei0 = null;
        }
        this(sei0, sei1, seg0, list0);
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        sei sei0 = this.b;
        if(sei0 != null) {
            sdn.b(persistableBundle0, "header", sei0);
        }
        sei sei1 = this.c;
        if(sei1 != null) {
            sdn.b(persistableBundle0, "description", sei1);
        }
        seg seg0 = this.d;
        if(seg0 != null) {
            sdn.b(persistableBundle0, "icon", seg0);
        }
        List list0 = this.e;
        int v = list0.size();
        persistableBundle0.putInt("numOfChildren", v);
        for(int v1 = 0; v1 < v; ++v1) {
            sdn.b(persistableBundle0, "childMetadata_" + v1, ((scz)list0.get(v1)));
        }
        return persistableBundle0;
    }

    @Override  // rnt
    public final String b(Context context0) {
        if(context0 == null) {
            return rns.a(this);
        }
        String s = null;
        String s1 = this.b == null ? null : this.b.b(context0);
        sei sei0 = this.c;
        if(sei0 != null) {
            s = sei0.b(context0);
        }
        rug rug0 = new rug(context0);
        String s2 = ibpo.aK(this.e, ", ", null, null, rug0, 30);
        return "DescriptiveTaskMetadata{header=" + s1 + ", description=" + s + ", icon=" + this.d + ", childDescriptiveTaskMetadata=[" + s2 + "]}";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rui)) {
            return false;
        }
        if(!ibuq.m(this.b, ((rui)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((rui)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((rui)object0).d) ? ibuq.m(this.e, ((rui)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        int v2 = this.c == null ? 0 : this.c.hashCode();
        seg seg0 = this.d;
        if(seg0 != null) {
            v = seg0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F + this.e.hashCode();
    }

    @Override  // rnt
    public final String toString() {
        return "DescriptiveTaskMetadata(header=" + this.b + ", description=" + this.c + ", icon=" + this.d + ", childDescriptiveTaskMetadata=" + this.e + ")";
    }
}

