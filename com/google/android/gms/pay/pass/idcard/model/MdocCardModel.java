package com.google.android.gms.pay.pass.idcard.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import dtsl;
import gtxx;
import gumi;
import j..util.Objects;

public class MdocCardModel extends AbstractMdocModel {
    public static final Parcelable.Creator CREATOR;
    private final gtxx b;
    private final gumi c;

    static {
        MdocCardModel.CREATOR = new dtsl();
    }

    public MdocCardModel(String s, gtxx gtxx0, gumi gumi0) {
        super(s, gumi0);
        this.b = gtxx0;
        this.c = gumi0;
    }

    @Override  // com.google.android.gms.pay.pass.idcard.model.AbstractMdocModel
    public final boolean equals(Object object0) {
        return (object0 instanceof MdocCardModel) ? Objects.equals(this.b, ((MdocCardModel)object0).b) && Objects.equals(this.c, ((MdocCardModel)object0).c) : false;
    }

    @Override  // com.google.android.gms.pay.pass.idcard.model.AbstractMdocModel
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeByteArray(this.b.toBytesArray());
        parcel0.writeByteArray(this.c.toBytesArray());
    }
}

