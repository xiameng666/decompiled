import android.content.Context;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RetryPolicy;
import com.google.android.gms.chimera.modules.smartdevice.AppContextProvider;

public final class epyf extends epxw {
    public static final baun b;
    public final RetryPolicy c;
    public final int d;
    public final int e;
    public final float f;
    private final Context g;

    static {
        epyf.b = new erqc(new String[]{"D2D", "D2DClientImpl"});
    }

    public epyf() {
        int v = (int)hyim.a.e().f();
        Integer.valueOf(v).getClass();
        int v1 = (int)hyim.a.e().e();
        Integer.valueOf(v1).getClass();
        float f = (float)hyim.a.e().a();
        Float.valueOf(f).getClass();
        super();
        this.d = v;
        this.e = v1;
        this.f = f;
        this.g = AppContextProvider.a();
        this.c = new DefaultRetryPolicy(v, v1, f);
    }

    public final clax a(ckcp ckcp0) {
        String s = bapf.c(this.g);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqom.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqom eqom0 = (eqom)hftp0.b_message;
        s.getClass();
        hfuo hfuo0 = eqom0.b;
        if(!hfuo0.c()) {
            eqom0.b = ProtoLiteMessage.E(hfuo0);
        }
        eqom0.b.add(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqom eqom1 = (eqom)hftp0.b_message;
        hfuo hfuo1 = eqom1.c;
        if(!hfuo1.c()) {
            eqom1.c = ProtoLiteMessage.E(hfuo1);
        }
        eqom1.c.add("com.google.android.gms");
        claw claw0 = new claw(null);
        claw0.b(((MessageLite)(((eqom)hftp0.N_build()))), ckcp0, eqon.a);
        return new clax(claw0);
    }

    final eqnh b() {
        return new eqnh(this.g);
    }

    final eqnn c() {
        return new eqnl(AppContextProvider.a(), bbfw.b(), this.c);
    }

    public static final hkwl d(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkwl.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkwn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hkwn)hftp1.b_message).c = v;
        ((hkwn)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkwl hkwl0 = (hkwl)hftp0.b_message;
        hkwn hkwn0 = (hkwn)hftp1.N_build();
        hkwn0.getClass();
        hkwl0.d = hkwn0;
        hkwl0.b |= 2;
        return (hkwl)hftp0.N_build();
    }

    public static final hkws e(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkws.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkwn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hkwn)hftp1.b_message).c = v;
        ((hkwn)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkws hkws0 = (hkws)hftp0.b_message;
        hkwn hkwn0 = (hkwn)hftp1.N_build();
        hkwn0.getClass();
        hkws0.d = hkwn0;
        hkws0.b |= 2;
        return (hkws)hftp0.N_build();
    }

    public static final hkwu f(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkwu.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkwn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hkwn)hftp1.b_message).c = v;
        ((hkwn)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkwu hkwu0 = (hkwu)hftp0.b_message;
        hkwn hkwn0 = (hkwn)hftp1.N_build();
        hkwn0.getClass();
        hkwu0.d = hkwn0;
        hkwu0.b |= 2;
        return (hkwu)hftp0.N_build();
    }
}

