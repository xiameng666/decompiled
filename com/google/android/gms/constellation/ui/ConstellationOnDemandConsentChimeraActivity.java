package com.google.android.gms.constellation.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import baun;
import bbdg;
import bblp;
import bbzr;
import bcbk;
import bcbm;
import bccz;
import bcpv;
import bcqx;
import bcqy;
import bcrc;
import bcrh;
import ccmp;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import gfta;
import gmfx;
import gmfz;
import gmgd;
import hodo;
import hreo;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import xni;

@GmsCoreVeId(0x3F2F3)
public final class ConstellationOnDemandConsentChimeraActivity extends xni {
    public static final baun j;
    public final UUID k;
    public int l;
    private final ExecutorService m;
    private boolean n;
    private boolean o;
    private bcbm p;
    private String q;
    private String r;

    static {
        ConstellationOnDemandConsentChimeraActivity.j = bcrh.a("on_demand_consent");
    }

    public ConstellationOnDemandConsentChimeraActivity() {
        this.m = new bblp(1, 9);
        this.k = UUID.randomUUID();
        this.n = false;
        this.o = false;
        this.l = 0;
    }

    public final boolean a(String s) {
        return this.getIntent().getBooleanExtra(s, false);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void finish() {
        gmfx gmfx0;
        bcbk bcbk1;
        if(this.l == -1 && TextUtils.isEmpty(this.r)) {
            this.l = 7;
        }
        ConstellationOnDemandConsentChimeraActivity.j.d("Finishing with result code: %d", new Object[]{((int)this.l)});
        Intent intent0 = new Intent();
        bcqx bcqx0 = bcqx.a(this);
        bcbk bcbk0 = bcbk.f;
        int v = this.l;
        if(v == -1) {
            boolean z = this.q != null && this.q.equals("CONSENTED");
            intent0.putExtra("account_name_key", this.r);
            intent0.putExtra("consent_status_key", (z ? hodo.b : hodo.c).a());
            String s = this.getCallingPackage();
            bcqx0.q(this.k, gmfz.be, s, (z ? gmgd.j : gmgd.k));
            bcbk1 = z ? bcbk.b : bcbk.c;
        }
        else {
            if(v == 0) {
                bcbk0 = bcbk.e;
            }
            UUID uUID0 = this.k;
            gmfz gmfz0 = gmfz.be;
            String s1 = this.getCallingPackage();
            switch(this.l) {
                case 1: {
                    gmfx0 = gmfx.bc;
                    break;
                }
                case 2: {
                    gmfx0 = gmfx.bd;
                    break;
                }
                case 3: {
                    gmfx0 = gmfx.be;
                    break;
                }
                case 4: {
                    gmfx0 = gmfx.bf;
                    break;
                }
                case 5: {
                    gmfx0 = gmfx.bi;
                    break;
                }
                case 6: {
                    gmfx0 = gmfx.aA;
                    break;
                }
                case 7: {
                    gmfx0 = gmfx.bg;
                    break;
                }
                case 8: {
                    gmfx0 = gmfx.bh;
                    break;
                }
                case 9: {
                    gmfx0 = gmfx.bj;
                    break;
                }
                default: {
                    gmfx0 = gmfx.bb;
                }
            }
            bcqx0.k(uUID0, gmfz0, s1, gmfx0);
            bcbk1 = bcbk0;
        }
        if(this.o) {
            int v1 = this.l;
            if(v1 != 9) {
                switch(v1) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: {
                        break;
                    }
                    default: {
                        bcbm bcbm0 = this.p;
                        if(bcbm0 != null) {
                            try {
                                bcbm0.e(bcbk1, this.getCallingPackage());
                            }
                            catch(bcrc bcrc0) {
                                ConstellationOnDemandConsentChimeraActivity.j.g("Error storing impression", bcrc0, new Object[0]);
                            }
                        }
                    }
                }
            }
        }
        this.setResult(this.l, intent0);
        super.finish();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final String getCallingPackage() {
        return gfta.b(super.getCallingPackage());
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1) {
            if(v1 != -1) {
            label_12:
                switch(v1) {
                    case -1: {
                        ConstellationOnDemandConsentChimeraActivity.j.d("Webview resulted ok without any output", new Object[0]);
                        this.l = 8;
                        break;
                    }
                    case 0: {
                        ConstellationOnDemandConsentChimeraActivity.j.d("Webview resulted canceled", new Object[0]);
                        this.l = 0;
                    }
                }
            }
            else if(intent0 != null) {
                this.r = intent0.getStringExtra("authAccount");
                String s = intent0.getStringExtra("result.consent_result_key");
                this.q = s;
                if(!TextUtils.isEmpty(s)) {
                    ConstellationOnDemandConsentChimeraActivity.j.d("Webview resulted ok, accountName: %s, status: %s", new Object[]{gfta.b(this.r), gfta.b(this.q)});
                    this.l = -1;
                }
            }
            else {
                v1 = -1;
                goto label_12;
            }
            this.finish();
        }
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.n = hreo.e();
        hreo hreo0 = hreo.a;
        this.o = hreo0.d().l();
        this.getApplicationContext();
        new ccmp().a(bbdg.ei);
        if(!hreo.f()) {
            this.l = 1;
            goto label_31;
        }
        if(!hreo0.d().f().b.contains(this.getCallingPackage())) {
            this.l = 9;
            goto label_31;
        }
        bcpv.a(this);
        if(!bcpv.b(this)) {
            this.l = 2;
            goto label_31;
        }
        if(this.o) {
            try {
                bbzr.b();
                this.p = bbzr.c(this, 1);
            }
            catch(bcqy unused_ex) {
                this.l = 1;
                goto label_31;
            }
            if(this.n && (!this.a("bypass_annoyance_check_key") || !hreo.a.d().e().b.contains(this.getCallingPackage()))) {
                bcbm bcbm0 = this.p;
                if(bcbm0 != null) {
                    try {
                        if(bcbm0.a(hreo.b()) >= hreo.c()) {
                            this.l = 5;
                            goto label_31;
                        }
                        goto label_33;
                    }
                    catch(bcrc bcrc0) {
                        ConstellationOnDemandConsentChimeraActivity.j.g("Error accessing impressions", bcrc0, new Object[0]);
                        this.l = 6;
                    }
                label_31:
                    this.finish();
                    return;
                }
            }
        }
    label_33:
        String s = Locale.getDefault().toLanguageTag();
        String s1 = Uri.parse(hreo.a.d().h()).buildUpon().appendQueryParameter("hl", s).build().toString();
        String s2 = Uri.parse(hreo.a.d().g()).buildUpon().appendQueryParameter("continue", s1).appendQueryParameter("hl", s).build().toString();
        ConstellationOnDemandConsentChimeraActivity.j.j("Loading URL: %s", new Object[]{s2});
        bccz bccz0 = new bccz(this, s2);
        this.m.execute(bccz0);
    }
}

