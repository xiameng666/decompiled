package com.google.android.gms.wallet.pm;

import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.ui.common.PageDetails;
import fbnc;
import hcgp;

public class PmRootFragment.PurchaseManagerPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR;

    static {
        PmRootFragment.PurchaseManagerPageDetails.CREATOR = new fbnc();
    }

    public PmRootFragment.PurchaseManagerPageDetails() {
    }

    public PmRootFragment.PurchaseManagerPageDetails(Parcel parcel0) {
        super(parcel0);
    }

    @Override  // com.google.android.gms.wallet.ui.common.PageDetails
    protected final Parser a() {
        return (Parser)((ProtoLiteMessage)hcgp.a).jf(7, null);
    }
}

