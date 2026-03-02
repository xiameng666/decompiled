import j..util.function.Function.-CC;
import java.util.function.Function;

public final class apeo implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hheh hheh0 = ((hhee)object0).c;
        if(hheh0 == null) {
            hheh0 = hheh.a;
        }
        return hheh0.c == 4 ? ((int)(((Integer)hheh0.d))) : ((int)0);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

