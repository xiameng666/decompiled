import j..util.function.Function.-CC;
import j..util.stream.Stream.-CC;
import java.util.function.Function;

public final class fvey implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return Stream.-CC.ofNullable(((fvfw)object0).d.e);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

