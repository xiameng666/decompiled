import j..util.Base64;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eolx implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return new eomb(Base64.getDecoder().decode(((eolz)object0).j));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

