import android.content.Context;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.auth.proximity.NearbyConnectionsIntentOperation;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class akxo {
    public static final int a;
    private static final baun b;
    private static final Map c;
    private static int d;
    private final gmcg e;
    private final Context f;

    static {
        akxo.b = new baun("ProximityAuth", new String[]{"NearbyConnections"});
        akxo.c = new HashMap();
        akxo.d = 0;
    }

    public akxo(Context context0) {
        bblp bblp0 = new bblp(1, 10);
        super();
        this.f = context0;
        this.e = bblp0;
    }

    public final void a(ByteString hfsf0, boolean z) {
        akyf akyf0 = akyf.c(this.f);
        if(z) {
            akyf0.f = hfsf0;
            return;
        }
        akyf0.e = hfsf0;
    }

    public final void b(String s, ByteString hfsf0) {
        alaa alaa0;
        try {
            alaa0 = alac.a(hfsf0.toByteArray());
        }
        catch(IOException iOException0) {
            akxo.b.n("Unable to parse received message.", iOException0, new Object[0]);
            return;
        }
        akyk akyk0 = (akyk)akxo.e().get(s);
        if(akyk0 == null) {
            akxo.b.m("Could not retrieve secure channel for endpoint " + s, new Object[0]);
            return;
        }
        akxn akxn0 = new akxn(akyk0, alaa0);
        this.e.execute(akxn0);
    }

    public final void c() {
        ++akxo.d;
        Intent intent0 = NearbyConnectionsIntentOperation.a(this.f);
        this.f.startService(intent0);
    }

    public final void d() {
        int v = akxo.d;
        if(v <= 0) {
            akxo.b.m("Trying to stop advertising but nothing is advertising", new Object[0]);
            return;
        }
        akxo.d = v - 1;
        if(v - 1 == 0) {
            Intent intent0 = NearbyConnectionsIntentOperation.b(this.f);
            this.f.startService(intent0);
        }
    }

    static final Map e() {
        return hpzm.U() ? NearbyConnectionsIntentOperation.a : akxo.c;
    }

    public static final void f(String s) {
        akxo.e().remove(s);
    }

    public static final void g(String s) {
        akyk akyk0 = new akyk(s);
        akxo.e().put(s, akyk0);
    }

    public static final void h(String s) {
        akzp akzp0 = new akzp(AppContextProvider.a(), akzn.c().e());
        akyk akyk0 = (akyk)akxo.e().get(s);
        if(akyk0 == null) {
            akxo.b.m("Could not retrieve secure channel for endpoint " + s, new Object[0]);
            return;
        }
        akyk0.f(1);
        akyk0.d(akvs.a());
        akyk0.e(akzp0);
    }

    public static final void i(String s) {
        akyk akyk0 = (akyk)akxo.e().get(s);
        if(akyk0 == null) {
            akxo.b.m("Could not retrieve secure channel for endpoint " + s, new Object[0]);
            return;
        }
        akyk0.f(0);
        akxo.e().remove(s);
    }

    public static final gmcd j(String s, ParcelFileDescriptor parcelFileDescriptor0, long v) {
        return fhra.b(akxm.a().k(s, cuwu.d(parcelFileDescriptor0, v)));
    }

    public static final gmcd k(String s, ByteString hfsf0) {
        return fhra.b(akxm.a().k(s, cuwu.h(hfsf0.newInput())));
    }
}

