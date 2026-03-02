import android.content.Context;

public final class eicj {
    public static void a(Context context0, gwlx gwlx0) {
        if(!hrtj.g()) {
            return;
        }
        eici eici0 = eici.a(context0);
        eici0.b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwlx0.getClass();
        gwik0.W = gwlx0;
        gwik0.c |= 0x2000;
        eici0.c(((gwik)hftp0.N_build()), 46);
    }
}

