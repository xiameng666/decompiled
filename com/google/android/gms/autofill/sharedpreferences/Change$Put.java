package com.google.android.gms.autofill.sharedpreferences;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import apgp;
import java.util.Set;

public final class Change.Put implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Object b;

    static {
        Change.Put.CREATOR = new apgp();
    }

    public Change.Put(String s, Object object0) {
        this.a = s;
        this.b = object0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return String.format("%s=%s", this.a, this.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        Object object0 = this.b;
        if(object0 == null) {
            parcel0.writeByte(1);
            return;
        }
        if((object0 instanceof Boolean)) {
            parcel0.writeByte(2);
            parcel0.writeByte(((byte)((Boolean)object0).booleanValue()));
            return;
        }
        if((object0 instanceof Float)) {
            parcel0.writeByte(3);
            parcel0.writeFloat(((Float)object0).floatValue());
            return;
        }
        if((object0 instanceof Integer)) {
            parcel0.writeByte(4);
            parcel0.writeInt(((Integer)object0).intValue());
            return;
        }
        if((object0 instanceof Long)) {
            parcel0.writeByte(5);
            parcel0.writeLong(((Long)object0).longValue());
            return;
        }
        if((object0 instanceof String)) {
            parcel0.writeByte(6);
            parcel0.writeString(((String)object0));
            return;
        }
        if(!(object0 instanceof Set)) {
            throw new UnsupportedOperationException();
        }
        parcel0.writeByte(7);
        parcel0.writeStringArray(((String[])((Set)object0).toArray(new String[0])));
    }
}

