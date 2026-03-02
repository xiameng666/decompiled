import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class dghl {
    public final Context a;
    public final cuvm b;
    public final String c;
    public iced d;
    public cuvf e;
    public ichm f;

    public dghl(Context context0, cuvm cuvm0, String s) {
        ibuq.f(context0, "context");
        ibuq.f(s, "endpointId");
        super();
        this.a = context0;
        this.b = cuvm0;
        this.c = s;
    }

    public final icig a(cuvf cuvf0) {
        return icii.b(new icib(new dghk(this, cuvf0, null)), ((int)hvqs.ay()), 0, 2);
    }

    public final void b(cuuz cuuz0) {
        synchronized(this) {
            ichm ichm0 = this.f;
            if(ichm0 != null) {
                dghg.a(ichm0, new dggp(cuuz0.a, cuuz0.b, cuuz0.d, cuuz0.c, cuuz0.e, cuuz0.f, cuuz0.g, cuuz0.h));
            }
        }
    }

    public final void c(cuvl cuvl0) {
        dggq dggq0;
        synchronized(this) {
            iced iced0 = this.d;
            if(iced0 != null) {
                iceb.a(iced0);
            }
            cuvf cuvf0 = this.e;
            if(cuvf0 != null) {
                ichm ichm0 = this.f;
                if(ichm0 != null) {
                    Status status0 = cuvl0.a;
                    if(status0.e()) {
                        ibuq.e(cuvf0.f, "getEndpointInfo(...)");
                        List list0 = ibpg.J(cuvf0.f);
                        ibuq.e(cuvf0.c, "getRawAuthenticationToken(...)");
                        List list1 = ibpg.J(cuvf0.c);
                        String s = cuvf0.a();
                        ibuq.e(s, "getAuthenticationDigits(...)");
                        dggq0 = new dggq(list0, list1, s, cuvf0.e);
                    }
                    else {
                        dggq0 = new dggr(status0.i);
                    }
                    dghg.a(ichm0, dggq0);
                }
            }
        }
    }

    public final void d() {
        synchronized(this) {
            iced iced0 = this.d;
            if(iced0 != null) {
                iceb.a(iced0);
            }
            ichm ichm0 = this.f;
            if(ichm0 != null) {
                dghg.a(ichm0, dggs.a);
            }
        }
    }
}

