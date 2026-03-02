package com.google.android.gms.wallet.analytics.events;

import ByteString;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import fayz;
import fbpb;
import fbpm;
import fbpn;
import gete;
import getj;
import gkkg;
import gkkh;

public class OrchestrationApiEvent extends WalletAnalyticsEvent implements fbpm {
    public static final Parcelable.Creator CREATOR;
    public int a;
    private String b;
    private long c;
    private byte[] d;

    static {
        OrchestrationApiEvent.CREATOR = new fayz();
    }

    public OrchestrationApiEvent(Parcel parcel0) {
        super(parcel0);
        this.a = 1;
        this.a = gkkg.a(parcel0.readInt());
        this.b = parcel0.readString();
        this.c = parcel0.readLong();
        this.d = parcel0.createByteArray();
    }

    public OrchestrationApiEvent(String s) {
        this.a = 1;
        this.m = s;
    }

    public static void a(Context context0, int v, gete gete0, getj getj0, String s) {
        OrchestrationApiEvent orchestrationApiEvent0 = new OrchestrationApiEvent(s);
        orchestrationApiEvent0.a = v;
        if(gete0 != null) {
            orchestrationApiEvent0.c = gete0.e;
            orchestrationApiEvent0.d = gete0.g.toByteArray();
        }
        if(getj0 != null) {
            orchestrationApiEvent0.b = getj0.h;
        }
        fbpb.a(context0, orchestrationApiEvent0);
    }

    @Override  // fbpm
    public final void b(Context context0, fbpn fbpn0, ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkkh.a).v_newBuilder();
        int v = this.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        if(v == 0) {
            throw null;
        }
        ((gkkh)hftv0).c = v - 1;
        ((gkkh)hftv0).b |= 1;
        long v1 = this.c;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gkkh)hftv1).b |= 4;
        ((gkkh)hftv1).e = v1;
        String s = this.b;
        if(s != null) {
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gkkh gkkh0 = (gkkh)hftp1.b_message;
            gkkh0.b |= 2;
            gkkh0.d = s;
        }
        byte[] arr_b = this.d;
        if(arr_b != null) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gkkh gkkh1 = (gkkh)hftp1.b_message;
            gkkh1.b |= 8;
            gkkh1.f = hfsf0;
        }
        gkkh gkkh2 = (gkkh)hftp1.N_build();
        fbpn0.a.add(gkkh2);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        int v1 = this.a - 1;
        if(this.a == 0) {
            throw null;
        }
        parcel0.writeInt(v1);
        parcel0.writeString((this.b == null ? "" : this.b));
        parcel0.writeLong(this.c);
        parcel0.writeByteArray((this.d == null ? new byte[0] : this.d));
    }
}

