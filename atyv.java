import com.google.android.gms.cast.CastDevice;
import java.util.Set;

public final class atyv {
    public final atzc a;
    private final boolean b;
    private final atyc c;
    private final atyk d;

    public atyv(atyc atyc0, atzc atzc0, atyk atyk0) {
        this.b = avij.e().u();
        this.c = atyc0;
        this.a = atzc0;
        this.d = atyk0;
    }

    public final void a(CastDevice castDevice0, Set set0, gket gket0, boolean z) {
        synchronized(this) {
            atxs atxs0 = this.d.b;
            if(this.b && atyc.p(atxs0) && atxs0 != null) {
                glco glco0 = (glco)((ProtoLiteMessage)glcp.a).v_newBuilder();
                if(!glco0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glco0).ensureMutable();
                }
                ((glcp)glco0.b_message).c = 2;
                ((glcp)glco0.b_message).b |= 2;
                if(!glco0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glco0).ensureMutable();
                }
                ((glcp)glco0.b_message).f = gket0.Y;
                ((glcp)glco0.b_message).b |= 4;
                glco0.a(atyc.l(set0, gkfz.a));
                boolean z1 = atxs0.g();
                if(!glco0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glco0).ensureMutable();
                }
                glcp glcp0 = (glcp)glco0.b_message;
                glcp0.b |= 8;
                glcp0.h = z1;
                if(!glco0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glco0).ensureMutable();
                }
                glcp glcp1 = (glcp)glco0.b_message;
                glcp1.b |= 16;
                glcp1.i = z;
                glcp glcp2 = (glcp)((ProtoLiteBuilder)glco0).N_build();
                atyc atyc0 = this.c;
                glah glah0 = atyc0.f(atxs0, castDevice0);
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                glai glai0 = (glai)glah0.b_message;
                glcp2.getClass();
                glai0.I = glcp2;
                glai0.c |= 1;
                atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.at);
            }
        }
    }

    public final void b(CastDevice castDevice0, Set set0, Set set1, Set set2, boolean z) {
        synchronized(this) {
            atxs atxs0 = this.d.b;
            if(this.b && atyc.p(atxs0)) {
                this.a.c(castDevice0);
                glco glco0 = (glco)((ProtoLiteMessage)glcp.a).v_newBuilder();
                if(!glco0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glco0).ensureMutable();
                }
                ((glcp)glco0.b_message).c = 1;
                ((glcp)glco0.b_message).b |= 2;
                for(Object object0: set1) {
                    glap glap0 = atyc.g(((String)object0), "");
                    if(!glco0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glco0).ensureMutable();
                    }
                    glcp glcp0 = (glcp)glco0.b_message;
                    glap0.getClass();
                    hfuo hfuo0 = glcp0.d;
                    if(!hfuo0.c()) {
                        glcp0.d = ProtoLiteMessage.E(hfuo0);
                    }
                    glcp0.d.add(glap0);
                }
                for(Object object1: set2) {
                    glap glap1 = atyc.g(((String)object1), "");
                    if(!glco0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glco0).ensureMutable();
                    }
                    glcp glcp1 = (glcp)glco0.b_message;
                    glap1.getClass();
                    hfuo hfuo1 = glcp1.e;
                    if(!hfuo1.c()) {
                        glcp1.e = ProtoLiteMessage.E(hfuo1);
                    }
                    glcp1.e.add(glap1);
                }
                glco0.a(atyc.l(set0, gkfz.a));
                if(atxs0 != null) {
                    boolean z1 = atxs0.g();
                    if(!glco0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glco0).ensureMutable();
                    }
                    glcp glcp2 = (glcp)glco0.b_message;
                    glcp2.b |= 8;
                    glcp2.h = z1;
                    if(!glco0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glco0).ensureMutable();
                    }
                    glcp glcp3 = (glcp)glco0.b_message;
                    glcp3.b |= 16;
                    glcp3.i = z;
                }
                glcp glcp4 = (glcp)((ProtoLiteBuilder)glco0).N_build();
                if(atxs0 != null) {
                    atyc atyc0 = this.c;
                    glah glah0 = atyc0.f(atxs0, castDevice0);
                    if(!glah0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glah0).ensureMutable();
                    }
                    glai glai0 = (glai)glah0.b_message;
                    glcp4.getClass();
                    glai0.I = glcp4;
                    glai0.c |= 1;
                    atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.at);
                }
            }
        }
    }

    public final void c(auah auah0) {
        synchronized(this) {
            this.a.i(auah0);
        }
    }

    public final void d(auah auah0, gket gket0) {
        synchronized(this) {
            this.a.h(auah0, gket0);
        }
    }
}

