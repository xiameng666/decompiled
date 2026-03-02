import com.google.android.gms.accountsettings.utils.AsNetworkUtils.AsNetworkUtilsImpl.1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class zjk {
    public final List a;
    public final lqd b;
    public final lqi c;
    public zjo d;
    private final zkh e;
    private final lqi f;
    private final Queue g;
    private final Runnable h;
    private final aauf i;
    private final aaui j;

    public zjk(aauf aauf0, aaui aaui0, zkh zkh0) {
        this.a = new ArrayList();
        this.g = new ArrayDeque();
        this.h = () -> if(this.d == null) {
            Queue queue0 = this.g;
            if(queue0.isEmpty()) {
                this.b();
                return;
            }
            aaui aaui0 = this.j;
            if(aaui0.a()) {
                goto label_18;
            }
            this.e(zjn.a);
            Runnable runnable0 = this.h;
            if(aaui0.a()) {
                runnable0.run();
                return;
            }
            Map map0 = aaui0.c;
            if(!map0.containsKey(runnable0)) {
                AsNetworkUtils.AsNetworkUtilsImpl.1 asNetworkUtils$AsNetworkUtilsImpl$10 = new AsNetworkUtils.AsNetworkUtilsImpl.1(aaui0, runnable0);
                aaui0.e.registerDefaultNetworkCallback(asNetworkUtils$AsNetworkUtilsImpl$10);
                map0.put(runnable0, asNetworkUtils$AsNetworkUtilsImpl$10);
                return;
            label_18:
                zjo zjo0 = (zjo)queue0.remove();
                this.d = zjo0;
                zki zki0 = new zki(((zkj)this.e), zjo0.a, (zjo0.d == 1 ? grxt.b : grxt.c), zjo0.c);
                evrg.a(((zkj)this.e).b, zki0).z(new zjj(this, zjo0));
            }
        };
        this.i = aauf0;
        this.j = aaui0;
        this.e = zkh0;
        this.c = new lqi(fhru.a);
        lqi lqi0 = new lqi(ggna.a);
        this.f = lqi0;
        this.b = lsa.b(lqi0, new zji());
    }

    public final void a(zjo zjo0) {
        this.a.remove(zjo0);
        if(!this.f(zjo0)) {
            this.g.offer(zjo0);
            this.e(zjn.a(zjo0, 1));
            this.c();
        }
        this.d();
    }

    public final void b() {
        this.c.l(fhru.a);
    }

    // Detected as a lambda impl.
    public final void c() {
        if(this.d == null) {
            Queue queue0 = this.g;
            if(queue0.isEmpty()) {
                this.b();
                return;
            }
            aaui aaui0 = this.j;
            if(aaui0.a()) {
                goto label_18;
            }
            this.e(zjn.a);
            Runnable runnable0 = this.h;
            if(aaui0.a()) {
                runnable0.run();
                return;
            }
            Map map0 = aaui0.c;
            if(!map0.containsKey(runnable0)) {
                AsNetworkUtils.AsNetworkUtilsImpl.1 asNetworkUtils$AsNetworkUtilsImpl$10 = new AsNetworkUtils.AsNetworkUtilsImpl.1(aaui0, runnable0);
                aaui0.e.registerDefaultNetworkCallback(asNetworkUtils$AsNetworkUtilsImpl$10);
                map0.put(runnable0, asNetworkUtils$AsNetworkUtilsImpl$10);
                return;
            label_18:
                zjo zjo0 = (zjo)queue0.remove();
                this.d = zjo0;
                zki zki0 = new zki(((zkj)this.e), zjo0.a, (zjo0.d == 1 ? grxt.b : grxt.c), zjo0.c);
                evrg.a(((zkj)this.e).b, zki0).z(new zjj(this, zjo0));
            }
        }
    }

    public final void d() {
        ggdy ggdy0 = new ggdy();
        zjo zjo0 = this.d;
        if(zjo0 != null) {
            ggdy0.i(zjo0);
        }
        ggdy0.k(this.g);
        ggdy0.k(this.a);
        gged_interceptors gged0 = ggdy0.h();
        this.f.l(gged0);
    }

    public final void e(zjn zjn0) {
        fhru fhru0 = new fhru(zjn0);
        this.c.l(fhru0);
    }

    public final boolean f(zjo zjo0) {
        Iterator iterator0 = this.g.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            zjo zjo1 = (zjo)object0;
            if(((ProtoLiteMessage)zjo1.a).equals(zjo0.a)) {
                iterator0.remove();
                this.g(zjo1, 4);
                this.g(zjo0, 4);
                return true;
            }
        }
        return false;
    }

    public final void g(zjo zjo0, int v) {
        grxw grxw0 = zjo0.b;
        int v1 = grxw0.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwq.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gqwq)hftp2.b_message).c = 3;
        ((gqwq)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqws.a).v_newBuilder();
        int v2 = grxw0.c;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gqws gqws0 = (gqws)hftp3.b_message;
        gqws0.b |= 1;
        gqws0.c = v2;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gqzz.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp4.b_message;
        ((gqzz)hftv0).c = (zjo0.d == 1 ? 26 : 27) - 1;
        ((gqzz)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((gqzz)hftp4.b_message).f = v - 1;
        ((gqzz)hftp4.b_message).b |= 8;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grab.a).v_newBuilder();
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)graa.a).v_newBuilder();
        int v3 = zjo0.a.c;
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        graa graa0 = (graa)hftp6.b_message;
        graa0.b |= 1;
        graa0.c = v3;
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grab grab0 = (grab)hftp5.b_message;
        graa graa1 = (graa)hftp6.N_build();
        graa1.getClass();
        grab0.c = graa1;
        grab0.b |= 16;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gqzz gqzz0 = (gqzz)hftp4.b_message;
        grab grab1 = (grab)hftp5.N_build();
        grab1.getClass();
        gqzz0.e = grab1;
        gqzz0.b |= 4;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((gqzz)hftp4.b_message).d = 6;
        ((gqzz)hftp4.b_message).b |= 2;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gqws gqws1 = (gqws)hftp3.b_message;
        gqzz gqzz1 = (gqzz)hftp4.N_build();
        gqzz1.getClass();
        gqws1.d = gqzz1;
        gqws1.b |= 2;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqwq gqwq0 = (gqwq)hftp2.b_message;
        gqws gqws2 = (gqws)hftp3.N_build();
        gqws2.getClass();
        gqwq0.f = gqws2;
        gqwq0.b |= 8;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqwt gqwt0 = (gqwt)hftp1.b_message;
        gqwq gqwq1 = (gqwq)hftp2.N_build();
        gqwq1.getClass();
        gqwt0.c = gqwq1;
        gqwt0.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqwt gqwt1 = (gqwt)hftp1.N_build();
        gqwt1.getClass();
        gqxt0.e = gqwt1;
        gqxt0.b |= 8;
        gqxt gqxt1 = (gqxt)hftp0.N_build();
        this.i.e(v1, gqxt1);
    }
}

