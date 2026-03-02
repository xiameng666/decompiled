import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dtte implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtvq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((String)object0).getClass();
        ((gtvq)hftv0).b |= 1;
        ((gtvq)hftv0).c = (String)object0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtvq gtvq0 = (gtvq)hftp0.b_message;
        gtvq0.b |= 2;
        gtvq0.d = true;
        return (gtvq)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

