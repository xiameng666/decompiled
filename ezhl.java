import android.content.Context;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ezhl implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Context context0 = (Context)object0;
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        return new azts(context0, aayy.a, azsx.s, aztr_settings.a);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

