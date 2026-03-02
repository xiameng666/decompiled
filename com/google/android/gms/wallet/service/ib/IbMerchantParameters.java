package com.google.android.gms.wallet.service.ib;

import MessageLite;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fbra;
import gciq;
import gkmh;

public class IbMerchantParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public String b;
    public boolean c;
    public gkmh d;

    static {
        IbMerchantParameters.CREATOR = new fbra();
    }

    public IbMerchantParameters() {
        this.a = 0;
    }

    public IbMerchantParameters(int v, String s, boolean z, gkmh gkmh0) {
        this.a = v;
        this.b = s;
        this.c = z;
        this.d = gkmh0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeString(this.b);
        parcel0.writeByte(((byte)this.c));
        gciq.o(((MessageLite)this.d), parcel0);
    }
}

