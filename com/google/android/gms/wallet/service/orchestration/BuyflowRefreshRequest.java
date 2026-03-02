package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import fbtp;
import gerb;
import hfyv;
import java.util.List;

public class BuyflowRefreshRequest extends BaseBuyflowLiteRequest {
    public static final Parcelable.Creator CREATOR;

    static {
        BuyflowRefreshRequest.CREATOR = new fbtp();
    }

    public BuyflowRefreshRequest(Account account0, gerb gerb0, hfyv hfyv0, List list0) {
        super(account0, ((Parser)((ProtoLiteMessage)gerb.a).jf(7, null)), ((MessageLite)gerb0), hfyv0, list0);
    }

    public BuyflowRefreshRequest(Account account0, byte[] arr_b, hfyv hfyv0, List list0) {
        super(account0, ((Parser)((ProtoLiteMessage)gerb.a).jf(7, null)), arr_b, hfyv0, list0);
    }
}

