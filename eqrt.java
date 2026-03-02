import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eqrt implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = new Bundle();
        ((Bundle)object1).putString("name", ((FallbackAccount)object0).b);
        ((Bundle)object1).putString("url", ((FallbackAccount)object0).c);
        if(!TextUtils.isEmpty(((FallbackAccount)object0).d)) {
            ((Bundle)object1).putString("targetSessionId", ((FallbackAccount)object0).d);
        }
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

