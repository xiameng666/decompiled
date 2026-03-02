package com.google.android.gms.smartdevice.postsetup;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import equc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConnectionHint extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public String b;
    public byte[] c;
    public String d;
    public String e;
    public String f;
    public byte[] g;
    public int h;
    public String i;
    public String j;
    private static final HashMap k;

    static {
        ConnectionHint.CREATOR = new equc();
        HashMap hashMap0 = new HashMap();
        ConnectionHint.k = hashMap0;
        hashMap0.put("hint", new FastJsonResponse.Field(7, false, 7, false, "hint", 2, null));
        hashMap0.put("sharedSecret", new FastJsonResponse.Field(8, false, 8, false, "sharedSecret", 3, null));
        hashMap0.put("wifiDirectMacAddress", new FastJsonResponse.Field(7, false, 7, false, "wifiDirectMacAddress", 4, null));
        hashMap0.put("oemRestorePkg", new FastJsonResponse.Field(7, false, 7, false, "oemRestorePkg", 5, null));
        hashMap0.put("oemRestorePkgVersion", new FastJsonResponse.Field(7, false, 7, false, "oemRestorePkgVersion", 6, null));
        hashMap0.put("targetBtMacAddress", new FastJsonResponse.Field(8, false, 8, false, "targetBtMacAddress", 7, null));
        hashMap0.put("userVerificationStatus", new FastJsonResponse.Field(0, false, 0, false, "userVerificationStatus", 8, null));
        hashMap0.put("osMigrationSessionId", new FastJsonResponse.Field(7, false, 7, false, "osMigrationSessionId", 9, null));
        hashMap0.put("osMigrationPassword", new FastJsonResponse.Field(7, false, 7, false, "osMigrationPassword", 10, null));
    }

    public ConnectionHint() {
        this.a = new HashSet();
    }

    public ConnectionHint(Set set0, String s, byte[] arr_b, String s1, String s2, String s3, byte[] arr_b1, int v, String s4, String s5) {
        this.a = set0;
        this.b = s;
        this.c = arr_b;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = arr_b1;
        this.h = v;
        this.i = s4;
        this.j = s5;
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
            case 6: {
                return this.f;
            }
            case 7: {
                return this.g;
            }
            case 8: {
                return (int)this.h;
            }
            case 9: {
                return this.i;
            }
            case 10: {
                return this.j;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return ConnectionHint.k;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                this.b = s1;
                break;
            }
            case 4: {
                this.d = s1;
                break;
            }
            case 5: {
                this.e = s1;
                break;
            }
            case 6: {
                this.f = s1;
                break;
            }
            case 9: {
                this.i = s1;
                break;
            }
            case 10: {
                this.j = s1;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a String."));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        if(v1 != 8) {
            throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an int."));
        }
        this.h = v;
        this.a.add(Integer.valueOf(8));
    }

    @Override  // bbgi
    protected final void go(FastJsonResponse.Field fastJsonResponse$Field0, String s, byte[] arr_b) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 3: {
                this.c = arr_b;
                break;
            }
            case 7: {
                this.g = arr_b;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a byte array."));
            }
        }
        this.a.add(Integer.valueOf(v));
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
        if(set0.contains(Integer.valueOf(4))) {
            baub.v(parcel0, 4, this.d, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.v(parcel0, 5, this.e, true);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.v(parcel0, 6, this.f, true);
        }
        if(set0.contains(Integer.valueOf(7))) {
            baub.i(parcel0, 7, this.g, true);
        }
        if(set0.contains(Integer.valueOf(8))) {
            baub.o(parcel0, 8, this.h);
        }
        if(set0.contains(Integer.valueOf(9))) {
            baub.v(parcel0, 9, this.i, true);
        }
        if(set0.contains(Integer.valueOf(10))) {
            baub.v(parcel0, 10, this.j, true);
        }
        baub.c(parcel0, v1);
    }
}

