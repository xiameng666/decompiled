package com.google.android.gms.smartdevice.d2d;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxd;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import epwl;
import j..util.DesugarCollections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AdvertisementOptions extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public int b;
    private static final Map c;

    static {
        AdvertisementOptions.CREATOR = new epwl();
        bxd bxd0 = new bxd();
        bxd0.put("verificationStyle", new FastJsonResponse.Field(0, false, 0, false, "verificationStyle", 1, null));
        AdvertisementOptions.c = DesugarCollections.unmodifiableMap(bxd0);
    }

    public AdvertisementOptions() {
        this.a = new HashSet();
    }

    public AdvertisementOptions(int v) {
        HashSet hashSet0 = new HashSet();
        this.a = hashSet0;
        this.b = v;
        hashSet0.add(Integer.valueOf(1));
    }

    public AdvertisementOptions(Set set0, int v) {
        this.a = set0;
        this.b = v;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        if(v == 1) {
            return (int)this.b;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + v);
    }

    @Override  // bbgi
    public final Map b() {
        return AdvertisementOptions.c;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        if(v1 != 1) {
            throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an int."));
        }
        this.b = v;
        this.a.add(Integer.valueOf(1));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        if(this.a.contains(Integer.valueOf(1))) {
            baub.o(parcel0, 1, this.b);
        }
        baub.c(parcel0, v1);
    }
}

