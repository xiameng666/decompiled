package com.google.android.gms.recaptcha;

import bbcu;
import bboh;
import bhnc;
import bhnd;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ejnv;
import ejps;
import ejqj;
import ejqk;
import ggnj;
import hfwn;
import hfyg;
import hxsb;
import j..time.Duration;

public class RecaptchaApiChimeraService extends cjtg {
    protected hfwn a;
    protected bhnd b;
    private final ejqj c;

    static {
        bboh.b("RecaptchaApiService", bbcu.dg);
    }

    public RecaptchaApiChimeraService() {
        this(new ejqk(), new ejnv());
    }

    protected RecaptchaApiChimeraService(ejqj ejqj0, ejnv ejnv0) {
        super(205, "com.google.android.gms.recaptcha.service.START", ggnj.a, 3, 9);
        this.c = ejqj0;
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new ejps(this, this.l(), getServiceRequest0.f));
    }

    public final bhnd c() {
        synchronized(this) {
            if(this.b != null && this.b.b()) {
                hfwn hfwn0 = this.a;
                hfwn hfwn1 = this.c.a();
                if(Duration.between(hfyg.d(hfwn0), hfyg.d(hfwn1)).toSeconds() > hxsb.a.d().a()) {
                    this.b = bhnc.a(this, "recaptcha-android");
                    this.a = this.c.a();
                }
            }
            else {
                this.b = bhnc.a(this, "recaptcha-android");
                this.a = this.c.a();
            }
        }
        return this.b;
    }

    public final boolean d() {
        synchronized(this) {
            if(this.b != null && this.b.b()) {
                this.b.close();
                this.b = null;
                return true;
            }
        }
        return false;
    }
}

