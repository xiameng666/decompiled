import j..time.Duration;
import j..util.Optional;
import j..util.function.BiFunction.-CC;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class enrh implements BiFunction {
    public final BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        if(enrj.c.containsValue(((String)object0))) {
            if(((igrj)object1).b == 3) {
                return Optional.of(ennh.d(Duration.ofMillis(ennh.a(((igrj)object1))).toMinutes()));
            }
            throw new IllegalArgumentException(((String)object0) + " is not an Int64List.");
        }
        String s = enrd.a(((String)object0));
        return enrj.a.contains(s) ? Optional.of(((igrj)object1)) : Optional.empty();
    }
}

