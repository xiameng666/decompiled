package com.google.android.gms.auth.proximity;

import ByteString;
import a;
import akxp;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;

public final class NearbyCrossProfile_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR;

    static {
        NearbyCrossProfile_Bundler.CREATOR = new akxp();
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
        if("com.google.protobuf.ByteString".equals(s1)) {
            return (ByteString)bundle0.getSerializable(s);
        }
        if("boolean".equals(s1)) {
            return Boolean.valueOf(bundle0.getBoolean(s));
        }
        if("android.os.ParcelFileDescriptor".equals(s1)) {
            return (ParcelFileDescriptor)bundle0.getParcelable(s);
        }
        if("long".equals(s1)) {
            return bundle0.getLong(s);
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
        if("com.google.protobuf.ByteString".equals(s)) {
            return (ByteString)parcel0.readSerializable();
        }
        if("boolean".equals(s)) {
            if(parcel0.readInt() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if("android.os.ParcelFileDescriptor".equals(s)) {
            return (ParcelFileDescriptor)parcel0.readParcelable(Bundler.class.getClassLoader());
        }
        if("long".equals(s)) {
            return parcel0.readLong();
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
        if("com.google.protobuf.ByteString".equals(s1)) {
            bundle0.putSerializable(s, ((ByteString)object0));
            return;
        }
        if(!"android.os.ParcelFileDescriptor".equals(s1)) {
            throw new IllegalArgumentException(a.a(s1, "Type ", " cannot be written to Bundle"));
        }
        bundle0.putParcelable(s, ((ParcelFileDescriptor)object0));
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
        if("com.google.protobuf.ByteString".equals(s)) {
            parcel0.writeSerializable(((ByteString)object0));
            return;
        }
        if(!"android.os.ParcelFileDescriptor".equals(s)) {
            throw new IllegalArgumentException(a.a(s, "Type ", " cannot be written to Parcel"));
        }
        parcel0.writeParcelable(((ParcelFileDescriptor)object0), v);
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
        if("com.google.protobuf.ByteString".equals(s)) {
            return new ByteString[v];
        }
        if("android.os.ParcelFileDescriptor".equals(s)) {
            return new ParcelFileDescriptor[v];
        }
        throw new IllegalArgumentException("Cannot create array of type " + s);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
    }
}

