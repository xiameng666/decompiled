import com.google.android.gms.mobiledataplan.PaymentGatewayConfig;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class cryf implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = ((hbxz)object0).b;
        int v = hbyb.a(((hbxz)object0).c);
        if(v == 0) {
            v = 1;
        }
        return new PaymentGatewayConfig(s, v - 1, ((hbxz)object0).d, ((hbxz)object0).e, ((hbxz)object0).f, ((hbxz)object0).g);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

