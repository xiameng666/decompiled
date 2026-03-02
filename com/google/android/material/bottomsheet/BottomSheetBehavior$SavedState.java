package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import fyfm;

public class BottomSheetBehavior.SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    final int a;
    final int b;
    final boolean e;
    final boolean f;
    final boolean g;

    static {
        BottomSheetBehavior.SavedState.CREATOR = new fyfm();
    }

    public BottomSheetBehavior.SavedState(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        this.a = parcel0.readInt();
        this.b = parcel0.readInt();
        boolean z = false;
        this.e = parcel0.readInt() == 1;
        this.f = parcel0.readInt() == 1;
        if(parcel0.readInt() == 1) {
            z = true;
        }
        this.g = z;
    }

    public BottomSheetBehavior.SavedState(Parcelable parcelable0, BottomSheetBehavior bottomSheetBehavior0) {
        super(parcelable0);
        this.a = bottomSheetBehavior0.A;
        this.b = bottomSheetBehavior0.e;
        this.e = bottomSheetBehavior0.b;
        this.f = bottomSheetBehavior0.x;
        this.g = bottomSheetBehavior0.y;
    }

    @Override  // androidx.customview.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeInt(((int)this.e));
        parcel0.writeInt(((int)this.f));
        parcel0.writeInt(((int)this.g));
    }
}

