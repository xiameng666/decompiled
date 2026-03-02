package com.google.android.gms.smartdevice.setup.accounts;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import erfq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Deprecated
public class UserPresence extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    private static final HashMap g;

    static {
        UserPresence.CREATOR = new erfq();
        HashMap hashMap0 = new HashMap();
        UserPresence.g = hashMap0;
        hashMap0.put("lockScreenSecure", new FastJsonResponse.Field(6, false, 6, false, "lockScreenSecure", 2, null));
        hashMap0.put("shownLockScreen", new FastJsonResponse.Field(6, false, 6, false, "shownLockScreen", 3, null));
        hashMap0.put("lockScreenQuality", new FastJsonResponse.Field(0, false, 0, false, "lockScreenQuality", 4, null));
        hashMap0.put("lastUnlockDurationInSeconds", new FastJsonResponse.Field(2, false, 2, false, "lastUnlockDurationInSeconds", 5, null));
        hashMap0.put("lockScreenSetupDurationInSeconds", new FastJsonResponse.Field(2, false, 2, false, "lockScreenSetupDurationInSeconds", 6, null));
    }

    public UserPresence() {
        this.a = new HashSet();
    }

    public UserPresence(Set set0, boolean z, boolean z1, int v, long v1, long v2) {
        this.a = set0;
        this.b = z;
        this.c = z1;
        this.d = v;
        this.e = v1;
        this.f = v2;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return Boolean.valueOf(this.b);
            }
            case 3: {
                return Boolean.valueOf(this.c);
            }
            case 4: {
                return (int)this.d;
            }
            case 5: {
                return (long)this.e;
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
        return UserPresence.g;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        if(v1 != 4) {
            throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an int."));
        }
        this.d = v;
        this.a.add(Integer.valueOf(4));
    }

    @Override  // bbgi
    protected final void gp(FastJsonResponse.Field fastJsonResponse$Field0, String s, boolean z) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                this.b = z;
                break;
            }
            case 3: {
                this.c = z;
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
            case 5: {
                this.e = v;
                break;
            }
            case 6: {
                this.f = v;
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
            baub.e(parcel0, 3, this.c);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.o(parcel0, 4, this.d);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.q(parcel0, 5, this.e);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.q(parcel0, 6, this.f);
        }
        baub.c(parcel0, v1);
    }
}

