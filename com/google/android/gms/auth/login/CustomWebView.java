package com.google.android.gms.auth.login;

import akgw;
import akgx;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.ModuleContext;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;
import hoxf;

public class CustomWebView extends WebView {
    boolean a;
    public boolean b;

    public CustomWebView(Context context0) {
        if(hoxf.g()) {
            context0 = CustomWebView.b(context0);
        }
        super(context0);
    }

    public CustomWebView(Context context0, AttributeSet attributeSet0) {
        if(hoxf.g()) {
            context0 = CustomWebView.b(context0);
        }
        super(context0, attributeSet0);
    }

    public CustomWebView(Context context0, AttributeSet attributeSet0, int v) {
        if(hoxf.g()) {
            context0 = CustomWebView.b(context0);
        }
        super(context0, attributeSet0, v);
    }

    public final void a() {
        this.a = true;
    }

    private static Context b(Context context0) {
        Context context1;
        for(context1 = context0; !(context1 instanceof Activity); context1 = ((ContextWrapper)context1).getBaseContext()) {
            if(!(context1 instanceof ContextWrapper)) {
                return context0;
            }
        }
        if((((Activity)context1) instanceof MinuteMaidChimeraActivity)) {
            ModuleContext moduleContext0 = ModuleContext.getModuleContext(context1);
            if(moduleContext0 != null) {
                Context context2 = moduleContext0.getContainerContext();
                ClassLoader classLoader0 = context2.getClass().getClassLoader();
                if(classLoader0 != null) {
                    return new akgw(context2, ((MinuteMaidChimeraActivity)(((Activity)context1))).B, classLoader0, moduleContext0);
                }
            }
        }
        return context0;
    }

    @Override  // android.webkit.WebView
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        editorInfo0.hintLocales = LocaleList.forLanguageTags("zz");
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        if(this.b && inputConnection0 != null) {
            if(editorInfo0.privateImeOptions == null) {
                editorInfo0.privateImeOptions = "escapeNorth";
                return new akgx(this, inputConnection0);
            }
            editorInfo0.privateImeOptions = editorInfo0.privateImeOptions + ",escapeNorth";
            return new akgx(this, inputConnection0);
        }
        return inputConnection0;
    }

    @Override  // android.webkit.WebView
    public final boolean performLongClick() {
        return this.a ? super.performLongClick() : true;
    }
}

