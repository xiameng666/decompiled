import j..util.function.Function.-CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public final class ewdz implements UnaryOperator {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ibuq.f(((ewdb)object0), "it");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ewdb)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ewdb)object0))));
        ewdd ewdd0 = ewdc.a(hftp0);
        ProtoLiteBuilder hftp1 = ewdd0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ewdb ewdb0 = (ewdb)hftp1.b_message;
        ewdb0.b |= 1;
        ewdb0.c = true;
        return ewdd0.a();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

