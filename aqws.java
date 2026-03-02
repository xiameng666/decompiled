import android.net.Uri;
import java.util.function.IntFunction;

public final class aqws implements IntFunction {
    @Override
    public final Object apply(int v) {
        return new Uri[v];
    }
}

