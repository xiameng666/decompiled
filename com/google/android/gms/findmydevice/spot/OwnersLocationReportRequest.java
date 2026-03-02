package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bnja;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class OwnersLocationReportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public ScanResult b;

    static {
        OwnersLocationReportRequest.CREATOR = new bnja();
    }

    private OwnersLocationReportRequest() {
    }

    public OwnersLocationReportRequest(Account account0, ScanResult scanResult0) {
        this.a = account0;
        this.b = scanResult0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OwnersLocationReportRequest) && bata.b(this.a, ((OwnersLocationReportRequest)object0).a) && bata.b(this.b, ((OwnersLocationReportRequest)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

