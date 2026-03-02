package com.google.android.gms.wallet.buyflow;

import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.ui.common.PageDetails;
import fbcx;
import geqz;

public class BuyFlowFragment.BuyFlowPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR;

    static {
        BuyFlowFragment.BuyFlowPageDetails.CREATOR = new fbcx();
    }

    public BuyFlowFragment.BuyFlowPageDetails() {
    }

    public BuyFlowFragment.BuyFlowPageDetails(Parcel parcel0) {
        super(parcel0);
    }

    public BuyFlowFragment.BuyFlowPageDetails(PageDetails pageDetails0) {
        super(pageDetails0);
    }

    @Override  // com.google.android.gms.wallet.ui.common.PageDetails
    protected final Parser a() {
        return (Parser)((ProtoLiteMessage)geqz.b).jf(7, null);
    }
}

