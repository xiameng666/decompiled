import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

public final class atyd {
    private static final avjh a;
    private final atyc b;

    static {
        atyd.a = new avjh("AppLaunchAnalytics");
    }

    public atyd(atyc atyc0) {
        this.b = atyc0;
        avij.e();
    }

    public final void a(CastDevice castDevice0, long v, int v1, String s, atyb atyb0, String s1, String s2, String s3) {
        synchronized(this) {
            if(castDevice0 == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = atyd.j(s1);
            int v3 = TextUtils.isEmpty(s2) ^ 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glbg glbg0 = (glbg)hftp0.b_message;
            glbg0.b |= 8;
            glbg0.f = v3;
            glbg glbg1 = (glbg)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glar.a).v_newBuilder();
            int v4 = atyd.g(v1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((glar)hftv0).e = v4 - 1;
            ((glar)hftv0).b |= 8;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            glar glar0 = (glar)hftp1.b_message;
            glbg1.getClass();
            glar0.f = glbg1;
            glar0.b |= 16;
            glar glar1 = (glar)hftp1.N_build();
            atyc atyc0 = this.b;
            glah glah0 = atyc0.c(v, s, atyb0);
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glar1.getClass();
            glai0.i = glar1;
            glai0.b |= 0x40;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).e = 2;
            ((glai)glah0.b_message).b |= 4;
            atyd.h(glah0, s3);
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.G);
        }
    }

    public final void b(CastDevice castDevice0, long v, String s, String s1, atyb atyb0, long v1, String s2) {
        synchronized(this) {
            if(castDevice0 != null && s != null) {
                glbg glbg0 = (glbg)atyd.i(1, s, v1).N_build();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glar.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glar glar0 = (glar)hftp0.b_message;
                glbg0.getClass();
                glar0.f = glbg0;
                glar0.b |= 16;
                glar glar1 = (glar)hftp0.N_build();
                atyc atyc0 = this.b;
                glah glah0 = atyc0.c(v, s1, atyb0);
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                glai glai0 = (glai)glah0.b_message;
                glar1.getClass();
                glai0.i = glar1;
                glai0.b |= 0x40;
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                ((glai)glah0.b_message).e = 2;
                ((glai)glah0.b_message).b |= 4;
                atyd.h(glah0, s2);
                atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.H);
            }
        }
    }

    public final void c(CastDevice castDevice0, long v, int v1, String s, atyb atyb0, String s1, String s2) {
        synchronized(this) {
            if(castDevice0 == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glar.a).v_newBuilder();
            int v3 = atyd.g(v1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glar)hftp0.b_message).e = v3 - 1;
            ((glar)hftp0.b_message).b |= 8;
            ProtoLiteBuilder hftp1 = atyd.j(s1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glar glar0 = (glar)hftp0.b_message;
            glbg glbg0 = (glbg)hftp1.N_build();
            glbg0.getClass();
            glar0.f = glbg0;
            glar0.b |= 16;
            glar glar1 = (glar)hftp0.N_build();
            atyc atyc0 = this.b;
            glah glah0 = atyc0.c(v, s, atyb0);
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glar1.getClass();
            glai0.i = glar1;
            glai0.b |= 0x40;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).e = 2;
            ((glai)glah0.b_message).b |= 4;
            atyd.h(glah0, s2);
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.I);
        }
    }

    public final void d(CastDevice castDevice0, long v, String s, boolean z, String s1, atyb atyb0, int v1, String s2) {
        int v3;
        synchronized(this) {
            if(castDevice0 != null && s != null) {
                ProtoLiteBuilder hftp0 = atyd.k(2, s);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glbg glbg0 = (glbg)hftp0.b_message;
                glbg0.b |= 8;
                glbg0.f = z;
                switch(v1) {
                    case 0: {
                        v3 = 2;
                        break;
                    }
                    case 2: {
                        v3 = 3;
                        break;
                    }
                    default: {
                        v3 = 1;
                    }
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((glbg)hftp0.b_message).g = v3 - 1;
                ((glbg)hftp0.b_message).b |= 16;
                glbg glbg1 = (glbg)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glar.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glar glar0 = (glar)hftp1.b_message;
                glbg1.getClass();
                glar0.f = glbg1;
                glar0.b |= 16;
                glar glar1 = (glar)hftp1.N_build();
                atyc atyc0 = this.b;
                glah glah0 = atyc0.c(v, s1, atyb0);
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                glai glai0 = (glai)glah0.b_message;
                glar1.getClass();
                glai0.i = glar1;
                glai0.b |= 0x40;
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                ((glai)glah0.b_message).e = 2;
                ((glai)glah0.b_message).b |= 4;
                atyd.h(glah0, s2);
                atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.E);
            }
        }
    }

    public final void e(CastDevice castDevice0, long v, String s, boolean z, String s1, atyb atyb0, String s2) {
        synchronized(this) {
            if(castDevice0 != null && s != null) {
                ProtoLiteBuilder hftp0 = atyd.k(3, s);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glbg glbg0 = (glbg)hftp0.b_message;
                glbg0.b |= 4;
                glbg0.e = z;
                glbg glbg1 = (glbg)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glar.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glar glar0 = (glar)hftp1.b_message;
                glbg1.getClass();
                glar0.f = glbg1;
                glar0.b |= 16;
                glar glar1 = (glar)hftp1.N_build();
                atyc atyc0 = this.b;
                glah glah0 = atyc0.c(v, s1, atyb0);
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                glai glai0 = (glai)glah0.b_message;
                glar1.getClass();
                glai0.i = glar1;
                glai0.b |= 0x40;
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                ((glai)glah0.b_message).e = 2;
                ((glai)glah0.b_message).b |= 4;
                atyd.h(glah0, s2);
                atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.E);
            }
        }
    }

    public final void f(CastDevice castDevice0, long v, String s, boolean z, String s1, atyb atyb0, long v1, String s2) {
        synchronized(this) {
            if(castDevice0 != null && s != null) {
                ProtoLiteBuilder hftp0 = atyd.i(3, s, v1);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glbg glbg0 = (glbg)hftp0.b_message;
                glbg0.b |= 4;
                glbg0.e = z;
                glbg glbg1 = (glbg)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glar.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glar glar0 = (glar)hftp1.b_message;
                glbg1.getClass();
                glar0.f = glbg1;
                glar0.b |= 16;
                glar glar1 = (glar)hftp1.N_build();
                atyc atyc0 = this.b;
                glah glah0 = atyc0.c(v, s1, atyb0);
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                glai glai0 = (glai)glah0.b_message;
                glar1.getClass();
                glai0.i = glar1;
                glai0.b |= 0x40;
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                ((glai)glah0.b_message).e = 2;
                ((glai)glah0.b_message).b |= 4;
                atyd.h(glah0, s2);
                atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.F);
            }
        }
    }

    static int g(int v) {
        if(v != 15) {
            switch(v) {
                case 2001: {
                    return 7;
                }
                case 2002: {
                    return 5;
                }
                case 2003: {
                    return 4;
                }
                case 2004: {
                    return 2;
                }
                case 2005: 
                case 2050: 
                case 0x803: 
                case 0x804: 
                case 0x805: 
                case 0x806: 
                case 0x807: {
                    return 3;
                }
                default: {
                    return 1;
                }
            }
        }
        return 6;
    }

    private static final void h(glah glah0, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glac.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glac glac0 = (glac)hftp0.b_message;
        s.getClass();
        glac0.b |= 1;
        glac0.c = s;
        glah0.k(((glac)hftp0.N_build()));
    }

    private static final ProtoLiteBuilder i(int v, String s, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glbg.a).v_newBuilder();
        int v2 = 0;
        if(!TextUtils.isEmpty(s)) {
            try {
                v2 = (int)Long.parseLong(s, 16);
            }
            catch(NumberFormatException unused_ex) {
                atyd.a.j("Unable to convert app id to integer: %s", new Object[]{s});
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((glbg)hftv0).b |= 1;
        ((glbg)hftv0).c = v2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((glbg)hftv1).d = v - 1;
        ((glbg)hftv1).b |= 2;
        if(v1 != -1L) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            glbg glbg0 = (glbg)hftp0.b_message;
            glbg0.b |= 0x20;
            glbg0.h = (int)v1;
        }
        return hftp0;
    }

    private static final ProtoLiteBuilder j(String s) {
        return atyd.i(1, s, -1L);
    }

    private static final ProtoLiteBuilder k(int v, String s) {
        return atyd.i(v, s, -1L);
    }
}

