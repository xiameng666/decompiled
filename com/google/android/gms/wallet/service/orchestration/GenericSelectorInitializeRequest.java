package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbua;
import gfkf;

public class GenericSelectorInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        GenericSelectorInitializeRequest.CREATOR = new fbua();
    }

    public GenericSelectorInitializeRequest(Account account0, gfkf gfkf0) {
        super(account0, ((Parser)((ProtoLiteMessage)gfkf.a).jf(7, null)), ((MessageLite)gfkf0));
    }

    public GenericSelectorInitializeRequest(Account account0, byte[] arr_b) {
        super(account0, ((Parser)((ProtoLiteMessage)gfkf.a).jf(7, null)), arr_b);
    }
}

