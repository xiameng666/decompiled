import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmev {
    public final ConversationId a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final boolean e;
    public final long f;
    public final long g;
    public final boolean h;
    public final Map i;
    public final gfsx j;
    public final gged_interceptors k;
    public final long l;
    public final long m;
    public final ByteString n;
    public final long o;
    public final long p;

    public fmev() {
        throw null;
    }

    public fmev(ConversationId conversationId0, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, boolean z, long v, long v1, boolean z1, Map map0, gfsx gfsx3, gged_interceptors gged0, long v2, long v3, ByteString hfsf0, long v4, long v5) {
        this.a = conversationId0;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = gfsx2;
        this.e = z;
        this.f = v;
        this.g = v1;
        this.h = z1;
        this.i = map0;
        this.j = gfsx3;
        this.k = gged0;
        this.l = v2;
        this.m = v3;
        this.n = hfsf0;
        this.o = v4;
        this.p = v5;
    }

    public static fmeu a() {
        fmeu fmeu0 = new fmeu(null);
        fmeu0.l(false);
        fmeu0.d(gged_interceptors.l(Integer.valueOf(200)));
        fmeu0.o(-1L);
        fmeu0.m(0L);
        fmeu0.b(new HashMap());
        fmeu0.p(0L);
        fmeu0.e(ByteString.b);
        fmeu0.h(0L);
        fmeu0.n(0L);
        return fmeu0;
    }

    public final gfsx b() {
        gfsx gfsx9;
        gfsx gfsx8;
        try {
            JSONObject jSONObject0 = new JSONObject();
            gfsx gfsx0 = this.a.g();
            if(!gfsx0.i()) {
                return gfqx.a;
            }
            jSONObject0.put("CONVERSATION_ID", gfsx0.d());
            gfsx gfsx1 = this.b;
            if(gfsx1.i()) {
                jSONObject0.put("TITLE", gfsx1.d());
            }
            gfsx gfsx2 = this.c;
            if(gfsx2.i()) {
                jSONObject0.put("IMAGE_URL", gfsx2.d());
            }
            gfsx gfsx3 = this.d;
            if(gfsx3.i()) {
                jSONObject0.put("IMAGE", flbm.f(flbm.j(((Bitmap)gfsx3.d()))));
            }
            jSONObject0.put("IS_IMAGE_STALE", this.e);
            jSONObject0.put("EXPIRATION_TIME_MILLIS", this.f);
            JSONObject jSONObject1 = new JSONObject();
            Map map0 = this.i;
            for(Object object0: map0.keySet()) {
                jSONObject1.put(((String)object0), flbm.f(((byte[])map0.get(((String)object0)))));
            }
            jSONObject0.put("APP_DATA", jSONObject1);
            gfsx gfsx4 = this.j;
            if(gfsx4.i()) {
                Object object1 = gfsx4.d();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("ID", ((fmhr)object1).b);
                    jSONObject2.put("MESSAGE_ID", ((fmhr)object1).c);
                    jSONObject2.put("RENDER_STYLE", ((fmhr)object1).e);
                    JSONArray jSONArray0 = new JSONArray();
                    ggqk ggqk0 = ((fmhr)object1).d.E();
                    while(ggqk0.hasNext()) {
                        Object object2 = ggqk0.next();
                        fmhp fmhp0 = (fmhp)object2;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("ID", fmhp0.b);
                            jSONObject3.put("TEXT", fmhp0.c);
                            gfsx gfsx5 = fmhp0.e.e();
                            if(gfsx5.i()) {
                                jSONObject3.put("ACTION", gfsx5.d());
                                gfsx gfsx6 = fmhp0.d;
                                if(gfsx6.i()) {
                                    gfsx gfsx7 = ((fmfh)gfsx6.d()).d();
                                    if(gfsx7.i()) {
                                        jSONObject3.put("LIGHTER_ICON", gfsx7.d());
                                    }
                                }
                                jSONObject3.put("SECONDARY_TEXT", fmhp0.f);
                                gfsx8 = gfsx.m(jSONObject3);
                            }
                            else {
                                flbj.c("fmhp", "failed to convert Suggestion to JSONObject");
                                gfsx8 = gfqx.a;
                            }
                        }
                        catch(JSONException jSONException0) {
                            flbj.d("fmhp", "failed to convert Suggestion to JSONObject", jSONException0);
                            gfsx8 = gfqx.a;
                        }
                        if(gfsx8.i()) {
                            jSONArray0.put(gfsx8.d());
                            continue;
                        }
                        gfsx9 = gfqx.a;
                        goto label_67;
                    }
                    jSONObject2.put("SUGGESTIONS", jSONArray0);
                    jSONObject2.put("HINT_TEXT", ((fmhr)object1).f);
                    gfsx9 = gfsx.m(jSONObject2);
                }
                catch(JSONException unused_ex) {
                    flbj.c("fmhr", "failed to convert SuggestionList to JSONObject");
                    gfsx9 = gfqx.a;
                }
            label_67:
                if(gfsx9.i()) {
                    jSONObject0.put("SUGGESTION_LIST", gfsx9.d());
                }
                else {
                    flbj.c("Conversation", "failed to convert SuggestionList to JSONObject");
                }
            }
            jSONObject0.put("BLOCKABLE", this.h);
            JSONArray jSONArray1 = new JSONArray();
            ggqk ggqk1 = this.k.E();
            while(ggqk1.hasNext()) {
                Object object3 = ggqk1.next();
                jSONArray1.put(((Integer)object3).intValue());
            }
            jSONObject0.put("CAPABILITIES", jSONArray1);
            jSONObject0.put("PROPERTIES_EXPIRATION_TIME_MS", this.l);
            jSONObject0.put("SERVER_TIMESTAMP_US", this.m);
            jSONObject0.put("CREATED_TIMESTAMP_MS", this.o);
            jSONObject0.put("LOCAL_UPDATE_TIMESTAMP_MS", this.p);
            return gfsx.m(jSONObject0);
        }
        catch(JSONException unused_ex) {
            flbj.c("Conversation", "failed to convert Conversation to JSONObject");
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fmev) && this.a.equals(((fmev)object0).a) && this.b.equals(((fmev)object0).b) && this.c.equals(((fmev)object0).c)) {
            gfsx gfsx0 = ((fmev)object0).d;
            return this.d.i() == gfsx0.i() && (!this.d.i() || !gfsx0.i() || ((Bitmap)this.d.d()).sameAs(((Bitmap)gfsx0.d()))) && this.e == ((fmev)object0).e && this.f == ((fmev)object0).f && this.h == ((fmev)object0).h && (this.i.keySet().equals(((fmev)object0).i.keySet()) && this.j.equals(((fmev)object0).j) && ggch.j(this.i.keySet()).r(new fmet(this, ((fmev)object0))) && ggia.i(this.k, ((fmev)object0).k) && this.l == ((fmev)object0).l && this.m == ((fmev)object0).m && this.n.equals(((fmev)object0).n) && this.o == ((fmev)object0).o);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = this.d.i() ? 0x4CF : 0x4D5;
        Map map0 = this.i;
        int v2 = map0.keySet().hashCode();
        int v3 = ((((((this.a.hashCode() + 0x20F) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + v1) * 0x1F + (this.e ? 0x4CF : 0x4D5)) * 0x1F + fmes.a(this.f)) * 0x1F;
        if(this.h) {
            v = 0x4CF;
        }
        int v4 = ((v3 + v) * 0x1F + v2) * 0x1F + this.j.hashCode();
        for(Object object0: map0.values()) {
            v4 = v4 * 0x1F + Arrays.hashCode(((byte[])object0));
        }
        return (((((v4 * 0x1F + this.k.hashCode()) * 0x1F + fmes.a(this.l)) * 0x1F + fmes.a(this.m)) * 0x1F + this.n.hashCode()) * 0x1F + fmes.a(this.o)) * 0x1F + fmes.a(this.p);
    }

    @Override
    public final String toString() {
        return "Conversation{conversationId=" + this.a + ", title=" + this.b + ", imageUrl=" + this.c + ", image=" + this.d + ", isImageStale=" + this.e + ", expirationTimeMillis=" + this.f + ", lastDeletedTimeMillis=" + this.g + ", blockable=" + this.h + ", appData=" + this.i + ", suggestionList=" + this.j + ", capabilities=" + this.k + ", propertiesExpirationTimeMillis=" + this.l + ", serverTimestampUs=" + this.m + ", conversationContext=" + this.n + ", createdTimestampMs=" + this.o + ", localUpdateTimestampMs=" + this.p + "}";
    }
}

