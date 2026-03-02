package com.google.android.gms.wallet.service.orchestration;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbwg;
import hchn;

public class TimelineViewInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        TimelineViewInitializeRequest.CREATOR = new fbwg();
    }

    public TimelineViewInitializeRequest(Account account0, hchn hchn0) {
        super(account0, ((Parser)((ProtoLiteMessage)hchn.a).jf(7, null)), ((MessageLite)hchn0));
    }

    public TimelineViewInitializeRequest(Account account0, byte[] arr_b) {
        super(account0, ((Parser)((ProtoLiteMessage)hchn.a).jf(7, null)), arr_b);
    }
}

