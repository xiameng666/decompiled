import j..util.function.Function.-CC;
import java.util.function.Function;

public final class amzp implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)andq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((andq)hftp0.b_message).c = 10;
        if(((amxy)object0).k) {
            amzr.h(hftp0, ((amxy)object0));
        }
        return (andq)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

