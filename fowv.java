import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class fowv implements Callable {
    public final fowz a;
    public final hftr b;

    public fowv(fowz fowz0, hftr hftr0) {
        this.a = fowz0;
        this.b = hftr0;
    }

    @Override
    public final Object call() {
        ibnf ibnf0 = this.a.i;
        int v = ((Long)ibnf0.get()).intValue();
        hftr hftr0 = this.b;
        switch(v) {
            case 0: 
            case 1: {
                hftr0.m(iczu.f);
                return (idck)((ProtoLiteBuilder)hftr0).N_build();
            }
            case 2: {
                hfta hfta0 = iczu.f;
                iczu iczu0 = (iczu)hftr0.k(hfta0);
                if(iczu0.c.size() != iczu0.d.size()) {
                    ((ggsc)((ggsc)((ggsc)folb.a.j()).o(1, TimeUnit.HOURS)).ar(0x4910)).R("Experimental jank data is invalid, clearing extension. Deadline count %s != Total Duration count %s.", new foqe(((long)iczu0.c.size())), new foqe(((long)iczu0.d.size())));
                    hftr0.m(hfta0);
                    return (idck)((ProtoLiteBuilder)hftr0).N_build();
                }
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)iczu0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)iczu0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hfvb hfvb0 = hfvb.a;
                ((iczu)hftp0.b_message).c = hfvb0;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((iczu)hftp0.b_message).d = hfvb0;
                for(int v1 = 0; v1 < iczu0.c.size(); ++v1) {
                    long v2 = iczu0.c.a(v1);
                    long v3 = iczu0.d.a(v1);
                    if(v3 >= v2) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        iczu iczu1 = (iczu)hftp0.b_message;
                        iczu1.b();
                        iczu1.c.g(v2);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        iczu iczu2 = (iczu)hftp0.b_message;
                        iczu2.c();
                        iczu2.d.g(v3);
                    }
                }
                hftr0.n(hfta0, ((iczu)hftp0.N_build()));
                return (idck)((ProtoLiteBuilder)hftr0).N_build();
            }
            case 3: {
                return (idck)((ProtoLiteBuilder)hftr0).N_build();
            }
            default: {
                ((ggsc)((ggsc)((ggsc)folb.a.j()).o(1, TimeUnit.HOURS)).ar(18705)).B("Unsupported experimental jank collection configuration: %s", new foqe(((long)(((Long)ibnf0.get())))));
                hftr0.m(iczu.f);
                return (idck)((ProtoLiteBuilder)hftr0).N_build();
            }
        }
    }
}

