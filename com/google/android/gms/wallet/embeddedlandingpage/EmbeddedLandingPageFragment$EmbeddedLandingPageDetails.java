package com.google.android.gms.wallet.embeddedlandingpage;

import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.ui.common.PageDetails;
import fbhr;
import hcgc;

public class EmbeddedLandingPageFragment.EmbeddedLandingPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR;

    static {
        EmbeddedLandingPageFragment.EmbeddedLandingPageDetails.CREATOR = new fbhr();
    }

    public EmbeddedLandingPageFragment.EmbeddedLandingPageDetails() {
    }

    public EmbeddedLandingPageFragment.EmbeddedLandingPageDetails(Parcel parcel0) {
        super(parcel0);
    }

    @Override  // com.google.android.gms.wallet.ui.common.PageDetails
    protected final Parser a() {
        return (Parser)((ProtoLiteMessage)hcgc.a).jf(7, null);
    }
}

