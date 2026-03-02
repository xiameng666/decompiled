package com.google.android.gms.smartdevice.d2d.data;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import eqhc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProgressEvent extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    final Set a;
    public int b;
    private static final HashMap c;

    static {
        ProgressEvent.CREATOR = new eqhc();
        HashMap hashMap0 = new HashMap();
        ProgressEvent.c = hashMap0;
        hashMap0.put("progressType", new FastJsonResponse.Field(0, false, 0, false, "progressType", 2, null));
    }

    public ProgressEvent() {
        this.a = new HashSet();
    }

    public ProgressEvent(Set set0, int v) {
        this.a = set0;
        this.b = v;
    }

    public ProgressEvent(byte[] arr_b) {
        HashSet hashSet0 = new HashSet();
        this.a = hashSet0;
        this.b = 6;
        hashSet0.add(Integer.valueOf(2));
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        if(v == 2) {
            return (int)this.b;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + v);
    }

    @Override  // bbgi
    public final Map b() {
        return ProgressEvent.c;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.g;
        if(v1 != 2) {
            throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an int."));
        }
        this.b = v;
        this.a.add(Integer.valueOf(2));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        if(this.a.contains(Integer.valueOf(2))) {
            baub.o(parcel0, 2, this.b);
        }
        baub.c(parcel0, v1);
    }
}

