import com.google.android.gms.personalsafety.psa.UserPresentIntentOperation;
import j..time.Duration;
import j..time.Instant;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eieb implements Function {
    public final UserPresentIntentOperation a;

    public eieb(UserPresentIntentOperation userPresentIntentOperation0) {
        this.a = userPresentIntentOperation0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return Duration.between(((Instant)object0), Instant.ofEpochMilli(this.a.a.a()));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

