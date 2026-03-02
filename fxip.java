import j..util.function.Function.-CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class fxip implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hfuo hfuo0 = ((hgub)((hgtz)object0).c.get(0)).b;
        Object object1 = new ArrayList();
        for(Object object2: hfuo0) {
            ((List)object1).add(fxix.b(((hjij)object2)));
        }
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

