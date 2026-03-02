import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class fnem {
    public final Context a;
    public final AtomicReference b;
    public final AtomicBoolean c;
    public final AtomicReference d;
    public final AtomicReference e;
    private final long f;
    private final long g;

    public fnem(Context context0) {
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        super();
        this.a = context0;
        this.b = new AtomicReference(null);
        this.c = new AtomicBoolean(false);
        this.d = new AtomicReference(fnen.a);
        this.e = new AtomicReference("");
        this.f = 10000L;
        this.g = 30000L;
    }

    public final void a() {
        this.c.set(false);
        this.b.set(null);
        if(this.d.get() != fnen.b && this.d.get() != fnen.c) {
            return;
        }
        this.d.set(fnen.a);
        sct.a("AobPlayController", "Connection to PlaySetupService disconnected. Retrying");
        fneq.a(new fneb(this), new fnec());
    }

    static Object b(fnem fnem0, String s, ibrl ibrl0) {
        Object object1;
        Object object0;
        fneg fneg0;
        if((ibrl0 instanceof fneg)) {
            fneg0 = (fneg)ibrl0;
            int v = fneg0.b;
            if((v & 0x80000000) == 0) {
                fneg0 = new fneg(fnem0, ibrl0);
            }
            else {
                fneg0.b = v - 0x80000000;
            }
        }
        else {
            fneg0 = new fneg(fnem0, ibrl0);
        }
        try {
            object0 = fneg0.a;
            object1 = ibrx.a;
            switch(fneg0.b) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_20;
                }
                case 2: {
                    goto label_31;
                }
            }
        }
        catch(Exception exception0) {
            goto label_37;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        fnem0.e.set(s);
        try {
            fneg0.d = fnem0;
            fneg0.b = 1;
            object0 = fnem0.d(fneg0);
            if(object0 == object1) {
                return object1;
            }
            goto label_22;
        label_20:
            fnem0 = fneg0.d;
            ibnx.b(object0);
        label_22:
            if(!((Boolean)object0).booleanValue()) {
                sct.a("AobPlayController", "Unable to bind to PlaySetupService for package-com.google.android.gms");
                return fneo.f;
            }
            fnem0.d.set(fnen.b);
            fneg0.d = fnem0;
            fneg0.b = 2;
            object0 = icfo.a(30000L, new fneh(fnem0, null), fneg0);
            if(object0 == object1) {
                return object1;
            label_31:
                fnem0 = fneg0.d;
                ibnx.b(object0);
            }
            if(((fneo)object0) == fneo.a) {
                fnem0.d.set(fnen.c);
            }
            return object0;
        }
        catch(Exception exception0) {
        label_37:
            if((exception0 instanceof icfl)) {
                return fneo.g;
            }
            return (exception0 instanceof SecurityException) ? fneo.b : fneo.e;
        }
    }

    public static Object c(fnem fnem0, String s, ibrl ibrl0) {
        Object object1;
        Object object0;
        fnei fnei0;
        if((ibrl0 instanceof fnei)) {
            fnei0 = (fnei)ibrl0;
            int v = fnei0.b;
            if((v & 0x80000000) == 0) {
                fnei0 = new fnei(fnem0, ibrl0);
            }
            else {
                fnei0.b = v - 0x80000000;
            }
        }
        else {
            fnei0 = new fnei(fnem0, ibrl0);
        }
        try {
            object0 = fnei0.a;
            object1 = ibrx.a;
            switch(fnei0.b) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_20;
                }
                case 2: {
                    goto label_30;
                }
            }
        }
        catch(Exception exception0) {
            goto label_36;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        fnem0.e.set(s);
        try {
            fnei0.d = fnem0;
            fnei0.b = 1;
            object0 = fnem0.d(fnei0);
            if(object0 == object1) {
                return object1;
            }
            goto label_22;
        label_20:
            fnem0 = fnei0.d;
            ibnx.b(object0);
        label_22:
            if(!((Boolean)object0).booleanValue()) {
                sct.a("AobPlayController", "Unable to bind to PlaySetupService for package-com.google.android.gms");
                return fnep.d;
            }
            fnei0.d = fnem0;
            fnei0.b = 2;
            object0 = icfo.a(30000L, new fnel(fnem0, null), fnei0);
            if(object0 == object1) {
                return object1;
            label_30:
                fnem0 = fnei0.d;
                ibnx.b(object0);
            }
            if(((fnep)object0) == fnep.a) {
                fnem0.d.set(fnen.a);
            }
            return object0;
        }
        catch(Exception exception0) {
        label_36:
            if((exception0 instanceof icfl)) {
                return fnep.e;
            }
            return (exception0 instanceof SecurityException) ? fnep.b : fnep.c;
        }
    }

    private final Object d(ibrl ibrl0) {
        return icfo.a(10000L, new fned(this, null), ibrl0);
    }
}

