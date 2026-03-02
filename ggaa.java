import j..util.function.BiFunction.-CC;
import java.util.Map.Entry;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final class ggaa implements BinaryOperator {
    public final BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        Map map0 = ((ggee)object1).a;
        if(map0 != null) {
            for(Object object2: map0.entrySet()) {
                ((ggee)object0).h(((Map.Entry)object2).getKey(), ((ggdr)((Map.Entry)object2).getValue()).g());
            }
        }
        return (ggee)object0;
    }
}

