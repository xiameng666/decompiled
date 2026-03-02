import j..util.function.Function.-CC;
import java.util.function.Function;

public final class bcqq implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gmfk)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gmfk)object0))));
        gmfh gmfh0 = ((gmfk)hftp0.b_message).c;
        if(gmfh0 == null) {
            gmfh0 = gmfh.a;
        }
        if(bcqx.H(gmfh0)) {
            gmfh gmfh1 = ((gmfk)hftp0.b_message).c;
            if(gmfh1 == null) {
                gmfh1 = gmfh.a;
            }
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gmfh1).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gmfh1));
            if((((gmfh)((gmfg)hftp1).b_message).b & 1) != 0) {
                if(!((gmfg)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gmfg)hftp1))).ensureMutable();
                }
                gmfh gmfh2 = (gmfh)((gmfg)hftp1).b_message;
                gmfh2.b &= -2;
                gmfh2.c = gmfh.a.c;
            }
            if((((gmfh)((gmfg)hftp1).b_message).b & 2) != 0) {
                if(!((gmfg)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gmfg)hftp1))).ensureMutable();
                }
                gmfh gmfh3 = (gmfh)((gmfg)hftp1).b_message;
                gmfh3.b &= -3;
                gmfh3.d = gmfh.a.d;
            }
            if(((gmfh)((gmfg)hftp1).b_message).f.size() > 0) {
                if(!((gmfg)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gmfg)hftp1))).ensureMutable();
                }
                ((gmfh)((gmfg)hftp1).b_message).f = hfvv.a;
            }
            if((((gmfh)((gmfg)hftp1).b_message).b & 16) != 0) {
                if(!((gmfg)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gmfg)hftp1))).ensureMutable();
                }
                gmfh gmfh4 = (gmfh)((gmfg)hftp1).b_message;
                gmfh4.b &= -17;
                gmfh4.i = gmfh.a.i;
            }
            if((((gmfh)((gmfg)hftp1).b_message).b & 0x20) != 0) {
                if(!((gmfg)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gmfg)hftp1))).ensureMutable();
                }
                gmfh gmfh5 = (gmfh)((gmfg)hftp1).b_message;
                gmfh5.b &= -33;
                gmfh5.j = gmfh.a.j;
            }
            gmfh gmfh6 = (gmfh)((ProtoLiteBuilder)(((gmfg)hftp1))).N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gmfk)hftv0).c = null;
            ((gmfk)hftv0).b &= -2;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmfk gmfk0 = (gmfk)hftp0.b_message;
            gmfh6.getClass();
            gmfk0.c = gmfh6;
            gmfk0.b |= 1;
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        if((((gmfk)hftv1).b & 16) != 0) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmfk gmfk1 = (gmfk)hftp0.b_message;
            gmfk1.b &= -17;
            gmfk1.g = gmfk.a.g;
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        if((((gmfk)hftv2).b & 0x20) != 0) {
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmfk gmfk2 = (gmfk)hftp0.b_message;
            gmfk2.b &= -33;
            gmfk2.h = gmfk.a.h;
        }
        return (gmfk)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

