import j..time.Duration;
import j..time.Instant;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eoiu implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Duration duration0 = Duration.between(Instant.ofEpochSecond(((Long)object0).longValue()), Instant.ofEpochMilli(System.currentTimeMillis()));
        return duration0.isNegative() ? Duration.ZERO : ((Duration)ggbb.b(duration0, eoiv.b));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

