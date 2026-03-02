package com.google.android.gms.smartdevice.d2d.data;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import eqhg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TargetDeviceInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public String b;
    public byte c;
    public int d;
    public int e;
    public int f;
    public String g;
    private static final HashMap h;

    static {
        TargetDeviceInfo.CREATOR = new eqhg();
        HashMap hashMap0 = new HashMap();
        TargetDeviceInfo.h = hashMap0;
        hashMap0.put("deviceModel", new FastJsonResponse.Field(7, false, 7, false, "deviceModel", 1, null));
        hashMap0.put("deviceType", new FastJsonResponse.Field(0, false, 0, false, "deviceType", 2, null));
        hashMap0.put("preferredUserVerificationMethod", new FastJsonResponse.Field(0, false, 0, false, "preferredUserVerificationMethod", 3, null));
        hashMap0.put("protocolVersion", new FastJsonResponse.Field(0, false, 0, false, "protocolVersion", 4, null));
        hashMap0.put("gmsVersion", new FastJsonResponse.Field(0, false, 0, false, "gmsVersion", 5, null));
        hashMap0.put("backupBtRfcommServerUuid", new FastJsonResponse.Field(7, false, 7, false, "backupBtRfcommServerUuid", 6, null));
    }

    public TargetDeviceInfo() {
        this.a = new HashSet();
    }

    public TargetDeviceInfo(Set set0, String s, byte b, int v, int v1, int v2, String s1) {
        this.a = set0;
        this.b = s;
        this.c = b;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = s1;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 1: {
                return this.b;
            }
            case 2: {
                return (byte)this.c;
            }
            case 3: {
                return (int)this.d;
            }
            case 4: {
                return (int)this.e;
            }
            case 5: {
                return (int)this.f;
            }
            case 6: {
                return this.g;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return TargetDeviceInfo.h;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 1: {
                this.b = s1 == null ? Build.MODEL : s1;
                break;
            }
            case 6: {
                if(s1 != null) {
                    this.g = s1;
                }
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", v));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        switch(v1) {
            case 2: {
                this.c = (byte)v;
                break;
            }
            case 3: {
                this.d = v;
                break;
            }
            case 4: {
                this.e = v;
                break;
            }
            case 5: {
                this.f = v;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a int.", v1));
            }
        }
        this.a.add(Integer.valueOf(v1));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(1))) {
            baub.v(parcel0, 1, this.b, true);
        }
        if(set0.contains(Integer.valueOf(2))) {
            baub.h(parcel0, 2, this.c);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.o(parcel0, 3, this.d);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.o(parcel0, 4, this.e);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.o(parcel0, 5, this.f);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.v(parcel0, 6, this.g, true);
        }
        baub.c(parcel0, v1);
    }
}

