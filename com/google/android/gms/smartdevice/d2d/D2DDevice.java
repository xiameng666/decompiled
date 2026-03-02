package com.google.android.gms.smartdevice.d2d;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import epyg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class D2DDevice extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public int b;
    public String c;
    public String d;
    public byte e;
    @Deprecated
    public String f;
    @Deprecated
    public byte[] g;
    public int h;
    private static final HashMap i;

    static {
        D2DDevice.CREATOR = new epyg();
        HashMap hashMap0 = new HashMap();
        D2DDevice.i = hashMap0;
        hashMap0.put("protocol", new FastJsonResponse.Field(0, false, 0, false, "protocol", 2, null));
        hashMap0.put("name", new FastJsonResponse.Field(7, false, 7, false, "name", 3, null));
        hashMap0.put("deviceId", new FastJsonResponse.Field(7, false, 7, false, "deviceId", 4, null));
        hashMap0.put("deviceType", new FastJsonResponse.Field(0, false, 0, false, "deviceType", 5, null));
        hashMap0.put("btUuid", new FastJsonResponse.Field(7, false, 7, false, "btUuid", 6, null));
        hashMap0.put("cryptAuthHello", new FastJsonResponse.Field(8, false, 8, false, "cryptAuthHello", 7, null));
        hashMap0.put("bluetoothMacAddr", new FastJsonResponse.Field(7, false, 7, false, "bluetoothMacAddr", 8, null));
        hashMap0.put("verificationStyle", new FastJsonResponse.Field(0, false, 0, false, "verificationStyle", 9, null));
    }

    public D2DDevice() {
        this.a = new HashSet();
    }

    public D2DDevice(String s, String s1, byte b, int v) {
        this.b = 2;
        this.c = s;
        this.d = s1;
        this.e = b;
        this.f = null;
        this.g = null;
        this.h = v;
        this.a.add(Integer.valueOf(2));
        this.a.add(Integer.valueOf(3));
        this.a.add(Integer.valueOf(4));
        this.a.add(Integer.valueOf(5));
        this.a.add(Integer.valueOf(6));
        this.a.add(Integer.valueOf(7));
        this.a.add(Integer.valueOf(9));
    }

    public D2DDevice(Set set0, int v, String s, String s1, byte b, String s2, byte[] arr_b, int v1) {
        this.a = set0;
        this.b = v;
        this.c = s;
        this.d = s1;
        this.e = b;
        this.f = s2;
        this.g = arr_b;
        this.h = v1;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return (int)this.b;
            }
            case 3: {
                return this.c;
            }
            case 4: {
                return this.d;
            }
            case 5: {
                return (byte)this.e;
            }
            case 6: {
                return this.f;
            }
            case 7: {
                return this.g;
            }
            case 9: {
                return (int)this.h;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return D2DDevice.i;
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
        if(object0 != null && this.getClass() == object0.getClass()) {
            String s = this.c;
            if(s != null) {
                if(!s.equals(((D2DDevice)object0).c)) {
                    return false;
                }
                return this.d == null ? ((D2DDevice)object0).d == null : this.d.equals(((D2DDevice)object0).d);
            }
            if(((D2DDevice)object0).c != null) {
                return false;
            }
            return this.d == null ? ((D2DDevice)object0).d == null : this.d.equals(((D2DDevice)object0).d);
        }
        return false;
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        if(s1 == null) {
            return;
        }
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 3: {
                this.c = s1;
                break;
            }
            case 4: {
                this.d = s1;
                break;
            }
            case 6: {
                this.f = s1;
                break;
            }
            case 8: {
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
                this.b = v;
                break;
            }
            case 5: {
                this.e = (byte)v;
                break;
            }
            case 9: {
                this.h = v;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an int."));
            }
        }
        this.a.add(Integer.valueOf(v1));
    }

    @Override  // bbgi
    protected final void go(FastJsonResponse.Field fastJsonResponse$Field0, String s, byte[] arr_b) {
        int v = fastJsonResponse$Field0.g;
        if(v != 7) {
            throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a byte array."));
        }
        this.g = arr_b;
        this.a.add(Integer.valueOf(7));
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int v = 0;
        int v1 = this.c == null ? 0 : this.c.hashCode();
        String s = this.d;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(2))) {
            baub.o(parcel0, 2, this.b);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.v(parcel0, 3, this.c, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.v(parcel0, 4, this.d, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.h(parcel0, 5, this.e);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.v(parcel0, 6, this.f, true);
        }
        if(set0.contains(Integer.valueOf(7))) {
            baub.i(parcel0, 7, this.g, true);
        }
        if(set0.contains(Integer.valueOf(9))) {
            baub.o(parcel0, 9, this.h);
        }
        baub.c(parcel0, v1);
    }
}

