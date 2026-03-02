import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.romanesco.model.RestoreOptionsEntity;
import com.google.android.gms.romanesco.model.RestoreSourceEntity;

public final class ekfj extends wby implements cjug, ekfk {
    private final cjts a;
    private final String b;
    private final String c;

    public ekfj() {
        super("com.google.android.gms.romanesco.internal.IRomanescoService");
    }

    public ekfj(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.romanesco.internal.IRomanescoService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // ekfk
    public final void a(ekfh ekfh0, String s, String s1, RestoreSourceEntity[] arr_restoreSourceEntity, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ez);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.c);
        azug azug0 = azuf0.a();
        ekgm ekgm0 = new ekgm(ekfh0, s, s1, new RestoreOptionsEntity(false, false), arr_restoreSourceEntity, azug0);
        this.a.b(ekgm0);
    }

    @Override  // ekfk
    public final void b(ekfh ekfh0, String s, String s1, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ez);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekgs ekgs0 = new ekgs(ekfh0, s, s1, azuf0.a());
        this.a.b(ekgs0);
    }

    @Override  // ekfk
    public final void c(ekfh ekfh0, String s, long v, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ez);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekgt ekgt0 = new ekgt(ekfh0, s, v, azuf0.a());
        this.a.b(ekgt0);
    }

    @Override  // ekfk
    public final void d(ekfh ekfh0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ez);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekgu ekgu0 = new ekgu(ekfh0, s, azuf0.a());
        this.a.b(ekgu0);
    }

    @Override  // ekfk
    public final void e(ekfh ekfh0, String s, String s1, String[] arr_s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ez);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekgv ekgv0 = new ekgv(ekfh0, s, s1, arr_s, azuf0.a());
        this.a.b(ekgv0);
    }

    @Override  // ekfk
    public final void f(ekfh ekfh0, String s, String s1, String[] arr_s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ez);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekgw ekgw0 = new ekgw(ekfh0, s, s1, arr_s, azuf0.a());
        this.a.b(ekgw0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ekfh ekfh0 = null;
        switch(v) {
            case 1101: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface0 instanceof ekfh) ? ((ekfh)iInterface0) : new ekff(iBinder0);
                }
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                String[] arr_s = parcel0.createStringArray();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                this.e(ekfh0, s, s1, arr_s, apiMetadata0);
                break;
            }
            case 1102: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface1 instanceof ekfh) ? ((ekfh)iInterface1) : new ekff(iBinder1);
                }
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                parcel0.readString();
                String[] arr_s1 = parcel0.createStringArray();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                azuf azuf0 = azug.b(apiMetadata1);
                azuf0.f(azud.a);
                azuf0.e(bbdp.ez);
                azuf0.g(bbdq.ac);
                azuf0.d(this.b);
                azuf0.c(this.c);
                ekhd ekhd0 = new ekhd(ekfh0, s2, s3, arr_s1, azuf0.a());
                this.a.b(ekhd0);
                break;
            }
            case 1201: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface2 instanceof ekfh) ? ((ekfh)iInterface2) : new ekff(iBinder2);
                }
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                this.b(ekfh0, s4, s5, apiMetadata2);
                break;
            }
            case 1401: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface3 instanceof ekfh) ? ((ekfh)iInterface3) : new ekff(iBinder3);
                }
                String s6 = parcel0.readString();
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                String s9 = parcel0.readString();
                String[] arr_s2 = parcel0.createStringArray();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                this.h(ekfh0, s6, s7, s8, s9, arr_s2, apiMetadata3);
                break;
            }
            case 2701: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface4 instanceof ekfh) ? ((ekfh)iInterface4) : new ekff(iBinder4);
                }
                String s10 = parcel0.readString();
                long v1 = parcel0.readLong();
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                this.c(ekfh0, s10, v1, apiMetadata4);
                break;
            }
            case 0xAF1: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface5 instanceof ekfh) ? ((ekfh)iInterface5) : new ekff(iBinder5);
                }
                String s11 = parcel0.readString();
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                parcel0.readString();
                String[] arr_s3 = parcel0.createStringArray();
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                azuf azuf1 = azug.b(apiMetadata5);
                azuf1.f(azud.a);
                azuf1.e(bbdp.ez);
                azuf1.g(bbdq.ac);
                azuf1.d(this.b);
                azuf1.c(this.c);
                ekhi ekhi0 = new ekhi(ekfh0, s11, s12, s13, arr_s3, azuf1.a());
                this.a.b(ekhi0);
                break;
            }
            case 0xAF2: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface6 instanceof ekfh) ? ((ekfh)iInterface6) : new ekff(iBinder6);
                }
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                String[] arr_s4 = parcel0.createStringArray();
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                this.f(ekfh0, s14, s15, arr_s4, apiMetadata6);
                break;
            }
            case 2902: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface7 instanceof ekfh) ? ((ekfh)iInterface7) : new ekff(iBinder7);
                }
                String s16 = parcel0.readString();
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                this.d(ekfh0, s16, apiMetadata7);
                break;
            }
            case 3001: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface8 instanceof ekfh) ? ((ekfh)iInterface8) : new ekff(iBinder8);
                }
                String s17 = parcel0.readString();
                String s18 = parcel0.readString();
                RestoreSourceEntity[] arr_restoreSourceEntity = (RestoreSourceEntity[])parcel0.createTypedArray(RestoreSourceEntity.CREATOR);
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                this.a(ekfh0, s17, s18, arr_restoreSourceEntity, apiMetadata8);
                break;
            }
            case 3601: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.romanesco.internal.IPromoRomanescoRestoresCallbacks");
                    ekfh0 = (iInterface9 instanceof ekfe) ? ((ekfe)iInterface9) : new ekfc(iBinder9);
                }
                String s19 = parcel0.readString();
                String s20 = parcel0.readString();
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                this.g(((ekfe)ekfh0), s19, s20, apiMetadata9);
                break;
            }
            case 3701: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface10 instanceof ekfh) ? ((ekfh)iInterface10) : new ekff(iBinder10);
                }
                String s21 = parcel0.readString();
                String s22 = parcel0.readString();
                String s23 = parcel0.readString();
                parcel0.readString();
                String[] arr_s5 = parcel0.createStringArray();
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                azuf azuf2 = azug.b(apiMetadata10);
                azuf2.f(azud.a);
                azuf2.e(bbdp.ez);
                azuf2.g(bbdq.ac);
                azuf2.d(this.b);
                azuf2.c(this.c);
                ekhe ekhe0 = new ekhe(ekfh0, s21, s22, s23, arr_s5, true, azuf2.a());
                this.a.b(ekhe0);
                break;
            }
            case 3801: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface11 instanceof ekfh) ? ((ekfh)iInterface11) : new ekff(iBinder11);
                }
                String s24 = parcel0.readString();
                String s25 = parcel0.readString();
                RestoreOptionsEntity restoreOptionsEntity0 = (RestoreOptionsEntity)wbz.a(parcel0, RestoreOptionsEntity.CREATOR);
                RestoreSourceEntity[] arr_restoreSourceEntity1 = (RestoreSourceEntity[])parcel0.createTypedArray(RestoreSourceEntity.CREATOR);
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                this.j(ekfh0, s24, s25, restoreOptionsEntity0, arr_restoreSourceEntity1, apiMetadata11);
                break;
            }
            case 3802: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
                    ekfh0 = (iInterface12 instanceof ekfh) ? ((ekfh)iInterface12) : new ekff(iBinder12);
                }
                String s26 = parcel0.readString();
                String s27 = parcel0.readString();
                RestoreOptionsEntity restoreOptionsEntity1 = (RestoreOptionsEntity)wbz.a(parcel0, RestoreOptionsEntity.CREATOR);
                RestoreSourceEntity[] arr_restoreSourceEntity2 = (RestoreSourceEntity[])parcel0.createTypedArray(RestoreSourceEntity.CREATOR);
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekfj.gr(parcel0);
                this.i(ekfh0, s26, s27, restoreOptionsEntity1, arr_restoreSourceEntity2, apiMetadata12);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // ekfk
    public final void g(ekfe ekfe0, String s, String s1, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ez);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekha ekha0 = new ekha(ekfe0, s, s1, azuf0.a());
        this.a.b(ekha0);
    }

    @Override  // ekfk
    public final void h(ekfh ekfh0, String s, String s1, String s2, String s3, String[] arr_s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ez);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekhe ekhe0 = new ekhe(ekfh0, s, s1, s2, arr_s, false, azuf0.a());
        this.a.b(ekhe0);
    }

    @Override  // ekfk
    public final void i(ekfh ekfh0, String s, String s1, RestoreOptionsEntity restoreOptionsEntity0, RestoreSourceEntity[] arr_restoreSourceEntity, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ez);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekgm ekgm0 = new ekgm(ekfh0, s, s1, restoreOptionsEntity0, arr_restoreSourceEntity, azuf0.a());
        this.a.b(ekgm0);
    }

    @Override  // ekfk
    public final void j(ekfh ekfh0, String s, String s1, RestoreOptionsEntity restoreOptionsEntity0, RestoreSourceEntity[] arr_restoreSourceEntity, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ez);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ekhk ekhk0 = new ekhk(ekfh0, s, s1, restoreOptionsEntity0, arr_restoreSourceEntity, azuf0.a());
        this.a.b(ekhk0);
    }
}

