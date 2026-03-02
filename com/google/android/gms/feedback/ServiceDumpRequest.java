package com.google.android.gms.feedback;

import android.os.Parcel;
import baub;
import blao;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;
import java.util.Arrays;

public final class ServiceDumpRequest extends AbstractSafeParcelable {
    public static final blao CREATOR;
    public final String a;
    public final String b;
    public final String[] c;
    public final int d;
    public final boolean e;

    static {
        ServiceDumpRequest.CREATOR = new blao();
    }

    public ServiceDumpRequest(String s, String s1, String[] arr_s, int v, boolean z) {
        this.a = (String)Objects.requireNonNull(s);
        if(s1 != null) {
            s = s1;
        }
        this.b = s;
        this.c = arr_s;
        if(v != 1 && v != 2) {
            throw new IllegalArgumentException("Unknown expected output format=" + v);
        }
        this.d = v;
        this.e = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.e == ((ServiceDumpRequest)object0).e && this.d == ((ServiceDumpRequest)object0).d && this.a.equals(((ServiceDumpRequest)object0).a) && this.b.equals(((ServiceDumpRequest)object0).b) && Arrays.equals(this.c, ((ServiceDumpRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.c);
        return Objects.hash(new Object[]{this.a, this.b, Boolean.valueOf(this.e), ((int)this.d)}) * 0x1F + v;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.c);
        return "ServiceDumpRequest{serviceDumpId=\'" + this.a + "\',serviceName=\'" + this.b + "\', dumpsysFlags=" + s + ", expectedOutputFormat=" + this.d + ", showOutputToUser=" + this.e + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.w(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.v(parcel0, 6, this.b, false);
        baub.c(parcel0, v1);
    }
}

