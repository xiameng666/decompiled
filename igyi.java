import java.util.List;

public final class igyi extends igym {
    private final igym a;

    public igyi(igym igym0) {
        ibuq.f(igym0, "back");
        super();
        this.a = igym0;
    }

    @Override  // igym
    public final List a() {
        return ibpo.b(this.a);
    }

    @Override  // igym
    public final igym c(List list0) {
        ibuq.f(list0, "args");
        return new igyi(((igym)fssm.g(((fsvb)list0.get(0)), igym.b)));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igyi) ? ibuq.m(this.a, ((igyi)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "PixPromoTermsAndConditions(back=" + this.a + ")";
    }
}

