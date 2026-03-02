package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbub;
import gfkl;

public class GenericSelectorSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        GenericSelectorSubmitRequest.CREATOR = new fbub();
    }

    public GenericSelectorSubmitRequest(Account account0, gfkl gfkl0) {
        super(account0, ((Parser)((ProtoLiteMessage)gfkl.a).jf(7, null)), ((MessageLite)gfkl0));
    }

    public GenericSelectorSubmitRequest(Account account0, byte[] arr_b) {
        super(account0, ((Parser)((ProtoLiteMessage)gfkl.a).jf(7, null)), arr_b);
    }
}

