import android.hardware.biometrics.BiometricManager;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;
import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import j..time.Duration;
import java.util.List;

public final class eyfl {
    public final exkt a;
    public final eydt b;
    public final BiometricManager c;
    private final ccmg d;
    private final icck e;

    public eyfl(exkt exkt0, ccmg ccmg0, eydt eydt0, icck icck0) {
        this.a = exkt0;
        this.d = ccmg0;
        this.b = eydt0;
        this.e = icck0;
        this.c = (BiometricManager)AppContextProvider.a().getSystemService(BiometricManager.class);
    }

    public final void a(gzxv gzxv0, ConnectionInfo connectionInfo0, Duration duration0) {
        ibuq.f(gzxv0, "event");
        ibuq.f(connectionInfo0, "connectionInfo");
        this.b(connectionInfo0, new eyfh(gzxv0, duration0, this));
    }

    public final void b(ConnectionInfo connectionInfo0, ibts ibts0) {
        eyfk eyfk0 = new eyfk(ibts0, connectionInfo0, this, null);
        icbb.b(this.e, null, null, eyfk0, 3);
    }

    public final void c(bbdg bbdg0) {
        this.d.a(bbdg0);
    }

    public final void d(gzxv gzxv0, ConnectionInfo connectionInfo0) {
        ibuq.f(gzxv0, "event");
        this.b(connectionInfo0, new eyfg(gzxv0));
    }

    public final void e(gzyk gzyk0, ConnectionInfo connectionInfo0, gzym gzym0, Double double0, Duration duration0) {
        ibuq.f(gzyk0, "event");
        ibuq.f(gzym0, "type");
        this.b(connectionInfo0, new eyfj(gzyk0, gzym0, double0, duration0));
    }

    public final void f(gzyo gzyo0, List list0, ConnectionInfo connectionInfo0) {
        ibuq.f(gzyo0, "event");
        ibuq.f(list0, "connectionDurations");
        ibuq.f(connectionInfo0, "connectionInfo");
        this.b(connectionInfo0, new eyfe(gzyo0, list0));
    }

    public static void g(eyfl eyfl0, gzyh gzyh0, double f, gzyj gzyj0, ConnectionInfo connectionInfo0, Duration duration0, Integer integer0, int v) {
        ibuq.f(gzyh0, "event");
        ibuq.f(gzyj0, "rangingMethod");
        eyfl0.b(connectionInfo0, new eyfa(gzyh0, f, gzyj0, ((v & 16) == 0 ? duration0 : null), ((v & 0x20) == 0 ? integer0 : null)));
    }

    public static void h(eyfl eyfl0, gzyk gzyk0, ConnectionInfo connectionInfo0, gzym gzym0) {
        eyfl0.e(gzyk0, connectionInfo0, gzym0, null, null);
    }

    public static void i(eyfl eyfl0, gzyz gzyz0, ConnectionInfo connectionInfo0, gzyj gzyj0, gzym gzym0, int v) {
        if((v & 0x80) != 0) {
            gzym0 = gzym.b;
        }
        if((v & 0x40) != 0) {
            gzyj0 = null;
        }
        eyfl0.j(gzyz0, connectionInfo0, null, null, null, null, gzyj0, gzym0, 0);
    }

    public final void j(gzyz gzyz0, ConnectionInfo connectionInfo0, Duration duration0, Duration duration1, Duration duration2, Duration duration3, gzyj gzyj0, gzym gzym0, int v) {
        ibuq.f(gzyz0, "event");
        ibuq.f(gzym0, "unlockRelockType");
        if(gzyz0 == gzyz.c) {
            this.c(bbdg.un);
        }
        else if(gzyz0 == gzyz.d) {
            this.c(bbdg.uo);
        }
        this.b(connectionInfo0, new eyff(gzyz0, gzym0, v, gzyj0, duration0, duration1, duration2, duration3, this));
    }
}

