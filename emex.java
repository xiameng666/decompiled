import j..util.function.Function.-CC;
import java.util.function.Function;

public final class emex implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gzra gzra0 = ((gzrd)object0).g;
        if(gzra0 == null) {
            gzra0 = gzra.a;
        }
        if(gzra0.b == 1) {
            return Boolean.valueOf(((boolean)0));
        }
        gzra gzra1 = ((gzrd)object0).g;
        if(gzra1 == null) {
            gzra1 = gzra.a;
        }
        return gzra1.b == 2 ? Boolean.valueOf(((boolean)0)) : Boolean.valueOf(((boolean)1));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

