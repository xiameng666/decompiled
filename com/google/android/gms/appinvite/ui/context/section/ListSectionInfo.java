package com.google.android.gms.appinvite.ui.context.section;

import accn;
import accz;
import acdg;
import acdx;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class ListSectionInfo extends LoaderSectionInfo {
    public static final Parcelable.Creator CREATOR;
    private boolean q;

    static {
        ListSectionInfo.CREATOR = new acdx();
    }

    public ListSectionInfo(Parcel parcel0) {
        super(parcel0);
        this.q = parcel0.readInt() != 0;
    }

    public ListSectionInfo(String s) {
        super(s);
    }

    @Override  // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final accz a(accn accn0, int v) {
        accz accz0 = new acdg(accn0, 0x7F0E009D, v, true, this.i, true);  // layout:appinvite_contextual_selection_list_item
        ((acdg)accz0).W(this.g, this.h);
        return accz0;
    }

    @Override  // com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(((int)this.q));
    }
}

