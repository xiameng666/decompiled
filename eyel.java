import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;

public final class eyel {
    public final eyfl a;
    private final gfuv b;

    public eyel(eyfl eyfl0, gfuv gfuv0) {
        this.a = eyfl0;
        this.b = gfuv0;
    }

    public final eyez a(ConnectionInfo connectionInfo0, gzxn gzxn0, gzxo gzxo0, exjx exjx0) {
        ibuq.f(connectionInfo0, "connectionInfo");
        ibuq.f(gzxn0, "deviceType");
        ibuq.f(gzxo0, "eventType");
        ibuq.f(exjx0, "rangingMethod");
        eyek eyek0 = new eyek(this, connectionInfo0, gzxn0, gzxo0, exjx0);
        return new eyez(this.b, eyek0);
    }
}

