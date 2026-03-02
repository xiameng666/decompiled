package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbul;
import gfld;
import java.util.List;

public class InstrumentManagerRefreshRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        InstrumentManagerRefreshRequest.CREATOR = new fbul();
    }

    public InstrumentManagerRefreshRequest(Account account0, gfld gfld0, List list0) {
        super(account0, ((Parser)((ProtoLiteMessage)gfld.a).jf(7, null)), ((MessageLite)gfld0), list0);
    }

    public InstrumentManagerRefreshRequest(Account account0, byte[] arr_b, List list0) {
        super(account0, ((Parser)((ProtoLiteMessage)gfld.a).jf(7, null)), arr_b, list0);
    }
}

