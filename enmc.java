import j..time.Duration;
import j..time.Instant;
import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class enmc implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gged_interceptors gged0 = ((enmq)object0).a;
        gftb.b(Collection.-EL.stream(gged0).allMatch(new enmd()) && Collection.-EL.stream(gged0).allMatch(new enlp()), enmk.h);
        gged_interceptors gged1 = ((enmq)object0).b;
        gftb.b(Collection.-EL.stream(gged1).allMatch(new enmd()) && Collection.-EL.stream(gged1).allMatch(new enma()), enmk.i);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzkp.a).v_newBuilder();
        if(gged0.size() == 1 && gged1.size() == 1) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzkn.a).v_newBuilder();
            enml enml0 = (enml)gged0.get(0);
            enml enml1 = (enml)gged1.get(0);
            if(enmv.k(((Instant)enml0.b.q()), ((Instant)enml1.b.q()), Duration.ofMinutes(10L)) && enmv.k(((Instant)enml0.b.r()), ((Instant)enml1.b.r()), Duration.ofMinutes(10L))) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzkn gzkn0 = (gzkn)hftp1.b_message;
                gzkn0.b |= 1;
                gzkn0.c = true;
            }
            long v = enml1.a.c().a;
            gged_interceptors gged2 = enml0.a.e().a;
            if(Collection.-EL.stream(gged2.b(0, 1)).anyMatch(new enmf(v))) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzkn gzkn1 = (gzkn)hftp1.b_message;
                gzkn1.b |= 2;
                gzkn1.d = true;
            }
            enmg enmg0 = new enmg(v);
            if(Collection.-EL.stream(gged2.b(0, Math.min(10, ((ggna)gged2).c))).anyMatch(enmg0)) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gzkn gzkn2 = (gzkn)hftp1.b_message;
                gzkn2.b |= 4;
                gzkn2.e = true;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzkp gzkp0 = (gzkp)hftp0.b_message;
            gzkn gzkn3 = (gzkn)hftp1.N_build();
            gzkn3.getClass();
            gzkp0.c = gzkn3;
            gzkp0.b = 1;
            return (gzkp)hftp0.N_build();
        }
        if(gged1.isEmpty()) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzkk.a).v_newBuilder();
            int v1 = gged0.size();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gzkk gzkk0 = (gzkk)hftp2.b_message;
            gzkk0.b |= 1;
            gzkk0.c = v1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzkp gzkp1 = (gzkp)hftp0.b_message;
            gzkk gzkk1 = (gzkk)hftp2.N_build();
            gzkk1.getClass();
            gzkp1.c = gzkk1;
            gzkp1.b = 2;
            return (gzkp)hftp0.N_build();
        }
        if(gged0.isEmpty()) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gzkj.a).v_newBuilder();
            int v2 = gged1.size();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gzkj gzkj0 = (gzkj)hftp3.b_message;
            gzkj0.b |= 1;
            gzkj0.c = v2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzkp gzkp2 = (gzkp)hftp0.b_message;
            gzkj gzkj1 = (gzkj)hftp3.N_build();
            gzkj1.getClass();
            gzkp2.c = gzkj1;
            gzkp2.b = 3;
            return (gzkp)hftp0.N_build();
        }
        if(gged0.size() > 1 && gged1.size() == 1) {
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gzkl.a).v_newBuilder();
            int v3 = gged0.size();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gzkl gzkl0 = (gzkl)hftp4.b_message;
            gzkl0.b |= 1;
            gzkl0.c = v3;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzkp gzkp3 = (gzkp)hftp0.b_message;
            gzkl gzkl1 = (gzkl)hftp4.N_build();
            gzkl1.getClass();
            gzkp3.c = gzkl1;
            gzkp3.b = 4;
            return (gzkp)hftp0.N_build();
        }
        if(gged0.size() == 1 && gged1.size() > 1) {
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gzkm.a).v_newBuilder();
            int v4 = gged1.size();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gzkm gzkm0 = (gzkm)hftp5.b_message;
            gzkm0.b |= 1;
            gzkm0.c = v4;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzkp gzkp4 = (gzkp)hftp0.b_message;
            gzkm gzkm1 = (gzkm)hftp5.N_build();
            gzkm1.getClass();
            gzkp4.c = gzkm1;
            gzkp4.b = 5;
            return (gzkp)hftp0.N_build();
        }
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gzko.a).v_newBuilder();
        int v5 = gged0.size();
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        gzko gzko0 = (gzko)hftp6.b_message;
        gzko0.b |= 1;
        gzko0.c = v5;
        int v6 = gged1.size();
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        gzko gzko1 = (gzko)hftp6.b_message;
        gzko1.b |= 2;
        gzko1.d = v6;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzkp gzkp5 = (gzkp)hftp0.b_message;
        gzko gzko2 = (gzko)hftp6.N_build();
        gzko2.getClass();
        gzkp5.c = gzko2;
        gzkp5.b = 6;
        return (gzkp)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

