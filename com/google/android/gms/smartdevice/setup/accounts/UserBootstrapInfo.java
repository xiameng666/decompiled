package com.google.android.gms.smartdevice.setup.accounts;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import erfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserBootstrapInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public String b;
    public byte[] c;
    private static final HashMap d;

    static {
        UserBootstrapInfo.CREATOR = new erfo();
        HashMap hashMap0 = new HashMap();
        UserBootstrapInfo.d = hashMap0;
        hashMap0.put("accountIdentifier", new FastJsonResponse.Field(7, false, 7, false, "accountIdentifier", 2, null));
        hashMap0.put("userPublicKey", new FastJsonResponse.Field(8, false, 8, false, "userPublicKey", 3, null));
    }

    public UserBootstrapInfo() {
        this.a = new HashSet();
    }

    public UserBootstrapInfo(String s, byte[] arr_b) {
        HashSet hashSet0 = new HashSet();
        this.a = hashSet0;
        this.b = s;
        this.c = arr_b;
        hashSet0.add(Integer.valueOf(2));
        hashSet0.add(Integer.valueOf(3));
    }

    public UserBootstrapInfo(Set set0, String s, byte[] arr_b) {
        this.a = set0;
        this.b = s;
        batl.s(arr_b);
        this.c = arr_b;
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
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return UserBootstrapInfo.d;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof UserBootstrapInfo) ? bata.b(this.b, ((UserBootstrapInfo)object0).b) && bata.b(this.c, ((UserBootstrapInfo)object0).c) : false;
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        if(s1 == null) {
            return;
        }
        int v = fastJsonResponse$Field0.g;
        if(v != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", v));
        }
        this.b = s1;
        this.a.add(Integer.valueOf(2));
    }

    @Override  // bbgi
    protected final void go(FastJsonResponse.Field fastJsonResponse$Field0, String s, byte[] arr_b) {
        if(arr_b == null) {
            return;
        }
        int v = fastJsonResponse$Field0.g;
        if(v != 3) {
            throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a byte array."));
        }
        this.c = arr_b;
        this.a.add(Integer.valueOf(3));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(2))) {
            baub.v(parcel0, 2, this.b, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.i(parcel0, 3, this.c, true);
        }
        baub.c(parcel0, v1);
    }
}

