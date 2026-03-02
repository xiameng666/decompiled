import java.io.IOException;

public final class fehq implements glzn {
    public final fehs a;

    public fehq(fehs fehs0) {
        this.a = fehs0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ffmn.a("BleOffloadServerConn", "startConnection: failure %s: retrying offload", new Object[]{((IOException)object0)});
        this.a.e.a("startConnection: Retrying offload");
        return this.a.b();
    }
}

