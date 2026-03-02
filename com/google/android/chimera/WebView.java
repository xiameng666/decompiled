package com.google.android.chimera;

import a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import wyd;
import wzq;

@ChimeraApiVersion(added = 0L)
public class WebView extends android.webkit.WebView {
    public WebView(Context context0) {
        super(context0);
        WebView.a(context0);
    }

    public WebView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        WebView.a(context0);
    }

    public WebView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        WebView.a(context0);
    }

    public WebView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        WebView.a(context0);
    }

    public WebView(Context context0, AttributeSet attributeSet0, int v, boolean z) {
        super(context0, attributeSet0, v, z);
        WebView.a(context0);
    }

    private static final void a(Context context0) {
        ApplicationInfo applicationInfo0;
        ModuleContext moduleContext0 = ModuleContext.getModuleContext(context0);
        if(moduleContext0 != null) {
            wzq wzq0 = moduleContext0.getModuleApk();
            if(!(wzq0 instanceof wyd)) {
                try {
                    applicationInfo0 = wzq0.b();
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    Log.e("ChimeraWebView", a.b(wzq0, "Failed to obtain the resources for ", ". Skipping injection of WebView resources."), packageManager$NameNotFoundException0);
                    return;
                }
                ApplicationInfo applicationInfo1 = moduleContext0.overrideApplicationInfo(applicationInfo0);
                try {
                    new android.webkit.WebView(context0);
                }
                finally {
                    moduleContext0.overrideApplicationInfo(applicationInfo1);
                }
            }
        }
    }
}

