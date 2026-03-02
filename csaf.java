import android.os.Bundle;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class csaf implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((Bundle)object0).getString("plan_subsegment_id");
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

