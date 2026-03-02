import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public final class croz extends crbz {
    public final croy a;
    public crii b;
    public volatile Boolean c;
    public ScheduledExecutorService d;
    private final crdj e;
    private final crpu f;
    private final List g;
    private final crdj h;

    public croz(crkt crkt0) {
        super(crkt0);
        this.g = new ArrayList();
        this.f = new crpu();
        this.a = new croy(this);
        this.e = new croh(this, crkt0);
        this.h = new crok(this, crkt0);
    }

    protected final void A(crns crns0) {
        this.n();
        this.a();
        this.x(new croi(this, crns0));
    }

    protected final void B(crii crii0) {
        this.n();
        this.b = crii0;
        this.w();
        this.t();
    }

    public final boolean C() {
        this.n();
        this.a();
        return this.b != null;
    }

    final boolean D() {
        this.n();
        this.a();
        return this.F() ? this.aq().k() >= ((int)(((Integer)crif.ay.a()))) : true;
    }

    final boolean E() {
        this.n();
        this.a();
        return this.F() ? this.aq().k() >= 241200 : true;
    }

    final boolean F() {
        this.n();
        this.a();
        if(this.c == null) {
            this.n();
            this.a();
            crjx crjx0 = this.ap();
            crjx0.n();
            boolean z = false;
            Boolean boolean0 = crjx0.b().contains("use_service") ? Boolean.valueOf(crjx0.b().getBoolean("use_service", false)) : null;
            boolean z1 = true;
            if(boolean0 == null || !boolean0.booleanValue()) {
                if(!this.al().a && this.f().q() != 1) {
                    this.aJ().k.a("Checking service availability");
                    crqx crqx0 = this.aq();
                    int v = azpn.d.m(crqx0.aj());
                    switch(v) {
                        case 0: {
                            this.aJ().k.a("Service available");
                            z = true;
                            break;
                        }
                        case 1: {
                            this.aJ().k.a("Service missing");
                            break;
                        }
                        case 2: {
                            this.aJ().j.a("Service container out of date");
                            if(this.aq().k() >= 0x4423) {
                                if(boolean0 != null) {
                                    z1 = false;
                                }
                                z = z1;
                                z1 = false;
                            }
                            break;
                        }
                        case 3: {
                            this.aJ().f.a("Service disabled");
                            z1 = false;
                            break;
                        }
                        case 9: {
                            this.aJ().f.a("Service invalid");
                            z1 = false;
                            break;
                        }
                        case 18: {
                            this.aJ().f.a("Service updating");
                            z = true;
                            break;
                        }
                        default: {
                            this.aJ().f.b("Unexpected service status", Integer.valueOf(v));
                            z1 = false;
                        }
                    }
                }
                else {
                    z = true;
                }
                if(!z && this.am().y()) {
                    this.aJ().c.a("No way to upload. Consider using the full version of Analytics");
                }
                else if(z1) {
                    crjx crjx1 = this.ap();
                    crjx1.n();
                    SharedPreferences.Editor sharedPreferences$Editor0 = crjx1.b().edit();
                    sharedPreferences$Editor0.putBoolean("use_service", z);
                    sharedPreferences$Editor0.apply();
                }
                z1 = z;
            }
            this.c = Boolean.valueOf(z1);
        }
        return this.c.booleanValue();
    }

    public final boolean G() {
        return !this.al().a;
    }

    protected final void H() {
        this.n();
        this.a();
        if(this.D()) {
            this.x(new crom(this, this.q(false)));
        }
    }

    @Override  // crbz
    protected final boolean p() {
        return false;
    }

    public final AppMetadata q(boolean z) {
        String s = null;
        if(!this.al().a) {
            crin crin0 = this.f();
            if(z) {
                s = this.aJ().f();
            }
            return crin0.t(s);
        }
        return null;
    }

    final void r() {
        this.n();
        this.a();
        if(!this.C()) {
            if(this.F()) {
                croy croy0 = this.a;
                croy0.c.n();
                Context context0 = croy0.c.aj();
                synchronized(croy0) {
                    if(croy0.a) {
                        croy0.c.aJ().k.a("Connection attempt already in progress");
                        return;
                    }
                    if(croy0.b != null && (croy0.b.B() || croy0.b.A())) {
                        croy0.c.aJ().k.a("Already awaiting connection attempt");
                        return;
                    }
                    croy0.b = new cris(context0, Looper.getMainLooper(), croy0, croy0);
                    croy0.c.aJ().k.a("Connecting to remote service");
                    croy0.a = true;
                    batl.s(croy0.b);
                    croy0.b.M();
                }
                return;
            }
            if(!this.am().y()) {
                if(!this.al().a) {
                    Intent intent0 = new Intent().setClassName(this.aj(), "com.google.android.gms.measurement.AppMeasurementService");
                    List list0 = this.aj().getPackageManager().queryIntentServices(intent0, 0x10000);
                    if(list0 != null && !list0.isEmpty()) {
                        Intent intent1 = new Intent("com.google.android.gms.measurement.START");
                        intent1.setComponent(new ComponentName(this.aj(), (this.al().a ? "com.google.android.gms.measurement.PackageMeasurementService" : "com.google.android.gms.measurement.AppMeasurementService")));
                        croy croy1 = this.a;
                        croy1.c.n();
                        Context context1 = croy1.c.aj();
                        bbic bbic0 = bbic.a();
                        synchronized(croy1) {
                            if(croy1.a) {
                                croy1.c.aJ().k.a("Connection attempt already in progress");
                                return;
                            }
                            croy1.c.aJ().k.a("Using local app measurement service");
                            croy1.a = true;
                            bbic0.d(context1, intent1, croy1.c.a, 0x81);
                        }
                        return;
                    }
                }
                this.aJ().c.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    public final void s() {
        this.n();
        this.a();
        croy croy0 = this.a;
        if(croy0.b != null && (croy0.b.A() || croy0.b.B())) {
            croy0.b.m();
        }
        try {
            croy0.b = null;
            bbic.a().b(this.aj(), croy0);
        }
        catch(IllegalStateException | IllegalArgumentException unused_ex) {
        }
        this.b = null;
    }

    public final void t() {
        this.n();
        this.aJ().k.b("Processing queued up service tasks", Integer.valueOf(this.g.size()));
        for(Object object0: this.g) {
            Runnable runnable0 = (Runnable)object0;
            try {
                runnable0.run();
            }
            catch(RuntimeException runtimeException0) {
                this.aJ().c.b("Task exception while flushing queue", runtimeException0);
            }
        }
        this.g.clear();
        this.h.a();
    }

    public final void u(AtomicReference atomicReference0) {
        this.n();
        this.a();
        this.x(new croe(this, atomicReference0, this.q(false)));
    }

    public final void v(ComponentName componentName0) {
        this.n();
        if(this.b != null) {
            this.b = null;
            this.aJ().k.b("Disconnected from device MeasurementService", componentName0);
            this.n();
            this.r();
        }
    }

    public final void w() {
        this.n();
        this.f.a();
        long v = (long)(((Long)crif.X.a()));
        this.e.c(v);
    }

    public final void x(Runnable runnable0) {
        this.n();
        if(this.C()) {
            runnable0.run();
            return;
        }
        List list0 = this.g;
        if(((long)list0.size()) >= 1000L) {
            this.aJ().c.a("Discarding data. Max runnable queue size reached");
            return;
        }
        list0.add(runnable0);
        this.h.c(60000L);
        this.r();
    }

    final void y(crii crii0, AbstractSafeParcelable abstractSafeParcelable0, AppMetadata appMetadata0) {
        long v9;
        long v8;
        long v7;
        long v6;
        AppMetadata appMetadata2;
        boolean z2;
        int v5;
        int v2;
        AbstractSafeParcelable abstractSafeParcelable1 = abstractSafeParcelable0;
        this.n();
        this.m();
        this.a();
        boolean z = this.G();
        AppMetadata appMetadata1 = appMetadata0;
        int v = 100;
        int v1 = 0;
        while(v1 < 1001 && v == 100) {
            ArrayList arrayList0 = new ArrayList();
            if(z) {
                List list0 = this.g().u();
                if(list0 != null) {
                    arrayList0.addAll(list0);
                    v2 = list0.size();
                    goto label_17;
                }
            }
            v2 = 0;
        label_17:
            if(abstractSafeParcelable1 != null && v2 < 100) {
                arrayList0.add(new crip(abstractSafeParcelable1, appMetadata1.c, appMetadata1.j));
            }
            boolean z1 = this.am().t(crif.aB);
            int v3 = arrayList0.size();
            int v4 = 0;
            while(v4 < v3) {
                crip crip0 = (crip)arrayList0.get(v4);
                AbstractSafeParcelable abstractSafeParcelable2 = crip0.a;
                if(this.am().t(crif.aL)) {
                    String s = crip0.b;
                    if(!TextUtils.isEmpty(s)) {
                        v5 = v1;
                        z2 = z;
                        appMetadata2 = new AppMetadata(appMetadata1.a, appMetadata1.b, s, crip0.c, appMetadata1.d, appMetadata1.e, appMetadata1.f, appMetadata1.g, appMetadata1.h, appMetadata1.i, appMetadata1.k, appMetadata1.l, appMetadata1.m, appMetadata1.n, appMetadata1.o, appMetadata1.p, appMetadata1.q, appMetadata1.r, appMetadata1.s, appMetadata1.t, appMetadata1.u, appMetadata1.v, appMetadata1.w, appMetadata1.x, appMetadata1.y, appMetadata1.z, appMetadata1.A, appMetadata1.B, appMetadata1.C, appMetadata1.D, appMetadata1.E);
                        goto label_35;
                    }
                }
                z2 = z;
                v5 = v1;
                appMetadata2 = appMetadata1;
            label_35:
                if((abstractSafeParcelable2 instanceof EventParcel)) {
                    if(z1) {
                        try {
                            v6 = System.currentTimeMillis();
                            v7 = SystemClock.elapsedRealtime();
                        }
                        catch(RemoteException remoteException0) {
                            v8 = v6;
                            v9 = 0L;
                            goto label_55;
                        }
                        v8 = v6;
                        v9 = v7;
                    }
                    else {
                        v9 = 0L;
                        v8 = 0L;
                    }
                    try {
                        crii0.i(((EventParcel)abstractSafeParcelable2), appMetadata2);
                        if(z1) {
                            this.aJ().k.a("Logging telemetry for logEvent from database");
                            criv.a(this.y).b(0, v8, System.currentTimeMillis(), ((int)(SystemClock.elapsedRealtime() - v9)));
                        }
                        goto label_78;
                    }
                    catch(RemoteException remoteException0) {
                    }
                label_55:
                    this.aJ().c.b("Failed to send event to the service", remoteException0);
                    if(z1 && v8 != 0L) {
                        criv.a(this.y).b(13, v8, System.currentTimeMillis(), ((int)(SystemClock.elapsedRealtime() - v9)));
                    }
                }
                else if((abstractSafeParcelable2 instanceof UserAttributeParcel)) {
                    try {
                        crii0.x(((UserAttributeParcel)abstractSafeParcelable2), appMetadata2);
                    }
                    catch(RemoteException remoteException1) {
                        this.aJ().c.b("Failed to send user property to the service", remoteException1);
                    }
                }
                else if((abstractSafeParcelable2 instanceof ConditionalUserPropertyParcel)) {
                    try {
                        crii0.l(((ConditionalUserPropertyParcel)abstractSafeParcelable2), appMetadata2);
                    }
                    catch(RemoteException remoteException2) {
                        this.aJ().c.b("Failed to send conditional user property to the service", remoteException2);
                    }
                }
                else if(this.am().t(crif.aL) && (abstractSafeParcelable2 instanceof EventParams)) {
                    try {
                        crii0.p(((EventParams)abstractSafeParcelable2).a(), appMetadata2);
                    }
                    catch(RemoteException remoteException3) {
                        this.aJ().c.b("Failed to send default event parameters to the service", remoteException3);
                    }
                }
                else {
                    this.aJ().c.a("Discarding data. Unrecognized parcel type.");
                }
            label_78:
                ++v4;
                v1 = v5;
                appMetadata1 = appMetadata2;
                z = z2;
            }
            ++v1;
            abstractSafeParcelable1 = abstractSafeParcelable0;
            v = v2;
        }
    }

    protected final void z(ConditionalUserPropertyParcel conditionalUserPropertyParcel0) {
        boolean z;
        this.n();
        this.a();
        int v = this.al().a;
        if(v == 0) {
            criq criq0 = this.g();
            byte[] arr_b = criq0.aq().ag(conditionalUserPropertyParcel0);
            if(arr_b.length > 0x20000) {
                criq0.aJ().d.a("Conditional user property too long for local database. Sending directly to service");
                z = false;
            }
            else if(criq0.t(2, arr_b)) {
                z = true;
            }
            else {
                z = false;
            }
        }
        else {
            z = false;
        }
        ConditionalUserPropertyParcel conditionalUserPropertyParcel1 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel0);
        this.x(new croo(this, ((boolean)(v ^ 1)), this.q(true), z, conditionalUserPropertyParcel1, conditionalUserPropertyParcel0));
    }
}

