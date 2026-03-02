import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class flit implements flbx, flcd {
    private final HashMap A;
    private BroadcastReceiver B;
    public final Context a;
    public final gmcg b;
    public final Executor c;
    public final flky d;
    public final flsl e;
    public final fleo f;
    public final Object g;
    public final Object h;
    public final Random i;
    public final fljy j;
    final Map k;
    final Map l;
    public final Handler m;
    public final Map n;
    LruCache o;
    final Map p;
    public final Runnable q;
    public final flwi r;
    public final fier s;
    public final flfy t;
    public flen u;
    public fldt v;
    public flkh w;
    private final flbe x;
    private HashSet y;
    private final HashSet z;

    public flit(Context context0, flwi flwi0, flky flky0, fleo fleo0, Map map0, fier fier0, flbe flbe0, flsl flsl0, flfy flfy0) {
        this.g = new Object();
        this.h = new Object();
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new Handler(Looper.getMainLooper());
        this.A = new HashMap();
        this.o = null;
        this.p = new HashMap();
        this.q = new flis(this);
        this.a = context0;
        this.r = flwi0;
        this.d = flky0;
        this.f = fleo0;
        this.s = fier0;
        this.x = flbe0;
        gmcg gmcg0 = flbs.b().a;
        this.b = gmcg0;
        this.e = flsl0;
        new HashMap();
        this.z = new HashSet();
        this.n = map0;
        this.c = new gmct(gmcg0);
        this.i = new Random();
        this.t = flfy0;
        this.j = new fljy();
        int v = (int)iaea.a.g().a();
        if(v > 0) {
            this.o = new LruCache(v);
        }
    }

    public final void A(AccountContext accountContext0, ConversationId conversationId0, long v) {
        this.N(accountContext0, conversationId0);
    }

    public final void B(long v) {
        flit flit0;
        gmcd gmcd0;
        ConversationId conversationId0;
        ggeo ggeo0;
        AccountContext accountContext0;
        flqw flqw0;
        __monitor_enter(this);
        try {
            flbo.b();
            flqv flqv0 = flqw.a();
            flqv0.a = "Resend Delivery Receipts";
            flqv0.b(flra.c);
            flqw0 = flqv0.a();
            Iterator iterator0 = this.z.iterator();
        alab1:
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_32;
                }
                Object object0 = iterator0.next();
                accountContext0 = (AccountContext)object0;
                fmou fmou0 = this.d(accountContext0);
                TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                flba.a();
                ggeo0 = fmou0.y(timeUnit0.toMicros(System.currentTimeMillis() - v));
                ggqj ggqj0 = ggeo0.w().om();
            label_15:
                while(ggqj0.hasNext()) {
                    Object object1 = ggqj0.next();
                    conversationId0 = (ConversationId)object1;
                    gmcd0 = this.p(accountContext0, conversationId0);
                    flit0 = this;
                    break alab1;
                }
            }
        }
        catch(Throwable throwable0) {
            flit0 = this;
            goto label_29;
        }
        try {
            gmbu.d(new gmcd[]{glzd.g(gmcd0, new flhj(flit0, accountContext0, conversationId0, ggeo0, flqw0), flit0.b)}).a(new flhk(flit0, accountContext0, ggeo0, conversationId0), flit0.b);
            this = flit0;
            goto label_15;
        label_29:
            __monitor_exit(flit0);
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
        throw throwable0;
    label_32:
        __monitor_exit(this);
    }

    public final void C(AccountContext accountContext0, String s) {
        gfsx gfsx0 = this.r.a(accountContext0, s);
        if(gfsx0.i()) {
            gmcg gmcg0 = this.b;
            gmcg0.d(new flgj(this, accountContext0, gfsx0));
            if(iacz.d()) {
                gmcg0.d(new flgl(this, gfsx0));
            }
        }
    }

    public final void D(List list0) {
        synchronized(this) {
            this.z.addAll(list0);
            if(this.z.isEmpty()) {
                flie flie0 = new flie(this);
                this.m.post(flie0);
            }
        }
    }

    public final void E(AccountContext accountContext0) {
        synchronized(this) {
            flbj.a("LiMsgController", "BindV2 startMessaging() called manually for " + ((.AutoValue_ContactId)accountContext0.c().f()).a);
            this.G(gged_interceptors.l(accountContext0));
        }
    }

    public final void F(AccountContext accountContext0) {
        synchronized(this) {
            HashMap hashMap0 = this.A;
            int v1 = hashMap0.containsKey(accountContext0) ? ((int)(((Integer)hashMap0.get(accountContext0)))) : 0;
            if(v1 + 1 == 1) {
                flbj.a("LiMsgController", "BindV2 start for " + ((.AutoValue_ContactId)accountContext0.c().f()).a);
                this.E(accountContext0);
            }
            else {
                flbj.a("LiMsgController", "BindV2 ignore start for " + ((.AutoValue_ContactId)accountContext0.c().f()).a);
            }
            hashMap0.put(accountContext0, Integer.valueOf(v1 + 1));
        }
    }

    public final void G(List list0) {
        synchronized(this) {
            HashSet hashSet0 = this.y;
            if(hashSet0 == null) {
                this.y = new HashSet(list0);
            }
            else {
                hashSet0.addAll(list0);
            }
            this.m.removeCallbacks(this.q);
            this.q.run();
            if(this.B == null) {
                this.B = new fliq(this);
                IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                this.a.registerReceiver(this.B, intentFilter0);
            }
        }
    }

    public final void H(List list0) {
        synchronized(this) {
            if(this.y != null && !this.y.isEmpty()) {
                this.y.removeAll(list0);
                for(Object object0: list0) {
                    this.b(((AccountContext)object0)).e();
                }
                if(this.y.isEmpty()) {
                    this.m.removeCallbacks(this.q);
                    BroadcastReceiver broadcastReceiver0 = this.B;
                    if(broadcastReceiver0 != null) {
                        this.a.unregisterReceiver(broadcastReceiver0);
                        this.B = null;
                        return;
                    }
                }
                return;
            }
            flbj.a("LiMsgController", "No accounts with open bind channel");
        }
    }

    public static boolean I(gfsx gfsx0, fltq fltq0) {
        gfsx gfsx1 = fltq0.c;
        if(!gfsx1.i()) {
            return false;
        }
        if(gfsx0.i()) {
            Object object0 = gfsx1.d();
            Object object1 = gfsx0.d();
            return !TextUtils.isEmpty(((CharSequence)object0)) && !((String)object0).equals(object1);
        }
        return true;
    }

    public static final fmga J(ConversationId conversationId0, fmfr fmfr0, String s, gfsx gfsx0, gfsx gfsx1, ggeo ggeo0) {
        fmfm fmfm0 = fmga.a();
        gfsx1.f("");
        String s1 = UUID.randomUUID().toString();
        flba.a();
        fmfm0.j(String.format("%s%s-%s", "", s1, System.currentTimeMillis()));
        fmfm0.f = 2;
        fmfm0.k(fmft.e);
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        flba.a();
        fmfm0.m(timeUnit0.toMicros(System.currentTimeMillis()));
        fmfm0.e(conversationId0);
        fmfm0.b = fmfr0;
        fmfm0.f(s);
        fmfm0.a = conversationId0.a();
        fmfm0.c(0xC0);
        fmfm0.p();
        fmfm0.l(ggeo0);
        fmfm0.n(((String)((gftm)gfsx0).a));
        return fmfm0.a();
    }

    public final void K(AccountContext accountContext0, ConversationId conversationId0, String s, boolean z) {
        if(iaea.a.g().s()) {
            flbj.a("LiMsgController", " Entering testing code path.");
            glzd.f(this.r(accountContext0, conversationId0), new flhg(this, s, conversationId0, accountContext0), this.b);
            return;
        }
        flbj.a("LiMsgController", "Entering production code path.");
        gmbu.d(new gmcd[]{glzd.g(this.r(accountContext0, conversationId0), new flgm(this, accountContext0, conversationId0, s, z), this.b)}).a(new flhh(this, conversationId0, accountContext0), gmap.a);
    }

    public final gmcd L(AccountContext accountContext0, ConversationId conversationId0, long v) {
        return glzd.f(glzd.g(this.r(accountContext0, conversationId0), new flhm(this, accountContext0, conversationId0, v), this.b), new flhn(this, accountContext0), this.b);
    }

    public final fmpa M(AccountContext accountContext0, int v, int v1) {
        return fmot.d(this.d(accountContext0).ar(v, v1), new flii(this, accountContext0));
    }

    public final void N(AccountContext accountContext0, ConversationId conversationId0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(205);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.d(conversationId0);
        fmaj fmaj0 = fmai0.a();
        this.e.b(fmaj0);
        gmbu.t(gmbu.l(new flgz(this, accountContext0, conversationId0), this.b), new flip(this, accountContext0, conversationId0), this.b);
    }

    @Override  // flcd
    public final void a(int v) {
        fljy fljy0 = this.j;
        if(fljy0.c == v) {
            return;
        }
        fljy0.c = v;
        fljy0.a();
    }

    public final flfv b(AccountContext accountContext0) {
        fmou fmou0 = this.d(accountContext0);
        return flfv.m(this.a, accountContext0, this.r, this, this, fmou0, this.v, this.w, this.f, this, this, this.n);
    }

    public static fmev c(fmev fmev0, fltq fltq0, long v) {
        fmeu fmeu0 = new fmeu(fmev0);
        flba.a();
        fmeu0.i(System.currentTimeMillis() + v);
        fmeu0.c(true);
        String s = fltq0.a;
        if(!TextUtils.isEmpty(s)) {
            fmeu0.q(s);
        }
        if(flit.I(fmev0.c, fltq0)) {
            fmeu0.k(((String)fltq0.c.d()));
            fmeu0.l(true);
        }
        else {
            gfsx gfsx0 = fltq0.d;
            if(gfsx0.i()) {
                byte[] arr_b = (byte[])gfsx0.d();
                if(arr_b.length > 0) {
                    fmeu0.j(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
                }
            }
        }
        ggeo ggeo0 = fltq0.f;
        if(!ggeo0.isEmpty()) {
            fmeu0.b(ggeo0);
        }
        gfsx gfsx1 = fltq0.k;
        if(gfsx1.i()) {
            fmeu0.p(((Long)gfsx1.d()).longValue());
        }
        return fmeu0.a();
    }

    public final fmou d(AccountContext accountContext0) {
        return this.d.b(accountContext0);
    }

    public final fmpa e(AccountContext accountContext0, ConversationId conversationId0, Integer integer0, Integer integer1, fmfz[] arr_fmfz) {
        fleb.h().i(accountContext0, conversationId0);
        return this.j(accountContext0, conversationId0, integer0, integer1, arr_fmfz);
    }

    public final fmpa f(AccountContext accountContext0, ConversationId conversationId0) {
        return this.g(accountContext0, conversationId0, gftj.b, gftj.b);
    }

    public final fmpa g(AccountContext accountContext0, ConversationId conversationId0, gftc gftc0, gftc gftc1) {
        return fmot.d(this.d(accountContext0).p(conversationId0), new flgd(this, accountContext0, conversationId0, gftc0, gftc1));
    }

    public final fmpa h(AccountContext accountContext0, ConversationId conversationId0) {
        return this.g(accountContext0, conversationId0, new flik(), new flil());
    }

    public final fmpa i(AccountContext accountContext0, String s, ConversationId conversationId0) {
        return this.d(accountContext0).q(s, conversationId0);
    }

    public final fmpa j(AccountContext accountContext0, ConversationId conversationId0, Integer integer0, Integer integer1, fmfz[] arr_fmfz) {
        Integer integer2 = (int)iadc.a.c().b();
        long v = iacz.b();
        return new fmor(gmbu.m(new flgx(this, accountContext0, conversationId0, iacz.a.c().d(), v), this.b), new flgy(this, accountContext0, conversationId0, integer0, integer2, integer1, arr_fmfz), this.b);
    }

    public final gfsx k(JSONObject jSONObject0) {
        gfsx gfsx10;
        JSONObject jSONObject7;
        gfsx gfsx8;
        gfsx gfsx5;
        ggdy ggdy0;
        JSONArray jSONArray0;
        fmef fmef0;
        JSONObject jSONObject6;
        gfsx gfsx3;
        JSONObject jSONObject5;
        int v3;
        Iterator iterator3;
        JSONObject jSONObject4;
        JSONObject jSONObject3;
        String s1;
        ggek ggek0;
        JSONObject jSONObject2;
        gfsx gfsx1;
        int v1;
        Iterator iterator1;
        JSONObject jSONObject1;
        fmfq fmfq0;
        String s;
        int v;
        HashMap hashMap0;
        Iterator iterator0;
        fmfm fmfm0;
        try {
            fmfm0 = fmga.a();
            iterator0 = jSONObject0.keys();
            hashMap0 = new HashMap();
            v = 0;
        alab1:
            while(true) {
            label_4:
                if(!iterator0.hasNext()) {
                    fmfm0.l(hashMap0);
                    return gfsx.m(fmfm0.a());
                }
                Object object0 = iterator0.next();
                s = (String)object0;
                switch(s.hashCode()) {
                    case 0x91930E35: {
                        iterator1 = iterator0;
                        v1 = v;
                        if(s.equals("SENDER")) {
                            gfsx gfsx0 = ContactId.f(jSONObject0.getJSONObject("SENDER"));
                            if(!gfsx0.i()) {
                                flbj.c("LiMsgController", "failed to get sender when decoding message JSONObject.");
                                return gfqx.a;
                            }
                            fmfm0.a = (ContactId)gfsx0.d();
                            iterator0 = iterator1;
                            v = v1;
                            break;
                        }
                        else {
                            goto label_276;
                        }
                        goto label_22;
                    }
                    case 0xAFE97CFD: {
                    label_22:
                        iterator1 = iterator0;
                        v1 = v;
                        if(s.equals("SNIPPET")) {
                            fmfm0.n(jSONObject0.getString("SNIPPET"));
                            iterator0 = iterator1;
                            v = v1;
                            break;
                        }
                        else {
                            goto label_276;
                        }
                        goto label_27;
                    }
                    case 0xB0295FC1: {
                    label_27:
                        iterator1 = iterator0;
                        v1 = v;
                        if(s.equals("INTENDED_RENDERING_TYPE")) {
                            fmfz fmfz0 = fmfz.a(jSONObject0.getInt("INTENDED_RENDERING_TYPE"));
                            if(v1 == 0) {
                                fmfm0.h(fmfz0.g);
                            }
                        }
                        else {
                            goto label_276;
                        }
                        iterator0 = iterator1;
                        v = v1;
                        break;
                    }
                    case 0xB8240473: {
                        iterator1 = iterator0;
                        v1 = v;
                        if(s.equals("MESSAGE_ID")) {
                            fmfm0.j(jSONObject0.getString("MESSAGE_ID"));
                            iterator0 = iterator1;
                            v = v1;
                            break;
                        }
                        goto label_276;
                    }
                    case 0xD3F50F03: {
                        iterator1 = iterator0;
                        v1 = v;
                        if(s.equals("FEATURE_TYPE")) {
                            switch(jSONObject0.getInt("FEATURE_TYPE")) {
                                case 1: {
                                    fmfq0 = fmfq.b;
                                    break;
                                }
                                case 2: {
                                    fmfq0 = fmfq.c;
                                    break;
                                }
                                default: {
                                    fmfq0 = fmfq.a;
                                }
                            }
                            fmfm0.d = gfsx.m(fmfq0);
                            iterator0 = iterator1;
                            v = v1;
                            break;
                        }
                        goto label_276;
                    }
                    case 0xD97BEF4F: {
                        iterator1 = iterator0;
                        v1 = v;
                        if(s.equals("RENDERING_DETAILS")) {
                            jSONObject1 = jSONObject0.optJSONObject("RENDERING_DETAILS");
                            break alab1;
                        }
                        goto label_276;
                    }
                    case -298577640: {
                        goto label_77;
                    }
                    case 304220117: {
                        goto label_82;
                    }
                    case 0x176E1202: {
                        goto label_181;
                    }
                    case 0x2999B657: {
                        goto label_190;
                    }
                    case 0x2FCE1C01: {
                        goto label_200;
                    }
                    case 0x3F3A0C92: {
                        goto label_239;
                    }
                    case 0x43ABF603: {
                        goto label_245;
                    }
                    case 1458000714: {
                        goto label_251;
                    }
                    case 0x5C0596E2: {
                        goto label_257;
                    }
                    case 0x61B8C4BA: {
                        goto label_263;
                    }
                    case 0x7382E4E2: {
                        goto label_269;
                    }
                    default: {
                        iterator1 = iterator0;
                        v1 = v;
                        goto label_276;
                    }
                }
            }
        }
        catch(JSONException jSONException0) {
            flbj.d("LiMsgController", "failed to convert JSONObject to Message.", jSONException0);
            return gfqx.a;
        }
        try {
            int v2 = fmfz.a(jSONObject1.getInt("TYPE")).ordinal();
            switch(v2) {
                case 0: {
                    gfsx1 = gfsx.m(fmct.a);
                    goto label_73;
                }
                case 1: {
                    gfsx1 = gfsx.m(fmcw.a);
                    goto label_73;
                }
                case 2: {
                    gfsx gfsx2 = fmfw.b(jSONObject1.getJSONObject("OVERLAY"));
                    if(gfsx2.i()) {
                        gfsx1 = gfsx.m(fmcy.a(((fmfw)gfsx2.d())));
                    }
                    else {
                        flbj.c("Message", "Failed to get overlay from JSONObject in rendering details");
                        gfsx1 = gfqx.a;
                    }
                    goto label_73;
                }
                default: {
                    if(v2 == 3) {
                        gfsx1 = gfsx.m(fmcu.a);
                    }
                    else {
                        goto label_72;
                    }
                    goto label_73;
                }
            }
        }
        catch(JSONException jSONException1) {
            try {
                flbj.d("Message", "failed to convert RenderingDetails from JSONObject", jSONException1);
            label_72:
                gfsx1 = gfqx.a;
            label_73:
                if(!gfsx1.i()) {
                    return gfqx.a;
                }
                fmfm0.c = (fmfx)gfsx1.d();
                iterator0 = iterator1;
                v = v1;
                goto label_4;
            label_77:
                iterator1 = iterator0;
                v1 = v;
                if(s.equals("CAPABILITY")) {
                    fmfm0.c(jSONObject0.getInt("CAPABILITY"));
                    iterator0 = iterator1;
                    v = v1;
                    goto label_4;
                label_82:
                    if(s.equals("POSSIBLE_DECORATIONS")) {
                        jSONObject2 = jSONObject0.getJSONObject(s);
                        ggek0 = new ggek();
                        Iterator iterator2 = jSONObject2.keys();
                        while(true) {
                        label_86:
                            if(!iterator2.hasNext()) {
                                goto label_174;
                            }
                            Object object1 = iterator2.next();
                            s1 = (String)object1;
                            jSONObject3 = jSONObject2.getJSONObject(s1);
                            goto label_90;
                        }
                    }
                    else {
                        iterator1 = iterator0;
                        v1 = v;
                        goto label_276;
                    }
                    goto label_181;
                }
                goto label_276;
            }
            catch(JSONException jSONException0) {
                flbj.d("LiMsgController", "failed to convert JSONObject to Message.", jSONException0);
                return gfqx.a;
            }
        }
        try {
        label_90:
            jSONObject4 = jSONObject3.getJSONObject("CONTENT");
        }
        catch(JSONException unused_ex) {
            iterator3 = iterator0;
            v3 = v;
            jSONObject5 = jSONObject2;
            goto label_164;
        }
        try {
            if(fmgc.a(jSONObject4.getInt("TYPE")).i()) {
                goto label_105;
            }
            else {
                gfsx3 = gfqx.a;
                iterator3 = iterator0;
                v3 = v;
                jSONObject5 = jSONObject2;
            }
            goto label_150;
        }
        catch(JSONException unused_ex) {
            iterator3 = iterator0;
            v3 = v;
            jSONObject5 = jSONObject2;
            goto label_148;
        }
        iterator3 = iterator0;
        v3 = v;
        jSONObject5 = jSONObject2;
        goto label_150;
    label_105:
        iterator3 = iterator0;
        try {
            jSONObject6 = jSONObject4.getJSONObject("DECORATION_CONTENT");
        }
        catch(JSONException unused_ex) {
            v3 = v;
            jSONObject5 = jSONObject2;
            goto label_148;
        }
        try {
            fmef0 = fmeg.a();
        }
        catch(JSONException jSONException2) {
            v3 = v;
            jSONObject5 = jSONObject2;
            goto label_141;
        }
        v3 = v;
        try {
            gfsx gfsx4 = fmhm.a(jSONObject6.getJSONObject("PROMPT_TEXT"));
            if(gfsx4.i()) {
                fmef0.a = (fmhm)gfsx4.d();
                jSONArray0 = jSONObject6.getJSONArray("BUTTONS");
                ggdy0 = new ggdy();
                goto label_129;
            }
            else {
                gfsx5 = gfqx.a;
                jSONObject5 = jSONObject2;
            }
            gfsx3 = gfsx5.i() ? gfsx.m(fmcl.a(((fmeg)gfsx5.d()))) : gfqx.a;
            goto label_150;
        }
        catch(JSONException jSONException2) {
        }
        jSONObject5 = jSONObject2;
        goto label_141;
    label_129:
        jSONObject5 = jSONObject2;
        try {
            for(int v4 = 0; v4 < jSONArray0.length(); ++v4) {
                gfsx gfsx6 = fmgt.b(jSONArray0.getJSONObject(v4));
                if(gfsx6.i()) {
                    ggdy0.i(gfsx6.d());
                }
            }
            fmef0.b(ggdy0.h());
            gfsx5 = gfsx.m(fmef0.a());
            gfsx3 = gfsx5.i() ? gfsx.m(fmcl.a(((fmeg)gfsx5.d()))) : gfqx.a;
            goto label_150;
        }
        catch(JSONException jSONException2) {
        }
        try {
        label_141:
            flbj.c("ButtonPrompt", "Failed to convert JSON ButtonPrompt".concat(jSONException2.toString()));
            gfsx5 = gfqx.a;
            gfsx3 = gfsx5.i() ? gfsx.m(fmcl.a(((fmeg)gfsx5.d()))) : gfqx.a;
            goto label_150;
        }
        catch(JSONException unused_ex) {
            try {
            label_148:
                flbj.c("MessageDecoration", "Couldn\'t convert JSON to Decoration Content.");
                gfsx3 = gfqx.a;
            label_150:
                if(gfsx3.i()) {
                    gfsx gfsx7 = fmgf.a(jSONObject3.getInt("RENDER_CRITERIA"));
                    if(gfsx7.i()) {
                        fmgb fmgb0 = new fmgb();
                        fmgb0.b = (fmgd)gfsx3.d();
                        fmgb0.b(jSONObject3.getString("DECORATION_ID"));
                        fmgb0.a = (fmgf)gfsx7.d();
                        gfsx8 = gfsx.m(fmgb0.a());
                    }
                    else {
                        gfsx8 = gfqx.a;
                    }
                }
                else {
                    flbj.c("MessageDecoration", "Couldn\'t convert JSON to Decoration content.");
                    gfsx8 = gfqx.a;
                }
                goto label_166;
            }
            catch(JSONException unused_ex) {
            }
        }
        try {
        label_164:
            flbj.c("MessageDecoration", "Couldn\'t convert JSON to Decoration.");
            gfsx8 = gfqx.a;
        label_166:
            if(gfsx8.i()) {
                ggek0.i(s1, gfsx8.d());
            }
            else {
                flbj.c("LiMsgController", "Failed to convert MessageDecoration from JSON.");
            }
            iterator0 = iterator3;
            v = v3;
            jSONObject2 = jSONObject5;
            goto label_86;
        label_174:
            iterator1 = iterator0;
            v1 = v;
            fmfm0.e = ggek0.b();
            iterator0 = iterator1;
            v = v1;
            goto label_4;
        label_181:
            if(s.equals("NEW_INTENDED_RENDERING_TYPE")) {
                fmfz fmfz1 = fmfz.a(jSONObject0.getInt("NEW_INTENDED_RENDERING_TYPE"));
                if(fmfz1 == fmfz.a) {
                    goto label_271;
                }
                else {
                    fmfm0.h(fmfz1.g);
                    v = 1;
                    goto label_4;
                }
            }
            iterator1 = iterator0;
            v1 = v;
            goto label_276;
        label_190:
            if(s.equals("CONVERSATION_ID")) {
                gfsx gfsx9 = ConversationId.f(jSONObject0.getJSONObject("CONVERSATION_ID"));
                if(!gfsx9.i()) {
                    flbj.c("LiMsgController", "failed to get conversationId when decoding message JSONObject.");
                    return gfqx.a;
                }
                fmfm0.e(((ConversationId)gfsx9.d()));
                goto label_271;
            }
            else {
                iterator1 = iterator0;
                v1 = v;
                goto label_276;
            }
        label_200:
            if(s.equals("MESSAGE_CONTENT")) {
                jSONObject7 = jSONObject0.getJSONObject("MESSAGE_CONTENT");
                goto label_202;
            }
            else {
                iterator1 = iterator0;
                v1 = v;
                goto label_276;
            }
            goto label_239;
        }
        catch(JSONException jSONException0) {
            flbj.d("LiMsgController", "failed to convert JSONObject to Message.", jSONException0);
            return gfqx.a;
        }
        try {
        label_202:
            int v5 = fmfn.b(jSONObject7.getInt("TYPE")) - 1;
            switch(v5) {
                case 0: {
                    gfsx10 = gfsx.m(fmcs.d(ByteString.b));
                    goto label_231;
                }
                case 1: {
                    gfsx10 = gfsx.m(fmcs.c(jSONObject7.getString("TEXT")));
                    goto label_231;
                }
                case 2: {
                    JSONObject jSONObject8 = jSONObject7.getJSONObject("CUSTOM");
                    Map map0 = this.n;
                    if(map0.containsKey(jSONObject8.getString("TYPE"))) {
                        gfsx gfsx12 = ((flws)map0.get(jSONObject8.getString("TYPE"))).a().b(jSONObject8);
                        gfsx10 = gfsx12.i() ? gfsx.m(fmcs.a(((fmfp)gfsx12.d()))) : gfqx.a;
                    }
                    else {
                        flbj.c("LiMsgController", "failed to convert JSONObject to MessageContent without handler");
                        gfsx10 = gfqx.a;
                    }
                    goto label_231;
                }
                default: {
                    if(v5 == 3) {
                        gfsx gfsx11 = fmhm.a(jSONObject7.getJSONObject("RICH_TEXT"));
                        gfsx10 = gfsx11.i() ? gfsx.m(fmcs.b(((fmhm)gfsx11.d()))) : gfqx.a;
                    }
                    else {
                        gfsx10 = gfsx.m(fmcm.a);
                    }
                    goto label_231;
                }
            }
        }
        catch(JSONException unused_ex) {
            try {
                flbj.c("LiMsgController", "failed to convert JSONObject to MessageContent");
                gfsx10 = gfqx.a;
            label_231:
                if(!gfsx10.i()) {
                    flbj.c("LiMsgController", "failed to get message content when decoding message JSONObject.");
                    return gfqx.a;
                }
                fmfm0.b = (fmfr)gfsx10.d();
                goto label_271;
            label_239:
                if(s.equals("MESSAGE_TYPE")) {
                    fmfm0.f = fmfu.a(jSONObject0.getInt("MESSAGE_TYPE"));
                    goto label_271;
                }
                else {
                    iterator1 = iterator0;
                    v1 = v;
                    goto label_276;
                }
            label_245:
                if(s.equals("SERVER_TIMESTAMP_US")) {
                    fmfm0.m(jSONObject0.getLong("SERVER_TIMESTAMP_US"));
                    goto label_271;
                }
                else {
                    iterator1 = iterator0;
                    v1 = v;
                    goto label_276;
                }
            label_251:
                if(s.equals("MESSAGE_STATUS")) {
                    fmfm0.k(fmft.a(jSONObject0.getInt("MESSAGE_STATUS")));
                    goto label_271;
                }
                else {
                    iterator1 = iterator0;
                    v1 = v;
                    goto label_276;
                }
            label_257:
                if(s.equals("FALLBACK")) {
                    fmfm0.f(jSONObject0.getString("FALLBACK"));
                    goto label_271;
                }
                else {
                    iterator1 = iterator0;
                    v1 = v;
                    goto label_276;
                }
            label_263:
                if(s.equals("FILTERABLE_FLAGS")) {
                    fmfm0.g(jSONObject0.getInt("FILTERABLE_FLAGS"));
                    goto label_271;
                }
                else {
                    iterator1 = iterator0;
                    v1 = v;
                    goto label_276;
                }
            label_269:
                if(s.equals("ACTIVE_DECORATION_IDS")) {
                    fmfm0.b(flbp.a(jSONObject0.getJSONArray(s)));
                label_271:
                    iterator1 = iterator0;
                    v1 = v;
                    iterator0 = iterator1;
                    v = v1;
                    goto label_4;
                }
                else {
                    iterator1 = iterator0;
                    v1 = v;
                }
            label_276:
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfrn.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hfrn)hftp0.b_message).b = "type.googleapis.com/google.protobuf.StringValue";
                ByteString hfsf0 = hfwi.b(jSONObject0.getString(s)).getDefaultInstanceForType();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hfrn)hftp0.b_message).c = hfsf0;
                hashMap0.put(s, ((hfrn)hftp0.N_build()).getDefaultInstanceForType());
                iterator0 = iterator1;
                v = v1;
                goto label_4;
            }
            catch(JSONException jSONException0) {
            }
        }
        flbj.d("LiMsgController", "failed to convert JSONObject to Message.", jSONException0);
        return gfqx.a;
    }

    public final gfsx l(fmga fmga0) {
        ProtoLiteMessage hftv1;
        hfsl hfsl1;
        ProtoLiteMessage hftv0;
        hfsl hfsl0;
        hftc hftc0;
        gfsx gfsx8;
        JSONObject jSONObject2;
        fmfx fmfx0;
        gfsx gfsx4;
        fmfr fmfr0;
        JSONObject jSONObject0;
        flbj.a("LiMsgController", "encode message ");
        try {
            jSONObject0 = new JSONObject();
            jSONObject0.put("MESSAGE_ID", fmga0.a);
            int v = fmga0.r - 1;
            if(fmga0.r == 0) {
                throw null;
            }
            jSONObject0.put("MESSAGE_TYPE", v);
            jSONObject0.put("CAPABILITY", fmga0.j);
            gfsx gfsx0 = fmga0.b.g();
            if(!gfsx0.i()) {
                return gfqx.a;
            }
            jSONObject0.put("SENDER", gfsx0.d());
            gfsx gfsx1 = fmga0.c.g();
            if(!gfsx1.i()) {
                return gfqx.a;
            }
            jSONObject0.put("CONVERSATION_ID", gfsx1.d());
            jSONObject0.put("SERVER_TIMESTAMP_US", fmga0.d);
            gfsx gfsx2 = fmga0.e;
            if(gfsx2.i()) {
                jSONObject0.put("FALLBACK", gfsx2.d());
            }
            fmfr0 = fmga0.f;
            flbj.a("LiMsgController", "encode message content");
        }
        catch(JSONException unused_ex) {
            flbj.c("LiMsgController", "failed to convert JSONObject to Message");
            return gfqx.a;
        }
        try {
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("TYPE", fmfr0.a() - 1);
            flbj.a("LiMsgController", "message content type is " + fmfn.a(fmfr0.a()));
            int v1 = fmfr0.a() - 1;
            switch(v1) {
                case 1: {
                    jSONObject1.put("TEXT", fmfr0.d());
                    flbj.a("LiMsgController", "return message content json optional back");
                    gfsx4 = gfsx.m(jSONObject1);
                    goto label_52;
                }
                case 2: {
                    Map map0 = this.n;
                    if(map0.containsKey(fmfr0.b().a)) {
                        gfsx gfsx5 = ((flws)map0.get(fmfr0.b().a)).a().c(fmfr0.b());
                        if(gfsx5.i()) {
                            jSONObject1.put("CUSTOM", gfsx5.d());
                            flbj.a("LiMsgController", "return message content json optional back");
                            gfsx4 = gfsx.m(jSONObject1);
                        }
                        else {
                            flbj.c("LiMsgController", "failed to encode message content");
                            gfsx4 = gfqx.a;
                        }
                    }
                    else {
                        flbj.c("LiMsgController", "failed to convert MessageContent to JSONObject without handler");
                        gfsx4 = gfqx.a;
                    }
                    goto label_52;
                }
                default: {
                    if(v1 == 3) {
                        gfsx gfsx3 = fmfr0.c().b();
                        if(gfsx3.i()) {
                            jSONObject1.put("RICH_TEXT", gfsx3.d());
                            flbj.a("LiMsgController", "return message content json optional back");
                            gfsx4 = gfsx.m(jSONObject1);
                        }
                        else {
                            gfsx4 = gfqx.a;
                        }
                    }
                    else {
                        flbj.a("LiMsgController", "return message content json optional back");
                        gfsx4 = gfsx.m(jSONObject1);
                    }
                    goto label_52;
                }
            }
        }
        catch(JSONException unused_ex) {
            try {
                flbj.c("LiMsgController", "failed to convert MessageContent to JSONObject");
                gfsx4 = gfqx.a;
            label_52:
                if(!gfsx4.i()) {
                    flbj.c("LiMsgController", "message content is empty");
                    return gfqx.a;
                }
                jSONObject0.put("MESSAGE_CONTENT", gfsx4.d());
                jSONObject0.put("MESSAGE_STATUS", fmga0.g.o);
                gfsx gfsx6 = fmga0.h;
                if(gfsx6.i()) {
                    jSONObject0.put("SNIPPET", gfsx6.d());
                }
                fmfx0 = fmga0.k;
                jSONObject2 = new JSONObject();
            }
            catch(JSONException unused_ex) {
                flbj.c("LiMsgController", "failed to convert JSONObject to Message");
                return gfqx.a;
            }
        }
        try {
            jSONObject2.put("TYPE", fmfx0.a().g);
            if(fmfx0.a().ordinal() == 2) {
                gfsx gfsx7 = fmfx0.b().c();
                if(gfsx7.i()) {
                    jSONObject2.put("OVERLAY", gfsx7.d());
                    goto label_75;
                }
                else {
                    flbj.c("Message", "Failed to convert overlay to JSONObject in rendering details");
                    gfsx8 = gfqx.a;
                }
            }
            else {
                goto label_75;
            }
            goto label_76;
        }
        catch(JSONException jSONException0) {
            try {
                flbj.d("Message", "failed to convert RenderingDetails to JSONObject.", jSONException0);
                gfsx8 = gfqx.a;
                goto label_76;
            label_75:
                gfsx8 = gfsx.m(jSONObject2);
            label_76:
                if(!gfsx8.i()) {
                    flbj.c("LiMsgController", "rendering detail is empty");
                    return gfqx.a;
                }
                jSONObject0.put("RENDERING_DETAILS", gfsx8.d());
                ggeo ggeo0 = fmga0.i;
                if(ggeo0.isEmpty()) {
                    goto label_84;
                }
                ggqj ggqj0 = ggeo0.w().om();
                while(true) {
                    if(!ggqj0.hasNext()) {
                    label_84:
                        jSONObject0.put("NEW_INTENDED_RENDERING_TYPE", fmga0.l);
                        jSONObject0.put("INTENDED_RENDERING_TYPE", fmga0.l);
                        jSONObject0.put("FILTERABLE_FLAGS", fmga0.m);
                        gfsx gfsx9 = fmga0.o;
                        if(gfsx9.i()) {
                            jSONObject0.put("FEATURE_TYPE", ((fmfq)gfsx9.d()).d);
                        }
                        flbj.a("LiMsgController", "return message JSON Optional back");
                        return gfsx.m(jSONObject0);
                    }
                    Object object0 = ggqj0.next();
                    String s = (String)object0;
                    try {
                        ByteString hfsf0 = (ByteString)ggeo0.get(s);
                        hftc0 = hftc.a();
                        hfsl0 = hfsf0.k();
                        hftv0 = ((ProtoLiteMessage)hfrn.a).x_newMutableInstance();
                    }
                    catch(IllegalArgumentException | hfur unused_ex) {
                        continue;
                    }
                    try {
                        hfwc hfwc0 = hfvu.a.c(hftv0);
                        hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                        hfwc0.g(hftv0);
                        goto label_121;
                    }
                    catch(hfur hfur0) {
                    }
                    catch(hfwr hfwr0) {
                        goto label_108;
                    }
                    catch(IOException iOException0) {
                        goto label_112;
                    }
                    catch(RuntimeException runtimeException0) {
                        goto label_118;
                    }
                    try {
                        if(hfur0.b) {
                            hfur0 = new hfur(hfur0);
                        }
                        hfur0.a = hftv0;
                        throw hfur0;
                    label_108:
                        hfur hfur1 = hfwr0.a();
                        hfur1.a = hftv0;
                        throw hfur1;
                    label_112:
                        if((iOException0.getCause() instanceof hfur)) {
                            throw (hfur)iOException0.getCause();
                        }
                        hfur hfur2 = new hfur(iOException0);
                        hfur2.a = hftv0;
                        throw hfur2;
                    label_118:
                        if((runtimeException0.getCause() instanceof hfur)) {
                            throw (hfur)runtimeException0.getCause();
                        }
                        throw runtimeException0;
                    }
                    catch(IllegalArgumentException | hfur unused_ex) {
                        continue;
                    }
                    try {
                    label_121:
                        hfsl0.z(0);
                        goto label_126;
                    }
                    catch(hfur hfur3) {
                    }
                    catch(IllegalArgumentException unused_ex) {
                        continue;
                    }
                    try {
                        hfur3.a = hftv0;
                        throw hfur3;
                    label_126:
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        hfsl1 = ((hfrn)hftv0).c.k();
                        hftv1 = ((ProtoLiteMessage)hfwi.a).x_newMutableInstance();
                    }
                    catch(IllegalArgumentException | hfur unused_ex) {
                        continue;
                    }
                    try {
                        hfwc hfwc1 = hfvu.a.c(hftv1);
                        hfwc1.l(hftv1, hfsm.p(hfsl1), hftc.a);
                        hfwc1.g(hftv1);
                        goto label_152;
                    }
                    catch(hfur hfur4) {
                    }
                    catch(hfwr hfwr1) {
                        goto label_139;
                    }
                    catch(IOException iOException1) {
                        goto label_143;
                    }
                    catch(RuntimeException runtimeException1) {
                        goto label_149;
                    }
                    try {
                        if(hfur4.b) {
                            hfur4 = new hfur(hfur4);
                        }
                        hfur4.a = hftv1;
                        throw hfur4;
                    label_139:
                        hfur hfur5 = hfwr1.a();
                        hfur5.a = hftv1;
                        throw hfur5;
                    label_143:
                        if((iOException1.getCause() instanceof hfur)) {
                            throw (hfur)iOException1.getCause();
                        }
                        hfur hfur6 = new hfur(iOException1);
                        hfur6.a = hftv1;
                        throw hfur6;
                    label_149:
                        if((runtimeException1.getCause() instanceof hfur)) {
                            throw (hfur)runtimeException1.getCause();
                        }
                        throw runtimeException1;
                    }
                    catch(IllegalArgumentException | hfur unused_ex) {
                        continue;
                    }
                    try {
                    label_152:
                        hfsl1.z(0);
                        goto label_157;
                    }
                    catch(hfur hfur7) {
                    }
                    catch(IllegalArgumentException unused_ex) {
                        continue;
                    }
                    try {
                        hfur7.a = hftv1;
                        throw hfur7;
                    label_157:
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        jSONObject0.put(s, ((hfwi)hftv1).b);
                    }
                    catch(IllegalArgumentException | hfur unused_ex) {
                    }
                }
            }
            catch(JSONException unused_ex) {
            }
        }
        flbj.c("LiMsgController", "failed to convert JSONObject to Message");
        return gfqx.a;
    }

    public final gfsx m(AccountContext accountContext0, String s) {
        return this.r.a(accountContext0, s);
    }

    public final gmcd n(AccountContext accountContext0, ConversationId conversationId0) {
        gmcd gmcd0 = gmbu.n(new flgt(this, accountContext0, conversationId0), this.b);
        return gmbu.b(new gmcd[]{gmcd0}).a(new flgu(this, gmcd0, accountContext0, conversationId0), this.b);
    }

    public final gmcd o(AccountContext accountContext0, fmev fmev0) {
        gmcd gmcd0;
        gmcd gmcd1;
        gfsx gfsx0 = fmev0.c;
        if(gfsx0.i()) {
            ConversationId conversationId0 = fmev0.a;
            Pair pair0 = Pair.create(accountContext0, Pair.create(conversationId0, gfsx0.d()));
            synchronized(this.h) {
                Map map0 = this.l;
                gmcd0 = (gmcd)map0.get(pair0);
                if(gmcd0 == null) {
                    fmai fmai0 = fmaj.a();
                    fmai0.g(37);
                    fmai0.n(accountContext0.c().f());
                    fmai0.o(accountContext0.d().toStringUtf8());
                    fmai0.d(conversationId0);
                    fmaj fmaj0 = fmai0.a();
                    this.e.b(fmaj0);
                    if(gfsx0.i()) {
                        String s = (String)gfsx0.d();
                        flcl flcl0 = new flcl(this.a, this.x, s);
                        gmcd gmcd2 = this.b.e(flcl0);
                        gmbu.t(gmcd2, new flir(this, accountContext0, fmev0), gmap.a);
                        gmcd1 = glzd.f(gmcd2, new flgs(this, fmev0, accountContext0), gmap.a);
                    }
                    else {
                        gmcd1 = gmbu.i(fmev0);
                    }
                    gmcd0 = gmcd1;
                    map0.put(pair0, gmcd0);
                    gmcd0.hB(new flic(this, pair0), gmap.a);
                }
                else {
                    flbj.a("LiMsgController", "conversationSync or conversationImageFetch already pending for conversation");
                }
            }
            return gmcd0;
        }
        return gmbu.i(fmev0);
    }

    public final gmcd p(AccountContext accountContext0, ConversationId conversationId0) {
        fmpa fmpa0;
        synchronized(this) {
            Pair pair0 = Pair.create(accountContext0, conversationId0);
            fmpa0 = this.o == null ? null : ((fmpa)this.o.get(pair0));
            if(fmpa0 == null) {
                fmpa0 = this.f(accountContext0, conversationId0);
                LruCache lruCache0 = this.o;
                if(lruCache0 != null) {
                    lruCache0.put(pair0, fmpa0);
                }
            }
        }
        gmcd gmcd0 = new gmcu();
        Objects.requireNonNull(gmcd0);
        fmpa0.k(new flgi(((gmcu)gmcd0)));
        return gmcd0;
    }

    public final gmcd q(AccountContext accountContext0, fmga[] arr_fmga) {
        flfz flfz0 = new flfz(this, accountContext0, arr_fmga);
        return this.b.e(flfz0);
    }

    final gmcd r(AccountContext accountContext0, ConversationId conversationId0) {
        gmcd gmcd0 = new gmcu();
        this.d.b(accountContext0).as(conversationId0, 1, fmfz.e).k(new flgn(((gmcu)gmcd0)));
        return gmcd0;
    }

    public final gmcd s(AccountContext accountContext0, fmga fmga0) {
        return this.t(accountContext0, fmga0, true);
    }

    public final gmcd t(AccountContext accountContext0, fmga fmga0, boolean z) {
        gmcd gmcd0 = new gmcu();
        flig flig0 = new flig(this, fmga0, z, accountContext0, ((gmcu)gmcd0));
        this.c.execute(flig0);
        return gmcd0;
    }

    public final gmcd u(AccountContext accountContext0, ConversationId conversationId0, fmbc fmbc0, String s, gfsx gfsx0, gfsx gfsx1) {
        return glzd.g(this.p(accountContext0, conversationId0), new flgh(this, accountContext0, conversationId0, fmbc0, s, gfsx0, gfsx1), this.b);
    }

    public final gmcd v(AccountContext accountContext0, fmev fmev0, boolean z) {
        gmcd gmcd0;
        synchronized(this.g) {
            Pair pair0 = Pair.create(accountContext0, fmev0.a);
            Map map0 = this.k;
            gmcd0 = (gmcd)map0.get(pair0);
            if(gmcd0 == null) {
                flqv flqv0 = flqw.a();
                flqv0.a = "sync conversation profile";
                flqv0.b(flra.c);
                gmcd gmcd1 = gmbu.n(new flhz(this, accountContext0, fmev0, flqv0.a()), this.b);
                gmcd gmcd2 = gmbu.b(new gmcd[]{gmcd1}).a(new flia(this, accountContext0, fmev0, gmcd1), gmap.a);
                map0.put(pair0, gmcd2);
                gmcd2.hB(new flha(this, pair0), gmap.a);
                gmcd0 = gmcd2;
            }
        }
        return glzd.g(gmcd0, new flhb(this, fmev0, accountContext0, z), gmap.a);
    }

    public final void w(AccountContext accountContext0, ConversationId conversationId0, fltq fltq0) {
        this.d(accountContext0).p(conversationId0).k(new flga(this, accountContext0, conversationId0, fltq0));
    }

    public final void x(AccountContext accountContext0, ConversationId conversationId0) {
        flgo flgo0 = new flgo(this, accountContext0, conversationId0);
        this.b.d(flgo0);
        for(Object object0: this.n.values()) {
            ((flws)object0).g(conversationId0);
        }
    }

    public final void y() {
        synchronized(this) {
            if(!this.y.isEmpty()) {
                for(Object object0: this.y) {
                    this.b(((AccountContext)object0)).n();
                }
            }
        }
    }

    public final void z(fmga fmga0, boolean z) {
        fmai fmai0 = fmaj.a();
        fmai0.g((z ? 59 : 60));
        fmai0.p(fmga0.a);
        fmai0.d(fmga0.c);
        fmaj fmaj0 = fmai0.a();
        this.e.b(fmaj0);
    }
}

