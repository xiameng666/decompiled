package com.google.android.gms.auth.authzen.gencode.server.api;

import a;
import aijc;
import aijd;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class DeviceClassifierEntity extends FastSafeParcelableJsonResponse implements aijc {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    long b;
    String c;
    long d;
    String e;
    private static final HashMap f;

    static {
        DeviceClassifierEntity.CREATOR = new aijd();
        HashMap hashMap0 = new HashMap();
        DeviceClassifierEntity.f = hashMap0;
        hashMap0.put("deviceOsVersionCode", new FastJsonResponse.Field(2, false, 2, false, "deviceOsVersionCode", 2, null));
        hashMap0.put("deviceSoftwarePackage", new FastJsonResponse.Field(7, false, 7, false, "deviceSoftwarePackage", 3, null));
        hashMap0.put("deviceSoftwareVersionCode", new FastJsonResponse.Field(2, false, 2, false, "deviceSoftwareVersionCode", 4, null));
        hashMap0.put("deviceType", new FastJsonResponse.Field(7, false, 7, false, "deviceType", 5, null));
    }

    public DeviceClassifierEntity() {
        this.a = new HashSet();
    }

    public DeviceClassifierEntity(Set set0, long v, String s, long v1, String s1) {
        this.a = set0;
        this.b = v;
        this.c = s;
        this.d = v1;
        this.e = s1;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return (long)this.b;
            }
            case 3: {
                return this.c;
            }
            case 4: {
                return (long)this.d;
            }
            case 5: {
                return this.e;
            }
            default: {
                throw new IllegalStateException("Unknown safe parcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return DeviceClassifierEntity.f;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object object0) {
        if(!(object0 instanceof DeviceClassifierEntity)) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        for(Object object1: DeviceClassifierEntity.f.values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object1;
            if(this.e(fastJsonResponse$Field0)) {
                if(((DeviceClassifierEntity)object0).e(fastJsonResponse$Field0) && this.a(fastJsonResponse$Field0).equals(((DeviceClassifierEntity)object0).a(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((DeviceClassifierEntity)object0).e(fastJsonResponse$Field0)) {
                return false;
            }
        }
        return true;
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 3: {
                this.c = s1;
                break;
            }
            case 5: {
                this.e = s1;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a String."));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int v = 0;
        for(Object object0: DeviceClassifierEntity.f.values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object0;
            if(this.e(fastJsonResponse$Field0)) {
                int v1 = this.a(fastJsonResponse$Field0).hashCode();
                v = v + fastJsonResponse$Field0.g + v1;
            }
        }
        return v;
    }

    @Override  // bbgi
    protected final void k(FastJsonResponse.Field fastJsonResponse$Field0, String s, long v) {
        int v1 = fastJsonResponse$Field0.g;
        switch(v1) {
            case 2: {
                this.b = v;
                break;
            }
            case 4: {
                this.d = v;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be a long."));
            }
        }
        this.a.add(Integer.valueOf(v1));
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
            baub.q(parcel0, 2, this.b);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.v(parcel0, 3, this.c, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.q(parcel0, 4, this.d);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.v(parcel0, 5, this.e, true);
        }
        baub.c(parcel0, v1);
    }
}

