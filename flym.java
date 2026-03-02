import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public final class flym implements flzo {
    private final AccountContext a;
    private final int b;
    private final String c;
    private final Context d;
    private final Map e;
    private final flsl f;

    public flym(AccountContext accountContext0, int v, String s, Context context0, Map map0, flsl flsl0) {
        this.a = accountContext0;
        this.b = v;
        this.c = s;
        this.d = context0;
        this.e = map0;
        this.f = flsl0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnrd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hnxl0.getClass();
        ((hnrd)hftv0).c = hnxl0;
        ((hnrd)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hnrd)hftv1).d = 0L;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hnrd)hftv2).e = 0L;
        int v = this.b;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hnrd)hftv3).f = v;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((hnrd)hftv4).h = true;
        String s = this.c;
        if(s != null) {
            if(!hftv4.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hnrd)hftp0.b_message).g = s;
        }
        return gmbu.i(((hnrd)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flyl(((hnrd)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((hnre)object0).b) {
            Context context0 = this.d;
            AccountContext accountContext0 = this.a;
            Map map0 = this.e;
            flsl flsl0 = this.f;
            ggdy ggdy0 = new ggdy();
            for(Object object2: ((hnqo)object1).c) {
                gfsx gfsx0 = flwv.a(((hnqn)object2));
                if(gfsx0.i()) {
                    ggdy0.i(gfsx0.d());
                }
            }
            ggdy ggdy1 = new ggdy();
            hnqp hnqp0 = ((hnqo)object1).d;
            if(hnqp0 == null) {
                hnqp0 = hnqp.a;
            }
            for(Object object3: hnqp0.b) {
                gfsx gfsx1 = flww.a(((hnqr)object3), accountContext0, context0, map0, flsl0);
                if(gfsx1.i()) {
                    ggdy1.i(gfsx1.d());
                }
            }
            hnrr hnrr0 = ((hnqo)object1).b;
            if(hnrr0 == null) {
                hnrr0 = hnrr.a;
            }
            ConversationId conversationId0 = flwy.a(accountContext0, hnrr0);
            gged_interceptors gged0 = ggdy1.h();
            if(gged0 == null) {
                throw new NullPointerException("Null cloudMessages");
            }
            fmek fmek0 = new fmek(gged0);
            gged_interceptors gged1 = ggdy0.h();
            if(gged1 == null) {
                throw new NullPointerException("Null annotations");
            }
            arrayList0.add(new fmej(conversationId0, fmek0, gged1));
            continue;
        }
        String s = ((hnre)object0).c;
        if(s == null) {
            throw new NullPointerException("Null nextPageToken");
        }
        gged_interceptors gged2 = gged_interceptors.i(arrayList0);
        if(gged2 != null) {
            return new flkl(s, gged2);
        }
        throw new IllegalStateException("Missing required properties: conversations");
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(24);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        flkl flkl0 = (flkl)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(24);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

