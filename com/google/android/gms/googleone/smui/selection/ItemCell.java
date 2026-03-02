package com.google.android.gms.googleone.smui.selection;

import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import buse;
import hiwq;
import hiwu;
import ibuq;

public final class ItemCell implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final hiwq a;
    public final hiwu b;

    static {
        ItemCell.CREATOR = new buse();
    }

    public ItemCell() {
        this(hiwq.a, hiwu.a);
    }

    public ItemCell(hiwq hiwq0, hiwu hiwu0) {
        ibuq.f(hiwq0, "smuiCategory");
        ibuq.f(hiwu0, "smuiItem");
        super();
        this.a = hiwq0;
        this.b = hiwu0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ItemCell)) {
            return false;
        }
        return ibuq.m(this.a, ((ItemCell)object0).a) ? ibuq.m(this.b, ((ItemCell)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v;
        hiwq hiwq0 = this.a;
        if(((ProtoLiteMessage)hiwq0).isImmutable()) {
            v = ((ProtoLiteMessage)hiwq0).s();
        }
        else {
            int v1 = hiwq0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)hiwq0).s();
                hiwq0.memoizedHashCode = v1;
            }
            v = v1;
        }
        hiwu hiwu0 = this.b;
        if(((ProtoLiteMessage)hiwu0).isImmutable()) {
            return v * 0x1F + ((ProtoLiteMessage)hiwu0).s();
        }
        int v2 = hiwu0.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)hiwu0).s();
            hiwu0.memoizedHashCode = v2;
        }
        return v * 0x1F + v2;
    }

    @Override
    public final String toString() {
        return "ItemCell(smuiCategory=" + this.a + ", smuiItem=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        ibuq.f(parcel0, "parcel");
        byte[] arr_b = null;
        parcel0.writeByteArray((this.a == null ? null : this.a.toBytesArray()));
        hiwu hiwu0 = this.b;
        ibuq.f(parcel0, "parcel");
        if(hiwu0 != null) {
            arr_b = hiwu0.toBytesArray();
        }
        parcel0.writeByteArray(arr_b);
    }
}

