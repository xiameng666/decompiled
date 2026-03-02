import j..util.Optional;
import java.util.concurrent.TimeUnit;

final class ebwg {
    public final gtni a;
    public final gged_interceptors b;
    public final Optional c;
    public final int d;

    public ebwg(gtni gtni0, int v, gged_interceptors gged0, Optional optional0) {
        this.a = gtni0;
        this.d = v;
        this.b = gged0;
        this.c = optional0;
    }

    final hali a(int v) {
        return this.b(v, Optional.empty());
    }

    final hali b(int v, Optional optional0) {
        Optional optional1 = optional0.isPresent() ? ((fsim)optional0.get()).a.n() : Optional.empty();
        halh halh0 = (halh)((ProtoLiteMessage)hali.a).v_newBuilder();
        gtni gtni0 = this.a;
        if(!halh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)halh0).ensureMutable();
        }
        hali hali0 = (hali)halh0.b_message;
        hali0.c = gtni0.a();
        int v1 = this.d;
        if(!halh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)halh0).ensureMutable();
        }
        hali hali1 = (hali)halh0.b_message;
        hali1.d = halg.a(v1);
        if(!halh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)halh0).ensureMutable();
        }
        ((hali)halh0.b_message).e = 2;
        if(!halh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)halh0).ensureMutable();
        }
        ((hali)halh0.b_message).f = v - 2;
        dynd dynd0 = (dynd)optional1.orElse(dynd.a);
        if(!halh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)halh0).ensureMutable();
        }
        hali hali2 = (hali)halh0.b_message;
        hali2.g = dynd0.a();
        halh0.a(this.b);
        Optional optional2 = this.c;
        if(optional2.isPresent()) {
            long v2 = ((gfug)optional2.get()).a(TimeUnit.MILLISECONDS);
            if(!halh0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)halh0).ensureMutable();
            }
            hali hali3 = (hali)halh0.b_message;
            hali3.b |= 1;
            hali3.h = v2;
        }
        return (hali)((ProtoLiteBuilder)halh0).N_build();
    }
}

