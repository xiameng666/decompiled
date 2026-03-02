package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bbqr;
import bkpm;
import godp;
import java.util.Arrays;

public final class ContactPickerOptionsData implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public int g;
    public int[] h;
    private final String i;
    private final String j;
    private final String k;

    static {
        ContactPickerOptionsData.CREATOR = new bkpm();
    }

    public ContactPickerOptionsData(Parcel parcel0) {
        this.a = bbqr.c(parcel0.readString());
        this.b = bbqr.c(parcel0.readString());
        this.i = bbqr.c(parcel0.readString());
        this.j = bbqr.c(parcel0.readString());
        this.k = bbqr.c(parcel0.readString());
        this.c = bbqr.c(parcel0.readString());
        this.d = bbqr.c(parcel0.readString());
        this.e = bbqr.c(parcel0.readString());
        this.f = bbqr.c(parcel0.readString());
        this.g = parcel0.readInt();
        int[] arr_v = parcel0.createIntArray();
        if(arr_v == null) {
            arr_v = new int[0];
        }
        this.h = arr_v;
    }

    public ContactPickerOptionsData(godp godp0) {
        this.a = godp0.b;
        this.b = godp0.c;
        this.i = godp0.d;
        this.j = godp0.e;
        this.k = godp0.f;
        this.c = godp0.g;
        this.d = godp0.h;
        this.e = godp0.i;
        this.f = godp0.j;
    }

    public final void a(int[] arr_v) {
        this.h = Arrays.copyOf(arr_v, 1);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.i);
        parcel0.writeString(this.j);
        parcel0.writeString(this.k);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeString(this.e);
        parcel0.writeString(this.f);
        parcel0.writeInt(this.g);
        parcel0.writeIntArray(this.h);
    }
}

