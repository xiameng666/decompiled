import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class atyh {
    public final atyc a;
    private final auiz b;

    public atyh(atyc atyc0, auiz auiz0) {
        this.a = atyc0;
        this.b = auiz0;
    }

    public final void a(glah glah0, CastDevice castDevice0) {
        glcb glcb0 = atyc.h(castDevice0);
        if(glcb0 != null) {
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).aa = glcb0;
            ((glai)glah0.b_message).c |= 0x2000000;
        }
        auiz auiz0 = this.b;
        String s = castDevice0.n;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Map map0 = auiz0.b.g;
        synchronized(map0) {
            for(Object object0: map0.values()) {
                for(Object object1: ((List)object0)) {
                    if(TextUtils.equals(((auku)object1).b, s)) {
                        if(!glah0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)glah0).ensureMutable();
                        }
                        ((glai)glah0.b_message).S = 2;
                        ((glai)glah0.b_message).c |= 0x1000;
                        return;
                    }
                }
            }
        }
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        ((glai)glah0.b_message).S = 1;
        ((glai)glah0.b_message).c |= 0x1000;
    }

    public final void b(CastDevice castDevice0, long v, boolean z, gket gket0, String s, atyb atyb0, String s1) {
        synchronized(this) {
            if(castDevice0 == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glar.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((glar)hftv0).b |= 1;
            ((glar)hftv0).c = z;
            gket gket1 = (gket)atyc.i(gket0, gket.a);
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glar)hftp0.b_message).d = gket1.Y;
            ((glar)hftp0.b_message).b |= 2;
            glar glar0 = (glar)hftp0.N_build();
            atyc atyc0 = this.a;
            glah glah0 = atyc0.c(v, s, atyb0);
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glar0.getClass();
            glai0.i = glar0;
            glai0.b |= 0x40;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).e = 1;
            ((glai)glah0.b_message).b |= 4;
            this.a(glah0, castDevice0);
            atyh.e(glah0, s1);
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.B);
        }
    }

    public final void c(CastDevice castDevice0, long v, boolean z, String s, atyb atyb0, boolean z1, String s1) {
        synchronized(this) {
            if(castDevice0 == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glar.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((glar)hftv0).b |= 1;
            ((glar)hftv0).c = z;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            glar glar0 = (glar)hftp0.b_message;
            glar0.b |= 0x40;
            glar0.h = z1;
            glar glar1 = (glar)hftp0.N_build();
            atyc atyc0 = this.a;
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
            ((glai)glah0.b_message).e = 1;
            ((glai)glah0.b_message).b |= 4;
            boolean z2 = castDevice0.j();
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).c |= 0x800;
            ((glai)glah0.b_message).R = z2;
            this.a(glah0, castDevice0);
            atyh.e(glah0, s1);
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.C);
        }
    }

    public final void d(atyx atyx0, String s) {
        synchronized(this) {
            atyc atyc0 = this.a;
            glah glah0 = atyc0.b();
            atyh.e(glah0, s);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glbm.a).v_newBuilder();
            Map map0 = atyx0.a;
            for(Object object0: map0.entrySet()) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glcj.a).v_newBuilder();
                gkfu gkfu0 = (gkfu)((atyw)((Map.Entry)object0).getKey()).a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((glcj)hftp1.b_message).c = gkfu0.g;
                ((glcj)hftp1.b_message).b |= 1;
                int v1 = ((atyw)((Map.Entry)object0).getKey()).b.f;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glcj glcj0 = (glcj)hftp1.b_message;
                glcj0.b |= 2;
                glcj0.d = v1;
                glaa glaa0 = ((atzh)((Map.Entry)object0).getValue()).a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glcj glcj1 = (glcj)hftp1.b_message;
                glaa0.getClass();
                glcj1.e = glaa0;
                glcj1.b |= 4;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glbm glbm0 = (glbm)hftp0.b_message;
                glcj glcj2 = (glcj)hftp1.N_build();
                glcj2.getClass();
                hfuo hfuo0 = glbm0.c;
                if(!hfuo0.c()) {
                    glbm0.c = ProtoLiteMessage.E(hfuo0);
                }
                glbm0.c.add(glcj2);
            }
            Map map1 = atyx0.b;
            for(Object object1: map1.entrySet()) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glao.a).v_newBuilder();
                gker gker0 = (gker)((atyw)((Map.Entry)object1).getKey()).a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((glao)hftp2.b_message).c = gker0.f;
                ((glao)hftp2.b_message).b |= 1;
                int v2 = ((atyw)((Map.Entry)object1).getKey()).b.f;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                glao glao0 = (glao)hftp2.b_message;
                glao0.b |= 2;
                glao0.d = v2;
                glaa glaa1 = ((atzh)((Map.Entry)object1).getValue()).a();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                glao glao1 = (glao)hftp2.b_message;
                glaa1.getClass();
                glao1.e = glaa1;
                glao1.b |= 4;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glbm glbm1 = (glbm)hftp0.b_message;
                glao glao2 = (glao)hftp2.N_build();
                glao2.getClass();
                hfuo hfuo1 = glbm1.d;
                if(!hfuo1.c()) {
                    glbm1.d = ProtoLiteMessage.E(hfuo1);
                }
                glbm1.d.add(glao2);
            }
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)glca.a).v_newBuilder();
            atzh atzh0 = atyx0.c;
            glaa glaa2 = atzh0.a();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            glca glca0 = (glca)hftp3.b_message;
            glaa2.getClass();
            glca0.c = glaa2;
            glca0.b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glbm glbm2 = (glbm)hftp0.b_message;
            glca glca1 = (glca)hftp3.N_build();
            glca1.getClass();
            glbm2.e = glca1;
            glbm2.b |= 1;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glbm glbm3 = (glbm)hftp0.N_build();
            glbm3.getClass();
            glai0.T = glbm3;
            glai0.c |= 0x4000;
            map0.clear();
            map1.clear();
            atzh0.c();
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.bg);
        }
    }

    public static final void e(glah glah0, String s) {
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

    public final void f(CastDevice castDevice0, long v, boolean z, String s, atyb atyb0, int v1, String s1) {
        synchronized(this) {
            if(castDevice0 == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glar.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((glar)hftv0).b |= 1;
            ((glar)hftv0).c = z;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glar)hftp0.b_message).g = v1 - 1;
            ((glar)hftp0.b_message).b |= 0x20;
            glar glar0 = (glar)hftp0.N_build();
            atyc atyc0 = this.a;
            glah glah0 = atyc0.c(v, s, atyb0);
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glar0.getClass();
            glai0.i = glar0;
            glai0.b |= 0x40;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).e = 1;
            ((glai)glah0.b_message).b |= 4;
            this.a(glah0, castDevice0);
            atyh.e(glah0, s1);
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.A);
        }
    }

    public final void g(CastDevice castDevice0, long v, boolean z, String s, atyb atyb0, int v1, String s1) {
        synchronized(this) {
            if(castDevice0 == null) {
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glar.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((glar)hftv0).b |= 1;
            ((glar)hftv0).c = z;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glar)hftp0.b_message).i = v1 - 1;
            ((glar)hftp0.b_message).b |= 0x80;
            glar glar0 = (glar)hftp0.N_build();
            atyc atyc0 = this.a;
            glah glah0 = atyc0.c(v, s, atyb0);
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glar0.getClass();
            glai0.i = glar0;
            glai0.b |= 0x40;
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).e = 1;
            ((glai)glah0.b_message).b |= 4;
            boolean z1 = castDevice0.j();
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).c |= 0x800;
            ((glai)glah0.b_message).R = z1;
            this.a(glah0, castDevice0);
            atyh.e(glah0, s1);
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.bI);
        }
    }
}

