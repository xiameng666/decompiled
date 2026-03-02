package com.google.android.gms.ads.internal.mediation.client;

import abbr;
import com.google.android.gms.ads.formats.d;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.nativead.a;
import com.google.android.gms.ads.nativead.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class n implements k {
    private final Set a;
    private final boolean b;
    private final int c;
    private final NativeAdOptionsParcel d;
    private final List e;
    private final boolean f;
    private final Map g;

    public n(Set set0, boolean z, int v, NativeAdOptionsParcel nativeAdOptionsParcel0, List list0, boolean z1) {
        this.a = set0;
        this.b = z;
        this.c = v;
        this.d = nativeAdOptionsParcel0;
        this.f = z1;
        this.e = new ArrayList();
        this.g = new HashMap();
        if(list0 != null) {
            for(Object object0: list0) {
                String s = (String)object0;
                if(s.startsWith("custom:")) {
                    String[] arr_s = s.split(":", 3);
                    if(arr_s.length != 3) {
                        continue;
                    }
                    if("true".equals(arr_s[2])) {
                        this.g.put(arr_s[1], Boolean.valueOf(true));
                    }
                    else {
                        if(!"false".equals(arr_s[2])) {
                            continue;
                        }
                        this.g.put(arr_s[1], Boolean.valueOf(false));
                    }
                }
                else {
                    this.e.add(s);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.mediation.b
    public final int a() {
        return this.c;
    }

    @Override  // com.google.android.gms.ads.mediation.b
    public final Set b() {
        return this.a;
    }

    @Override  // com.google.android.gms.ads.mediation.b
    @Deprecated
    public final boolean c() {
        return this.f;
    }

    @Override  // com.google.android.gms.ads.mediation.b
    public final boolean d() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.mediation.k
    public final e e() {
        d d0 = new d();
        NativeAdOptionsParcel nativeAdOptionsParcel0 = this.d;
        if(nativeAdOptionsParcel0 == null) {
            return new e(d0);
        }
        switch(nativeAdOptionsParcel0.a) {
            case 2: {
                d0.f = nativeAdOptionsParcel0.e;
                d0.a = nativeAdOptionsParcel0.b;
                d0.b = nativeAdOptionsParcel0.c;
                d0.d = nativeAdOptionsParcel0.d;
                return new e(d0);
            }
            case 3: {
                break;
            }
            case 4: {
                d0.g = nativeAdOptionsParcel0.g;
                d0.c = nativeAdOptionsParcel0.h;
                break;
            }
            default: {
                d0.a = nativeAdOptionsParcel0.b;
                d0.b = nativeAdOptionsParcel0.c;
                d0.d = nativeAdOptionsParcel0.d;
                return new e(d0);
            }
        }
        VideoOptionsParcel videoOptionsParcel0 = nativeAdOptionsParcel0.f;
        if(videoOptionsParcel0 != null) {
            d0.e = new abbr(videoOptionsParcel0);
        }
        d0.f = nativeAdOptionsParcel0.e;
        d0.a = nativeAdOptionsParcel0.b;
        d0.b = nativeAdOptionsParcel0.c;
        d0.d = nativeAdOptionsParcel0.d;
        return new e(d0);
    }

    @Override  // com.google.android.gms.ads.mediation.k
    public final c f() {
        a a0 = new a();
        NativeAdOptionsParcel nativeAdOptionsParcel0 = this.d;
        if(nativeAdOptionsParcel0 == null) {
            return new c(a0);
        }
        int v = 2;
        switch(nativeAdOptionsParcel0.a) {
            case 2: {
                a0.e = nativeAdOptionsParcel0.e;
                a0.a = nativeAdOptionsParcel0.b;
                a0.c = nativeAdOptionsParcel0.d;
                return new c(a0);
            }
            case 3: {
                break;
            }
            case 4: {
                a0.f = nativeAdOptionsParcel0.g;
                a0.b = nativeAdOptionsParcel0.h;
                a0.g = nativeAdOptionsParcel0.j;
                a0.h = nativeAdOptionsParcel0.i;
                int v1 = nativeAdOptionsParcel0.k;
                if(v1 == 0) {
                    v = 1;
                }
                else {
                    switch(v1) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            v = 3;
                            break;
                        }
                        default: {
                            v = 1;
                        }
                    }
                }
                a0.i = v;
                break;
            }
            default: {
                a0.a = nativeAdOptionsParcel0.b;
                a0.c = nativeAdOptionsParcel0.d;
                return new c(a0);
            }
        }
        VideoOptionsParcel videoOptionsParcel0 = nativeAdOptionsParcel0.f;
        if(videoOptionsParcel0 != null) {
            a0.d = new abbr(videoOptionsParcel0);
        }
        a0.e = nativeAdOptionsParcel0.e;
        a0.a = nativeAdOptionsParcel0.b;
        a0.c = nativeAdOptionsParcel0.d;
        return new c(a0);
    }

    @Override  // com.google.android.gms.ads.mediation.k
    public final Map g() {
        return this.g;
    }

    @Override  // com.google.android.gms.ads.mediation.k
    public final boolean h() {
        return this.e.contains("3");
    }

    @Override  // com.google.android.gms.ads.mediation.k
    public final boolean i() {
        return this.e.contains("6");
    }
}

