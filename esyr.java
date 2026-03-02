import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.chimera.IntentOperation;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;

public final class esyr extends esyn {
    public static final bboh a;
    public static final Executor b;

    static {
        esyr.a = bboh.b("TapAndPay", bbcu.aM);
        esyr.b = new bblp(1, 10);
    }

    @Override  // esyn
    public final void a(Context context0, esqi esqi0, int v) {
        esyp esyp0 = new esyp(this, context0, esqi0);
        esyr.b.execute(esyp0);
    }

    @Override  // esyn
    public final void c(Context context0, esqi esqi0, esqf esqf0) {
        esyo esyo0 = () -> {
            boolean z = !hyxp.a.c().g();
            try {
                String s = esqi0.a;
                gjqv gjqv0 = esyr.d(s, esqf0);
                etmv etmv0 = esyr.h(context0, esqi0);
                ProtoLiteBuilder hftp0 = etmv0.am(gjsj.c, esqi0.y);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjzl gjzl0 = (gjzl)hftp0.b_message;
                gjqv0.getClass();
                gjzl0.h = gjqv0;
                gjzl0.b |= 8;
                etmv0.m(((gjzl)hftp0.N_build()), s);
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                a.ae(esyr.a.j(), "Logging APDU failed", arrayIndexOutOfBoundsException0);
            }
        };
        esyr.b.execute(esyo0);
    }

