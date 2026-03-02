import java.util.List;

public final class devp {
    public final dfhr a;
    public final deyv b;
    public final deco c;
    public final dfgj d;
    public final dfgh e;
    public final List f;
    private final String g;

    public devp() {
        this(null, null, 0x7F);
    }

    public devp(deco deco0, dfgh dfgh0, int v) {
        dfhr dfhr0 = (v & 1) == 0 ? null : new dfhr(null);
        deyo deyo0 = (v & 2) == 0 ? null : deyo.a;
        if((v & 4) != 0) {
            deco0 = deco.a;
        }
        dfgj dfgj0 = (v & 8) == 0 ? null : new dfgj(null);
        if((v & 16) != 0) {
            dfgh0 = new dfgh(null, false, 15);
        }
        this(dfhr0, deyo0, deco0, dfgj0, dfgh0, ibps.a);
    }

    public devp(dfhr dfhr0, deyv deyv0, deco deco0, dfgj dfgj0, dfgh dfgh0, List list0) {
        ibuq.f(dfhr0, "userInfo");
        ibuq.f(deyv0, "status");
        ibuq.f(deco0, "activeSurface");
        ibuq.f(dfgj0, "sendSurface");
        ibuq.f(dfgh0, "receiveSurface");
        ibuq.f(list0, "attachments");
        super();
        this.a = dfhr0;
        this.b = deyv0;
        this.c = deco0;
        this.d = dfgj0;
        this.e = dfgh0;
        this.g = null;
        this.f = list0;
    }

    public static devp a(devp devp0, dfhr dfhr0, deyv deyv0, deco deco0, dfgj dfgj0, dfgh dfgh0, List list0, int v) {
        if((v & 1) != 0) {
            dfhr0 = devp0.a;
        }
        if((v & 2) != 0) {
            deyv0 = devp0.b;
        }
        if((v & 4) != 0) {
            deco0 = devp0.c;
        }
        if((v & 8) != 0) {
            dfgj0 = devp0.d;
        }
        if((v & 16) != 0) {
            dfgh0 = devp0.e;
        }
        if((v & 0x40) != 0) {
            list0 = devp0.f;
        }
        ibuq.f(dfhr0, "userInfo");
        ibuq.f(deyv0, "status");
        ibuq.f(deco0, "activeSurface");
        ibuq.f(dfgj0, "sendSurface");
        ibuq.f(dfgh0, "receiveSurface");
        ibuq.f(list0, "attachments");
        return new devp(dfhr0, deyv0, deco0, dfgj0, dfgh0, list0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof devp)) {
            return false;
        }
        if(!ibuq.m(this.a, ((devp)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((devp)object0).b)) {
            return false;
        }
        if(this.c != ((devp)object0).c) {
            return false;
        }
        if(!ibuq.m(this.d, ((devp)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((devp)object0).e)) {
            return false;
        }
        return ibuq.m(null, null) ? ibuq.m(this.f, ((devp)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 961 + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "HomeState(userInfo=" + this.a + ", status=" + this.b + ", activeSurface=" + this.c + ", sendSurface=" + this.d + ", receiveSurface=" + this.e + ", debugInfo=null, attachments=" + this.f + ")";
    }
}

