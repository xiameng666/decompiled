package com.android.onboarding.utils.persistable;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import ibuq;
import java.util.Set;
import sco;
import scv;
import scz;
import sde;
import sdl;
import sdm;

public final class PersistableIntent implements Parcelable, scz {
    public static final sdm CREATOR;
    public PersistableBundle a;
    private String b;
    private String c;
    private String d;
    private ComponentName e;
    private Set f;
    private int g;
    private Uri h;

    static {
        PersistableIntent.CREATOR = new sdm();
    }

    public PersistableIntent() {
        this(null, null, null, null, null, 0xFF);
    }

    public PersistableIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        String s = intent0.getAction();
        String s1 = intent0.getType();
        String s2 = intent0.getPackage();
        ComponentName componentName0 = intent0.getComponent();
        int v = intent0.getFlags();
        Uri uri0 = intent0.getData();
        Set set0 = intent0.getCategories();
        Bundle bundle0 = intent0.getExtras();
        this(s, s1, (bundle0 == null ? new PersistableBundle() : scv.a(bundle0, new sdl())), s2, componentName0, set0, v, uri0);
    }

    public PersistableIntent(String s, PersistableBundle persistableBundle0, String s1, ComponentName componentName0, Set set0, int v) {
        if((v & 4) != 0) {
            persistableBundle0 = new PersistableBundle();
        }
        if(1 == (v & 1)) {
            s = null;
        }
        this(s, null, persistableBundle0, ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? componentName0 : null), ((v & 0x20) == 0 ? set0 : null), 0, null);
    }

    public PersistableIntent(String s, String s1, PersistableBundle persistableBundle0, String s2, ComponentName componentName0, Set set0, int v, Uri uri0) {
        ibuq.f(persistableBundle0, "extras");
        super();
        this.b = s;
        this.c = s1;
        this.a = persistableBundle0;
        this.d = s2;
        this.e = componentName0;
        this.f = set0;
        this.g = v;
        this.h = uri0;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("ACTION", this.b);
        persistableBundle0.putString("TYPE", this.c);
        persistableBundle0.putString("PACKAGE", this.d);
        String[] arr_s = null;
        persistableBundle0.putString("COMPONENT_NAME", (this.e == null ? null : this.e.flattenToString()));
        persistableBundle0.putInt("FLAGS", this.g);
        persistableBundle0.putString("DATA", (this.h == null ? null : this.h.toString()));
        Set set0 = this.f;
        if(set0 != null) {
            arr_s = (String[])set0.toArray(new String[0]);
        }
        persistableBundle0.putStringArray("CATEGORIES", arr_s);
        persistableBundle0.putPersistableBundle("EXTRAS", this.a);
        return persistableBundle0;
    }

    public final Intent b() {
        Intent intent0 = new Intent();
        intent0.setAction(this.b);
        intent0.setDataAndType(this.h, this.c);
        intent0.setPackage(this.d);
        intent0.setComponent(this.e);
        intent0.setFlags(this.g);
        Set set0 = this.f;
        if(set0 != null) {
            for(Object object0: set0) {
                intent0.addCategory(((String)object0));
            }
        }
        intent0.putExtras(sde.e(this.a));
        return intent0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return this.b().describeContents();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PersistableIntent) && ibuq.m(this.b, ((PersistableIntent)object0).b) && ibuq.m(this.c, ((PersistableIntent)object0).c) && sco.c(this.a, ((PersistableIntent)object0).a) && ibuq.m(this.d, ((PersistableIntent)object0).d) && ibuq.m(this.e, ((PersistableIntent)object0).e) && this.g == ((PersistableIntent)object0).g && ibuq.m(this.h, ((PersistableIntent)object0).h) && ibuq.m(this.f, ((PersistableIntent)object0).f) && sco.c(this.a, ((PersistableIntent)object0).a);
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((((this.b == null ? 0 : this.b.hashCode()) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + sco.d(this.a)) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + this.g) * 0x1F;
        int v2 = this.h == null ? 0 : this.h.hashCode();
        Set set0 = this.f;
        if(set0 != null) {
            v = set0.hashCode();
        }
        return ((v1 + v2) * 0x1F + v) * 0x1F + sco.d(this.a);
    }

    @Override
    public final String toString() {
        return "PersistableIntent(action=" + this.b + ",type=" + this.c + ",package=" + this.d + ",component=" + this.e + ",categories=" + this.f + ",flags=" + this.g + ",data=" + this.h + ",extras=" + sco.a(this.a) + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        this.b().writeToParcel(parcel0, v);
    }
}