    public static gjqv d(String s, esqf esqf0) {
        byte[] arr_b = esqf0.a;
        String s1 = esyr.m(arr_b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjqv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjqv gjqv0 = (gjqv)hftp0.b_message;
        s.getClass();
        gjqv0.b |= 1;
        gjqv0.c = s;
        String s2 = esyr.m(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjqv)hftv0).b |= 2;
        ((gjqv)hftv0).d = s2;
        long v = esqf0.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gjqv)hftv1).b |= 4;
        ((gjqv)hftv1).e = v;
        long v1 = esqf0.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjqv gjqv1 = (gjqv)hftp0.b_message;
        gjqv1.b |= 8;
        gjqv1.f = v1;
        String s3 = String.format("%02x%02x", ((byte)arr_b[0]), ((byte)arr_b[1]));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjqv gjqv2 = (gjqv)hftp0.b_message;
        s3.getClass();
        gjqv2.b |= 16;
        gjqv2.g = s3;
        esvw esvw0 = esqf0.b;
        String s4 = String.format("%04x", ((int)esvw0.a));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        s4.getClass();
        ((gjqv)hftv2).b |= 0x20;
        ((gjqv)hftv2).h = s4;
        if(arr_b.length > 2) {
            int v2 = arr_b[2];
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjqv gjqv3 = (gjqv)hftp0.b_message;
            gjqv3.b |= 0x40;
            gjqv3.i = v2;
        }
        if(arr_b.length > 3) {
            int v3 = arr_b[3];
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjqv gjqv4 = (gjqv)hftp0.b_message;
            gjqv4.b |= 0x80;
            gjqv4.j = v3;
        }
        if(arr_b.length > 4) {
            int v4 = arr_b[4];
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjqv gjqv5 = (gjqv)hftp0.b_message;
            gjqv5.b |= 0x100;
            gjqv5.k = v4;
        }
        if(s1.equals("325041592e5359532e4444463031")) {
            ByteString hfsf0 = ByteString.copyFrom(esvw0.d());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjqv gjqv6 = (gjqv)hftp0.b_message;
            gjqv6.b |= 0x200;
            gjqv6.l = hfsf0;
        }
        return (gjqv)hftp0.N_build();
    }

    public static void e(esqo esqo0, ProtoLiteBuilder hftp0, gutm gutm0) {
        if(esqo0 == null) {
            return;
        }
        gutt gutt0 = ((guts)gutm0.b_message).h;
        if(gutt0 == null) {
            gutt0 = gutt.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gutt0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gutt0));
        for(Object object0: esqo0.a.a()) {
            int v = (int)(((Integer)object0));
            byte[] arr_b = esqo0.d(v);
            try {
                switch(v) {
                    case 0x95: {
                        String s = esxg.b(arr_b);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjuj gjuj0 = (gjuj)hftp0.b_message;
                        gjuj0.b |= 0x400;
                        gjuj0.n = s;
                        String s1 = esxg.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).r = s1;
                        continue;
                    }
                    case 0x9A: {
                        int v1 = glwy.h(esyw.a(arr_b));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).s = v1;
                        continue;
                    }
                    case 0x9C: {
                        int v2 = glwy.h(esyw.a(arr_b));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).j = v2;
                        continue;
                    }
                    case 0x5F2A: {
                        int v3 = glwy.h(esyw.a(arr_b));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).m = v3;
                        continue;
                    }
                    case 0x9F01: {
                        String s2 = esxg.b(arr_b);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjuj gjuj1 = (gjuj)hftp0.b_message;
                        gjuj1.b |= 0x800;
                        gjuj1.o = s2;
                        long v4 = esyw.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).h = v4;
                        continue;
                    }
                    case 0x9F02: {
                        long v5 = esyw.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).k = v5;
                        continue;
                    }
                    case 0x9F03: {
                        long v6 = esyw.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).p = v6;
                        continue;
                    }
                    case 0x9F09: {
                        String s3 = esxg.b(arr_b);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjuj gjuj2 = (gjuj)hftp0.b_message;
                        gjuj2.b |= 0x1000;
                        gjuj2.p = s3;
                        String s4 = esxg.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).u = s4;
                        continue;
                    }
                    case 0x9F15: {
                        int v7 = glwy.h(esyw.a(arr_b));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).e = v7;
                        continue;
                    }
                    case 0x9F16: {
                        String s5 = esxg.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).d = s5;
                        continue;
                    }
                    case 40730: {
                        int v8 = glwy.h(esyw.a(arr_b));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).q = v8;
                        continue;
                    }
                    case 0x9F1C: {
                        String s6 = esxg.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).f = s6;
                        continue;
                    }
                    case 0x9F1E: {
                        String s7 = esxg.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).g = s7;
                        continue;
                    }
                    case 0x9F33: {
                        String s8 = esxg.b(arr_b);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjuj gjuj3 = (gjuj)hftp0.b_message;
                        gjuj3.b |= 0x2000;
                        gjuj3.q = s8;
                        String s9 = esxg.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).v = s9;
                        continue;
                    }
                    case 0x9F35: {
                        String s10 = esxg.b(arr_b);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjuj gjuj4 = (gjuj)hftp0.b_message;
                        gjuj4.b |= 0x4000;
                        gjuj4.r = s10;
                        String s11 = esxg.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).w = s11;
                        continue;
                    }
                    case 0x9F37: {
                        String s12 = esxg.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).t = s12;
                        continue;
                    }
                    case 0x9F39: {
                        String s13 = esxg.b(arr_b);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjuj gjuj5 = (gjuj)hftp0.b_message;
                        gjuj5.b |= 0x8000;
                        gjuj5.s = s13;
                        continue;
                    }
                    case 0x9F44: {
                        if(!hyvu.a.d().t()) {
                            continue;
                        }
                        long v9 = esyw.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gutt gutt1 = (gutt)hftp1.b_message;
                        gutt1.b |= 1;
                        gutt1.l = v9;
                        continue;
                    }
                    case 40780: {
                        gutl gutl0 = ((guts)gutm0.b_message).m;
                        if(gutl0 == null) {
                            gutl0 = gutl.a;
                        }
                        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gutl0).jf(5, null);
                        hftp2.X(((ProtoLiteMessage)gutl0));
                        String s14 = esxg.a(arr_b);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gutl)hftp2.b_message).i = s14;
                        if(!gutm0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gutm0).ensureMutable();
                        }
                        guts guts0 = (guts)gutm0.b_message;
                        gutl gutl1 = (gutl)hftp2.N_build();
                        gutl1.getClass();
                        guts0.m = gutl1;
                        guts0.b |= 0x40;
                        continue;
                    }
                    case 0x9F4E: {
                        String s15 = new String(arr_b, StandardCharsets.US_ASCII).trim();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gutt gutt2 = (gutt)hftp1.b_message;
                        s15.getClass();
                        gutt2.c = s15;
                        continue;
                    }
                    case 40806: {
                        String s16 = esxg.b(arr_b);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjuj gjuj6 = (gjuj)hftp0.b_message;
                        gjuj6.b |= 0x10000;
                        gjuj6.t = s16;
                        String s17 = esxg.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).o = s17;
                        continue;
                    }
                    case 40830: {
                        String s18 = esxg.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutt)hftp1.b_message).z = s18;
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException | IllegalArgumentException exception0) {
                ((ggtj)((ggtj)esyr.a.j()).s(exception0)).z("Log data extraction failed for tag %x", v);
            }
        }
        if(!gutm0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gutm0).ensureMutable();
        }
        guts guts1 = (guts)gutm0.b_message;
        gutt gutt3 = (gutt)hftp1.N_build();
        gutt3.getClass();
        guts1.h = gutt3;
        guts1.b |= 4;
    }

    public static void f(esqo esqo0, ProtoLiteBuilder hftp0) {
        if(esqo0 == null) {
            return;
        }
        gjub gjub0 = ((gjuj)hftp0.b_message).ag;
        if(gjub0 == null) {
            gjub0 = gjub.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gjub0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gjub0));
        for(Object object0: esqo0.a.a()) {
            int v = (int)(((Integer)object0));
            byte[] arr_b = esqo0.d(v);
            try {
                switch(v) {
                    case 0x8B: {
                        gjua gjua0 = esyx.c(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gjub gjub1 = (gjub)hftp1.b_message;
                        gjua0.getClass();
                        gjub1.e = gjua0;
                        gjub1.b |= 4;
                        continue;
                    }
                    case 0x5F2A: {
                        int v1 = glwy.h(esyw.a(arr_b));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gjub gjub2 = (gjub)hftp1.b_message;
                        gjub2.b |= 8;
                        gjub2.f = v1;
                        continue;
                    }
                    case 0x9F02: {
                        long v2 = esyw.a(arr_b);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gjub gjub3 = (gjub)hftp1.b_message;
                        gjub3.b |= 2;
                        gjub3.d = v2;
                        continue;
                    }
                    case 40730: {
                        int v3 = glwy.h(esyw.a(arr_b));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gjub gjub4 = (gjub)hftp1.b_message;
                        gjub4.b |= 16;
                        gjub4.g = v3;
                        continue;
                    }
                    default: {
                        ((ggtj)esyr.a.j()).z("Unexpected tag: %x present in SDOL format, but not extracted to log data from SDOL.", v);
                    }
                }
            }
            catch(ArrayIndexOutOfBoundsException | IllegalArgumentException exception0) {
                ((ggtj)((ggtj)esyr.a.j()).s(exception0)).z("Log data extraction failed for tag %x", v);
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjuj gjuj0 = (gjuj)hftp0.b_message;
        gjub gjub5 = (gjub)hftp1.N_build();
        gjub5.getClass();
        gjuj0.ag = gjub5;
        gjuj0.c |= 0x20000000;
    }

    public static void g(esvj esvj0, ProtoLiteBuilder hftp0, gutm gutm0) {
        if((esvj0 instanceof esvf)) {
            for(Object object0: ((esvf)esvj0).f()) {
                esyr.g(((esvj)object0), hftp0, gutm0);
            }
            return;
        }
        byte[] arr_b = ((esvg)esvj0).a;
        guug guug0 = null;
        switch(esvj0.b) {
            case 0x4F: {
                String s = esxg.a(arr_b);
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts0 = (guts)gutm0.b_message;
                guts0.b();
                guts0.s.add(s);
                return;
            }
            case 87: {
                gutl gutl0 = ((guts)gutm0.b_message).m;
                if(gutl0 == null) {
                    gutl0 = gutl.a;
                }
                if(gutl0.c.isEmpty() && arr_b.length == 19) {
                    gutl gutl1 = ((guts)gutm0.b_message).m;
                    if(gutl1 == null) {
                        gutl1 = gutl.a;
                    }
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gutl1).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)gutl1));
                    int v = ((gjuj)hftp0.b_message).N;
                    if((gjuf.b(v) == null ? gjuf.a : gjuf.b(v)) == gjuf.h) {
                        int v1 = ((arr_b[17] & 0xFF) >>> 4) + (arr_b[16] & 15) * 10 + ((arr_b[16] & 0xFF) >>> 4) * 100;
                        String s1 = Integer.toString(v1);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gutl gutl2 = (gutl)hftp1.b_message;
                        s1.getClass();
                        gutl2.c = s1;
                        esyr.n(gutm0, v1);
                    }
                    else if((gjuf.b(v) == null ? gjuf.a : gjuf.b(v)) == gjuf.b) {
                        int v2 = (arr_b[16] & 15) + ((arr_b[16] & 0xFF) >>> 4) * 10 + (arr_b[15] & 15) * 100;
                        String s2 = esxg.a(new byte[]{((byte)(v2 >> 8)), ((byte)(v2 & 0xFF))});
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gutl)hftp1.b_message).c = s2;
                    }
                    if(!gutm0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gutm0).ensureMutable();
                    }
                    guts guts1 = (guts)gutm0.b_message;
                    gutl gutl3 = (gutl)hftp1.N_build();
                    gutl3.getClass();
                    guts1.m = gutl3;
                    guts1.b |= 0x40;
                    return;
                }
                return;
            }
            case 130: {
                gutl gutl4 = ((guts)gutm0.b_message).m;
                if(gutl4 == null) {
                    gutl4 = gutl.a;
                }
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gutl4).jf(5, null);
                hftp2.X(((ProtoLiteMessage)gutl4));
                String s3 = esxg.a(arr_b);
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((gutl)hftp2.b_message).d = s3;
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts2 = (guts)gutm0.b_message;
                gutl gutl5 = (gutl)hftp2.N_build();
                gutl5.getClass();
                guts2.m = gutl5;
                guts2.b |= 0x40;
                return;
            }
            case 0x5F28: {
                gutl gutl6 = ((guts)gutm0.b_message).m;
                if(gutl6 == null) {
                    gutl6 = gutl.a;
                }
                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gutl6).jf(5, null);
                hftp3.X(((ProtoLiteMessage)gutl6));
                int v3 = glwy.h(esyw.a(arr_b));
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((gutl)hftp3.b_message).h = v3;
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts3 = (guts)gutm0.b_message;
                gutl gutl7 = (gutl)hftp3.N_build();
                gutl7.getClass();
                guts3.m = gutl7;
                guts3.b |= 0x40;
                return;
            }
            case 0x9F27: {
                gutl gutl8 = ((guts)gutm0.b_message).m;
                if(gutl8 == null) {
                    gutl8 = gutl.a;
                }
                ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)gutl8).jf(5, null);
                hftp4.X(((ProtoLiteMessage)gutl8));
                String s4 = esxg.a(arr_b);
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ((gutl)hftp4.b_message).f = s4;
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts4 = (guts)gutm0.b_message;
                gutl gutl9 = (gutl)hftp4.N_build();
                gutl9.getClass();
                guts4.m = gutl9;
                guts4.b |= 0x40;
                return;
            }
            case 0x9F34: {
                gutl gutl10 = ((guts)gutm0.b_message).m;
                if(gutl10 == null) {
                    gutl10 = gutl.a;
                }
                ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)gutl10).jf(5, null);
                hftp5.X(((ProtoLiteMessage)gutl10));
                int v4 = glwy.h(esyw.a(arr_b));
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ((gutl)hftp5.b_message).e = v4;
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts5 = (guts)gutm0.b_message;
                gutl gutl11 = (gutl)hftp5.N_build();
                gutl11.getClass();
                guts5.m = gutl11;
                guts5.b |= 0x40;
                return;
            }
            case 0x9F36: {
                gutl gutl12 = ((guts)gutm0.b_message).m;
                if(gutl12 == null) {
                    gutl12 = gutl.a;
                }
                ProtoLiteBuilder hftp6 = (ProtoLiteBuilder)((ProtoLiteMessage)gutl12).jf(5, null);
                hftp6.X(((ProtoLiteMessage)gutl12));
                String s5 = esxg.a(arr_b);
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ((gutl)hftp6.b_message).c = s5;
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts6 = (guts)gutm0.b_message;
                gutl gutl13 = (gutl)hftp6.N_build();
                gutl13.getClass();
                guts6.m = gutl13;
                guts6.b |= 0x40;
                switch(((guts)gutm0.b_message).q) {
                    case 0: {
                        guug0 = guug.a;
                        break;
                    }
                    case 1: {
                        guug0 = guug.b;
                        break;
                    }
                    case 2: {
                        guug0 = guug.c;
                        break;
                    }
                    case 3: {
                        guug0 = guug.d;
                        break;
                    }
                    case 4: {
                        guug0 = guug.f;
                        break;
                    }
                    case 5: {
                        guug0 = guug.g;
                        break;
                    }
                    case 6: {
                        guug0 = guug.h;
                        break;
                    }
                    case 7: {
                        guug0 = guug.i;
                        break;
                    }
                    case 8: {
                        guug0 = guug.j;
                        break;
                    }
                    case 9: {
                        guug0 = guug.k;
                        break;
                    }
                    case 10: {
                        guug0 = guug.e;
                        break;
                    }
                    case 11: {
                        guug0 = guug.l;
                        break;
                    }
                    case 12: {
                        guug0 = guug.m;
                        break;
                    }
                    case 13: {
                        guug0 = guug.n;
                        break;
                    }
                    case 14: {
                        guug0 = guug.o;
                        break;
                    }
                    case 15: {
                        guug0 = guug.p;
                        break;
                    }
                    case 16: {
                        guug0 = guug.q;
                        break;
                    }
                    case 17: {
                        guug0 = guug.r;
                        break;
                    }
                    case 18: {
                        guug0 = guug.s;
                        break;
                    }
                    case 19: {
                        guug0 = guug.t;
                        break;
                    }
                    case 20: {
                        guug0 = guug.u;
                    }
                }
                if(guug0 == null) {
                    guug0 = guug.v;
                }
                if(guug0 == guug.f && arr_b.length == 2) {
                    esyr.n(gutm0, ((arr_b[0] & 0xFF) << 8) + arr_b[1]);
                    return;
                }
                return;
            }
            case 0x9F6C: {
                gutl gutl14 = ((guts)gutm0.b_message).m;
                if(gutl14 == null) {
                    gutl14 = gutl.a;
                }
                ProtoLiteBuilder hftp7 = (ProtoLiteBuilder)((ProtoLiteMessage)gutl14).jf(5, null);
                hftp7.X(((ProtoLiteMessage)gutl14));
                String s6 = esxg.a(arr_b);
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                ((gutl)hftp7.b_message).b = s6;
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts7 = (guts)gutm0.b_message;
                gutl gutl15 = (gutl)hftp7.N_build();
                gutl15.getClass();
                guts7.m = gutl15;
                guts7.b |= 0x40;
                gutl gutl16 = ((guts)gutm0.b_message).m;
                if(gutl16 == null) {
                    gutl16 = gutl.a;
                }
                String s7 = gutl16.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjuj gjuj0 = (gjuj)hftp0.b_message;
                s7.getClass();
                gjuj0.b |= 0x20000;
                gjuj0.u = s7;
                return;
            }
            case 0x9F6E: {
                gutl gutl17 = ((guts)gutm0.b_message).m;
                if(gutl17 == null) {
                    gutl17 = gutl.a;
                }
                ProtoLiteBuilder hftp8 = (ProtoLiteBuilder)((ProtoLiteMessage)gutl17).jf(5, null);
                hftp8.X(((ProtoLiteMessage)gutl17));
                String s8 = esxg.a(arr_b);
                if(!hftp8.b_message.isImmutable()) {
                    hftp8.ensureMutable();
                }
                ((gutl)hftp8.b_message).g = s8;
                if(!gutm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gutm0).ensureMutable();
                }
                guts guts8 = (guts)gutm0.b_message;
                gutl gutl18 = (gutl)hftp8.N_build();
                gutl18.getClass();
                guts8.m = gutl18;
                guts8.b |= 0x40;
            }
        }
    }

    static final etmv h(Context context0, esqi esqi0) {
        return new etmv(context0, esqi0.e);
    }

    static final guug i(String s) {
        switch(s.hashCode()) {
            case 0x81C3EF63: {
                return !s.equals("canonical_jcb_bundle") || !hyua.h() ? guug.a : guug.p;
            }
            case -1688490866: {
                return s.equals("canonical_interac_bundle") ? guug.i : guug.a;
            }
            case 0xAAFE24F5: {
                return s.equals("canonical_eftpos_bundle") ? guug.j : guug.a;
            }
            case 0xCA07600E: {
                return s.equals("amex2_bundle") ? guug.e : guug.a;
            }
            case 0xF6E4C9C0: {
                return s.equals("canonical_mc_bundle") ? guug.l : guug.a;
            }
            case 0x109CB7E7: {
                return !s.equals("canonical_rupay_bundle") || !hyua.k() ? guug.a : guug.q;
            }
            case 309674061: {
                return s.equals("canonical_discover_bundle") ? guug.k : guug.a;
            }
            case 366259608: {
                return s.equals("discover_bundle") ? guug.f : guug.a;
            }
            case 434689600: {
                return s.equals("visa_bundle") ? guug.b : guug.a;
            }
            case 0x392BE824: {
                return s.equals("canonical_elo_bundle") ? guug.m : guug.a;
            }
            case 0x43ACF3FA: {
                return s.equals("canonical_discover_v2_bundle") ? guug.r : guug.a;
            }
            case 1444310238: {
                return s.equals("canonical_pure_bundle") ? guug.o : guug.a;
            }
            case 1447930550: {
                return !s.equals("canonical_mir_bundle") || !hyua.j() ? guug.a : guug.n;
            }
            case 1640769725: {
                return s.equals("mcbp_bundle") ? guug.c : guug.a;
            }
            case 0x6F604556: {
                return !s.equals("canonical_cpace_bundle") || !hyua.g() ? guug.a : guug.u;
            }
            case 2050790425: {
                return !s.equals("canonical_interac_v2_bundle") || !hyua.f() ? guug.a : guug.s;
            }
            default: {
                return guug.a;
            }
        }
    }

    public static final void j(Context context0, esqi esqi0, guts guts0, boolean z, etmv etmv0) {
        if(z) {
            dmqa.b.a(context0);
        }
        if(esqi0.y != null && esqi0.d != null) {
            Intent intent0 = new Intent("com.google.android.gms.STORE_TAP").putExtra("account_id_extra", esqi0.d).putExtra("card_info_extra", esqi0.y).putExtra("tap_info_extra", guts0.toBytesArray());
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjrb.a).v_newBuilder();
            esyr.q(intent0, esqi0, guts0, hftp0, context0);
            if(hyvu.e()) {
                etmv0.n(((gjrb)hftp0.N_build()));
            }
            if(z || esyr.o(intent0)) {
                for(Object object0: context0.getPackageManager().queryIntentServices(intent0, 0)) {
                    ServiceInfo serviceInfo0 = ((ResolveInfo)object0).serviceInfo;
                    if(serviceInfo0 != null && serviceInfo0.exported && azql.c(context0).g(serviceInfo0.packageName)) {
                        ComponentName componentName0 = new ComponentName(serviceInfo0.packageName, serviceInfo0.name);
                        Intent intent1 = new Intent(intent0);
                        intent1.setComponent(componentName0);
                        context0.startService(intent1);
                    }
                }
                eviz.f(context0, intent0);
            }
            hyxp hyxp0 = hyxp.a;
            if(hyxp0.c().h()) {
                Intent intent2 = new Intent(intent0);
                intent2.setAction("com.google.android.gms.STORE_TAP");
                intent2.setPackage("com.google.hardware.techeng.sensors.datacollection.weardcfreeliving");
                context0.sendBroadcast(intent2);
            }
            hyxp0.c().k();
            Intent intent3 = IntentOperation.getStartIntent(context0, "com.google.android.gms.pay.transactions.data.StoreTapIntentOperation", "com.google.android.gms.STORE_TAP");
            if(intent3 != null) {
                intent3.putExtra("card_info_extra", esqi0.y).putExtra("tap_info_extra", guts0.toBytesArray());
                esyr.q(intent3, esqi0, guts0, hftp0, context0);
                if(hyvu.e()) {
                    etmv0.n(((gjrb)hftp0.N_build()));
                }
                if(z || esyr.o(intent3)) {
                    context0.startService(intent3);
                }
            }
            return;
        }
        ((ggtj)esyr.a.j()).x("Null card info or account, not reporting tap");
    }

    public static final ProtoLiteBuilder k(Context context0, esqi esqi0) {
        int v4;
        eubv eubv0 = new eubv(context0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjuj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        esqi0.a.getClass();
        int v = 1;
        ((gjuj)hftv0).b |= 1;
        ((gjuj)hftv0).e = esqi0.a;
        long v1 = esqi0.q - esqi0.p;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gjuj)hftv1).b |= 2;
        ((gjuj)hftv1).f = v1;
        long v2 = esqi0.s;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gjuj)hftv2).b |= 4;
        ((gjuj)hftv2).g = v2;
        long v3 = esqi0.t;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gjuj)hftv3).b |= 8;
        ((gjuj)hftv3).h = v3;
        boolean z = esqi0.u;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjuj gjuj0 = (gjuj)hftp0.b_message;
        gjuj0.b |= 0x20;
        gjuj0.j = z;
        switch(esqi0.v) {
            case -1: {
                v4 = 6;
                break;
            }
            case 1: {
                v4 = 2;
                break;
            }
            case 4: {
                v4 = 8;
                break;
            }
            case 5: {
                v4 = 9;
                break;
            }
            case 7: {
                v4 = 10;
                break;
            }
            case 9: {
                v4 = 17;
                break;
            }
            case 10: {
                v4 = 11;
                break;
            }
            case 11: {
                v4 = 12;
                break;
            }
            case 12: {
                v4 = 13;
                break;
            }
            case 13: {
                v4 = 4;
                break;
            }
            case 14: {
                v4 = 14;
                break;
            }
            case 15: {
                v4 = 15;
                break;
            }
            case 16: {
                v4 = 16;
                break;
            }
            case 17: {
                v4 = 20;
                break;
            }
            case 18: {
                v4 = 19;
                break;
            }
            case 19: {
                v4 = 21;
                break;
            }
            case 21: {
                v4 = 22;
                break;
            }
            case 22: {
                v4 = 23;
                break;
            }
            case 23: {
                v4 = 24;
                break;
            }
            case 24: {
                v4 = 25;
                break;
            }
            case 25: {
                v4 = 26;
                break;
            }
            case 26: {
                v4 = 27;
                break;
            }
            case 27: {
                v4 = 28;
                break;
            }
            case 28: {
                v4 = 29;
                break;
            }
            case 29: {
                v4 = 30;
                break;
            }
            case 30: {
                v4 = 0x1F;
                break;
            }
            case 37: {
                v4 = 0x20;
                break;
            }
            case 39: {
                v4 = 34;
                break;
            }
            case 41: {
                v4 = 33;
                break;
            }
            case 46: {
                v4 = 36;
                break;
            }
            case 0x2F: {
                v4 = hyua.l() ? 1 : 5;
                break;
            }
            default: {
                v4 = 5;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gjuj)hftv4).k = v4 - 1;
        ((gjuj)hftv4).b |= 0x80;
        int v5 = esqi0.ag;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjuj gjuj1 = (gjuj)hftp0.b_message;
        if(v5 == 0) {
            throw null;
        }
        gjuj1.l = v5 - 1;
        gjuj1.b |= 0x100;
        boolean z1 = bbpr.c(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((gjuj)hftv5).b |= 0x80000;
        ((gjuj)hftv5).v = z1;
        long v6 = esqi0.p;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        ((gjuj)hftv6).b |= 0x800000;
        ((gjuj)hftv6).x = v6;
        boolean z2 = esqi0.f;
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp0.b_message;
        ((gjuj)hftv7).b |= 0x8000000;
        ((gjuj)hftv7).B = z2;
        boolean z3 = esqi0.g;
        if(!hftv7.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv8 = hftp0.b_message;
        ((gjuj)hftv8).b |= 0x10000000;
        ((gjuj)hftv8).C = z3;
        int v7 = glwy.h(esqi0.j);
        if(!hftv8.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv9 = hftp0.b_message;
        ((gjuj)hftv9).c |= 0x40;
        ((gjuj)hftv9).J = v7;
        int v8 = esqi0.l;
        if(!hftv9.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv10 = hftp0.b_message;
        ((gjuj)hftv10).c |= 0x100;
        ((gjuj)hftv10).L = v8;
        int v9 = esqi0.k;
        if(!hftv10.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv11 = hftp0.b_message;
        ((gjuj)hftv11).c |= 0x80;
        ((gjuj)hftv11).K = v9;
        boolean z4 = esqi0.h;
        if(!hftv11.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv12 = hftp0.b_message;
        ((gjuj)hftv12).c |= 0x20;
        ((gjuj)hftv12).I = z4;
        boolean z5 = esqi0.i;
        if(!hftv12.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv13 = hftp0.b_message;
        ((gjuj)hftv13).b |= 0x4000000;
        ((gjuj)hftv13).A = z5;
        int v10 = esqi0.af;
        if(!hftv13.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv14 = hftp0.b_message;
        if(v10 == 0) {
            throw null;
        }
        ((gjuj)hftv14).E = v10 - 1;
        ((gjuj)hftv14).c |= 2;
        long v11 = esqi0.n;
        if(!hftv14.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjuj)hftp0.b_message).c |= 4;
        ((gjuj)hftp0.b_message).F = v11;
        guug guug0 = esyr.i(esqi0.z);
        int v12 = ftqn.a(guug.class, guug0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv15 = hftp0.b_message;
        ((gjuj)hftv15).c |= 0x800;
        ((gjuj)hftv15).O = v12;
        int v13 = esqi0.A;
        if(!hftv15.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv16 = hftp0.b_message;
        ((gjuj)hftv16).c |= 0x1000;
        ((gjuj)hftv16).P = v13;
        boolean z6 = esqi0.B;
        if(!hftv16.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv17 = hftp0.b_message;
        ((gjuj)hftv17).c |= 0x2000;
        ((gjuj)hftv17).Q = z6;
        boolean z7 = esqi0.C;
        if(!hftv17.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv18 = hftp0.b_message;
        ((gjuj)hftv18).c |= 0x4000;
        ((gjuj)hftv18).R = z7;
        boolean z8 = esqi0.D;
        if(!hftv18.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv19 = hftp0.b_message;
        ((gjuj)hftv19).c |= 0x8000;
        ((gjuj)hftv19).S = z8;
        boolean z9 = esqi0.I;
        if(!hftv19.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv20 = hftp0.b_message;
        ((gjuj)hftv20).c |= 0x20000;
        ((gjuj)hftv20).V = z9;
        boolean z10 = esqi0.K;
        if(!hftv20.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv21 = hftp0.b_message;
        ((gjuj)hftv21).c |= 0x40000;
        ((gjuj)hftv21).W = z10;
        gged_interceptors gged0 = esqi0.N;
        if(!hftv21.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjuj gjuj2 = (gjuj)hftp0.b_message;
        hfuo hfuo0 = gjuj2.X;
        if(!hfuo0.c()) {
            gjuj2.X = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, gjuj2.X);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv22 = hftp0.b_message;
        ((gjuj)hftv22).c |= 0x200000;
        ((gjuj)hftv22).aa = false;
        if(!hftv22.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjuj)hftp0.b_message).c |= 0x100000;
        ((gjuj)hftp0.b_message).Z = false;
        ggfp ggfp0 = espu.b(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjuj gjuj3 = (gjuj)hftp0.b_message;
        hfuo hfuo1 = gjuj3.U;
        if(!hfuo1.c()) {
            gjuj3.U = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(ggfp0, gjuj3.U);
        int v14 = esyr.p(esqi0.V);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv23 = hftp0.b_message;
        ((gjuj)hftv23).ah = v14 - 1;
        ((gjuj)hftv23).c |= 0x40000000;
        int v15 = esqi0.aj;
        if(!hftv23.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv24 = hftp0.b_message;
        if(v15 == 0) {
            throw null;
        }
        ((gjuj)hftv24).ai = v15 - 1;
        ((gjuj)hftv24).c |= 0x80000000;
        long v16 = esqi0.r;
        if(!hftv24.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv25 = hftp0.b_message;
        ((gjuj)hftv25).b |= 0x1000000;
        ((gjuj)hftv25).y = v16;
        long v17 = esqi0.o;
        if(!hftv25.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv26 = hftp0.b_message;
        ((gjuj)hftv26).c |= 0x2000000;
        ((gjuj)hftv26).ac = v17;
        boolean z11 = esqi0.J;
        if(!hftv26.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv27 = hftp0.b_message;
        ((gjuj)hftv27).c |= 0x1000000;
        ((gjuj)hftv27).ab = z11;
        esga esga0 = esqi0.m;
        if(!hftv27.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjuj)hftp0.b_message).ad = esga0.q;
        ((gjuj)hftp0.b_message).c |= 0x4000000;
        long v18 = eubv0.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjuj gjuj4 = (gjuj)hftp0.b_message;
        gjuj4.b |= 0x100000;
        gjuj4.w = v18;
        int v19 = eubv0.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv28 = hftp0.b_message;
        ((gjuj)hftv28).b |= 0x80000000;
        ((gjuj)hftv28).D = v19;
        if(!hftv28.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv29 = hftp0.b_message;
        ((gjuj)hftv29).an = 0;
        ((gjuj)hftv29).d |= 0x80;
        int v20 = esyr.p(esqi0.W);
        if(!hftv29.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv30 = hftp0.b_message;
        ((gjuj)hftv30).ap = v20 - 1;
        ((gjuj)hftv30).d |= 0x400;
        String s = esqi0.ac;
        if(s != null) {
            if(!hftv30.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjuj)hftp0.b_message).d |= 0x20;
            ((gjuj)hftp0.b_message).al = s;
        }
        if(hyqr.e() || hyqr.d() && esqi0.Z) {
            boolean z12 = esqi0.aa;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv31 = hftp0.b_message;
            ((gjuj)hftv31).c |= 0x8000000;
            ((gjuj)hftv31).ae = z12;
            boolean z13 = esqi0.ab;
            if(!hftv31.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjuj)hftp0.b_message).c |= 0x10000000;
            ((gjuj)hftp0.b_message).af = z13;
        }
        if(hyqh.d()) {
            boolean z14 = esqi0.M;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjuj)hftp0.b_message).d |= 16;
            ((gjuj)hftp0.b_message).ak = z14;
        }
        gjwt gjwt0 = esqi0.ad;
        if(gjwt0 != null) {
            String s1 = gjwt0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv32 = hftp0.b_message;
            s1.getClass();
            ((gjuj)hftv32).d |= 4;
            ((gjuj)hftv32).aj = s1;
            long v21 = esqi0.p - esqi0.ad.e;
            if(!hftv32.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjuj gjuj5 = (gjuj)hftp0.b_message;
            gjuj5.b |= 16;
            gjuj5.i = v21;
            if(hypp.a.b().v()) {
                boolean z15 = esqi0.ad.j;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjuj)hftp0.b_message).d |= 0x40;
                ((gjuj)hftp0.b_message).am = z15;
            }
        }
        if(hyul.c()) {
            gtmx gtmx0 = ftrk.a(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjuj gjuj6 = (gjuj)hftp0.b_message;
            gjuj6.ao = gtmx0.a();
            gjuj6.d |= 0x100;
        }
        esqg esqg0 = esqi0.x;
        if(esqg0 != null) {
            String s2 = bbqr.c(esqg0.a);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjuj gjuj7 = (gjuj)hftp0.b_message;
            gjuj7.b |= 0x200;
            gjuj7.m = s2;
            boolean z16 = esyz.a(esqg0, esqi0.y);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv33 = hftp0.b_message;
            ((gjuj)hftv33).b |= 0x2000000;
            ((gjuj)hftv33).z = z16;
            boolean z17 = esqg0.g;
            if(!hftv33.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv34 = hftp0.b_message;
            ((gjuj)hftv34).c |= 16;
            ((gjuj)hftv34).H = z17;
            int v22 = esqg0.c ? 2 : 3;
            if(!hftv34.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv35 = hftp0.b_message;
            ((gjuj)hftv35).G = v22 - 1;
            ((gjuj)hftv35).c |= 8;
            int v23 = esqg0.i;
            if(!hftv35.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv36 = hftp0.b_message;
            ((gjuj)hftv36).c |= 0x200;
            ((gjuj)hftv36).M = v23;
            gjuf gjuf0 = esqg0.k;
            if(!hftv36.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv37 = hftp0.b_message;
            ((gjuj)hftv37).N = gjuf0.k;
            ((gjuj)hftv37).c |= 0x400;
            boolean z18 = esqg0.j;
            if(!hftv37.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjuj)hftp0.b_message).c |= 0x80000;
            ((gjuj)hftp0.b_message).Y = z18;
            esqh esqh0 = esqg0.d;
            if(esqh0 != null) {
                switch(esqh0.ordinal()) {
                    case 0: {
                        v = 2;
                        break;
                    }
                    case 1: {
                        v = 3;
                        break;
                    }
                    case 2: {
                        v = 4;
                        break;
                    }
                    case 3: {
                        v = 5;
                        break;
                    }
                    default: {
                        throw new RuntimeException(null, null);
                    }
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjuj)hftp0.b_message).T = v - 1;
            ((gjuj)hftp0.b_message).c |= 0x10000;
        }
        return hftp0;
    }

    // Detected as a lambda impl.
    public static final void l(Context context0, esqi esqi0, esqf esqf0) {
        boolean z = !hyxp.a.c().g();
        try {
            String s = esqi0.a;
            gjqv gjqv0 = esyr.d(s, esqf0);
            etmv etmv0 = esyr.h(context0, esqi0);
            ProtoLiteBuilder hftp0 = etmv0.am(gjsj.c, esqi0.y);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjzl gjzl0 = (gjzl)hftp0.b_message;
            gjqv0.getClass();
            gjzl0.h = gjqv0;
            gjzl0.b |= 8;
            etmv0.m(((gjzl)hftp0.N_build()), s);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            a.ae(esyr.a.j(), "Logging APDU failed", arrayIndexOutOfBoundsException0);
        }
    }

    private static String m(byte[] arr_b) {
        return arr_b[0] != 0 || arr_b[1] != -92 ? "" : esxg.a(Arrays.copyOfRange(arr_b, 5, arr_b[4] + 5));
    }

    private static void n(gutm gutm0, int v) {
        ProtoLiteBuilder hftp0;
        String s = ghgc.a.c(String.format(Locale.US, "%03d", v), StandardCharsets.UTF_8).toString();
        String s1 = s.substring(s.length() - 8);
        guts guts0 = (guts)gutm0.b_message;
        if((guts0.b & 4) == 0) {
            hftp0 = ((ProtoLiteMessage)gutt.a).v_newBuilder();
        }
        else {
            gutt gutt0 = guts0.h == null ? gutt.a : guts0.h;
            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gutt0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gutt0));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gutt gutt1 = (gutt)hftp0.b_message;
        s1.getClass();
        gutt1.y = s1;
        if(!gutm0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gutm0).ensureMutable();
        }
        guts guts1 = (guts)gutm0.b_message;
        gutt gutt2 = (gutt)hftp0.N_build();
        gutt2.getClass();
        guts1.h = gutt2;
        guts1.b |= 4;
    }

    private static boolean o(Intent intent0) {
        return hytb.d() ? intent0.getIntExtra("auth_setting_update_notification_action_type", 0) != 0 : false;
    }

    private static int p(int v) {
        return v == 2 || v == 3 || v == 4 ? 2 : 1;
    }

    private static final void q(Intent intent0, esqi esqi0, guts guts0, ProtoLiteBuilder hftp0, Context context0) {
        if(hytb.d()) {
            int v = new dyct().a(1);
            int v1 = 0;
            boolean z = (guts0.b & 8) == 0 ? false : (guts0.j == null ? gjuj.a : guts0.j).z;
            if(z) {
                if(((long)v) >= hytb.a.c().c()) {
                    Level level0 = esgh.a();
                    esyr.a.g(level0).x("Notification for open loop transit exceeds limit.");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjrb)hftp0.b_message).d = 1;
                    ((gjrb)hftp0.b_message).b |= 2;
                    return;
                }
                if(esqi0.V == 4) {
                    Level level1 = esgh.a();
                    esyr.a.g(level1).x("Auth required transit setting is disabled, notification for open loop transit should not show.");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjrb)hftp0.b_message).d = 3;
                    ((gjrb)hftp0.b_message).b |= 2;
                    return;
                }
            }
            int v2 = new dyct().a(2);
            boolean z1 = !z && (guts0.b & 8) != 0 && !(guts0.j == null ? gjuj.a : guts0.j).S;
            if(z1 && ((long)v2) >= hytb.a.c().b()) {
                Level level2 = esgh.a();
                esyr.a.g(level2).x("Notification for lock screen tap exceeds limit.");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjrb)hftp0.b_message).c = 1;
                ((gjrb)hftp0.b_message).b |= 1;
                return;
            }
            eubv eubv0 = new eubv(context0);
            boolean z2 = cjpd.b(eubv0.c, "last_insecure_unlock", -1L) > eubv0.d() && esqi0.v == 19;
            if(hytb.e() && (z2 && ((long)new dyct().a(3)) >= hytb.a.c().a())) {
                Level level3 = esgh.a();
                esyr.a.g(level3).x("Notification for insecure unlock screen tap exceeds limit.");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjrb)hftp0.b_message).e = 1;
                ((gjrb)hftp0.b_message).b |= 4;
                return;
            }
            if(z) {
                v1 = 1;
            }
            else if(z1) {
                v1 = 2;
            }
            else if(hytb.e() && z2) {
                v1 = 3;
            }
            Level level4 = esgh.a();
            esyr.a.g(level4).z("Allow auth setting update notification for type: %s", v1);
            if(v1 == 1) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjrb)hftp0.b_message).d = 2;
                ((gjrb)hftp0.b_message).b |= 2;
            }
            else if(v1 == 2) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjrb)hftp0.b_message).c = 2;
                ((gjrb)hftp0.b_message).b |= 1;
            }
            else if(hytb.e() && v1 == 3) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjrb)hftp0.b_message).e = 2;
                ((gjrb)hftp0.b_message).b |= 4;
            }
            intent0.putExtra("auth_setting_update_notification_action_type", v1);
        }
    }
}

