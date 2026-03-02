package com.google.android.gms.ads.nonagon.util.logging.cui;

import aazy;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.flag.h;
import com.google.android.gms.ads.internal.util.future.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class l implements Runnable {
    private final List a;
    private final o b;
    private p c;
    private Future d;
    private int e;

    public l(o o0) {
        this.a = new ArrayList();
        this.e = 2;
        this.c = p.b;
        this.b = o0;
    }

    public final void a() {
        synchronized(this) {
            if(!((Boolean)h.c.d()).booleanValue()) {
                return;
            }
            Future future0 = this.d;
            if(future0 != null) {
                future0.cancel(false);
            }
            List list0 = this.a;
            for(Object object0: list0) {
                b b0 = (b)object0;
                int v1 = this.e;
                if(v1 != 2) {
                    b0.g(v1);
                }
                if(!TextUtils.isEmpty(null)) {
                    b0.e();
                }
                if(!TextUtils.isEmpty(null) && !b0.b()) {
                    b0.d();
                }
                b0.f(this.c);
                f f0 = b0.c();
                this.b.b(f0);
            }
            list0.clear();
        }
    }

    public final void b(b b0) {
        synchronized(this) {
            if(((Boolean)h.c.d()).booleanValue()) {
                b0.l();
                this.a.add(b0);
                Future future0 = this.d;
                if(future0 != null) {
                    future0.cancel(false);
                }
                long v1 = (long)(((int)(((Integer)s.bo.g()))));
                this.d = e.b.schedule(this, v1, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void c(ArrayList arrayList0) {
        synchronized(this) {
            if(((Boolean)h.c.d()).booleanValue()) {
                if(arrayList0.contains("banner") || arrayList0.contains(aazy.a.name())) {
                    goto label_26;
                }
                if(arrayList0.contains("interstitial") || arrayList0.contains(aazy.b.name())) {
                    this.e = 4;
                    return;
                }
                if(arrayList0.contains("native") || arrayList0.contains(aazy.e.name())) {
                    this.e = 8;
                    return;
                }
                if(arrayList0.contains("rewarded") || arrayList0.contains(aazy.c.name())) {
                    this.e = 5;
                    return;
                }
                if(arrayList0.contains("app_open_ad")) {
                    this.e = 7;
                    return;
                }
                if(arrayList0.contains("rewarded_interstitial") || arrayList0.contains(aazy.d.name())) {
                    this.e = 6;
                    return;
                label_26:
                    this.e = 3;
                }
            }
        }
    }

    public final void d(Bundle bundle0) {
        p p0;
        synchronized(this) {
            if(((Boolean)h.c.d()).booleanValue()) {
                Bundle bundle1 = bundle0.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
                if(bundle1 != null) {
                    bundle0 = bundle1;
                }
                String s = bundle0.getString("query_info_type");
                if(TextUtils.isEmpty(s)) {
                    p0 = p.b;
                }
                else {
                    switch(s) {
                        case "requester_type_0": {
                            p0 = p.a;
                            break;
                        }
                        case "requester_type_1": {
                            p0 = p.c;
                            break;
                        }
                        case "requester_type_2": {
                            p0 = p.d;
                            break;
                        }
                        case "requester_type_3": {
                            p0 = p.e;
                            break;
                        }
                        case "requester_type_4": {
                            p0 = p.f;
                            break;
                        }
                        case "requester_type_5": {
                            p0 = p.g;
                            break;
                        }
                        case "requester_type_6": {
                            p0 = p.h;
                            break;
                        }
                        case "requester_type_7": {
                            p0 = p.i;
                            break;
                        }
                        case "requester_type_8": {
                            p0 = p.j;
                            break;
                        }
                        default: {
                            p0 = p.b;
                        }
                    }
                }
                this.c = p0;
            }
        }
    }

    @Override
    public final void run() {
        synchronized(this) {
            this.a();
        }
    }
}

