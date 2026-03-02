import android.util.Pair;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fbrd implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hdzv hdzv0 = (hdzv)object0;
        return new Pair(hdzv0.b, hdzv0.c);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

