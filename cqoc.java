import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import j..util.function.Function.-CC;
import java.util.Locale;
import java.util.function.Function;

public final class cqoc implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        if(hxwm.a.d().m()) {
            Object object1 = PhoneNumberUtils.formatNumber(((String)object0), Locale.getDefault().getCountry());
            if(!TextUtils.isEmpty(((CharSequence)object1))) {
                return object1;
            }
        }
        return (String)object0;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

