import com.google.android.gms.cast.CastDevice;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class atyk {
    final atzc a;
    public atxs b;
    private static final avjh c;
    private final Map d;
    private final Map e;
    private final boolean f;
    private final atyc g;
    private final ausg h;

    static {
        atyk.c = new avjh("DiscoveryAnalyticsRecorder");
    }

    public atyk(ausg ausg0, atyc atyc0, atzc atzc0) {
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = hqqp.a.b().p();
        this.h = ausg0;
        this.g = atyc0;
        this.a = atzc0;
    }

    public final void a() {
        synchronized(this) {
            atxs atxs0 = this.b;
            if(atyc.p(atxs0) && atxs0 != null) {
                glai glai0 = (glai)((ProtoLiteBuilder)this.g.e(atxs0)).N_build();
                this.g.n(glai0, gkey.an);
            }
        }
    }

    public final void b(Set set0) {
        synchronized(this) {
            atyc atyc0 = this.g;
            glah glah0 = atyc0.b();
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            ((glai)glah0.b_message).D = hfvv.a;
            glah0.a(atyk.k(set0));
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.aI);
        }
    }

    public final void c(Set set0, int v) {
        synchronized(this) {
            avjh avjh0 = atyk.c;
            avjh0.n("logDiscoveryStart was invoked with scannerFlags = %d", Integer.valueOf(v));
            this.b = this.j(v);
            if(hqsj.a.b().a()) {
                this.g.m(this.b);
            }
            this.d.clear();
            this.e.clear();
            atxs atxs0 = this.b;
            if(atyc.p(atxs0)) {
                this.a.g(System.currentTimeMillis(), atxs0 != null && atxs0.g());
                atxs atxs1 = this.b;
                if(atxs1 != null) {
                    atyc atyc0 = this.g;
                    glah glah0 = atyc0.e(atxs1);
                    if(!glah0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glah0).ensureMutable();
                    }
                    ((glai)glah0.b_message).D = hfvv.a;
                    glah0.a(atyk.k(set0));
                    boolean z = this.h.k();
                    if(!glah0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glah0).ensureMutable();
                    }
                    ((glai)glah0.b_message).c |= 0x400;
                    ((glai)glah0.b_message).Q = z;
                    atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.al);
                    avjh0.q("%s event was logged [%s]-[%d]", gkey.al.name(), ((glai)glah0.b_message).o, Long.valueOf(((glai)glah0.b_message).d));
                }
            }
        }
    }

    public final void d(Set set0, gkex gkex0) {
        synchronized(this) {
            atxs atxs0 = this.b;
            if(atyc.p(atxs0)) {
                gftb.check(atxs0);
                atyc atyc0 = this.g;
                glbb glbb0 = this.a.a();
                glah glah0 = atyc0.e(atxs0);
                gkex gkex1 = (gkex)atyc.i(gkex0, gkex.a);
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                ((glai)glah0.b_message).F = gkex1.i;
                ((glai)glah0.b_message).b |= 0x8000000;
                int v1 = atxs0.b();
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                glai glai0 = (glai)glah0.b_message;
                glai0.b |= 0x20000000;
                glai0.G = v1;
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                ((glai)glah0.b_message).D = hfvv.a;
                glah0.a(atyk.k(set0));
                if(glbb0 != null) {
                    if(!glah0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glah0).ensureMutable();
                    }
                    ((glai)glah0.b_message).U = glbb0;
                    ((glai)glah0.b_message).c |= 0x8000;
                }
                atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.am);
                if(!this.f) {
                    this.b = null;
                    this.d.clear();
                    this.e.clear();
                }
            }
        }
    }

    public final void e(List list0, Long long0) {
        synchronized(this) {
            if(!list0.isEmpty()) {
                atxs atxs0 = this.b;
                if(atxs0 != null) {
                    atyc atyc0 = this.g;
                    atyc0.m(atxs0);
                    glah glah0 = atyc0.e(atxs0);
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: list0) {
                        CastDevice castDevice0 = ((aujj)object0).d();
                        Set set0 = ((aujj)object0).d;
                        Set set1 = ((aujj)object0).e;
                        boolean z = ((aujj)object0).g();
                        glby glby0 = (glby)((ProtoLiteMessage)glbz.a).v_newBuilder();
                        String s = atyc0.j(castDevice0, atxs0.a);
                        if(!glby0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)glby0).ensureMutable();
                        }
                        glbz glbz0 = (glbz)glby0.b_message;
                        s.getClass();
                        glbz0.b |= 1;
                        glbz0.c = s;
                        if(!glby0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)glby0).ensureMutable();
                        }
                        glbz glbz1 = (glbz)glby0.b_message;
                        glbz1.b |= 2;
                        glbz1.f = z;
                        if(set0.size() + set1.size() > 0) {
                            if(!set0.isEmpty()) {
                                for(Object object1: set0) {
                                    glby0.a(atyc.g(((String)object1), ""));
                                }
                            }
                            if(!set1.isEmpty()) {
                                for(Object object2: set1) {
                                    glby0.a(atyc.g(((String)object2), "R:"));
                                }
                            }
                        }
                        arrayList0.add(((glbz)((ProtoLiteBuilder)glby0).N_build()));
                    }
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glbx.a).v_newBuilder();
                    long v1 = (long)long0;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    glbx glbx0 = (glbx)hftp0.b_message;
                    glbx0.b |= 1;
                    glbx0.c = v1;
                    long v2 = System.currentTimeMillis();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((glbx)hftv0).b |= 2;
                    ((glbx)hftv0).d = v2;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    glbx glbx1 = (glbx)hftp0.b_message;
                    hfuo hfuo0 = glbx1.e;
                    if(!hfuo0.c()) {
                        glbx1.e = ProtoLiteMessage.E(hfuo0);
                    }
                    hfrj.E(arrayList0, glbx1.e);
                    glbx glbx2 = (glbx)hftp0.N_build();
                    if(!glah0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glah0).ensureMutable();
                    }
                    glai glai0 = (glai)glah0.b_message;
                    glbx2.getClass();
                    glai0.x = glbx2;
                    glai0.b |= 0x80000;
                    if(!glah0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glah0).ensureMutable();
                    }
                    ((glai)glah0.b_message).w = hfvv.a;
                    if(!glah0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glah0).ensureMutable();
                    }
                    glai glai1 = (glai)glah0.b_message;
                    hfuo hfuo1 = glai1.w;
                    if(!hfuo1.c()) {
                        glai1.w = ProtoLiteMessage.E(hfuo1);
                    }
                    hfrj.E(arrayList0, glai1.w);
                    atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.au);
                }
            }
        }
    }

    public final void f() {
        synchronized(this) {
            this.a.f();
        }
    }

    public final void g(aukm aukm0, InetSocketAddress inetSocketAddress0) {
        synchronized(this) {
            this.a.e(aukm0, inetSocketAddress0);
        }
    }

    public final void h(int v, int v1) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glam.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((glam)hftv0).c = v - 1;
            ((glam)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glam)hftp0.b_message).d = v1 - 1;
            ((glam)hftp0.b_message).b |= 2;
            glam glam0 = (glam)hftp0.N_build();
            atyc atyc0 = this.g;
            glah glah0 = atyc0.b();
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glam0.getClass();
            glai0.X = glam0;
            glai0.c |= 0x80000;
            atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.bn);
        }
    }

    public final void i(aukm aukm0, int v) {
        synchronized(this) {
            this.a.l(aukm0, v);
        }
    }

    private final atxs j(int v) {
        synchronized(this) {
            atyc atyc0 = this.g;
            atyb atyb0 = atyc0.a();
            Integer integer0 = null;
            if(atyb0 != null) {
                boolean z = atyc0.q(atyb0);
                Integer integer1 = this.h.a(null);
                if(integer1 != null) {
                    integer0 = (int)(((((int)integer1) >> 16 & 0xFF) << 8) + (((int)integer1) >> 24 & 0xFF));
                }
                return new atxs(v, atyb0, z, integer0);
            }
        }
        return null;
    }

    private static List k(Set set0) {
        List list0 = new ArrayList();
        if(set0 != null && !set0.isEmpty()) {
            for(Object object0: set0) {
                list0.add(atyc.g(((String)object0), ""));
            }
        }
        return list0;
    }
}

