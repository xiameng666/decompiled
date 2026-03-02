import android.content.pm.PackageInfo;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ateu implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((PackageInfo)object0).packageName;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

