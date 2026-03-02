import android.util.Pair;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class amlg implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ammb.a).v_newBuilder();
        if(((Pair)object0).first != null) {
            String s = (String)((Pair)object0).first;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ammb ammb0 = (ammb)hftp0.b_message;
            s.getClass();
            ammb0.b = s;
        }
        if(((Pair)object0).second != null) {
            String s1 = (String)((Pair)object0).second;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ammb ammb1 = (ammb)hftp0.b_message;
            s1.getClass();
            ammb1.c = s1;
        }
        return (ammb)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

