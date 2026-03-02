package com.google.android.gms.wallet.service;

import MessageLite;
import Parser;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import gciq;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericLiteProtoParcelable implements Parcelable {
    public final Account a;
    public MessageLite b;
    public List c;
    private final Parser d;
    private byte[] e;

    public GenericLiteProtoParcelable(Account account0, Parser hfvs0, MessageLite hfvm0) {
        this(account0, hfvs0, hfvm0, null);
    }

    public GenericLiteProtoParcelable(Account account0, Parser hfvs0, MessageLite hfvm0, List list0) {
        this.a = account0;
        this.d = hfvs0;
        this.b = hfvm0;
        if(list0 != null) {
            this.c = new ArrayList(list0);
        }
    }

    public GenericLiteProtoParcelable(Account account0, Parser hfvs0, byte[] arr_b) {
        this(account0, hfvs0, arr_b, null);
    }

    public GenericLiteProtoParcelable(Account account0, Parser hfvs0, byte[] arr_b, List list0) {
        this.a = account0;
        this.d = hfvs0;
        this.e = (byte[])arr_b.clone();
        if(list0 != null) {
            this.c = new ArrayList(list0);
        }
    }

    public final MessageLite a() {
        if(this.b == null) {
            this.b = gciq.c(this.e, this.d);
        }
        return this.b;
    }

    public final byte[] b() {
        if(this.e == null) {
            this.e = this.b.toBytesArray();
        }
        return (byte[])this.e.clone();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        this.a.writeToParcel(parcel0, 0);
        parcel0.writeByteArray(this.b());
        parcel0.writeStringList(this.c);
    }
}

