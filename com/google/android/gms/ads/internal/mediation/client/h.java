package com.google.android.gms.ads.internal.mediation.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.ads.internal.formats.client.l;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.dynamic.ObjectWrapper;
import wby;
import wbz;

public final class h extends wby implements i {
    private final a a;
    private final com.google.android.gms.ads.internal.reward.mediation.client.a b;

    public h() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public h(a a0, com.google.android.gms.ads.internal.reward.mediation.client.a a1) {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        this.a = a0;
        this.b = a1;
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.i
    public final void a() {
        com.google.android.gms.ads.internal.reward.mediation.client.a a0 = this.b;
        if(a0 != null) {
            ObjectWrapper objectWrapper0 = new ObjectWrapper(this.a);
            Parcel parcel0 = a0.jo();
            wbz.h(parcel0, objectWrapper0);
            a0.jp(8, parcel0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.i
    public final void b() {
        com.google.android.gms.ads.internal.reward.mediation.client.a a0 = this.b;
        if(a0 != null) {
            ObjectWrapper objectWrapper0 = new ObjectWrapper(this.a);
            Parcel parcel0 = a0.jo();
            wbz.h(parcel0, objectWrapper0);
            a0.jp(6, parcel0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.i
    public final void c(AdErrorParcel adErrorParcel0) {
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.i
    public final void d() {
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.i
    public final void e() {
        com.google.android.gms.ads.internal.reward.mediation.client.a a0 = this.b;
        if(a0 != null) {
            ObjectWrapper objectWrapper0 = new ObjectWrapper(this.a);
            Parcel parcel0 = a0.jo();
            wbz.h(parcel0, objectWrapper0);
            a0.jp(3, parcel0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.i
    public final void f() {
        com.google.android.gms.ads.internal.reward.mediation.client.a a0 = this.b;
        if(a0 != null) {
            ObjectWrapper objectWrapper0 = new ObjectWrapper(this.a);
            Parcel parcel0 = a0.jo();
            wbz.h(parcel0, objectWrapper0);
            a0.jp(4, parcel0);
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        com.google.android.gms.ads.internal.rewarded.client.a a2;
        switch(v) {
            case 1: {
                this.a();
                break;
            }
            case 2: {
                this.b();
                break;
            }
            case 3: {
                int v1 = parcel0.readInt();
                h.gr(parcel0);
                com.google.android.gms.ads.internal.reward.mediation.client.a a0 = this.b;
                if(a0 != null) {
                    ObjectWrapper objectWrapper0 = new ObjectWrapper(this.a);
                    Parcel parcel2 = a0.jo();
                    wbz.h(parcel2, objectWrapper0);
                    parcel2.writeInt(v1);
                    a0.jp(9, parcel2);
                }
                break;
            }
            case 5: {
                this.f();
                break;
            }
            case 6: {
                this.e();
                break;
            }
            case 7: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if((iInterface0 instanceof j)) {
                        j j0 = (j)iInterface0;
                    }
                }
                h.gr(parcel0);
                break;
            }
            case 9: {
                parcel0.readString();
                parcel0.readString();
                h.gr(parcel0);
                break;
            }
            case 10: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if((iInterface1 instanceof l)) {
                        l l0 = (l)iInterface1;
                    }
                }
                parcel0.readString();
                h.gr(parcel0);
                break;
            }
            case 12: {
                parcel0.readString();
                h.gr(parcel0);
                break;
            }
            case 13: {
                com.google.android.gms.ads.internal.reward.mediation.client.a a1 = this.b;
                if(a1 != null) {
                    ObjectWrapper objectWrapper1 = new ObjectWrapper(this.a);
                    Parcel parcel3 = a1.jo();
                    wbz.h(parcel3, objectWrapper1);
                    a1.jp(5, parcel3);
                }
                break;
            }
            case 14: {
                RewardItemParcel rewardItemParcel0 = (RewardItemParcel)wbz.a(parcel0, RewardItemParcel.CREATOR);
                h.gr(parcel0);
                break;
            }
            case 16: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    a2 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    a2 = (iInterface2 instanceof com.google.android.gms.ads.internal.rewarded.client.a) ? ((com.google.android.gms.ads.internal.rewarded.client.a)iInterface2) : new com.google.android.gms.ads.internal.rewarded.client.a(iBinder2);
                }
                h.gr(parcel0);
                com.google.android.gms.ads.internal.reward.mediation.client.a a3 = this.b;
                if(a3 != null) {
                    ObjectWrapper objectWrapper2 = new ObjectWrapper(this.a);
                    Parcel parcel4 = a2.hM(1, a2.jo());
                    String s = parcel4.readString();
                    parcel4.recycle();
                    Parcel parcel5 = a2.hM(2, a2.jo());
                    int v2 = parcel5.readInt();
                    parcel5.recycle();
                    RewardItemParcel rewardItemParcel1 = new RewardItemParcel(s, v2);
                    Parcel parcel6 = a3.jo();
                    wbz.h(parcel6, objectWrapper2);
                    wbz.f(parcel6, rewardItemParcel1);
                    a3.jp(7, parcel6);
                }
                break;
            }
            case 17: {
                parcel0.readInt();
                h.gr(parcel0);
                break;
            }
            case 18: {
                com.google.android.gms.ads.internal.reward.mediation.client.a a4 = this.b;
                if(a4 != null) {
                    ObjectWrapper objectWrapper3 = new ObjectWrapper(this.a);
                    Parcel parcel7 = a4.jo();
                    wbz.h(parcel7, objectWrapper3);
                    a4.jp(11, parcel7);
                }
                break;
            }
            case 19: {
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                h.gr(parcel0);
                break;
            }
            case 4: 
            case 8: 
            case 11: 
            case 15: 
            case 20: {
                break;
            }
            case 21: {
                parcel0.readString();
                h.gr(parcel0);
                break;
            }
            case 22: {
                parcel0.readInt();
                parcel0.readString();
                h.gr(parcel0);
                break;
            }
            case 23: {
                AdErrorParcel adErrorParcel0 = (AdErrorParcel)wbz.a(parcel0, AdErrorParcel.CREATOR);
                h.gr(parcel0);
                break;
            }
            case 24: {
                AdErrorParcel adErrorParcel1 = (AdErrorParcel)wbz.a(parcel0, AdErrorParcel.CREATOR);
                h.gr(parcel0);
                break;
            }
            case 25: {
                com.google.android.gms.ads.internal.reward.mediation.client.a a5 = this.b;
                if(a5 != null) {
                    ObjectWrapper objectWrapper4 = new ObjectWrapper(this.a);
                    Parcel parcel8 = a5.jo();
                    wbz.h(parcel8, objectWrapper4);
                    a5.jp(13, parcel8);
                }
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.i
    public final void g(String s, String s1) {
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.i
    public final void h(l l0, String s) {
    }
}

