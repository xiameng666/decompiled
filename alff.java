import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;

public final class alff implements Runnable {
    public final alfl a;

    public alff(alfl alfl0) {
        this.a = alfl0;
    }

    @Override
    public final void run() {
        alfl alfl0 = this.a;
        for(Object object0: alfl0.d()) {
            Role role0 = new Role(((SecureChannelSubscription)object0).b, ((SecureChannelSubscription)object0).c);
            for(Object object1: ((SecureChannelSubscription)object0).c()) {
                alfl0.b.h(((RemoteDevice)object1).b, role0);
            }
        }
        alfl0.e.set(0);
    }
}

