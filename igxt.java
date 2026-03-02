import java.util.List;

public final class igxt extends igyc {
    public final int a;
    public final Integer b;
    public final gjdw c;
    public static final int d;

    public igxt(int v, Integer integer0, gjdw gjdw0) {
        this.a = v;
        this.b = integer0;
        this.c = gjdw0;
    }

    @Override  // igyc
    public final List a() {
        return ibpo.g(new fsry[]{new fssj(((int)this.a)), new fssj(this.b), new fssc((this.c == null ? null : this.c.getDefaultInstanceForType()))});
    }

    @Override  // igyc
    public final igyc c(List list0) {
        ibuq.f(list0, "args");
        int v = 0;
        fsvb fsvb0 = (fsvb)list0.get(0);
        if(fsvb0.b == 2) {
            v = (int)(((Integer)fsvb0.c));
        }
        return new igxt(v, ((Integer)fssm.h(((fsvb)list0.get(1)), new igxr())), ((gjdw)fssm.h(((fsvb)list0.get(2)), new igxs())));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof igxt)) {
            return false;
        }
        if(this.a != ((igxt)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((igxt)object0).b) ? ibuq.m(this.c, ((igxt)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        int v2 = this.a;
        gjdw gjdw0 = this.c;
        if(gjdw0 != null) {
            if(((ProtoLiteMessage)gjdw0).isImmutable()) {
                return (v2 * 0x1F + v1) * 0x1F + ((ProtoLiteMessage)gjdw0).s();
            }
            v = gjdw0.memoizedHashCode;
            if(v == 0) {
                v = ((ProtoLiteMessage)gjdw0).s();
                gjdw0.memoizedHashCode = v;
            }
        }
        return (v2 * 0x1F + v1) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "LogVeImpression(veId=" + this.a + ", parentVeId=" + this.b + ", metadata=" + this.c + ")";
    }
}

