package com.google.android.gms.auth.proximity.phonehub;

import alqc;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.service.notification.NotificationListenerService.Ranking;
import android.service.notification.NotificationListenerService.RankingMap;
import batl;

public class ParcelableRanking implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    final NotificationListenerService.RankingMap a;
    final String b;

    static {
        ParcelableRanking.CREATOR = new alqc();
    }

    public ParcelableRanking(Parcel parcel0) {
        this.a = (NotificationListenerService.RankingMap)NotificationListenerService.RankingMap.CREATOR.createFromParcel(parcel0);
        String s = parcel0.readString();
        batl.s(s);
        this.b = s;
    }

    public ParcelableRanking(NotificationListenerService.RankingMap notificationListenerService$RankingMap0, String s) {
        this.a = notificationListenerService$RankingMap0;
        this.b = s;
    }

    public final NotificationListenerService.Ranking a() {
        NotificationListenerService.Ranking notificationListenerService$Ranking0 = new NotificationListenerService.Ranking();
        this.a.getRanking(this.b, notificationListenerService$Ranking0);
        return notificationListenerService$Ranking0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        this.a.writeToParcel(parcel0, v);
        parcel0.writeString(this.b);
    }
}

