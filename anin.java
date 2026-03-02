import com.google.android.gms.autofill.fill.IFillField;
import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class anin implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return Collection.-EL.stream(((IFillField)object0).l());
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

