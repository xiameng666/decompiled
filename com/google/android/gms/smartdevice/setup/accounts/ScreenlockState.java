package com.google.android.gms.smartdevice.setup.accounts;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import erfl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ScreenlockState extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public boolean b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    private static final HashMap g;

    static {
        ScreenlockState.CREATOR = new erfl();
        HashMap hashMap0 = new HashMap();
        ScreenlockState.g = hashMap0;
        hashMap0.put("isSecureScreenlock", new FastJsonResponse.Field(6, false, 6, false, "isSecureScreenlock", 2, null));
        hashMap0.put("screenlockType", new FastJsonResponse.Field(0, false, 0, false, "screenlockType", 3, null));
        hashMap0.put("screenlockSettingsAgeMillis", new FastJsonResponse.Field(2, false, 2, false, "screenlockSettingsAgeMillis", 4, null));
        hashMap0.put("elapsedTimeSinceUnlockMillis", new FastJsonResponse.Field(2, false, 2, false, "elapsedTimeSinceUnlockMillis", 5, null));
        hashMap0.put("isForcedScreenlock", new FastJsonResponse.Field(6, false, 6, false, "isForcedScreenlock", 6, null));
    }

    public ScreenlockState() {
        this.a = new HashSet();
    }

    public ScreenlockState(Set set0, boolean z, int v, long v1, long v2, boolean z1) {
        this.a = set0;
        this.b = z;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = z1;
    }

    public ScreenlockState(boolean z, int v, long v1, long v2) {
        HashSet hashSet0 = new HashSet();
        this.a = hashSet0;
        this.b = z;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = false;
        hashSet0.add(Integer.valueOf(2));
        hashSet0.add(Integer.valueOf(3));
        hashSet0.add(Integer.valueOf(4));
        hashSet0.add(Integer.valueOf(5));
        hashSet0.add(Integer.valueOf(6));
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return Boolean.valueOf(this.b);
            }
            case 3: {
                return (int)this.c;
            }
            case 4: {
                return (long)this.d;
            }
            case 5: {
                return (long)this.e;
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
        return ScreenlockState.g;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        if(v1 != 3) {
            throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an int."));
        }
        this.c = v;
        this.a.add(Integer.valueOf(3));
    }

    @Override  // bbgi
    protected final void gp(FastJsonResponse.Field fastJsonResponse$Field0, String s, boolean z) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                this.b = z;
                break;
            }
            case 6: {
                this.f = z;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a boolean."));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    protected final void k(FastJsonResponse.Field fastJsonResponse$Field0, String s, long v) {
        int v1 = fastJsonResponse$Field0.g;
        switch(v1) {
            case 4: {
                this.d = v;
                break;
            }
            case 5: {
                this.e = v;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an long."));
            }
        }
        this.a.add(Integer.valueOf(v1));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(2))) {
            baub.e(parcel0, 2, this.b);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.o(parcel0, 3, this.c);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.q(parcel0, 4, this.d);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.q(parcel0, 5, this.e);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.e(parcel0, 6, this.f);
        }
        baub.c(parcel0, v1);
    }
}

