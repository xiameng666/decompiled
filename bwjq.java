import android.net.Network;
import android.os.Bundle;

public final class bwjq {
    public final Network a;

    public bwjq(Network network0) {
        this.a = network0;
    }

    public static bwjq a(Bundle bundle0) {
        Network network0 = (Network)bundle0.getParcelable("networkToUse");
        return network0 == null ? null : new bwjq(network0);
    }
}

