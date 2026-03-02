import android.content.Context;

public final class fxup {
    public final Context a;

    public fxup(Context context0) {
        this.a = context0;
    }

    public static String a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(acqi.a());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkh grkh0 = (grkh)hftp0.b_message;
        grkh0.b |= 1;
        grkh0.c = hfsf0;
        return bbmu.b(((grkh)hftp0.N_build()).toBytesArray());
    }
}

