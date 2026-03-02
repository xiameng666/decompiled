import com.google.android.gms.mdocstore.DocumentSpecification;
import java.util.function.IntFunction;

public final class dtql implements IntFunction {
    @Override
    public final Object apply(int v) {
        return new DocumentSpecification[v];
    }
}

