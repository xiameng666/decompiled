package com.google.android.gms.auth.api.accounttransfer;

import adua;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbgi;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AuthenticatorAnnotatedData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    final int b;
    public AuthenticatorTransferInfo c;
    public String d;
    public String e;
    public String f;
    private static final HashMap g;

    static {
        AuthenticatorAnnotatedData.CREATOR = new adua();
        HashMap hashMap0 = new HashMap();
        AuthenticatorAnnotatedData.g = hashMap0;
        hashMap0.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, AuthenticatorTransferInfo.class));
        hashMap0.put("signature", new FastJsonResponse.Field(7, false, 7, false, "signature", 3, null));
        hashMap0.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public AuthenticatorAnnotatedData() {
        this.a = new HashSet(3);
        this.b = 1;
    }

    public AuthenticatorAnnotatedData(AuthenticatorTransferInfo authenticatorTransferInfo0, String s, String s1, String s2) {
        this(new HashSet(), 1, authenticatorTransferInfo0, s, s1, s2);
        this.a.add(Integer.valueOf(2));
        this.a.add(Integer.valueOf(3));
        this.a.add(Integer.valueOf(4));
    }

    public AuthenticatorAnnotatedData(Set set0, int v, AuthenticatorTransferInfo authenticatorTransferInfo0, String s, String s1, String s2) {
        this.a = set0;
        this.b = v;
        this.c = authenticatorTransferInfo0;
        this.d = s;
        this.e = s1;
        this.f = s2;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 1: {
                return (int)this.b;
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
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return AuthenticatorAnnotatedData.g;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void f(FastJsonResponse.Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 3: {
                this.d = s1;
                break;
            }
            case 4: {
                this.e = s1;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", v));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    public final void gF(FastJsonResponse.Field fastJsonResponse$Field0, String s, bbgi bbgi0) {
        int v = fastJsonResponse$Field0.g;
        if(v != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", v, bbgi0.getClass().getCanonicalName()));
        }
        this.c = (AuthenticatorTransferInfo)bbgi0;
        this.a.add(Integer.valueOf(2));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(1))) {
            baub.o(parcel0, 1, this.b);
        }
        if(set0.contains(Integer.valueOf(2))) {
            baub.t(parcel0, 2, this.c, v, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.v(parcel0, 3, this.d, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.v(parcel0, 4, this.e, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.v(parcel0, 5, this.f, true);
        }
        baub.c(parcel0, v1);
    }
}

