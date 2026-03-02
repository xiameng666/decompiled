import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dxza implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtyt.a).v_newBuilder();
        String s = ((dmpw)object0).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gtyt)hftv0).b = s;
        String s1 = ((dmpw)object0).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtyt gtyt0 = (gtyt)hftp0.b_message;
        s1.getClass();
        gtyt0.c = s1;
        return (gtyt)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

