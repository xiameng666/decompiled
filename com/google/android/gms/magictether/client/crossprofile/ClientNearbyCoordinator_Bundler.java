package com.google.android.gms.magictether.client.crossprofile;

import a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.presence.PresenceDevice;
import coyq;

public final class ClientNearbyCoordinator_Bundler implements Bundler {
    public static final Parcelable.Creator CREATOR;

    static {
        ClientNearbyCoordinator_Bundler.CREATOR = new coyq();
    }

    @Override  // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object a(Bundle bundle0, String s, BundlerType bundlerType0) {
        bundle0.setClassLoader(Bundler.class.getClassLoader());
        String s1 = bundlerType0.a;
        if("java.lang.Void".equals(s1)) {
            return null;
        }
        if("com.google.android.gms.nearby.presence.PresenceDevice".equals(s1)) {
            return (PresenceDevice)bundle0.getParcelable(s);
        }
        if("com.google.android.gms.magictether.client.crossprofile.FeatureState".equals(s1)) {
            return (FeatureState)bundle0.getParcelable(s);
        }
        if("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(s1)) {
            return (Boolean)bundle0.getSerializable(s);
        }
        if("java.lang.Boolean".equals(s1)) {
            return Boolean.valueOf(bundle0.getBoolean(s));
        }
        if("java.lang.String".equals(s1)) {
            return bundle0.getString(s);
        }
        if("com.google.android.gms.nearby.connection.ConnectionOptions".equals(s1)) {
            return (ConnectionOptions)bundle0.getParcelable(s);
        }
        if("byte[]".equals(s1)) {
            return bundle0.getByteArray(s);
        }
        if("com.google.android.gms.common.api.Status".equals(s1)) {
            return (Status)bundle0.getParcelable(s);
        }
        if("java.lang.Long".equals(s1)) {
            return bundle0.getLong(s);
        }
        if("long".equals(s1)) {
            return bundle0.getLong(s);
        }
        if("boolean".equals(s1)) {
            return Boolean.valueOf(bundle0.getBoolean(s));
        }
        if("com.google.android.gms.nearby.connection.PayloadTransferUpdate".equals(s1)) {
            return (PayloadTransferUpdate)bundle0.getParcelable(s);
        }
        throw new IllegalArgumentException(a.a(s1, "Type ", " cannot be read from Bundle"));
    }

    @Override  // com.google.android.enterprise.connectedapps.internal.Bundler
    public final Object b(Parcel parcel0, BundlerType bundlerType0) {
        boolean z = false;
        String s = bundlerType0.a;
        if("java.lang.Void".equals(s)) {
            return null;
        }
        if("com.google.android.gms.nearby.presence.PresenceDevice".equals(s)) {
            return (PresenceDevice)parcel0.readParcelable(Bundler.class.getClassLoader());
        }
        if("com.google.android.gms.magictether.client.crossprofile.FeatureState".equals(s)) {
            return (FeatureState)parcel0.readParcelable(Bundler.class.getClassLoader());
        }
        if("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(s)) {
            return (Boolean)parcel0.readSerializable();
        }
        if("java.lang.Boolean".equals(s)) {
            if(parcel0.readInt() == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if("java.lang.String".equals(s)) {
            return parcel0.readString();
        }
        if("com.google.android.gms.nearby.connection.ConnectionOptions".equals(s)) {
            return (ConnectionOptions)parcel0.readParcelable(Bundler.class.getClassLoader());
        }
        if("byte[]".equals(s)) {
            return parcel0.createByteArray();
        }
        if("com.google.android.gms.common.api.Status".equals(s)) {
            return (Status)parcel0.readParcelable(Bundler.class.getClassLoader());
        }
        if("java.lang.Long".equals(s)) {
            return parcel0.readLong();
        }
        if("long".equals(s)) {
            return parcel0.readLong();
        }
        if("boolean".equals(s)) {
            if(parcel0.readInt() == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if("com.google.android.gms.nearby.connection.PayloadTransferUpdate".equals(s)) {
            return (PayloadTransferUpdate)parcel0.readParcelable(Bundler.class.getClassLoader());
        }
        throw new IllegalArgumentException(a.a(s, "Type ", " cannot be read from Parcel"));
    }

    @Override  // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void c(Bundle bundle0, String s, Object object0, BundlerType bundlerType0) {
        String s1 = bundlerType0.a;
        if("java.lang.Void".equals(s1)) {
            return;
        }
        if("com.google.android.gms.nearby.presence.PresenceDevice".equals(s1)) {
            bundle0.putParcelable(s, ((PresenceDevice)object0));
            return;
        }
        if("com.google.android.gms.magictether.client.crossprofile.FeatureState".equals(s1)) {
            bundle0.putParcelable(s, ((FeatureState)object0));
            return;
        }
        if("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(s1)) {
            bundle0.putSerializable(s, ((Boolean)object0));
            return;
        }
        if("java.lang.Boolean".equals(s1)) {
            bundle0.putBoolean(s, ((Boolean)object0).booleanValue());
            return;
        }
        if("java.lang.String".equals(s1)) {
            bundle0.putString(s, ((String)object0));
            return;
        }
        if("com.google.android.gms.nearby.connection.ConnectionOptions".equals(s1)) {
            bundle0.putParcelable(s, ((ConnectionOptions)object0));
            return;
        }
        if("byte[]".equals(s1)) {
            bundle0.putByteArray(s, ((byte[])object0));
            return;
        }
        if("com.google.android.gms.common.api.Status".equals(s1)) {
            bundle0.putParcelable(s, ((Status)object0));
            return;
        }
        if("java.lang.Long".equals(s1)) {
            bundle0.putLong(s, ((Long)object0).longValue());
            return;
        }
        if(!"com.google.android.gms.nearby.connection.PayloadTransferUpdate".equals(s1)) {
            throw new IllegalArgumentException(a.a(s1, "Type ", " cannot be written to Bundle"));
        }
        bundle0.putParcelable(s, ((PayloadTransferUpdate)object0));
    }

    @Override  // com.google.android.enterprise.connectedapps.internal.Bundler
    public final void d(Parcel parcel0, Object object0, BundlerType bundlerType0, int v) {
        String s = bundlerType0.a;
        if("java.lang.Void".equals(s)) {
            return;
        }
        if("com.google.android.gms.nearby.presence.PresenceDevice".equals(s)) {
            parcel0.writeParcelable(((PresenceDevice)object0), v);
            return;
        }
        if("com.google.android.gms.magictether.client.crossprofile.FeatureState".equals(s)) {
            parcel0.writeParcelable(((FeatureState)object0), v);
            return;
        }
        if("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(s)) {
            parcel0.writeSerializable(((Boolean)object0));
            return;
        }
        if("java.lang.Boolean".equals(s)) {
            parcel0.writeInt(((int)((Boolean)object0).booleanValue()));
            return;
        }
        if("java.lang.String".equals(s)) {
            parcel0.writeString(((String)object0));
            return;
        }
        if("com.google.android.gms.nearby.connection.ConnectionOptions".equals(s)) {
            parcel0.writeParcelable(((ConnectionOptions)object0), v);
            return;
        }
        if("byte[]".equals(s)) {
            parcel0.writeByteArray(((byte[])object0));
            return;
        }
        if("com.google.android.gms.common.api.Status".equals(s)) {
            parcel0.writeParcelable(((Status)object0), v);
            return;
        }
        if("java.lang.Long".equals(s)) {
            parcel0.writeLong(((Long)object0).longValue());
            return;
        }
        if(!"com.google.android.gms.nearby.connection.PayloadTransferUpdate".equals(s)) {
            throw new IllegalArgumentException(a.a(s, "Type ", " cannot be written to Parcel"));
        }
        parcel0.writeParcelable(((PayloadTransferUpdate)object0), v);
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
        if("com.google.android.gms.nearby.presence.PresenceDevice".equals(s)) {
            return new PresenceDevice[v];
        }
        if("com.google.android.gms.magictether.client.crossprofile.FeatureState".equals(s)) {
            return new FeatureState[v];
        }
        if("java.lang.@org.jspecify.annotations.Nullable Boolean".equals(s)) {
            return new Boolean[v];
        }
        if("java.lang.Boolean".equals(s)) {
            return new Boolean[v];
        }
        if("java.lang.String".equals(s)) {
            return new String[v];
        }
        if("com.google.android.gms.nearby.connection.ConnectionOptions".equals(s)) {
            return new ConnectionOptions[v];
        }
        if("com.google.android.gms.common.api.Status".equals(s)) {
            return new Status[v];
        }
        if("java.lang.Long".equals(s)) {
            return new Long[v];
        }
        if("com.google.android.gms.nearby.connection.PayloadTransferUpdate".equals(s)) {
            return new PayloadTransferUpdate[v];
        }
        throw new IllegalArgumentException("Cannot create array of type " + s);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
    }
}

