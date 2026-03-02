import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dzdr implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gutb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gutb gutb0 = (gutb)hftp0.b_message;
        ((gusx)object0).getClass();
        gutb0.c = (gusx)object0;
        gutb0.b = 1;
        return (gutb)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

