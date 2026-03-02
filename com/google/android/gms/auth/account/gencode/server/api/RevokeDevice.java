package com.google.android.gms.auth.account.gencode.server.api;

import a;
import adoj;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class RevokeDevice extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    String b;
    private static final HashMap c;

    static {
        RevokeDevice.CREATOR = new adoj();
        HashMap hashMap0 = new HashMap();
        RevokeDevice.c = hashMap0;
        hashMap0.put("version_info", new FastJsonResponse.Field(7, false, 7, false, "version_info", 2, null));
    }

    public RevokeDevice() {
        this.a = new HashSet();
    }

    public RevokeDevice(Set set0, String s) {
        this.a = set0;
        this.b = s;
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
        return RevokeDevice.c;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object object0) {
        if(!(object0 instanceof RevokeDevice)) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        for(Object object1: RevokeDevice.c.values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object1;
            if(this.e(fastJsonResponse$Field0)) {
                if(((RevokeDevice)object0).e(fastJsonResponse$Field0) && this.a(fastJsonResponse$Field0).equals(((RevokeDevice)object0).a(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((RevokeDevice)object0).e(fastJsonResponse$Field0)) {
                return false;
            }
        }
        return true;
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.g;
        if(v != 2) {
            throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a String."));
        }
        this.b = s1;
        this.a.add(Integer.valueOf(2));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int v = 0;
        for(Object object0: RevokeDevice.c.values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object0;
            if(this.e(fastJsonResponse$Field0)) {
                int v1 = this.a(fastJsonResponse$Field0).hashCode();
                v = v + fastJsonResponse$Field0.g + v1;
            }
        }
        return v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        if(this.a.contains(Integer.valueOf(2))) {
            baub.v(parcel0, 2, this.b, true);
        }
        baub.c(parcel0, v1);
    }
}

