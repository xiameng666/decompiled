package com.google.android.gms.auth.authzen.gencode.server.api;

import a;
import aijg;
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

public final class SyncTxRequestEntity extends FastSafeParcelableJsonResponse implements bakw {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    String b;
    String c;
    String d;
    List e;
    private static final HashMap f;

    static {
        SyncTxRequestEntity.CREATOR = new aijg();
        HashMap hashMap0 = new HashMap();
        SyncTxRequestEntity.f = hashMap0;
        hashMap0.put("accountName", new FastJsonResponse.Field(7, false, 7, false, "accountName", 2, null));
        hashMap0.put("deviceId", new FastJsonResponse.Field(7, false, 7, false, "deviceId", 3, null));
        hashMap0.put("secureSyncRequest", new FastJsonResponse.Field(7, false, 7, false, "secureSyncRequest", 4, null));
        hashMap0.put("seenWebViewPromptTxIds", new FastJsonResponse.Field(7, true, 7, true, "seenWebViewPromptTxIds", 5, null));
    }

    public SyncTxRequestEntity() {
        this.a = new HashSet();
    }

    public SyncTxRequestEntity(Set set0, String s, String s1, String s2, List list0) {
        this.a = set0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = list0;
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
                return this.d;
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
        return SyncTxRequestEntity.f;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object object0) {
        if(!(object0 instanceof SyncTxRequestEntity)) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        for(Object object1: SyncTxRequestEntity.f.values()) {
            FastJsonResponse.Field fastJsonResponse$Field0 = (FastJsonResponse.Field)object1;
            if(this.e(fastJsonResponse$Field0)) {
                if(((SyncTxRequestEntity)object0).e(fastJsonResponse$Field0) && this.a(fastJsonResponse$Field0).equals(((SyncTxRequestEntity)object0).a(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((SyncTxRequestEntity)object0).e(fastJsonResponse$Field0)) {
                return false;
            }
        }
        return true;
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                this.b = s1;
                break;
            }
            case 3: {
                this.c = s1;
                break;
            }
            case 4: {
                this.d = s1;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a String."));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    protected final void gH(FastJsonResponse.Field fastJsonResponse$Field0, String s, ArrayList arrayList0) {
        int v = fastJsonResponse$Field0.g;
        if(v != 5) {
            throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be an array of String."));
        }
        this.e = arrayList0;
        this.a.add(Integer.valueOf(5));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int v = 0;
        for(Object object0: SyncTxRequestEntity.f.values()) {
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
            baub.v(parcel0, 2, this.b, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.v(parcel0, 3, this.c, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.v(parcel0, 4, this.d, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.x(parcel0, 5, this.e, true);
        }
        baub.c(parcel0, v1);
    }
}

