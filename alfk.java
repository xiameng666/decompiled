import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

final class alfk implements Callable {
    final alfl a;
    private final int b;
    private final RemoteDevice c;

    public alfk(alfl alfl0, RemoteDevice remoteDevice0, int v) {
        Objects.requireNonNull(alfl0);
        this.a = alfl0;
        super();
        this.c = remoteDevice0;
        this.b = v;
    }

    @Override
    public final Object call() {
        try {
            alfl alfl0 = this.a;
            for(Object object0: ((List)alfl0.c.c().get())) {
                SecureChannelSubscription secureChannelSubscription0 = (SecureChannelSubscription)object0;
                List list0 = secureChannelSubscription0.c();
                RemoteDevice remoteDevice0 = this.c;
                if(list0.contains(remoteDevice0) && (secureChannelSubscription0.c & this.b) > 0) {
                    Object object1 = alfl0.c(Collections.singletonList(remoteDevice0), secureChannelSubscription0);
                    if(!Status.b.equals(object1)) {
                        return object1;
                    }
                }
            }
            return Status.b;
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return Status.c;
        }
    }
}

