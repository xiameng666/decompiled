package com.google.android.gms.appinvite.ui.context.section;

import accn;
import accz;
import acdn;
import acdy;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class SelectionSectionInfo extends SectionInfo {
    public static final Parcelable.Creator CREATOR;
    public CharSequence a;
    public boolean b;

    static {
        SelectionSectionInfo.CREATOR = new acdy();
    }

    public SelectionSectionInfo() {
    }

    public SelectionSectionInfo(Parcel parcel0) {
        super(parcel0);
        this.a = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
        this.b = parcel0.readInt() != 0;
    }

    @Override  // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final accz a(accn accn0, int v) {
        return new acdn(accn0, v, "Recipients", this.a, this.b, false);
    }

    @Override  // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final accz d(accn accn0, int v) {
        return new acdn(accn0, v, "Recipients", this.a, this.b, true);
    }

    @Override  // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        TextUtils.writeToParcel(this.a, parcel0, v);
        parcel0.writeInt(((int)this.b));
    }
}

