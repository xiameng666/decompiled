import com.google.android.gms.constellation.PhoneNumberVerification;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class cqpa implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgzc.a).v_newBuilder();
        int v = ((PhoneNumberVerification)object0).g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgzc hgzc0 = (hgzc)hftp0.b_message;
        hgzc0.b = 2;
        hgzc0.c = v;
        return (hgzc)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

