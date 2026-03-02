import android.content.Context;

public final class gayd {
    public static final ayuc a(Context context0, ayud ayud0, gkxt gkxt0, String s) {
        ibuq.f(context0, "appContext");
        ibuq.f(ayud0, "clearcutLogger");
        ibuq.f(gkxt0, "eventBuilder");
        ibuq.f(s, "accountName");
        gayf gayf0 = new gayf();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkzp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkzp gkzp0 = (gkzp)hftp0.b_message;
        gkxt0.getClass();
        gkzp0.c = gkxt0;
        gkzp0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ayuc ayuc0 = ayud0.j(((MessageLite)(((gkzp)hftv0))), fhbe.b(context0, gayf0));
        ayuc0.o(s);
        return ayuc0;
    }
}

