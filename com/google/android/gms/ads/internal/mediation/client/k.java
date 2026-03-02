package com.google.android.gms.ads.internal.mediation.client;

import abbq;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import bjgu;
import bjgw;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.formats.i;
import com.google.android.gms.ads.internal.formats.client.c;
import com.google.android.gms.ads.internal.formats.client.e;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import wby;
import wbz;

public final class k extends wby implements IInterface {
    private final n a;

    public k() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public k(n n0) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.a = n0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bjgw bjgw2;
        bjgw bjgw1;
        bjgw bjgw0;
        c c0 = null;
        switch(v) {
            case 2: {
                String s = this.a.a;
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 3: {
                List list0 = this.a.b;
                ArrayList arrayList0 = new ArrayList();
                if(list0 != null) {
                    for(Object object0: list0) {
                        arrayList0.add(new c(((com.google.android.gms.ads.formats.c)object0).d(), ((com.google.android.gms.ads.formats.c)object0).e(), ((com.google.android.gms.ads.formats.c)object0).a(), ((com.google.android.gms.ads.formats.c)object0).c(), ((com.google.android.gms.ads.formats.c)object0).b()));
                    }
                }
                parcel1.writeNoException();
                parcel1.writeList(arrayList0);
                return true;
            }
            case 4: {
                String s1 = this.a.c;
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 5: {
                com.google.android.gms.ads.formats.c c1 = this.a.d;
                if(c1 != null) {
                    c0 = new c(((e)c1).a, ((e)c1).b, ((e)c1).c, ((e)c1).d, ((e)c1).e);
                }
                parcel1.writeNoException();
                wbz.h(parcel1, c0);
                return true;
            }
            case 6: {
                String s2 = this.a.e;
                parcel1.writeNoException();
                parcel1.writeString(s2);
                return true;
            }
            case 7: {
                String s3 = this.a.f;
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 8: {
                Double double0 = this.a.g;
                parcel1.writeNoException();
                parcel1.writeDouble((double0 == null ? -1.0 : ((double)double0)));
                return true;
            }
            case 9: {
                String s4 = this.a.h;
                parcel1.writeNoException();
                parcel1.writeString(s4);
                return true;
            }
            case 10: {
                String s5 = this.a.i;
                parcel1.writeNoException();
                parcel1.writeString(s5);
                return true;
            }
            case 11: {
                abbq abbq0 = this.a.j;
                if(abbq0 != null) {
                    c0 = abbq0.a();
                }
                parcel1.writeNoException();
                wbz.h(parcel1, c0);
                return true;
            }
            case 12: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 13: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 14: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 15: {
                Object object1 = this.a.k;
                if(object1 != null) {
                    c0 = new ObjectWrapper(object1);
                }
                parcel1.writeNoException();
                wbz.h(parcel1, c0);
                return true;
            }
            case 16: {
                parcel1.writeNoException();
                wbz.g(parcel1, this.a.l);
                return true;
            }
            case 17: {
                boolean z = this.a.m;
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 18: {
                boolean z1 = this.a.n;
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 19: {
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    c0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
                }
                k.gr(parcel0);
                View view0 = (View)ObjectWrapper.a(((bjgw)c0));
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    bjgw0 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface1 instanceof bjgw) ? ((bjgw)iInterface1) : new bjgu(iBinder1);
                }
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    bjgw1 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw1 = (iInterface2 instanceof bjgw) ? ((bjgw)iInterface2) : new bjgu(iBinder2);
                }
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 == null) {
                    bjgw2 = null;
                }
                else {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw2 = (iInterface3 instanceof bjgw) ? ((bjgw)iInterface3) : new bjgu(iBinder3);
                }
                k.gr(parcel0);
                HashMap hashMap0 = (HashMap)ObjectWrapper.a(bjgw1);
                HashMap hashMap1 = (HashMap)ObjectWrapper.a(bjgw2);
                View view1 = (View)ObjectWrapper.a(bjgw0);
                if(!(view1 instanceof i)) {
                    if(((f)f.a.get(view1)) != null) {
                        throw null;
                    }
                    parcel1.writeNoException();
                    return true;
                }
                i i0 = (i)view1;
                throw null;
            }
            case 22: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    c0 = (iInterface4 instanceof bjgw) ? ((bjgw)iInterface4) : new bjgu(iBinder4);
                }
                k.gr(parcel0);
                View view2 = (View)ObjectWrapper.a(((bjgw)c0));
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 24: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 25: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 26: {
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

