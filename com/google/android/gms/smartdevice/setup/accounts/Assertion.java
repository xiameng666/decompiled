package com.google.android.gms.smartdevice.setup.accounts;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import erex;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Assertion extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public String b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public int g;
    private static final HashMap h;

    static {
        Assertion.CREATOR = new erex();
        HashMap hashMap0 = new HashMap();
        Assertion.h = hashMap0;
        hashMap0.put("accountIdentifier", new FastJsonResponse.Field(7, false, 7, false, "accountIdentifier", 2, null));
        hashMap0.put("clientData", new FastJsonResponse.Field(8, false, 8, false, "clientData", 3, null));
        hashMap0.put("encryptedUserAssertion", new FastJsonResponse.Field(8, false, 8, false, "encryptedUserAssertion", 4, null));
        hashMap0.put("challengeSessionState", new FastJsonResponse.Field(8, false, 8, false, "challengeSessionState", 5, null));
        hashMap0.put("challenge", new FastJsonResponse.Field(8, false, 8, false, "challenge", 6, null));
        hashMap0.put("assertionType", new FastJsonResponse.Field(0, false, 0, false, "assertionType", 7, null));
    }

    public Assertion() {
        this.a = new HashSet();
    }

    public Assertion(String s, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) {
        HashSet hashSet0 = new HashSet();
        this.a = hashSet0;
        this.b = s;
        this.c = arr_b;
        this.d = arr_b1;
        this.e = arr_b2;
        this.f = arr_b3;
        this.g = 1;
        hashSet0.add(Integer.valueOf(2));
        hashSet0.add(Integer.valueOf(3));
        hashSet0.add(Integer.valueOf(4));
        hashSet0.add(Integer.valueOf(5));
        hashSet0.add(Integer.valueOf(6));
        hashSet0.add(Integer.valueOf(7));
    }

    public Assertion(Set set0, String s, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, int v) {
        this.a = set0;
        this.b = s;
        this.c = arr_b;
        this.d = arr_b1;
        this.e = arr_b2;
        this.f = arr_b3;
        this.g = v;
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
                return (int)this.g;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return Assertion.h;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.g;
        if(v != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", v));
        }
        if(s1 != null) {
            this.b = s1;
            this.a.add(Integer.valueOf(2));
        }
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        if(v1 != 7) {
            throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an int."));
        }
        this.g = v;
        this.a.add(Integer.valueOf(7));
    }

    @Override  // bbgi
    protected final void go(FastJsonResponse.Field fastJsonResponse$Field0, String s, byte[] arr_b) {
        if(arr_b == null) {
            return;
        }
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 3: {
                this.c = arr_b;
                break;
            }
            case 4: {
                this.d = arr_b;
                break;
            }
            case 5: {
                this.e = arr_b;
                break;
            }
            case 6: {
                this.f = arr_b;
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
            baub.i(parcel0, 4, this.d, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.i(parcel0, 5, this.e, true);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.i(parcel0, 6, this.f, true);
        }
        if(set0.contains(Integer.valueOf(7))) {
            baub.o(parcel0, 7, this.g);
        }
        baub.c(parcel0, v1);
    }
}

