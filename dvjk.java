import j..util.function.Function.-CC;
import java.util.Map.Entry;
import java.util.function.Function;

public final class dvjk implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ((Map.Entry)object0).getKey();
        ((Map.Entry)object0).getValue();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvec.a).v_newBuilder();
        String s = (String)((Map.Entry)object0).getKey();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvec gvec0 = (gvec)hftp0.b_message;
        s.getClass();
        gvec0.b = s;
        long v = (long)(((Long)((Map.Entry)object0).getValue()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvec)hftp0.b_message).c = v;
        return (gvec)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

