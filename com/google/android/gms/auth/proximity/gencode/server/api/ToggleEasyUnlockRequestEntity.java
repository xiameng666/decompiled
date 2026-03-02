package com.google.android.gms.auth.proximity.gencode.server.api;

import a;
import alhl;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bakw;
import baub;
import bbgi;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class ToggleEasyUnlockRequestEntity extends FastSafeParcelableJsonResponse implements bakw {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    boolean b;
    DeviceClassifierEntity c;
    boolean d;
    String e;
    boolean f;
    String g;
    private static final HashMap h;

    static {
        ToggleEasyUnlockRequestEntity.CREATOR = new alhl();
        HashMap hashMap0 = new HashMap();
        ToggleEasyUnlockRequestEntity.h = hashMap0;
        hashMap0.put("applyToAll", new FastJsonResponse.Field(6, false, 6, false, "applyToAll", 2, null));
        hashMap0.put("deviceClassifier", new FastJsonResponse.Field(11, false, 11, false, "deviceClassifier", 3, DeviceClassifierEntity.class));
        hashMap0.put("enable", new FastJsonResponse.Field(6, false, 6, false, "enable", 4, null));
        hashMap0.put("feature", new FastJsonResponse.Field(7, false, 7, false, "feature", 5, null));
        hashMap0.put("isExclusive", new FastJsonResponse.Field(6, false, 6, false, "isExclusive", 6, null));
        hashMap0.put("publicKey", new FastJsonResponse.Field(7, false, 7, false, "publicKey", 7, null));
    }

    public ToggleEasyUnlockRequestEntity() {
        this.a = new HashSet();
    }

    public ToggleEasyUnlockRequestEntity(Set set0, boolean z, DeviceClassifierEntity deviceClassifierEntity0, boolean z1, String s, boolean z2, String s1) {
        this.a = set0;
        this.b = z;
        this.c = deviceClassifierEntity0;
        this.d = z1;
        this.e = s;
        this.f = z2;
        this.g = s1;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return Boolean.valueOf(this.b);
            }
            case 3: {
                return this.c;
            }
            case 4: {
                return Boolean.valueOf(this.d);
            }
            case 5: {
                return this.e;
            }
            case 6: {
                return Boolean.valueOf(this.f);
            }
            case 7: {
                return this.g;
            }
            default: {
                throw new IllegalStateException("Unknown safe parcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return ToggleEasyUnlockRequestEntity.h;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object object0) {
        if(!(object0 instanceof ToggleEasyUnlockRequestEntity)) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        for(Object object1: ToggleEasyUnlockRequestEntity.h.values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object1;
            if(this.e(fastJsonResponse$Field0)) {
                if(((ToggleEasyUnlockRequestEntity)object0).e(fastJsonResponse$Field0) && this.a(fastJsonResponse$Field0).equals(((ToggleEasyUnlockRequestEntity)object0).a(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((ToggleEasyUnlockRequestEntity)object0).e(fastJsonResponse$Field0)) {
                return false;
            }
        }
        return true;
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 5: {
                this.e = s1;
                break;
            }
            case 7: {
                this.g = s1;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a String."));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    public final void gF(FastJsonResponse.Field fastJsonResponse$Field0, String s, bbgi bbgi0) {
        int v = fastJsonResponse$Field0.g;
        if(v != 3) {
            throw new IllegalArgumentException(a.av(v, bbgi0, " is not a known custom type.  Found "));
        }
        this.c = (DeviceClassifierEntity)bbgi0;
        this.a.add(Integer.valueOf(3));
    }

    @Override  // bbgi
    protected final void gp(FastJsonResponse.Field fastJsonResponse$Field0, String s, boolean z) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                this.b = z;
                break;
            }
            case 4: {
                this.d = z;
                break;
            }
            case 6: {
                this.f = z;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a boolean."));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int v = 0;
        for(Object object0: ToggleEasyUnlockRequestEntity.h.values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object0;
            if(this.e(fastJsonResponse$Field0)) {
                int v1 = this.a(fastJsonResponse$Field0).hashCode();
                v = v + fastJsonResponse$Field0.g + v1;
            }
        }
        return v;
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(2))) {
            baub.e(parcel0, 2, this.b);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.t(parcel0, 3, this.c, v, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.e(parcel0, 4, this.d);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.v(parcel0, 5, this.e, true);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.e(parcel0, 6, this.f);
        }
        if(set0.contains(Integer.valueOf(7))) {
            baub.v(parcel0, 7, this.g, true);
        }
        baub.c(parcel0, v1);
    }
}

