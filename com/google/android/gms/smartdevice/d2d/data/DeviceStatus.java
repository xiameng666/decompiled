package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import eqgw;
import ggek;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DeviceStatus extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public final Set d;
    private static final Map e;

    static {
        DeviceStatus.CREATOR = new eqgw();
        ggek ggek0 = new ggek();
        ggek0.i("errorCode", new FastJsonResponse.Field(0, false, 0, false, "errorCode", 1, null));
        ggek0.i("errorSource", new FastJsonResponse.Field(0, false, 0, false, "errorSource", 2, null));
        ggek0.i("errorCodeFromSource", new FastJsonResponse.Field(0, false, 0, false, "errorCodeFromSource", 3, null));
        DeviceStatus.e = ggek0.b();
    }

    public DeviceStatus() {
        this.d = new HashSet();
    }

    public DeviceStatus(Set set0, int v, int v1, int v2) {
        this.d = set0;
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override  // bbgi
    protected final void W(String s, int v) {
        if(s.equals("errorCode")) {
            this.p(v);
            return;
        }
        if(s.equals("errorSource")) {
            this.r(v);
            return;
        }
        if(s.equals("errorCodeFromSource")) {
            this.q(v);
        }
    }

    @Override  // bbgi
    public final Map b() {
        return DeviceStatus.e;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.d.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    public final void p(int v) {
        this.a = v;
        this.d.add(Integer.valueOf(1));
    }

    public final void q(int v) {
        this.c = v;
        this.d.add(Integer.valueOf(3));
    }

    public final void r(int v) {
        this.b = v;
        this.d.add(Integer.valueOf(2));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.d;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(1))) {
            baub.o(parcel0, 1, this.a);
        }
        if(set0.contains(Integer.valueOf(2))) {
            baub.o(parcel0, 2, this.b);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.o(parcel0, 3, this.c);
        }
        baub.c(parcel0, v1);
    }

    @Override  // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object z(String s) {
        if(s.equals("errorCode")) {
            return (int)this.a;
        }
        if(s.equals("errorSource")) {
            return (int)this.b;
        }
        if(s.equals("errorCodeFromSource")) {
            return (int)this.c;
        }
        throw new IllegalArgumentException("No value for key " + s);
    }
}

