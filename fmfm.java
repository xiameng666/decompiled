import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;

public final class fmfm {
    public ContactId a;
    public fmfr b;
    public fmfx c;
    public gfsx d;
    public ggeo e;
    public int f;
    private String g;
    private ConversationId h;
    private long i;
    private gfsx j;
    private fmft k;
    private gfsx l;
    private ggeo m;
    private int n;
    private int o;
    private int p;
    private ByteString q;
    private gged_interceptors r;
    private byte s;

    public fmfm() {
        throw null;
    }

    public fmfm(fmga fmga0) {
        this.j = gfqx.a;
        this.l = gfqx.a;
        this.d = gfqx.a;
        this.g = fmga0.a;
        this.f = fmga0.r;
        this.a = fmga0.b;
        this.h = fmga0.c;
        this.i = fmga0.d;
        this.j = fmga0.e;
        this.b = fmga0.f;
        this.k = fmga0.g;
        this.l = fmga0.h;
        this.m = fmga0.i;
        this.n = fmga0.j;
        this.c = fmga0.k;
        this.o = fmga0.l;
        this.p = fmga0.m;
        this.q = fmga0.n;
        this.d = fmga0.o;
        this.r = fmga0.p;
        this.e = fmga0.q;
        this.s = 15;
    }

    public fmfm(byte[] arr_b) {
        this.j = gfqx.a;
        this.l = gfqx.a;
        this.d = gfqx.a;
    }

    public final fmga a() {
        if(this.s == 15) {
            String s = this.g;
            if(s != null) {
                int v = this.f;
                if(v != 0) {
                    ContactId contactId0 = this.a;
                    if(contactId0 != null) {
                        ConversationId conversationId0 = this.h;
                        if(conversationId0 != null) {
                            fmfr fmfr0 = this.b;
                            if(fmfr0 != null) {
                                fmft fmft0 = this.k;
                                if(fmft0 != null) {
                                    ggeo ggeo0 = this.m;
                                    if(ggeo0 != null) {
                                        fmfx fmfx0 = this.c;
                                        if(fmfx0 != null) {
                                            ByteString hfsf0 = this.q;
                                            if(hfsf0 != null) {
                                                gged_interceptors gged0 = this.r;
                                                if(gged0 != null) {
                                                    ggeo ggeo1 = this.e;
                                                    if(ggeo1 != null) {
                                                        return new fmga(s, v, contactId0, conversationId0, this.i, this.j, fmfr0, fmft0, this.l, ggeo0, this.n, fmfx0, this.o, this.p, hfsf0, this.d, gged0, ggeo1);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.g == null) {
            stringBuilder0.append(" messageId");
        }
        if(this.f == 0) {
            stringBuilder0.append(" messageType");
        }
        if(this.a == null) {
            stringBuilder0.append(" sender");
        }
        if(this.h == null) {
            stringBuilder0.append(" conversationId");
        }
        if((this.s & 1) == 0) {
            stringBuilder0.append(" serverTimestampUs");
        }
        if(this.b == null) {
            stringBuilder0.append(" messageContent");
        }
        if(this.k == null) {
            stringBuilder0.append(" messageStatus");
        }
        if(this.m == null) {
            stringBuilder0.append(" metadata");
        }
        if((this.s & 2) == 0) {
            stringBuilder0.append(" capability");
        }
        if(this.c == null) {
            stringBuilder0.append(" renderingDetails");
        }
        if((this.s & 4) == 0) {
            stringBuilder0.append(" intendedRenderingType");
        }
        if((this.s & 8) == 0) {
            stringBuilder0.append(" filterableFlags");
        }
        if(this.q == null) {
            stringBuilder0.append(" conversationContext");
        }
        if(this.r == null) {
            stringBuilder0.append(" activeDecorationIds");
        }
        if(this.e == null) {
            stringBuilder0.append(" possibleDecorations");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null activeDecorationIds");
        }
        this.r = gged0;
    }

    public final void c(int v) {
        this.n = v;
        this.s = (byte)(this.s | 2);
    }

    public final void d(ByteString hfsf0) {
        if(hfsf0 == null) {
            throw new NullPointerException("Null conversationContext");
        }
        this.q = hfsf0;
    }

    public final void e(ConversationId conversationId0) {
        if(conversationId0 == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.h = conversationId0;
    }

    public final void f(String s) {
        this.j = gfsx.m(s);
    }

    public final void g(int v) {
        this.p = v;
        this.s = (byte)(this.s | 8);
    }

    public final void h(int v) {
        this.o = v;
        this.s = (byte)(this.s | 4);
    }

    public final void i(fmhm fmhm0) {
        this.b = fmcs.b(fmhm0);
    }

    public final void j(String s) {
        if(s == null) {
            throw new NullPointerException("Null messageId");
        }
        this.g = s;
    }

    public final void k(fmft fmft0) {
        if(fmft0 == null) {
            throw new NullPointerException("Null messageStatus");
        }
        this.k = fmft0;
    }

    public final void l(Map map0) {
        this.m = ggeo.k(map0);
    }

    public final void m(long v) {
        this.i = v;
        this.s = (byte)(this.s | 1);
    }

    public final void n(String s) {
        this.l = gfsx.m(s);
    }

    public final void o() {
        this.b = fmcm.a;
    }

    public final void p() {
        this.c = fmct.a;
    }

    public final void q(fmfp fmfp0) {
        this.b = fmcs.a(fmfp0);
    }

    public final void r(ByteString hfsf0) {
        this.b = fmcs.d(hfsf0);
    }

    public final void s(String s) {
        this.b = fmcs.c(s);
    }
}

