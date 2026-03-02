package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbgi;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import eqdc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TargetConnectionArgs extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public SourceDevice b;
    @Deprecated
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    private static final HashMap h;

    static {
        TargetConnectionArgs.CREATOR = new eqdc();
        HashMap hashMap0 = new HashMap();
        TargetConnectionArgs.h = hashMap0;
        hashMap0.put("sourceDevice", new FastJsonResponse.Field(11, false, 11, false, "sourceDevice", 2, SourceDevice.class));
        hashMap0.put("preferTargetUserVerification", new FastJsonResponse.Field(6, false, 6, false, "preferTargetUserVerification", 3, null));
        hashMap0.put("userVerificationMethod", new FastJsonResponse.Field(0, false, 0, false, "userVerificationMethod", 4, null));
        hashMap0.put("preferredUserVerificationMethod", new FastJsonResponse.Field(0, false, 0, false, "preferredUserVerificationMethod", 5, null));
        hashMap0.put("targetProtocolVersion", new FastJsonResponse.Field(0, false, 0, false, "targetProtocolVersion", 7, null));
    }

    public TargetConnectionArgs() {
        this.a = new HashSet();
    }

    public TargetConnectionArgs(int v, int v1) {
        this.e = v;
        this.f = v1;
        this.a.add(Integer.valueOf(5));
        this.a.add(Integer.valueOf(6));
    }

    public TargetConnectionArgs(Set set0, SourceDevice sourceDevice0, boolean z, int v, int v1, int v2, int v3) {
        this.a = set0;
        this.b = sourceDevice0;
        this.c = z;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return this.b;
            }
            case 3: {
                return Boolean.valueOf(this.c);
            }
            case 4: {
                return (int)this.d;
            }
            case 5: {
                return (int)this.e;
            }
            case 7: {
                return (int)this.g;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return TargetConnectionArgs.h;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    public final void gF(FastJsonResponse.Field fastJsonResponse$Field0, String s, bbgi bbgi0) {
        int v = fastJsonResponse$Field0.g;
        if(v != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", v, bbgi0.getClass().getCanonicalName()));
        }
        this.b = (SourceDevice)bbgi0;
        this.a.add(Integer.valueOf(2));
    }

    public final void p(int v) {
        this.g = v;
        this.a.add(Integer.valueOf(7));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(2))) {
            baub.t(parcel0, 2, this.b, v, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.e(parcel0, 3, this.c);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.o(parcel0, 4, this.d);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.o(parcel0, 5, this.e);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.o(parcel0, 6, this.f);
        }
        if(set0.contains(Integer.valueOf(7))) {
            baub.o(parcel0, 7, this.g);
        }
        baub.c(parcel0, v1);
    }
}

