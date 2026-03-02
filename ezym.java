import android.content.Context;
import android.content.Intent;
import android.os.RecoverySystem;
import java.io.IOException;

public final class ezym {
    public static final baun a;
    public static final fage b;
    public final Context c;
    public final fagt d;
    public final fabj e;
    public final Object f;
    public final Object g;
    public ezyj h;
    public boolean i;

    static {
        ezym.a = fabk.e("ExecutionManager");
        ezym.b = new ezyl();
    }

    public ezym(Context context0) {
        batl.s(context0);
        this.c = context0;
        this.d = (fagt)fagt.a.b();
        this.e = new fabj(context0);
        this.g = new Object();
        this.f = new Object();
    }

    public final ezyj a() {
        ezyj ezyj0;
        Context context0;
        fagj fagj0;
        synchronized(this.f) {
            fagt fagt0 = this.d;
            fagu fagu0 = ezyq.b;
            String s = (String)fagt0.b(fagu0);
            fagj0 = (fagj)fagt0.b(ezyq.c);
            if(gfta.c(s)) {
                s = "pending";
                fagt0.e(new fagh[]{new fagh(fagu0, "pending")});
            }
            try {
                context0 = this.c;
                switch(s) {
                    case "ab-reboot": {
                        ezyj0 = new ezyv(context0, fagj0);
                        break;
                    }
                    case "ab-update-prep": {
                        ezyj0 = new ezyw(context0, fagj0);
                        break;
                    }
                    case "delayed-auto-resume-execution": {
                        ezyj0 = new ezza(context0, fagj0);
                        break;
                    }
                    case "exponential-backoff-delay-execution": {
                        ezyj0 = new ezzc(context0, fagj0);
                        break;
                    }
                    case "finished-execution": 
                    case "permanent-failure": {
                        ezyj0 = new ezzd(fagj0);
                        break;
                    }
                    case "fixed-delay-execution": {
                        ezyj0 = new ezzf(context0, fagj0);
                        break;
                    }
                    case "non-ab-install": 
                    case "non-ab-install-action": {
                        ezyj0 = new ezzh(fagj0);
                        break;
                    }
                    case "non-ab-reboot": {
                        ezyj0 = new ezzk(context0, fagj0);
                        break;
                    }
                    case "non-streaming-ab-apply": 
                    case "non-streaming-ab-apply-action": {
                        ezyj0 = new ezzl(context0, fagj0);
                        break;
                    }
                    case "non-streaming-download": {
                        ezyj0 = new ezzm(context0, fagj0);
                        break;
                    }
                    case "non-streaming-process-package": {
                        ezyj0 = new ezzn(context0, fagj0);
                        break;
                    }
                    case "pending": {
                        ezyj0 = new ezzo(fagj0);
                        break;
                    }
                    case "pre-download-validate": {
                        ezyj0 = new ezzp(context0, fagj0);
                        break;
                    }
                    case "reboot": {
                        ezyj0 = new ezzq(fagj0);
                        break;
                    }
                    case "streaming-apply": {
                        goto label_43;
                    }
                    case "streaming-download": {
                        goto label_16;
                    }
                    case "streaming-process-package": {
                        goto label_46;
                    }
                    default: {
                        throw new IllegalStateException(String.format("Unknown action name: %s.", s));
                    }
                }
            }
            catch(IllegalStateException illegalStateException0) {
                ezym.a.n("Unable to create the action. Restart the execution from the scratch.", illegalStateException0, new Object[0]);
                this.d.c(new fagn[]{ezyq.b, ezyq.c});
                return this.a();
            }
        }
        this.h = ezyj0;
        return ezyj0;
        try {
        label_16:
            batl.l(ezwc.f());
            ezyj0 = new ezzu(context0, fagj0);
        }
        catch(IllegalStateException illegalStateException0) {
            ezym.a.n("Unable to create the action. Restart the execution from the scratch.", illegalStateException0, new Object[0]);
            this.d.c(new fagn[]{ezyq.b, ezyq.c});
            return this.a();
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
        this.h = ezyj0;
        return ezyj0;
        try {
        label_43:
            batl.l(ezwc.f());
            ezyj0 = new ezzs(context0, fagj0);
            this.h = ezyj0;
            return ezyj0;
        label_46:
            batl.l(ezwc.f());
            ezyj0 = new ezzw(context0, fagj0);
            this.h = ezyj0;
            return ezyj0;
        }
        catch(IllegalStateException illegalStateException0) {
        }
        ezym.a.n("Unable to create the action. Restart the execution from the scratch.", illegalStateException0, new Object[0]);
        this.d.c(new fagn[]{ezyq.b, ezyq.c});
        return this.a();
    }

    public final void b() {
        synchronized(this.f) {
            ezym.a.h("Finishing the current execution.", new Object[0]);
            ((ezxc)ezxc.c.b()).e();
            ezxl ezxl0 = (ezxl)ezxl.h.b();
            ezxl0.l();
            Context context0 = ezxl0.i;
            if(ezyd.c()) {
                ezxl.a.h("Stopping system update listener service", new Object[0]);
            }
            if(context0.startService(ezye.e().putExtra("command", "stop_all_listeners")) == null) {
                ezxl.a.m("Failed to reach system update listener service.", new Object[0]);
            }
            ((ezxw)ezxw.c.b()).d();
            try {
                Context context1 = this.c;
                if(((Boolean)((fagt)fagt.a.b()).b(ezyq.k)).booleanValue()) {
                    faah.a.h("cancelScheduledUpdate()", new Object[0]);
                    try {
                        RecoverySystem.cancelScheduledUpdate(context1);
                    }
                    catch(Exception exception0) {
                        throw new IOException(exception0);
                    }
                    ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.k, Boolean.valueOf(false))});
                }
            }
            catch(IOException iOException0) {
                ezym.a.g("Failed to cancel the scheduled update.", iOException0, new Object[0]);
            }
            if(ezwc.f()) {
                faar faar0 = new faar();
                try {
                    faar0.c();
                    faar0.d();
                }
                catch(InterruptedException | fabe exception1) {
                    ezym.a.g("Failed to reset update engine.", exception1, new Object[0]);
                }
                finally {
                    faar0.g();
                }
            }
            faab.e(this.c);
            this.d.c(new fagn[]{ezyq.i, ezyq.n, ezyq.a, ezyq.b, ezyq.c, ezyq.f, ezyq.d, ezyq.e, ezyq.h, ezyq.g, ezyq.o});
            this.c();
        }
    }

    public final void c() {
        synchronized(this.f) {
            this.h = null;
            if(this.i) {
                Intent intent0 = ezye.d(this.c);
                this.c.startService(intent0);
            }
        }
    }
}

