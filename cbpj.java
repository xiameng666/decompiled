import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

public final class cbpj implements bavq {
    public final cbpo a;
    public final long b;
    public final String c;
    public final Context d;
    public final icbr e;

    public cbpj(cbpo cbpo0, icbr icbr0, long v, String s, Context context0) {
        this.a = cbpo0;
        this.e = icbr0;
        this.b = v;
        this.c = s;
        this.d = context0;
    }

    @Override  // bavq
    public final void a(ModuleInstallStatusUpdate moduleInstallStatusUpdate0) {
        gvho gvho0;
        bavy bavy0 = moduleInstallStatusUpdate0.f;
        if(bavy0 != null) {
            this.a.b.g(Float.valueOf(((float)bavy0.a) / ((float)bavy0.b)));
        }
        cbpg cbpg0 = null;
        switch(moduleInstallStatusUpdate0.b) {
            case 3: {
                cbpg0 = cbpg.c;
                break;
            }
            case 4: {
                cbpg0 = cbpg.a;
                break;
            }
            case 5: {
                cbpg0 = cbpg.b;
            }
        }
        if(cbpg0 != null) {
            this.e.V(cbpg0);
        }
        String s = this.c;
        long v = SystemClock.elapsedRealtime() - this.b;
        ibuq.f(s, "sessionId");
        ibuq.f(this.d, "moduleContext");
        if(cbpg0 == null) {
            gvho0 = gvho.a;
        }
        else {
            switch(cbpg0.ordinal()) {
                case 0: {
                    gvho0 = gvho.b;
                    break;
                }
                case 1: 
                case 2: {
                    gvho0 = gvho.d;
                    break;
                }
                default: {
                    gvho0 = gvho.a;
                }
            }
        }
        cfvm cfvm0 = cfvm.v();
        gvib gvib0 = gvia.a(((hftr)((ProtoLiteMessage)gvij.a).v_newBuilder()));
        gvhy gvhy0 = gvhx.a(((ProtoLiteMessage)gvhl.a).v_newBuilder());
        gvhy0.c(s);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvhp.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(gvho0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvhp)hftv0).c = gvho0.h;
        ((gvhp)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvhp gvhp0 = (gvhp)hftp0.b_message;
        gvhp0.b |= 2;
        gvhp0.d = v;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gvhp)hftv1), "value");
        ProtoLiteBuilder hftp1 = gvhy0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvhl gvhl0 = (gvhl)hftp1.b_message;
        ((gvhp)hftv1).getClass();
        gvhl0.d = (gvhp)hftv1;
        gvhl0.c = 9;
        gvib0.b(gvhy0.a());
        cczb cczb0 = cfvm0.c(((ProtoLiteMessage)gvib0.a()));
        cczb0.c = (int)gvkq.X.er;
        cczb0.a();
        ((ggtj)cbpo.a.h()).B("Module download result: %s", cbpg0);
    }
}

