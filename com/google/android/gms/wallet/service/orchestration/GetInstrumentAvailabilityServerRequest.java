package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbud;
import hchb;

public class GetInstrumentAvailabilityServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        GetInstrumentAvailabilityServerRequest.CREATOR = new fbud();
    }

    public GetInstrumentAvailabilityServerRequest(Account account0, hchb hchb0) {
        super(account0, ((Parser)((ProtoLiteMessage)hchb.a).jf(7, null)), ((MessageLite)hchb0));
    }

    public GetInstrumentAvailabilityServerRequest(Account account0, byte[] arr_b) {
        super(account0, ((Parser)((ProtoLiteMessage)hchb.a).jf(7, null)), arr_b);
    }
}

