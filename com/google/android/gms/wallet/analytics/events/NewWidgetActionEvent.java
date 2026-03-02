package com.google.android.gms.wallet.analytics.events;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import fayv;
import fbdz;
import fbpb;
import fbpm;
import fbpn;
import gklp;
import gklq;

public class NewWidgetActionEvent extends WalletAnalyticsEvent implements fbpm {
    public static final Parcelable.Creator CREATOR;
    final int a;
    final int b;
    final int c;
    final int d;

    static {
        NewWidgetActionEvent.CREATOR = new fayv();
    }

    public NewWidgetActionEvent(Parcel parcel0) {
        super(parcel0);
        this.a = parcel0.readInt();
        this.c = gklp.a(parcel0.readInt());
        this.d = fbdz.a(parcel0.readInt());
        this.b = parcel0.readInt();
    }

    public NewWidgetActionEvent(String s, int v, int v1, int v2, int v3) {
        this.m = s;
        this.a = v;
        this.c = v1;
        this.d = v2;
        this.b = v3;
    }

    public static void a(Context context0, String s, int v, int v1, int v2, int v3) {
        fbpb.a(context0, new NewWidgetActionEvent(s, v, v1, v2, v3));
    }

    @Override  // fbpm
    public final void b(Context context0, fbpn fbpn0, ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gklq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gklq)hftv0).b |= 1;
        ((gklq)hftv0).c = this.a;
        int v = this.c;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        if(v == 0) {
            throw null;
        }
        ((gklq)hftv1).d = v - 1;
        ((gklq)hftv1).b |= 2;
        int v1 = this.d;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gklq)hftv2).e = v1 - 1;
        ((gklq)hftv2).b |= 4;
        int v2 = this.b;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        gklq gklq0 = (gklq)hftp1.b_message;
        gklq0.b |= 8;
        gklq0.f = v2;
        gklq gklq1 = (gklq)hftp1.N_build();
        fbpn0.f.add(gklq1);
    }

    public static void c(Context context0, String s, int v) {
        NewWidgetActionEvent.a(context0, s, v, 2, 1, -1);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.a);
        int v1 = this.c;
        if(v1 == 0) {
            throw null;
        }
        parcel0.writeInt(v1 - 1);
        parcel0.writeInt(this.d - 1);
        parcel0.writeInt(this.b);
    }
}

