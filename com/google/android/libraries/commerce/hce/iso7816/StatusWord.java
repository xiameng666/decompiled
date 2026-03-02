package com.google.android.libraries.commerce.hce.iso7816;

import android.os.Parcel;
import android.os.Parcelable;
import fgzl;

public abstract class StatusWord implements Parcelable {
    public final fgzl E;

    protected StatusWord(Parcel parcel0) {
        String s = parcel0.readString();
        this.E = (fgzl)Enum.valueOf(fgzl.class, s);
    }

    protected StatusWord(fgzl fgzl0) {
        this.E = fgzl0;
    }

    public abstract int a();

    public abstract byte[] b();

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.E.name());
    }
}

