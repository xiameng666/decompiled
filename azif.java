import com.google.android.gms.clearcut.internal.PlayLoggerContext;

public final class azif {
    public static String a(PlayLoggerContext playLoggerContext0) {
        String s = playLoggerContext0.f;
        if(!gfta.c(s)) {
            return s;
        }
        return playLoggerContext0.c <= 0 ? "" : String.valueOf(playLoggerContext0.c);
    }

    public static String b(hlsi hlsi0) {
        if(hlsi0.i.isEmpty()) {
            return (hlsi0.b & 8) == 0 ? "" : Integer.toString(hlsi0.e);
        }
        return hlsi0.i;
    }

    public static ProtoLiteBuilder c(PlayLoggerContext playLoggerContext0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlsi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlsi.b(((hlsi)hftp0.b_message));
        int v = playLoggerContext0.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hlsi)hftv0).b |= 4;
        ((hlsi)hftv0).d = v;
        int v1 = playLoggerContext0.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hlsi)hftv1).b |= 8;
        ((hlsi)hftv1).e = v1;
        boolean z = playLoggerContext0.e;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hlsi)hftv2).b |= 0x40;
        ((hlsi)hftv2).g = z;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hlsi)hftv3).b |= 0x80;
        ((hlsi)hftv3).h = "";
        boolean z1 = playLoggerContext0.g;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((hlsi)hftv4).b |= 0x200;
        ((hlsi)hftv4).j = z1;
        int v2 = playLoggerContext0.h;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((hlsi)hftv5).b |= 0x400;
        ((hlsi)hftv5).k = v2;
        boolean z2 = playLoggerContext0.j;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlsi hlsi0 = (hlsi)hftp0.b_message;
        hlsi0.b |= 0x4000;
        hlsi0.o = z2;
        String s = playLoggerContext0.f;
        if(!gfta.c(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlsi hlsi1 = (hlsi)hftp0.b_message;
            s.getClass();
            hlsi1.b |= 0x100;
            hlsi1.i = s;
        }
        String s1 = playLoggerContext0.a;
        if(!gfta.c(s1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlsi hlsi2 = (hlsi)hftp0.b_message;
            s1.getClass();
            hlsi2.b |= 2;
            hlsi2.c = s1;
        }
        String s2 = playLoggerContext0.d;
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlsi hlsi3 = (hlsi)hftp0.b_message;
            hlsi3.b |= 16;
            hlsi3.f = s2;
        }
        Integer integer0 = playLoggerContext0.i;
        if(integer0 != null) {
            int v3 = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlsi hlsi4 = (hlsi)hftp0.b_message;
            hlsi4.b |= 0x2000;
            hlsi4.n = v3;
        }
        return hftp0;
    }
}

