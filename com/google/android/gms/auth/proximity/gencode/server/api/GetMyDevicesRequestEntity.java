package com.google.android.gms.auth.proximity.gencode.server.api;

import a;
import alhj;
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

public final class GetMyDevicesRequestEntity extends FastSafeParcelableJsonResponse implements bakw {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    boolean b;
    boolean c;
    DeviceClassifierEntity d;
    int e;
    int f;
    private static final HashMap g;

    static {
        GetMyDevicesRequestEntity.CREATOR = new alhj();
        HashMap hashMap0 = new HashMap();
        GetMyDevicesRequestEntity.g = hashMap0;
        hashMap0.put("allowStaleRead", new FastJsonResponse.Field(6, false, 6, false, "allowStaleRead", 2, null));
        hashMap0.put("approvedForUnlockRequired", new FastJsonResponse.Field(6, false, 6, false, "approvedForUnlockRequired", 3, null));
        hashMap0.put("deviceClassifier", new FastJsonResponse.Field(11, false, 11, false, "deviceClassifier", 4, DeviceClassifierEntity.class));
        hashMap0.put("invocationReason", new FastJsonResponse.Field(0, false, 0, false, "invocationReason", 5, null));
        hashMap0.put("retryCount", new FastJsonResponse.Field(0, false, 0, false, "retryCount", 6, null));
    }

    public GetMyDevicesRequestEntity() {
        this.a = new HashSet();
    }

    public GetMyDevicesRequestEntity(Set set0, boolean z, boolean z1, DeviceClassifierEntity deviceClassifierEntity0, int v, int v1) {
        this.a = set0;
        this.b = z;
        this.c = z1;
        this.d = deviceClassifierEntity0;
        this.e = v;
        this.f = v1;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return Boolean.valueOf(this.b);
            }
            case 3: {
                return Boolean.valueOf(this.c);
            }
            case 4: {
                return this.d;
            }
            case 5: {
                return (int)this.e;
            }
            case 6: {
                return (int)this.f;
            }
            default: {
                throw new IllegalStateException("Unknown safe parcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return GetMyDevicesRequestEntity.g;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object object0) {
        if(!(object0 instanceof GetMyDevicesRequestEntity)) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        for(Object object1: GetMyDevicesRequestEntity.g.values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object1;
            if(this.e(fastJsonResponse$Field0)) {
                if(((GetMyDevicesRequestEntity)object0).e(fastJsonResponse$Field0) && this.a(fastJsonResponse$Field0).equals(((GetMyDevicesRequestEntity)object0).a(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((GetMyDevicesRequestEntity)object0).e(fastJsonResponse$Field0)) {
                return false;
            }
        }
        return true;
    }

    @Override  // bbgi
    public final void gF(FastJsonResponse.Field fastJsonResponse$Field0, String s, bbgi bbgi0) {
        int v = fastJsonResponse$Field0.g;
        if(v != 4) {
            throw new IllegalArgumentException(a.av(v, bbgi0, " is not a known custom type.  Found "));
        }
        this.d = (DeviceClassifierEntity)bbgi0;
        this.a.add(Integer.valueOf(4));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        switch(v1) {
            case 5: {
                this.e = v;
                break;
            }
            case 6: {
                this.f = v;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an int."));
            }
        }
        this.a.add(Integer.valueOf(v1));
    }

    @Override  // bbgi
    protected final void gp(FastJsonResponse.Field fastJsonResponse$Field0, String s, boolean z) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                this.b = z;
                break;
            }
            case 3: {
                this.c = z;
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
        for(Object object0: GetMyDevicesRequestEntity.g.values()) {
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
            baub.e(parcel0, 3, this.c);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.t(parcel0, 4, this.d, v, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.o(parcel0, 5, this.e);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.o(parcel0, 6, this.f);
        }
        baub.c(parcel0, v1);
    }
}

