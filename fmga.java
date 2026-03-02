import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fmga {
    public final String a;
    public final ContactId b;
    public final ConversationId c;
    public final long d;
    public final gfsx e;
    public final fmfr f;
    public final fmft g;
    public final gfsx h;
    public final ggeo i;
    public final int j;
    public final fmfx k;
    public final int l;
    public final int m;
    public final ByteString n;
    public final gfsx o;
    public final gged_interceptors p;
    public final ggeo q;
    public final int r;

    public fmga() {
        throw null;
    }

    public fmga(String s, int v, ContactId contactId0, ConversationId conversationId0, long v1, gfsx gfsx0, fmfr fmfr0, fmft fmft0, gfsx gfsx1, ggeo ggeo0, int v2, fmfx fmfx0, int v3, int v4, ByteString hfsf0, gfsx gfsx2, gged_interceptors gged0, ggeo ggeo1) {
        this.a = s;
        this.r = v;
        this.b = contactId0;
        this.c = conversationId0;
        this.d = v1;
        this.e = gfsx0;
        this.f = fmfr0;
        this.g = fmft0;
        this.h = gfsx1;
        this.i = ggeo0;
        this.j = v2;
        this.k = fmfx0;
        this.l = v3;
        this.m = v4;
        this.n = hfsf0;
        this.o = gfsx2;
        this.p = gged0;
        this.q = ggeo1;
    }

    public static fmfm a() {
        fmfm fmfm0 = new fmfm(null);
        fmfm0.l(ggnf.a);
        fmfm0.p();
        fmfm0.h(fmfz.a.g);
        fmfm0.g(0);
        fmfm0.d(ByteString.b);
        fmfm0.b(ggna.a);
        fmfm0.e = ggnf.a;
        return fmfm0;
    }

    public final gfsx b() {
        gfsx gfsx0 = this.h;
        if(gfta.c(((String)gfsx0.g()))) {
            return this.f.a() - 1 == 1 ? gfsx.m(this.f.d()) : this.e;
        }
        return gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fmga) && this.a.equals(((fmga)object0).a)) {
            int v = this.r;
            int v1 = ((fmga)object0).r;
            if(v != 0) {
                return v == v1 && this.b.equals(((fmga)object0).b) && this.c.equals(((fmga)object0).c) && this.d == ((fmga)object0).d && this.e.equals(((fmga)object0).e) && this.f.equals(((fmga)object0).f) && this.g.equals(((fmga)object0).g) && this.h.equals(((fmga)object0).h) && this.i.equals(((fmga)object0).i) && this.j == ((fmga)object0).j && this.k.equals(((fmga)object0).k) && this.l == ((fmga)object0).l && this.m == ((fmga)object0).m && this.n.equals(((fmga)object0).n) && this.o.equals(((fmga)object0).o) && ggia.i(this.p, ((fmga)object0).p) && ggkm.o(this.q, ((fmga)object0).q);
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        int v1 = this.r;
        if(v1 != 0) {
            return this.q.hashCode() ^ ((((((((((((((((v * 1000003 ^ v1) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode()) * 1000003 ^ this.j) * 1000003 ^ this.k.hashCode()) * 1000003 ^ this.l) * 1000003 ^ this.m) * 1000003 ^ this.n.hashCode()) * 1000003 ^ this.o.hashCode()) * 1000003 ^ this.p.hashCode()) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        switch(this.r) {
            case 1: {
                return "Message{messageId=" + this.a + ", messageType=" + "INCOMING" + ", sender=" + this.b + ", conversationId=" + this.c + ", serverTimestampUs=" + this.d + ", fallback=" + this.e + ", messageContent=" + this.f + ", messageStatus=" + this.g + ", snippet=" + this.h + ", metadata=" + this.i + ", capability=" + this.j + ", renderingDetails=" + this.k + ", intendedRenderingType=" + this.l + ", filterableFlags=" + this.m + ", conversationContext=" + this.n + ", featureType=" + this.o + ", activeDecorationIds=" + this.p + ", possibleDecorations=" + this.q + "}";
            }
            case 2: {
                return "Message{messageId=" + this.a + ", messageType=" + "OUTGOING" + ", sender=" + this.b + ", conversationId=" + this.c + ", serverTimestampUs=" + this.d + ", fallback=" + this.e + ", messageContent=" + this.f + ", messageStatus=" + this.g + ", snippet=" + this.h + ", metadata=" + this.i + ", capability=" + this.j + ", renderingDetails=" + this.k + ", intendedRenderingType=" + this.l + ", filterableFlags=" + this.m + ", conversationContext=" + this.n + ", featureType=" + this.o + ", activeDecorationIds=" + this.p + ", possibleDecorations=" + this.q + "}";
            }
            default: {
                return "Message{messageId=" + this.a + ", messageType=" + "null" + ", sender=" + this.b + ", conversationId=" + this.c + ", serverTimestampUs=" + this.d + ", fallback=" + this.e + ", messageContent=" + this.f + ", messageStatus=" + this.g + ", snippet=" + this.h + ", metadata=" + this.i + ", capability=" + this.j + ", renderingDetails=" + this.k + ", intendedRenderingType=" + this.l + ", filterableFlags=" + this.m + ", conversationContext=" + this.n + ", featureType=" + this.o + ", activeDecorationIds=" + this.p + ", possibleDecorations=" + this.q + "}";
            }
        }
    }
}

