package com.google.android.gms.ads.internal.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import bbsr;
import com.google.android.gms.ads.internal.client.u;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.gmsg.e;
import com.google.android.gms.ads.internal.util.ag;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.f;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.m;
import com.google.android.gms.ads.internal.webview.i;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends b implements e {
    DisplayMetrics a;
    int b;
    int c;
    int d;
    int e;
    int f;
    private final i h;
    private final Context i;
    private final WindowManager j;
    private final com.google.android.gms.ads.internal.common.b k;
    private float l;
    private int m;

    public a(i i0, Context context0, com.google.android.gms.ads.internal.common.b b0) {
        super(i0);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.h = i0;
        this.i = context0;
        this.k = b0;
        this.j = (WindowManager)context0.getSystemService("window");
    }

    @Override  // com.google.android.gms.ads.internal.gmsg.e
    public final void a(Object object0, Map map0) {
        int v5;
        int v4;
        int v3;
        JSONObject jSONObject0;
        i i0 = (i)object0;
        this.a = new DisplayMetrics();
        Display display0 = this.j.getDefaultDisplay();
        display0.getMetrics(this.a);
        this.l = this.a.density;
        this.m = display0.getRotation();
        this.b = f.j(this.a, this.a.widthPixels);
        this.c = f.j(this.a, this.a.heightPixels);
        i i1 = this.h;
        Activity activity0 = i1.f();
        int v = 0;
        if(activity0 != null && activity0.getWindow() != null) {
            int[] arr_v = m.p(activity0);
            this.d = f.j(this.a, arr_v[0]);
            this.e = f.j(this.a, arr_v[1]);
        }
        else {
            this.d = this.b;
            this.e = this.c;
        }
        i1.j();
        i1.measure(0, 0);
        this.b(this.b, this.c, this.d, this.e, this.l, this.m);
        Intent intent0 = new Intent("android.intent.action.DIAL");
        intent0.setData(Uri.parse("tel:"));
        boolean z = this.k.a(intent0);
        Intent intent1 = new Intent("android.intent.action.VIEW");
        intent1.setData(Uri.parse("sms:"));
        boolean z1 = this.k.a(intent1);
        Intent intent2 = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
        boolean z2 = this.k.a(intent2);
        com.google.android.gms.ads.internal.common.a a0 = new com.google.android.gms.ads.internal.common.a();
        Context context0 = this.k.a;
        boolean z3 = ((Boolean)ag.a(context0, a0)).booleanValue() && bbsr.b(context0).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        try {
            jSONObject0 = new JSONObject().put("sms", z1).put("tel", z).put("calendar", z2).put("storePicture", z3).put("inlineVideo", true);
        }
        catch(JSONException jSONException0) {
            h.h("Error occurred while obtaining the MRAID capabilities.", jSONException0);
            jSONObject0 = null;
        }
        i1.b("onDeviceFeaturesReceived", jSONObject0);
        i i2 = this.h;
        int[] arr_v1 = new int[2];
        i2.getLocationOnScreen(arr_v1);
        Context context1 = this.i;
        int v1 = u.b().a(context1, arr_v1[0]);
        int v2 = u.b().a(context1, arr_v1[1]);
        if((context1 instanceof Activity)) {
            Window window0 = ((Activity)context1).getWindow();
            if(window0 != null) {
                View view0 = window0.findViewById(0x1020002);
                if(view0 != null) {
                    new int[]{view0.getTop(), view0.getBottom()};
                    v3 = view0.getTop();
                    v4 = view0.getBottom();
                }
            }
            v5 = new int[]{u.b().a(((Activity)context1), v3), u.b().a(((Activity)context1), v4)}[0];
        }
        else {
            v5 = 0;
        }
        if(i2.j() != null) {
            i2.j();
        }
        int v6 = i2.getWidth();
        int v7 = i2.getHeight();
        if(((Boolean)s.m.g()).booleanValue()) {
            if(v6 == 0) {
                if(i2.j() != null) {
                    i2.j();
                }
                v6 = 0;
            }
            if(v7 != 0) {
                v = v7;
            }
            else if(i2.j() != null) {
                i2.j();
            }
        }
        else {
            v = v7;
        }
        this.f = u.b().a(context1, v6);
        int v8 = u.b().a(context1, v);
        int v9 = this.f;
        try {
            JSONObject jSONObject1 = new JSONObject().put("x", v1).put("y", v2 - v5).put("width", v9).put("height", v8);
            this.g.b("onDefaultPositionReceived", jSONObject1);
        }
        catch(JSONException jSONException1) {
            h.h("Error occurred while dispatching default position.", jSONException1);
        }
        i i3 = this.h;
        i3.m();
        if(c.p(2)) {
            h.i("Dispatching Ready Event.");
        }
        String s = i3.i().a;
        try {
            JSONObject jSONObject2 = new JSONObject().put("js", s);
            this.g.b("onReadyEventReceived", jSONObject2);
        }
        catch(JSONException jSONException2) {
            h.h("Error occurred while dispatching ready Event.", jSONException2);
        }
    }
}

