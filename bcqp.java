import j..util.Collection.-EL;
import j..util.DesugarCollections;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class bcqp implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gmeh)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gmeh)object0))));
        if(((gmeh)((gmeg)hftp0).b_message).j.size() > 0) {
            if(!((gmeg)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gmeg)hftp0))).ensureMutable();
            }
            ((gmeh)((gmeg)hftp0).b_message).j = hfvv.a;
        }
        gmfd gmfd0 = ((gmeh)((gmeg)hftp0).b_message).f;
        if(gmfd0 == null) {
            gmfd0 = gmfd.a;
        }
        if(bcqx.G(gmfd0)) {
            gmfd gmfd1 = ((gmeh)((gmeg)hftp0).b_message).f;
            if(gmfd1 == null) {
                gmfd1 = gmfd.a;
            }
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gmfd1).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gmfd1));
            if(bcqx.I(DesugarCollections.unmodifiableList(((gmfd)((gmfc)hftp1).b_message).e))) {
                gged_interceptors gged0 = (gged_interceptors)Collection.-EL.stream(DesugarCollections.unmodifiableList(((gmfd)((gmfc)hftp1).b_message).e)).map(new bcqq()).collect(ggaf.a);
                if(!((gmfc)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gmfc)hftp1))).ensureMutable();
                }
                ((gmfd)((gmfc)hftp1).b_message).e = hfvv.a;
                if(!((gmfc)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gmfc)hftp1))).ensureMutable();
                }
                gmfd gmfd2 = (gmfd)((gmfc)hftp1).b_message;
                gmfd2.b();
                hfrj.E(gged0, gmfd2.e);
            }
            gmfd gmfd3 = (gmfd)((ProtoLiteBuilder)(((gmfc)hftp1))).N_build();
            if(!((gmeg)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gmeg)hftp0))).ensureMutable();
            }
            ((gmeh)((gmeg)hftp0).b_message).f = null;
            ((gmeh)((gmeg)hftp0).b_message).b &= -9;
            if(!((gmeg)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gmeg)hftp0))).ensureMutable();
            }
            gmeh gmeh0 = (gmeh)((gmeg)hftp0).b_message;
            gmfd3.getClass();
            gmeh0.f = gmfd3;
            gmeh0.b |= 8;
        }
        return (gmeh)((ProtoLiteBuilder)(((gmeg)hftp0))).N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

