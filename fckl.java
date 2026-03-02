import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;

public final class fckl implements fcjs {
    public static final baun a;
    public final fcfe b;
    public final ScheduledExecutorService c;
    public final String d;
    private final String e;

    static {
        fckl.a = new fcgf(new String[]{"RestoreCompClient"});
    }

    public fckl(fcfe fcfe0, ScheduledExecutorService scheduledExecutorService0, String s, String s1) {
        this.b = fcfe0;
        this.c = scheduledExecutorService0;
        this.d = s;
        this.e = s1;
    }

    @Override  // fcjs
    public final evql a() {
        fckl.a.j("abort_key_recovery request: nodeId=%s", new Object[]{this.d});
        return this.i("abortKeyRecovery", new fcjz(this));
    }

    @Override  // fcjs
    public final evql b() {
        fckl.a.j("get_devices request: nodeId=%s", new Object[]{this.d});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.e.getClass();
        ((fezp)hftv0).b |= 1;
        ((fezp)hftv0).c = this.e;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezp fezp0 = (fezp)hftp0.b_message;
        fezp0.b |= 2;
        fezp0.d = true;
        return this.i("getDevices", new fcki(this, ((fezp)hftp0.N_build())));
    }

    @Override  // fcjs
    public final evql c(aqfl aqfl0) {
        fckl.a.j("start_key_recovery request: nodeId=%s device=%s", new Object[]{this.d, aqfl0.e});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffam.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffam ffam0 = (ffam)hftp0.b_message;
        this.e.getClass();
        ffam0.b |= 2;
        ffam0.d = this.e;
        int v = (int)hzyp.a.b().h();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ffam)hftv0).b |= 4;
        ((ffam)hftv0).e = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ffam)hftp0.b_message).c = aqfl0;
        ((ffam)hftp0.b_message).b |= 1;
        return this.i("performKeyRecovery", new fcju(this, ((ffam)hftp0.N_build()))).g(new fcjv(this));
    }

    @Override  // fcjs
    public final evql d(Supplier supplier0) {
        fckl.a.j("observing ready_to_restore request. nodeid=%s", new Object[]{this.d});
        fckk fckk0 = new fckk(this.b, this.d, supplier0);
        return fckk0.a.f(fckk0, "/restore/ready_to_restore", fckk0.b);
    }

    @Override  // fcjs
    public final evql e() {
        fckl.a.j("startBackupNow request: nodeId=%s", new Object[]{this.d});
        return this.b.i(this.d, "/restore/start_backup_now", new byte[0]).g(new fcjt());
    }

    @Override  // fcjs
    public final evql f(long v, boolean z) {
        fckl.a.j("start_restore request: nodeId=%s, requireCharging=%s", new Object[]{this.d, Boolean.valueOf(z)});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.e.getClass();
        ((ffbq)hftv0).b |= 2;
        ((ffbq)hftv0).d = this.e;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ffbq)hftv1).b |= 1;
        ((ffbq)hftv1).c = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbq ffbq0 = (ffbq)hftp0.b_message;
        ffbq0.b |= 4;
        ffbq0.e = z;
        boolean z1 = hzub.a.d().k();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbq ffbq1 = (ffbq)hftp0.b_message;
        ffbq1.b |= 8;
        ffbq1.f = z1;
        return this.i("startRestore", new fcke(this, ((ffbq)hftp0.N_build()))).c(new fckf());
    }

    @Override  // fcjs
    public final void g(int v) {
        String s1;
        baun baun0 = fckl.a;
        String s = this.d;
        switch(v) {
            case 2: {
                s1 = "DEVICE_PICKER";
                break;
            }
            case 3: {
                s1 = "CONTENT_SELECTOR";
                break;
            }
            case 4: {
                s1 = "KEY_RECOVERY";
                break;
            }
            default: {
                s1 = "REQUEST_CHARGING";
            }
        }
        baun0.j("skip_restore request: nodeId=%s, screen=%s", new Object[]{s, s1});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffcb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ffcb)hftp0.b_message).c = v - 1;
        ((ffcb)hftp0.b_message).b |= 1;
        this.i("skipRestore", new fcjw(this, ((ffcb)hftp0.N_build()))).c(new fcjx());
    }

    public static fckl h(Context context0, String s, String s1) {
        return new fckl(fcfo.d(context0), new bbll(2, 9), s, s1);
    }

    private final evql i(String s, Supplier supplier0) {
        evql evql0 = fhqu.a(ghmx.e(((gful_cronetEngineProvider)new fcka(supplier0)), new ghmf(glwy.a(hzyp.a.b().d())), new fckb(s), this.c));
        evql0.A(new fckc(s));
        return evql0;
    }
}

