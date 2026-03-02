import j..util.DesugarCollections;
import j..util.Objects;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public final class ibbo {
    static final iakp a;
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final ibev f;
    final iayi g;

    static {
        ibbo.a = new iakp("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    }

    public ibbo(Map map0, boolean z, int v, int v1) {
        iayi iayi0;
        ibev ibev0;
        this.b = iazm.d(map0, "timeout");
        this.c = iazm.a(map0, "waitForReady");
        Integer integer0 = iazm.c(map0, "maxResponseMessageBytes");
        this.d = integer0;
        if(integer0 != null) {
            gftb.f(((int)integer0) >= 0, "maxInboundMessageSize %s exceeds bounds", integer0);
        }
        Integer integer1 = iazm.c(map0, "maxRequestMessageBytes");
        this.e = integer1;
        if(integer1 != null) {
            gftb.f(((int)integer1) >= 0, "maxOutboundMessageSize %s exceeds bounds", integer1);
        }
        Map map1 = z ? iazm.i(map0, "retryPolicy") : null;
        if(map1 == null) {
            ibev0 = null;
        }
        else {
            Integer integer2 = iazm.c(map1, "maxAttempts");
            gftb.z(integer2, "maxAttempts cannot be empty");
            int v2 = (int)integer2;
            gftb.d(v2 >= 2, "maxAttempts must be greater than 1: %s", v2);
            Long long0 = iazm.d(map1, "initialBackoff");
            gftb.z(long0, "initialBackoff cannot be empty");
            long v3 = (long)long0;
            gftb.e(v3 > 0L, "initialBackoffNanos must be greater than 0: %s", v3);
            Long long1 = iazm.d(map1, "maxBackoff");
            gftb.z(long1, "maxBackoff cannot be empty");
            long v4 = (long)long1;
            gftb.e(v4 > 0L, "maxBackoff must be greater than 0: %s", v4);
            Double double0 = iazm.b(map1, "backoffMultiplier");
            gftb.z(double0, "backoffMultiplier cannot be empty");
            double f = (double)double0;
            gftb.f(f > 0.0, "backoffMultiplier must be greater than 0: %s", double0);
            Long long2 = iazm.d(map1, "perAttemptRecvTimeout");
            gftb.f(long2 == null || ((long)long2) >= 0L, "perAttemptRecvTimeout cannot be negative: %s", long2);
            Set set0 = ibfh.a(map1, "retryableStatusCodes");
            gfuy.b(set0 != null, "%s is required in retry policy", "retryableStatusCodes");
            gfuy.b(((boolean)(set0.contains(iaph.a) ^ 1)), "%s must not contain OK", "retryableStatusCodes");
            gftb.b(long2 != null || !set0.isEmpty(), "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            ibev0 = new ibev(Math.min(v2, v), v3, v4, f, long2, set0);
        }
        this.f = ibev0;
        Map map2 = z ? iazm.i(map0, "hedgingPolicy") : null;
        if(map2 == null) {
            iayi0 = null;
        }
        else {
            Integer integer3 = iazm.c(map2, "maxAttempts");
            gftb.z(integer3, "maxAttempts cannot be empty");
            int v5 = (int)integer3;
            gftb.d(v5 >= 2, "maxAttempts must be greater than 1: %s", v5);
            int v6 = Math.min(v5, v1);
            Long long3 = iazm.d(map2, "hedgingDelay");
            gftb.z(long3, "hedgingDelay cannot be empty");
            long v7 = (long)long3;
            gftb.e(v7 >= 0L, "hedgingDelay must not be negative: %s", v7);
            Set set1 = ibfh.a(map2, "nonFatalStatusCodes");
            if(set1 == null) {
                set1 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(iaph.class));
            }
            else {
                gfuy.b(((boolean)(set1.contains(iaph.a) ^ 1)), "%s must not contain OK", "nonFatalStatusCodes");
            }
            iayi0 = new iayi(v6, v7, set1);
        }
        this.g = iayi0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ibbo) ? Objects.equals(this.b, ((ibbo)object0).b) && Objects.equals(this.c, ((ibbo)object0).c) && Objects.equals(this.d, ((ibbo)object0).d) && Objects.equals(this.e, ((ibbo)object0).e) && Objects.equals(this.f, ((ibbo)object0).f) && Objects.equals(this.g, ((ibbo)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("timeoutNanos", this.b);
        gfsv0.add("waitForReady", this.c);
        gfsv0.add("maxInboundMessageSize", this.d);
        gfsv0.add("maxOutboundMessageSize", this.e);
        gfsv0.add("retryPolicy", this.f);
        gfsv0.add("hedgingPolicy", this.g);
        return gfsv0.toString();
    }
}

