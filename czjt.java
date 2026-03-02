import j..util.function.Function.-CC;
import java.util.function.Function;

public final class czjt implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = (String)object0;
        return bboh.b(s, ((bbcu)czju.a.getOrDefault(s, czju.b)));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

