package com.google.android.gms.esim;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjot;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class EsimTransferStartSessionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;
    public final String g;
    public final String h;

    static {
        EsimTransferStartSessionRequest.CREATOR = new bjot();
    }

    public EsimTransferStartSessionRequest(int v, int v1, String s, String s1, boolean z, List list0, String s2, String s3) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
        this.e = z;
        this.f = list0;
        this.g = s2;
        this.h = s3;
    }

    @Override
    public final String toString() {
        return "EsimTransferStartSessionRequest: [connectorType: " + this.a + ", esimTransferSessionType:" + this.b + ", deepLinkUrl:" + this.c + ", btAddress:" + this.d + ", isBtMultiplexEnabled:" + this.e + ", overrideCarrierInfos:" + this.f + ", authKey:" + this.g + ", sessionId:" + this.h + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.e(parcel0, 5, this.e);
        baub.y(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.v(parcel0, 8, this.h, false);
        baub.c(parcel0, v1);
    }
}

