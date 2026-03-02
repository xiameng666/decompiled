import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ekdv implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdmy.a).v_newBuilder();
        String s = ((ekdy)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gdmy)hftv0).b |= 2;
        ((gdmy)hftv0).d = s;
        String s1 = ((ekdy)object0).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdmy gdmy0 = (gdmy)hftp0.b_message;
        s1.getClass();
        gdmy0.b |= 4;
        gdmy0.e = s1;
        ProtoLiteBuilder hftp1 = ekdm.a(((ekdy)object0).b.h(), false);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdmy gdmy1 = (gdmy)hftp0.b_message;
        gdmt gdmt0 = (gdmt)hftp1.N_build();
        gdmt0.getClass();
        gdmy1.c = gdmt0;
        gdmy1.b |= 1;
        return (gdmy)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

