import android.content.Context;

public final class epfd {
    public static epdr a(Context context0, int v, epfc epfc0) {
        CharSequence charSequence0 = context0.getResources().getTextArray(v)[(epfc0 == null ? epfc.a.h : epfc0.h)];
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grme.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grme grme0 = (grme)hftp0.b_message;
        grme0.b |= 1;
        grme0.c = v;
        return new epdr(charSequence0, new grme[]{((grme)hftp0.N_build())});
    }

    public static boolean b(epfc epfc0) {
        return epfc0 == epfc.f || epfc0 == epfc.g;
    }

    public static boolean c(epfc epfc0) {
        return epfc0 == epfc.b || epfc0 == epfc.g;
    }
}

