import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.concurrent.Callable;

public final class dfxe implements Callable {
    public final dfzz a;
    public final ShareTarget b;

    public dfxe(dfzz dfzz0, ShareTarget shareTarget0) {
        this.a = dfzz0;
        this.b = shareTarget0;
    }

    @Override
    public final Object call() {
        dfzz dfzz0 = this.a;
        ShareTarget shareTarget0 = this.b;
        if(dfzz0.X(shareTarget0).a != 1002) {
            return (int)0x8AB7;
        }
        if(shareTarget0.f) {
            return dfzz0.N(shareTarget0);
        }
        dfzz0.bO(shareTarget0);
        dfzz0.aC();
        return (int)0;
    }
}

