package com.google.android.gms.auth.proximity.gencode.server.api;

import a;
import alhk;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bakw;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GetMyDevicesResponseEntity extends FastSafeParcelableJsonResponse implements bakw {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public List b;
    private static final HashMap c;

    static {
        GetMyDevicesResponseEntity.CREATOR = new alhk();
        HashMap hashMap0 = new HashMap();
        GetMyDevicesResponseEntity.c = hashMap0;
        hashMap0.put("devices", new FastJsonResponse.Field(11, true, 11, true, "devices", 2, ExternalDeviceInfoEntity.class));
    }

    public GetMyDevicesResponseEntity() {
        this.a = new HashSet();
    }

    public GetMyDevicesResponseEntity(Set set0, List list0) {
        this.a = set0;
        this.b = list0;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        if(v == 2) {
            return this.b;
        }
        throw new IllegalStateException("Unknown safe parcelable id=" + v);
    }

    @Override  // bbgi
    public final Map b() {
        return GetMyDevicesResponseEntity.c;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object object0) {
        if(!(object0 instanceof GetMyDevicesResponseEntity)) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        for(Object object1: GetMyDevicesResponseEntity.c.values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object1;
            if(this.e(fastJsonResponse$Field0)) {
                if(((GetMyDevicesResponseEntity)object0).e(fastJsonResponse$Field0) && this.a(fastJsonResponse$Field0).equals(((GetMyDevicesResponseEntity)object0).a(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((GetMyDevicesResponseEntity)object0).e(fastJsonResponse$Field0)) {
                return false;
            }
        }
        return true;
    }

    @Override  // bbgi
    public final void gE(FastJsonResponse.Field fastJsonResponse$Field0, String s, ArrayList arrayList0) {
        int v = fastJsonResponse$Field0.g;
        if(v != 2) {
            throw new IllegalArgumentException(a.P((arrayList0 == null ? "null" : arrayList0.getClass().getCanonicalName()), v, "Field with id=", " is not a known array of custom type.  Found ", "."));
        }
        this.b = arrayList0;
        this.a.add(Integer.valueOf(2));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int v = 0;
        for(Object object0: GetMyDevicesResponseEntity.c.values()) {
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
        int v1 = baub.a(parcel0);
        if(this.a.contains(Integer.valueOf(2))) {
            baub.y(parcel0, 2, this.b, true);
        }
        baub.c(parcel0, v1);
    }
}

