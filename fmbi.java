import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmbi {
    public final gfsx a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final long e;
    public final fmaz f;
    public final fmaz g;

    public fmbi() {
        throw null;
    }

    public fmbi(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3, long v, fmaz fmaz0, fmaz fmaz1) {
        this.a = gfsx0;
        this.b = gfsx1;
        this.c = gfsx2;
        this.d = gfsx3;
        this.e = v;
        this.f = fmaz0;
        this.g = fmaz1;
    }

    public final fmba a() {
        return this.f.a();
    }

    public final fmba b() {
        return this.g.a();
    }

    public static fmbb c() {
        fmbb fmbb0 = new fmbb(null);
        fmbb0.b(0L);
        fmbb0.q();
        return fmbb0;
    }

    public static gfsx d(JSONObject jSONObject0) {
        gfsx gfsx9;
        gfsx gfsx8;
        gfsx gfsx7;
        gfsx gfsx5;
        if(!jSONObject0.has("ACTION_TYPE")) {
            flbj.c("Action", "failed to convert JSONObject to Action, missing necessary properties");
            return gfqx.a;
        }
        fmbb fmbb0 = fmbi.c();
        try {
            fmbb0.b(jSONObject0.getLong("ACTION_TRIGGERED_LOG_ID"));
            if(jSONObject0.has("TRACE_ID")) {
                fmbb0.m(jSONObject0.getString("TRACE_ID"));
            }
            if(jSONObject0.has("MESSAGE_ID")) {
                fmbb0.i(jSONObject0.getString("MESSAGE_ID"));
            }
            if(jSONObject0.has("EVENT_CALLBACK_PAYLOAD")) {
                fmbb0.h(jSONObject0.getString("EVENT_CALLBACK_PAYLOAD"));
            }
            if(jSONObject0.has("EVENT_CALLBACK_DESTINATION")) {
                gfsx gfsx0 = fmbc.c(jSONObject0.getJSONObject("EVENT_CALLBACK_DESTINATION"));
                if(gfsx0.i()) {
                    fmbb0.f(((fmbc)gfsx0.d()));
                }
            }
            switch(fmba.b(jSONObject0.getString("ACTION_TYPE")).ordinal()) {
                case 0: {
                    flbj.c("Action", "failed to convert JSONObject to Action encounter UNKNOWN Action type");
                    return gfqx.a;
                }
                case 1: {
                    gfsx gfsx1 = fmbh.a(jSONObject0.getJSONObject("ACTION_PAYLOAD"));
                    if(gfsx1.i()) {
                        fmbb0.k(((fmbh)gfsx1.d()));
                    }
                    break;
                }
                case 2: {
                    gfsx gfsx2 = fmbh.a(jSONObject0.getJSONObject("ACTION_PAYLOAD"));
                    if(gfsx2.i()) {
                        fmbb0.j(((fmbh)gfsx2.d()));
                    }
                    break;
                }
                case 3: {
                    fmbb0.d(jSONObject0.getString("ACTION_PAYLOAD"));
                    break;
                }
                case 4: {
                    fmbb0.o(jSONObject0.getString("ACTION_PAYLOAD"));
                    break;
                }
                case 5: {
                    gfsx gfsx3 = fmfw.b(jSONObject0.getJSONObject("ACTION_PAYLOAD"));
                    if(!gfsx3.i()) {
                        return gfqx.a;
                    }
                    fmbe fmbe0 = new fmbe(null);
                    fmbe0.b(((fmfw)gfsx3.d()));
                    fmbb0.p(fmbe0.a());
                    break;
                }
                case 6: {
                    fmbb0.r();
                    break;
                }
                case 7: {
                    fmbb0.c(jSONObject0.getString("ACTION_PAYLOAD"));
                    break;
                }
                case 8: {
                    fmbb0.l(jSONObject0.getString("ACTION_PAYLOAD"));
                    break;
                }
                case 9: {
                    JSONObject jSONObject1 = jSONObject0.getJSONObject("ACTION_PAYLOAD");
                    fmbe fmbe1 = new fmbe(null);
                    try {
                        if(jSONObject1.has("REACTION_OVERLAY_HEADER")) {
                            gfsx gfsx4 = fmfw.b(jSONObject1.getJSONObject("REACTION_OVERLAY_HEADER"));
                            if(gfsx4.i()) {
                                fmbe1.b(((fmfw)gfsx4.d()));
                                goto label_53;
                            }
                            else {
                                gfsx5 = gfqx.a;
                            }
                        }
                        else {
                        label_53:
                            if(jSONObject1.has("STACKED_REACTION_WEB_VIEW")) {
                                gfsx gfsx6 = fmfc.a(jSONObject1.getJSONObject("STACKED_REACTION_WEB_VIEW"));
                                if(gfsx6.i()) {
                                    fmbe1.c(((fmfc)gfsx6.d()));
                                    goto label_64;
                                }
                                else {
                                    gfsx5 = gfqx.a;
                                }
                            }
                            else {
                                goto label_64;
                            }
                        }
                    }
                    catch(JSONException jSONException1) {
                        flbj.d("Action", "failed to convert JSONObject to OverlayActionPayload.", jSONException1);
                        gfsx5 = gfqx.a;
                    }
                    goto label_65;
                label_64:
                    gfsx5 = gfsx.m(fmbe1.a());
                label_65:
                    if(!gfsx5.i()) {
                        return gfqx.a;
                    }
                    fmbb0.p(((fmbf)gfsx5.d()));
                    break;
                }
                case 10: {
                    JSONObject jSONObject2 = jSONObject0.getJSONObject("ACTION_PAYLOAD");
                    if(!jSONObject2.has("URL") || !jSONObject2.has("REPLACEMENTS")) {
                        flbj.c("UrlAction", "failed to convert JSONObject to UrlAction, missing necessary properties");
                        gfsx7 = gfqx.a;
                    }
                    else {
                        try {
                            JSONArray jSONArray0 = jSONObject2.getJSONArray("REPLACEMENTS");
                            fmhs fmhs0 = new fmhs();
                            ggdy ggdy0 = new ggdy();
                            int v = 0;
                            while(v < jSONArray0.length()) {
                                JSONObject jSONObject3 = jSONArray0.getJSONObject(v);
                                if(!jSONObject3.has("PATTERN") || !jSONObject3.has("SUBSTITUTE")) {
                                    flbj.c("UrlAction", "failed to convert JSONObject to UrlContentReplacement, missing necessary properties");
                                    gfsx8 = gfqx.a;
                                }
                                else {
                                    fmht fmht0 = new fmht();
                                    try {
                                        fmht0.b(jSONObject3.getString("PATTERN"));
                                        fmht0.c(jSONObject3.getInt("SUBSTITUTE"));
                                        gfsx8 = gfsx.m(fmht0.a());
                                    }
                                    catch(JSONException unused_ex) {
                                        gfsx8 = gfqx.a;
                                    }
                                }
                                if(gfsx8.i()) {
                                    ggdy0.i(gfsx8.d());
                                    ++v;
                                    continue;
                                }
                                flbj.c("UrlAction", "failed to convert JSONObject to UrlAction");
                                gfsx7 = gfqx.a;
                                goto label_103;
                            }
                            fmhs0.b(ggdy0.h());
                            fmhs0.c(jSONObject2.getString("URL"));
                            gfsx7 = gfsx.m(fmhs0.a());
                        }
                        catch(JSONException unused_ex) {
                            flbj.c("UrlAction", "failed to convert JSONObject to UrlAction");
                            gfsx7 = gfqx.a;
                        }
                    }
                label_103:
                    if(!gfsx7.i()) {
                        return gfqx.a;
                    }
                    fmbb0.n(((fmhv)gfsx7.d()));
                    break;
                }
                case 11: {
                    JSONObject jSONObject4 = jSONObject0.getJSONObject("ACTION_PAYLOAD");
                    try {
                        gged_interceptors gged0 = flbp.a(jSONObject4.getJSONArray("DECORATION_IDS_TO_ADD"));
                        gged_interceptors gged1 = flbp.a(jSONObject4.getJSONArray("DECORATION_IDS_TO_REMOVE"));
                        fmfd fmfd0 = fmfe.a();
                        fmfd0.b(gged0);
                        fmfd0.c(gged1);
                        gfsx9 = gfsx.m(fmfd0.a());
                    }
                    catch(JSONException unused_ex) {
                        flbj.c("fmfe", "Failed to convert the decoration id lists from JSON.");
                        gfsx9 = gfqx.a;
                    }
                    if(!gfsx9.i()) {
                        flbj.c("Action", "failed to convert JSON object to decoration transition action.");
                        return gfqx.a;
                    }
                    fmbb0.e(((fmfe)gfsx9.d()));
                }
            }
            switch(fmba.b(jSONObject0.getString("EVENT_CALLBACK_FAILURE_ACTION_TYPE")).ordinal()) {
                case 6: {
                    break;
                }
                case 8: {
                    fmbb0.g(jSONObject0.getString("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD"));
                    break;
                }
                default: {
                    flbj.c("Action", "failed to convert JSONObject to Action, unsupported event callback failure action type");
                    return gfqx.a;
                }
            }
            return gfsx.m(fmbb0.a());
        }
        catch(JSONException jSONException0) {
            flbj.d("Action", "failed to convert JSONObject to Action", jSONException0);
            return gfqx.a;
        }
    }

    public final gfsx e() {
        gfsx gfsx3;
        JSONObject jSONObject0 = new JSONObject();
        try {
            gfsx gfsx0 = this.c;
            if(gfsx0.i()) {
                jSONObject0.put("EVENT_CALLBACK_PAYLOAD", gfsx0.d());
            }
            jSONObject0.put("ACTION_TRIGGERED_LOG_ID", this.e);
            gfsx gfsx1 = this.d;
            if(gfsx1.i()) {
                Object object0 = gfsx1.d();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    jSONObject1.put("EVENT_CALLBACK_DESTINATION_TYPE", ((fmbc)object0).d() - 1);
                    switch(((fmbc)object0).d() - 1) {
                        case 1: {
                            gfsx gfsx2 = ((fmbc)object0).a().g();
                            if(gfsx2.i()) {
                                jSONObject1.put("EVENT_CALLBACK_DESTINATION", gfsx2.d());
                                gfsx3 = gfsx.m(jSONObject1);
                                break;
                            }
                            else {
                                flbj.c("Action", "failed to convert EventCallbackDestination to JSONObject, ContactId is not present");
                                gfsx3 = gfqx.a;
                            }
                            break;
                        }
                        case 2: {
                            gfsx gfsx4 = ((fmbc)object0).b().d();
                            if(gfsx4.i()) {
                                jSONObject1.put("EVENT_CALLBACK_DESTINATION", gfsx4.d());
                                gfsx3 = gfsx.m(jSONObject1);
                            }
                            else {
                                flbj.c("Action", "failed to convert EventCallbackDestination to JSONObject, GroupId is not present");
                                gfsx3 = gfqx.a;
                            }
                            break;
                        }
                        default: {
                            gfsx3 = gfsx.m(jSONObject1);
                            break;
                        }
                    }
                }
                catch(JSONException unused_ex) {
                    flbj.c("Action", "failed to convert EventCallbackDestination to JSONObject");
                    gfsx3 = gfqx.a;
                }
                if(gfsx3.i()) {
                    jSONObject0.put("EVENT_CALLBACK_DESTINATION", gfsx3.d());
                }
            }
            gfsx gfsx5 = this.a;
            if(gfsx5.i()) {
                jSONObject0.put("TRACE_ID", gfsx5.d());
            }
            gfsx gfsx6 = this.b;
            if(gfsx6.i()) {
                jSONObject0.put("MESSAGE_ID", gfsx6.d());
            }
            jSONObject0.put("ACTION_TYPE", this.a());
            if(!fmbi.f(jSONObject0, "ACTION_PAYLOAD", this.f)) {
                return gfqx.a;
            }
            jSONObject0.put("EVENT_CALLBACK_FAILURE_ACTION_TYPE", this.b());
            return !fmbi.f(jSONObject0, "EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD", this.g) ? gfqx.a : gfsx.m(jSONObject0);
        }
        catch(JSONException unused_ex) {
            flbj.c("Action", "failed to convert Action to JSONObject");
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmbi) && this.a.equals(((fmbi)object0).a) && this.b.equals(((fmbi)object0).b) && this.c.equals(((fmbi)object0).c) && this.d.equals(((fmbi)object0).d) && this.e == ((fmbi)object0).e && this.f.equals(((fmbi)object0).f) && this.g.equals(((fmbi)object0).g);
    }

    private static final boolean f(JSONObject jSONObject0, String s, fmaz fmaz0) {
        gfsx gfsx6;
        gfsx gfsx5;
        gfsx gfsx4;
        switch(fmaz0.a().ordinal()) {
            case 0: {
                flbj.c("Action", "failed to convert Action to JSONObject due to Unknown action type");
                return false;
            }
            case 1: {
                gfsx gfsx0 = fmaz0.d().b();
                if(gfsx0.i()) {
                    jSONObject0.put(s, gfsx0.d());
                    return true;
                }
                return true;
            }
            case 2: {
                gfsx gfsx1 = fmaz0.c().b();
                if(gfsx1.i()) {
                    jSONObject0.put(s, gfsx1.d());
                    return true;
                }
                return true;
            }
            case 3: {
                jSONObject0.put(s, fmaz0.i());
                return true;
            }
            case 4: {
                jSONObject0.put(s, fmaz0.k());
                return true;
            }
            case 5: {
                jSONObject0.put("ACTION_TYPE", fmba.j);
                fmbe fmbe0 = new fmbe(null);
                fmbe0.b(fmaz0.f());
                gfsx gfsx2 = fmbf.a(fmbe0.a());
                if(!gfsx2.i()) {
                    return false;
                }
                jSONObject0.put(s, gfsx2.d());
                return true;
            }
            case 7: {
                jSONObject0.put(s, fmaz0.h());
                return true;
            }
            case 8: {
                jSONObject0.put(s, fmaz0.j());
                return true;
            }
            case 9: {
                jSONObject0.put("ACTION_TYPE", fmba.j);
                gfsx gfsx3 = fmbf.a(fmaz0.b());
                if(!gfsx3.i()) {
                    return false;
                }
                jSONObject0.put(s, gfsx3.d());
                return true;
            }
            case 10: {
                fmhv fmhv0 = fmaz0.g();
                JSONObject jSONObject1 = new JSONObject();
                try {
                    JSONArray jSONArray0 = new JSONArray();
                    ggqk ggqk0 = fmhv0.b.E();
                    while(ggqk0.hasNext()) {
                        Object object0 = ggqk0.next();
                        fmhu fmhu0 = (fmhu)object0;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("PATTERN", fmhu0.a);
                            jSONObject2.put("SUBSTITUTE", fmhu0.b);
                            gfsx4 = gfsx.m(jSONObject2);
                        }
                        catch(JSONException unused_ex) {
                            flbj.c("UrlAction", "failed to convert UrlContentReplacement to JSONObject");
                            gfsx4 = gfqx.a;
                        }
                        if(gfsx4.i()) {
                            jSONArray0.put(gfsx4.d());
                            continue;
                        }
                        gfsx5 = gfqx.a;
                        goto label_60;
                    }
                    jSONObject1.put("REPLACEMENTS", jSONArray0);
                    jSONObject1.put("URL", fmhv0.a());
                    gfsx5 = gfsx.m(jSONObject1);
                }
                catch(JSONException unused_ex) {
                    flbj.c("UrlAction", "failed to convert ReplyActionPayload to JSONObject");
                    gfsx5 = gfqx.a;
                }
            label_60:
                if(!gfsx5.i()) {
                    flbj.c("Action", "failed to convert UrlAction payload to json.");
                    return false;
                }
                jSONObject0.put(s, gfsx5.d());
                return true;
            }
            case 11: {
                fmfe fmfe0 = fmaz0.e();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("DECORATION_IDS_TO_ADD", new JSONArray(fmfe0.b));
                    jSONObject3.put("DECORATION_IDS_TO_REMOVE", new JSONArray(fmfe0.c));
                }
                catch(JSONException unused_ex) {
                    flbj.c("fmfe", "Failed to convert the decoration id lists to JSON.");
                    gfsx6 = gfqx.a;
                    goto label_74;
                }
                gfsx6 = gfsx.m(jSONObject3);
            label_74:
                if(!gfsx6.i()) {
                    flbj.c("Action", "Failed to convert decoration transition action to json.");
                    return false;
                }
                jSONObject0.put(s, gfsx6.d());
                return true;
            }
            default: {
                return true;
            }
        }
    }

    @Override
    public final int hashCode() {
        return this.g.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ this.f.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "Action{traceId=" + this.a + ", messageId=" + this.b + ", eventCallbackPayload=" + this.c + ", eventCallbackDestination=" + this.d + ", actionTriggeredLogId=" + this.e + ", actionPayload=" + this.f + ", eventCallbackFailureActionPayload=" + this.g + "}";
    }
}

