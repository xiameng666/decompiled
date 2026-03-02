import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class atzc {
    public atxp a;
    final Map b;
    final Map c;
    private final auiz d;
    private final auhn e;
    private final avij f;
    private boolean g;
    private boolean h;
    private boolean i;
    private long j;
    private long k;
    private long l;
    private final Map m;
    private final Set n;

    public atzc(auiz auiz0, auhn auhn0) {
        this.j = -1L;
        this.k = -1L;
        this.l = -1L;
        this.b = new HashMap();
        this.m = new HashMap();
        this.n = new HashSet();
        this.c = new HashMap();
        this.d = auiz0;
        this.e = auhn0;
        this.f = avij.e();
    }

    public final glbb a() {
        glbb glbb6;
        glcr glcr0;
        long v2;
        Iterator iterator1;
        synchronized(this) {
            if(!this.g) {
                return glbb.a;
            }
            glba glba0 = (glba)((ProtoLiteMessage)glbb.a).v_newBuilder();
            boolean z = this.h;
            if(!glba0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glba0).ensureMutable();
            }
            glbb glbb0 = (glbb)glba0.b_message;
            glbb0.b |= 1;
            glbb0.d = z;
            if(!glba0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glba0).ensureMutable();
            }
            glbb glbb1 = (glbb)glba0.b_message;
            glbb1.b |= 2;
            glbb1.e = true;
            long v1 = this.j;
            if(!glba0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glba0).ensureMutable();
            }
            glbb glbb2 = (glbb)glba0.b_message;
            glbb2.b |= 4;
            glbb2.f = v1;
            Map map0 = this.c;
            HashSet hashSet0 = new HashSet(map0.values());
            for(Iterator iterator0 = this.b.values().iterator(); iterator0.hasNext(); iterator0 = iterator1) {
                Object object0 = iterator0.next();
                atyz atyz0 = (atyz)object0;
                atyy atyy0 = (atyy)map0.get(atyz0.b);
                atxs atxs0 = this.a.i.b;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glas.a).v_newBuilder();
                if(TextUtils.isEmpty(atyz0.c)) {
                    iterator1 = iterator0;
                }
                else {
                    atyc atyc0 = this.a.f;
                    String s = atyz0.a;
                    String s1 = atyz0.c;
                    if(atxs0 == null) {
                        iterator1 = iterator0;
                        v2 = 0L;
                    }
                    else {
                        iterator1 = iterator0;
                        v2 = atxs0.a;
                    }
                    String s2 = atyc0.k(s, s1, true, v2);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    glas glas0 = (glas)hftp0.b_message;
                    s2.getClass();
                    glas0.b |= 1;
                    glas0.c = s2;
                }
                InetSocketAddress inetSocketAddress0 = atyz0.a();
                if(inetSocketAddress0 == null) {
                    glcr0 = (glcr)((ProtoLiteMessage)glcs.a).v_newBuilder();
                }
                else {
                    glcr0 = atzc.r(this.o(inetSocketAddress0));
                    if(atyz0.h) {
                        if(!glcr0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)glcr0).ensureMutable();
                        }
                        ((glcs)glcr0.b_message).c = 4;
                        ((glcs)glcr0.b_message).b |= 1;
                        if(!glcr0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)glcr0).ensureMutable();
                        }
                        glcs glcs0 = (glcs)glcr0.b_message;
                        glcs0.b &= -3;
                        glcs0.d = 0;
                    }
                    if(atyz0.e != null && atyz0.e.equals(atyz0.d)) {
                        glcr0.a(2);
                    }
                    if(this.n.contains(atyz0.e)) {
                        glcr0.a(4);
                    }
                }
                boolean z1 = atyz0.f;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glas glas1 = (glas)hftp0.b_message;
                glas1.b |= 2;
                glas1.d = z1;
                if(this.f.k()) {
                    boolean z2 = atyz0.g;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((glas)hftv0).b |= 4;
                    ((glas)hftv0).e = z2;
                    long v3 = atyz0.i;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    glas glas2 = (glas)hftp0.b_message;
                    glas2.b |= 0x20;
                    glas2.g = v3;
                }
                long v4 = atyz0.j;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((glas)hftv1).b |= 0x40;
                ((glas)hftv1).h = v4;
                if(atyy0 != null) {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    glas.b(((glas)hftp0.b_message));
                    int v5 = atyy0.b;
                    if(v5 != 0) {
                        if(!glcr0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)glcr0).ensureMutable();
                        }
                        ((glcs)glcr0.b_message).f = v5 - 1;
                        ((glcs)glcr0.b_message).b |= 4;
                    }
                }
                glcs glcs1 = (glcs)((ProtoLiteBuilder)glcr0).N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glas glas3 = (glas)hftp0.b_message;
                glcs1.getClass();
                glas3.f = glcs1;
                glas3.b |= 8;
                glas glas4 = (glas)hftp0.N_build();
                if(glas4 != null) {
                    glba0.a(glas4);
                }
                hashSet0.remove(atyy0);
            }
            for(Object object1: hashSet0) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glas.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glas.b(((glas)hftp1.b_message));
                glcr glcr1 = atzc.r(this.o(((atyy)object1).a));
                int v6 = ((atyy)object1).b;
                if(v6 != 0) {
                    if(!glcr1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glcr1).ensureMutable();
                    }
                    ((glcs)glcr1.b_message).f = v6 - 1;
                    ((glcs)glcr1.b_message).b |= 4;
                }
                glcs glcs2 = (glcs)((ProtoLiteBuilder)glcr1).N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glas glas5 = (glas)hftp1.b_message;
                glcs2.getClass();
                glas5.f = glcs2;
                glas5.b |= 8;
                glas glas6 = (glas)hftp1.N_build();
                if(glas6 != null) {
                    glba0.a(glas6);
                }
            }
            long v7 = -1L;
            long v8 = this.l == -1L ? -1L : this.l - this.j;
            if(!glba0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glba0).ensureMutable();
            }
            glbb glbb3 = (glbb)glba0.b_message;
            glbb3.b |= 16;
            glbb3.h = v8;
            if(this.f.k()) {
                long v9 = this.k;
                if(v9 != -1L) {
                    v7 = v9 - this.j;
                }
                if(!glba0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glba0).ensureMutable();
                }
                glbb glbb4 = (glbb)glba0.b_message;
                glbb4.b |= 8;
                glbb4.g = v7;
            }
            boolean z3 = this.i;
            if(!glba0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glba0).ensureMutable();
            }
            glbb glbb5 = (glbb)glba0.b_message;
            glbb5.b |= 0x20;
            glbb5.i = z3;
            this.p();
            this.g = false;
            glbb6 = (glbb)((ProtoLiteBuilder)glba0).N_build();
        }
        return glbb6;
    }

    public final void b(CastDevice castDevice0, long v) {
        synchronized(this) {
            if(this.g) {
                atyz atyz0 = this.n(castDevice0);
                this.q(castDevice0);
                atyz0.g = true;
                atyz0.e = new InetSocketAddress(castDevice0.c, castDevice0.g);
                atyz0.i = v;
                if(this.k == -1L) {
                    this.k = v;
                }
            }
        }
    }

    public final void c(CastDevice castDevice0) {
        synchronized(this) {
            if(this.g) {
                atyz atyz0 = this.n(castDevice0);
                this.q(castDevice0);
                atyz0.h = true;
                atyz0.e = new InetSocketAddress(castDevice0.c, castDevice0.g);
                long v1 = System.currentTimeMillis();
                InetSocketAddress inetSocketAddress0 = atyz0.a();
                batl.s(inetSocketAddress0);
                atzb atzb0 = this.o(inetSocketAddress0);
                atzb0.a(new atza(5, atzb0.b, v1));
                atzb0.b = -1L;
                if(atzb0.g == -1L) {
                    atzb0.g = v1;
                }
            }
        }
    }

    public final void d(CastDevice castDevice0) {
        synchronized(this) {
            if(this.g) {
                atyz atyz0 = this.n(castDevice0);
                this.q(castDevice0);
                atyz0.f = true;
                atyz0.e = new InetSocketAddress(castDevice0.c, castDevice0.g);
                long v1 = System.currentTimeMillis();
                atyz0.j = v1;
                if(this.l == -1L) {
                    this.l = v1;
                }
            }
        }
    }

    public final void e(aukm aukm0, InetSocketAddress inetSocketAddress0) {
        synchronized(this) {
            if(!this.g) {
                return;
            }
            atyy atyy0 = this.m(aukm0);
            atyy0.a = inetSocketAddress0;
            atyy0.b = 2;
            this.n.add(inetSocketAddress0);
        }
    }

    public final void f() {
        synchronized(this) {
            this.h = true;
        }
    }

    public final void g(long v, boolean z) {
        synchronized(this) {
            this.p();
            auiz auiz0 = this.d;
            kau kau0 = auiz0.b(null);
            if(kau0 != null) {
                auju auju0 = (auju)kau0.b;
                if(auju0 != null) {
                    HashSet hashSet0 = new HashSet();
                    for(Object object0: this.e.f().values()) {
                        hashSet0.add(((aujj)object0).d().f());
                    }
                    for(Object object1: auju0.a(auiz0)) {
                        CastDevice castDevice0 = ((aujd)object1).c;
                        if(castDevice0 != null) {
                            atyz atyz0 = this.n(castDevice0);
                            atyz0.d = new InetSocketAddress(castDevice0.c, castDevice0.g);
                            atzb atzb0 = this.o(new InetSocketAddress(castDevice0.c, castDevice0.g));
                            int v2 = atzb0.d;
                            atzb0.d = hashSet0.contains(atyz0.a) | v2;
                        }
                    }
                }
            }
            this.i = z;
            this.j = v;
            this.g = true;
        }
    }

    public final void h(auah auah0, gket gket0) {
        synchronized(this) {
            if(!this.g) {
                return;
            }
            atzb atzb0 = this.o(auah0.b());
            atzb0.e = true;
            atzb0.f = gket0;
            atzb0.a(new atza(6, atzb0.b, System.currentTimeMillis()));
            atzb0.b = -1L;
        }
    }

    public final void i(auah auah0) {
        synchronized(this) {
            if(!this.g) {
                return;
            }
            atzb atzb0 = this.o(auah0.b());
            long v1 = System.currentTimeMillis();
            if(atzb0.a == -1L) {
                atzb0.a = v1;
            }
            atzb0.b = v1;
        }
    }

    public final void j(auah auah0) {
        synchronized(this) {
            if(!this.g) {
                return;
            }
            this.o(auah0.b()).d = true;
        }
    }

    public final void k(auah auah0) {
        synchronized(this) {
            if(!this.g) {
                return;
            }
            this.o(auah0.b()).c = true;
        }
    }

    public final void l(aukm aukm0, int v) {
        synchronized(this) {
            if(!this.g) {
                return;
            }
            this.m(aukm0).b = v;
        }
    }

    private final atyy m(aukm aukm0) {
        Map map0 = this.c;
        String s = aukm0.b;
        if(map0.containsKey(s)) {
            return (atyy)map0.get(s);
        }
        atyy atyy0 = new atyy();
        atyy0.b = 1;
        map0.put(s, atyy0);
        return atyy0;
    }

    private final atyz n(CastDevice castDevice0) {
        Map map0 = this.b;
        String s = castDevice0.f();
        if(map0.containsKey(s)) {
            return (atyz)map0.get(s);
        }
        atyz atyz0 = new atyz(this);
        atyz0.a = s;
        atyz0.b = castDevice0.n;
        atyz0.c = castDevice0.j;
        map0.put(castDevice0.f(), atyz0);
        return atyz0;
    }

    private final atzb o(InetSocketAddress inetSocketAddress0) {
        Map map0 = this.m;
        if(map0.containsKey(inetSocketAddress0)) {
            return (atzb)map0.get(inetSocketAddress0);
        }
        atzb atzb0 = new atzb();
        map0.put(inetSocketAddress0, atzb0);
        return atzb0;
    }

    private final void p() {
        this.b.clear();
        this.c.clear();
        this.m.clear();
        this.n.clear();
        this.h = false;
        this.j = -1L;
        this.k = -1L;
        this.l = -1L;
    }

    private final void q(CastDevice castDevice0) {
        atyz atyz0 = (atyz)this.b.get(castDevice0.f());
        if(atyz0 != null) {
            String s = castDevice0.j;
            String s1 = castDevice0.n;
            if(!TextUtils.isEmpty(s)) {
                atyz0.c = s;
            }
            if(!TextUtils.isEmpty(s1)) {
                atyz0.b = s1;
            }
        }
    }

    private static final glcr r(atzb atzb0) {
        glcr glcr0 = (glcr)((ProtoLiteMessage)glcs.a).v_newBuilder();
        if(atzb0.e) {
            if(!glcr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glcr0).ensureMutable();
            }
            ((glcs)glcr0.b_message).c = 5;
            ((glcs)glcr0.b_message).b |= 1;
            gket gket0 = atzb0.f == null ? gket.a : atzb0.f;
            if(!glcr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glcr0).ensureMutable();
            }
            ((glcs)glcr0.b_message).d = gket0.Y;
            ((glcs)glcr0.b_message).b |= 2;
        }
        else {
            if(atzb0.d) {
                if(!glcr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glcr0).ensureMutable();
                }
                ((glcs)glcr0.b_message).c = 2;
            }
            else if(atzb0.c) {
                if(!glcr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glcr0).ensureMutable();
                }
                ((glcs)glcr0.b_message).c = 1;
            }
            else {
                if(!glcr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glcr0).ensureMutable();
                }
                ((glcs)glcr0.b_message).c = 0;
            }
            ((glcs)glcr0.b_message).b |= 1;
        }
        for(Object object0: atzb0.h) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glcq.a).v_newBuilder();
            long v = ((atza)object0).a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((glcq)hftv0).b |= 2;
            ((glcq)hftv0).d = v;
            long v1 = ((atza)object0).b;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((glcq)hftv1).b |= 4;
            ((glcq)hftv1).e = v1;
            int v2 = ((atza)object0).c;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glcq)hftp0.b_message).c = v2 - 1;
            ((glcq)hftp0.b_message).b |= 1;
            glcq glcq0 = (glcq)hftp0.N_build();
            if(!glcr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glcr0).ensureMutable();
            }
            glcs glcs0 = (glcs)glcr0.b_message;
            glcq0.getClass();
            hfuo hfuo0 = glcs0.g;
            if(!hfuo0.c()) {
                glcs0.g = ProtoLiteMessage.E(hfuo0);
            }
            glcs0.g.add(glcq0);
        }
        long v3 = atzb0.a;
        long v4 = -1L;
        if(v3 != -1L) {
            long v5 = atzb0.g;
            if(v5 != -1L) {
                v4 = v5 - v3;
            }
        }
        if(!glcr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glcr0).ensureMutable();
        }
        glcs glcs1 = (glcs)glcr0.b_message;
        glcs1.b |= 8;
        glcs1.h = v4;
        return glcr0;
    }
}

