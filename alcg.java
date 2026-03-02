import android.os.UserHandle;
import com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse;
import j..util.Optional;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class alcg implements Function {
    public final alcq a;
    public final UserHandle b;

    public alcg(alcq alcq0, UserHandle userHandle0) {
        this.a = alcq0;
        this.b = userHandle0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = ((alcp)object0).a;
        UserHandle userHandle0 = this.b;
        alsw alsw0 = this.a.b.b(s, userHandle0);
        if(alsw0 == null) {
            alcq.a.m("Cannot fetch info of %s app.", new Object[]{s});
            return Optional.empty();
        }
        alco alco0 = new alco();
        alco0.a = new ProtoParsers.InternalDontUse(null, ((MessageLite)alsw0));
        alco0.b(((alcp)object0).b);
        alco0.c(userHandle0);
        return Optional.of(alco0.a());
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

