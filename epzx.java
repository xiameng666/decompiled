import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.ProgressEvent;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class epzx extends epwu {
    public static final baun f;
    public final Context g;
    public final eqlx h;
    public epyj i;
    public BootstrapConfigurations j;
    public boolean k;
    public epzl l;
    public epzj m;
    public eqcp n;
    public boolean o;
    public final eqcq p;
    public final epzk q;
    private final eqfv r;
    private final eqih s;
    private final epwj t;
    private BootstrapOptions u;
    private final eqln v;
    private final epyt w;
    private final epxd x;
    private final epza y;
    private final cchj z;

    static {
        epzx.f = new erqc(new String[]{"D2D", "SourceDeviceBootstrapController"});
    }

    public epzx(epzg epzg0, epwt epwt0, eqih eqih0) {
        eqln eqln0 = new eqln(epzg0.a, epzg0.b);
        epyt epyt0 = new epyt(epzg0.a);
        epxd epxd0 = new epxd(epzg0.a);
        epza epza0 = new epza(epzg0.a);
        super(epzx.f, epzg0.b, epwt0);
        this.k = false;
        this.p = new epzv(this);
        this.q = new epzw(this);
        batl.s(epzg0.a);
        this.g = epzg0.a;
        this.r = epzg0.d;
        this.h = (eqlx)epzg0.c;
        batl.s(eqih0);
        this.s = eqih0;
        this.t = epwj.a;
        this.v = eqln0;
        this.w = epyt0;
        this.x = epxd0;
        this.y = epza0;
        this.z = erpb.a(epzg0.a);
    }

    @Override  // epwu
    protected final epyj b() {
        return this.i;
    }

    @Override  // epwu
    public final void c() {
        epzx.f.j("cleanup()", new Object[0]);
        super.c();
        if(this.l != null) {
            this.l = null;
        }
        epzj epzj0 = this.m;
        if(epzj0 != null) {
            epzj0.a();
        }
        eqcp eqcp0 = this.n;
        if(eqcp0 != null) {
            eqcp0.a();
        }
        super.d();
        this.i = null;
    }

    @Override  // epwu
    public final void g(int v, eqoc eqoc0) {
        this.r.o(v, eqoc0);
        try {
            this.s.c(v);
        }
        catch(RemoteException remoteException0) {
            epzx.f.g("Error invoking callback.", remoteException0, new Object[0]);
        }
    }

    @Override  // epwu
    protected final void i(MessagePayload messagePayload0) {
        this.h.z(10);
        BootstrapOptions bootstrapOptions0 = this.u;
        long v = hyim.a.e().q();
        if(v > 0L && ((long)bootstrapOptions0.s) < hyim.a.e().i()) {
            epzx.f.j("Waiting %dms before sending completion.", new Object[]{v});
            try {
                Thread.sleep(v);
            }
            catch(InterruptedException interruptedException0) {
                epzx.f.l(interruptedException0);
            }
        }
        this.k(2);
        super.i(messagePayload0);
    }

    @Override  // epwu
    protected final void j(MessagePayload messagePayload0) {
        boolean z;
        baun baun0 = epzx.f;
        baun0.j("Processing MessagePayload.", new Object[0]);
        DisplayText displayText0 = messagePayload0.f;
        if(displayText0 != null) {
            baun0.j("Processing DisplayText", new Object[0]);
            String s = displayText0.b;
            if(!TextUtils.isEmpty(s)) {
                this.d.a(s);
            }
        }
        BootstrapOptions bootstrapOptions0 = messagePayload0.d;
        if(bootstrapOptions0 != null) {
            baun0.d("Processing bootstrapOptions: " + bootstrapOptions0.toString(), new Object[0]);
            eqlx eqlx0 = this.h;
            int v = 2;
            eqlx0.z(2);
            this.u = bootstrapOptions0;
            if(!erqb.b(bootstrapOptions0.l)) {
                bootstrapOptions0.al(erqb.a());
            }
            epzc epzc0 = bootstrapOptions0.p();
            baun0.d("from target %s", new Object[]{epzc0});
            int v1 = bootstrapOptions0.f;
            int v2 = bootstrapOptions0.y == 0 ? bootstrapOptions0.s : bootstrapOptions0.y;
            if(epzc0.b(12)) {
                z = true;
            }
            else if(hyhp.l() && v1 == 3) {
                z = ((long)v2) >= hyhp.c();
                v1 = 3;
            }
            else {
                z = false;
            }
            this.o = z;
            eqlx0.p(v2);
            if(!this.o) {
                v = 3;
            }
            eqlx0.x(v);
            eqlx0.m(this.u.l);
            eqlx0.n(this.u.i);
            String s1 = bootstrapOptions0.g;
            if(s1 != null) {
                eqlx0.l(s1);
            }
            String s2 = bootstrapOptions0.D;
            if(s2 != null) {
                eqlx0.k(s2);
            }
            if(v1 != 0) {
                eqlx0.w(eqsh.x(((byte)v1)));
            }
            eqlx0.y(eqsh.y(bootstrapOptions0.B));
            try {
                this.s.a(this.u);
            }
            catch(RemoteException remoteException0) {
                epzx.f.g("Error invoking callback.", remoteException0, new Object[0]);
            }
        }
        AccountBootstrapPayload accountBootstrapPayload0 = messagePayload0.g;
        if(accountBootstrapPayload0 != null) {
            epzl epzl0 = this.l;
            if(epzl0 != null) {
                epzl0.a(accountBootstrapPayload0);
            }
        }
        ProgressEvent progressEvent0 = messagePayload0.h;
        if(progressEvent0 != null) {
            epzx.f.j("Processing ProgressEvent", new Object[0]);
            this.d.c(new BootstrapProgressResult(progressEvent0.b, new Bundle()));
        }
        AccountTransferPayload accountTransferPayload0 = messagePayload0.k;
        if(accountTransferPayload0 != null) {
            epzj epzj0 = this.m;
            if(epzj0 != null) {
                epzj0.b(accountTransferPayload0);
            }
        }
        SecondDeviceAuthPayload secondDeviceAuthPayload0 = messagePayload0.p;
        if(secondDeviceAuthPayload0 != null) {
            byte[] arr_b = secondDeviceAuthPayload0.c;
            eqcp eqcp0 = this.n;
            if(eqcp0 != null && arr_b != null) {
                eqcp0.e(arr_b);
            }
            List list0 = secondDeviceAuthPayload0.a;
            if(list0 != null && !list0.isEmpty()) {
                this.h.z(9);
                batl.c(this.u.i, "BootstrapOptions doesn\'t expect source fallback challenges.");
                if(hyhp.l()) {
                    this.k = true;
                }
                Bundle bundle0 = new Bundle();
                bundle0.putParcelableArrayList("accounts", eqsh.o(list0));
                this.d.c(new BootstrapProgressResult(1, bundle0));
            }
        }
    }

    public final void p(BootstrapConfigurations bootstrapConfigurations0, int v) {
        batl.t(bootstrapConfigurations0, "bootstrapConfigurations cannot be null.");
        this.j = bootstrapConfigurations0;
        baun baun0 = epzx.f;
        baun0.d("Starting bootstrap", new Object[0]);
        boolean z = erpc.a(this.u);
        if(z) {
            this.m = new epzj(this.g, this.h, this.q, this.j.f, this.u.i);
        }
        if(!z && !this.o) {
            this.l = this.t.a(this.g, this.h, this.q, this.u.i, bootstrapConfigurations0.f, bootstrapConfigurations0.g);
        }
        int v1 = this.u.q;
        if(this.u.p && v1 > 0) {
            bootstrapConfigurations0.v(v1);
        }
        else {
            bootstrapConfigurations0.v(0);
        }
        eqlx eqlx0 = this.h;
        eqlx0.j(this.s());
        Context context0 = this.g;
        DeviceDetails deviceDetails0 = new DeviceDetails(bbmq.d(context0), azqk.a(context0));
        deviceDetails0.r(eqqx.b(context0));
        deviceDetails0.s(erpk.a(context0));
        deviceDetails0.t(Build.MODEL);
        deviceDetails0.q(eqsh.a(context0));
        deviceDetails0.p(Build.FINGERPRINT);
        bootstrapConfigurations0.t(deviceDetails0);
        epzc epzc0 = this.u.p();
        epzc epzc1 = bootstrapConfigurations0.p();
        BootstrapOptions bootstrapOptions0 = this.u;
        if(bootstrapOptions0.v != null) {
            new eqrm(context0).b(bootstrapOptions0.v, bootstrapOptions0.l);
            epzc1.c(4, true);
        }
        gjmw gjmw0 = equu.b(context0, this.u.u);
        ProtoLiteBuilder hftp0 = eqlx0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjmz)hftp0.b_message).f = gjmw0.e;
        ((gjmz)hftp0.b_message).b |= 8;
        switch(gjmw0.ordinal()) {
            case 1: {
                epzc1.c(8, true);
                break;
            }
            case 2: {
                epzc1.c(9, true);
            }
        }
        evql evql0 = this.v.a(epzc0, epzc1);
        evql evql1 = this.w.a(epzc1, this.u.w);
        evql evql2 = this.x.a(epzc0, epzc1);
        gmcd gmcd0 = this.y.a(epzc0, epzc1, bootstrapConfigurations0);
        bootstrapConfigurations0.w(epzc1);
        this.r(bootstrapConfigurations0, false);
        if(bootstrapConfigurations0.k > 0) {
            this.e(this.u.q);
        }
        if(evql1 != null) {
            evql1.y(new bbre(this.c), new epzq(this));
        }
        if(!this.u.ar() && this.s() == 0 && gjmw0 != gjmw.a) {
            baun0.d("Skipping account transfer because accounts are not required, there are no accounts and WiFi D2D is supported on the device.", new Object[0]);
            this.k(4);
            super.i(new MessagePayload());
            return;
        }
        epzt epzt0 = new epzt(this, z, evql0, evql2, gmcd0);
        if(v == 1) {
            long v2 = hyim.a.e().l();
            if(v2 <= 0L) {
                epzt0.run();
                return;
            }
            baun0.d("Delaying for %dms before sending next message", new Object[]{v2});
            this.c.postDelayed(epzt0, v2);
            return;
        }
        epzt0.run();
    }

    public final void q(gmcd gmcd0) {
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
            this.h.i(gjno1);
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.ap(arrayList0);
            this.n(messagePayload0);
        }
        catch(ExecutionException | CancellationException exception0) {
            epzx.f.n("Unable to get folsom data payloads.", exception0, new Object[0]);
        }
    }

    public final void r(BootstrapConfigurations bootstrapConfigurations0, boolean z) {
        epzx.f.d("Sending BootstrapConfigurations.", new Object[0]);
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.v(bootstrapConfigurations0);
        messagePayload0.i = z;
        messagePayload0.a.add(Integer.valueOf(9));
        this.n(messagePayload0);
    }

    private final int s() {
        return this.z.p("com.google").length;
    }
}

