package com.google.android.gms.wallet.pm;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;
import fbmy;
import fbmz;
import gciq;
import gepo;
import hcat;

public class PmResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public SecurePaymentsPayload a;
    public String b;
    public byte[] c;
    public String d;
    public hcat e;
    public String f;
    public gepo g;

    static {
        PmResult.a();
        PmResult.CREATOR = new fbmy();
    }

    private PmResult() {
    }

    public PmResult(Parcel parcel0) {
        this.b = parcel0.readString();
        this.c = parcel0.createByteArray();
        this.a = (SecurePaymentsPayload)parcel0.readParcelable(this.getClass().getClassLoader());
        this.d = parcel0.readString();
        this.e = (hcat)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)hcat.a).jf(7, null)));
        this.f = parcel0.readString();
        this.g = (gepo)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gepo.a).jf(7, null)));
    }

    public static fbmz a() {
        return new fbmz(new PmResult());
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b);
        parcel0.writeByteArray(this.c);
        parcel0.writeParcelable(this.a, v);
        parcel0.writeString(this.d);
        gciq.o(((MessageLite)this.e), parcel0);
        parcel0.writeString(this.f);
        gciq.o(((MessageLite)this.g), parcel0);
    }
}

