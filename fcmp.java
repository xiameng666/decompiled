import android.accounts.Account;
import android.content.Context;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fcmp implements Function {
    public final Context a;

    public fcmp(Context context0) {
        this.a = context0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        aqlj aqlj0 = aqyu.a(this.a);
        aqys aqys0 = new aqys(this.a);
        return aqmi.a(this.a, ((Account)object0), aqlj0, aqys0);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

