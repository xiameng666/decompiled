import j..util.function.Function.-CC;
import java.util.function.Function;

public final class euqn implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gtjo gtjo0 = ((ftiu)object0).c;
        if(gtjo0 == null) {
            gtjo0 = gtjo.a;
        }
        gtmy gtmy0 = gtmy.b(gtjo0.c) == null ? gtmy.e : gtmy.b(gtjo0.c);
        return Boolean.valueOf(gtmy0 == gtmy.c || gtmy0 == gtmy.d);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

