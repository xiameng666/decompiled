package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbuc;
import hcgx;

public class GetAccountEligibilityServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        GetAccountEligibilityServerRequest.CREATOR = new fbuc();
    }

    public GetAccountEligibilityServerRequest(Account account0, hcgx hcgx0) {
        super(account0, ((Parser)((ProtoLiteMessage)hcgx.a).jf(7, null)), ((MessageLite)hcgx0));
    }

    public GetAccountEligibilityServerRequest(Account account0, byte[] arr_b) {
        super(account0, ((Parser)((ProtoLiteMessage)hcgx.a).jf(7, null)), arr_b);
    }
}

