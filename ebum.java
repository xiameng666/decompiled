import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ebum implements Function {
    public final dymo a;

    public ebum(dymo dymo0) {
        this.a = dymo0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        dykv dykv0 = ((dyhj)object0).c;
        if(dykv0 == null) {
            dykv0 = dykv.a;
        }
        dylc dylc0 = dykv0.c == null ? dylc.a : dykv0.c;
        String s = (dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c)).name();
        dykv dykv1 = ((dyhj)object0).c;
        if(dykv1 == null) {
            dykv1 = dykv.a;
        }
        dymm dymm0 = (dymm)this.a.f.get(s + (dykv1.c == null ? dylc.a : dykv1.c).d);
        if(dymm0 == null) {
            dymm0 = null;
        }
        if(dymm0 == null) {
            return (dyhj)object0;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dyhj)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dyhj)object0))));
        dykv dykv2 = ((dyhj)object0).c;
        if(dykv2 == null) {
            dykv2 = dykv.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)dykv2).jf(5, null);
        hftp1.X(((ProtoLiteMessage)dykv2));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((dykv)hftp1.b_message).f = dymm0;
        ((dykv)hftp1.b_message).b |= 8;
        dykv dykv3 = (dykv)hftp1.N_build();
        if(!((dyhi)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dyhi)hftp0))).ensureMutable();
        }
        dyhj dyhj0 = (dyhj)((dyhi)hftp0).b_message;
        dykv3.getClass();
        dyhj0.c = dykv3;
        dyhj0.b |= 1;
        return (dyhj)((ProtoLiteBuilder)(((dyhi)hftp0))).N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

