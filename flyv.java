import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class flyv implements flzo {
    private final AccountContext a;
    private final Context b;
    private final Map c;

    public flyv(AccountContext accountContext0, Context context0, Map map0) {
        this.a = accountContext0;
        this.b = context0;
        this.c = map0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnwc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnwc hnwc0 = (hnwc)hftp0.b_message;
        hnxl0.getClass();
        hnwc0.c = hnxl0;
        hnwc0.b |= 1;
        return gmbu.i(((hnwc)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flyu(((hnwc)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        flko flko0 = new flko();
        flko0.b(true);
        flko0.a(Collections.EMPTY_LIST);
        hfuo hfuo0 = ((hnwd)object0).b;
        Context context0 = this.b;
        flsl flsl0 = flsl.a(context0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: hfuo0) {
            gfsx gfsx0 = flxc.d(((hnwb)object1), this.a, context0, this.c, flsl0);
            if(gfsx0.i()) {
                arrayList0.add(gfsx0.d());
            }
        }
        flko0.a = arrayList0;
        hfuo hfuo1 = ((hnwd)object0).b;
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: hfuo1) {
            gfsx gfsx1 = flxc.b(((hnwb)object2));
            Objects.requireNonNull(arrayList1);
            gfsx1.b(new flxb(arrayList1));
        }
        flko0.a(arrayList1);
        flko0.b(((hnwd)object0).c);
        if(flko0.d == 1) {
            List list0 = flko0.a;
            if(list0 != null) {
                List list1 = flko0.b;
                if(list1 != null) {
                    return new flkp(list0, list1, flko0.c);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(flko0.a == null) {
            stringBuilder0.append(" tachyonMessages");
        }
        if(flko0.b == null) {
            stringBuilder0.append(" ackIds");
        }
        if(flko0.d == 0) {
            stringBuilder0.append(" pulledAll");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(10);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        flkp flkp0 = (flkp)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(10);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

