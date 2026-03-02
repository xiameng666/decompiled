package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbwl;
import gflt;

public class VerifyMerchantRegistrationServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        VerifyMerchantRegistrationServerRequest.CREATOR = new fbwl();
    }

    public VerifyMerchantRegistrationServerRequest(Account account0, gflt gflt0) {
        super(account0, ((Parser)((ProtoLiteMessage)gflt.a).jf(7, null)), ((MessageLite)gflt0));
    }

    public VerifyMerchantRegistrationServerRequest(Account account0, byte[] arr_b) {
        super(account0, ((Parser)((ProtoLiteMessage)gflt.a).jf(7, null)), arr_b);
    }
}

