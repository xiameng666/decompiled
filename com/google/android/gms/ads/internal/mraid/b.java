package com.google.android.gms.ads.internal.mraid;

import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.webview.i;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    public final i g;

    public b(i i0) {
        this.g = i0;
    }

    public final void b(int v, int v1, int v2, int v3, float f, int v4) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("width", v).put("height", v1).put("maxSizeWidth", v2).put("maxSizeHeight", v3).put("density", ((double)f)).put("rotation", v4);
            this.g.b("onScreenInfoChanged", jSONObject0);
        }
        catch(JSONException jSONException0) {
            h.h("Error occurred while obtaining screen information.", jSONException0);
        }
    }
}

