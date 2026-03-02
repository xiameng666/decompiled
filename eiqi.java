import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemProperties;
import com.google.android.gms.chimera.modules.phenotype.AppContextProvider;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.GenericDimension;
import com.google.android.gms.phenotype.RegistrationInfo;
import java.util.ArrayList;
import java.util.Arrays;

public final class eiqi extends wby implements cjug, eiqj {
    private final cjts a;
    private final String b;
    private final azql c;
    private final eiqs d;

    public eiqi() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public eiqi(cjts cjts0, String s, eiqs eiqs0) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeService");
        this.a = cjts0;
        this.b = s;
        this.d = eiqs0;
        this.c = azql.c(AppContextProvider.a());
    }

    @Override  // eiqj
    public final void a(eiqg eiqg0, RegistrationInfo[] arr_registrationInfo) {
        gocn[] arr_gocn;
        ccmq.a().a(bbdg.vc);
        this.t();
        if(arr_registrationInfo == null) {
            arr_gocn = null;
        }
        else {
            gocn[] arr_gocn1 = new gocn[arr_registrationInfo.length];
            for(int v = 0; v < arr_registrationInfo.length; ++v) {
                RegistrationInfo registrationInfo0 = arr_registrationInfo[v];
                if(registrationInfo0 != null) {
                    goci goci0 = (goci)((ProtoLiteMessage)gocn.a).v_newBuilder();
                    if(!goci0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)goci0).ensureMutable();
                    }
                    gocn gocn0 = (gocn)goci0.b_message;
                    registrationInfo0.i.getClass();
                    gocn0.e = 7;
                    gocn0.f = registrationInfo0.i;
                    if(!goci0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)goci0).ensureMutable();
                    }
                    ((gocn)goci0.b_message).m = 1;
                    ((gocn)goci0.b_message).b |= 16;
                    String s = registrationInfo0.c;
                    if(s != null) {
                        if(!goci0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)goci0).ensureMutable();
                        }
                        gocn gocn1 = (gocn)goci0.b_message;
                        gocn1.b |= 1;
                        gocn1.g = s;
                    }
                    int v1 = registrationInfo0.d;
                    if(!goci0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)goci0).ensureMutable();
                    }
                    ((gocn)goci0.b_message).c = 2;
                    ((gocn)goci0.b_message).d = v1;
                    String[] arr_s = registrationInfo0.e;
                    if(arr_s != null && arr_s.length > 0) {
                        goci0.a(Arrays.asList(arr_s));
                    }
                    byte[] arr_b = registrationInfo0.f;
                    if(arr_b != null && arr_b.length > 0) {
                        ByteString hfsf0 = ByteString.copyFrom(arr_b);
                        if(!goci0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)goci0).ensureMutable();
                        }
                        gocn gocn2 = (gocn)goci0.b_message;
                        gocn2.b |= 4;
                        gocn2.k = hfsf0;
                    }
                    boolean z = registrationInfo0.g;
                    if(!goci0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)goci0).ensureMutable();
                    }
                    gocn gocn3 = (gocn)goci0.b_message;
                    gocn3.b |= 8;
                    gocn3.l = z;
                    int[] arr_v = registrationInfo0.h;
                    if(arr_v != null && arr_v.length > 0) {
                        for(int v2 = 0; v2 < arr_v.length; ++v2) {
                            goci0.k(arr_v[v2]);
                        }
                    }
                    byte[] arr_b1 = registrationInfo0.j;
                    if(arr_b1 != null && arr_b1.length > 0) {
                        ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                        if(!goci0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)goci0).ensureMutable();
                        }
                        gocn gocn4 = (gocn)goci0.b_message;
                        gocn4.b |= 0x100;
                        gocn4.q = hfsf1;
                    }
                    if(hxmc.c()) {
                        int v3 = registrationInfo0.k;
                        if(v3 >= 0) {
                            int v4 = gocm.a(v3);
                            if(v4 != 0) {
                                if(!goci0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)goci0).ensureMutable();
                                }
                                ((gocn)goci0.b_message).m = v4 - 1;
                                ((gocn)goci0.b_message).b |= 16;
                            }
                        }
                    }
                    arr_gocn1[v] = (gocn)((ProtoLiteBuilder)goci0).N_build();
                }
            }
            arr_gocn = arr_gocn1;
        }
        eise eise0 = new eise(eiqg0, arr_gocn);
        this.a.b(eise0);
    }

    @Override  // eiqj
    public final void b(eiqg eiqg0, String s) {
        ccmq.a().a(bbdg.vf);
        this.s(eitf.e(s));
        eiqx eiqx0 = new eiqx(eiqg0, s, this.b);
        this.a.b(eiqx0);
    }

    @Override  // eiqj
    public final void c(eiqg eiqg0, byte[] arr_b) {
        fpjk fpjk0;
        ccmq.a().a(bbdg.vf);
        try {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fpjk.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            fpjk0 = (fpjk)hftv0;
        }
        catch(hfur hfur0) {
            throw new eipa(29500, "Failed to parse commit properties", hfur0);
        }
        this.s(eitf.e(fpjk0.c));
        eiqx eiqx0 = new eiqx(eiqg0, fpjk0, this.b);
        this.a.b(eiqx0);
    }

    @Override  // eiqj
    public final void d(eiqg eiqg0, String s, String s1, String s2) {
        this.r();
        eira eira0 = new eira(eiqg0, this.b, s, s1, s2);
        this.a.b(eira0);
    }

    @Override  // eiqj
    public final void e(eiqg eiqg0, String s) {
        this.s(s);
        eirh eirh0 = new eirh(eiqg0, s, this.b);
        this.a.b(eirh0);
    }

    @Override  // eiqj
    public final void f(eiqg eiqg0, String s, String s1, String s2) {
        this.s(s);
        eirl eirl0 = new eirl(eiqg0, s, s1, s2, this.b);
        this.a.b(eirl0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        eiqg eiqg0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface0 instanceof eiqg) ? ((eiqg)iInterface0) : new eiqe(iBinder0);
                }
                String s = parcel0.readString();
                int v1 = parcel0.readInt();
                String[] arr_s = parcel0.createStringArray();
                byte[] arr_b = parcel0.createByteArray();
                eiqi.gr(parcel0);
                this.l(eiqg0, s, v1, arr_s, arr_b);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface1 instanceof eiqg) ? ((eiqg)iInterface1) : new eiqe(iBinder1);
                }
                String s1 = parcel0.readString();
                int v2 = parcel0.readInt();
                String[] arr_s1 = parcel0.createStringArray();
                int[] arr_v = parcel0.createIntArray();
                byte[] arr_b1 = parcel0.createByteArray();
                eiqi.gr(parcel0);
                this.v(eiqg0, s1, v2, arr_s1, arr_v, arr_b1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface2 instanceof eiqg) ? ((eiqg)iInterface2) : new eiqe(iBinder2);
                }
                String s2 = parcel0.readString();
                eiqi.gr(parcel0);
                this.s(s2);
                eitj eitj0 = new eitj(eiqg0, s2, this.b);
                this.a.b(eitj0);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface3 instanceof eiqg) ? ((eiqg)iInterface3) : new eiqe(iBinder3);
                }
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                eiqi.gr(parcel0);
                this.s(s3);
                eirl eirl0 = new eirl(eiqg0, s3, s4, null, this.b);
                this.a.b(eirl0);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface4 instanceof eiqg) ? ((eiqg)iInterface4) : new eiqe(iBinder4);
                }
                String s5 = parcel0.readString();
                eiqi.gr(parcel0);
                this.b(eiqg0, s5);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface5 instanceof eiqg) ? ((eiqg)iInterface5) : new eiqe(iBinder5);
                }
                String s6 = parcel0.readString();
                String s7 = parcel0.readString();
                eiqi.gr(parcel0);
                this.h(eiqg0, s6, s7);
                break;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface6 instanceof eiqg) ? ((eiqg)iInterface6) : new eiqe(iBinder6);
                }
                eiqi.gr(parcel0);
                this.r();
                eirp eirp0 = new eirp(eiqg0);
                this.a.b(eirp0);
                break;
            }
            case 8: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface7 instanceof eiqg) ? ((eiqg)iInterface7) : new eiqe(iBinder7);
                }
                byte[] arr_b2 = parcel0.createByteArray();
                eiqi.gr(parcel0);
                this.r();
                eisv eisv0 = new eisv(eiqg0, arr_b2);
                this.a.b(eisv0);
                break;
            }
            case 9: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface8 instanceof eiqg) ? ((eiqg)iInterface8) : new eiqe(iBinder8);
                }
                String s8 = parcel0.readString();
                String s9 = parcel0.readString();
                int v3 = parcel0.readInt();
                eiqi.gr(parcel0);
                this.s(s8);
                eirt eirt0 = new eirt(eiqg0, s8, s9, v3, this.b);
                this.a.b(eirt0);
                break;
            }
            case 10: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface9 instanceof eiqg) ? ((eiqg)iInterface9) : new eiqe(iBinder9);
                }
                String s10 = parcel0.readString();
                eiqi.gr(parcel0);
                this.e(eiqg0, s10);
                break;
            }
            case 11: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface10 instanceof eiqg) ? ((eiqg)iInterface10) : new eiqe(iBinder10);
                }
                String s11 = parcel0.readString();
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                eiqi.gr(parcel0);
                this.f(eiqg0, s11, s12, s13);
                break;
            }
            case 12: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface11 instanceof eiqg) ? ((eiqg)iInterface11) : new eiqe(iBinder11);
                }
                String s14 = parcel0.readString();
                long v4 = parcel0.readLong();
                eiqi.gr(parcel0);
                this.t();
                eith eith0 = new eith(eiqg0, s14, null, v4, gnzv.e);
                this.a.b(eith0);
                break;
            }
            case 13: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface12 instanceof eiqg) ? ((eiqg)iInterface12) : new eiqe(iBinder12);
                }
                String s15 = parcel0.readString();
                int v5 = parcel0.readInt();
                String[] arr_s2 = parcel0.createStringArray();
                byte[] arr_b3 = parcel0.createByteArray();
                String s16 = parcel0.readString();
                String s17 = parcel0.readString();
                eiqi.gr(parcel0);
                this.n(eiqg0, s15, v5, arr_s2, arr_b3, s16, s17);
                break;
            }
            case 14: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface13 instanceof eiqg) ? ((eiqg)iInterface13) : new eiqe(iBinder13);
                }
                String s18 = parcel0.readString();
                String s19 = parcel0.readString();
                String s20 = parcel0.readString();
                int v6 = parcel0.readInt();
                int v7 = parcel0.readInt();
                String s21 = parcel0.readString();
                eiqi.gr(parcel0);
                this.u();
                Flag[] arr_flag = {new Flag(s20, s21, v7, v6)};
                eisz eisz0 = new eisz(eiqg0, this.b, s18, s19, arr_flag);
                this.a.b(eisz0);
                break;
            }
            case 15: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface14 instanceof eiqg) ? ((eiqg)iInterface14) : new eiqe(iBinder14);
                }
                String s22 = parcel0.readString();
                String s23 = parcel0.readString();
                String s24 = parcel0.readString();
                eiqi.gr(parcel0);
                this.d(eiqg0, s22, s23, s24);
                break;
            }
            case 16: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface15 instanceof eiqg) ? ((eiqg)iInterface15) : new eiqe(iBinder15);
                }
                String s25 = parcel0.readString();
                String s26 = parcel0.readString();
                String s27 = parcel0.readString();
                eiqi.gr(parcel0);
                this.k(eiqg0, s25, s26, s27);
                break;
            }
            case 17: {
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if((iInterface16 instanceof eiqg)) {
                        eiqg eiqg1 = (eiqg)iInterface16;
                    }
                }
                parcel0.readString();
                parcel0.readString();
                parcel0.readString();
                parcel0.readString();
                eiqi.gr(parcel0);
                break;
            }
            case 18: {
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 != null) {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface17 instanceof eiqg) ? ((eiqg)iInterface17) : new eiqe(iBinder17);
                }
                String s28 = parcel0.readString();
                String s29 = parcel0.readString();
                Flag[] arr_flag1 = (Flag[])parcel0.createTypedArray(Flag.CREATOR);
                eiqi.gr(parcel0);
                this.p(eiqg0, s28, s29, arr_flag1);
                break;
            }
            case 19: {
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface18 instanceof eiqg) ? ((eiqg)iInterface18) : new eiqe(iBinder18);
                }
                RegistrationInfo[] arr_registrationInfo = (RegistrationInfo[])parcel0.createTypedArray(RegistrationInfo.CREATOR);
                eiqi.gr(parcel0);
                this.a(eiqg0, arr_registrationInfo);
                break;
            }
            case 20: {
                IBinder iBinder19 = parcel0.readStrongBinder();
                if(iBinder19 != null) {
                    IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface19 instanceof eiqg) ? ((eiqg)iInterface19) : new eiqe(iBinder19);
                }
                String s30 = parcel0.readString();
                byte[] arr_b4 = parcel0.createByteArray();
                eiqi.gr(parcel0);
                this.o(eiqg0, s30, arr_b4);
                break;
            }
            case 21: {
                IBinder iBinder20 = parcel0.readStrongBinder();
                if(iBinder20 != null) {
                    IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    if((iInterface20 instanceof eiqg)) {
                        eiqg eiqg2 = (eiqg)iInterface20;
                    }
                }
                parcel0.readString();
                parcel0.readString();
                GenericDimension[] arr_genericDimension = (GenericDimension[])parcel0.createTypedArray(GenericDimension.CREATOR);
                eiqi.gr(parcel0);
                break;
            }
            case 22: {
                IBinder iBinder21 = parcel0.readStrongBinder();
                if(iBinder21 != null) {
                    IInterface iInterface21 = iBinder21.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface21 instanceof eiqg) ? ((eiqg)iInterface21) : new eiqe(iBinder21);
                }
                eiqi.gr(parcel0);
                this.i(eiqg0);
                break;
            }
            case 23: {
                IBinder iBinder22 = parcel0.readStrongBinder();
                if(iBinder22 != null) {
                    IInterface iInterface22 = iBinder22.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface22 instanceof eiqg) ? ((eiqg)iInterface22) : new eiqe(iBinder22);
                }
                String s31 = parcel0.readString();
                String s32 = parcel0.readString();
                String s33 = parcel0.readString();
                String s34 = parcel0.readString();
                eiqi.gr(parcel0);
                this.g(eiqg0, s31, s32, s33, s34);
                break;
            }
            case 24: {
                IBinder iBinder23 = parcel0.readStrongBinder();
                if(iBinder23 != null) {
                    IInterface iInterface23 = iBinder23.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface23 instanceof eiqg) ? ((eiqg)iInterface23) : new eiqe(iBinder23);
                }
                long v8 = parcel0.readLong();
                eiqi.gr(parcel0);
                this.t();
                eith eith1 = new eith(eiqg0, null, this.b, v8, gnzv.e);
                this.a.b(eith1);
                break;
            }
            case 25: {
                IBinder iBinder24 = parcel0.readStrongBinder();
                if(iBinder24 != null) {
                    IInterface iInterface24 = iBinder24.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    eiqg0 = (iInterface24 instanceof azxs) ? ((azxs)iInterface24) : new azxq(iBinder24);
                }
                String s35 = parcel0.readString();
                byte[] arr_b5 = parcel0.createByteArray();
                eiqi.gr(parcel0);
                this.q(((azxs)eiqg0), s35, arr_b5);
                break;
            }
            case 26: {
                IBinder iBinder25 = parcel0.readStrongBinder();
                if(iBinder25 != null) {
                    IInterface iInterface25 = iBinder25.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    eiqg0 = (iInterface25 instanceof azxs) ? ((azxs)iInterface25) : new azxq(iBinder25);
                }
                String s36 = parcel0.readString();
                ArrayList arrayList0 = wbz.b(parcel0);
                eiqi.gr(parcel0);
                this.s(s36);
                eisw eisw0 = new eisw(((azxs)eiqg0), this.b, s36, arrayList0);
                this.a.b(eisw0);
                break;
            }
            case 27: {
                IBinder iBinder26 = parcel0.readStrongBinder();
                if(iBinder26 != null) {
                    IInterface iInterface26 = iBinder26.queryLocalInterface("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
                    eiqg0 = (iInterface26 instanceof eiqd) ? ((eiqd)iInterface26) : new eiqb(iBinder26);
                }
                eiqi.gr(parcel0);
                this.j(((eiqd)eiqg0));
                break;
            }
            case 28: {
                String s37 = parcel0.readString();
                IBinder iBinder27 = parcel0.readStrongBinder();
                if(iBinder27 != null) {
                    IInterface iInterface27 = iBinder27.queryLocalInterface("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
                    eiqg0 = (iInterface27 instanceof eiqa) ? ((eiqa)iInterface27) : new eipy(iBinder27);
                }
                eiqi.gr(parcel0);
                this.m(s37, ((eiqa)eiqg0));
                break;
            }
            case 29: {
                IBinder iBinder28 = parcel0.readStrongBinder();
                if(iBinder28 != null) {
                    IInterface iInterface28 = iBinder28.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    eiqg0 = (iInterface28 instanceof azxs) ? ((azxs)iInterface28) : new azxq(iBinder28);
                }
                byte[] arr_b6 = parcel0.createByteArray();
                eiqi.gr(parcel0);
                eist eist0 = new eist(((azxs)eiqg0), arr_b6, this.b);
                this.a.b(eist0);
                break;
            }
            case 0x1F: {
                IBinder iBinder29 = parcel0.readStrongBinder();
                if(iBinder29 != null) {
                    IInterface iInterface29 = iBinder29.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
                    eiqg0 = (iInterface29 instanceof eiqg) ? ((eiqg)iInterface29) : new eiqe(iBinder29);
                }
                byte[] arr_b7 = parcel0.createByteArray();
                eiqi.gr(parcel0);
                this.c(eiqg0, arr_b7);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // eiqj
    public final void g(eiqg eiqg0, String s, String s1, String s2, String s3) {
        this.t();
        eirq eirq0 = new eirq(eiqg0, s, s1, s3, this.b);
        this.a.b(eirq0);
    }

    @Override  // eiqj
    public final void h(eiqg eiqg0, String s, String s1) {
        this.s(gfta.b(s));
        eirq eirq0 = new eirq(eiqg0, s, s1, this.b, this.b);
        this.a.b(eirq0);
    }

    @Override  // eiqj
    public final void i(eiqg eiqg0) {
        this.t();
        eirw eirw0 = new eirw(eiqg0, this.b);
        this.a.b(eirw0);
    }

    @Override  // eiqj
    public final void j(eiqd eiqd0) {
        eiry eiry0 = new eiry(eiqd0, this.b);
        this.a.b(eiry0);
    }

    @Override  // eiqj
    public final void k(eiqg eiqg0, String s, String s1, String s2) {
        this.r();
        eisb eisb0 = new eisb(eiqg0, this.b, s, s1, s2);
        this.a.b(eisb0);
    }

    @Override  // eiqj
    public final void l(eiqg eiqg0, String s, int v, String[] arr_s, byte[] arr_b) {
        ccmq.a().a(bbdg.vc);
        this.s(s);
        eisi eisi0 = new eisi(eiqg0, s, v, arr_s, new int[0], arr_b, false, this.b);
        this.a.b(eisi0);
    }

    @Override  // eiqj
    public final void m(String s, eiqa eiqa0) {
        eisg eisg0 = new eisg(this.b, s, eiqa0);
        this.a.b(eisg0);
    }

    @Override  // eiqj
    public final void n(eiqg eiqg0, String s, int v, String[] arr_s, byte[] arr_b, String s1, String s2) {
        ccmq.a().a(bbdg.ve);
        this.s(s);
        eisk eisk0 = new eisk(eiqg0, s, new eisl(s, v, arr_s, arr_b, s1, s2, this.b));
        this.a.b(eisk0);
    }

    @Override  // eiqj
    public final void o(eiqg eiqg0, String s, byte[] arr_b) {
        this.s(s);
        eisr eisr0 = new eisr(eiqg0, s, arr_b, this.b);
        this.a.b(eisr0);
    }

    @Override  // eiqj
    public final void p(eiqg eiqg0, String s, String s1, Flag[] arr_flag) {
        this.u();
        eisz eisz0 = new eisz(eiqg0, this.b, s, s1, arr_flag);
        this.a.b(eisz0);
    }

    @Override  // eiqj
    public final void q(azxs azxs0, String s, byte[] arr_b) {
        this.s(s);
        eitc eitc0 = new eitc(azxs0, s, arr_b, this.b);
        this.a.b(eitc0);
    }

    public final void r() {
        this.t();
        hxly hxly0 = hxly.a;
        if(!hxly0.f().l()) {
            String s = this.b;
            if(!eipv.a.contains(s)) {
                eiqs eiqs0 = this.d;
                if(s != null && s.equals("com.google.android.apps.mtaas.labtestsupport") && SystemProperties.getBoolean("debug.gms.phenotype.allow_lts", false)) {
                    long v = hxly0.f().b();
                    if(v < 0L) {
                        ((ggtj)eiqs.a.h()).x("Lab Test Support disallowed");
                        goto label_34;
                    }
                    else {
                        gnum gnum0 = eiqs0.b(s);
                        if(gnum0 == null) {
                            goto label_34;
                        }
                        else {
                            long v1 = gnum0.c;
                            if(v1 < v) {
                                ((ggtj)eiqs.a.j()).A("Lab Test Support from an old CL (%d)", v1);
                                goto label_34;
                            }
                            else {
                                long v2 = eiqs0.a(gnum0.b);
                                if(v2 == -1L) {
                                    ((ggtj)eiqs.a.j()).x("Could not read build timestamp for Lab Test Support.");
                                    goto label_34;
                                }
                                else {
                                    gnum gnum1 = eiqs0.b("com.google.android.gms");
                                    if(gnum1 == null) {
                                        ((ggtj)eiqs.a.j()).x("Could not read build data for GMS Core.");
                                        goto label_34;
                                    }
                                    else {
                                        long v3 = eiqs0.a(gnum1.b);
                                        if(v3 == -1L) {
                                            ((ggtj)eiqs.a.j()).x("Could not read build timestamp for GMS Core.");
                                            goto label_34;
                                        }
                                        else if(Long.compare(v2, 0xFFFFFFFFFFB0E600L + v3) < 0) {
                                            ((ggtj)eiqs.a.j()).x("Lab Test Support more than 60 days older than GMS Core.");
                                            goto label_34;
                                        }
                                        else if(v2 > v3 + 10368000L) {
                                            ((ggtj)eiqs.a.j()).x("Lab Test Support more than 60 days older than GMS Core.");
                                            goto label_34;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                label_34:
                    if(!Build.HARDWARE.equals("goldfish") && !Build.HARDWARE.equals("ranchu") && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
                        throw new SecurityException(s + " is not authorized for debug operations");
                    }
                }
            }
        }
    }

    public final void s(String s) {
        String s3;
        String s2;
        if(!bbmq.Y(AppContextProvider.a())) {
            azql azql0 = this.c;
            String s1 = this.b;
            if(!azql0.g(s1)) {
                int v = s.indexOf(35);
                if(v == -1) {
                    s2 = null;
                    s3 = s;
                }
                else {
                    s3 = s.substring(0, v);
                    s2 = s.substring(v + 1);
                }
                if(!eipv.a(hxkf.c(), s3)) {
                    azql0.d(s1);
                    return;
                }
                if(!s1.equals(s2)) {
                    throw new SecurityException(a.r(s, s1, " is not authorized to operate on "));
                }
            }
        }
    }

    public final void t() {
        if(!bbmq.Y(AppContextProvider.a())) {
            this.c.d(this.b);
        }
    }

    public final void u() {
        if(hxly.e().b.contains(this.b)) {
            this.t();
            return;
        }
        this.r();
    }

    @Override  // eiqj
    public final void v(eiqg eiqg0, String s, int v, String[] arr_s, int[] arr_v, byte[] arr_b) {
        ccmq.a().a(bbdg.vc);
        this.t();
        eisi eisi0 = new eisi(eiqg0, s, v, arr_s, arr_v, arr_b, true, this.b);
        this.a.b(eisi0);
    }
}

