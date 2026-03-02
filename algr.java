import com.google.android.gms.auth.proximity.firstparty.Subscription;
import com.google.android.gms.auth.proximity.firstparty.SyncedDevicesUpdateSubscription;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

final class algr implements Callable {
    final algs a;

    public algr(algs algs0) {
        Objects.requireNonNull(algs0);
        this.a = algs0;
        super();
    }

    @Override
    public final Object call() {
        Object object0 = new ArrayList();
        for(Object object1: this.a.a.c()) {
            Subscription subscription0 = (Subscription)object1;
            if((subscription0 instanceof SyncedDevicesUpdateSubscription)) {
                ((List)object0).add(((SyncedDevicesUpdateSubscription)subscription0));
            }
        }
        return object0;
    }
}

