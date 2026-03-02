import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

public final class atym {
    private final boolean a;
    private final atyc b;
    private final atzc c;
    private final atyk d;

    public atym(atyc atyc0, atzc atzc0, atyk atyk0) {
        this.a = avij.e().u();
        this.b = atyc0;
        this.c = atzc0;
        this.d = atyk0;
    }

    public final void a(CastDevice castDevice0) {
        synchronized(this) {
            atxs atxs0 = this.d.b;
            if(this.a && castDevice0 != null && atyc.p(atxs0)) {
                this.c.d(castDevice0);
                if(atxs0 != null) {
                    glai glai0 = (glai)((ProtoLiteBuilder)this.b.f(atxs0, castDevice0)).N_build();
                    this.b.n(glai0, gkey.ao);
                }
            }
        }
    }

    public final void b(int v, int v1) {
        synchronized(this) {
            atxs atxs0 = this.d.b;
            if(v > 0 && v1 > 0 && atyc.p(atxs0) && v1 != 2) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glbl.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                int v3 = 1;
                ((glbl)hftv0).b |= 1;
                ((glbl)hftv0).c = v;
                switch(v1) {
                    case 1: {
                        v3 = 2;
                        break;
                    }
                    case 2: {
                        v3 = 3;
                        break;
                    }
                    case 3: {
                        v3 = 4;
                        break;
                    }
                    case 4: {
                        v3 = 5;
                        break;
                    }
                    case 5: {
                        v3 = 6;
                        break;
                    }
                    case 6: {
                        v3 = 7;
                        break;
                    }
                    case 7: {
                        v3 = 8;
                        break;
                    }
                    case 8: {
                        v3 = 9;
                        break;
                    }
                    case 9: {
                        v3 = 10;
                        break;
                    }
                    case 10: {
                        v3 = 11;
                        break;
                    }
                    case 11: {
                        v3 = 12;
                        break;
                    }
                    case 12: {
                        v3 = 13;
                    }
                }
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((glbl)hftp0.b_message).d = v3 - 1;
                ((glbl)hftp0.b_message).b |= 2;
                glbl glbl0 = (glbl)hftp0.N_build();
                if(atxs0 != null) {
                    atyc atyc0 = this.b;
                    glah glah0 = atyc0.e(atxs0);
                    if(!glah0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glah0).ensureMutable();
                    }
                    glai glai0 = (glai)glah0.b_message;
                    glbl0.getClass();
                    glai0.g = glbl0;
                    glai0.b |= 16;
                    atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.aq);
                }
            }
        }
    }

    public final void c() {
        synchronized(this) {
            atxs atxs0 = this.d.b;
            if(this.a && atyc.p(atxs0) && atxs0 != null) {
                glai glai0 = (glai)((ProtoLiteBuilder)this.b.e(atxs0)).N_build();
                this.b.n(glai0, gkey.av);
            }
        }
    }

    public final void d(CastDevice castDevice0, String s) {
        synchronized(this) {
            atxs atxs0 = this.d.b;
            if(castDevice0 != null && !TextUtils.isEmpty(s) && atyc.p(atxs0)) {
                this.c.d(castDevice0);
                if(atxs0 != null) {
                    atyc atyc0 = this.b;
                    glah glah0 = atyc0.f(atxs0, castDevice0);
                    glap glap0 = atyc.g(s, "");
                    if(!glah0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glah0).ensureMutable();
                    }
                    glai glai0 = (glai)glah0.b_message;
                    glap0.getClass();
                    glai0.E = glap0;
                    glai0.b |= 0x2000000;
                    atyc0.n(((glai)((ProtoLiteBuilder)glah0).N_build()), gkey.ap);
                }
            }
        }
    }
}

