package com.google.android.gms.wallet.idcredit;

import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.ui.common.PageDetails;
import fbku;
import gfkp;

public class IdCreditFragment.IdCreditPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR;

    static {
        IdCreditFragment.IdCreditPageDetails.CREATOR = new fbku();
    }

    public IdCreditFragment.IdCreditPageDetails() {
    }

    public IdCreditFragment.IdCreditPageDetails(Parcel parcel0) {
        super(parcel0);
    }

    @Override  // com.google.android.gms.wallet.ui.common.PageDetails
    protected final Parser a() {
        return (Parser)((ProtoLiteMessage)gfkp.a).jf(7, null);
    }
}

