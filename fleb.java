import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.concurrent.ConcurrentHashMap;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

public final class fleb {
    public static fleb a;
    public final flky b;
    public final flsl c;
    public final gmcg d;
    final ConcurrentMap e;
    public final flvj f;
    public final fldt g;
    public final flit h;
    private final ConcurrentMap i;

    public fleb(flky flky0, flvj flvj0, fldt fldt0, flit flit0, flsl flsl0) {
        this.i = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.b = flky0;
        this.f = flvj0;
        this.g = fldt0;
        this.h = flit0;
        this.c = flsl0;
        this.d = flbs.b().a;
    }

    final gmcd a(AccountContext accountContext0) {
        gfsx gfsx0 = this.b.d(accountContext0).a("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY");
        if(gfsx0.i() && !"BOOTSTRAP_TOKEN_FINISH_VALUE".equals(new String(((byte[])gfsx0.d())))) {
            if(fleb.m(accountContext0) && this.l(accountContext0)) {
                fltg fltg0 = new fltg();
                fltg0.c(true);
                fltg0.b(0);
                return gmbu.i(fltg0.a());
            }
            String s = new String(((byte[])gfsx0.d()));
            flsm.a(accountContext0, this.c, 10099, (s.isEmpty() ? 401 : 402));
            flbj.a("LitBstrpCntrl", "Start downloading conversation with token " + (s.isEmpty() ? "inital token" : s));
            return glzd.f(this.b(accountContext0, s, true, 0), new fldx(this, accountContext0), this.d);
        }
        if(!gfsx0.i()) {
            flsm.a(accountContext0, this.c, 10099, 403);
        }
        fltg fltg1 = new fltg();
        fltg1.c(true);
        fltg1.b(0);
        return gmbu.i(fltg1.a());
    }

    public final gmcd b(AccountContext accountContext0, String s, boolean z, int v) {
        if(!"BOOTSTRAP_TOKEN_FINISH_VALUE".equals(s) && (!TextUtils.isEmpty(s) || z)) {
            if(fleb.m(accountContext0) && this.l(accountContext0)) {
                fltg fltg0 = new fltg();
                fltg0.b(v);
                fltg0.c(true);
                return gmbu.i(fltg0.a());
            }
            flqv flqv0 = flqw.a();
            flqv0.a = "Bootstrap List Conversations";
            flqv0.b(flra.c);
            flqw flqw0 = flqv0.a();
            int v1 = (int)iaea.a.g().b();
            UUID uUID0 = UUID.randomUUID();
            flym flym0 = new flym(accountContext0, v1, s, this.f.b, this.f.d, this.f.c);
            gmcd gmcd0 = this.f.a.d.c();
            return glzd.g(this.f.a.b(uUID0, flym0, gmcd0, accountContext0, flqw0, true), new fldw(this, v, accountContext0), this.d);
        }
        fltg fltg1 = new fltg();
        fltg1.b(v);
        fltg1.c(true);
        return gmbu.i(fltg1.a());
    }

    public final gmcd c(AccountContext accountContext0, ConversationId conversationId0, String s, boolean z) {
        if(TextUtils.isEmpty(s) && !z || "BOOTSTRAP_TOKEN_FINISH_VALUE".equals(s)) {
            flsm.a(accountContext0, this.c, 10100, 408);
            return gmbu.i(Boolean.valueOf(true));
        }
        flqv flqv0 = flqw.a();
        flqv0.a = "Bootstrap List Messages";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        int v = (int)iaea.a.g().c();
        gged_interceptors gged0 = gged_interceptors.l(conversationId0);
        UUID uUID0 = UUID.randomUUID();
        flyp flyp0 = new flyp(accountContext0, v, s, gged0, this.f.b, this.f.d, this.f.c);
        gmcd gmcd0 = this.f.a.d.c();
        return glzd.g(this.f.a.b(uUID0, flyp0, gmcd0, accountContext0, flqw0, true), new fldu(this, accountContext0, conversationId0), this.d);
    }

    static String d(ConversationId conversationId0) {
        String s = ConversationId.IdType.b.equals(conversationId0.e()) ? conversationId0.d().b() : fleb.k(conversationId0.c());
        String s1 = fleb.k(conversationId0.a()) + "_" + s + "_" + conversationId0.e().name() + "_";
        if(ConversationId.IdType.b.equals(conversationId0.e())) {
            s1 = s1 + conversationId0.d().a() + "_" + conversationId0.d().b();
        }
        return "BOOTSTRAP_DOWNLOAD_MESSAGES_TOKEN_KEY_PREFIX_" + ghgc.a.c(s1, StandardCharsets.UTF_8).toString();
    }

