package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;

public abstract class LoaderSectionInfo extends SectionInfo {
    public final String a;
    public String[] b;
    public boolean c;
    public String d;
    public boolean e;
    protected boolean f;
    public String g;
    public String h;
    public int i;
    public int j;
    public int k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;

    public LoaderSectionInfo(Parcel parcel0) {
        super(parcel0);
        this.j = 0x7FFFFFFF;
        this.k = 0x7FFFFFFF;
        this.a = parcel0.readString();
        this.b = parcel0.createStringArray();
        boolean z = true;
        this.c = parcel0.readInt() != 0;
        this.d = parcel0.readString();
        this.e = parcel0.readInt() != 0;
        if(parcel0.readInt() == 0) {
            z = false;
        }
        this.f = z;
        this.g = parcel0.readString();
        this.h = parcel0.readString();
        this.i = parcel0.readInt();
        this.j = parcel0.readInt();
        this.k = parcel0.readInt();
        this.l = parcel0.readArrayList(ContactPerson.class.getClassLoader());
        this.m = parcel0.createStringArrayList();
        this.n = parcel0.createStringArrayList();
        this.o = parcel0.createStringArrayList();
    }

    public LoaderSectionInfo(String s) {
        this.j = 0x7FFFFFFF;
        this.k = 0x7FFFFFFF;
        this.a = s;
    }

    public final void b(ArrayList arrayList0) {
        if(arrayList0 != null) {
            for(int v = 0; v < arrayList0.size(); ++v) {
                String s = (String)arrayList0.get(v);
                if(s != null) {
                    arrayList0.set(v, s.toLowerCase());
                }
            }
        }
        this.n = arrayList0;
    }

    public final void c(ArrayList arrayList0) {
        if(arrayList0 != null) {
            for(int v = 0; v < arrayList0.size(); ++v) {
                String s = (String)arrayList0.get(v);
                if(s != null) {
                    arrayList0.set(v, PhoneNumberUtils.stripSeparators(s));
                }
            }
        }
        this.o = arrayList0;
    }

    @Override  // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeString(this.a);
        parcel0.writeStringArray(this.b);
        parcel0.writeInt(((int)this.c));
        parcel0.writeString(this.d);
        parcel0.writeInt(((int)this.e));
        parcel0.writeInt(((int)this.f));
        parcel0.writeString(this.g);
        parcel0.writeString(this.h);
        parcel0.writeInt(this.i);
        parcel0.writeInt(this.j);
        parcel0.writeInt(this.k);
        parcel0.writeList(this.l);
        parcel0.writeStringList(this.m);
        parcel0.writeStringList(this.n);
        parcel0.writeStringList(this.o);
    }
}

