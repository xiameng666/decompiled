package com.google.android.gms.smartdevice.d2d;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import eqan;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SourceDevice extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public String b;
    public byte c;
    public boolean d;
    private static final HashMap e;

    static {
        SourceDevice.CREATOR = new eqan();
        HashMap hashMap0 = new HashMap();
        SourceDevice.e = hashMap0;
        hashMap0.put("name", new FastJsonResponse.Field(7, false, 7, false, "name", 2, null));
        hashMap0.put("deviceType", new FastJsonResponse.Field(0, false, 0, false, "deviceType", 3, null));
        hashMap0.put("isNetworkConnected", new FastJsonResponse.Field(6, false, 6, false, "isNetworkConnected", 4, null));
    }

    public SourceDevice() {
        this.a = new HashSet();
    }

    public SourceDevice(Set set0, String s, byte b, boolean z) {
        this.a = set0;
        this.b = s;
        this.c = b;
        this.d = z;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return this.b;
            }
            case 3: {
                return (byte)this.c;
            }
            case 4: {
                return Boolean.valueOf(this.d);
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return SourceDevice.e;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
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
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        if(v1 != 3) {
            throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an int."));
        }
        this.c = (byte)v;
        this.a.add(Integer.valueOf(3));
    }

    @Override  // bbgi
    protected final void gp(FastJsonResponse.Field fastJsonResponse$Field0, String s, boolean z) {
        int v = fastJsonResponse$Field0.g;
        if(v != 4) {
            throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a boolean."));
        }
        this.d = z;
        this.a.add(Integer.valueOf(4));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(2))) {
            baub.v(parcel0, 2, this.b, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.h(parcel0, 3, this.c);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.e(parcel0, 4, this.d);
        }
        baub.c(parcel0, v1);
    }
}

