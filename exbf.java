import java.util.function.ToLongFunction;

public final class exbf implements ToLongFunction {
    @Override
    public final long applyAsLong(Object object0) {
        return Math.abs(((exad)object0).f);
    }
}

