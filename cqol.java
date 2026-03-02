import android.text.TextUtils;
import com.google.android.gms.constellation.PhoneNumberVerification;
import j..util.function.Function.-CC;
import j..util.stream.Stream.-CC;
import java.util.function.Function;

public final class cqol implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = ((PhoneNumberVerification)object0).a;
        return TextUtils.isEmpty(s) ? Stream.-CC.empty() : Stream.-CC.of(s);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

