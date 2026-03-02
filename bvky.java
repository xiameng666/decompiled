import java.util.ArrayList;
import java.util.List;

public final class bvky {
    public static final bvky a;
    public final List b;
    public final bvgp c;
    public final bvgw d;
    public final boolean e;
    public final List f;

    static {
        bvky.a = new bvky(ibps.a, bvgl.a, bvgs.a);
    }

    public bvky(List list0, bvgp bvgp0, bvgw bvgw0) {
        String s;
        boolean z = false;
        ibuq.f(list0, "tabOrder");
        ibuq.f(bvgp0, "recommendations");
        ibuq.f(bvgw0, "services");
        super();
        this.b = list0;
        this.c = bvgp0;
        this.d = bvgw0;
        if(list0.isEmpty() || list0.contains(buyj.b) && (bvgp0 instanceof bvgl) || list0.contains(buyj.c) && (bvgw0 instanceof bvgs)) {
            z = true;
        }
        this.e = z;
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            buyj buyj0 = (buyj)object0;
            switch(buyj0.ordinal()) {
                case 0: {
                    throw new IllegalArgumentException("Unexpected tab id: " + buyj0.name());
                }
                case 1: {
                    s = this.c.a();
                    arrayList0.add(s);
                    continue;
                }
                case 2: {
                    s = this.d.a();
                    arrayList0.add(s);
                    continue;
                }
                case 3: {
                    throw new IllegalArgumentException("Unexpected tab id: " + buyj0.name());
                }
            }
            throw new ibnq();
        }
        this.f = arrayList0;
    }

    public static bvky a(bvky bvky0, List list0, bvgp bvgp0, bvgw bvgw0, int v) {
        if((v & 1) != 0) {
            list0 = bvky0.b;
        }
        if((v & 2) != 0) {
            bvgp0 = bvky0.c;
        }
        if((v & 4) != 0) {
            bvgw0 = bvky0.d;
        }
        ibuq.f(list0, "tabOrder");
        ibuq.f(bvgp0, "recommendations");
        ibuq.f(bvgw0, "services");
        return new bvky(list0, bvgp0, bvgw0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvky)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bvky)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((bvky)object0).c) ? ibuq.m(this.d, ((bvky)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return (this.b.hashCode() * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "TabsUiModel(tabOrder=" + this.b + ", recommendations=" + this.c + ", services=" + this.d + ")";
    }
}

