import j..util.function.Function.-CC;
import java.util.Map.Entry;
import java.util.function.Function;

public final class atyi implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glbh.a).v_newBuilder();
        String s = (String)((Map.Entry)object0).getKey();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glbh glbh0 = (glbh)hftp0.b_message;
        s.getClass();
        glbh0.b |= 1;
        glbh0.c = s;
        float f = (float)(((Float)((Map.Entry)object0).getValue()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glbh glbh1 = (glbh)hftp0.b_message;
        glbh1.b |= 2;
        glbh1.d = f;
        return (glbh)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

