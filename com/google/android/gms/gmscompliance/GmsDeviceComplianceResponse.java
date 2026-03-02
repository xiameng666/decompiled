package com.google.android.gms.gmscompliance;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import btew;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GmsDeviceComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public boolean b;
    public PendingIntent c;
    public boolean d;
    public long e;
    public byte[] f;

    static {
        GmsDeviceComplianceResponse.CREATOR = new btew();
    }

    public GmsDeviceComplianceResponse() {
        this(1, true, null, false, 0L, null);
    }

    public GmsDeviceComplianceResponse(int v, boolean z, PendingIntent pendingIntent0, boolean z1, long v1, byte[] arr_b) {
        this.a = v;
        this.b = z;
        this.c = pendingIntent0;
        this.d = z1;
        this.e = v1;
        this.f = arr_b;
    }

    public GmsDeviceComplianceResponse(GmsDeviceComplianceResponse gmsDeviceComplianceResponse0) {
        this(gmsDeviceComplianceResponse0.a, gmsDeviceComplianceResponse0.b, gmsDeviceComplianceResponse0.c, gmsDeviceComplianceResponse0.d, gmsDeviceComplianceResponse0.e, gmsDeviceComplianceResponse0.f);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.e(parcel0, 4, this.d);
        baub.q(parcel0, 5, this.e);
        baub.i(parcel0, 6, this.f, false);
        baub.c(parcel0, v1);
    }
}

