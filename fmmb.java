import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmmb {
    public final gged_interceptors a;
    public final gfsx b;
    public static final int c = 0;
    private static final String d = "fmmb";

    static {
    }

    public fmmb() {
        throw null;
    }

    public fmmb(gged_interceptors gged0, gfsx gfsx0) {
        this.a = gged0;
        this.b = gfsx0;
    }

    public static gfsx a(JSONObject jSONObject0) {
        gfsx gfsx3;
        gfsx gfsx1;
        try {
            fmma fmma0 = new fmma(null);
            ggdy ggdy0 = new ggdy();
            JSONArray jSONArray0 = jSONObject0.getJSONArray("COMPONENTS");
            int v = 0;
            while(true) {
                if(v >= jSONArray0.length()) {
                    fmma0.b(ggdy0.h());
                    if(jSONObject0.has("PREFERRED_MAX_WIDTH")) {
                        fmma0.c(jSONObject0.getInt("PREFERRED_MAX_WIDTH"));
                    }
                    return gfsx.m(fmma0.a());
                }
                JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                try {
                    if(jSONObject1.has("UI_ELEMENT")) {
                        gfsx gfsx0 = fmmo.c(jSONObject1.getJSONObject("UI_ELEMENT"));
                        if(gfsx0.i()) {
                            gfsx1 = gfsx.m(fmky.b(((fmmo)gfsx0.d())));
                        }
                        else {
                            flbj.c("UI_COMPONENT", "Failed to get UiElement from JSON when decoding UiComponent.");
                            gfsx1 = gfqx.a;
                        }
                    }
                    else {
                        if(jSONObject1.has("STACK_COMPONENT")) {
                            JSONObject jSONObject2 = jSONObject1.getJSONObject("STACK_COMPONENT");
                            fmmh fmmh0 = new fmmh();
                            ggdy ggdy1 = new ggdy();
                            try {
                                JSONArray jSONArray1 = jSONObject2.getJSONArray("UI_ELEMENTS");
                                int v1 = 0;
                                while(v1 < jSONArray1.length()) {
                                    gfsx gfsx2 = fmmo.c(jSONArray1.getJSONObject(v1));
                                    if(gfsx2.i()) {
                                        ggdy1.i(gfsx2.d());
                                        ++v1;
                                        continue;
                                    }
                                    flbj.c("UI_COMPONENT", "Failed to get UiElement from JSON when decoding StackComponent.");
                                    gfsx3 = gfqx.a;
                                    goto label_40;
                                }
                                fmmh0.b(ggdy1.h());
                            }
                            catch(JSONException jSONException2) {
                                flbj.d("UI_COMPONENT", "Failed to get LineStyle from JSONObject.", jSONException2);
                                gfsx3 = gfqx.a;
                                goto label_40;
                            }
                            gfsx3 = gfsx.m(fmmh0.a());
                        label_40:
                            if(gfsx3.i()) {
                                gfsx1 = gfsx.m(fmky.a(((fmmi)gfsx3.d())));
                            }
                            else {
                                flbj.c("UI_COMPONENT", "Failed to get StackComponent from JSON when decoding UiComponent.");
                                gfsx1 = gfqx.a;
                            }
                            goto label_49;
                        }
                        goto label_48;
                    }
                    goto label_49;
                }
                catch(JSONException jSONException1) {
                    flbj.d("UI_COMPONENT", "Failed to get UiComponent from JSONObject", jSONException1);
                }
            label_48:
                gfsx1 = gfqx.a;
            label_49:
                if(!gfsx1.i()) {
                    flbj.c("fmmb", "Failed to convert JSONObject to StackCard.");
                    return gfqx.a;
                }
                ggdy0.i(gfsx1.d());
                ++v;
            }
        }
        catch(JSONException jSONException0) {
            flbj.d(fmmb.d, "Failed to convert JSONObject to StackCard.", jSONException0);
            return gfqx.a;
        }
    }

    public final gfsx b() {
        gfsx gfsx2;
        gfsx gfsx1;
        JSONObject jSONObject0 = new JSONObject();
        try {
            JSONArray jSONArray0 = new JSONArray();
            ggqk ggqk0 = this.a.E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                fmmj fmmj0 = (fmmj)object0;
                JSONObject jSONObject1 = new JSONObject();
                try {
                    switch(fmmj0.a().ordinal()) {
                        case 0: {
                            fmmi fmmi0 = fmmj0.b();
                            JSONObject jSONObject2 = new JSONObject();
                            JSONArray jSONArray1 = new JSONArray();
                            try {
                                ggqk ggqk1 = fmmi0.a.E();
                                while(ggqk1.hasNext()) {
                                    Object object1 = ggqk1.next();
                                    gfsx gfsx0 = ((fmmo)object1).d();
                                    if(gfsx0.i()) {
                                        jSONArray1.put(gfsx0.d());
                                        continue;
                                    }
                                    flbj.c("UI_COMPONENT", "Failed to convert UiElement to JSON when encoding StackComponent.");
                                    gfsx1 = gfqx.a;
                                    goto label_29;
                                }
                                jSONObject2.put("UI_ELEMENTS", jSONArray1);
                            }
                            catch(JSONException jSONException2) {
                                flbj.d("UI_COMPONENT", "Failed to convert StackComponent to JSONObject", jSONException2);
                                gfsx1 = gfqx.a;
                                goto label_29;
                            }
                            gfsx1 = gfsx.m(jSONObject2);
                        label_29:
                            if(gfsx1.i()) {
                                jSONObject1.put("STACK_COMPONENT", gfsx1.d());
                                break;
                            }
                            else {
                                flbj.c("UI_COMPONENT", "Failed to convert stackComponent to JSON when encoding UiComponent.");
                                gfsx2 = gfqx.a;
                                goto label_47;
                            }
                            goto label_35;
                        }
                        case 1: {
                        label_35:
                            gfsx gfsx3 = fmmj0.c().d();
                            if(gfsx3.i()) {
                                jSONObject1.put("UI_ELEMENT", gfsx3.d());
                            }
                            else {
                                flbj.c("UI_COMPONENT", "Failed to convert UiElement to JSON when encoding UiComponent.");
                                gfsx2 = gfqx.a;
                                goto label_47;
                            }
                        }
                    }
                }
                catch(JSONException jSONException1) {
                    flbj.d("UI_COMPONENT", "Failed to convert UiComponent to JSONObject", jSONException1);
                    gfsx2 = gfqx.a;
                    goto label_47;
                }
                gfsx2 = gfsx.m(jSONObject1);
            label_47:
                if(!gfsx2.i()) {
                    flbj.c("fmmb", "Failed to convert StackCard to JSONObject.");
                    return gfqx.a;
                }
                jSONArray0.put(gfsx2.d());
            }
            jSONObject0.put("COMPONENTS", jSONArray0);
            gfsx gfsx4 = this.b;
            if(gfsx4.i()) {
                jSONObject0.put("PREFERRED_MAX_WIDTH", gfsx4.d());
                return gfsx.m(jSONObject0);
            }
        }
        catch(JSONException jSONException0) {
            flbj.d("fmmb", "Failed to convert StackCard to JSONObject.", jSONException0);
            return gfqx.a;
        }
        return gfsx.m(jSONObject0);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmmb) && ggia.i(this.a, ((fmmb)object0).a) && this.b.equals(((fmmb)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "StackCard{components=" + this.a + ", preferredMaxWidth=" + this.b + "}";
    }
}

