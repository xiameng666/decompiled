package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbuh;
import gfkn;

public class IdCreditInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        IdCreditInitializeRequest.CREATOR = new fbuh();
    }

    public IdCreditInitializeRequest(Account account0, gfkn gfkn0) {
        super(account0, ((Parser)((ProtoLiteMessage)gfkn.a).jf(7, null)), ((MessageLite)gfkn0));
    }

    public IdCreditInitializeRequest(Account account0, byte[] arr_b) {
        super(account0, ((Parser)((ProtoLiteMessage)gfkn.a).jf(7, null)), arr_b);
    }
}

