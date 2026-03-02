import j..util.Optional;
import j..util.function.Function.-CC;
import java.util.List;
import java.util.function.Function;

public final class cqjz implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        List list0 = ((aqen)object0).c;
        boolean z = true;
        if(list0.size() != 1) {
            return Optional.empty();
        }
        if(((byte)(((Byte)list0.get(0)))) == 0) {
            z = false;
        }
        return Optional.of(Boolean.valueOf(z));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

