package com.google.firebase.auth.api.model;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbqr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gdhq;
import gdir;
import gdiv;
import gged_interceptors;
import ggna;
import goxb;
import goyb;
import hfuo;
import java.util.ArrayList;
import java.util.List;

public class GetAccountInfoResponse extends AbstractSafeParcelable implements goxb {
    public static final Parcelable.Creator CREATOR;
    public GetAccountInfoUserList a;

    static {
        GetAccountInfoResponse.CREATOR = new goyb();
    }

    public GetAccountInfoResponse() {
    }

    public GetAccountInfoResponse(GetAccountInfoUserList getAccountInfoUserList0) {
        GetAccountInfoUserList getAccountInfoUserList1;
        if(getAccountInfoUserList0 == null) {
            getAccountInfoUserList1 = new GetAccountInfoUserList();
        }
        else {
            List list0 = getAccountInfoUserList0.a;
            GetAccountInfoUserList getAccountInfoUserList2 = new GetAccountInfoUserList();
            if(list0 != null && !list0.isEmpty()) {
                getAccountInfoUserList2.a.addAll(list0);
            }
            getAccountInfoUserList1 = getAccountInfoUserList2;
        }
        this.a = getAccountInfoUserList1;
    }

    @Override  // goxb
    public final Parser a() {
        return (Parser)((ProtoLiteMessage)gdhq.a).jf(7, null);
    }

    @Override  // goxb
    public final void b(MessageLite hfvm0) {
        gged_interceptors gged0;
        gdhq gdhq1;
        if(!(hfvm0 instanceof gdhq)) {
            throw new IllegalArgumentException("The passed proto must be an instance of GetAccountInfoResponse.");
        }
        gdhq gdhq0 = (gdhq)hfvm0;
        if(gdhq0.b.size() != 0) {
            ArrayList arrayList0 = new ArrayList(gdhq0.b.size());
            int v = 0;
            while(v < gdhq0.b.size()) {
                gdiv gdiv0 = (gdiv)gdhq0.b.get(v);
                String s = bbqr.b(gdiv0.b);
                String s1 = bbqr.b(gdiv0.c);
                boolean z = gdiv0.f;
                String s2 = bbqr.b(gdiv0.d);
                String s3 = bbqr.b(gdiv0.e);
                ProviderUserInfoList providerUserInfoList0 = ProviderUserInfoList.a(gdiv0.g);
                String s4 = bbqr.b(gdiv0.j);
                String s5 = bbqr.b(gdiv0.k);
                long v1 = gdiv0.i;
                long v2 = gdiv0.h;
                hfuo hfuo0 = gdiv0.l;
                if(hfuo0 == null) {
                    gdhq1 = gdhq0;
                    gged0 = ggna.a;
                }
                else {
                    gdhq1 = gdhq0;
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object0: hfuo0) {
                        arrayList1.add(MfaInfo.a(((gdir)object0)));
                        v = v;
                    }
                    gged0 = arrayList1;
                }
                arrayList0.add(new GetAccountInfoUser(s, s1, z, s2, s3, providerUserInfoList0, s4, s5, v1, v2, false, null, gged0));
                ++v;
                gdhq0 = gdhq1;
            }
            this.a = new GetAccountInfoUserList(arrayList0);
            return;
        }
        this.a = new GetAccountInfoUserList();
    }

    public final List c() {
        return this.a.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

