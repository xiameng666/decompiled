import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eqsb implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        StartSessionResponse startSessionResponse0 = (StartSessionResponse)object0;
        String s = startSessionResponse0.h;
        String s1 = startSessionResponse0.e;
        batl.s(s1);
        return new FallbackAccount(s, s1, "");
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

