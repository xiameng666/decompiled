import j..util.function.Function.-CC;
import java.util.Locale;
import java.util.function.Function;

public final class eoct implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Locale locale0 = Locale.getDefault();
        Float float0 = (float)((gzpm)object0).d;
        hguk hguk0 = hguk.b(((gzpm)object0).c);
        if(hguk0 == null) {
            hguk0 = hguk.a;
        }
        return String.format(locale0, "%.2f: %s", float0, hguk0.name());
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

