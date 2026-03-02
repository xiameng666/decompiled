package com.google.android.gms.appsearch.aidl;

import acgs;
import achx;
import acjb;
import acjc;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appsearch.GetSchemaResponse;
import com.google.android.gms.appsearch.InternalSetSchemaResponse;
import com.google.android.gms.appsearch.SearchResultPage;
import com.google.android.gms.appsearch.StorageInfo;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class AppSearchResultParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Parcelable.Creator a;
    public final int b;
    public final String c;
    public InternalSetSchemaResponse d;
    public GetSchemaResponse e;
    public List f;
    public GenericDocumentParcel g;
    public SearchResultPage h;
    public List i;
    public List j;
    public StorageInfo k;
    public final acgs l;

    static {
        AppSearchResultParcel.CREATOR = new acjb();
        AppSearchResultParcel.a = new acjc();
    }

    public AppSearchResultParcel(int v, String s, InternalSetSchemaResponse internalSetSchemaResponse0, GetSchemaResponse getSchemaResponse0, List list0, GenericDocumentParcel genericDocumentParcel0, SearchResultPage searchResultPage0, List list1, List list2, StorageInfo storageInfo0) {
        this.b = v;
        this.c = s;
        if(v == 0) {
            this.d = internalSetSchemaResponse0;
            this.e = getSchemaResponse0;
            this.f = list0;
            this.g = genericDocumentParcel0;
            this.h = searchResultPage0;
            this.i = list1;
            this.j = list2;
            this.k = storageInfo0;
            if(internalSetSchemaResponse0 != null) {
                this.l = new acgs(0, internalSetSchemaResponse0, null);
                return;
            }
            if(getSchemaResponse0 != null) {
                this.l = new acgs(0, getSchemaResponse0, null);
                return;
            }
            if(list0 != null) {
                this.l = new acgs(0, list0, null);
                return;
            }
            if(genericDocumentParcel0 != null) {
                this.l = new acgs(0, genericDocumentParcel0, null);
                return;
            }
            if(searchResultPage0 != null) {
                this.l = new acgs(0, searchResultPage0, null);
                return;
            }
            if(list1 != null) {
                this.l = new acgs(0, list1, null);
                return;
            }
            if(list2 != null) {
                this.l = new acgs(0, list2, null);
                return;
            }
            if(storageInfo0 != null) {
                this.l = new acgs(0, storageInfo0, null);
                return;
            }
            this.l = new acgs(0, null, null);
            return;
        }
        this.l = new acgs(v, null, s);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        byte[] arr_b;
        Parcel parcel1 = Parcel.obtain();
        try {
            acjc.b(this, parcel1, v);
            arr_b = parcel1.marshall();
        }
        finally {
            parcel1.recycle();
        }
        achx.a(parcel0, arr_b);
    }
}

