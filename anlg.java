import j..util.function.Function.-CC;
import java.util.function.Function;

public final class anlg implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        anjp anjp0 = ((anmg)object0).c;
        if(anjp0 == null) {
            anjp0 = anjp.a;
        }
        return anmf.a(anjp0);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

