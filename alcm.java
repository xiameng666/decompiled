import android.app.usage.UsageStats;
import android.os.UserHandle;
import com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse;
import j..time.Instant;
import j..util.Optional;
import j..util.function.Function.-CC;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public final class alcm implements Function {
    public final alcq a;
    public final UserHandle b;
    public final Set c;
    public final Map d;

    public alcm(alcq alcq0, UserHandle userHandle0, Set set0, Map map0) {
        this.a = alcq0;
        this.b = userHandle0;
        this.c = set0;
        this.d = map0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        UserHandle userHandle0 = this.b;
        alsw alsw0 = this.a.b.b(((String)object0), userHandle0);
        if(alsw0 == null) {
            alcq.a.m("Cannot fetch info of %s app.", new Object[]{((String)object0)});
            return Optional.empty();
        }
        if(this.c.contains(((String)object0))) {
            if(hpzm.a.f().ai()) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)alsw0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)alsw0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((alsw)hftp0.b_message).h = 1;
                alsw0 = (alsw)hftp0.N_build();
                goto label_15;
            }
            return Optional.empty();
        }
    label_15:
        Map map0 = this.d;
        long v = Instant.EPOCH.toEpochMilli();
        if(map0.containsKey(((String)object0))) {
            v = ((UsageStats)map0.get(((String)object0))).getLastTimeUsed();
        }
        alco alco0 = new alco();
        alco0.a = new ProtoParsers.InternalDontUse(null, ((MessageLite)alsw0));
        alco0.b(v);
        alco0.c(userHandle0);
        return Optional.of(alco0.a());
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

