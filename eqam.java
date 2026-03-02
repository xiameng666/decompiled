import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.data.PinFallbackPayload;
import com.google.android.gms.smartdevice.utils.bluetooth.BluetoothController.2;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eqam implements eqaa {
    private final bbng A;
    private eqal B;
    private int C;
    private boolean D;
    private boolean E;
    private erql F;
    private final ScheduledExecutorService G;
    public static final Strategy a;
    public static final baun b;
    public final cuvm c;
    public final Context d;
    public final Handler e;
    public final eraw f;
    public eqmj g;
    public eqcr h;
    public String i;
    public String j;
    public eqhi k;
    public eqak l;
    public gjpi m;
    public final bxd n;
    public epxv o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public boolean t;
    public int u;
    public final AtomicBoolean v;
    public final cuwp w;
    public final cuvg x;
    public final cuwv y;
    private eqsl z;

    static {
        eqam.a = Strategy.c;
        eqam.b = new erqc(new String[]{"D2D", "SourceDeviceConnectorNearbyConnections"});
    }

    public eqam(cuvm cuvm0, Context context0, Handler handler0) {
        this.m = gjpi.a;
        this.n = new bxd();
        this.o = epxv.a;
        this.s = 0;
        this.u = 0;
        this.v = new AtomicBoolean(false);
        this.w = new eqaf(this);
        this.x = new eqag(this);
        this.y = new eqah(this);
        this.c = cuvm0;
        this.d = context0;
        this.e = handler0;
        this.A = bbnk.a;
        this.f = eraw.f();
        this.G = Executors.newSingleThreadScheduledExecutor();
    }

    @Override  // eqaa
    public final evql a(ConnectionRequest connectionRequest0, eqmj eqmj0) {
        eqai eqai0;
        String s = this.i;
        if(s != null) {
            eqam.b.m(a.a(s, "Already connected to another device ", ". Refusing to connect."), new Object[0]);
            return evrg.c(new aztb(new Status(10566)));
        }
        if(!this.o.d) {
            this.C = connectionRequest0.f;
            if(hyig.e()) {
                D2DDevice d2DDevice0 = connectionRequest0.a;
                if(d2DDevice0 != null) {
                    return this.d(d2DDevice0, eqmj0);
                }
            }
            this.j = connectionRequest0.e;
            String s1 = connectionRequest0.c;
            byte[] arr_b = connectionRequest0.d;
            this.q = connectionRequest0.g;
            this.p = connectionRequest0.h;
            this.E = connectionRequest0.i;
            this.s = connectionRequest0.k;
            if(connectionRequest0.g) {
                this.v.set(false);
            }
            hyis hyis0 = hyis.a;
            int v = !hyis0.k().af() || !this.p || this.q || this.C != 6 || bbqa.d() || this.s != 1 || connectionRequest0.j != 0 && connectionRequest0.j != 1 ? 0 : 1;
            cuvm cuvm0 = this.c;
            if(cuvm0 == null) {
                return evrg.c(new Exception("GoogleApiClient is not supported."));
            }
            this.g = eqmj0;
            String s2 = this.j;
            boolean z = s2 != null || (eqmj0 instanceof eqyf);
            if(z && this.l == null) {
                this.l = new eqak(this, s2);
                this.B = new eqal(this, this.l);
            }
            epxu epxu0 = new epxu();
            epxu0.b = z;
            epxu0.c = v ^ 1;
            this.o = epxu0.a();
            if(arr_b != null) {
                eqai0 = new eqai(this, arr_b);
                goto label_39;
            }
            if(s1 != null) {
                eqai0 = new eqaj(this, s1, this.j, z);
            label_39:
                eqmr eqmr0 = new eqmr(this.e, eqai0);
                if(v == 0) {
                    eqab eqab0 = new eqab(this, eqmj0);
                    long v1 = this.q ? hyis0.k().q() : hygr.a.b().a();
                    if(this.E) {
                        v1 = hyis0.k().p();
                    }
                    eqsl eqsl0 = new eqsl(new bblp(1, 10), null, v1, eqab0);
                    this.z = eqsl0;
                    eqsl0.a();
                    eqam.b.d("Started discovery timeout (%dms)", new Object[]{((long)this.z.e)});
                    if(hyis0.k().ak() && this.q) {
                        erql erql0 = eqrn.d(this.d);
                        this.F = erql0;
                        erav erav0 = erav.a(erql0.c);
                        erql.a.d("Start monitoring Bluetooth status changes", new Object[0]);
                        erql0.e = new BluetoothController.2(erql0, erql0.c, erav0);
                        BroadcastReceiver broadcastReceiver0 = erql0.e;
                        IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
                        jwe.b(erql0.c, broadcastReceiver0, intentFilter0, 2);
                    }
                }
                cuwm cuwm0 = new cuwm();
                cuwm0.j(eqam.a);
                if(this.p) {
                    if(hyis0.k().aj()) {
                        cuwm0.e(new int[]{4});
                    }
                    else {
                        cuwm0.e(new int[]{4, 2});
                    }
                }
                if(v != 0) {
                    this.r = 0;
                    this.m = gjpi.f;
                    eqam.b.h("Connect directly via out-of-band API", new Object[0]);
                    gftb.check(s1);
                    return this.f(s1, hyig.b(), this.B);
                }
                return cuvm0.o(hyim.f(), eqmr0, cuwm0.a());
            }
            return evrg.c(new aztb(new Status(10594)));
        }
        eqam.b.m("Already discovering", new Object[0]);
        return evrg.c(new aztb(new Status(10566)));
    }

    @Override  // eqaa
    public final evql b() {
        this.D = true;
        epxv epxv0 = this.o;
        if(epxv0.d) {
            this.k();
            this.o = epxv.a;
            return evrg.d(null);
        }
        String s = this.i;
        if(s == null) {
            eqam.b.m("No connection in progress to disconnect.", new Object[0]);
            return evrg.c(new aztb(new Status(10567)));
        }
        if(epxv0.b) {
            eqam.b.h("Disconnecting from endpoint " + s, new Object[0]);
            this.p(s);
        }
        else {
            eqam.b.h("Rejecting endpoint %s", new Object[]{s});
            evql evql0 = this.c.f(s);
            evql0.b(new eqad());
            evql0.A(new eqae());
        }
        this.o = epxv.a;
        this.i = null;
        return evrg.d(null);
    }

    @Override  // eqaa
    public final void c() {
        this.i = null;
        eqsl eqsl0 = this.z;
        if(eqsl0 != null) {
            eqsl0.b();
        }
        erql erql0 = this.F;
        if(erql0 != null) {
            erql0.d();
        }
    }

    @Override  // eqaa
    public final evql d(D2DDevice d2DDevice0, eqmj eqmj0) {
        String s = this.i;
        if(s != null) {
            eqam.b.m(a.a(s, "Already connected to another device ", ". Refusing to connect."), new Object[0]);
            return evrg.c(new aztb(new Status(10566)));
        }
        epxu epxu0 = new epxu();
        epxu0.b = false;
        this.o = epxu0.a();
        eqam.b.h("Requesting connection to device: " + d2DDevice0.c + " (" + d2DDevice0.d + ")", new Object[0]);
        this.g = eqmj0;
        this.i = d2DDevice0.d;
        this.m = gjpi.b(d2DDevice0.h);
        gftb.z(this.i, "Connection endpoint ID is null.");
        return this.g(this.i, hyig.b(), this.x);
    }

    @Override  // eqaa
    public final evql e() {
        String s = this.i;
        if(s == null) {
            eqam.b.f("No pending or established connection to continue with pin", new Object[0]);
            return evrg.c(new aztb(new Status(10567)));
        }
        if(hyis.p()) {
            epxv epxv0 = this.o;
            if(epxv0.g) {
                epxu epxu0 = epxv0.a();
                epxu0.f = false;
                this.o = epxu0.a();
                eqam.b.j("Sending pin confirmed payload to target device %s", new Object[]{s});
                PinFallbackPayload pinFallbackPayload0 = new PinFallbackPayload();
                pinFallbackPayload0.c = true;
                pinFallbackPayload0.a.add(Integer.valueOf(2));
                this.j(s, pinFallbackPayload0);
                eqgo eqgo0 = new eqgo(this.c, s);
                TargetConnectionArgs targetConnectionArgs0 = new TargetConnectionArgs(this.r, this.s);
                if(this.g != null) {
                    targetConnectionArgs0.p(this.u);
                    this.g.a(eqgo0, targetConnectionArgs0);
                }
                return evrg.d(null);
            }
        }
        eqam.b.j("Automatically accepting connection to device endpoint %s", new Object[]{s});
        eqmu eqmu0 = new eqmu(this.e, this.y);
        return this.c.c(s, eqmu0);
    }

    public final evql f(String s, long v, cvxe cvxe0) {
        int v1 = 0;
        this.D = false;
        Status status0 = (Status)this.o(s, cvxe0).s();
        int v2 = status0.i;
        while(!status0.e() && ((long)v1) < v) {
            status0 = (Status)this.o(s, cvxe0).s();
            ++v1;
        }
        if(this.p) {
            this.f.c(v1);
        }
        int v3 = status0.i;
        epzg.a(this.d).e(v1, v2, v3);
        if(!status0.e()) {
            this.i = null;
        }
        if((this.g instanceof eqyf) && !status0.e()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((eqoc)hftv0).c = 1;
            ((eqoc)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            eqoc eqoc0 = (eqoc)hftp0.b_message;
            eqoc0.b |= 2;
            eqoc0.d = v3;
            eqoc eqoc1 = (eqoc)hftp0.N_build();
            this.g.d(10584, eqoc1);
        }
        return status0.e() ? evrg.d(null) : evrg.c(new aztb(status0));
    }

    public final evql g(String s, long v, cuvg cuvg0) {
        int v1 = 0;
        this.D = false;
        eqmo eqmo0 = new eqmo(this.e, cuvg0);
        Status status0 = (Status)this.n(s, eqmo0).s();
        int v2 = status0.i;
        while(!status0.e() && ((long)v1) < v) {
            status0 = (Status)this.n(s, eqmo0).s();
            ++v1;
        }
        if(this.p) {
            this.f.c(v1);
        }
        epzg.a(this.d).e(v1, v2, status0.i);
        if(!status0.e()) {
            this.i = null;
        }
        return status0.e() ? evrg.d(null) : evrg.c(new aztb(status0));
    }

    public final void h(String s) {
        if(this.i != null) {
            eqam.b.h("Disconnected from device endpoint " + s, new Object[0]);
            this.i = null;
            this.h = null;
            eqmj eqmj0 = this.g;
            if(eqmj0 != null) {
                eqmj0.c();
            }
        }
    }

    public final void i(eqmz eqmz0) {
        String s = eqmz0.c();
        baun baun0 = eqam.b;
        baun0.j("Device name: %s", new Object[]{s});
        if(hyhh.d() && !(this.g instanceof eqyf) && s.startsWith("Pixel")) {
            baun0.d("Start preparing esim transfer data for allow-listed devices.", new Object[0]);
            new bjvj(this.d).b();
        }
    }

    public final void j(String s, PinFallbackPayload pinFallbackPayload0) {
        cuwu cuwu0 = cuwu.b(pinFallbackPayload0.ax());
        this.c.k(s, cuwu0);
        eqam.b.j("Sent pin fallback payload: %s", new Object[]{pinFallbackPayload0});
    }

    public final void k() {
        epxu epxu0 = this.o.a();
        epxu0.c = false;
        this.o = epxu0.a();
        eqam.b.d("Stopping discovery.", new Object[0]);
        eqsl eqsl0 = this.z;
        if(eqsl0 != null) {
            eqsl0.b();
        }
        erql erql0 = this.F;
        if(erql0 != null) {
            erql0.d();
        }
        this.c.u();
    }

    public final void l(byte[] arr_b, String s) {
        try {
            epxu epxu0 = this.o.a();
            epxu0.d = false;
            this.o = epxu0.a();
            eqhi eqhi0 = this.k;
            if(eqhi0 != null) {
                eqhi0.c(arr_b);
                eqam.b.j("Verified auth token", new Object[0]);
            }
            eqmj eqmj0 = this.g;
            gftb.z(eqmj0, "connectionCallbacks must not be null!");
            gftb.z(this.c, "connectionsClient must not be null!");
            this.q(s);
            TargetConnectionArgs targetConnectionArgs0 = new TargetConnectionArgs(this.r, this.s);
            targetConnectionArgs0.p(this.u);
            eqmj0.a(new eqgo(this.c, s), targetConnectionArgs0);
            eqam.b.j("Connection complete.", new Object[0]);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            eqam.b.g("Failed to validate authentication token", generalSecurityException0, new Object[0]);
            eqmj eqmj1 = this.g;
            if((eqmj1 instanceof eqyf)) {
                eqmj1.d(10807, null);
            }
            this.p(s);
            this.o = epxv.a;
        }
    }

    public static final byte m(eqoe eqoe0) {
        if(hyig.a.c().i()) {
            switch(eqoe0.ordinal()) {
                case 2: {
                    return 3;
                }
                case 3: {
                    return 5;
                }
                case 4: {
                    return 4;
                }
                case 5: {
                    return 1;
                }
                case 6: {
                    return 2;
                }
                case 7: {
                    return 6;
                }
                case 8: {
                    return 7;
                }
                case 9: {
                    return 8;
                }
                default: {
                    return 0;
                }
            }
        }
        return 1;
    }

    private final azua n(String s, cuvg cuvg0) {
        eqnf eqnf0 = new eqnf();
        eqnf0.f(this.o.c);
        eqnf0.e(this.C);
        eqnf0.d(this.q);
        if(!this.q) {
            eqnf0.g();
        }
        if(this.p) {
            ConnectionOptions connectionOptions0 = new ConnectionOptions();
            connectionOptions0.p = new int[]{2};
            connectionOptions0.o = new int[]{2};
            connectionOptions0.s = 2;
            cuvj.b(connectionOptions0);
            String s1 = eqnf0.c();
            return eqam.r(this.c.h(s1, s, cuvg0, connectionOptions0));
        }
        String s2 = eqnf0.c();
        czdo czdo0 = new czdo(((czdu)this.c), cuvg0);
        ((czdu)this.c).cA(s);
        azzc azzc0 = new azzc();
        azzc0.a = new czbs(((czdu)this.c), s2, s, ((azts)this.c).iD(czdo0, cuvg.class.getName()));
        azzc0.d = 0x4CA;
        azzd azzd0 = azzc0.a();
        evql evql0 = ((azts)this.c).jn(azzd0);
        evql0.A(new czcz(((czdu)this.c), s));
        return eqam.r(evql0);
    }

    private final azua o(String s, cvxe cvxe0) {
        eqnf eqnf0 = new eqnf();
        eqnf0.f(this.o.c);
        eqnf0.e(this.C);
        eqnf0.d(this.q);
        if(!this.q) {
            eqnf0.g();
        }
        byte[] arr_b = eqnf0.c().getBytes(StandardCharsets.UTF_8);
        cuvq cuvq0 = new cuvq();
        cuvq0.a = arr_b;
        ConnectionsDevice connectionsDevice0 = cuvq0.a();
        cuvq cuvq1 = new cuvq();
        cuvc cuvc0 = new cuvc();
        byte[] arr_b1 = bbmu.f(s);
        gftb.check(arr_b1);
        cuvc0.c(arr_b1);
        cuvq1.c(cuvc0.a());
        ConnectionsDevice connectionsDevice1 = cuvq1.a();
        ConnectionOptions connectionOptions0 = new ConnectionOptions();
        connectionOptions0.p = new int[]{2};
        connectionOptions0.r = eqam.a;
        cuvj.b(connectionOptions0);
        String s1 = hyim.f();
        czdp czdp0 = new czdp(((czdu)this.c), cvxe0);
        ((czdu)this.c).cA(connectionsDevice1.a);
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{cumh.h};
        azzc0.a = new czbg(s1, connectionsDevice0, connectionsDevice1, ((azts)this.c).iD(czdp0, cvxe.class.getName()), connectionOptions0);
        azzc0.d = 0x4CA;
        azzd azzd0 = azzc0.a();
        evql evql0 = ((azts)this.c).jn(azzd0);
        evql0.A(new czdb(((czdu)this.c), connectionsDevice1));
        Status status0 = Status.b;
        try {
            evrg.n(evql0);
            return azuc.a(status0);
        }
        catch(ExecutionException | InterruptedException exception0) {
            Exception exception1 = evql0.i();
            if((exception1 instanceof aztb)) {
                status0 = new Status(((aztb)exception1).b());
            }
            eqam.b.l(exception0);
            return azuc.a(status0);
        }
    }

    private final void p(String s) {
        long v = hyis.b();
        if(v == 0L) {
            this.c.r(s);
            return;
        }
        eqam.b.h("Delay %d milliseconds before disconnecting from endpoint %s", new Object[]{v, s});
        eqac eqac0 = new eqac(this, s);
        this.G.schedule(eqac0, v, TimeUnit.MILLISECONDS);
    }

    private final void q(String s) {
        try {
            eqhi eqhi0 = this.k;
            if(eqhi0 != null) {
                cuwu cuwu0 = cuwu.b(eqhi0.d());
                cuvm cuvm0 = this.c;
                if(cuvm0 != null) {
                    cuvm0.k(s, cuwu0);
                }
                eqam.b.j("Sent encrypted auth token", new Object[0]);
            }
        }
        catch(GeneralSecurityException generalSecurityException0) {
            eqam.b.g("Encryption error", generalSecurityException0, new Object[0]);
        }
    }

    private static final azua r(evql evql0) {
        Status status0;
        try {
            status0 = Status.b;
            evrg.n(evql0);
            return azuc.a(status0);
        }
        catch(ExecutionException | InterruptedException exception0) {
            Exception exception1 = evql0.i();
            if((exception1 instanceof aztb)) {
                status0 = new Status(((aztb)exception1).b());
            }
            eqam.b.l(exception0);
            return azuc.a(status0);
        }
    }
}

