package com.google.android.gms.auth.uiflows.consent;

import ProtoLiteMessage;
import ajcn;
import ajco;
import ajol;
import ajpt;
import amen;
import ames;
import amet;
import amez;
import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import bbmu;
import ca;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.login.CustomWebView;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import gqvn;
import hftc;
import hfur;
import hoxf;
import java.util.Locale;
import lup;

@GmsCoreVeId(0x3EC4F)
public class BrowserConsentChimeraActivity extends amez implements ames {
    public static final ajcn h;
    public static final ajcn i;
    public static final ajcn j;
    private amet k;

    static {
        BrowserConsentChimeraActivity.h = new ajcn("account");
        BrowserConsentChimeraActivity.i = new ajcn("url");
        BrowserConsentChimeraActivity.j = new ajcn("cookies");
    }

    @Override  // ames
    public final lup b() {
        return lup.a(this);
    }

    @Override  // amdx
    protected final String gQ() {
        return "BrowserConsentActivity";
    }

    @Override  // ames
    public final void k(String s) {
        if(s == null) {
            Log.w("Auth", String.format(Locale.US, "[BrowserConsentActivity] ConsentResult was null."));
            this.p();
            return;
        }
        Intent intent0 = new Intent();
        try {
            byte[] arr_b = bbmu.f(s);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqvn.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            if(((gqvn)hftv0).b) {
                ConsentResult consentResult0 = new ConsentResult(ajpt.c, ajol.b, s);
                intent0.putExtra(ConsentResult.a, consentResult0);
                this.gN(-1, intent0);
                return;
            }
            Log.i("Auth", String.format(Locale.US, "[BrowserConsentActivity] ConsentResult cookie present, but consent was not granted."));
            this.p();
        }
        catch(IllegalArgumentException | hfur unused_ex) {
            Log.w("Auth", String.format(Locale.US, "[BrowserConsentActivity] ConsentResult cookie string present, but was invalid and could not be parsed."));
            this.p();
        }
    }

    @Override  // ames
    public final void l() {
        this.p();
    }

    @Override  // ames
    public final void o(String s) {
        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }

    @Override  // xnz
    public final void onBackPressed() {
        CustomWebView customWebView0 = this.k.b;
        if(customWebView0.canGoBack()) {
            customWebView0.goBack();
            return;
        }
        this.p();
        super.onBackPressed();
    }

    @Override  // amez
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        amet amet0 = (amet)this.gy().h("browser");
        this.k = amet0;
        if(amet0 == null) {
            Parcelable[] arr_parcelable = (Parcelable[])this.x().a(BrowserConsentChimeraActivity.j);
            BrowserResolutionCookie[] arr_browserResolutionCookie = new BrowserResolutionCookie[0];
            if(arr_parcelable != null) {
                arr_browserResolutionCookie = new BrowserResolutionCookie[arr_parcelable.length];
                for(int v = 0; v < arr_parcelable.length; ++v) {
                    arr_browserResolutionCookie[v] = (BrowserResolutionCookie)arr_parcelable[v];
                }
            }
            Account account0 = (Account)this.x().a(BrowserConsentChimeraActivity.h);
            String s = (String)this.x().a(BrowserConsentChimeraActivity.i);
            amet amet1 = new amet();
            ajco ajco0 = new ajco();
            ajco0.d(amet.c, account0);
            ajco0.d(amet.d, s);
            ajco0.d(amet.ag, arr_browserResolutionCookie);
            amet1.setArguments(ajco0.a);
            this.k = amet1;
            ca ca0 = new ca(this.gy());
            ca0.u(0x1020002, this.k, "browser");
            ca0.a();
        }
        if(hoxf.a.b().n()) {
            amen.a(this);
        }
    }

    private final void p() {
        Intent intent0 = new Intent();
        ConsentResult consentResult0 = new ConsentResult(ajpt.A, null, null, ajol.c, null);
        this.gN(0, intent0.putExtra(ConsentResult.a, consentResult0));
    }
}

