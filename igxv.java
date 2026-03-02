import java.util.List;

public final class igxv extends igyc {
    public final int a;
    public final gjce b;
    public static final int c;

    public igxv(int v, gjce gjce0) {
        this.a = v;
        this.b = gjce0;
    }

    @Override  // igyc
    public final List a() {
        return ibpo.g(new fsry[]{new fssj(((int)this.a)), new fssc((this.b == null ? null : this.b.getDefaultInstanceForType()))});
    }

    @Override  // igyc
    public final igyc c(List list0) {
        ibuq.f(list0, "args");
        int v = 0;
        fsvb fsvb0 = (fsvb)list0.get(0);
        if(fsvb0.b == 2) {
            v = (int)(((Integer)fsvb0.c));
        }
        return new igxv(v, ((gjce)fssm.h(((fsvb)list0.get(1)), new igxu())));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof igxv)) {
            return false;
        }
        return this.a == ((igxv)object0).a ? ibuq.m(this.b, ((igxv)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        gjce gjce0 = this.b;
        if(gjce0 == null) {
            return this.a * 0x1F;
        }
        if(((ProtoLiteMessage)gjce0).isImmutable()) {
            int v = ((ProtoLiteMessage)gjce0).s();
            return this.a * 0x1F + v;
        }
        int v1 = gjce0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)gjce0).s();
            gjce0.memoizedHashCode = v1;
        }
        return this.a * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "LogVeInteraction(veId=" + this.a + ", metadata=" + this.b + ")";
    }
}

