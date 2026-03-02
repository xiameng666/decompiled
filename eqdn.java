import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.BlockstorePayload;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class eqdn extends epwu implements eqro {
    private List A;
    private ScheduledFuture B;
    private boolean C;
    private boolean D;
    private final ProxyResultReceiver E;
    private eqft F;
    private int G;
    private byte[] H;
    private boolean I;
    private boolean J;
    private boolean K;
    private final eqcy L;
    public static final baun f;
    public final Context g;
    public final BootstrapOptions h;
    public epyj i;
    public boolean j;
    public String k;
    public String l;
    final eqfu m;
    public boolean n;
    private final epzg o;
    private final Queue p;
    private final eqme q;
    private final eqcz r;
    private final eqcx s;
    private final ScheduledExecutorService t;
    private epzc u;
    private final eqln v;
    private final epyt w;
    private final epxd x;
    private final epza y;
    private List z;

    static {
        eqdn.f = new erqc(new String[]{"D2D", "TargetDeviceBootstrapController"});
    }

    public eqdn(epzg epzg0, epwt epwt0, BootstrapOptions bootstrapOptions0, epwj epwj0, epza epza0, ScheduledExecutorService scheduledExecutorService0) {
        super(eqdn.f, epzg0.b, epwt0);
        this.j = false;
        this.m = new eqdg(this);
        eqdh eqdh0 = new eqdh(this);
        this.L = eqdh0;
        this.q = (eqme)epzg0.c;
        this.o = epzg0;
        this.t = scheduledExecutorService0;
        Context context0 = epzg0.a;
        batl.s(context0);
        this.g = context0;
        this.p = new ArrayDeque();
        batl.s(bootstrapOptions0);
        this.h = bootstrapOptions0;
        this.v = new eqln(context0, this.c);
        this.w = new epyt(context0);
        this.x = new epxd(context0, ((eqme)epzg0.c));
        this.y = epza0;
        byte[] arr_b = new byte[0x20];
        new SecureRandom().nextBytes(arr_b);
        bootstrapOptions0.am(arr_b);
        if(bbod.c(hyhp.a.g().j())) {
            epzc epzc0 = bootstrapOptions0.p();
            epzc0.c(12, true);
            bootstrapOptions0.y(epzc0.b);
            bootstrapOptions0.ai(epzc0.a);
        }
        bootstrapOptions0.v(azqk.a(context0));
        bootstrapOptions0.s(Build.MODEL);
        bootstrapOptions0.ap(Build.FINGERPRINT);
        bootstrapOptions0.t(eqsh.a(context0));
        bootstrapOptions0.aq(((byte)(eqsh.w(context0) ? 2 : 1)));
        if(bootstrapOptions0.n) {
            eqcx eqcx0 = new eqcx(epzg0.a, epzg0.b, ((eqme)epzg0.c), eqdh0, ((boolean)(bootstrapOptions0.i ^ 1)));
            eqdh0 = eqdh0;
            this.s = eqcx0;
        }
        else {
            this.s = null;
        }
        this.r = epwj0.b(epzg0.a, ((eqme)epzg0.c), eqdh0, bootstrapOptions0.i, true);
        this.E = new ProxyResultReceiver(epzg0.b, this);
    }

    @Override  // epwu
    protected final epyj b() {
        return this.i;
    }

    @Override  // epwu
    public final void c() {
        super.c();
        super.d();
        this.i = null;
        eqcx eqcx0 = this.s;
        if(eqcx0 != null) {
            eqcx0.a();
        }
        eqft eqft0 = this.F;
        if(eqft0 != null) {
            eqft0.b();
            this.F.a();
        }
    }

    @Override  // epwu
    public final void g(int v, eqoc eqoc0) {
    }

    @Override  // epwu
    protected final void j(MessagePayload messagePayload0) {
        baun baun0 = eqdn.f;
        baun0.j("Processing MessagePayload.", new Object[0]);
        ArrayList arrayList0 = new ArrayList();
        DisplayText displayText0 = messagePayload0.f;
        if(displayText0 != null) {
            arrayList0.add(new eqdk(this.d, displayText0));
        }
        BootstrapConfigurations bootstrapConfigurations0 = messagePayload0.e;
        if(bootstrapConfigurations0 != null) {
            eqme eqme0 = this.q;
            eqme0.L(2);
            if(!TextUtils.isEmpty(bootstrapConfigurations0.c)) {
                arrayList0.add(new eqdl(this, this.d, bootstrapConfigurations0));
            }
            this.u = bootstrapConfigurations0.p();
            epxf epxf0 = this.e;
            epxf0.e = this.u.b(2) ? 4 : 0;
            if(this.u.b(9)) {
                epxf0.a = 2;
                eqme0.v(gjmw.c);
            }
            else if(this.u.b(8)) {
                epxf0.a = 1;
                eqme0.v(gjmw.b);
            }
            this.I = this.u.b(6);
            this.J = this.u.b(10);
            this.K = this.u.b(15);
            if(this.u.b(4)) {
                new eqrm(this.g).b(this.h.v, this.h.l);
            }
            baun0.d("from source: %s", new Object[]{this.u});
            DeviceDetails deviceDetails0 = bootstrapConfigurations0.n;
            if(deviceDetails0 != null) {
                this.G = deviceDetails0.d ? 2 : 1;
                epxf0.f = deviceDetails0.b;
                int v = 3;
                eqme0.I((deviceDetails0.f ? 3 : 2));
                if(!deviceDetails0.g) {
                    v = 2;
                }
                eqme0.K(v);
                String s = deviceDetails0.h;
                if(s != null) {
                    eqme0.u(s);
                }
                String s1 = deviceDetails0.j;
                if(s1 != null) {
                    eqme0.t(s1);
                }
                if(this.h.f != 0) {
                    eqme0.H(eqsh.x(deviceDetails0.i));
                }
            }
            int v1 = bootstrapConfigurations0.k;
            if(this.h.p && v1 > 0) {
                this.e(v1);
            }
        }
        AccountBootstrapPayload accountBootstrapPayload0 = messagePayload0.g;
        if(accountBootstrapPayload0 != null) {
            arrayList0.add(new eqdj(this.r, accountBootstrapPayload0));
        }
        WorkProfilePayload workProfilePayload0 = messagePayload0.m;
        if(workProfilePayload0 != null) {
            baun0.d("Persisting work profile %s", new Object[]{baun.q(workProfilePayload0.b)});
            this.I = false;
            this.v.e(workProfilePayload0);
            this.q.G(workProfilePayload0.q());
            this.e.e = workProfilePayload0.c;
            this.o.f.f();
            CleanSharedSecretChimeraService.e(this.g);
            this.z();
        }
        BlockstorePayload blockstorePayload0 = messagePayload0.o;
        if(blockstorePayload0 != null) {
            baun0.d("Process Blockstore data.", new Object[0]);
            this.J = false;
            this.H = blockstorePayload0.b;
            this.z();
        }
        ArrayList arrayList1 = messagePayload0.q;
        if(arrayList1 != null) {
            this.z = arrayList1;
            this.K = false;
            this.z();
        }
        ArrayList arrayList2 = messagePayload0.n;
        if(arrayList2 != null && !arrayList2.isEmpty()) {
            this.w.c(arrayList2);
            CleanSharedSecretChimeraService.d(this.g);
        }
        AccountTransferPayload accountTransferPayload0 = messagePayload0.k;
        if(accountTransferPayload0 != null) {
            arrayList0.add(new eqdi(this.s, accountTransferPayload0));
        }
        if(messagePayload0.c == 5) {
            baun0.j("Starting Fido flow.", new Object[0]);
            eqme eqme1 = this.q;
            eqme1.D(4);
            this.D = true;
            this.e.g = true;
            if(this.F == null) {
                this.F = new eqft(this.g, eqme1, this.m, this.h.i, this.G);
            }
            this.F.l = (long)this.h.l;
            this.F.d();
            SecondDeviceAuthPayload secondDeviceAuthPayload0 = messagePayload0.p;
            if(secondDeviceAuthPayload0 != null) {
                this.v(secondDeviceAuthPayload0.d, secondDeviceAuthPayload0.e);
            }
        }
        if(messagePayload0.c == 6) {
            baun0.j("Source completed fallback.", new Object[0]);
            List list0 = messagePayload0.p == null ? null : messagePayload0.p.a;
            eqft eqft0 = this.F;
            if(eqft0 != null && list0 != null) {
                eqft0.c(list0);
            }
        }
        SecondDeviceAuthPayload secondDeviceAuthPayload1 = messagePayload0.p;
        if(secondDeviceAuthPayload1 != null) {
            byte[] arr_b = secondDeviceAuthPayload1.c;
            if(arr_b != null) {
                eqft eqft1 = this.F;
                if(eqft1 != null) {
                    eqft1.e(arr_b);
                }
            }
        }
        if(arrayList0.isEmpty()) {
            baun0.h("MessagePayload did not yield any Requests.", new Object[0]);
            if(Log.isLoggable(baun0.a, 2)) {
                baun0.h("MessagePayload: " + messagePayload0.toString(), new Object[0]);
            }
        }
        if(messagePayload0.i) {
            ArrayDeque arrayDeque0 = new ArrayDeque();
            Queue queue0 = this.p;
            synchronized(queue0) {
                while(!queue0.isEmpty()) {
                    arrayDeque0.add(((eqdm)queue0.poll()));
                }
                queue0.addAll(arrayList0);
                queue0.addAll(arrayDeque0);
            }
            this.j = false;
        }
        else {
            synchronized(this.p) {
                this.p.addAll(arrayList0);
            }
        }
        this.u();
    }

    public final Bundle p(ArrayList arrayList0, String s, String s1) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelableArrayList("accounts", arrayList0);
        epzc epzc0 = this.u;
        if(epzc0 != null) {
            bundle0.putBoolean("deviceOwnerSet", epzc0.b(2));
        }
        bundle0.putString("restoreAccount", s);
        bundle0.putString("restoreToken", s1);
        bundle0.putParcelable("resultReceiver", eqsh.c(this.E));
        bundle0.putBoolean("isFidoFlow", this.D);
        return bundle0;
    }

    public final void q() {
        if(this.C) {
            return;
        }
        this.k(2);
        if(this.n) {
            byte[] arr_b = this.H;
            if(arr_b != null) {
                this.x.c(arr_b, this.c);
            }
        }
        gmcd gmcd0 = this.y.c(this.z, this.A);
        if(gmcd0 != null) {
            eqdn.f.d("Storing folsom data.", new Object[0]);
            gmcd0.hB(() -> try {
                Integer integer0 = (Integer)gmbu.r(gmcd0);
                int v = (int)integer0;
                eqdn.f.d("Stored keys for %s accounts.", new Object[]{integer0});
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjno.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjno gjno0 = (gjno)hftp0.b_message;
                gjno0.b |= 1;
                gjno0.c = v;
                gjno gjno1 = (gjno)hftp0.N_build();
                this.q.o(gjno1);
            }
            catch(ExecutionException | CancellationException exception0) {
                eqdn.f.n("Unable to store all the keys.", exception0, new Object[0]);
            }, new bbre(this.c));
        }
        this.C = true;
    }

    public final void r() {
        this.q.L(14);
        if(!this.I && !this.J && !this.K) {
            this.q();
            return;
        }
        eqdf eqdf0 = new eqdf(this);
        long v = hyhe.b();
        this.B = ((bbll)this.t).h(eqdf0, v, TimeUnit.MILLISECONDS);
    }

    public final void s(BootstrapProgressResult bootstrapProgressResult0) {
        this.j = this.d.c(bootstrapProgressResult0);
    }

    public final void u() {
        Queue queue0 = this.p;
        synchronized(queue0) {
            while(!queue0.isEmpty()) {
                if(this.j) {
                    eqdn.f.h("Bootstrap paused.", new Object[0]);
                    return;
                }
                eqdm eqdm0 = (eqdm)queue0.poll();
                String s = eqdm0.getClass().getSimpleName();
                eqdn.f.j("Processing item from Request queue: " + s, new Object[0]);
                eqdm0.a();
            }
        }
    }

    public final void v(String s, String s1) {
        this.k = s;
        epxf epxf0 = this.e;
        epxf0.b = s1;
        if(!TextUtils.isEmpty(s)) {
            epxf0.d = new BootstrapAccount(this.k, "com.google");
        }
        this.l = s1;
    }

    public final void w(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            if(this.A == null) {
                this.A = new ArrayList(list0.size());
            }
            this.A.addAll(eqsh.j(list0));
        }
    }

    public final boolean x() {
        return this.F != null;
    }

    @Override  // eqro
    public final void y(int v, Bundle bundle0) {
        boolean z = false;
        eqdn.f.d("onReceiveResult: " + v, new Object[0]);
        if(v != 2003) {
            throw new IllegalArgumentException("Unknown result code: " + v);
        }
        ArrayList arrayList0 = bundle0.getParcelableArrayList("accountChallengeData");
        if(!this.n) {
            if(arrayList0 != null && !arrayList0.isEmpty()) {
                z = true;
            }
            this.n = z;
        }
        if(hygl.a.d().k() && arrayList0 != null) {
            this.w(eqsh.k(arrayList0));
        }
        this.q();
    }

    private final void z() {
        ScheduledFuture scheduledFuture0 = this.B;
        if(scheduledFuture0 != null && !this.I && !this.J && !this.K) {
            scheduledFuture0.cancel(true);
            this.B = null;
            this.q();
        }
    }
}

