import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;

public final class fmeu {
    public gfsx a;
    private ConversationId b;
    private gfsx c;
    private gfsx d;
    private gfsx e;
    private boolean f;
    private long g;
    private long h;
    private boolean i;
    private Map j;
    private gged_interceptors k;
    private long l;
    private long m;
    private ByteString n;
    private long o;
    private long p;
    private byte q;

    public fmeu() {
        throw null;
    }

    public fmeu(fmev fmev0) {
        this.c = gfqx.a;
        this.d = gfqx.a;
        this.e = gfqx.a;
        this.a = gfqx.a;
        this.b = fmev0.a;
        this.c = fmev0.b;
        this.d = fmev0.c;
        this.e = fmev0.d;
        this.f = fmev0.e;
        this.g = fmev0.f;
        this.h = fmev0.g;
        this.i = fmev0.h;
        this.j = fmev0.i;
        this.a = fmev0.j;
        this.k = fmev0.k;
        this.l = fmev0.l;
        this.m = fmev0.m;
        this.n = fmev0.n;
        this.o = fmev0.o;
        this.p = fmev0.p;
        this.q = -1;
    }

    public fmeu(byte[] arr_b) {
        this.c = gfqx.a;
        this.d = gfqx.a;
        this.e = gfqx.a;
        this.a = gfqx.a;
    }

    public final fmev a() {
        if(this.q == -1) {
            ConversationId conversationId0 = this.b;
            if(conversationId0 != null) {
                Map map0 = this.j;
                if(map0 != null) {
                    gged_interceptors gged0 = this.k;
                    if(gged0 != null) {
                        ByteString hfsf0 = this.n;
                        if(hfsf0 != null) {
                            return new fmev(conversationId0, this.c, this.d, this.e, this.f, this.g, this.h, this.i, map0, this.a, gged0, this.l, this.m, hfsf0, this.o, this.p);
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == null) {
            stringBuilder0.append(" conversationId");
        }
        if((this.q & 1) == 0) {
            stringBuilder0.append(" isImageStale");
        }
        if((this.q & 2) == 0) {
            stringBuilder0.append(" expirationTimeMillis");
        }
        if((this.q & 4) == 0) {
            stringBuilder0.append(" lastDeletedTimeMillis");
        }
        if((this.q & 8) == 0) {
            stringBuilder0.append(" blockable");
        }
        if(this.j == null) {
            stringBuilder0.append(" appData");
        }
        if(this.k == null) {
            stringBuilder0.append(" capabilities");
        }
        if((this.q & 16) == 0) {
            stringBuilder0.append(" propertiesExpirationTimeMillis");
        }
        if((this.q & 0x20) == 0) {
            stringBuilder0.append(" serverTimestampUs");
        }
        if(this.n == null) {
            stringBuilder0.append(" conversationContext");
        }
        if((this.q & 0x40) == 0) {
            stringBuilder0.append(" createdTimestampMs");
        }
        if((this.q & 0x80) == 0) {
            stringBuilder0.append(" localUpdateTimestampMs");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(Map map0) {
        if(map0 == null) {
            throw new NullPointerException("Null appData");
        }
        this.j = map0;
    }

    public final void c(boolean z) {
        this.i = z;
        this.q = (byte)(this.q | 8);
    }

    public final void d(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null capabilities");
        }
        this.k = gged0;
    }

    public final void e(ByteString hfsf0) {
        if(hfsf0 == null) {
            throw new NullPointerException("Null conversationContext");
        }
        this.n = hfsf0;
    }

    public final void f(fmew fmew0) {
        this.g(fmew0.a());
    }

    public final void g(ConversationId conversationId0) {
        if(conversationId0 == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.b = conversationId0;
    }

    public final void h(long v) {
        this.o = v;
        this.q = (byte)(this.q | 0x40);
    }

    public final void i(long v) {
        this.g = v;
        this.q = (byte)(this.q | 2);
    }

    public final void j(Bitmap bitmap0) {
        this.e = gfsx.m(bitmap0);
    }

    public final void k(String s) {
        this.d = gfsx.m(s);
    }

    public final void l(boolean z) {
        this.f = z;
        this.q = (byte)(this.q | 1);
    }

    public final void m(long v) {
        this.h = v;
        this.q = (byte)(this.q | 4);
    }

    public final void n(long v) {
        this.p = v;
        this.q = (byte)(this.q | 0xFFFFFF80);
    }

    public final void o(long v) {
        this.l = v;
        this.q = (byte)(this.q | 16);
    }

    public final void p(long v) {
        this.m = v;
        this.q = (byte)(this.q | 0x20);
    }

    public final void q(String s) {
        this.c = gfsx.m(s);
    }
}

