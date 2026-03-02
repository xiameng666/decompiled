package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import fbtq;
import fbym;
import gciq;
import hfyv;

public class BuyflowResponse implements Parcelable, fbym {
    public static final Parcelable.Creator CREATOR;
    public final ServerResponse a;
    public final hfyv b;
    public int c;

    static {
        BuyflowResponse.CREATOR = new fbtq();
    }

    public BuyflowResponse(ServerResponse serverResponse0, hfyv hfyv0) {
        this.c = 1;
        this.a = serverResponse0;
        this.b = hfyv0;
    }

    @Override  // fbym
    public final boolean a() {
        return this.a.a();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        gciq.o(((MessageLite)this.b), parcel0);
        this.a.writeToParcel(parcel0, v);
        int v1 = this.c - 1;
        if(this.c == 0) {
            throw null;
        }
        parcel0.writeInt(v1);
    }
}

