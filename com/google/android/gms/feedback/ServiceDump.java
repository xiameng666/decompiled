package com.google.android.gms.feedback;

import android.os.Parcel;
import baub;
import blam;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;
import java.util.Arrays;

public final class ServiceDump extends AbstractSafeParcelable {
    public static final blam CREATOR;
    public final ServiceDumpRequest a;
    public final byte[] b;

    static {
        ServiceDump.CREATOR = new blam();
    }

    public ServiceDump(ServiceDumpRequest serviceDumpRequest0, byte[] arr_b) {
        this.a = (ServiceDumpRequest)Objects.requireNonNull(serviceDumpRequest0);
        this.b = (byte[])Objects.requireNonNull(arr_b);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a.equals(((ServiceDump)object0).a) && Arrays.equals(this.b, ((ServiceDump)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a}) * 0x1F + Arrays.hashCode(this.b);
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.a);
        String s1 = Arrays.toString(this.b);
        if(s1.length() > 20) {
            s1 = s1.substring(0, 17) + "...";
        }
        return "ServiceDump{serviceDumpRequest=" + s + ", dumpOutput=\"" + String.format(s1) + "\"}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.i(parcel0, 3, this.b, false);
        baub.c(parcel0, v1);
    }
}

