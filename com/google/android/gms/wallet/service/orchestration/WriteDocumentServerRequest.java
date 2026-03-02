package com.google.android.gms.wallet.service.orchestration;

import Parser;
import ProtoLiteMessage;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import fbwn;
import gfjy;

public class WriteDocumentServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Uri d;
    public final String e;

    static {
        WriteDocumentServerRequest.CREATOR = new fbwn();
    }

    public WriteDocumentServerRequest(Account account0, byte[] arr_b, Uri uri0, String s) {
        super(account0, ((Parser)((ProtoLiteMessage)gfjy.a).jf(7, null)), arr_b);
        this.d = uri0;
        this.e = s;
    }

    @Override  // com.google.android.gms.wallet.service.GenericLiteProtoParcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        this.a.writeToParcel(parcel0, 0);
        parcel0.writeByteArray(this.b());
        Uri.writeToParcel(parcel0, this.d);
        parcel0.writeString(this.e);
    }
}

