package com.google.android.gms.wallet.service.ib;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fbsw;
import fbym;

public class ProcessBuyFlowResultResponse implements Parcelable, fbym {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final Intent c;
    public final boolean d;
    public final int e;

    static {
        ProcessBuyFlowResultResponse.CREATOR = new fbsw();
    }

    public ProcessBuyFlowResultResponse(int v, int v1, int v2, Intent intent0, boolean z) {
        this.a = v;
        this.b = v1;
        this.e = v2;
        this.c = intent0;
        this.d = z;
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
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
        int v1 = this.e;
        if(v1 == 0) {
            throw null;
        }
        parcel0.writeInt(v1 - 1);
        parcel0.writeParcelable(this.c, v);
        parcel0.writeByte(((byte)this.d));
    }
}

