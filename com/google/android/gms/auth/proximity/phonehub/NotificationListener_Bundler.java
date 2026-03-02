package com.google.android.gms.auth.proximity.phonehub;

import a;
import alpe;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.service.notification.NotificationListenerService.RankingMap;
import android.service.notification.StatusBarNotification;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableArray;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import java.util.List;

public final class NotificationListener_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR;

    static {
        NotificationListener_Bundler.CREATOR = new alpe();
    }

    @Override  // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object a(Bundle bundle0, String s, BundlerType bundlerType0) {
        bundle0.setClassLoader(Bundler.class.getClassLoader());
        String s1 = bundlerType0.a;
        if("java.lang.Void".equals(s1)) {
            return null;
        }
        if("java.lang.String".equals(s1)) {
            return bundle0.getString(s);
        }
        if("android.service.notification.StatusBarNotification".equals(s1)) {
            return (StatusBarNotification)bundle0.getParcelable(s);
        }
        if("java.lang.Object[]".equals(s1)) {
            return ((ParcelableArray)bundle0.getParcelable(s)).a;
        }
        if("java.util.List".equals(s1)) {
            return ((ParcelableList)bundle0.getParcelable(s)).a;
        }
        if("android.service.notification.NotificationListenerService.RankingMap".equals(s1)) {
            return (NotificationListenerService.RankingMap)bundle0.getParcelable(s);
        }
        if("int".equals(s1)) {
            return bundle0.getInt(s);
        }
        if("boolean".equals(s1)) {
            return Boolean.valueOf(bundle0.getBoolean(s));
        }
        if("com.google.android.gms.auth.proximity.phonehub.ParcelableRanking".equals(s1)) {
            return (ParcelableRanking)bundle0.getParcelable(s);
        }
        throw new IllegalArgumentException(a.a(s1, "Type ", " cannot be read from Bundle"));
    }

    @Override  // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel0, BundlerType bundlerType0) {
        boolean z = true;
        String s = bundlerType0.a;
        if("java.lang.Void".equals(s)) {
            return null;
        }
        if("java.lang.String".equals(s)) {
            return parcel0.readString();
        }
        if("android.service.notification.StatusBarNotification".equals(s)) {
            return (StatusBarNotification)parcel0.readParcelable(Bundler.class.getClassLoader());
        }
        if("java.lang.Object[]".equals(s)) {
            return ((ParcelableArray)parcel0.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if("java.util.List".equals(s)) {
            return ((ParcelableList)parcel0.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if("android.service.notification.NotificationListenerService.RankingMap".equals(s)) {
            return (NotificationListenerService.RankingMap)parcel0.readParcelable(Bundler.class.getClassLoader());
        }
        if("int".equals(s)) {
            return parcel0.readInt();
        }
        if("boolean".equals(s)) {
            if(parcel0.readInt() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if("com.google.android.gms.auth.proximity.phonehub.ParcelableRanking".equals(s)) {
            return (ParcelableRanking)parcel0.readParcelable(Bundler.class.getClassLoader());
        }
        throw new IllegalArgumentException(a.a(s, "Type ", " cannot be read from Parcel"));
    }

    @Override  // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void c(Bundle bundle0, String s, Object object0, BundlerType bundlerType0) {
        String s1 = bundlerType0.a;
        if("java.lang.Void".equals(s1)) {
            return;
        }
        if("java.lang.String".equals(s1)) {
            bundle0.putString(s, ((String)object0));
            return;
        }
        if("android.service.notification.StatusBarNotification".equals(s1)) {
            bundle0.putParcelable(s, ((StatusBarNotification)object0));
            return;
        }
        if("java.lang.Object[]".equals(s1)) {
            bundle0.putParcelable(s, new ParcelableArray(this, bundlerType0, ((Object[])object0)));
            return;
        }
        if("java.util.List".equals(s1)) {
            bundle0.putParcelable(s, new ParcelableList(this, bundlerType0, ((List)object0)));
            return;
        }
        if("android.service.notification.NotificationListenerService.RankingMap".equals(s1)) {
            bundle0.putParcelable(s, ((NotificationListenerService.RankingMap)object0));
            return;
        }
        if(!"com.google.android.gms.auth.proximity.phonehub.ParcelableRanking".equals(s1)) {
            throw new IllegalArgumentException(a.a(s1, "Type ", " cannot be written to Bundle"));
        }
        bundle0.putParcelable(s, ((ParcelableRanking)object0));
    }

    @Override  // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void d(Parcel parcel0, Object object0, BundlerType bundlerType0, int v) {
        String s = bundlerType0.a;
        if("java.lang.Void".equals(s)) {
            return;
        }
        if("java.lang.String".equals(s)) {
            parcel0.writeString(((String)object0));
            return;
        }
        if("android.service.notification.StatusBarNotification".equals(s)) {
            parcel0.writeParcelable(((StatusBarNotification)object0), v);
            return;
        }
        if("java.lang.Object[]".equals(s)) {
            parcel0.writeParcelable(new ParcelableArray(this, bundlerType0, ((Object[])object0)), v);
            return;
        }
        if("java.util.List".equals(s)) {
            parcel0.writeParcelable(new ParcelableList(this, bundlerType0, ((List)object0)), v);
            return;
        }
        if("android.service.notification.NotificationListenerService.RankingMap".equals(s)) {
            parcel0.writeParcelable(((NotificationListenerService.RankingMap)object0), v);
            return;
        }
        if(!"com.google.android.gms.auth.proximity.phonehub.ParcelableRanking".equals(s)) {
            throw new IllegalArgumentException(a.a(s, "Type ", " cannot be written to Parcel"));
        }
        parcel0.writeParcelable(((ParcelableRanking)object0), v);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object[] e(BundlerType bundlerType0, int v) {
        String s = bundlerType0.a;
        if("java.lang.Void".equals(s)) {
            return new Void[v];
        }
        if("java.lang.String".equals(s)) {
            return new String[v];
        }
        if("android.service.notification.StatusBarNotification".equals(s)) {
            return new StatusBarNotification[v];
        }
        if("android.service.notification.NotificationListenerService.RankingMap".equals(s)) {
            return new NotificationListenerService.RankingMap[v];
        }
        if("com.google.android.gms.auth.proximity.phonehub.ParcelableRanking".equals(s)) {
            return new ParcelableRanking[v];
        }
        throw new IllegalArgumentException("Cannot create array of type " + s);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
    }
}

