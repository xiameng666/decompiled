package com.google.android.gms.pay.backup.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bata;
import batl;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import dlol;
import gged_interceptors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassBackupData implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final AccountInfo a;
    public final gged_interceptors b;
    public final ArrayList c;
    private final gged_interceptors d;

    static {
        PassBackupData.CREATOR = new dlol();
    }

    public PassBackupData(Parcel parcel0) {
        this.a = (AccountInfo)parcel0.readParcelable(AccountInfo.class.getClassLoader());
        ArrayList arrayList0 = new ArrayList();
        parcel0.readTypedList(arrayList0, Valuable.CREATOR);
        ArrayList arrayList1 = new ArrayList();
        parcel0.readTypedList(arrayList1, PassImageData.CREATOR);
        ArrayList arrayList2 = new ArrayList();
        parcel0.readStringList(arrayList2);
        this.c = new ArrayList(arrayList2);
        this.b = gged_interceptors.i(arrayList0);
        this.d = gged_interceptors.i(arrayList1);
    }

    public PassBackupData(AccountInfo accountInfo0, List list0, List list1, List list2) {
        batl.s(list0);
        batl.s(list1);
        this.a = accountInfo0;
        this.b = gged_interceptors.i(list0);
        this.d = gged_interceptors.i(list1);
        this.c = new ArrayList(list2);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PassBackupData) ? bata.b(this.a, ((PassBackupData)object0).a) && bata.b(this.b, ((PassBackupData)object0).b) && bata.b(this.d, ((PassBackupData)object0).d) && bata.b(this.c, ((PassBackupData)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.a, v);
        parcel0.writeTypedList(this.b);
        parcel0.writeTypedList(this.d);
        parcel0.writeStringList(this.c);
    }
}

