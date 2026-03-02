import com.google.android.gms.magictether.wifisync.WifiSyncChimeraService;
import java.util.concurrent.Callable;

public final class cpir implements Callable {
    @Override
    public final Object call() {
        WifiSyncChimeraService.b = false;
        return Boolean.valueOf(false);
    }
}

