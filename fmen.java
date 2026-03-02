import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ContactId;

public final class fmen {
    private ContactId a;
    private gfsx b;
    private gfsx c;
    private gfsx d;
    private gfsx e;
    private boolean f;
    private long g;
    private gged_interceptors h;
    private gged_interceptors i;
    private gfsx j;
    private gfsx k;
    private long l;
    private byte m;

    public fmen() {
        throw null;
    }

    public fmen(fmeo fmeo0) {
        this.b = gfqx.a;
        this.c = gfqx.a;
        this.d = gfqx.a;
        this.e = gfqx.a;
        this.j = gfqx.a;
        this.k = gfqx.a;
        this.a = fmeo0.a;
        this.b = fmeo0.b;
        this.c = fmeo0.c;
        this.d = fmeo0.d;
        this.e = fmeo0.e;
        this.f = fmeo0.f;
        this.g = fmeo0.g;
        this.h = fmeo0.h;
        this.i = fmeo0.i;
        this.j = fmeo0.j;
        this.k = fmeo0.k;
        this.l = fmeo0.l;
        this.m = 7;
    }

    public fmen(byte[] arr_b) {
        this.b = gfqx.a;
        this.c = gfqx.a;
        this.d = gfqx.a;
        this.e = gfqx.a;
        this.j = gfqx.a;
        this.k = gfqx.a;
    }

    public final fmeo a() {
        if(this.m == 7) {
            ContactId contactId0 = this.a;
            if(contactId0 != null) {
                gged_interceptors gged0 = this.h;
                if(gged0 != null) {
                    gged_interceptors gged1 = this.i;
                    if(gged1 != null) {
                        return new fmeo(contactId0, this.b, this.c, this.d, this.e, this.f, this.g, gged0, gged1, this.j, this.k, this.l);
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" contactId");
        }
        if((this.m & 1) == 0) {
            stringBuilder0.append(" isImageStale");
        }
        if((this.m & 2) == 0) {
            stringBuilder0.append(" expirationTimeMillis");
        }
        if(this.h == null) {
            stringBuilder0.append(" menuItems");
        }
        if(this.i == null) {
            stringBuilder0.append(" toolbarButtons");
        }
        if((this.m & 4) == 0) {
            stringBuilder0.append(" serverTimestampUs");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        this.c = gfsx.m(s);
    }

    public final void c(ContactId contactId0) {
        if(contactId0 == null) {
            throw new NullPointerException("Null contactId");
        }
        this.a = contactId0;
    }

    public final void d(long v) {
        this.g = v;
        this.m = (byte)(this.m | 2);
    }

    public final void e(Bitmap bitmap0) {
        this.e = gfsx.m(bitmap0);
    }

    public final void f(String s) {
        this.d = gfsx.m(s);
    }

    public final void g(boolean z) {
        this.f = z;
        this.m = (byte)(this.m | 1);
    }

    public final void h(fmfl fmfl0) {
        this.k = gfsx.m(fmfl0);
    }

    public final void i(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null menuItems");
        }
        this.h = gged0;
    }

    public final void j(String s) {
        this.b = gfsx.m(s);
    }

    public final void k(long v) {
        this.l = v;
        this.m = (byte)(this.m | 4);
    }

    public final void l(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null toolbarButtons");
        }
        this.i = gged0;
    }

    public final void m(fmhn fmhn0) {
        this.j = gfsx.m(fmhn0);
    }
}

