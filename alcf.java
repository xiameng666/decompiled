import android.content.pm.ResolveInfo;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class alcf implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((ResolveInfo)object0).activityInfo.packageName;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

