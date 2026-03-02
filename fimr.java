import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fimr implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        fmeo fmeo0 = (fmeo)object0;
        try {
            JSONObject jSONObject0 = new JSONObject();
            gfsx gfsx0 = fmeo0.a.g();
            if(gfsx0.i()) {
                jSONObject0.put("CONTACT_ID", gfsx0.d());
                gfsx gfsx1 = fmeo0.b;
                if(gfsx1.i()) {
                    jSONObject0.put("NAME", gfsx1.d());
                }
                gfsx gfsx2 = fmeo0.c;
                if(gfsx2.i()) {
                    jSONObject0.put("A11Y_NAME", gfsx2.d());
                }
                gfsx gfsx3 = fmeo0.d;
                if(gfsx3.i()) {
                    jSONObject0.put("IMAGE_URL", gfsx3.d());
                }
                jSONObject0.put("IS_IMAGE_STALE", fmeo0.f);
                jSONObject0.put("EXPIRATION_TIME_MILLIS", fmeo0.g);
                JSONArray jSONArray0 = new JSONArray();
                gged_interceptors gged0 = fmeo0.h;
                int v = ((ggna)gged0).c;
                for(int v2 = 0; v2 < v; ++v2) {
                    gfsx gfsx4 = ((fmfj)gged0.get(v2)).a();
                    if(gfsx4.i()) {
                        jSONArray0.put(gfsx4.d());
                    }
                }
                jSONObject0.put("MENU_ITEMS", jSONArray0);
                JSONArray jSONArray1 = new JSONArray();
                gged_interceptors gged1 = fmeo0.i;
                int v3 = ((ggna)gged1).c;
                for(int v1 = 0; v1 < v3; ++v1) {
                    gfsx gfsx5 = ((fmfj)gged1.get(v1)).a();
                    if(gfsx5.i()) {
                        jSONArray1.put(gfsx5.d());
                    }
                }
                jSONObject0.put("TOOLBAR_BUTTONS", jSONArray1);
                gfsx gfsx6 = fmeo0.j;
                if(gfsx6.i()) {
                    gfsx6.d();
                    gfsx gfsx7 = ((fmhn)gfsx6.d()).a();
                    if(gfsx7.i()) {
                        jSONObject0.put("CUSTOM_VIEW_CONTENT_MODEL_TYPE", 1);
                        jSONObject0.put("CUSTOM_VIEW_CONTENT_MODEL", gfsx7.d());
                    }
                }
                gfsx gfsx8 = fmeo0.k;
                if(gfsx8.i()) {
                    gfsx gfsx9 = ((fmfl)gfsx8.d()).a();
                    if(gfsx9.i()) {
                        jSONObject0.put("UI_CONFIGURATIONS", gfsx9.d());
                    }
                }
                jSONObject0.put("SERVER_TIMESTAMP_US", fmeo0.l);
            }
            else {
                jSONObject0 = null;
            }
            return gfsx.l(jSONObject0);
        }
        catch(JSONException unused_ex) {
            flbj.c("LitContactCtrlr", "failed to convert Contact to JSONObject");
            return gfqx.a;
        }
    }
}

