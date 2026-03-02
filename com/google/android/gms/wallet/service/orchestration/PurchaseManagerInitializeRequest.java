package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbwa;
import hcgn;

public class PurchaseManagerInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        PurchaseManagerInitializeRequest.CREATOR = new fbwa();
    }

    public PurchaseManagerInitializeRequest(Account account0, hcgn hcgn0) {
        super(account0, ((Parser)((ProtoLiteMessage)hcgn.a).jf(7, null)), ((MessageLite)hcgn0), null);
    }

    public PurchaseManagerInitializeRequest(Account account0, byte[] arr_b) {
        super(account0, ((Parser)((ProtoLiteMessage)hcgn.a).jf(7, null)), arr_b, null);
    }
}

