import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class alfi implements Callable {
    public final alfl a;

    public alfi(alfl alfl0) {
        this.a = alfl0;
    }

    @Override
    public final Object call() {
        new ArrayList();
        alfl alfl0 = this.a;
        try {
            List list0 = (List)alfl0.c.c().get();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            alfl0.d.set(true);
            return Status.c;
        }
        alfl0.d.set(true);
        for(Object object0: list0) {
            Role role0 = new Role(((SecureChannelSubscription)object0).b, ((SecureChannelSubscription)object0).c);
            for(Object object1: ((SecureChannelSubscription)object0).c()) {
                alfl0.b.g(((RemoteDevice)object1), role0);
            }
            alfl0.e.incrementAndGet();
        }
        return Status.b;
    }
}

