import android.content.Context;
import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager.BasicModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eqls {
    public final List a;
    public long b;
    public int c;
    public final ProtoLiteBuilder d;
    public final ProtoLiteBuilder e;
    public ProtoLiteBuilder f;
    private static final baun g;
    private final Context h;
    private final eqtz i;
    private final AtomicBoolean j;

    static {
        eqls.g = new erqc(new String[]{"D2D", "Metrics", "SecondDeviceSigninLogManager"});
    }

    public eqls(Context context0) {
        ayud ayud0 = new aytt(context0, "SMART_SETUP").a();
        eqlt eqlt0 = eqlt.g(context0);
        super();
        this.j = new AtomicBoolean(false);
        this.d = ((ProtoLiteMessage)gjoc.a).v_newBuilder();
        this.e = ((ProtoLiteMessage)gjnz.a).v_newBuilder();
        this.a = new ArrayList();
        this.c = 0;
        this.h = context0;
        this.i = new eqtz(context0, ayud0, eqlt0);
    }

    public final void a(long v) {
        ProtoLiteBuilder hftp0 = this.f;
        if(hftp0 != null) {
            long v1 = v - this.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjnv gjnv0 = (gjnv)hftp0.b_message;
            gjnv0.b |= 2;
            gjnv0.d = (int)v1;
            gjnv gjnv1 = (gjnv)this.f.N_build();
            this.a.add(gjnv1);
        }
    }

    public final void b() {
        if(this.j.compareAndSet(false, true)) {
            this.a(SystemClock.elapsedRealtime());
            ProtoLiteBuilder hftp0 = this.e;
            int v = this.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjnz gjnz0 = (gjnz)hftp0.b_message;
            gjnz0.b |= 2;
            gjnz0.d = v;
            List list0 = this.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjnz gjnz1 = (gjnz)hftp0.b_message;
            hfuo hfuo0 = gjnz1.g;
            if(!hfuo0.c()) {
                gjnz1.g = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, gjnz1.g);
            ProtoLiteBuilder hftp1 = this.d;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjoc gjoc0 = (gjoc)hftp1.b_message;
            gjnz gjnz2 = (gjnz)hftp0.N_build();
            gjnz2.getClass();
            gjoc0.j = gjnz2;
            gjoc0.b |= 0x100;
            Context context0 = this.h;
            ModuleManager.BasicModuleInfo moduleManager$BasicModuleInfo0 = ModuleManager.getBasicModuleInfo(context0);
            if(moduleManager$BasicModuleInfo0 != null) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjoc gjoc1 = (gjoc)hftp1.b_message;
                gjoc1.b |= 0x20;
                gjoc1.h = moduleManager$BasicModuleInfo0.moduleVersion;
            }
            gjoc gjoc2 = (gjoc)hftp1.N_build();
            eqls.g.j("Sending 2nd Device Sign-in logs to Clearcut", new Object[0]);
            eqls.g.j(((ProtoLiteMessage)gjoc2).toString(), new Object[0]);
            if(hygo.d()) {
                new eqtx(context0).a(gjoc2);
                return;
            }
            this.i.c(((MessageLite)gjoc2));
            return;
        }
        eqls.g.m("Logs already sent to Clearcut, ignoring call to log()", new Object[0]);
    }

    public final void c(boolean z) {
        ProtoLiteBuilder hftp0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjnz gjnz0 = (gjnz)hftp0.b_message;
        gjnz0.b |= 1;
        gjnz0.c = z;
    }
}

