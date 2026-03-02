import java.util.function.IntFunction;

public final class atek implements IntFunction {
    @Override
    public final Object apply(int v) {
        return new String[v];
    }
}

