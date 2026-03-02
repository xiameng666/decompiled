import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ekdc implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdlt.a).v_newBuilder();
        String s = ((ekdf)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gdlt)hftv0).b |= 2;
        ((gdlt)hftv0).d = s;
        String s1 = ((ekdf)object0).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdlt gdlt0 = (gdlt)hftp0.b_message;
        s1.getClass();
        gdlt0.b |= 4;
        gdlt0.e = s1;
        ProtoLiteBuilder hftp1 = ekdm.a(((ekdf)object0).b.h(), false);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdlt gdlt1 = (gdlt)hftp0.b_message;
        gdmt gdmt0 = (gdmt)hftp1.N_build();
        gdmt0.getClass();
        gdlt1.c = gdmt0;
        gdlt1.b |= 1;
        return (gdlt)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

