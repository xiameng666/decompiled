package com.google.android.gms.wallet.service.reauth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fbxl;
import fbym;

public class ReauthProofTokenResponse implements Parcelable, fbym {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final long c;

    static {
        ReauthProofTokenResponse.CREATOR = new fbxl();
    }

    public ReauthProofTokenResponse(String s, int v, long v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
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
        parcel0.writeString(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeLong(this.c);
    }
}

