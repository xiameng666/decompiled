package com.google.android.gms.auth.authzen.gencode.server.api;

import a;
import aijk;
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

public final class UpdateDeviceInfoRequestEntity extends FastSafeParcelableJsonResponse implements bakw {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    DeviceClassifierEntity b;
    String c;
    int d;
    String e;
    int f;
    private static final HashMap g;

    static {
        UpdateDeviceInfoRequestEntity.CREATOR = new aijk();
        HashMap hashMap0 = new HashMap();
        UpdateDeviceInfoRequestEntity.g = hashMap0;
        hashMap0.put("deviceClassifier", new FastJsonResponse.Field(11, false, 11, false, "deviceClassifier", 2, DeviceClassifierEntity.class));
        hashMap0.put("deviceInfoUpdate", new FastJsonResponse.Field(7, false, 7, false, "deviceInfoUpdate", 3, null));
        hashMap0.put("invocationReason", new FastJsonResponse.Field(0, false, 0, false, "invocationReason", 4, null));
        hashMap0.put("protocolType", new FastJsonResponse.Field(7, false, 7, false, "protocolType", 5, null));
        hashMap0.put("retryCount", new FastJsonResponse.Field(0, false, 0, false, "retryCount", 6, null));
    }

    public UpdateDeviceInfoRequestEntity() {
        this.a = new HashSet();
    }

    public UpdateDeviceInfoRequestEntity(Set set0, DeviceClassifierEntity deviceClassifierEntity0, String s, int v, String s1, int v1) {
        this.a = set0;
        this.b = deviceClassifierEntity0;
        this.c = s;
        this.d = v;
        this.e = s1;
        this.f = v1;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return this.b;
            }
            case 3: {
                return this.c;
            }
            case 4: {
                return (int)this.d;
            }
            case 5: {
                return this.e;
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
        return UpdateDeviceInfoRequestEntity.g;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object object0) {
        if(!(object0 instanceof UpdateDeviceInfoRequestEntity)) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        for(Object object1: UpdateDeviceInfoRequestEntity.g.values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object1;
            if(this.e(fastJsonResponse$Field0)) {
                if(((UpdateDeviceInfoRequestEntity)object0).e(fastJsonResponse$Field0) && this.a(fastJsonResponse$Field0).equals(((UpdateDeviceInfoRequestEntity)object0).a(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((UpdateDeviceInfoRequestEntity)object0).e(fastJsonResponse$Field0)) {
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

    @Override  // bbgi
    public final void gF(FastJsonResponse.Field fastJsonResponse$Field0, String s, bbgi bbgi0) {
        int v = fastJsonResponse$Field0.g;
        if(v != 2) {
            throw new IllegalArgumentException(a.av(v, bbgi0, " is not a known custom type.  Found "));
        }
        this.b = (DeviceClassifierEntity)bbgi0;
        this.a.add(Integer.valueOf(2));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        switch(v1) {
            case 4: {
                this.d = v;
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

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int v = 0;
        for(Object object0: UpdateDeviceInfoRequestEntity.g.values()) {
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
            baub.t(parcel0, 2, this.b, v, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.v(parcel0, 3, this.c, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.o(parcel0, 4, this.d);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.v(parcel0, 5, this.e, true);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.o(parcel0, 6, this.f);
        }
        baub.c(parcel0, v1);
    }
}

