package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbti;
import gepz;

public class AddInstrumentInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        AddInstrumentInitializeRequest.CREATOR = new fbti();
    }

    public AddInstrumentInitializeRequest(Account account0, gepz gepz0) {
        super(account0, ((Parser)((ProtoLiteMessage)gepz.a).jf(7, null)), ((MessageLite)gepz0), null);
    }

    public AddInstrumentInitializeRequest(Account account0, byte[] arr_b) {
        super(account0, ((Parser)((ProtoLiteMessage)gepz.a).jf(7, null)), arr_b, null);
    }
}

