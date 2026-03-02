package com.google.android.gms.octarine.ui.actionbar;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar.SavedState;
import dkyk;
import gqsd;
import gqse;

public class AccountSwitchingToolbar.SavedState extends Toolbar.SavedState {
    public static final Parcelable.Creator CREATOR;
    gqse e;
    int f;

    static {
        AccountSwitchingToolbar.SavedState.CREATOR = new dkyk();
    }

    public AccountSwitchingToolbar.SavedState(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        this.e = gqse.b(parcel0.readInt());
        this.f = gqsd.a(parcel0.readInt());
    }

    public AccountSwitchingToolbar.SavedState(Parcelable parcelable0) {
        super(parcelable0);
    }

    @Override  // android.support.v7.widget.Toolbar$SavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.e.e);
        parcel0.writeInt((this.f == 0 ? 0 : this.f - 1));
    }
}

