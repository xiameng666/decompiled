package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.js.l;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.video.c;
import com.google.android.gms.ads.nonagon.ad.event.e;

public interface i extends a, com.google.android.gms.ads.internal.js.a, l, c, ab, e {
    void destroy();

    Activity f();

    Context g();

    Context getContext();

    int getHeight();

    void getLocationOnScreen(int[] arg1);

    ViewParent getParent();

    int getWidth();

    WebViewClient h();

    VersionInfoParcel i();

    ai j();

    void k();

    boolean l();

    void loadData(String arg1, String arg2, String arg3);

    void loadUrl(String arg1);

    n m();

    void measure(int arg1, int arg2);

    void n();

    void o();

    void p();

    void q();

    void setOnClickListener(View.OnClickListener arg1);

    void setOnTouchListener(View.OnTouchListener arg1);

    void setWebChromeClient(WebChromeClient arg1);

    void setWebViewClient(WebViewClient arg1);
}

