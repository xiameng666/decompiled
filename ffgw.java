import com.google.android.gms.wearable.internal.ParcelableBackupDevice;
import java.util.function.IntFunction;

public final class ffgw implements IntFunction {
    @Override
    public final Object apply(int v) {
        return new ParcelableBackupDevice[v];
    }
}

