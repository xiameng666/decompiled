import com.google.android.gms.nearby.sharing.internal.RegisterCloudSharingReceiverParams;
import java.util.concurrent.Callable;

public final class dcgk implements Callable {
    public final dchp a;
    public final RegisterCloudSharingReceiverParams b;

    public dcgk(dchp dchp0, RegisterCloudSharingReceiverParams registerCloudSharingReceiverParams0) {
        this.a = dchp0;
        this.b = registerCloudSharingReceiverParams0;
    }

    @Override
    public final Object call() {
        String s = this.b.b;
        String s1 = this.b.c;
        if(!hvqz.E()) {
            return (int)13;
        }
        dcus dcus0 = (dcus)this.a.e.b.get();
        dcst dcst0 = new dcst(s);
        ibuq.f(s1, "receiverSessionId");
        dcuq dcuq0 = new dcuq(dcus0, dcst0, s1, null);
        icbb.b(dcus0.d, null, null, dcuq0, 3);
        return (int)0;
    }
}

