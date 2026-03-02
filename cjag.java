import android.content.Intent;

public final class cjag {
    private static final Object a;
    private static cjag b;

    static {
        cjag.a = new Object();
    }

    public static cjag a() {
        synchronized(cjag.a) {
            if(cjag.b == null) {
                cjag.b = new cjag();
            }
        }
        return cjag.b;
    }

    public final fhvp b(Intent intent0) {
        if(cjag.c(intent0)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cmfb.a).v_newBuilder();
            cmfd cmfd0 = cmfd.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((cmfb)hftv0).c = cmfd0.f;
            ((cmfb)hftv0).b |= 1;
            cmfa cmfa0 = cmfa.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((cmfb)hftp0.b_message).d = cmfa0.e;
            ((cmfb)hftp0.b_message).b |= 2;
            cmfb cmfb0 = (cmfb)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cmfs.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)cmfe.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            cmfe cmfe0 = (cmfe)hftp2.b_message;
            cmfb0.getClass();
            cmfe0.k = cmfb0;
            cmfe0.b |= 0x100;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            cmfs cmfs0 = (cmfs)hftp1.b_message;
            cmfe cmfe1 = (cmfe)hftp2.N_build();
            cmfe1.getClass();
            cmfs0.d = cmfe1;
            cmfs0.b |= 2;
            return cmfx.a(((cmfs)hftp1.N_build()));
        }
        return null;
    }

    public static boolean c(Intent intent0) {
        return intent0 != null && intent0.hasExtra(":settings:fragment_args_key");
    }
}

