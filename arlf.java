import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.Future;

public abstract class arlf implements epyk {
    public static final aqql d;
    ParcelFileDescriptor[] e;
    public OutputStream f;
    public ParcelFileDescriptor[] g;
    public ParcelFileDescriptor[] h;
    public ByteArrayOutputStream i;
    public Future j;
    protected final gmcg k;
    public final gmcg l;
    public final arim m;

    static {
        arlf.d = new aqql(new String[]{"SmartDeviceSourceController"});
    }

    protected arlf(arim arim0, gmcg gmcg0) {
        this.i = new ByteArrayOutputStream();
        this.m = arim0;
        this.k = gmcg0;
        this.l = new bblp(1, 9);
    }

    public void a() {
        throw null;
    }

    public abstract void b();

    protected void c() {
        throw null;
    }

    public final void d(int v, String s) {
        int v1 = v - 1;
        arlf.d.f("SmartDevice exception: %d, %s", new Object[]{v1, s});
        this.m.a(v1, 5, s);
        this.a();
    }

    @Override  // epyk
    public final void e(List list0) {
        arlf.d.j("onCompleted", new Object[0]);
        arim arim0 = this.m;
        if(arim0.a) {
            arin.a.d("Listener.onCompleted called after abortRequest", new Object[0]);
        }
        else {
            arin arin0 = arim0.b;
            ((arjh)arin0).u.b(true);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ascm.a).v_newBuilder();
            ascl ascl0 = ascl.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ascm)hftp0.b_message).c = ascl0.g;
            ((ascm)hftp0.b_message).b |= 1;
            arin0.h(((ascm)hftp0.N_build()), null);
        }
        this.c();
    }

    @Override  // epyk
    public final void f(int v, String s) {
        arlf.d.f("SmartDevice internal error: %d, %s", new Object[]{v, s});
        this.m.a(v, 2, s);
        this.c();
    }

    @Override  // epyk
    public final void g(PendingIntent pendingIntent0) {
        arlf.d.j("onShowUi", new Object[0]);
        try {
            pendingIntent0.send();
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            arlf.d.g("Intent sending failed", pendingIntent$CanceledException0, new Object[0]);
            this.d(3, pendingIntent$CanceledException0.getMessage());
        }
    }
}

