import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eoih implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grgs.a).v_newBuilder();
        gzgh gzgh0 = gzgh.b(((emju)object0).c);
        if(gzgh0 == null) {
            gzgh0 = gzgh.a;
        }
        grgm grgm0 = grgm.b(gzgh0.au);
        gftb.check(grgm0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((grgs)hftv0).c = grgm0.ao;
        ((grgs)hftv0).b |= 1;
        int v = ((emju)object0).d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        grgs grgs0 = (grgs)hftp0.b_message;
        grgs0.b |= 2;
        grgs0.d = v;
        Iterable iterable0 = (Iterable)Collection.-EL.stream(((emju)object0).e).map(new eoin()).collect(ggaf.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grgs grgs1 = (grgs)hftp0.b_message;
        hfuo hfuo0 = grgs1.e;
        if(!hfuo0.c()) {
            grgs1.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, grgs1.e);
        return (grgs)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