    public final void e(AccountContext accountContext0) {
        synchronized(this) {
            flbj.a("LitBstrpCntrl", " Release bootstrap lock");
            Long long0 = accountContext0.a();
            this.i.put(long0, Boolean.valueOf(false));
        }
    }

    final boolean f(AccountContext accountContext0) {
        synchronized(this) {
            Long long0 = accountContext0.a();
            ConcurrentMap concurrentMap0 = this.i;
            if(concurrentMap0.containsKey(long0) && ((Boolean)concurrentMap0.get(Long.valueOf(accountContext0.a()))).booleanValue()) {
                return false;
            }
            concurrentMap0.put(Long.valueOf(accountContext0.a()), Boolean.valueOf(true));
        }
        return true;
    }

    final boolean g(AccountContext accountContext0) {
        synchronized(this) {
            flky flky0 = this.b;
            flla flla0 = flky0.d(accountContext0);
            gfsx gfsx0 = flla0.a("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP");
            Long long0 = accountContext0.a();
            ConcurrentMap concurrentMap0 = this.e;
            if(concurrentMap0.containsKey(long0)) {
                flba.a();
                long v1 = iaea.a.g().e();
                if(System.currentTimeMillis() - ((long)(((Long)concurrentMap0.get(Long.valueOf(accountContext0.a()))))) < v1 && !gfsx0.i()) {
                    flbj.a("LitBstrpCntrl", "Timestamp already saved within 24 hours, skipping");
                    return false;
                }
            }
            long v2 = flky0.b(accountContext0).f();
            if(!gfsx0.i()) {
                flla0.c("CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP", glxd.h(v2));
                flbj.a("LitBstrpCntrl", a.u(v2, " Saving latest message timestamp to kv store with value "));
            }
            Long long1 = accountContext0.a();
            flba.a();
            concurrentMap0.put(long1, Long.valueOf(System.currentTimeMillis()));
        }
        return true;
    }

    public static fleb h() {
        fleb fleb0 = fleb.a;
        if(fleb0 != null) {
            return fleb0;
        }
        flbj.c("LitBstrpCntrl", "No instance available, call initialize first.");
        throw new IllegalArgumentException("No instance available, please call initialize first.");
    }

    public final void i(AccountContext accountContext0, ConversationId conversationId0) {
        fldz fldz0 = new fldz(this, accountContext0, conversationId0);
        this.d.e(fldz0);
    }

    public final void j(AccountContext accountContext0) {
        flba.a();
        long v = System.currentTimeMillis();
        if(!"GMM".equals(accountContext0.h()) && !"GMB".equals(accountContext0.h())) {
            flbj.a("LitBstrpCntrl", " Invalid app name.");
            return;
        }
        if(!this.g(accountContext0)) {
            flsm.a(accountContext0, this.c, 10101, 393);
            flbj.a("LitBstrpCntrl", " Bootstrap already save timestamp in last 24 hours");
            return;
        }
        if(!this.f(accountContext0)) {
            flsm.a(accountContext0, this.c, 10101, 392);
            flbj.a("LitBstrpCntrl", "bootstrapping already running.");
            return;
        }
        flbj.a("LitBstrpCntrl", "triggering bootstrap this should be only one ");
        fmai fmai0 = fmaj.a();
        fmai0.n(accountContext0.c().f());
        fmai0.g(10104);
        fmaj fmaj0 = fmai0.a();
        this.c.b(fmaj0);
        fldv fldv0 = new fldv(this, accountContext0, v);
        this.d.e(fldv0);
    }

    private static String k(ContactId contactId0) {
        String s = contactId0.d() + "_" + contactId0.e() + "_" + contactId0.b().name();
        return contactId0.c().i() ? s + "_" + ((String)contactId0.c().d()) : s;
    }

    private final boolean l(AccountContext accountContext0) {
        return glxd.c(((byte[])this.b.d(accountContext0).a("BOOTSTRAP_CONVERSATIONS_DOWNLOADED_KEY").d())) >= iadf.a.b().a();
    }

    private static final boolean m(AccountContext accountContext0) {
        return "GMB".equals(accountContext0.h());
    }
}

