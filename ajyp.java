import com.google.android.gms.auth.folsom.SharedKey;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ajyp implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ajxe ajxe0 = (ajxe)object0;
        return new SharedKey(ajxe0.c, ajxe0.d.toByteArray());
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

