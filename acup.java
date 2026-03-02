import android.content.Context;
import android.net.Network;
import android.os.Binder;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.Map.Entry;
import java.util.Map;

public final class acup {
    public static final bboh a;
    public final Context b;
    public final gful_cronetEngineProvider c;

    static {
        acup.a = bboh.c("Auth", bbcu.fF, "GmsNetworkEngineClient");
    }

    public acup(Context context0, gful_cronetEngineProvider gful0) {
        ibuq.f(context0, "context");
        super();
        this.b = context0;
        this.c = gful0;
    }

    public final gmcd a(String s, Map map0, ByteBuffer byteBuffer0, clck clck0, ckcq ckcq0, Network network0) {
        ibuq.f(s, "url");
        ibuq.f(byteBuffer0, "data");
        ibuq.f(ckcq0, "collectionDefinition");
        clcf clcf0 = clcg.f(s, ckcq0, clbk.a, clbj.a);
        clcj clcj0 = ((clbs)this.c.mr()).e(clcf0, clck0, clhl.b.b(clhr.b), acuq.a().a(((String)map0.get("app"))), 0x401);
        clcj0.n("POST");
        clcj0.l();
        clcj0.q(this.b, byteBuffer0, clbk.a, clbj.a);
        clcs clcs0 = clbz.a(clbk.a, clbj.a);
        for(Object object0: map0.entrySet()) {
            clcs0.a(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        clcs0.a("Content-Type", "application/x-www-form-urlencoded");
        clcj0.m(new clct(clcs0));
        if(hoxf.c() && network0 != null) {
            clcj0.k(network0);
        }
        return acup.b(clcj0);
    }

    public static final gmcd b(clcj clcj0) {
        gmcd gmcd0;
        long v = SystemClock.elapsedRealtime();
        long v1 = Binder.clearCallingIdentity();
        try {
            gmcd0 = glzd.f(clcj0.e().a(), new acuk(new acuj(v)), clhl.b.b(clhr.b));
        }
        finally {
            Binder.restoreCallingIdentity(v1);
        }
        return gmcd0;
    }
}

