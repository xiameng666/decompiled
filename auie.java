import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public final class auie {
    public final gful_cronetEngineProvider a;
    public final augl b;
    public auia c;
    public augk d;
    private final avjh e;
    private final auiz f;
    private final atxp g;
    private final byte[] h;
    private final ausg i;

    public auie(augl augl0, Context context0, auaj auaj0, atxp atxp0, aulm aulm0, ausg ausg0, avaa avaa0, auiz auiz0, auhn auhn0) {
        this.a = gfus.a(((gful_cronetEngineProvider)new auib()));
        this.e = new avjh("TcpProbingWorker");
        auia auia0 = new auia(context0, atzn.a(), auaj0, atxp0, aulm0, ausg0, avaa0, auhn0);
        this.c = auia0;
        auia0.m = new auhs(auia0);
        for(int v = 0; ((long)v) < ((long)(((Long)auia0.b.mr()))); ++v) {
            auhx auhx0 = new auhx(auia0.d, auia0.e, v + 1, auia0.g, auia0.j, auia0.m);
            auia0.l.add(auhx0);
        }
        this.f = auiz0;
        this.i = ausg0;
        this.h = ausg0.g();
        this.g = atxp0;
        this.b = augl0;
    }

    public final void a(aujd aujd0, gkfz gkfz0, boolean z, boolean z1) {
        CastDevice castDevice0 = aujd0.c;
        if(castDevice0 != null && !castDevice0.n() && (!castDevice0.j() || hqsw.d())) {
            InetAddress inetAddress0 = castDevice0.c;
            auah auah0 = null;
            if(inetAddress0 == null) {
                byte[] arr_b = castDevice0.m;
                if(arr_b == null) {
                    inetAddress0 = null;
                }
                else {
                    byte[] arr_b1 = this.h;
                    if(arr_b1 == null) {
                        inetAddress0 = null;
                    }
                    else {
                        try {
                            inetAddress0 = InetAddress.getByAddress(new byte[]{arr_b1[0], arr_b1[1], arr_b[0], arr_b[1]});
                        }
                        catch(UnknownHostException unused_ex) {
                            this.e.d("Failed to create InetAddress for %s", new Object[]{aujd0});
                            return;
                        }
                    }
                }
            }
            if(inetAddress0 != null) {
                auag auag0 = auah.a(inetAddress0, castDevice0.g, castDevice0.r);
                auag0.c = castDevice0.p;
                auah0 = auag0.a();
            }
            if(auah0 != null) {
                this.b(auah0, gkfz0, z, z1, castDevice0.f());
            }
        }
    }

    public final void b(auah auah0, gkfz gkfz0, boolean z, boolean z1, String s) {
        String s1;
        ausg ausg0 = this.i;
        if(((Boolean)ausg0.d.mr()).booleanValue()) {
            s1 = "0:24:b2:df:a9:ed";
        }
        else {
            s1 = ausg0.b == null || !((ausn)ausg0.b).e() ? null : "02:00:00:00:00:00";
        }
        if(s1 == null) {
            this.e.g("Failed to get the BSSID of current network. Skip probing IP %s", new Object[]{auah0});
            return;
        }
        InetSocketAddress inetSocketAddress0 = auah0.b();
        auiz auiz0 = this.f;
        aume aume0 = auiz0.g(inetSocketAddress0);
        if(aume0 == null) {
            aume0 = auiz0.h(inetSocketAddress0);
        }
        aumd aumd0 = aume0.a(s1);
        if(aumd0 == null) {
            aumd0 = new aumd(s1);
            aume0.c(aumd0);
        }
        if(!z && aumd0.e >= 3) {
            this.g.k.a.k(auah0);
            return;
        }
        atzn.a().execute(new auic(this, auah0, gkfz0, z1, s));
    }
}

