package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.WebPaymentData;
import fbsp;
import fbym;

public class LoadWebPaymentDataServiceResponse implements Parcelable, fbym {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;
    public final WebPaymentData b;
    public final Status c;

    static {
        LoadWebPaymentDataServiceResponse.CREATOR = new fbsp();
    }

    public LoadWebPaymentDataServiceResponse(Bundle bundle0, WebPaymentData webPaymentData0, Status status0) {
        this.a = bundle0;
        this.b = webPaymentData0;
        this.c = status0;
    }

    public LoadWebPaymentDataServiceResponse(Parcel parcel0) {
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        this.a = parcel0.readBundle(classLoader0);
        this.b = (WebPaymentData)parcel0.readParcelable(classLoader0);
        this.c = (Status)parcel0.readParcelable(classLoader0);
    }

    @Override  // fbym
    public final boolean a() {
        return false;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeBundle(this.a);
        parcel0.writeParcelable(this.b, v);
        parcel0.writeParcelable(this.c, v);
    }
}

