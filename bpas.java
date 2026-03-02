import j..util.function.Function.-CC;
import java.util.function.Function;

public final class bpas implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsyz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsyz gsyz0 = (gsyz)hftp0.b_message;
        ((String)object0).getClass();
        gsyz0.b = (String)object0;
        return (gsyz)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

