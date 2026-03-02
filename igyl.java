import java.util.List;

public final class igyl extends igym {
    private final igym a;
    private final long d;
    private final String e;

    public igyl() {
        this(null);
    }

    public igyl(igym igym0, long v, String s) {
        ibuq.f(igym0, "back");
        ibuq.f(s, "clientTokenId");
        super();
        this.a = igym0;
        this.d = v;
        this.e = s;
    }

    public igyl(byte[] arr_b) {
        this(igyf.a, 0L, "");
    }

    @Override  // igym
    public final List a() {
        return ibpo.g(new fsry[]{this.a, fssm.c(this.d), new fssr(this.e)});
    }

    @Override  // igym
    public final igym c(List list0) {
        ibuq.f(list0, "args");
        igym igym0 = (igym)fssm.g(((fsvb)list0.get(0)), igym.b);
        fsvb fsvb0 = (fsvb)list0.get(1);
        long v = fsvb0.b == 3 ? ((long)(((Long)fsvb0.c))) : 0L;
        fsvb fsvb1 = (fsvb)list0.get(2);
        String s = fsvb1.b == 5 ? ((String)fsvb1.c) : "";
        ibuq.e(s, "getString(...)");
        return new igyl(igym0, v, s);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof igyl)) {
            return false;
        }
        if(!ibuq.m(this.a, ((igyl)object0).a)) {
            return false;
        }
        return this.d == ((igyl)object0).d ? ibuq.m(this.e, ((igyl)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "WearPaymentCardDetailsPage(back=" + this.a + ", wearAndroidId=" + this.d + ", clientTokenId=" + this.e + ")";
    }
}

