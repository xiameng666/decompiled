import j..util.Optional;
import java.util.concurrent.TimeUnit;

public final class ebwi implements gful_cronetEngineProvider {
    public final ebwl a;
    public final gtni b;
    public final gged_interceptors c;
    public final int d;

    public ebwi(ebwl ebwl0, gtni gtni0, int v, gged_interceptors gged0) {
        this.a = ebwl0;
        this.b = gtni0;
        this.d = v;
        this.c = gged0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ebwg ebwg0 = this.a.a(this.b, this.d, this.c);
        halh halh0 = (halh)((ProtoLiteMessage)hali.a).v_newBuilder();
        gtni gtni0 = ebwg0.a;
        if(!halh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)halh0).ensureMutable();
        }
        hali hali0 = (hali)halh0.b_message;
        hali0.c = gtni0.a();
        int v = ebwg0.d;
        if(!halh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)halh0).ensureMutable();
        }
        hali hali1 = (hali)halh0.b_message;
        hali1.d = halg.a(v);
        if(!halh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)halh0).ensureMutable();
        }
        ((hali)halh0.b_message).e = 1;
        halh0.a(ebwg0.b);
        Optional optional0 = ebwg0.c;
        if(optional0.isPresent()) {
            long v1 = ((gfug)optional0.get()).a(TimeUnit.MILLISECONDS);
            if(!halh0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)halh0).ensureMutable();
            }
            hali hali2 = (hali)halh0.b_message;
            hali2.b |= 1;
            hali2.h = v1;
        }
        return (hali)((ProtoLiteBuilder)halh0).N_build();
    }
}

