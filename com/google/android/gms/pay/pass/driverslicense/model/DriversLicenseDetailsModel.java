package com.google.android.gms.pay.pass.driverslicense.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import dtno;
import gtwb;
import gumi;
import j..util.Objects;

public class DriversLicenseDetailsModel extends AbstractDriversLicenseModel {
    public static final Parcelable.Creator CREATOR;
    private final gtwb b;
    private final gumi c;

    static {
        DriversLicenseDetailsModel.CREATOR = new dtno();
    }

    public DriversLicenseDetailsModel(String s, gtwb gtwb0, gumi gumi0) {
        super(s, gumi0);
        this.b = gtwb0;
        this.c = gumi0;
    }

    @Override  // com.google.android.gms.pay.pass.driverslicense.model.AbstractDriversLicenseModel
    public final boolean equals(Object object0) {
        return (object0 instanceof DriversLicenseDetailsModel) ? Objects.equals(this.b, ((DriversLicenseDetailsModel)object0).b) && Objects.equals(this.c, ((DriversLicenseDetailsModel)object0).c) : false;
    }

    @Override  // com.google.android.gms.pay.pass.driverslicense.model.AbstractDriversLicenseModel
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeByteArray(this.b.toBytesArray());
        parcel0.writeByteArray(this.c.toBytesArray());
    }
}

