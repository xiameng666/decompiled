import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;
import com.google.android.wallet.ui.common.WebViewLayout;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

public class fccx extends gdfk implements luo {
    WebView a;
    public boolean b;

    @Override  // gdfk
    public final Intent Q(Context context0, gfcr gfcr0, String s, int v, LogContext logContext0) {
        BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)this.getArguments().getParcelable("buyFlowConfig");
        Intent intent0 = StartAndroidAppRedirectActivity.n(context0, gfcr0, s, v, logContext0);
        intent0.setClassName(context0, "com.google.android.gms.wallet.redirect.StartAndroidAppRedirectProxyActivity");
        intent0.putExtra("buyFlowConfig", buyFlowConfig0);
        return intent0;
    }

    @Override  // gdfk
    public final void R() {
        String s9;
        String s1;
        gfcw gfcw0 = (gfcw)this.aA;
        if(((gfcw0.b & 0x10000) == 0 || ((gfcw0.w == null ? geso.a : gfcw0.w).b.isEmpty() || this.b)) && (super.ad() && this.am)) {
            WebViewLayout webViewLayout0 = this.d;
            if(((gfcw)this.aA).e.size() > 0) {
                Context context0 = this.getContext();
                int v = this.ap;
                String s = ((gfcw)this.aA).d;
                hfuo hfuo0 = ((gfcw)this.aA).e;
                HashMap hashMap0 = new HashMap();
                for(Object object0: hfuo0) {
                    int v1 = gfcz.a(((gfda)object0).b);
                    if(v1 == 0) {
                        v1 = 1;
                    }
                    switch(v1 - 1) {
                        case 1: {
                            gctz.b(hashMap0, gdfh.a(v));
                            break;
                        }
                        case 2: {
                            gctz.c(hashMap0, context0);
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown UrlParameterOperation type " + (v1 - 1));
                        }
                    }
                }
                s1 = gctz.a(s, hashMap0);
            }
            else {
                s1 = ((gfcw)this.aA).d;
            }
            if(((gfcw)this.aA).g.size() > 0) {
                int v2 = this.ap;
                String s2 = ((gfcw)this.aA).f;
                hfuo hfuo1 = ((gfcw)this.aA).g;
                HashMap hashMap1 = new HashMap();
                for(Object object1: hfuo1) {
                    int v3 = gfcm.a(((gfcn)object1).b);
                    if(v3 == 0) {
                        v3 = 1;
                    }
                    if(v3 - 1 != 1) {
                        throw new IllegalArgumentException("Unknown PostBodyParameterOperation type " + (v3 - 1));
                    }
                    gctz.b(hashMap1, gdfh.a(v2));
                    continue;
                }
                ibuq.f(s2, "postBodyJsonString");
                JSONArray jSONArray0 = new JSONArray(s2);
                JSONArray jSONArray1 = new JSONArray();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                int v4 = jSONArray0.length();
                for(int v5 = 0; v5 < v4; ++v5) {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v5);
                    String s3 = jSONObject0.optString("name");
                    ibuq.e(s3, "optString(...)");
                    if(s3.length() > 0 && hashMap1.containsKey(s3)) {
                        linkedHashMap0.put(s3, jSONObject0);
                    }
                    else {
                        jSONArray1.put(jSONObject0);
                    }
                }
                for(Object object2: hashMap1.entrySet()) {
                    String s4 = (String)((Map.Entry)object2).getKey();
                    gcty gcty0 = (gcty)((Map.Entry)object2).getValue();
                    JSONObject jSONObject1 = (JSONObject)linkedHashMap0.get(s4);
                    String s5 = "";
                    if(jSONObject1 != null) {
                        String s6 = jSONObject1.optString("value", "");
                        if(s6 != null) {
                            s5 = s6;
                        }
                    }
                    String s7 = gcty0.a(s5);
                    if(!ibzk.D(s7)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", s4);
                        jSONObject2.put("value", s7);
                        jSONArray1.put(jSONObject2);
                    }
                }
                String s8 = jSONArray1.toString();
                ibuq.e(s8, "toString(...)");
                s9 = gdfk.Z(s8);
            }
            else {
                s9 = gdfk.Z(((gfcw)this.aA).f);
            }
            webViewLayout0.b(s1, s9);
            this.ll(true);
        }
    }

    public final void S() {
        gcfz.j(this.cM(), false);
        geso geso0 = ((gfcw)this.aA).w;
        if(geso0 == null) {
            geso0 = geso.a;
        }
        gfgr gfgr0 = geso0.c == null ? gfgr.a : geso0.c;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfgr0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gfgr0));
        this.ao(hftp0);
    }

    @Override  // gdfk
    protected final void U(Bundle bundle0) {
        if(bundle0 != null) {
            this.b = bundle0.getBoolean("authObtainedStatus");
        }
    }

    @Override  // gdfk
    protected final boolean V() {
        return hzmb.a.b().f();
    }

    @Override  // luo
    public final lvb a(int v, Bundle bundle0) {
        if(v == 0) {
            Account account0 = this.oc();
            int v1 = this.cK();
            geso geso0 = ((gfcw)this.aA).w;
            if(geso0 == null) {
                geso0 = geso.a;
            }
            return new fazw(account0, v1, geso0.b, this.getContext());
        }
        return null;
    }

    @Override  // luo
    public final void b(lvb lvb0, Object object0) {
        if(this.isAdded()) {
            if(!TextUtils.isEmpty(((String)object0))) {
                gcfz.i(this.cM(), true);
                CookieManager.getInstance().removeAllCookies(new fccw(this, ((String)object0)));
                return;
            }
            gcfz.i(this.cM(), false);
            Log.w("GcoreRedirectFragment", "Login url is empty, show login error dialog.");
            geso geso0 = ((gfcw)this.aA).w;
            if(geso0 == null) {
                geso0 = geso.a;
            }
            gfgr gfgr0 = geso0.c == null ? gfgr.a : geso0.c;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfgr0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gfgr0));
            this.ao(hftp0);
        }
    }

    @Override  // luo
    public final void c(lvb lvb0) {
    }

    @Override  // gdak
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        gfcw gfcw0 = (gfcw)this.aA;
        if((gfcw0.b & 0x10000) != 0 && (!(gfcw0.w == null ? geso.a : gfcw0.w).b.isEmpty() && !this.b)) {
            lup lup0 = this.getLoaderManager();
            if(lup0.b(0) != null) {
                lup0.d(0, null, this);
                return;
            }
            lup0.c(0, null, this);
        }
    }

    @Override  // gdfk
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("authObtainedStatus", this.b);
    }

    @Override  // gdfk
    protected View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E042D, viewGroup0, false);  // layout:fragment_redirect
        this.d = (WebViewLayout)view0.findViewById(0x7F0B24DF);  // id:web_view_layout
        if(bundle0 != null) {
            this.an = (gfcr)gciq.a(bundle0, "launchedAppRedirectInfo", ((Parser)((ProtoLiteMessage)gfcr.a).jf(7, null)));
        }
        if(this.an == null && super.ad()) {
            if(!((gfcw)this.aA).o.isEmpty()) {
                WebViewLayout webViewLayout0 = this.d;
                String s = ((gfcw)this.aA).o;
                webViewLayout0.a.getSettings().setUserAgentString(s);
            }
            WebViewLayout webViewLayout1 = this.d;
            webViewLayout1.i = ((gfcw)this.aA).h;
            TextView textView0 = webViewLayout1.g;
            if(textView0 != null) {
                textView0.setText(webViewLayout1.i);
                webViewLayout1.g.setVisibility((TextUtils.isEmpty(webViewLayout1.i) ? 8 : 0));
            }
            WebViewLayout webViewLayout2 = this.d;
            String s1 = ((gfcw)this.aA).q;
            webViewLayout2.j = s1;
            TextView textView1 = webViewLayout2.d;
            if(textView1 != null) {
                textView1.setText(s1);
            }
            WebViewLayout webViewLayout3 = this.d;
            int v = 2;
            webViewLayout3.m = 2;
            WebView webView0 = webViewLayout3.a;
            if(webView0 != null) {
                webView0.setLayoutParams(webViewLayout3.a());
            }
            WebViewLayout webViewLayout4 = this.d;
            int v1 = gfcv.a(((gfcw)this.aA).y);
            if(v1 != 0) {
                v = v1;
            }
            webViewLayout4.n = v;
            WebView webView1 = this.d.a;
            this.ag = new gcqp(this.getContext(), webView1, ((gfcw)this.aA).i, ((gfcw)this.aA).j, ((gfcw)this.aA).m, ((String[])((gfcw)this.aA).n.toArray(new String[0])), ((gfcw)this.aA).v, this.cM());
            this.ag.k = this;
            this.ag.e = this;
            this.U(bundle0);
            gcts gcts0 = this.ag;
            if(gcts0 != null) {
                gcts0.d = this.ao;
            }
            WebViewLayout webViewLayout5 = this.d;
            if(gcts0 == null) {
                gcts0 = new gcts();
            }
            webViewLayout5.k = gcts0;
            gcts gcts1 = webViewLayout5.k;
            gcts1.l = webViewLayout5;
            WebView webView2 = webViewLayout5.a;
            if(webView2 != null) {
                webView2.setWebViewClient(gcts1);
            }
            if(this.V()) {
                this.d.l.b = this;
            }
            if(((gfcw)this.aA).x) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.d.a, true);
            }
            Context context0 = this.getContext();
            if(gcqk.a) {
                this.lV();
            }
            else {
                elgf.c(context0.getApplicationContext(), new gcqj(this));
            }
        }
        else {
            super.ac();
        }
        this.ll(false);
        gfcw gfcw0 = (gfcw)this.aA;
        if((gfcw0.b & 0x10000) != 0 && (!(gfcw0.w == null ? geso.a : gfcw0.w).b.isEmpty() && !this.b)) {
            WebView webView3 = new WebView(this.getContext());
            this.a = webView3;
            webView3.getSettings().setJavaScriptEnabled(true);
            webView3.setWebViewClient(new fbzc(this));
        }
        return view0;
    }
}

