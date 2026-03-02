import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import j..util.stream.Collectors;
import java.util.function.Function;

public final class apvs implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aoje.a).v_newBuilder();
        int v = ((aoge)object0).c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((aoje)hftp0.b_message).b = v;
        Iterable iterable0 = (Iterable)Collection.-EL.stream(new hfuh(((aoge)object0).d, aoge.a)).map(new apvp()).collect(Collectors.toList());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aoje aoje0 = (aoje)hftp0.b_message;
        hfuf hfuf0 = aoje0.c;
        if(!hfuf0.c()) {
            aoje0.c = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, aoje0.c);
        return (aoje)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

