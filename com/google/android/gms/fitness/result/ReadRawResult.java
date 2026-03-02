package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import baub;
import brdv;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.List;

public class ReadRawResult extends AbstractSafeParcelable implements azuj, Closeable {
    public static final Parcelable.Creator CREATOR;
    public final DataHolder a;

    static {
        ReadRawResult.CREATOR = new brdv();
    }

    public ReadRawResult(DataHolder dataHolder0) {
        this.a = dataHolder0;
    }

    public ReadRawResult(DataHolder dataHolder0, List list0) {
        this.a = dataHolder0;
        if(list0 != null) {
            for(Object object0: list0) {
                ((DataHolder)object0).close();
            }
        }
    }

    @Override  // azuj
    public final Status a() {
        return new Status(this.a.f);
    }

    @Override
    public final void close() {
        DataHolder dataHolder0 = this.a;
        if(dataHolder0 != null) {
            dataHolder0.close();
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

