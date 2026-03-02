package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bmgn;
import bmgo;

public enum Attachment implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator CREATOR;
    public final String c;

    static {
        Attachment.CREATOR = new bmgn();
    }

    private Attachment(String s1) {
        this.c = s1;
    }

    public static Attachment a(String s) {
        Attachment[] arr_attachment = Attachment.values();
        for(int v = 0; v < arr_attachment.length; ++v) {
            Attachment attachment0 = arr_attachment[v];
            if(s.equals(attachment0.c)) {
                return attachment0;
            }
        }
        throw new bmgo(s);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.c);
    }
}

