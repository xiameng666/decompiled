import j..util.function.Function.-CC;
import java.util.function.Function;

public final class cclb implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfnp.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfng.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfng hfng0 = (hfng)hftp1.b_message;
        ((String)object0).getClass();
        hfng0.b |= 2;
        hfng0.c = (String)object0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfnp hfnp0 = (hfnp)hftp0.b_message;
        hfng hfng1 = (hfng)hftp1.N_build();
        hfng1.getClass();
        hfnp0.c = hfng1;
        hfnp0.b |= 1;
        return (hfnp)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

