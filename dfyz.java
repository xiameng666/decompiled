import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider.5;
import java.util.Map;

public final class dfyz implements Runnable {
    public final NearbySharingProvider.5 a;
    public final ShareTarget b;
    public final Runnable c;
    public final dfyq d;

    public dfyz(NearbySharingProvider.5 nearbySharingProvider$50, ShareTarget shareTarget0, Runnable runnable0, dfyq dfyq0) {
        this.a = nearbySharingProvider$50;
        this.b = shareTarget0;
        this.c = runnable0;
        this.d = dfyq0;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a.c;
        ShareTarget shareTarget0 = this.b;
        if(dfzz0.bE(shareTarget0)) {
            Map map0 = dfzz0.a;
            gged_interceptors gged0 = gged_interceptors.i(map0.keySet());
            int v = gged0.size();
            int v1 = 0;
            while(v1 < v) {
                String s = (String)gged0.get(v1);
                byte[] arr_b = (byte[])map0.remove(s);
                if(arr_b == null) {
                    ++v1;
                    continue;
                }
                else {
                    dgag dgag0 = dgag.c(arr_b);
                    if(dgag0 != null) {
                        ShareTarget shareTarget1 = dfzz.bJ(dfzz0, s, dgag0);
                        if(shareTarget1 != null) {
                            if(shareTarget1.a == shareTarget0.a) {
                                dcvz.a.b().i("After a certificate sync, previously discovered EndpointID %s now matches ShareTarget %s.", s, shareTarget0.b);
                                this.c.run();
                                this.d.a(s);
                            }
                            ++v1;
                            continue;
                        }
                    }
                }
                break;
            }
        }
    }
}

