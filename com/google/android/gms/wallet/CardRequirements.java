package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fawb;
import java.util.ArrayList;

public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ArrayList a;
    public final boolean b;
    public boolean c;
    public int d;

    static {
        CardRequirements.CREATOR = new fawb();
    }

    private CardRequirements() {
        this.b = true;
    }

    public CardRequirements(ArrayList arrayList0, boolean z, boolean z1, int v) {
        this.a = arrayList0;
        this.b = z;
        this.c = z1;
        this.d = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.E(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

