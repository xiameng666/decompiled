package com.google.location.nearby.common.fastpair;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import gxuz;
import hiht;

public class DiscoveryListItem implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final float f;
    public final String g;
    public final Intent h;
    public final Bitmap i;
    public final boolean j;
    public final hiht k;
    public final double l;
    public final String m;
    public byte[] n;

    static {
        DiscoveryListItem.CREATOR = new gxuz();
    }

    public DiscoveryListItem(Parcel parcel0) {
        boolean z = false;
        this.n = new byte[0];
        this.a = parcel0.readString();
        this.b = parcel0.readString();
        this.c = parcel0.readString();
        this.d = parcel0.readString();
        this.h = (Intent)parcel0.readParcelable(Intent.class.getClassLoader());
        this.i = (Bitmap)parcel0.readParcelable(Bitmap.class.getClassLoader());
        if(parcel0.readByte() != 0) {
            z = true;
        }
        this.j = z;
        this.k = hiht.b(parcel0.readInt());
        this.f = parcel0.readFloat();
        this.g = parcel0.readString();
        this.e = parcel0.readString();
        this.l = parcel0.readDouble();
        this.m = parcel0.readString();
        byte[] arr_b = new byte[parcel0.readInt()];
        this.n = arr_b;
        parcel0.readByteArray(arr_b);
    }

    public DiscoveryListItem(String s, String s1, String s2, String s3, float f, hiht hiht0, Intent intent0, Bitmap bitmap0, Double double0, String s4) {
        this.n = new byte[0];
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = null;
        this.e = s3;
        this.f = f;
        this.g = null;
        this.h = intent0;
        this.i = bitmap0;
        this.j = false;
        this.k = hiht0;
        this.l = double0 == null ? -1.0 : ((double)double0);
        this.m = s4;
    }

    public final boolean a() {
        return this.l >= 0.0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeParcelable(this.h, v);
        parcel0.writeParcelable(this.i, v);
        parcel0.writeByte(((byte)this.j));
        parcel0.writeInt(this.k.h);
        parcel0.writeFloat(this.f);
        parcel0.writeString(this.g);
        parcel0.writeString(this.e);
        parcel0.writeDouble(this.l);
        parcel0.writeString(this.m);
        parcel0.writeInt(this.n.length);
        parcel0.writeByteArray(this.n);
    }
}

