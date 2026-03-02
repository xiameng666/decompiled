import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fmai {
    private int a;
    private gfsx b;
    private gfsx c;
    private gfsx d;
    private gfsx e;
    private gfsx f;
    private gfsx g;
    private gfsx h;
    private gfsx i;
    private gfsx j;
    private gfsx k;
    private gged_interceptors l;
    private gfsx m;
    private gfsx n;
    private gfsx o;
    private gfsx p;
    private gfsx q;
    private byte r;

    public fmai() {
        throw null;
    }

    public fmai(byte[] arr_b) {
        this.b = gfqx.a;
        this.c = gfqx.a;
        this.d = gfqx.a;
        this.e = gfqx.a;
        this.f = gfqx.a;
        this.g = gfqx.a;
        this.h = gfqx.a;
        this.i = gfqx.a;
        this.j = gfqx.a;
        this.k = gfqx.a;
        this.m = gfqx.a;
        this.n = gfqx.a;
        this.o = gfqx.a;
        this.p = gfqx.a;
        this.q = gfqx.a;
    }

    public final fmaj a() {
        if(this.r == 1) {
            gged_interceptors gged0 = this.l;
            if(gged0 != null) {
                return new fmaj(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, gged0, this.m, this.n, this.o, this.p, this.q);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.r == 0) {
            stringBuilder0.append(" eventType");
        }
        if(this.l == null) {
            stringBuilder0.append(" experimentIds");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(fman fman0) {
        this.q = gfsx.m(fman0);
    }

    public final void c(ContactId contactId0) {
        this.e = gfsx.m(contactId0);
    }

    public final void d(ConversationId conversationId0) {
        this.f = gfsx.m(conversationId0);
    }

    public final void e(long v) {
        this.o = gfsx.m(Long.valueOf(v));
    }

    public final void f(int v) {
        this.h = gfsx.m(Integer.valueOf(v));
    }

    public final void g(int v) {
        this.a = v;
        this.r = 1;
    }

    public final void h(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null experimentIds");
        }
        this.l = gged0;
    }

    public final void i(fmap fmap0) {
        this.p = gfsx.m(fmap0);
    }

    public final void j(int v) {
        this.g = gfsx.m(Integer.valueOf(v));
    }

    public final void k(int v) {
        this.n = gfsx.m(Integer.valueOf(v));
    }

    public final void l(int v) {
        this.j = gfsx.m(Integer.valueOf(v));
    }

    public final void m(Integer integer0) {
        this.i = gfsx.m(integer0);
    }

    public final void n(ContactId contactId0) {
        this.b = gfsx.m(contactId0);
    }

    public final void o(String s) {
        this.c = gfsx.m(s);
    }

    public final void p(String s) {
        this.d = gfsx.m(s);
    }

    public final void q(int v) {
        this.k = gfsx.m(Integer.valueOf(v));
    }
}

