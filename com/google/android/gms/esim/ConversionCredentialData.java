package com.google.android.gms.esim;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjol;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ConversionCredentialData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final ProfileTransferData b;
    public final boolean c;
    public final ProfileTransferWebSheetInfo d;
    public final ProfileTransferMessageInfo e;
    public final String f;
    public final int g;

    static {
        ConversionCredentialData.CREATOR = new bjol();
    }

    public ConversionCredentialData(String s, ProfileTransferData profileTransferData0, boolean z, ProfileTransferWebSheetInfo profileTransferWebSheetInfo0, ProfileTransferMessageInfo profileTransferMessageInfo0, String s1, int v) {
        this.a = s;
        this.b = profileTransferData0;
        this.c = z;
        this.d = profileTransferWebSheetInfo0;
        this.e = profileTransferMessageInfo0;
        this.f = s1;
        this.g = v;
    }

    @Override
    public final String toString() {
        return "ConversionCredentialData: [token:" + this.a + ", webSheetInfo:" + this.d + ", messageInfo: " + this.e + ", errorText:" + this.f + ", esimTransferResponseType: " + this.g + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.e(parcel0, 3, this.c);
        baub.t(parcel0, 4, this.d, v, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.v(parcel0, 6, this.f, false);
        baub.o(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

