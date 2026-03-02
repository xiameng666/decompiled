import android.app.backup.BackupManagerMonitor;
import android.content.Context;
import android.os.ConditionVariable;
import java.util.concurrent.TimeUnit;

public final class arfm extends arfk {
    private static final aqql d;
    private final ConditionVariable e;
    private final BackupManagerMonitor f;
    private boolean g;

    static {
        arfm.d = new aqql(new String[]{"D2dTransportDriverO"});
    }

    protected arfm(Context context0, arem arem0) {
        super(context0, arem0);
        this.e = new ConditionVariable();
        this.f = new arfl(this);
    }

    @Override  // arfk
    @Deprecated
    public final void c() {
        arfm.d.j("Awaiting inititalization", new Object[0]);
        this.e.block();
        arfm.d.j("Initialization completed", new Object[0]);
    }

    @Override  // arfk
    public final void d() {
        synchronized(this) {
            aqql aqql0 = arfm.d;
            aqql0.j("Preparing for d2d transfer", new Object[0]);
            aqjl aqjl0 = aqjl.a;
            Context context0 = this.b;
            aqjk aqjk0 = new aqjk(context0);
            synchronized(aren.a) {
                aqjl0.f(context0, ((int)aqjk0.i()));
            }
            Object object0 = aren.a;
            synchronized(object0) {
                if(!aqjk0.i()) {
                    aqjk0.f(true);
                }
            }
            synchronized(aren.a) {
                aqjl0.e(context0, ((int)aqjl0.m(context0)));
            }
            synchronized(aren.a) {
                aqjl0.d(context0, true);
            }
            this.e.open();
            aqql0.j("Prepared for d2d transfer", new Object[0]);
        }
    }

    @Override  // arfk
    protected final void f() {
        if(!this.i()) {
            return;
        }
        if(this.g) {
            arfm.d.h("Shutdown requested while O backup is in progress.", new Object[0]);
            return;
        }
        this.e.close();
        arfm.d.h("Shutting down D2dDriver.", new Object[0]);
        this.e();
    }

    @Override  // arfk
    public final boolean h(String s) {
        synchronized(this) {
            this.g = true;
        }
        long v = bbnh.h(hqhq.a.j().U().split(",")).contains(s) ? hqhq.a.j().a() : hqhq.a.j().c();
        aqql aqql0 = arfm.d;
        aqql0.j("Timeout for %s is %s seconds", new Object[]{s, v});
        long v1 = TimeUnit.SECONDS.toMillis(v);
        Context context0 = this.b;
        areq areq0 = new areq(context0, new aqjk(context0), new arfi(context0), s, v1, this.f);
        areq0.b();
        if(hqml.c()) {
            aqql0.j("Waiting for backup task to finish.", new Object[0]);
        }
        try {
            if(hqml.c()) {
                areq.a.j("Waiting for backup complete latch.", new Object[0]);
            }
            areq0.c.await();
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Interrupted", interruptedException0);
        }
        synchronized(this) {
            this.g = false;
            this.f();
        }
        arem arem0 = this.a;
        Integer integer0 = areq0.f;
        Integer integer1 = areq0.g;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkyz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((hkyz)hftv0).b |= 1;
        ((hkyz)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkyz)hftp0.b_message).e = 2;
        ((hkyz)hftp0.b_message).b |= 4;
        if(integer0 != null) {
            int v3 = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkyz hkyz0 = (hkyz)hftp0.b_message;
            hkyz0.b |= 16;
            hkyz0.g = v3;
        }
        if(integer1 != null) {
            int v4 = (int)integer1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkyz hkyz1 = (hkyz)hftp0.b_message;
            hkyz1.b |= 8;
            hkyz1.f = v4;
        }
        hkyz hkyz2 = (hkyz)hftp0.N_build();
        arem0.g.add(hkyz2);
        return areq0.f != null && ((int)areq0.f) == 0;
    }
}

