import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemProperties;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import com.google.android.gms.smartdevice.d2d.TargetDirectTransferController.4;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.BlockstorePayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;
import com.google.android.gms.smartdevice.d2d.ui.ForwardingChimeraActivity;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eqfo extends epxa implements eqro, erpt {
    private final eqlf A;
    private final epyt B;
    private final ScheduledExecutorService C;
    private final AtomicBoolean D;
    private Future E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private byte[] K;
    private epxd L;
    private ArrayList M;
    private epza N;
    private aket O;
    private BootstrapConfigurations P;
    private Set Q;
    private final eqcy R;
    private int S;
    public static final baun h;
    public final Context i;
    public final eqme j;
    public final eqfv k;
    public final epyl l;
    public final erpv m;
    public final eqrq n;
    public final ArrayList o;
    public boolean p;
    public eqft q;
    final eqfu r;
    private final epzg s;
    private final BootstrapOptions t;
    private final boolean u;
    private final erpy v;
    private final epwj w;
    private eqcz x;
    private final eqcx y;
    private final ProxyResultReceiver z;

    static {
        eqfo.h = new erqc(new String[]{"D2D", "TargetDirectTransferController"});
    }

    public eqfo(epzg epzg0, BootstrapOptions bootstrapOptions0, erpv erpv0, erpy erpy0, epyl epyl0) {
        epyt epyt0 = new epyt(epzg0.a);
        bbll bbll0 = new bbll(1, 10);
        super(epzg0.b);
        this.o = new ArrayList();
        this.D = new AtomicBoolean(false);
        this.S = 1;
        this.r = new eqfk(this);
        this.R = new eqfl(this);
        this.s = epzg0;
        Context context0 = epzg0.a;
        this.i = context0;
        this.j = (eqme)epzg0.c;
        this.k = epzg0.d;
        gftb.check(bootstrapOptions0);
        this.t = bootstrapOptions0;
        this.l = epyl0;
        this.m = erpv0;
        this.v = erpy0;
        this.B = epyt0;
        this.C = bbll0;
        this.w = epwj.a;
        this.z = new ProxyResultReceiver(epzg0.b, this);
        this.n = new eqrq();
        this.A = eqrn.b(context0);
        this.u = bootstrapOptions0.j == 1;
        if(!erqb.b(bootstrapOptions0.l)) {
            bootstrapOptions0.al(erqb.a());
        }
        bootstrapOptions0.av();
        bootstrapOptions0.ao(hyim.h());
        bootstrapOptions0.w((hyim.l() ? epwh.b() : epwh.a()));
        Account[] arr_account = erpb.a(context0).p("com.google");
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            boolean z = bbmn.w(context0, account0.name);
            BootstrapAccount bootstrapAccount0 = new BootstrapAccount(account0.name, account0.type);
            bootstrapAccount0.t(z);
            arrayList0.add(bootstrapAccount0);
        }
        bootstrapOptions0.q(arrayList0);
        epzc epzc0 = new epzc();
        epzc0.c(1, true);
        epzc0.c(5, hyhe.f());
        epzc0.c(11, bbod.c(hygh.b()));
        epzc0.c(16, true);
        epzc0.c(12, eqfo.C());
        epzc0.c(13, true);
        epzc0.c(14, true);
        epzc0.c(17, false);
        epzc0.c(18, true);
        bootstrapOptions0.y(epzc0.b);
        bootstrapOptions0.ai(epzc0.a);
        bootstrapOptions0.v(azqk.a(context0));
        bootstrapOptions0.x(eqsh.b(context0));
        bootstrapOptions0.s(Build.MODEL);
        bootstrapOptions0.ap(Build.FINGERPRINT);
        bootstrapOptions0.t(eqsh.a(context0));
        baun baun0 = eqfo.h;
        baun0.j("Target OptionFlags: %d, target gmscore version: %d", new Object[]{((long)bootstrapOptions0.r), ((int)bootstrapOptions0.s)});
        bootstrapOptions0.aq(((byte)(eqsh.w(this.i) ? 2 : 1)));
        this.j.w(this.t.l);
        this.j.x(this.u);
        this.j.A();
        if(eqfo.C()) {
            baun0.h("Target supports Fido.", new Object[0]);
            this.x = null;
        }
        else {
            this.x = this.w.b(this.i, this.j, this.R, this.u, false);
        }
        if(bootstrapOptions0.n) {
            baun0.j("Target supports 3P MFM", new Object[0]);
            this.y = new eqcx(this.i, epzg0.b, this.j, this.R, ((boolean)(this.u ^ 1)));
            return;
        }
        baun0.h("Target does not support 3P MFM", new Object[0]);
        this.y = null;
    }

    public final void A(List list0) {
        eqft eqft0 = this.q;
        Bundle bundle0 = Bundle.EMPTY;
        ResultReceiver resultReceiver0 = eqsh.c(this.z);
        boolean z = true;
        if(hygx.k() && bbqa.d()) {
            bundle0 = cjoy.a().setPendingIntentCreatorBackgroundActivityStartMode(1).toBundle();
        }
        Context context0 = this.i;
        if(eqft0 == null) {
            z = false;
        }
        Context context1 = context0.getApplicationContext();
        Intent intent0 = new Intent();
        intent0.setClassName(context0.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity");
        intent0.addFlags(0x10008000);
        intent0.putExtra("resultReceiver", resultReceiver0);
        intent0.putExtra("extraAccountChallengeData", new ArrayList(list0));
        intent0.putExtra("isFidoFlow", z);
        PendingIntent pendingIntent0 = cjok.b(context1, 8, intent0, 0xA000000, bundle0);
        eqfo.h.h("Sending pending intent to listener", new Object[0]);
        this.l.c(pendingIntent0);
    }

    private final void B() {
        Future future0 = this.E;
        if(future0 != null && !this.F && !this.I && !this.J) {
            future0.cancel(true);
            this.E = null;
            this.u(this.o);
        }
    }

    private static boolean C() {
        return SystemProperties.getBoolean("ro.oem.enable_fido_smart_setup", false) || bbod.c(hyhp.a.g().k());
    }

    @Override  // epxa
    protected final erpy a() {
        return this.v;
    }

    @Override  // epxa
    public final void b() {
        super.b();
        eqfo.h.j("Cleaning up.", new Object[0]);
        this.m.b();
        eqft eqft0 = this.q;
        if(eqft0 != null) {
            eqft0.b();
            this.q.a();
        }
        eqcx eqcx0 = this.y;
        if(eqcx0 != null) {
            eqcx0.a();
        }
    }

    @Override  // epxa
    protected final void e() {
        baun baun0 = eqfo.h;
        baun0.j("handleOnCompleted().", new Object[0]);
        this.j.L(14);
        this.j.C();
        AtomicBoolean atomicBoolean0 = this.D;
        if(atomicBoolean0.get()) {
            baun0.h("Complete state is already handled.", new Object[0]);
            return;
        }
        atomicBoolean0.set(true);
        this.m.b();
        this.k.m();
        this.l.a(((AccountTransferResult[])this.o.toArray(new AccountTransferResult[this.o.size()])));
        this.b();
    }

    @Override  // epxa
    protected final void f(int v, String s, eqoc eqoc0) {
        this.j.C();
        this.m.b();
        eqfm eqfm0 = new eqfm(this, v, eqoc0, s);
        this.f.post(eqfm0);
    }

    @Override  // epxa
    protected final void i(MessagePayload messagePayload0) {
        boolean z1;
        int v3;
        int v2;
        BootstrapConfigurations bootstrapConfigurations0 = messagePayload0.e;
        int v = 1;
        if(bootstrapConfigurations0 == null) {
            v2 = 0;
        }
        else {
            baun baun0 = eqfo.h;
            baun0.j("processBootstrapConfigurations.", new Object[0]);
            if(bootstrapConfigurations0.t != null) {
                ProtoLiteBuilder hftp0 = this.j.k;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjng.b(((gjng)hftp0.b_message));
            }
            eqme eqme0 = this.j;
            eqme0.L(2);
            int v1 = bootstrapConfigurations0.k;
            if(v1 > 0 && this.t.p) {
                this.d(v1);
            }
            epzc epzc0 = bootstrapConfigurations0.p();
            this.G = epzc0.b(2);
            this.F = epzc0.b(6);
            this.I = epzc0.b(10);
            this.J = epzc0.b(15);
            baun0.d("from source: %s", new Object[]{epzc0});
            DeviceDetails deviceDetails0 = bootstrapConfigurations0.n;
            if(deviceDetails0 != null) {
                eqme0.I((deviceDetails0.f ? 3 : 2));
                eqme0.K((deviceDetails0.g ? 3 : 2));
                String s = deviceDetails0.h;
                if(s != null) {
                    eqme0.u(s);
                }
                String s1 = deviceDetails0.j;
                if(s1 != null) {
                    eqme0.t(s1);
                }
                if(this.t.f != 0) {
                    eqme0.H(eqsh.x(deviceDetails0.i));
                }
            }
            if(deviceDetails0 != null && deviceDetails0.d) {
                eqme0.J(3);
                eqme0.y(deviceDetails0.e);
                this.S = 3;
            }
            else {
                eqme0.J(2);
                eqme0.y(true);
            }
            this.P = bootstrapConfigurations0;
            v2 = 1;
        }
        if(messagePayload0.c == 5) {
            eqfo.h.h("Starting Fido flow.", new Object[0]);
            eqme eqme1 = this.j;
            eqme1.D(4);
            BootstrapConfigurations bootstrapConfigurations1 = this.P;
            if(bootstrapConfigurations1 == null) {
                v3 = 0;
            }
            else {
                DeviceDetails deviceDetails1 = bootstrapConfigurations1.n;
                if(deviceDetails1 == null) {
                    v3 = 0;
                }
                else if(!deviceDetails1.d) {
                    v3 = 1;
                }
                else {
                    v3 = 2;
                }
            }
            SecondDeviceAuthPayload secondDeviceAuthPayload0 = messagePayload0.p;
            if(secondDeviceAuthPayload0 == null) {
                z1 = false;
            }
            else {
                boolean z = secondDeviceAuthPayload0.f;
                List list0 = secondDeviceAuthPayload0.g;
                if(list0 != null && !list0.isEmpty()) {
                    this.Q = new HashSet();
                    for(Object object0: list0) {
                        BootstrapAccount bootstrapAccount0 = (BootstrapAccount)object0;
                        if(bootstrapAccount0.d) {
                            Set set0 = this.Q;
                            if(set0 != null) {
                                set0.add(bootstrapAccount0.b);
                            }
                        }
                    }
                }
                z1 = z;
            }
            if(this.q == null) {
                this.q = new eqft(this.i, eqme1, this.r, this.u, v3, z1, (this.P == null ? null : this.P.t), this.P.u);
            }
            this.q.l = (long)this.t.l;
            this.q.d();
            v2 = 1;
        }
        if(messagePayload0.c == 6) {
            eqfo.h.h("Source completed fallback.", new Object[0]);
            List list1 = messagePayload0.p == null ? null : messagePayload0.p.a;
            eqft eqft0 = this.q;
            if(eqft0 != null && list1 != null) {
                eqft0.c(list1);
            }
            v2 = 1;
        }
        AccountBootstrapPayload accountBootstrapPayload0 = messagePayload0.g;
        if(accountBootstrapPayload0 != null) {
            if(this.x == null) {
                eqcz eqcz0 = this.w.b(this.i, this.j, this.R, this.u, false);
                this.x = eqcz0;
                int v4 = this.S;
                erek erek0 = eqcz0.a;
                if(v4 == 0) {
                    throw null;
                }
                ergm ergm0 = new ergm(v4);
                azzc azzc0 = new azzc();
                azzc0.a = ergm0;
                azzc0.d = 0x510D;
                ((azts)erek0).iG(azzc0.a());
            }
            this.x.a(accountBootstrapPayload0);
            v2 = 1;
        }
        AccountTransferPayload accountTransferPayload0 = messagePayload0.k;
        if(accountTransferPayload0 != null) {
            eqcx eqcx0 = this.y;
            if(eqcx0 != null) {
                AccountTransferMsg accountTransferMsg0 = accountTransferPayload0.p();
                if(accountTransferMsg0 != null) {
                    eqcx0.c(accountTransferMsg0);
                }
                v2 = 1;
            }
        }
        WorkProfilePayload workProfilePayload0 = messagePayload0.m;
        if(workProfilePayload0 != null) {
            eqfo.h.d("Persisting work profile %s", new Object[]{baun.q(workProfilePayload0.b)});
            this.F = false;
            new eqln(this.i, this.s.b).e(workProfilePayload0);
            this.s.f.f();
            CleanSharedSecretChimeraService.e(this.i);
            this.j.G(workProfilePayload0.q());
            this.B();
            v2 = 1;
        }
        ArrayList arrayList0 = messagePayload0.n;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            this.B.c(arrayList0);
            CleanSharedSecretChimeraService.d(this.i);
            v2 = 1;
        }
        BlockstorePayload blockstorePayload0 = messagePayload0.o;
        if(blockstorePayload0 != null) {
            eqfo.h.d("Process Blockstore data.", new Object[0]);
            this.I = false;
            this.K = blockstorePayload0.b;
            this.B();
            v2 = 1;
        }
        ArrayList arrayList1 = messagePayload0.q;
        if(arrayList1 == null) {
            v = v2;
        }
        else {
            this.M = arrayList1;
            this.J = false;
            this.B();
        }
        SecondDeviceAuthPayload secondDeviceAuthPayload1 = messagePayload0.p;
        if(secondDeviceAuthPayload1 != null) {
            byte[] arr_b = secondDeviceAuthPayload1.c;
            if(arr_b != null) {
                eqft eqft1 = this.q;
                if(eqft1 != null) {
                    eqft1.e(arr_b);
                }
            }
        }
        else if(v == 0) {
            eqfo.h.m("Did not process message for payload: ", new Object[]{messagePayload0.toString()});
        }
    }

    @Override  // epxa
    protected final void o() {
        eqfj eqfj0 = new eqfj();
        Context context0 = this.i;
        if(ccmf.a(((gful_cronetEngineProvider)eqfj0), "work:zero_touch_config_present", context0.getContentResolver())) {
            eqfo.h.d("Zero-touch is enabled on this device, skip account transfer.", new Object[0]);
            this.x(10596, "Zero-touch is enabled on this device, skip account transfer.", null);
            return;
        }
        if(this.O == null) {
            this.O = new aket(context0);
        }
        if(this.O.c()) {
            eqfo.h.d("FRP is enabled on this device, skip account transfer.", new Object[0]);
            this.x(10597, "FRP is enabled on this device, skip account transfer.", null);
            return;
        }
        eqfo.h.d("Sending BootstrapOptions.", new Object[0]);
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.w(this.t);
        this.m(messagePayload0);
    }

    public final void s() {
        this.p = true;
        this.j.k(10564);
        this.m.b();
        this.n.c(0x803, Bundle.EMPTY);
        this.j(1);
        this.b();
    }

    public final void t(List list0) {
        for(Object object0: list0) {
            AccountTransferResult accountTransferResult0 = new AccountTransferResult(((BootstrapAccount)object0), 1);
            this.o.add(accountTransferResult0);
        }
    }

    final void u(List list0) {
        int v3;
        int v2;
        if(this.H) {
            eqfo.h.m("Transfer already completed", new Object[0]);
            return;
        }
        if(this.F) {
            eqfo.h.m("Never received work profile data", new Object[0]);
        }
        this.H = true;
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            AccountTransferResult accountTransferResult0 = (AccountTransferResult)object0;
            if(accountTransferResult0.c == 1) {
                arrayList0.add(new Account(accountTransferResult0.b.b, accountTransferResult0.b.c));
            }
        }
        if(!arrayList0.isEmpty() && (this.M != null && !this.M.isEmpty())) {
            eqfo.h.d("Storing folsom data.", new Object[0]);
            if(this.N == null) {
                this.N = new epza(this.i);
            }
            gmcd gmcd0 = this.N.c(this.M, arrayList0);
            if(gmcd0 != null) {
                gmcd0.hB(() -> try {
                    Integer integer0 = (Integer)gmbu.r(gmcd0);
                    int v = (int)integer0;
                    eqfo.h.d("Stored keys for %s accounts.", new Object[]{integer0});
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjno.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjno gjno0 = (gjno)hftp0.b_message;
                    gjno0.b |= 1;
                    gjno0.c = v;
                    gjno gjno1 = (gjno)hftp0.N_build();
                    this.j.o(gjno1);
                }
                catch(ExecutionException | CancellationException exception0) {
                    eqfo.h.n("Unable to store all the keys.", exception0, new Object[0]);
                }, new bbre(this.f));
            }
        }
        ArrayList arrayList1 = new ArrayList();
        Account account0 = null;
        boolean z = false;
        for(Object object1: list0) {
            AccountTransferResult accountTransferResult1 = (AccountTransferResult)object1;
            if(accountTransferResult1.c == 1) {
                Account account1 = new Account(accountTransferResult1.b.b, accountTransferResult1.b.c);
                if(bbmn.w(this.i, account1.name)) {
                    accountTransferResult1.b.t(true);
                    arrayList1.add(account1);
                    account0 = account1;
                }
                else {
                    Set set0 = this.Q;
                    if(set0 == null) {
                        if(this.A.c(account1)) {
                            accountTransferResult1.b.s(true);
                            arrayList1.add(account1);
                        }
                    }
                    else if(set0.contains(account1.name)) {
                        accountTransferResult1.b.s(true);
                        arrayList1.add(account1);
                    }
                }
                z = true;
            }
        }
        if(z && this.K != null) {
            if(this.L == null) {
                this.L = new epxd(this.i, ((eqme)this.s.c));
            }
            this.L.c(this.K, this.f);
        }
        if((!this.u || this.q != null) && !arrayList1.isEmpty() && !hyim.a.e().H()) {
            ArrayList arrayList2 = new ArrayList();
            int v = arrayList1.size();
            int v1 = 0;
            while(v1 < v) {
                Account account2 = (Account)arrayList1.get(v1);
                Bundle bundle0 = new Bundle();
                bundle0.putString("theme", bagv.c());
                eqlf eqlf0 = this.A;
                eqln eqln0 = new eqln(this.i, this.s.b);
                try {
                    v2 = ((ManagedAccountSetupInfo)evrg.n(eqln0.c())).b;
                }
                catch(InterruptedException | ExecutionException exception0) {
                    eqfo.h.l(exception0);
                    v2 = 0;
                }
                if(!this.G) {
                    switch(v2) {
                        case 3: {
                            v3 = 2;
                            goto label_72;
                        }
                        case 4: {
                            break;
                        }
                        default: {
                            v3 = 0;
                            goto label_72;
                        }
                    }
                }
                v3 = 1;
            label_72:
                Intent intent0 = eqlf0.a(account2, bundle0, new ManagedAuthOptions(v3, (this.t.b == 3 ? 1 : 0)));
                if(intent0 != null) {
                    arrayList2.add(intent0);
                }
                ++v1;
            }
            if(arrayList2.isEmpty()) {
                this.w();
                return;
            }
            TargetDirectTransferController.4 targetDirectTransferController$40 = new TargetDirectTransferController.4(this, this.f, account0);
            Intent intent1 = new Intent();
            intent1.setClassName(this.i.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.ForwardingActivity");
            intent1.putParcelableArrayListExtra("intents", arrayList2);
            intent1.putExtra("resultReceiver", ForwardingChimeraActivity.k(targetDirectTransferController$40));
            Bundle bundle1 = !hygx.k() || !bbqa.d() ? Bundle.EMPTY : cjoy.a().setPendingIntentCreatorBackgroundActivityStartMode(1).toBundle();
            PendingIntent pendingIntent0 = cjok.b(this.i.getApplicationContext(), 1, intent1, 0xA000000, bundle1);
            this.l.c(pendingIntent0);
            return;
        }
        this.w();
    }

    public final void v() {
        eqfo.h.h("handleAccountTransferCompletion.", new Object[0]);
        this.j.L(15);
        if(!this.F && !this.I && !this.J) {
            this.u(this.o);
            return;
        }
        eqfh eqfh0 = new eqfh(this);
        long v = hyhe.b();
        this.E = ((bbll)this.C).h(eqfh0, v, TimeUnit.MILLISECONDS);
    }

    public final void w() {
        if(!hygx.m() && this.q == null) {
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.t(this.o);
            this.m(messagePayload0);
            this.j(2);
            return;
        }
        MessagePayload messagePayload1 = new MessagePayload();
        messagePayload1.x(2);
        MessagePayload messagePayload2 = new MessagePayload();
        messagePayload2.t(this.o);
        this.n(new eqfn(this), new MessagePayload[]{messagePayload2, messagePayload1});
    }

    public final void x(int v, String s, eqoc eqoc0) {
        this.m.b();
        this.k(v);
        this.f(v, s, eqoc0);
    }

    @Override  // eqro
    public final void y(int v, Bundle bundle0) {
        switch(v) {
            case 2001: {
                ResultReceiver resultReceiver0 = eqfo.q(bundle0);
                this.n.a(resultReceiver0);
                return;
            }
            case 2002: {
                this.n.b();
                return;
            }
            case 2003: {
                this.t(eqsh.k(bundle0.getParcelableArrayList("accountChallengeData")));
                this.u(this.o);
                return;
            }
            case 2004: {
                this.x(10598, "User nagivated back in UI.", null);
                return;
            }
            case 2005: {
                int v1 = bundle0.getInt("dependencyErrorCode");
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((eqoc)hftv0).c = 5;
                ((eqoc)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                eqoc eqoc0 = (eqoc)hftp0.b_message;
                eqoc0.b |= 2;
                eqoc0.d = v1;
                this.x(10599, "Error happened during fallback challenge webview.", ((eqoc)hftp0.N_build()));
                return;
            }
            default: {
                throw new RuntimeException("Unknown result code: " + v);
            }
        }
    }
}

