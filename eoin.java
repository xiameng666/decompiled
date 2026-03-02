import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eoin implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grgr.a).v_newBuilder();
        long v = (long)(((Long)object0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grgr grgr0 = (grgr)hftp0.b_message;
        grgr0.b |= 1;
        grgr0.c = v;
        return (grgr)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

