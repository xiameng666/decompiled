package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import epwo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AuthenticatingUser extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public String b;
    public String c;
    private static final HashMap d;

    static {
        AuthenticatingUser.CREATOR = new epwo();
        HashMap hashMap0 = new HashMap();
        AuthenticatingUser.d = hashMap0;
        hashMap0.put("obfuscatedGaiaID", new FastJsonResponse.Field(7, false, 7, false, "obfuscatedGaiaID", 2, null));
        hashMap0.put("email", new FastJsonResponse.Field(7, false, 7, false, "email", 3, null));
    }

    public AuthenticatingUser() {
        this.a = new HashSet();
    }

    public AuthenticatingUser(Set set0, String s, String s1) {
        this.a = set0;
        this.b = s;
        this.c = s1;
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
        return AuthenticatingUser.d;
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
        switch(v) {
            case 2: {
                this.b = s1;
                break;
            }
            case 3: {
                this.c = s1;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", v));
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
            baub.v(parcel0, 3, this.c, true);
        }
        baub.c(parcel0, v1);
    }
}

