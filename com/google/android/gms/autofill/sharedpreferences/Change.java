package com.google.android.gms.autofill.sharedpreferences;

import android.content.SharedPreferences.Editor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import apgo;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class Change implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final Change.Put[] b;

    static {
        Change.CREATOR = new apgo();
    }

    public Change(boolean z, Change.Put[] arr_change$Put) {
        this.a = z;
        this.b = arr_change$Put;
    }

    public static Change a(Map map0) {
        Change.Put[] arr_change$Put = new Change.Put[map0.size()];
        int v = 0;
        for(Object object0: map0.entrySet()) {
            arr_change$Put[v] = new Change.Put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
            ++v;
        }
        return new Change(true, arr_change$Put);
    }

    public final void b(SharedPreferences.Editor sharedPreferences$Editor0) {
        if(this.a) {
            sharedPreferences$Editor0.clear();
        }
        Change.Put[] arr_change$Put = this.b;
        for(int v = 0; v < arr_change$Put.length; ++v) {
            Change.Put change$Put0 = arr_change$Put[v];
            Object object0 = change$Put0.b;
            if(object0 == null) {
                sharedPreferences$Editor0.remove(change$Put0.a);
            }
            else if((object0 instanceof Boolean)) {
                sharedPreferences$Editor0.putBoolean(change$Put0.a, ((Boolean)object0).booleanValue());
            }
            else if((object0 instanceof Float)) {
                sharedPreferences$Editor0.putFloat(change$Put0.a, ((Float)object0).floatValue());
            }
            else if((object0 instanceof Integer)) {
                sharedPreferences$Editor0.putInt(change$Put0.a, ((Integer)object0).intValue());
            }
            else if((object0 instanceof Long)) {
                sharedPreferences$Editor0.putLong(change$Put0.a, ((Long)object0).longValue());
            }
            else if((object0 instanceof String)) {
                sharedPreferences$Editor0.putString(change$Put0.a, ((String)object0));
            }
            else if((object0 instanceof Set)) {
                sharedPreferences$Editor0.putStringSet(change$Put0.a, ((Set)object0));
            }
        }
        sharedPreferences$Editor0.apply();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.b);
        return String.format("Change[clear=%s, puts=%s]", Boolean.valueOf(this.a), s);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeByte(((byte)this.a));
        parcel0.writeTypedArray(this.b, v);
    }
}

