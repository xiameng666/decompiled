package com.github.mikephil.charting.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import vlg;
import vli;

public class Entry extends vlg implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private float a;

    static {
        Entry.CREATOR = new vli();
    }

    public Entry() {
        this.a = 0.0f;
    }

    public Entry(float f, float f1) {
        super(f1);
        this.a = f;
    }

    public Entry(Parcel parcel0) {
        this.a = 0.0f;
        this.a = parcel0.readFloat();
        this.e = parcel0.readFloat();
        if(parcel0.readInt() == 1) {
            this.f = parcel0.readParcelable(Object.class.getClassLoader());
        }
    }

    public float a() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "Entry, x: " + this.a + " y: " + this.e;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeFloat(this.a);
        parcel0.writeFloat(this.e);
        if(this.f != null) {
            parcel0.writeInt(1);
            parcel0.writeParcelable(((Parcelable)this.f), v);
            return;
        }
        parcel0.writeInt(0);
    }
}

