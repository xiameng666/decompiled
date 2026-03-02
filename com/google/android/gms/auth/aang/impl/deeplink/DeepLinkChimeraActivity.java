package com.google.android.gms.auth.aang.impl.deeplink;

import adgb;
import amdb;
import amdi;
import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import bagx;
import bbdg;
import bboh;
import ccmq;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import ggtj;
import hfuo;
import hoyc;
import ibpo;
import ibuq;
import ibzk;
import java.util.Collection;
import java.util.Set;
import xnz;

@GmsCoreVeId(257107)
public final class DeepLinkChimeraActivity extends xnz {
    private final bboh h;

    public DeepLinkChimeraActivity() {
        this.h = adgb.a("DeepLinkChimeraActivity");
    }

    @Override  // xnz
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.lX);
        super.onCreate(bundle0);
        if(hoyc.c()) {
            ((ggtj)this.h.j()).x("DeepLink handling is disabled");
            this.finish();
            return;
        }
        Uri uri0 = this.getIntent().getData();
        if(ibuq.m("android.intent.action.VIEW", this.getIntent().getAction()) && uri0 != null) {
            String s = uri0.toString();
            Uri uri1 = Uri.parse(s);
            if(ibuq.m(uri1.getScheme(), "https")) {
                hoyc hoyc0 = hoyc.a;
                if(hoyc0.b().a().b.contains(uri1.getHost())) {
                    String s1 = uri1.getPath();
                    if(s1 != null) {
                        hfuo hfuo0 = hoyc0.b().b().b;
                        ibuq.e(hfuo0, "getElementList(...)");
                        if(!(hfuo0 instanceof Collection) || !hfuo0.isEmpty()) {
                            for(Object object0: hfuo0) {
                                ibuq.c(((String)object0));
                                if(ibzk.W(s1, ((String)object0))) {
                                    Uri uri2 = Uri.parse(s);
                                    if(uri2.isHierarchical()) {
                                        Set set0 = uri2.getQueryParameterNames();
                                        ibuq.e(set0, "getQueryParameterNames(...)");
                                        Set set1 = ibpo.ax(set0);
                                        if(set1.contains("flow")) {
                                            set1.remove("flow");
                                        }
                                        Uri.Builder uri$Builder0 = uri2.buildUpon().clearQuery();
                                        for(Object object1: set1) {
                                            String s2 = (String)object1;
                                            for(Object object2: uri2.getQueryParameters(s2)) {
                                                uri$Builder0.appendQueryParameter(s2, ((String)object2));
                                            }
                                        }
                                        uri$Builder0.appendQueryParameter("flow", "android");
                                        s = uri$Builder0.build().toString();
                                        ibuq.e(s, "toString(...)");
                                    }
                                    else {
                                        ((ggtj)this.h.j()).x("updateQueryParam: error parsing url - not hierarchical");
                                    }
                                    Context context0 = AppContextProvider.a();
                                    ibuq.e(context0, "getApplicationContext(...)");
                                    amdb amdb0 = new amdb("com.google", false, false, false, false, false, bagx.b(null), null, null, null, null, null, null, null, false, false, false, false, s, null, null, 0, 0, false, true);
                                    this.startActivity(amdi.d.a(context0, amdb0));
                                    this.finish();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            ((ggtj)this.h.j()).B("Invalid url: %s", s);
            this.finish();
            return;
        }
        ((ggtj)this.h.j()).R("Invalid intent: action=%s, data=%s", this.getIntent().getAction(), uri0);
        this.finish();
    }
}

