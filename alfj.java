import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class alfj implements Callable {
    final alfl a;
    private final PendingIntent b;
    private final Role c;
    private final String d;
    private final boolean e;
    private final List f;

    public alfj(alfl alfl0, List list0, Role role0, PendingIntent pendingIntent0, String s, boolean z) {
        Objects.requireNonNull(alfl0);
        this.a = alfl0;
        super();
        this.f = list0;
        this.c = role0;
        this.b = pendingIntent0;
        this.d = s;
        this.e = z;
    }

    public final Status a() {
        ArrayList arrayList0 = new ArrayList();
        algc.b(this.f, arrayList0);
        Role role0 = this.c;
        SecureChannelSubscription secureChannelSubscription0 = algc.a(this.b, this.d, role0, arrayList0);
        for(Object object0: this.f) {
            RemoteDevice remoteDevice0 = (RemoteDevice)object0;
            if(this.e) {
                String s = remoteDevice0.b;
                akzn akzn0 = this.a.b;
                if(akzn0.i(s, role0.a())) {
                    try {
                        alfl.e(AppContextProvider.a(), secureChannelSubscription0, s, role0.a());
                    }
                    catch(PendingIntent.CanceledException unused_ex) {
                        return Status.f;
                    }
                }
                akzn0.g(remoteDevice0, role0);
            }
            else {
                this.a.b.h(remoteDevice0.b, role0);
            }
        }
        alfl alfl0 = this.a;
        akvq.b(AppContextProvider.a(), alfl0.b);
        try {
            if(this.e) {
                return alfl0.a(secureChannelSubscription0);
            }
            int v = 1;
            for(Object object1: ((List)alfl0.c.c().get())) {
                SecureChannelSubscription secureChannelSubscription1 = (SecureChannelSubscription)object1;
                if(this.c.b.equals(secureChannelSubscription1.b) && this.d.equals(secureChannelSubscription1.e) && this.b.equals(secureChannelSubscription1.a) && (this.c.c & secureChannelSubscription1.c) != 0) {
                    Status status0 = alfl0.c(this.f, secureChannelSubscription1);
                    v &= Status.b.equals(status0);
                }
            }
            return v == 0 ? Status.d : Status.b;
        }
        catch(InterruptedException | ExecutionException exception0) {
            alfl.a.n("SubscriptionCache error: ", exception0, new Object[0]);
            return Status.c;
        }
    }

    @Override
    public final Object call() {
        return this.a();
    }
}

