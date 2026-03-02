package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bkpo;
import com.google.android.gms.common.internal.ReflectedParcelable;
import gftb;
import gogd;
import goge;
import gogg;
import gogh;
import gogj;
import gogk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public final class PageData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public HashMap a;
    public HashMap b;
    public ArrayList c;
    public int d;

    static {
        PageData.CREATOR = new bkpo();
    }

    public PageData(Parcel parcel0) {
        int v = 1;
        this.d = 1;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        int v1 = gogj.a(parcel0.readInt());
        if(v1 != 0) {
            v = v1;
        }
        this.d = v;
        int v2 = parcel0.readInt();
        for(int v4 = 0; v4 < v2; ++v4) {
            this.a.put(Integer.valueOf(parcel0.readInt()), parcel0.readString());
        }
        int v5 = parcel0.readInt();
        for(int v6 = 0; v6 < v5; ++v6) {
            HashMap hashMap0 = this.b;
            String s = parcel0.readString();
            gftb.check(s);
            hashMap0.put(s, ((HelpData)HelpData.CREATOR.createFromParcel(parcel0)));
        }
        int v7 = parcel0.readInt();
        for(int v3 = 0; v3 < v7; ++v3) {
            this.c.add(((BulletPoint)BulletPoint.CREATOR.createFromParcel(parcel0)));
        }
    }

    public PageData(gogk gogk0) {
        this.d = 1;
        this.d = gogj.a(gogk0.b) == 0 ? 1 : gogj.a(gogk0.b);
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        if(gogk0.c.size() != 0) {
            for(Object object0: gogk0.c) {
                HashMap hashMap0 = this.a;
                int v = gogg.a(((goge)object0).b);
                if(v == 0) {
                    v = 1;
                }
                hashMap0.put(Integer.valueOf(v - 1), ((goge)object0).c);
            }
        }
        if(gogk0.d.size() != 0) {
            for(Object object1: gogk0.d) {
                this.b.put(((gogh)object1).b, new HelpData(((gogh)object1)));
            }
        }
        if(gogk0.e.size() != 0) {
            for(Object object2: gogk0.e) {
                this.c.add(new BulletPoint(((gogd)object2)));
            }
        }
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PageData) && ((PageData)object0).d == this.d && ((PageData)object0).a.equals(this.a) && ((PageData)object0).b.equals(this.b) && ((PageData)object0).c.equals(this.c);
    }

    @Override
    public final int hashCode() {
        int v = this.d - 1;
        if(this.d != 0) {
            return Arrays.hashCode(new Object[]{v, this.a, this.b, this.c});
        }
        throw null;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = this.d - 1;
        if(this.d == 0) {
            throw null;
        }
        parcel0.writeInt(v1);
        parcel0.writeInt(this.a.size());
        for(Object object0: this.a.entrySet()) {
            parcel0.writeInt(((Integer)((Map.Entry)object0).getKey()).intValue());
            parcel0.writeString(((String)((Map.Entry)object0).getValue()));
        }
        parcel0.writeInt(this.b.size());
        for(Object object1: this.b.entrySet()) {
            parcel0.writeString(((String)((Map.Entry)object1).getKey()));
            ((HelpData)((Map.Entry)object1).getValue()).writeToParcel(parcel0, v);
        }
        parcel0.writeInt(this.c.size());
        ArrayList arrayList0 = this.c;
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((BulletPoint)arrayList0.get(v3)).writeToParcel(parcel0, v);
        }
    }
}

