import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.ChannelImpl;
import com.google.android.gms.wearable.internal.OpenChannelResponse;

public final class ffhh {
    public final fdiy a;

    public ffhh(fdiy fdiy0) {
        this.a = fdiy0;
    }

    public final void a(int v, fdrq fdrq0, String s) {
        ChannelImpl channelImpl0;
        boolean z = true;
        fdiy fdiy0 = this.a;
        if(v == 0) {
            batl.c(fdrq0 != null, "Got null token with SUCCESS");
            if(s == null) {
                z = false;
            }
            batl.c(z, "Got null path with SUCCESS");
            channelImpl0 = new ChannelImpl(fdrq0.b(), fdrq0.a, s);
        }
        else {
            channelImpl0 = null;
        }
        try {
            fdiy0.N(new OpenChannelResponse(v, channelImpl0));
        }
        catch(RemoteException unused_ex) {
            Log.w("WearableService", String.format("Failed to set %s result on openChannel result", fcfp.a(v)));
        }
    }
}

