import j..util.function.Function.-CC;
import java.util.function.Function;

public final class enzf implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        int v = gzpj.b(((gzpk)object0).e);
        if(v == 0) {
            v = 1;
        }
        int v1 = enyv.a(v - 1) == 0 ? 1 : enyv.a(v - 1);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)enyw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((enyw)hftp0.b_message).d = v1 - 1;
        ((enyw)hftp0.b_message).b |= 2;
        hguv hguv0 = ((gzpk)object0).d;
        if(hguv0 == null) {
            hguv0 = hguv.a;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        enyw enyw0 = (enyw)hftp0.b_message;
        hguv0.getClass();
        enyw0.c = hguv0;
        enyw0.b |= 1;
        return (enyw)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

