import com.google.android.gms.nearby.connection.ConnectionListeningOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.presence.BroadcastRequest;
import com.google.android.gms.nearby.presence.PresenceAction;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jeb.synthetic.FIN;

public final class ctuy implements ykm {
    public final cuvm a;
    public final bboh b;
    public icck c;
    public final Map d;
    public final Map e;
    public final ykc f;
    public static final int g;
    private static final List h;
    private static final List i;
    private static final List j;
    private static final PresenceIdentity k;
    private static final List l;
    private final dasx m;
    private final ibrt n;
    private final ctui o;

    static {
        Integer integer0 = (int)4;
        ctuy.h = ibpo.b(integer0);
        ctuy.i = ibpo.b(integer0);
        List list0 = ibpo.b(Integer.valueOf(20));
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(new PresenceAction(((Number)object0).intValue()));
        }
        ctuy.j = arrayList0;
        ctuy.k = new PresenceIdentity(0, "");
        ctuy.l = ibpo.g(new Integer[]{((int)5), ((int)9)});
    }

    public ctuy(dasx dasx0, cuvm cuvm0, ykd ykd0, ibrt ibrt0) {
        this.m = dasx0;
        this.a = cuvm0;
        this.n = ibrt0;
        this.b = ctnb.a("DeviceLink", new ibuk(this.getClass()));
        this.d = new LinkedHashMap();
        this.f = ykd0.a(this);
        this.e = new LinkedHashMap();
        this.o = new ctui();
    }

    @Override  // ykm
    public final ykl a(String s) {
        ibuq.f(s, "serviceName");
        return (ykl)this.d.get(s);
    }

    @Override  // ykm
    public final Object b(ykl ykl0, ibrl ibrl0) {
        ykl0.b();
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        Map map0 = this.d;
        if(!map0.containsKey(ykl0.b())) {
            map0.put(ykl0.b(), ykl0);
            if(this.c != null) {
                FIN.finallyExec$NT(v);
                return ibom.a;
            }
            this.c = iccl.b(this.n);
            FIN.finallyCodeBegin$NT(v);
            ctum ctum0 = new ctum(this, null);
            Object object0 = icbd.a(this.n, ctum0, ibrl0);
            return object0 == ibrx.a ? object0 : ibom.a;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override  // ykm
    public final void c(ykl ykl0) {
        ibuq.f(ykl0, "service");
        ykl0.b();
        synchronized(this) {
            Map map0 = this.d;
            if(!map0.containsKey(ykl0.b())) {
                ykl0.b();
                return;
            }
            map0.remove(ykl0.b());
            String s = ykl0.b();
            this.f.a(s);
            if(map0.isEmpty()) {
                this.m.d(this.o).b(new ctub(new ctua(this)));
                this.a.v();
                this.a.t();
                icck icck0 = this.c;
                if(icck0 != null) {
                    iccl.i(icck0);
                }
                this.c = null;
            }
        }
    }

    public final Object d(ibrl ibrl0) {
        ctun ctun0;
        if((ibrl0 instanceof ctun)) {
            ctun0 = (ctun)ibrl0;
            int v = ctun0.c;
            if((v & 0x80000000) == 0) {
                ctun0 = new ctun(this, ibrl0);
            }
            else {
                ctun0.c = v - 0x80000000;
            }
        }
        else {
            ctun0 = new ctun(this, ibrl0);
        }
        Object object0 = ctun0.a;
        Object object1 = ibrx.a;
        switch(ctun0.c) {
            case 0: {
                ibnx.b(object0);
                icmn icmn0 = icmu.e(0, 0, 0, 7);
                icck icck0 = this.c;
                if(icck0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                icbb.b(icck0, null, null, new ctup(icmn0, this, null), 3);
                icck icck1 = this.c;
                if(icck1 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                icbb.b(icck1, null, null, new ctuu(this, null), 3);
                ctux ctux0 = new ctux(this, icmn0);
                ConnectionListeningOptions connectionListeningOptions0 = new ConnectionListeningOptions();
                connectionListeningOptions0.a = Strategy.a;
                cuvh.c(connectionListeningOptions0);
                connectionListeningOptions0.e = ibpo.aF(ctuy.l);
                cuvh.b(connectionListeningOptions0);
                connectionListeningOptions0.c = true;
                cuvh.d(connectionListeningOptions0);
                cuvh.e(connectionListeningOptions0);
                cuvh.f(connectionListeningOptions0);
                evql evql0 = this.a.p("DeviceLink", ctux0, connectionListeningOptions0);
                evql0.b(new ctud(new ctuc()));
                evql0.A(new ctue(this));
                ctun0.c = 1;
                if(ictn.b(evql0, ctun0) != object1) {
                    goto label_40;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_40:
                darr darr0 = new darr();
                int[] arr_v = ibpo.aF(ctuy.h);
                darr0.c(Arrays.copyOf(arr_v, arr_v.length));
                int[] arr_v1 = ibpo.aF(ctuy.i);
                darr0.d(Arrays.copyOf(arr_v1, arr_v1.length));
                darr0.f = 1;
                darr0.a = ctuy.k;
                darr0.b(ctuy.j);
                BroadcastRequest broadcastRequest0 = darr0.a();
                evql evql1 = this.m.b(broadcastRequest0, this.o);
                evql1.b(new ctug(new ctuf()));
                evql1.A(new ctuh(this));
                ctun0.c = 2;
                return ictn.b(evql1, ctun0) != object1 ? ibom.a : object1;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

