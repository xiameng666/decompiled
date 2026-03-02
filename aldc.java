import com.google.android.gms.auth.proximity.exo.RecentAppsManager.AppData;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class aldc implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        alsw alsw0 = ((RecentAppsManager.AppData)object0).d();
        return alsw0 == null ? "" : alsw0.c;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

