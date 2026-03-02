package com.google.android.gms.smartdevice.d2d;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import epyn;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EsimActivationPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public int b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    private static final HashMap g;

    static {
        EsimActivationPayload.CREATOR = new epyn();
        HashMap hashMap0 = new HashMap();
        EsimActivationPayload.g = hashMap0;
        hashMap0.put("resultCode", new FastJsonResponse.Field(0, false, 0, false, "resultCode", 2, null));
        hashMap0.put("activationCode", new FastJsonResponse.Field(7, false, 7, false, "activationCode", 3, null));
        hashMap0.put("phoneNumber", new FastJsonResponse.Field(7, false, 7, false, "phoneNumber", 4, null));
        hashMap0.put("carrierName", new FastJsonResponse.Field(7, false, 7, false, "carrierName", 5, null));
        hashMap0.put("isEmbedded", new FastJsonResponse.Field(6, false, 6, false, "isEmbedded", 6, null));
    }

    public EsimActivationPayload() {
        this.a = new HashSet();
        this.b = 1;
    }

    public EsimActivationPayload(String s, String s1, String s2, boolean z) {
        this.b = 0;
        this.a.add(Integer.valueOf(2));
        this.c = s;
        this.a.add(Integer.valueOf(3));
        this.d = s1;
        this.a.add(Integer.valueOf(4));
        this.e = s2;
        this.a.add(Integer.valueOf(5));
        this.f = z;
        this.a.add(Integer.valueOf(6));
    }

    public EsimActivationPayload(Set set0, int v, String s, String s1, String s2, boolean z) {
        this.a = set0;
        this.b = v;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = z;
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
                return this.e;
            }
            case 6: {
                return Boolean.valueOf(this.f);
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return EsimActivationPayload.g;
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
                this.c = s1;
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
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", v));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        if(v1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be an integer.", v1));
        }
        this.b = v;
        this.a.add(Integer.valueOf(2));
    }

    @Override  // bbgi
    protected final void gp(FastJsonResponse.Field fastJsonResponse$Field0, String s, boolean z) {
        int v = fastJsonResponse$Field0.g;
        if(v != 6) {
            throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a boolean."));
        }
        this.f = z;
        this.a.add(Integer.valueOf(6));
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
            baub.v(parcel0, 5, this.e, true);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.e(parcel0, 6, this.f);
        }
        baub.c(parcel0, v1);
    }
}

