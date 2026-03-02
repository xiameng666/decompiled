package com.google.android.gms.smartdevice.d2d.data;

import a;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import eqhe;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SourceDeviceInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    private static final HashMap k;

    static {
        SourceDeviceInfo.CREATOR = new eqhe();
        HashMap hashMap0 = new HashMap();
        SourceDeviceInfo.k = hashMap0;
        hashMap0.put("androidId", new FastJsonResponse.Field(7, false, 7, false, "androidId", 1, null));
        hashMap0.put("manufacturer", new FastJsonResponse.Field(7, false, 7, false, "manufacturer", 2, null));
        hashMap0.put("deviceModel", new FastJsonResponse.Field(7, false, 7, false, "deviceModel", 3, null));
        hashMap0.put("deviceFingerprint", new FastJsonResponse.Field(7, false, 7, false, "deviceFingerprint", 4, null));
        hashMap0.put("sdkVersion", new FastJsonResponse.Field(0, false, 0, false, "sdkVersion", 5, null));
        hashMap0.put("iosAppId", new FastJsonResponse.Field(7, false, 7, false, "iosAppId", 6, null));
        hashMap0.put("iosAppVersion", new FastJsonResponse.Field(7, false, 7, false, "iosAppVersion", 7, null));
        hashMap0.put("iosVersion", new FastJsonResponse.Field(7, false, 7, false, "iosVersion", 8, null));
        hashMap0.put("accountGivenName", new FastJsonResponse.Field(7, false, 7, false, "accountGivenName", 9, null));
    }

    public SourceDeviceInfo() {
        this.a = new HashSet();
    }

    public SourceDeviceInfo(Set set0, String s, String s1, String s2, String s3, int v, String s4, String s5, String s6, String s7) {
        this.a = set0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = v;
        this.g = s4;
        this.h = s5;
        this.i = s6;
        this.j = s7;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 1: {
                return this.b;
            }
            case 2: {
                return this.c;
            }
            case 3: {
                return this.d;
            }
            case 4: {
                return this.e;
            }
            case 5: {
                return (int)this.f;
            }
            case 6: {
                return this.g;
            }
            case 7: {
                return this.h;
            }
            case 8: {
                return this.i;
            }
            case 9: {
                return this.j;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return SourceDeviceInfo.k;
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
                this.b = s1 == null ? "" : s1;
                break;
            }
            case 2: {
                this.c = s1 == null ? Build.MANUFACTURER : s1;
                break;
            }
            case 3: {
                this.d = s1 == null ? Build.MODEL : s1;
                break;
            }
            case 4: {
                this.e = s1 == null ? Build.FINGERPRINT : s1;
                break;
            }
            case 6: {
                if(s1 != null) {
                    this.g = s1;
                }
                break;
            }
            case 7: {
                if(s1 != null) {
                    this.h = s1;
                }
                break;
            }
            case 8: {
                if(s1 != null) {
                    this.i = s1;
                }
                break;
            }
            case 9: {
                if(s1 != null) {
                    this.j = s1;
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
        if(v1 != 5) {
            throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be a int."));
        }
        this.f = v;
        this.a.add(Integer.valueOf(5));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(1))) {
            baub.v(parcel0, 1, this.b, true);
        }
        if(set0.contains(Integer.valueOf(2))) {
            baub.v(parcel0, 2, this.c, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.v(parcel0, 3, this.d, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.v(parcel0, 4, this.e, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.o(parcel0, 5, this.f);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.v(parcel0, 6, this.g, true);
        }
        if(set0.contains(Integer.valueOf(7))) {
            baub.v(parcel0, 7, this.h, true);
        }
        if(set0.contains(Integer.valueOf(8))) {
            baub.v(parcel0, 8, this.i, true);
        }
        if(set0.contains(Integer.valueOf(9))) {
            baub.v(parcel0, 9, this.j, true);
        }
        baub.c(parcel0, v1);
    }
}

