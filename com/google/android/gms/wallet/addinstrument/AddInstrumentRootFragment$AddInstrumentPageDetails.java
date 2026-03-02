package com.google.android.gms.wallet.addinstrument;

import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.ui.common.PageDetails;
import fayf;
import geqb;

public class AddInstrumentRootFragment.AddInstrumentPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR;

    static {
        AddInstrumentRootFragment.AddInstrumentPageDetails.CREATOR = new fayf();
    }

    public AddInstrumentRootFragment.AddInstrumentPageDetails() {
    }

    public AddInstrumentRootFragment.AddInstrumentPageDetails(Parcel parcel0) {
        super(parcel0);
    }

    public AddInstrumentRootFragment.AddInstrumentPageDetails(PageDetails pageDetails0) {
        super(pageDetails0);
    }

    @Override  // com.google.android.gms.wallet.ui.common.PageDetails
    protected final Parser a() {
        return (Parser)((ProtoLiteMessage)geqb.a).jf(7, null);
    }
}

