package com.google.android.gms.wallet.timelineview;

import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.ui.common.PageDetails;
import fbyq;
import hchp;

public class TimelineViewFragment.TimelineViewPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR;

    static {
        TimelineViewFragment.TimelineViewPageDetails.CREATOR = new fbyq();
    }

    public TimelineViewFragment.TimelineViewPageDetails() {
    }

    public TimelineViewFragment.TimelineViewPageDetails(Parcel parcel0) {
        super(parcel0);
    }

    @Override  // com.google.android.gms.wallet.ui.common.PageDetails
    protected final Parser a() {
        return (Parser)((ProtoLiteMessage)hchp.a).jf(7, null);
    }
}

