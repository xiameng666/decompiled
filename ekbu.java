import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ekbu implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdla.a).v_newBuilder();
        String s = ((ekbw)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gdla)hftv0).b |= 8;
        ((gdla)hftv0).e = s;
        String s1 = ((ekbw)object0).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdla gdla0 = (gdla)hftp0.b_message;
        s1.getClass();
        gdla0.b |= 2;
        gdla0.d = s1;
        ProtoLiteBuilder hftp1 = ekdm.a(((ekbw)object0).b.h(), false);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdla gdla1 = (gdla)hftp0.b_message;
        gdmt gdmt0 = (gdmt)hftp1.N_build();
        gdmt0.getClass();
        gdla1.c = gdmt0;
        gdla1.b |= 1;
        return (gdla)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

