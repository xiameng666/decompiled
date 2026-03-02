package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import faui;
import java.util.Arrays;

public class BarcodeDetectorOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public boolean b;

    static {
        BarcodeDetectorOptions.CREATOR = new faui();
    }

    public BarcodeDetectorOptions() {
    }

    public BarcodeDetectorOptions(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof BarcodeDetectorOptions) ? this.a == ((BarcodeDetectorOptions)object0).a && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((BarcodeDetectorOptions)object0).b)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), Boolean.valueOf(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.e(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}

