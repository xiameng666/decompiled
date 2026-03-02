package com.google.android.gms.wearable.node.accountmatching.matcher;

import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import feay;
import fewz;
import gged_interceptors;
import ggfn;
import ggfp;
import ggna;
import ggqj;
import hfri;
import hfsl;
import hfsm;
import hftc;
import hfur;
import hfvu;
import hfwc;
import hfwr;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class AccountsMatcher.AccountsMatcherResult implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final ggfp a;
    public final ggfp b;
    private final ggfp c;

    static {
        AccountsMatcher.AccountsMatcherResult.CREATOR = new feay();
    }

    public AccountsMatcher.AccountsMatcherResult(ggfp ggfp0, ggfp ggfp1, ggfp ggfp2) {
        this.c = ggfp0;
        this.a = ggfp1;
        this.b = ggfp2;
    }

    public static ggfp a(Parcel parcel0) {
        hfsl hfsl0;
        int v1;
        ProtoLiteMessage hftv0;
        hftc hftc0;
        fewz fewz0;
        byte[] arr_b = parcel0.createByteArray();
        if(arr_b == null) {
            return null;
        }
        ggfn ggfn0 = new ggfn();
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        while(true) {
            try {
            label_5:
                fewz0 = fewz.a;
                hftc0 = hftc.a;
            }
            catch(IOException unused_ex) {
                goto label_5;
            }
            try {
                int v = byteArrayInputStream0.read();
                if(v == -1) {
                    hftv0 = null;
                }
                else {
                    v1 = hfsl.L(v, byteArrayInputStream0);
                    goto label_17;
                }
                goto label_47;
            }
            catch(hfur hfur0) {
            }
            catch(IOException iOException0) {
                throw new hfur(iOException0);
            }
            try {
                throw hfur0.b ? new hfur(hfur0) : hfur0;
            label_17:
                hfsl0 = hfsl.N(new hfri(byteArrayInputStream0, v1));
                hftv0 = ((ProtoLiteMessage)fewz0).x_newMutableInstance();
            }
            catch(IOException unused_ex) {
                goto label_5;
            }
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                hfwc0.g(hftv0);
                goto label_42;
            }
            catch(hfur hfur1) {
            }
            catch(hfwr hfwr0) {
                goto label_29;
            }
            catch(IOException iOException1) {
                goto label_33;
            }
            catch(RuntimeException runtimeException0) {
                goto label_39;
            }
            try {
                if(hfur1.b) {
                    hfur1 = new hfur(hfur1);
                }
                hfur1.a = hftv0;
                throw hfur1;
            label_29:
                hfur hfur2 = hfwr0.a();
                hfur2.a = hftv0;
                throw hfur2;
            label_33:
                if((iOException1.getCause() instanceof hfur)) {
                    throw (hfur)iOException1.getCause();
                }
                hfur hfur3 = new hfur(iOException1);
                hfur3.a = hftv0;
                throw hfur3;
            label_39:
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
                try {
                label_42:
                    hfsl0.z(0);
                }
                catch(hfur hfur4) {
                    hfur4.a = hftv0;
                    throw hfur4;
                }
            label_47:
                ProtoLiteMessage.P_makeImmutable(hftv0);
                if(((fewz)hftv0) == null) {
                    break;
                }
                ggfn0.i(((fewz)hftv0));
            }
            catch(IOException unused_ex) {
            }
        }
        return ggfn0.h();
    }

    public final boolean b() {
        return !this.a.isEmpty() && !this.c.isEmpty() && this.b.isEmpty();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        gged_interceptors gged0 = gged_interceptors.n(this.c, this.a, this.b);
        int v1 = ((ggna)gged0).c;
        for(int v2 = 0; v2 < v1; ++v2) {
            ggqj ggqj0 = ((ggfp)gged0.get(v2)).om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                fewz fewz0 = (fewz)object0;
                try {
                    fewz0.writeDelimitedTo(byteArrayOutputStream0);
                }
                catch(IOException unused_ex) {
                }
            }
            parcel0.writeByteArray(byteArrayOutputStream0.toByteArray());
            byteArrayOutputStream0.reset();
        }
    }
}

