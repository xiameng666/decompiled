import java.util.List;

public final class igyh extends igym {
    public static final int a;
    private final igym d;
    private final int e;
    private final ByteString f;
    private final fsvl g;

    public igyh() {
        this(0, null, 15);
    }

    public igyh(int v, ByteString hfsf0, int v1) {
        igyf igyf0 = (v1 & 1) == 0 ? null : igyf.a;
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            hfsf0 = null;
        }
        ibuq.f(igyf0, "back");
        super();
        this.d = igyf0;
        this.e = v;
        this.f = hfsf0;
        this.g = null;
    }

    @Override  // igym
    public final List a() {
        return ibpo.g(new fsry[]{new fssj(((int)this.e)), new fssc(this.f)});
    }

    @Override  // igym
    public final igym c(List list0) {
        ibuq.f(list0, "args");
        int v = 0;
        fsvb fsvb0 = (fsvb)list0.get(0);
        if(fsvb0.b == 2) {
            v = (int)(((Integer)fsvb0.c));
        }
        igyg igyg0 = new igyg();
        ibuq.f(list0, "<this>");
        return list0.size() <= 1 ? new igyh(v, null, 9) : new igyh(v, ((ByteString)fssm.h(((fsvb)list0.get(1)), igyg0)), 9);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof igyh)) {
            return false;
        }
        if(!ibuq.m(this.d, ((igyh)object0).d)) {
            return false;
        }
        if(this.e != ((igyh)object0).e) {
            return false;
        }
        return ibuq.m(this.f, ((igyh)object0).f) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return this.f == null ? (this.e + 0x6BE37D0) * 0x1F * 0x1F : ((this.e + 0x6BE37D0) * 0x1F + this.f.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "PixPromoPage(back=" + this.d + ", tosState=" + this.e + ", auditToken=" + this.f + ", auditTokenRef=null)";
    }
}

