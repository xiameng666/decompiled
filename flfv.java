import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class flfv {
    private final flit A;
    private final flit B;
    public static final long a;
    public final AccountContext b;
    public final Context c;
    public final fmou d;
    public final gmcg e;
    public final flbx f;
    public final flcd g;
    public final flsl h;
    public final fldb i;
    public final ConcurrentMap j;
    public final Set k;
    public boolean l;
    public boolean m;
    public boolean n;
    public flfu o;
    public final Handler p;
    public final Object q;
    final Map r;
    public final Timer s;
    public final flwi t;
    public final flkh u;
    private static final Map v;
    private final fleo w;
    private final Map x;
    private final Map y;
    private final fldt z;

    static {
        flfv.a = TimeUnit.SECONDS.toMillis(1L);
        flfv.v = new HashMap();
    }

    public flfv(Context context0, AccountContext accountContext0, flwi flwi0, flbx flbx0, flcd flcd0, fmou fmou0, fldt fldt0, flkh flkh0, fleo fleo0, flit flit0, flit flit1, fldb fldb0, Map map0) {
        this.l = false;
        this.m = false;
        this.n = false;
        this.p = new Handler(Looper.getMainLooper());
        this.q = new Object();
        this.c = context0;
        this.b = accountContext0;
        this.t = flwi0;
        this.d = fmou0;
        this.z = fldt0;
        this.u = flkh0;
        this.w = fleo0;
        this.B = flit0;
        this.A = flit1;
        this.x = map0;
        this.i = fldb0;
        this.e = flbs.b().a;
        this.f = flbx0;
        this.g = flcd0;
        this.h = flsl.a(context0);
        this.j = new ConcurrentHashMap();
        this.s = new Timer("TypingIndicatorTimer", true);
        this.r = new HashMap();
        this.k = new HashSet();
        this.y = new HashMap();
    }

    // Detected as a lambda impl.
    public final gmcd a(List list0) {
        if(list0.isEmpty()) {
            return gmbu.i(null);
        }
        flqv flqv0 = flqw.a();
        flqv0.a = "ack messages";
        flqv0.b(flra.c);
        return gmbu.n(new flfl(this, list0, flqv0.a()), this.e);
    }

    public final gmcd b() {
        gmcd gmcd1;
        synchronized(this) {
            if(!this.n && !this.l) {
                this.n = true;
                this.m = false;
                this.g.a(1);
                flfu flfu0 = new flfu(this);
                flqv flqv0 = flqw.a();
                flqv0.a = "stream open";
                flqv0.b(flra.c);
                return gmbu.b(new gmcd[]{gmbu.d(new gmcd[]{gmbu.n(new flev(this, flfu0, flqv0.a()), this.e)}).a(new flew(this, flfu0), gmap.a)}).a(new flex(this), gmap.a);
            }
            gmcd1 = gmbu.i(null);
        }
        return gmcd1;
    }

    public final gmcd c() {
        gmcd gmcd1;
        synchronized(this) {
            if(this.l) {
                return flcq.a(iact.a.b().a(), ((gful_cronetEngineProvider)() -> {
                    flqv flqv0 = flqw.a();
                    flqv0.a = "pull once";
                    flqv0.b(flra.c);
                    gmcd gmcd0 = gmbu.n(new flfn(this, flqv0.a()), this.e);
                    gmcd gmcd1 = glzd.g(gmcd0, (/* MISSING LAMBDA PARAMETER */) -> {
                        if(((flkp)object0).b.isEmpty()) {
                            return gmbu.i(null);
                        }
                        flqv flqv0 = flqw.a();
                        flqv0.a = "ack messages";
                        flqv0.b(flra.c);
                        return gmbu.n(new flfl(this, ((flkp)object0).b, flqv0.a()), this.e);
                    }, this.e);
                    flfp flfp0 = new flfp();
                    gmcd gmcd2 = glyi.f(gmcd1, Exception.class, flfp0, gmap.a);
                    gmcd gmcd3 = glzd.f(gmcd0, new flfq(this), this.e);
                    flfr flfr0 = new flfr();
                    return gmbu.b(new gmcd[]{gmcd2, glyi.f(gmcd3, Exception.class, flfr0, gmap.a)}).b(new flet(this, gmcd0), gmap.a);
                }), this.e);
            }
            gmcd1 = this.d();
        }
        return gmcd1;
    }

    // Detected as a lambda impl.
    public final gmcd d() {
        flqv flqv0 = flqw.a();
        flqv0.a = "pull once";
        flqv0.b(flra.c);
        gmcd gmcd0 = gmbu.n(new flfn(this, flqv0.a()), this.e);
        gmcd gmcd1 = glzd.g(gmcd0, (/* MISSING LAMBDA PARAMETER */) -> {
            if(((flkp)object0).b.isEmpty()) {
                return gmbu.i(null);
            }
            flqv flqv0 = flqw.a();
            flqv0.a = "ack messages";
            flqv0.b(flra.c);
            return gmbu.n(new flfl(this, ((flkp)object0).b, flqv0.a()), this.e);
        }, this.e);
        flfp flfp0 = new flfp();
        gmcd gmcd2 = glyi.f(gmcd1, Exception.class, flfp0, gmap.a);
        gmcd gmcd3 = glzd.f(gmcd0, new flfq(this), this.e);
        flfr flfr0 = new flfr();
        return gmbu.b(new gmcd[]{gmcd2, glyi.f(gmcd3, Exception.class, flfr0, gmap.a)}).b(new flet(this, gmcd0), gmap.a);
    }

    public final void e() {
        synchronized(this) {
            if(!this.l) {
                return;
            }
            flfu flfu0 = this.o;
            if(flfu0 != null) {
                flvb flvb0 = flfu0.b;
                if(flvb0 != null) {
                    ibjp ibjp0 = flvb0.a.g;
                    if(ibjp0 != null) {
                        ibjp0.d("", new iapl(iapk.c));
                    }
                }
            }
            this.i();
        }
    }

    public final void f() {
        synchronized(this) {
            this.a(gged_interceptors.i(this.k));
            this.k.clear();
        }
    }

    // Detected as a lambda impl.
    public final void g() {
        synchronized(this) {
            this.p(ggeo.k(this.y));
            this.y.clear();
        }
    }

    public final void h(flub flub0) {
        boolean z;
        switch(flub0.h() - 1) {
            case 0: {
                z = this.r(flub0.g().c, flub0.g().d);
                goto label_6;
            }
            case 4: {
                flub0.a();
                z = this.r(flub0.a().a().a, flub0.a().a().b);
            label_6:
                if(z) {
                    flbj.a("MsgReceiver", "dropping message of type " + fltz.a(flub0.h()));
                    fmai fmai0 = fmaj.a();
                    fmai0.g(15);
                    fmai0.n(this.b.c().f());
                    fmai0.o(this.b.d().toStringUtf8());
                    fmai0.f(58);
                    if(flub0.f() != null) {
                        fmai0.d(flub0.f());
                    }
                    fmaj fmaj0 = fmai0.a();
                    this.h.b(fmaj0);
                    return;
                }
            }
        }
        int v = flub0.h() - 1;
        if(v != 0) {
            switch(v) {
                case 1: {
                    fltu fltu0 = flub0.b();
                    fltt fltt0 = fltu0.b;
                    switch(fltt0.b() - 1) {
                        case 0: {
                            if(fltu0.c().b) {
                                this.z.g(this.b);
                            }
                            if(fltu0.c().a.i() && fltu0.c().c.i()) {
                                Object object0 = fltu0.c().a.d();
                                fltq fltq0 = (fltq)fltu0.c().c.d();
                                this.B.w(this.b, ((ConversationId)object0), fltq0);
                                return;
                            }
                            return;
                        }
                        case 1: {
                            if(fltt0.c().a) {
                                this.z.g(this.b);
                                return;
                            }
                            return;
                        }
                        case 2: {
                            ConversationId conversationId1 = fltu0.a().a;
                            gged_interceptors gged1 = fltu0.a().b.a;
                            this.d.z(conversationId1, gged1);
                            return;
                        }
                        case 3: {
                            ConversationId conversationId2 = fltu0.b().a;
                            gged_interceptors gged2 = fltu0.b().b.a;
                            this.d.H(conversationId2, gged2);
                            return;
                        }
                        default: {
                            fmou fmou0 = this.d;
                            fmou0.am(fltu0.d().a);
                            if(fltu0.d().b.i()) {
                                fmev fmev0 = fltu0.d().a;
                                gged_interceptors gged0 = ((fltn)fltu0.d().b.d()).a;
                                fmou0.z(fmev0.a, gged0);
                            }
                            this.z.g(this.b);
                            return;
                        }
                    }
                }
                case 2: {
                    fltw fltw0 = flub0.c();
                    int v1 = fltw0.a;
                    if(v1 == 0) {
                        if(this.q(fltw0)) {
                            ConversationId conversationId3 = fltw0.e;
                            List list0 = Arrays.asList(new fmft[]{fmft.h, fmft.f});
                            this.d.ac(conversationId3, fltw0.c, list0, fmft.i);
                            for(Object object1: fltw0.c) {
                                fmai fmai1 = fmaj.a();
                                fmai1.g(22);
                                fmai1.n(this.b.c().f());
                                fmai1.o(this.b.d().toStringUtf8());
                                fmai1.p(((String)object1));
                                fmai1.d(conversationId3);
                                fmaj fmaj1 = fmai1.a();
                                this.h.b(fmaj1);
                                fmam.a().d("MessageDeliveredLatency", ((String)object1));
                            }
                        }
                        fmai fmai2 = fmaj.a();
                        fmai2.g(16);
                        fmai2.n(this.b.c().f());
                        fmai2.o(this.b.d().toStringUtf8());
                        fmai2.p(fltw0.b);
                        fmai2.d(fltw0.e);
                        fmaj fmaj2 = fmai2.a();
                        this.h.b(fmaj2);
                    }
                    else if(v1 == 1) {
                        if(this.q(fltw0)) {
                            ConversationId conversationId4 = fltw0.e;
                            List list1 = Arrays.asList(new fmft[]{fmft.i, fmft.h, fmft.f});
                            this.d.ac(conversationId4, fltw0.c, list1, fmft.j);
                            List list2 = Arrays.asList(new fmft[]{fmft.c, fmft.b});
                            this.d.ac(conversationId4, fltw0.c, list2, fmft.d);
                            for(Object object2: fltw0.c) {
                                fmai fmai3 = fmaj.a();
                                fmai3.g(44);
                                fmai3.n(this.b.c().f());
                                fmai3.o(this.b.d().toStringUtf8());
                                fmai3.p(((String)object2));
                                fmai3.d(conversationId4);
                                fmaj fmaj3 = fmai3.a();
                                this.h.b(fmaj3);
                            }
                        }
                        fmai fmai4 = fmaj.a();
                        fmai4.g(17);
                        fmai4.n(this.b.c().f());
                        fmai4.o(this.b.d().toStringUtf8());
                        fmai4.p(fltw0.b);
                        fmai4.d(fltw0.e);
                        fmaj fmaj4 = fmai4.a();
                        this.h.b(fmaj4);
                    }
                    else {
                        ConversationId conversationId5 = fltw0.e;
                        List list3 = Arrays.asList(new fmft[]{fmft.i, fmft.h, fmft.f});
                        this.d.ac(conversationId5, fltw0.c, list3, fmft.k);
                        for(Object object3: fltw0.c) {
                            fmai fmai5 = fmaj.a();
                            fmai5.g(45);
                            fmai5.n(this.b.c().f());
                            fmai5.o(this.b.d().toStringUtf8());
                            fmai5.p(((String)object3));
                            fmai5.d(conversationId5);
                            fmaj fmaj5 = fmai5.a();
                            this.h.b(fmaj5);
                        }
                        fmai fmai6 = fmaj.a();
                        fmai6.g(21);
                        fmai6.n(this.b.c().f());
                        fmai6.o(this.b.d().toStringUtf8());
                        fmai6.p(fltw0.b);
                        fmai6.d(conversationId5);
                        fmaj fmaj6 = fmai6.a();
                        this.h.b(fmaj6);
                    }
                    fleu fleu0 = new fleu(this, fltw0);
                    this.p.post(fleu0);
                    return;
                }
                case 3: {
                    flud flud0 = flub0.e();
                    fmpl fmpl0 = fmpk.a(flud0.b);
                    fmot.d(this.d.n(fmpl0), new fles()).k(new flfc(this, flud0));
                    return;
                }
                case 4: {
                    fltl fltl0 = flub0.a().a();
                    this.w.a.b(this.b).D(fltl0.a, fltl0.b);
                    return;
                }
                default: {
                    fltx fltx0 = flub0.d();
                    ConversationId conversationId0 = fltx0.a;
                    ConversationId.IdType conversationId$IdType0 = conversationId0.e();
                    if(ConversationId.IdType.b.equals(conversationId$IdType0)) {
                        this.B.w(this.b, conversationId0, fltx0.b);
                        return;
                    }
                    ContactId contactId0 = conversationId0.c();
                    this.A.d.b(this.b).o(contactId0).k(new flhf(this.A, this.b, contactId0, fltx0.b));
                    return;
                }
            }
        }
        fmga fmga0 = flub0.g();
        flsl flsl0 = this.h;
        fmai fmai7 = fmaj.a();
        fmai7.g(3);
        AccountContext accountContext0 = this.b;
        fmai7.n(accountContext0.c().f());
        fmai7.o(accountContext0.d().toStringUtf8());
        String s = fmga0.a;
        fmai7.p(s);
        ConversationId conversationId6 = fmga0.c;
        fmai7.d(conversationId6);
        fmai7.i(flcs.a(fmga0));
        flsl0.b(fmai7.a());
        fmfr fmfr0 = fmga0.f;
        if(fmfr0.a() == 3) {
            Map map0 = this.x;
            if(map0.containsKey(fmfr0.b().a)) {
                ((flws)map0.get(fmfr0.b().a)).d(accountContext0, fmga0, flsl0);
            }
        }
        if(this.d.ae(s)) {
            flbj.a("MsgReceiver", "Already handled message.");
            return;
        }
        fmak.a().b(fmal.b, fmga0);
        new fmor(gmbu.m(new fldf(this.z, accountContext0), this.z.b), new fldg(this.z, accountContext0, conversationId6), this.z.b).k(new flfd(this, flub0, fmga0));
    }

    public final void i() {
        synchronized(this) {
            this.o = null;
            this.l = false;
            this.m = true;
            flbj.a("MsgReceiver", "BindV2 stream closed for " + ((.AutoValue_ContactId)this.b.c().f()).a);
        }
    }

    public final void j(ConversationId conversationId0, ContactId contactId0) {
        Map map0 = this.r;
        if(map0.containsKey(conversationId0)) {
            ((Map)map0.get(conversationId0)).remove(contactId0);
            if(((Map)map0.get(conversationId0)).isEmpty()) {
                map0.remove(conversationId0);
            }
        }
    }

    public final void k(fmhr fmhr0) {
        if(((Boolean)this.d.m(fmhr0).second).booleanValue()) {
            this.j.remove(fmhr0.c);
            fmai fmai0 = fmaj.a();
            fmai0.g(10021);
            fmai0.n(this.b.c().f());
            fmai0.o(this.b.d().toStringUtf8());
            fmai0.p(fmhr0.c);
            fmaj fmaj0 = fmai0.a();
            this.h.b(fmaj0);
        }
    }

    public final void l(List list0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            flub flub0 = (flub)object0;
            if(flub0.h() - 1 == 0) {
                ConversationId conversationId0 = flub0.g().c;
                if(!hashMap0.containsKey(conversationId0)) {
                    hashMap0.put(conversationId0, new HashSet());
                }
                switch(flub0.g().r) {
                    case 0: {
                        throw null;
                    }
                    case 1: {
                        ((Set)hashMap0.get(conversationId0)).add(flub0.g().a);
                    }
                }
            }
        }
        long v = iado.a.c().c();
        if(v <= 0L) {
            this.p(hashMap0);
            return;
        }
        synchronized(this) {
            Map map0 = this.y;
            if(map0.isEmpty() && !hashMap0.isEmpty()) {
                flez flez0 = () -> synchronized(this) {
                    this.p(ggeo.k(this.y));
                    this.y.clear();
                };
                this.p.postDelayed(flez0, v);
            }
            for(Object object1: hashMap0.keySet()) {
                ConversationId conversationId1 = (ConversationId)object1;
                if(map0.containsKey(conversationId1)) {
                    ((Set)map0.get(conversationId1)).addAll(((Collection)hashMap0.get(conversationId1)));
                }
                else {
                    map0.put(conversationId1, ((Set)hashMap0.get(conversationId1)));
                }
            }
        }
    }

    public static flfv m(Context context0, AccountContext accountContext0, flwi flwi0, flbx flbx0, flcd flcd0, fmou fmou0, fldt fldt0, flkh flkh0, fleo fleo0, flit flit0, flit flit1, Map map0) {
        flfv flfv0;
        synchronized(flfv.class) {
            Map map1 = flfv.v;
            if(!map1.containsKey(accountContext0)) {
                map1.put(accountContext0, new flfv(context0, accountContext0, flwi0, flbx0, flcd0, fmou0, fldt0, flkh0, fleo0, flit0, flit1, new fldb(), map0));
            }
            flfv0 = (flfv)map1.get(accountContext0);
        }
        return flfv0;
    }

    public final void n() {
        synchronized(this) {
            this.i.a();
            this.b();
        }
    }

    final void o(List list0) {
        for(Object object0: list0) {
            this.h(((flub)object0));
        }
        this.l(list0);
    }

    private final void p(Map map0) {
        flqv flqv0 = flqw.a();
        flqv0.a = "delivery receipt";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        for(Object object0: map0.keySet()) {
            fmpl fmpl0 = fmpk.a(((ConversationId)object0));
            this.d.n(fmpl0).k(new flfj(this, ((ConversationId)object0), map0, flqw0));
        }
    }

    private final boolean q(fltw fltw0) {
        gfsx gfsx0;
        gmcu gmcu0 = new gmcu();
        this.d.p(fltw0.e).k(new flfg(gmcu0));
        try {
            gfsx0 = (gfsx)gmcu0.u();
        }
        catch(Exception exception0) {
            flbj.d("MsgReceiver", "Unexpected exception", exception0);
            return false;
        }
        if(gfsx0.i()) {
            fmev fmev0 = (fmev)gfsx0.d();
            if(!fmev0.a.e().equals(ConversationId.IdType.a)) {
                gfsx gfsx1 = flwt.a(fmev0.i);
                return !gfsx1.i() || ((flto)gfsx1.d()).a.contains(fltw0.d);
            }
            return true;
        }
        flbj.a("MsgReceiver", "Received receipt for unknown conversation " + fltw0.e);
        return false;
    }

    private final boolean r(ConversationId conversationId0, long v) {
        gmcu gmcu0 = new gmcu();
        this.d.p(conversationId0).k(new flfm(v, gmcu0));
        try {
            return ((Boolean)gmcu0.u()).booleanValue();
        }
        catch(ExecutionException | InterruptedException exception0) {
            flbj.d("MsgReceiver", "Error determining if message should be dropped, won\'t drop", exception0);
            return false;
        }
    }
}

