import android.os.Handler;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public final class eqgk {
    public static final erqc a;
    public final InetAddress b;
    public final eqgj c;
    public final gmcg d;
    public boolean e;
    public Socket f;
    public erpg g;
    public DataOutputStream h;
    public Handler i;
    private final gmcg j;

    static {
        eqgk.a = new erqc(new String[]{"AtvSocketController"});
    }

    public eqgk(InetAddress inetAddress0, eqgj eqgj0) {
        this.d = new bblp(3, 9);
        this.j = new bblp(1, 9);
        this.b = inetAddress0;
        this.c = eqgj0;
    }

    public final gmcd a(epwg epwg0) {
        if(!this.e) {
            throw new IllegalStateException("Cannot call write() because controller is not started");
        }
        eqge eqge0 = new eqge(this, epwg0);
        return this.j.e(eqge0);
    }
}

