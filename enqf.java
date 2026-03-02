import j..util.function.Function.-CC;
import java.util.function.Function;

public final class enqf implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)igri.a).v_newBuilder();
        igrm igrm0 = (igrm)((ProtoLiteBuilder)(((igrk)object0))).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        igri igri0 = (igri)hftp0.b_message;
        igrm0.getClass();
        igri0.c = igrm0;
        igri0.b |= 1;
        return (igri)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

