import android.content.Context;

public final class epen {
    public static final baun a;

    static {
        epen.a = new baun("SetupServices", new String[]{"AuditHelper"});
    }

    public static grkr a(Context context0, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        if(s != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grko.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grko grko0 = (grko)hftp1.b_message;
            grko0.b = 1;
            grko0.c = s;
            grko grko1 = (grko)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grkr grkr0 = (grkr)hftp0.b_message;
            grko1.getClass();
            grkr0.c = grko1;
            grkr0.b |= 1;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
        String s1 = Long.toHexString(bbmq.d(context0));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grkn grkn0 = (grkn)hftp2.b_message;
        s1.getClass();
        grkn0.b |= 1;
        grkn0.c = s1;
        grkn grkn1 = (grkn)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkr grkr1 = (grkr)hftp0.b_message;
        grkn1.getClass();
        grkr1.d = grkn1;
        grkr1.b |= 4;
        return (grkr)hftp0.N_build();
    }
}

