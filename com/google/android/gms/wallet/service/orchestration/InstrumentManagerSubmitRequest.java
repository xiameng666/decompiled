package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbum;
import gflf;
import java.util.List;

public class InstrumentManagerSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        InstrumentManagerSubmitRequest.CREATOR = new fbum();
    }

    public InstrumentManagerSubmitRequest(Account account0, gflf gflf0, List list0) {
        super(account0, ((Parser)((ProtoLiteMessage)gflf.a).jf(7, null)), ((MessageLite)gflf0), list0);
    }

    public InstrumentManagerSubmitRequest(Account account0, byte[] arr_b, List list0) {
        super(account0, ((Parser)((ProtoLiteMessage)gflf.a).jf(7, null)), arr_b, list0);
    }
}

