package com.google.android.gms.cast.service;

import android.content.Intent;
import android.text.TextUtils;
import avbv;
import avjh;
import avjn;
import avzf;
import bayn;
import bbnk;
import cjpa;
import cjpc;
import cjpd;
import cjqh;
import com.google.android.gms.chimera.modules.cast.AppContextProvider;
import evuh;
import java.util.Map;
import java.util.Set;

public class CastInitIntentOperation extends avzf {
    static final String[] a;
    private final avjh b;

    static {
        CastInitIntentOperation.a = new String[]{"CAST_ACTIVE_NETWORK_MAP", "PREF_CAST_SENDER_NONCE", "PREF_CAST_SENDER_ID"};
    }

    public CastInitIntentOperation() {
        this.b = new avjh("CastInitIntentOperation");
    }

    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
        String[] arr_s = CastInitIntentOperation.a;
        int v = 0;
        while(v < 3) {
            String s = arr_s[v];
            cjpa cjpa0 = avjn.e(this.getApplicationContext()).c();
            cjpc cjpc0 = cjqh.a(this.getApplicationContext(), "cast", s, 0);
            Map map0 = cjpd.d(cjpc0);
            for(Object object0: map0.keySet()) {
                String s1 = (String)object0;
                Object object1 = map0.get(s1);
                if((object1 instanceof Boolean)) {
                    cjpa0.e(s1, ((Boolean)object1).booleanValue());
                }
                else if((object1 instanceof String)) {
                    cjpa0.h(s1, ((String)object1));
                }
                else if((object1 instanceof Float)) {
                    cjpa0.c(s1, ((Float)object1).floatValue());
                }
                else if((object1 instanceof Integer)) {
                    cjpa0.f(s1, ((Integer)object1).intValue());
                }
                else if((object1 instanceof Long)) {
                    cjpa0.g(s1, ((Long)object1).longValue());
                }
                else {
                    if(!(object1 instanceof Set)) {
                        continue;
                    }
                    cjpa0.i(s1, ((Set)object1));
                }
            }
            cjpd.f(cjpa0);
            cjpa cjpa1 = cjpc0.c();
            cjpa1.d();
            cjpd.f(cjpa1);
            ++v;
        }
        this.e();
    }

    @Override  // avzf
    protected final void c(Intent intent0) {
        cjpc cjpc0 = avjn.e(this.getApplicationContext());
        cjpa cjpa0 = cjpc0.c();
        cjpa0.j("PREF_CAST_SENDER_NONCE");
        cjpd.f(cjpa0);
        cjpa cjpa1 = cjpc0.c();
        cjpa1.j("PREF_CAST_SENDER_NONCE_GENERATED_TIME");
        cjpd.f(cjpa1);
    }

    @Override  // avzf
    protected final void d(Intent intent0, boolean z) {
        this.e();
    }

    private final void e() {
        bayn bayn0 = bayn.f(AppContextProvider.a());
        Set set0 = new avbv(this, bbnk.a).b();
        if(bayn0 != null && !set0.isEmpty()) {
            String s = TextUtils.join(", ", set0);
            this.b.p("Removing %d RCNs: %s", Integer.valueOf(set0.size()), s);
            for(Object object0: set0) {
                bayn0.o("CastRCN", ((Integer)object0).intValue(), evuh.D);
            }
        }
    }
}

