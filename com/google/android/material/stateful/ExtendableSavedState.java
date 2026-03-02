package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import bzs;
import fyxt;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public final bzs a;

    static {
        ExtendableSavedState.CREATOR = new fyxt();
    }

    public ExtendableSavedState(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        int v = parcel0.readInt();
        String[] arr_s = new String[v];
        parcel0.readStringArray(arr_s);
        Bundle[] arr_bundle = new Bundle[v];
        parcel0.readTypedArray(arr_bundle, Bundle.CREATOR);
        this.a = new bzs(v);
        for(int v1 = 0; v1 < v; ++v1) {
            this.a.put(arr_s[v1], arr_bundle[v1]);
        }
    }

    public ExtendableSavedState(Parcelable parcelable0) {
        super(parcelable0);
        this.a = new bzs();
    }

    @Override
    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.a.toString() + "}";
    }

    @Override  // androidx.customview.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        bzs bzs0 = this.a;
        int v1 = bzs0.d_num;
        parcel0.writeInt(v1);
        String[] arr_s = new String[v1];
        Bundle[] arr_bundle = new Bundle[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_s[v2] = (String)bzs0.f(v2);
            arr_bundle[v2] = (Bundle)bzs0.i(v2);
        }
        parcel0.writeStringArray(arr_s);
        parcel0.writeTypedArray(arr_bundle, 0);
    }
}

