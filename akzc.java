import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.WireMessageParams;
import java.util.ArrayList;
import java.util.List;

public final class akzc extends azts {
    public final akzb a;
    public final List b;
    public static final int c;
    private static final azta_api d;
    private static final azss e;
    private static final azsy f;

    static {
        azss azss0 = new azss();
        akzc.e = azss0;
        akyy akyy0 = new akyy();
        akzc.f = akyy0;
        akzc.d = new azta_api("ProximityAuth.LegacyProximityAuthApi", akyy0, azss0);
    }

    public akzc(Context context0) {
        super(context0, akzc.d, null, aztr_settings.a);
        this.a = new akzb(this);
        this.b = new ArrayList();
    }

    public final evql b(Role role0) {
        azzc azzc0 = new azzc();
        azzc0.a = new akyx(role0);
        azzc0.d = 0x634;
        return this.jn(azzc0.a());
    }

    public final evql c(RemoteDevice remoteDevice0, Role role0) {
        azzc azzc0 = new azzc();
        azzc0.a = new akyu(remoteDevice0, role0);
        azzc0.d = 0x632;
        return this.jn(azzc0.a());
    }

    public final evql e(String s, Role role0) {
        azzc azzc0 = new azzc();
        azzc0.a = new akyr(s, role0);
        azzc0.d = 0x633;
        return this.jn(azzc0.a());
    }

    public final void f(akyo akyo0) {
        azyf azyf0 = azyg.b(akyo0, Looper.getMainLooper(), "akzc");
        akyv akyv0 = new akyv(this, azyf0);
        akyw akyw0 = new akyw(this, azyf0);
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = akyv0;
        azyq0.b = akyw0;
        azyq0.e = 0x631;
        this.iH(azyq0.a());
    }

    public final void g(WireMessageParams wireMessageParams0) {
        azzc azzc0 = new azzc();
        azzc0.a = new akys(wireMessageParams0);
        azzc0.d = 0x635;
        this.jn(azzc0.a());
    }
}

