import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.SupervisedAccountInfo;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import com.google.android.gms.wearable.AppTheme;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class eqck extends epxa implements eqro {
    public epzj A;
    public evql B;
    public evql C;
    public evql D;
    public gmcd E;
    String F;
    SupervisedAccountInfo G;
    public final epzk H;
    public eqcp I;
    public final eqcq J;
    private static final Semaphore K;
    private final erpv L;
    private final erpy M;
    private final ProxyResultReceiver N;
    private final eqch O;
    private final eqln P;
    private final epyt Q;
    private final epza R;
    private final ArrayList S;
    private boolean T;
    private boolean U;
    private final boolean V;
    private final boolean W;
    private int X;
    private final String Y;
    private evql Z;
    private PendingIntent aa;
    private final boolean ab;
    private List ac;
    public static final baun h;
    public static long i;
    public final Context j;
    public final eqlx k;
    public final eqfv l;
    public final BootstrapConfigurations m;
    public final epyl n;
    public final epwj o;
    public final eqrq p;
    public final eqcj q;
    public final epxd r;
    public BootstrapOptions s;
    public Boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public epzl z;

    static {
        eqck.h = new erqc(new String[]{"D2D", "SourceDirectTransferController"});
        eqck.K = new Semaphore(1);
        eqck.i = -1L;
    }

    public eqck(epzg epzg0, BootstrapConfigurations bootstrapConfigurations0, erpv erpv0, erpy erpy0, epyl epyl0) {
        boolean z1;
        eqgn eqgn0 = eqgn.b(epzg0.a);
        eqln eqln0 = new eqln(epzg0.a, epzg0.b);
        epyt epyt0 = new epyt(epzg0.a);
        epxd epxd0 = new epxd(epzg0.a);
        epza epza0 = new epza(epzg0.a);
        super(epzg0.b);
        this.S = new ArrayList();
        this.t = null;
        this.H = new eqcd(this);
        this.J = new eqce(this);
        this.j = epzg0.a;
        eqlx eqlx0 = (eqlx)epzg0.c;
        batl.s(eqlx0);
        this.k = eqlx0;
        this.l = epzg0.d;
        batl.s(bootstrapConfigurations0);
        this.m = bootstrapConfigurations0;
        this.L = erpv0;
        this.M = erpy0;
        this.P = eqln0;
        this.Q = epyt0;
        this.r = epxd0;
        this.R = epza0;
        this.n = epyl0;
        this.o = epwj.a;
        this.Y = epzg0.e;
        this.p = new eqrq();
        this.N = new ProxyResultReceiver(this.f, this);
        eqch eqch0 = new eqch(eqgn0, new eqcf(this));
        this.O = eqch0;
        boolean z = false;
        if(bootstrapConfigurations0.i) {
            this.t = Boolean.valueOf(false);
            eqch0.c();
            if(hygx.f()) {
                this.t = Boolean.valueOf(bootstrapConfigurations0.f);
            }
        }
        if(bootstrapConfigurations0.t != null && bootstrapConfigurations0.t.b != null) {
            z1 = true;
        }
        else if(bootstrapConfigurations0.s == null || !bootstrapConfigurations0.s.h) {
            z1 = false;
        }
        else {
            z1 = true;
        }
        this.V = z1;
        hygx hygx0 = hygx.a;
        if(hygx0.b().n() && (bootstrapConfigurations0.t != null && bootstrapConfigurations0.t.c != null && bootstrapConfigurations0.r)) {
            z = true;
        }
        this.W = z;
        if(z1 || z) {
            ProtoLiteBuilder hftp0 = eqlx0.j;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjng.b(((gjng)hftp0.b_message));
        }
        this.q = new eqcj(this, (epzg0.e == null || !epzg0.e.startsWith("com.google.android.wearable") && !epzg0.e.startsWith("com.google.android.apps.wear") ? hyhb.a.c().a() : hyjw.b()));
        this.ab = hygx0.b().p();
    }

    final void A(eqhl eqhl0) {
        synchronized(this) {
            this.q.c();
            this.p(eqhl0, false);
            this.L.a(this);
        }
    }

    private final void B() {
        if(hygx.a.b().x() && this.m.t != null) {
            eqck.h.d("Updating timeout value for parent directed flow.", new Object[0]);
            long v = hyhb.b();
            this.q.e(v);
        }
        BootstrapConfigurations.a.remove("bootstrapAccounts");
        BootstrapConfigurations.a.remove("extraParameters");
        BootstrapConfigurations.a.remove("accountPickerEnabled");
        BootstrapConfigurations.a.remove("accountPickerOptions");
        BootstrapConfigurations.a.remove("uiCustomization");
        MessagePayload messagePayload0 = new MessagePayload();
        BootstrapConfigurations bootstrapConfigurations0 = this.m;
        messagePayload0.v(bootstrapConfigurations0);
        this.m(messagePayload0);
        if(this.T) {
            this.d(this.s.q);
        }
        eqch eqch0 = this.O;
        eqck.h.h("Received bootstrap options from target device.", new Object[0]);
        eqch0.b = true;
        eqch0.a();
        if(!bootstrapConfigurations0.r && bootstrapConfigurations0.u) {
            this.t = Boolean.valueOf(false);
            this.X = 0;
            eqch0.c();
        }
    }

    private final void C() {
        int v3;
        if(this.m.r || !this.m.u) {
            this.q.a();
        }
        int v = this.s.p().b(1);
        int v1 = (this.s.s < 11800000 ? 0 : 1) ^ 1 | v;
        hygx hygx0 = hygx.a;
        if(hygx0.b().s() && this.s.f == 4) {
            String s = this.Y;
            if(!TextUtils.isEmpty(s)) {
                Context context0 = this.j;
                azts azts0 = fcfo.f(context0);
                try {
                    int v2 = ((AppTheme)evrg.o(azts0.cl(s), hygx0.b().a(), TimeUnit.MILLISECONDS)).e;
                    if(v2 != 0) {
                        if(v2 == 1 && !gaec.t(context0)) {
                            v3 = 2;
                        }
                        else {
                            goto label_25;
                        }
                    }
                    else if(gaec.t(context0)) {
                        v3 = 1;
                    }
                    else {
                        v3 = 0;
                    }
                }
                catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                    eqck.h.l(exception0);
                    v3 = 0;
                }
                goto label_30;
            }
        }
    label_25:
        v3 = 0;
    label_30:
        if(this.w) {
            Context context1 = this.j;
            BootstrapConfigurations bootstrapConfigurations0 = this.m;
            BootstrapOptions bootstrapOptions0 = this.s;
            boolean z = erpc.a(bootstrapOptions0);
            Bundle bundle0 = Bundle.EMPTY;
            Map map0 = bootstrapConfigurations0.q();
            ResultReceiver resultReceiver0 = eqsh.c(this.N);
            if(hygx.k() && bbqa.d()) {
                eqoy.h.j("Opt in BAL", new Object[0]);
                bundle0 = cjoy.a().setPendingIntentCreatorBackgroundActivityStartMode(1).toBundle();
            }
            this.aa = cjok.b(context1.getApplicationContext(), 8, eqoy.l(context1, "com.google.android.gms.smartdevice.d2d.ui.SourceDirectTransferActivityV2", resultReceiver0, map0, bootstrapConfigurations0.i, z, ((boolean)v1), bootstrapOptions0.l, bootstrapConfigurations0.r, bootstrapConfigurations0.s, bootstrapConfigurations0.u, bootstrapConfigurations0.v, v3), 0xA000000, bundle0);
        }
        else {
            BootstrapOptions bootstrapOptions1 = this.s;
            boolean z1 = erpc.a(bootstrapOptions1);
            ResultReceiver resultReceiver1 = eqsh.c(this.N);
            Map map1 = this.m.q();
            int v4 = this.m.q ^ 1;
            Intent intent0 = eqoy.l(this.j, "com.google.android.gms.smartdevice.d2d.ui.SourceDirectTransferActivityV1", resultReceiver1, map1, this.m.i, z1, ((boolean)v1), bootstrapOptions1.l, this.m.r, this.m.s, this.m.u, this.m.v, v3);
            intent0.putExtra("showSkipAccount", ((boolean)v4));
            this.aa = cjok.a(this.j.getApplicationContext(), 8, intent0, 0xA000000);
        }
        eqck.h.d("Sending pending intent to listener", new Object[0]);
        ProtoLiteBuilder hftp0 = this.k.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoj gjoj0 = (gjoj)hftp0.b_message;
        gjoj0.b |= 1;
        gjoj0.c = true;
        this.n.c(this.aa);
    }

    private final boolean D(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            if(this.ac != null && !this.ac.isEmpty()) {
                BootstrapAccount bootstrapAccount0 = (BootstrapAccount)list0.get(0);
                BootstrapAccount bootstrapAccount1 = (BootstrapAccount)this.ac.get(0);
                if(bootstrapAccount1.f) {
                    if(bootstrapAccount0.b.equals(bootstrapAccount1.b)) {
                        this.x = true;
                        long v = hyhb.b();
                        this.q.e(v);
                        return false;
                    }
                    return true;
                }
                return bbmn.w(this.j, bootstrapAccount0.b);
            }
            for(Object object0: list0) {
                if(bbmn.w(this.j, ((BootstrapAccount)object0).b)) {
                    this.x = true;
                    long v1 = hyhb.b();
                    this.q.e(v1);
                }
            }
        }
        return false;
    }

    @Override  // epxa
    protected final erpy a() {
        return this.M;
    }

    @Override  // epxa
    public final void b() {
        super.b();
        this.L.b();
        this.q.b.b();
        if(hygx.j()) {
            Semaphore semaphore0 = eqck.K;
            if(semaphore0.availablePermits() <= 0) {
                semaphore0.release();
            }
            eqck.i = -1L;
        }
        epzj epzj0 = this.A;
        if(epzj0 != null) {
            epzj0.a();
        }
        eqcp eqcp0 = this.I;
        if(eqcp0 != null) {
            eqcp0.a();
        }
        if(this.ab) {
            PendingIntent pendingIntent0 = this.aa;
            if(pendingIntent0 != null) {
                pendingIntent0.cancel();
            }
        }
    }

    @Override  // epxa
    protected final void e() {
        this.k.z(10);
        this.k.r();
        this.L.b();
        this.l.m();
        this.p.c(0x3F3, Bundle.EMPTY);
        if(this.w) {
            this.x();
            return;
        }
        if(hygx.m()) {
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.x(2);
            this.n(new eqcg(this), new MessagePayload[]{messagePayload0});
            return;
        }
        this.j(2);
        this.x();
    }

    @Override  // epxa
    protected final void f(int v, String s, eqoc eqoc0) {
        this.k.r();
        this.L.b();
        eqca eqca0 = new eqca(this, v, eqoc0, s);
        this.f.post(eqca0);
    }

    @Override  // epxa
    public final void g(byte[] arr_b) {
        this.q.d();
        super.g(arr_b);
    }

    @Override  // epxa
    protected final void i(MessagePayload messagePayload0) {
        int v3;
        BootstrapOptions bootstrapOptions0 = messagePayload0.d;
        String s = null;
        int v = 1;
        if(bootstrapOptions0 == null) {
            v3 = 0;
        }
        else {
            this.s = bootstrapOptions0;
            baun baun0 = eqck.h;
            baun0.d("Processing bootstrapOptions: " + bootstrapOptions0.toString(), new Object[0]);
            eqlx eqlx0 = this.k;
            eqlx0.z(2);
            epzc epzc0 = bootstrapOptions0.p();
            epzc epzc1 = new epzc();
            this.B = this.P.a(epzc0, epzc1);
            this.C = this.Q.a(epzc1, bootstrapOptions0.w);
            if(hyhh.c()) {
                evql evql0 = this.Z;
                this.D = evql0 == null ? this.r.a(epzc0, epzc1) : evrg.m(evql0, hyhh.a.b().b(), TimeUnit.MILLISECONDS).e(new eqcb(this, epzc0, epzc1));
            }
            else {
                this.D = this.r.a(epzc0, epzc1);
            }
            BootstrapConfigurations bootstrapConfigurations0 = this.m;
            this.E = this.R.a(epzc0, epzc1, bootstrapConfigurations0);
            this.w = epzc0.b(12) && epzc0.b(14);
            this.U = epzc0.b(18);
            this.y = epzc0.b(17);
            this.ac = bootstrapOptions0.C;
            eqlx0.y(eqsh.y(bootstrapOptions0.B));
            eqlx0.p((bootstrapOptions0.y == 0 ? bootstrapOptions0.s : bootstrapOptions0.y));
            eqlx0.x((this.w ? 2 : 3));
            String s1 = bootstrapOptions0.g;
            if(s1 != null) {
                eqlx0.l(s1);
            }
            String s2 = bootstrapOptions0.D;
            if(s2 != null) {
                eqlx0.k(s2);
            }
            int v1 = bootstrapOptions0.f;
            if(v1 != 0) {
                eqlx0.w(eqsh.x(((byte)v1)));
            }
            if(hyjw.a.c().c() && bootstrapOptions0.f == 4) {
                long v2 = hyjw.b();
                this.q.e(v2);
            }
            Context context0 = this.j;
            if(eqck.t(context0).isEmpty()) {
                baun0.m("No bootstrappable accounts on source device, exiting...", new Object[0]);
                this.v(10562, "No accounts found", null);
            }
            else if(hygx.a.b().l() && this.V && (this.ac != null && !this.ac.isEmpty())) {
                this.v(10703, "Cannot start parent-directed initial sign-in because target already has account(s)", null);
            }
            else {
                boolean z = this.W;
                if(z && (this.ac != null && !this.ac.isEmpty() && !Objects.equals(((BootstrapAccount)this.ac.get(0)).b, bootstrapConfigurations0.t.c))) {
                    this.v(10703, "Cannot parent-directed re-auth a different unicorn account than the one on target", null);
                }
                else if(bootstrapConfigurations0.r) {
                label_64:
                    epzc1.c(2, new eqlf(context0).b());
                    DeviceDetails deviceDetails0 = new DeviceDetails(bbmq.d(context0), azqk.a(context0));
                    deviceDetails0.r(eqqx.b(context0));
                    deviceDetails0.s(erpk.a(context0));
                    deviceDetails0.t(Build.MODEL);
                    deviceDetails0.q(eqsh.a(context0));
                    deviceDetails0.p(Build.FINGERPRINT);
                    bootstrapConfigurations0.t(deviceDetails0);
                    bootstrapConfigurations0.w(epzc1);
                    if(hygx.h() && this.U && bootstrapConfigurations0.t != null && !z) {
                        bootstrapConfigurations0.x(true);
                    }
                    boolean z1 = this.s.j == 1;
                    this.u = z1;
                    this.q.a = z1;
                    this.q.c();
                    BootstrapOptions bootstrapOptions1 = this.s;
                    if(!erqb.b(bootstrapOptions1.l)) {
                        bootstrapOptions1.al(erqb.a());
                    }
                    eqck.i = this.s.l;
                    baun0.d("Session id: %s. OptionFlags from target: %s", new Object[]{((long)this.s.l), bootstrapOptions0.p()});
                    eqlx0.m(this.s.l);
                    eqlx0.n(this.u);
                    boolean z2 = this.s.p && hyim.h();
                    this.T = z2;
                    if(z2) {
                        bootstrapConfigurations0.v(this.s.q);
                    }
                    else {
                        bootstrapConfigurations0.v(0);
                    }
                    if(!bootstrapConfigurations0.r) {
                        this.B();
                    }
                    this.C();
                }
                else {
                    ArrayList arrayList0 = bootstrapConfigurations0.g;
                    if(bootstrapConfigurations0.t != null) {
                        baun0.d("Skipped unicorn account blocking check for parent directed flow", new Object[0]);
                        this.O.b(arrayList0, this.w);
                        goto label_64;
                    }
                    else if(this.D(arrayList0)) {
                        this.v(10703, "Cannot transfer unicorn account because target device already has account(s)", null);
                    }
                    else {
                        this.O.b(arrayList0, this.w);
                        goto label_64;
                    }
                }
            }
            v3 = 1;
        }
        AccountBootstrapPayload accountBootstrapPayload0 = messagePayload0.g;
        if(accountBootstrapPayload0 != null) {
            epzl epzl0 = this.z;
            if(epzl0 != null) {
                epzl0.a(accountBootstrapPayload0);
                v3 = 1;
            }
        }
        AccountTransferPayload accountTransferPayload0 = messagePayload0.k;
        if(accountTransferPayload0 != null) {
            epzj epzj0 = this.A;
            if(epzj0 != null) {
                epzj0.b(accountTransferPayload0);
                v3 = 1;
            }
        }
        ArrayList arrayList1 = messagePayload0.j;
        if(arrayList1 == null) {
            v = v3;
        }
        else {
            this.S.addAll(arrayList1);
            int v4 = arrayList1.size();
            int v6 = 0;
            for(int v5 = 0; v5 < v4; ++v5) {
                AccountTransferResult accountTransferResult0 = (AccountTransferResult)arrayList1.get(v5);
                accountTransferResult0.d = this.X;
                Set set0 = accountTransferResult0.a;
                set0.add(Integer.valueOf(4));
                String s3 = this.F;
                if(s3 != null) {
                    BootstrapAccount bootstrapAccount0 = accountTransferResult0.b;
                    bootstrapAccount0.a.add(Integer.valueOf(5));
                    bootstrapAccount0.e = s3;
                }
                if(this.G != null && hyjw.a.c().b()) {
                    eqck.h.h("Setting supervised info ", new Object[]{this.G});
                    SupervisedAccountInfo supervisedAccountInfo0 = this.G;
                    batl.s(supervisedAccountInfo0);
                    accountTransferResult0.e = supervisedAccountInfo0;
                    set0.add(Integer.valueOf(5));
                }
                if(accountTransferResult0.c == 1) {
                    ++v6;
                }
            }
            if(v6 > 0 && epwh.c() == 0) {
                BootstrapOptions bootstrapOptions2 = this.s;
                if(bootstrapOptions2 != null) {
                    s = bootstrapOptions2.g;
                }
                eqrk.a(this.j, v6, s);
            }
        }
        SecondDeviceAuthPayload secondDeviceAuthPayload0 = messagePayload0.p;
        if(secondDeviceAuthPayload0 != null) {
            byte[] arr_b = secondDeviceAuthPayload0.c;
            if(arr_b != null && this.I != null) {
                eqck.h.h("Process Fido messages.", new Object[0]);
                this.I.e(arr_b);
            }
            List list0 = secondDeviceAuthPayload0.a;
            if(list0 != null && !list0.isEmpty()) {
                eqck.h.h("Process source challenges.", new Object[0]);
                this.k.z(9);
                batl.c(this.u, "BootstrapOptions doesn\'t expect source fallback challenges.");
                this.q.a();
                Bundle bundle0 = new Bundle();
                bundle0.putParcelableArrayList("extraAccountChallengeData", eqsh.o(list0));
                this.p.c(1010, bundle0);
            }
        }
        else if(v == 0) {
            eqck.h.f("Did not process message for payload: ", new Object[]{messagePayload0.toString()});
        }
    }

    @Override  // epxa
    public final void l(byte[] arr_b) {
        this.q.d();
        super.l(arr_b);
    }

    @Override  // epxa
    protected final void o() {
        eqck.h.h("Encryption negotiation has completed.", new Object[0]);
        this.O.a = true;
        this.O.a();
    }

    public final long s() {
        return this.s == null ? -1L : this.s.l;
    }

    public static List t(Context context0) {
        Account[] arr_account = erpb.a(context0).p("com.google");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            list0.add(new BootstrapAccount(account0.name, account0.type));
        }
        return list0;
    }

    public final void u() {
        synchronized(this) {
            this.L.b();
            this.v = true;
            this.k.c(10564);
            this.p.c(0x3F4, Bundle.EMPTY);
            this.j(1);
            this.b();
        }
    }

    public final void v(int v, String s, eqoc eqoc0) {
        this.L.b();
        this.k(v);
        this.f(v, s, eqoc0);
    }

    public final void w(gmcd gmcd0) {
        try {
            ArrayList arrayList0 = (ArrayList)gmbu.r(gmcd0);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjno.a).v_newBuilder();
            int v = arrayList0.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjno gjno0 = (gjno)hftp0.b_message;
            gjno0.b |= 1;
            gjno0.c = v;
            gjno gjno1 = (gjno)hftp0.N_build();
            this.k.i(gjno1);
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.ap(arrayList0);
            this.m(messagePayload0);
        }
        catch(ExecutionException | CancellationException exception0) {
            eqck.h.n("Unable to get folsom data payloads.", exception0, new Object[0]);
        }
    }

    public final void x() {
        this.n.a(((AccountTransferResult[])this.S.toArray(new AccountTransferResult[this.S.size()])));
        this.b();
    }

    @Override  // eqro
    public final void y(int v, Bundle bundle0) {
        baun baun0 = eqck.h;
        baun0.j("onReceiveResult: " + v, new Object[0]);
        int v1 = 3;
        switch(v) {
            case 1001: {
                eqrq eqrq0 = this.p;
                eqrq0.a(eqck.q(bundle0));
                if(this.ab) {
                    baun0.d("Activity started, sending PendingIntent reference to the activity", new Object[0]);
                    Bundle bundle1 = new Bundle();
                    bundle1.putParcelable("pendingIntent", this.aa);
                    eqrq0.c(0x3FD, bundle1);
                    return;
                }
                return;
            }
            case 1002: {
                this.p.b();
                return;
            }
            case 1003: {
                this.k.z(13);
                ArrayList arrayList0 = bundle0.getParcelableArrayList("accountChallengeData");
                if(this.w) {
                    this.m(eqsh.f(arrayList0));
                }
                else {
                    this.z.b(arrayList0);
                }
                this.q.b();
                return;
            }
            case 1004: {
                eqlx eqlx0 = this.k;
                ProtoLiteBuilder hftp0 = eqlx0.f;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjoj gjoj0 = (gjoj)hftp0.b_message;
                gjoj0.b |= 2;
                gjoj0.d = true;
                eqlx0.z(12);
                Boolean boolean0 = Boolean.valueOf(bundle0.getBoolean("lockScreenConfirmed"));
                this.t = boolean0;
                if(boolean0.booleanValue()) {
                    int v2 = bundle0.getInt("lockScreenAuthType");
                    this.X = v2;
                    if(v2 == 0) {
                        this.X = 3;
                    }
                    else {
                        v1 = v2;
                    }
                }
                else {
                    this.X = 4;
                    v1 = 4;
                }
                baun0.d("lockScreenConfirmed: %b, lockscreenAuthenticationType: %d", new Object[]{this.t, v1});
                boolean z = this.t.booleanValue();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjoj gjoj1 = (gjoj)hftp0.b_message;
                gjoj1.b |= 4;
                gjoj1.e = z;
                this.q.b();
                this.O.c();
                return;
            }
            case 1005: {
                this.v(10598, "Bootstrap canceled by user.", null);
                return;
            }
            case 1006: {
                this.v(10585, "The source device is managed by a device owner.", null);
                return;
            }
            case 1007: {
                this.v(10586, "The source device backup account is a managed account.", null);
                return;
            }
            case 1009: {
                this.k.z(11);
                eqcp eqcp0 = this.I;
                if(eqcp0 != null) {
                    eqcp0.a();
                }
                this.q.b();
                if(bundle0.getInt("pendingIntentResult") == Status.f.i) {
                    this.v(10706, "User canceled during Fido.", null);
                    return;
                }
                return;
            }
            case 1010: {
                ArrayList arrayList1 = bauc.e(bundle0, "selectedAccounts", BootstrapAccount.CREATOR);
                String s = bundle0.getString("selectedChildId");
                baun0.h("Accounts selected. accounts: " + arrayList1 + " accountSelectionToken" + bundle0.getString("accountSelectionToken"), new Object[0]);
                if(arrayList1 != null && arrayList1.get(0) != null && bundle0.getString("accountSelectionToken") != null) {
                    this.G = new SupervisedAccountInfo(((BootstrapAccount)arrayList1.get(0)).b, bundle0.getString("accountSelectionToken"));
                }
                if(s != null || this.W) {
                    baun0.d("Skipped unicorn account blocking check for parent directed flow", new Object[0]);
                }
                else if(this.D(arrayList1)) {
                    this.v(10703, "Cannot transfer unicorn account because target device already has account(s)", null);
                    return;
                }
                if(s != null) {
                    ProtoLiteBuilder hftp1 = this.k.g;
                    gjoi gjoi0 = ((gjoh)hftp1.b_message).h;
                    if(gjoi0 == null) {
                        gjoi0 = gjoi.a;
                    }
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gjoi0).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)gjoi0));
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gjoi gjoi1 = (gjoi)hftp2.b_message;
                    gjoi1.b |= 1;
                    gjoi1.c = true;
                    gjoi gjoi2 = (gjoi)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gjoh gjoh0 = (gjoh)hftp1.b_message;
                    gjoi2.getClass();
                    gjoh0.h = gjoi2;
                    gjoh0.b |= 0x20;
                    BootstrapConfigurations bootstrapConfigurations0 = this.m;
                    if(TextUtils.isEmpty(s) && TextUtils.isEmpty(null)) {
                        throw new IllegalArgumentException("Either obfuscatedGaiaId or email must be set");
                    }
                    AuthenticatingUser authenticatingUser0 = new AuthenticatingUser();
                    authenticatingUser0.b = s;
                    authenticatingUser0.a.add(Integer.valueOf(2));
                    authenticatingUser0.c = null;
                    authenticatingUser0.a.add(Integer.valueOf(3));
                    bootstrapConfigurations0.r(authenticatingUser0);
                    if(hygx.h() && this.U) {
                        baun0.d("Enabled challenge deduplication for KOL parent directed flow.", new Object[0]);
                        bootstrapConfigurations0.x(true);
                    }
                    this.q.b();
                }
                this.m.s(arrayList1);
                this.O.b(arrayList1, this.w);
                this.B();
                return;
            }
            case 0x3F4: {
                int v3 = bundle0.getInt("dependencyErrorCode");
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp3.b_message;
                ((eqoc)hftv0).c = 5;
                ((eqoc)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp3.ensureMutable();
                }
                eqoc eqoc0 = (eqoc)hftp3.b_message;
                eqoc0.b |= 2;
                eqoc0.d = v3;
                this.v(10599, "Error happened during fallback challenge webview.", ((eqoc)hftp3.N_build()));
                return;
            }
            case 0x3F5: {
                this.F = bundle0.getString("parentId");
                return;
            }
            case 0x3F6: {
                this.v(10800, "Bootstrap skipped by user.", null);
                return;
            }
            case 0x3F7: {
                this.v(10801, "No transferable accounts", null);
                return;
            }
            case 0x3F8: {
                try {
                    byte[] arr_b = bundle0.getByteArray("accountPickerInfo");
                    eqlx eqlx1 = this.k;
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gjoh.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    if((((gjoh)hftv1).b & 1) != 0) {
                        ProtoLiteBuilder hftp4 = eqlx1.g;
                        boolean z1 = ((gjoh)hftv1).c;
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        gjoh gjoh1 = (gjoh)hftp4.b_message;
                        gjoh1.b |= 1;
                        gjoh1.c = z1;
                    }
                    if((((gjoh)hftv1).b & 2) != 0) {
                        ProtoLiteBuilder hftp5 = eqlx1.g;
                        boolean z2 = ((gjoh)hftv1).d;
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        gjoh gjoh2 = (gjoh)hftp5.b_message;
                        gjoh2.b |= 2;
                        gjoh2.d = z2;
                    }
                    if((((gjoh)hftv1).b & 4) != 0) {
                        ProtoLiteBuilder hftp6 = eqlx1.g;
                        boolean z3 = ((gjoh)hftv1).e;
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        gjoh gjoh3 = (gjoh)hftp6.b_message;
                        gjoh3.b |= 4;
                        gjoh3.e = z3;
                    }
                    if((((gjoh)hftv1).b & 8) != 0) {
                        ProtoLiteBuilder hftp7 = eqlx1.g;
                        boolean z4 = ((gjoh)hftv1).f;
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        gjoh gjoh4 = (gjoh)hftp7.b_message;
                        gjoh4.b |= 8;
                        gjoh4.f = z4;
                        return;
                    }
                }
                catch(hfur hfur0) {
                    eqck.h.g("Failed parse account picker info", hfur0, new Object[0]);
                }
                return;
            }
            case 0x3F9: {
                ProtoLiteBuilder hftp8 = this.k.f;
                ProtoLiteMessage hftv2 = hftp8.b_message;
                int v4 = ((gjoj)hftv2).h + 1;
                if(!hftv2.isImmutable()) {
                    hftp8.ensureMutable();
                }
                gjoj gjoj2 = (gjoj)hftp8.b_message;
                gjoj2.b |= 0x20;
                gjoj2.h = v4;
                return;
            }
            case 0x3FA: {
                ProtoLiteBuilder hftp9 = this.k.f;
                ProtoLiteMessage hftv3 = hftp9.b_message;
                int v5 = ((gjoj)hftv3).i + 1;
                if(!hftv3.isImmutable()) {
                    hftp9.ensureMutable();
                }
                gjoj gjoj3 = (gjoj)hftp9.b_message;
                gjoj3.b |= 0x40;
                gjoj3.i = v5;
                return;
            }
            case 0x3FB: {
                String s1 = bundle0.getString("errorCode");
                if(s1 != null) {
                    ProtoLiteBuilder hftp10 = this.k.g;
                    gjoi gjoi3 = ((gjoh)hftp10.b_message).h;
                    if(gjoi3 == null) {
                        gjoi3 = gjoi.a;
                    }
                    ProtoLiteBuilder hftp11 = (ProtoLiteBuilder)((ProtoLiteMessage)gjoi3).jf(5, null);
                    hftp11.X(((ProtoLiteMessage)gjoi3));
                    if(!hftp11.b_message.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    gjoi gjoi4 = (gjoi)hftp11.b_message;
                    hfuo hfuo0 = gjoi4.d;
                    if(!hfuo0.c()) {
                        gjoi4.d = ProtoLiteMessage.E(hfuo0);
                    }
                    gjoi4.d.add(s1);
                    gjoi gjoi5 = (gjoi)hftp11.N_build();
                    if(!hftp10.b_message.isImmutable()) {
                        hftp10.ensureMutable();
                    }
                    gjoh gjoh5 = (gjoh)hftp10.b_message;
                    gjoi5.getClass();
                    gjoh5.h = gjoi5;
                    gjoh5.b |= 0x20;
                    return;
                }
                try {
                }
                catch(hfur hfur0) {
                    eqck.h.g("Failed parse account picker info", hfur0, new Object[0]);
                }
                return;
            }
            case 1020: {
                this.q.a();
                ProtoLiteBuilder hftp12 = this.k.g;
                if(!hftp12.b_message.isImmutable()) {
                    hftp12.ensureMutable();
                }
                gjoh gjoh6 = (gjoh)hftp12.b_message;
                gjoh6.b |= 16;
                gjoh6.g = true;
                return;
            }
            default: {
                throw new RuntimeException("Unknown resultCode: " + v);
            }
        }
    }

    public final void z() {
        synchronized(this) {
            baun baun0 = eqck.h;
            baun0.h("startDirectTransfer()", new Object[0]);
            if(hygx.j() && !eqck.K.tryAcquire()) {
                baun0.m("There is another session going on, returning.", new Object[0]);
                this.f(10561, "There is another transfer session in progress.", null);
                return;
            }
            this.k.z(14);
            if(hyhh.c()) {
                baun0.d("Start preparing esim transfer data.", new Object[0]);
                this.Z = new bjvj(this.j).b();
            }
            this.A(new eqhl(true, this, (this.m.j ? 9 : 8)));
        }
    }
}

