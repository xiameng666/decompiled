import android.accounts.Account;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fcms implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexs.a).v_newBuilder();
        String s = ((Account)object0).name;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fexs fexs0 = (fexs)hftp0.b_message;
        s.getClass();
        fexs0.b |= 1;
        fexs0.c = s;
        return (fexs)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

