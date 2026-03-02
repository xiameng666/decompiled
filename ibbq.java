import j..util.DesugarCollections;
import j..util.Objects;
import java.util.HashMap;
import java.util.Map;

public final class ibbq {
    public final ibet a;
    public final Object b;
    public final Map c;
    private final ibbo d;
    private final Map e;
    private final Map f;

    public ibbq(ibbo ibbo0, Map map0, Map map1, ibet ibet0, Object object0, Map map2) {
        this.d = ibbo0;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map0));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map1));
        this.a = ibet0;
        this.b = object0;
        this.c = map2 == null ? null : DesugarCollections.unmodifiableMap(new HashMap(map2));
    }

    final iami a() {
        return this.f.isEmpty() && this.e.isEmpty() && this.d == null ? null : new ibbp(this);
    }

    final ibbo b(gRPCMethodDescriptor iaoj0) {
        ibbo ibbo0 = (ibbo)this.e.get(iaoj0.fullMethodName_);
        if(ibbo0 == null) {
            ibbo0 = (ibbo)this.f.get(iaoj0.serviceName_);
        }
        return ibbo0 == null ? this.d : ibbo0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && Objects.equals(this.d, ((ibbq)object0).d) && Objects.equals(this.e, ((ibbq)object0).e) && Objects.equals(this.f, ((ibbq)object0).f) && Objects.equals(this.a, ((ibbq)object0).a) && Objects.equals(this.b, ((ibbq)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("defaultMethodConfig", this.d);
        gfsv0.add("serviceMethodMap", this.e);
        gfsv0.add("serviceMap", this.f);
        gfsv0.add("retryThrottling", this.a);
        gfsv0.add("loadBalancingConfig", this.b);
        return gfsv0.toString();
    }
}

