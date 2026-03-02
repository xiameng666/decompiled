package com.google.android.gms.auth.managed.crossprofile;

import a;
import akim;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.UserHandle;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import java.util.List;

public final class CrossProfileAuthDataManager_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR;

    static {
        CrossProfileAuthDataManager_Bundler.CREATOR = new akim();
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
        if("java.util.List".equals(s1)) {
            return ((ParcelableList)bundle0.getParcelable(s)).a;
        }
        if("android.os.UserHandle".equals(s1)) {
            return (UserHandle)bundle0.getParcelable(s);
        }
        if("android.os.@org.jspecify.annotations.Nullable UserHandle".equals(s1)) {
            return (UserHandle)bundle0.getParcelable(s);
        }
        throw new IllegalArgumentException(a.a(s1, "Type ", " cannot be read from Bundle"));
    }

    @Override  // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel0, BundlerType bundlerType0) {
        String s = bundlerType0.a;
        if("java.lang.Void".equals(s)) {
            return null;
        }
        if("java.lang.String".equals(s)) {
            return parcel0.readString();
        }
        if("java.util.List".equals(s)) {
            return ((ParcelableList)parcel0.readParcelable(Bundler.class.getClassLoader())).a;
        }
        if("android.os.UserHandle".equals(s)) {
            return (UserHandle)parcel0.readParcelable(Bundler.class.getClassLoader());
        }
        if("android.os.@org.jspecify.annotations.Nullable UserHandle".equals(s)) {
            return (UserHandle)parcel0.readParcelable(Bundler.class.getClassLoader());
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
        if("java.util.List".equals(s1)) {
            bundle0.putParcelable(s, new ParcelableList(this, bundlerType0, ((List)object0)));
            return;
        }
        if("android.os.UserHandle".equals(s1)) {
            bundle0.putParcelable(s, ((UserHandle)object0));
            return;
        }
        if(!"android.os.@org.jspecify.annotations.Nullable UserHandle".equals(s1)) {
            throw new IllegalArgumentException(a.a(s1, "Type ", " cannot be written to Bundle"));
        }
        bundle0.putParcelable(s, ((UserHandle)object0));
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
        if("java.util.List".equals(s)) {
            parcel0.writeParcelable(new ParcelableList(this, bundlerType0, ((List)object0)), v);
            return;
        }
        if("android.os.UserHandle".equals(s)) {
            parcel0.writeParcelable(((UserHandle)object0), v);
            return;
        }
        if(!"android.os.@org.jspecify.annotations.Nullable UserHandle".equals(s)) {
            throw new IllegalArgumentException(a.a(s, "Type ", " cannot be written to Parcel"));
        }
        parcel0.writeParcelable(((UserHandle)object0), v);
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
        if("android.os.UserHandle".equals(s)) {
            return new UserHandle[v];
        }
        if("android.os.@org.jspecify.annotations.Nullable UserHandle".equals(s)) {
            return new UserHandle[v];
        }
        throw new IllegalArgumentException("Cannot create array of type " + s);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
    }
}

