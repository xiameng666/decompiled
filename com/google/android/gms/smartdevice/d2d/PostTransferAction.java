package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import epzf;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PostTransferAction extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public String b;
    public String c;
    public String d;
    public String e;
    public long f;
    private static final HashMap g;

    static {
        PostTransferAction.CREATOR = new epzf();
        HashMap hashMap0 = new HashMap();
        PostTransferAction.g = hashMap0;
        hashMap0.put("uri", new FastJsonResponse.Field(7, false, 7, false, "uri", 2, null));
        hashMap0.put("wifiD2D", new FastJsonResponse.Field(7, false, 7, false, "wifiD2D", 3, null));
        hashMap0.put("OEM", new FastJsonResponse.Field(7, false, 7, false, "OEM", 4, null));
        hashMap0.put("OEM_package", new FastJsonResponse.Field(7, false, 7, false, "OEM_package", 5, null));
        hashMap0.put("target_OEM_package_version", new FastJsonResponse.Field(2, false, 2, false, "target_OEM_package_version", 6, null));
    }

    public PostTransferAction() {
        this.f = 0L;
        this.a = new HashSet();
    }

    public PostTransferAction(Set set0, String s, String s1, String s2, String s3, long v) {
        this.a = set0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = v;
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
                return (long)this.f;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return PostTransferAction.g;
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
    protected final void k(FastJsonResponse.Field fastJsonResponse$Field0, String s, long v) {
        int v1 = fastJsonResponse$Field0.g;
        if(v1 != 6) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a long.", v1));
        }
        this.f = v;
        this.a.add(Integer.valueOf(6));
    }

    public final void p(String s) {
        this.d = s;
        this.a.add(Integer.valueOf(4));
    }

    public final void q(String s) {
        this.c = s;
        this.a.add(Integer.valueOf(3));
    }

    public final void r(String s) {
        this.e = s;
        this.a.add(Integer.valueOf(5));
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
        if(set0.contains(Integer.valueOf(4))) {
            baub.v(parcel0, 4, this.d, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.v(parcel0, 5, this.e, true);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.q(parcel0, 6, this.f);
        }
        baub.c(parcel0, v1);
    }
}

