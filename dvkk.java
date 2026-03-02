import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dvkk implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return (gged_interceptors)Collection.-EL.stream(((ValuableGroup)object0).a).map(new dvjz()).filter(new dvka()).map(new dvkb()).collect(ggaf.a);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

