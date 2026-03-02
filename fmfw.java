import org.json.JSONException;
import org.json.JSONObject;

public final class fmfw {
    public final gfsx a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final gfsx i;
    public final int j;

    public fmfw() {
        throw null;
    }

    public fmfw(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3, int v, boolean z, boolean z1, boolean z2, gfsx gfsx4, int v1) {
        this.a = gfsx0;
        this.b = gfsx1;
        this.c = gfsx2;
        this.d = gfsx3;
        this.e = v;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = gfsx4;
        this.j = v1;
    }

    public static fmfv a() {
        fmfv fmfv0 = new fmfv(null);
        fmfv0.g(false);
        fmfv0.c(false);
        fmfv0.h(false);
        return fmfv0;
    }

    public static gfsx b(JSONObject jSONObject0) {
        fmfv fmfv0 = fmfw.a();
        try {
            fmfv0.j(jSONObject0.getInt("OVERLAY_STYLE"));
            fmfv0.k(jSONObject0.getInt("time_to_live_sec"));
            if(jSONObject0.has("dismiss_action")) {
                gfsx gfsx0 = fmbi.d(jSONObject0.getJSONObject("dismiss_action"));
                if(!gfsx0.i()) {
                    flbj.c("Message", "Failed to get dismiss action from JSONObject in Overlay.");
                    return gfqx.a;
                }
                fmfv0.b(((fmbi)gfsx0.d()));
            }
            if(jSONObject0.has("overlay_lighter_icon")) {
                gfsx gfsx1 = fmfh.c(jSONObject0.getJSONObject("overlay_lighter_icon"));
                if(!gfsx1.i()) {
                    flbj.c("Message", "Failed to get lighter icon from JSONObject in Overlay.");
                    return gfqx.a;
                }
                fmfv0.i(((fmfh)gfsx1.d()));
            }
            if(jSONObject0.has("display_text")) {
                fmfv0.e(jSONObject0.getString("display_text"));
            }
            if(jSONObject0.has("OVERLAY_EXPIRETIME_STAMP")) {
                fmfv0.f(jSONObject0.getInt("OVERLAY_EXPIRETIME_STAMP"));
            }
            if(jSONObject0.has("display_icon")) {
                fmfv0.d(flbm.c(jSONObject0.optString("display_icon")));
            }
            if(jSONObject0.has("hide_snippet_in_conversation_list")) {
                fmfv0.h(jSONObject0.optBoolean("hide_snippet_in_conversation_list"));
            }
            if(jSONObject0.has("hide_dismiss_button")) {
                fmfv0.g(jSONObject0.optBoolean("hide_dismiss_button"));
            }
            if(jSONObject0.has("dismissible_by_tapping_outside")) {
                fmfv0.c(jSONObject0.optBoolean("dismissible_by_tapping_outside"));
            }
            return gfsx.m(fmfv0.a());
        }
        catch(JSONException jSONException0) {
            flbj.d("Message", "Failed to decode Overlay", jSONException0);
            return gfqx.a;
        }
    }

    public final gfsx c() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            gfsx gfsx0 = this.a;
            if(gfsx0.i()) {
                gfsx gfsx1 = ((fmbi)gfsx0.d()).e();
                if(!gfsx1.i()) {
                    flbj.c("Message", "Failed to convert dismiss action to JSONObject in Overlay.");
                    return gfqx.a;
                }
                jSONObject0.put("dismiss_action", gfsx1.d());
            }
            gfsx gfsx2 = this.c;
            if(gfsx2.i()) {
                gfsx gfsx3 = ((fmfh)gfsx2.d()).d();
                if(!gfsx3.i()) {
                    flbj.c("Message", "Failed to convert lighter icon to JSONObject in Overlay.");
                    return gfqx.a;
                }
                jSONObject0.put("overlay_lighter_icon", gfsx3.d());
            }
            gfsx gfsx4 = this.d;
            if(gfsx4.i()) {
                jSONObject0.put("display_text", gfsx4.d());
            }
            jSONObject0.put("time_to_live_sec", this.e);
            gfsx gfsx5 = this.i;
            if(gfsx5.i()) {
                jSONObject0.put("OVERLAY_EXPIRETIME_STAMP", gfsx5.d());
            }
            jSONObject0.put("OVERLAY_STYLE", this.j);
            gfsx gfsx6 = this.b;
            if(gfsx6.i()) {
                jSONObject0.putOpt("display_icon", flbm.e(((ByteString)gfsx6.d())));
            }
            jSONObject0.putOpt("hide_snippet_in_conversation_list", Boolean.valueOf(this.f));
            jSONObject0.putOpt("hide_dismiss_button", Boolean.valueOf(this.g));
            jSONObject0.putOpt("dismissible_by_tapping_outside", Boolean.valueOf(this.h));
            return gfsx.m(jSONObject0);
        }
        catch(JSONException jSONException0) {
            flbj.d("Message", "Failed to encode Overlay", jSONException0);
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmfw) && this.a.equals(((fmfw)object0).a) && this.b.equals(((fmfw)object0).b) && this.c.equals(((fmfw)object0).c) && this.d.equals(((fmfw)object0).d) && this.e == ((fmfw)object0).e && this.f == ((fmfw)object0).f && this.g == ((fmfw)object0).g && this.h == ((fmfw)object0).h && this.i.equals(((fmfw)object0).i) && this.j == ((fmfw)object0).j;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = ((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ (this.f ? 0x4CF : 0x4D5)) * 1000003;
        int v2 = this.g ? 0x4CF : 0x4D5;
        if(this.h) {
            v = 0x4CF;
        }
        return this.j ^ (((v1 ^ v2) * 1000003 ^ v) * 1000003 ^ this.i.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "Overlay{dismissAction=" + this.a + ", displayIcon=" + this.b + ", lighterIcon=" + this.c + ", displayText=" + this.d + ", timeToLiveSec=" + this.e + ", hideSnippetInConversationList=" + this.f + ", hideDismissButton=" + this.g + ", dismissibleByTappingOutside=" + this.h + ", expireTimeStamp=" + this.i + ", overlayStyle=" + this.j + "}";
    }
}

