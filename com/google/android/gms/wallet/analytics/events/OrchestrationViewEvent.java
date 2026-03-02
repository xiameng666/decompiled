package com.google.android.gms.wallet.analytics.events;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import faze;
import fbpb;
import fbpm;
import fbpn;
import gamj;
import gknb;
import gknc;

public class OrchestrationViewEvent extends WalletAnalyticsEvent implements fbpm {
    public static final Parcelable.Creator CREATOR;
    private final int a;
    private final int b;

    static {
        OrchestrationViewEvent.CREATOR = new faze();
    }

    public OrchestrationViewEvent(Parcel parcel0) {
        super(parcel0);
        this.a = parcel0.readInt();
        int v = gknb.a(parcel0.readInt());
        if(v == 0) {
            v = 1;
        }
        this.b = v;
    }

    public OrchestrationViewEvent(String s, int v, int v1) {
        this.m = s;
        this.a = v;
        this.b = v1;
    }

    public static void a(Context context0, String s, gamj gamj0) {
        OrchestrationViewEvent.e(context0, s, gamj0, 2);
    }

    @Override  // fbpm
    public final void b(Context context0, fbpn fbpn0, ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gknc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gknc)hftv0).b |= 1;
        ((gknc)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gknc)hftp1.b_message).d = this.b;
        ((gknc)hftp1.b_message).b |= 2;
        gknc gknc0 = (gknc)hftp1.N_build();
        fbpn0.c.add(gknc0);
    }

    public static void c(Context context0, String s, gamj gamj0) {
        OrchestrationViewEvent.e(context0, s, gamj0, 3);
    }

    public static void d(Context context0, String s, gamj gamj0) {
        OrchestrationViewEvent.e(context0, s, gamj0, 1);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static void e(Context context0, String s, gamj gamj0, int v) {
        if(gamj0 == null) {
            return;
        }
        fbpb.a(context0, new OrchestrationViewEvent(s, gamj0.a, v));
    }

    @Override  // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
    }
}

