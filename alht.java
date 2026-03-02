import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import com.google.android.gms.auth.proximity.firstparty.DeviceSyncApiChimeraService;
import com.google.android.gms.common.api.ApiMetadata;

public final class alht extends wby implements alhu, cjug {
    private final DeviceSyncApiChimeraService a;
    private final String b;
    private final String c;
    private final cjts d;

    public alht() {
        super("com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
    }

    public alht(DeviceSyncApiChimeraService deviceSyncApiChimeraService0, cjts cjts0, String s, String s1) {
        super("com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
        this.b = s;
        this.c = s1;
        this.a = deviceSyncApiChimeraService0;
        this.d = cjts0;
    }

    @Override  // alhu
    public final void a(azxs azxs0, String s, ApiMetadata apiMetadata0) {
        this.h();
        alfn alfn0 = new alfn(azxs0, s, this.g(apiMetadata0));
        this.d.b(alfn0);
    }

    @Override  // alhu
    public final void b(alhx alhx0, String s, String s1, ApiMetadata apiMetadata0) {
        this.h();
        alfo alfo0 = new alfo(alhx0, s, s1, this.g(apiMetadata0));
        this.d.b(alfo0);
    }

    @Override  // alhu
    public final void c(alid alid0, String s, ApiMetadata apiMetadata0) {
        this.h();
        alfr alfr0 = new alfr(alid0, s, false, this.g(apiMetadata0));
        this.d.b(alfr0);
    }

    @Override  // alhu
    public final void d(alig alig0, ApiMetadata apiMetadata0) {
        this.h();
        alft alft0 = new alft(alig0, this.g(apiMetadata0));
        this.d.b(alft0);
    }

    @Override  // alhu
    public final void e(azxs azxs0, String s, boolean z, String s1, ApiMetadata apiMetadata0) {
        this.h();
        ajes ajes0 = new ajes(this.a);
        azug azug0 = this.g(apiMetadata0);
        algi algi0 = new algi(azxs0, s, z, s1, ajes0, alem.a, azug0);
        this.d.b(algi0);
    }

    @Override  // alhu
    public final void f(azxs azxs0, String s, boolean z, String s1, ApiMetadata apiMetadata0) {
        this.h();
        ajes ajes0 = new ajes(this.a);
        azug azug0 = this.g(apiMetadata0);
        algi algi0 = new algi(azxs0, s, z, s1, ajes0, alem.c, azug0);
        this.d.b(algi0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        alig alig0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
                    alig0 = (iInterface0 instanceof alig) ? ((alig)iInterface0) : new alie(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                this.d(alig0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    alig0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                DeviceFilter deviceFilter0 = (DeviceFilter)wbz.a(parcel0, DeviceFilter.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                azug azug0 = this.g(apiMetadata1);
                alfy alfy0 = new alfy(alig0, pendingIntent0, deviceFilter0, this.b, azug0);
                this.d.b(alfy0);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    alig0 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                PendingIntent pendingIntent1 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                DeviceFilter deviceFilter1 = (DeviceFilter)wbz.a(parcel0, DeviceFilter.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                azug azug1 = this.g(apiMetadata2);
                alhb alhb0 = new alhb(alig0, pendingIntent1, deviceFilter1, this.b, azug1);
                this.d.b(alhb0);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
                    alig0 = (iInterface3 instanceof alia) ? ((alia)iInterface3) : new alhy(iBinder3);
                }
                parcel0.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                this.h();
                alfp alfp0 = new alfp(((alia)alig0), this.g(apiMetadata3));
                this.d.b(alfp0);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback");
                    alig0 = (iInterface4 instanceof alid) ? ((alid)iInterface4) : new alib(iBinder4);
                }
                String s = parcel0.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                this.c(((alid)alig0), s, apiMetadata4);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    alig0 = (iInterface5 instanceof azxs) ? ((azxs)iInterface5) : new azxq(iBinder5);
                }
                String s1 = parcel0.readString();
                boolean z = wbz.i(parcel0);
                String s2 = parcel0.readString();
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                this.e(alig0, s1, z, s2, apiMetadata5);
                break;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    alig0 = (iInterface6 instanceof azxs) ? ((azxs)iInterface6) : new azxq(iBinder6);
                }
                String s3 = parcel0.readString();
                boolean z1 = wbz.i(parcel0);
                String s4 = parcel0.readString();
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                this.h();
                azug azug2 = this.g(apiMetadata6);
                algg algg0 = new algg(alig0, ggia.d(new String[]{s3}), z1, s4, false, azug2);
                this.d.b(algg0);
                break;
            }
            case 8: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    alig0 = (iInterface7 instanceof azxs) ? ((azxs)iInterface7) : new azxq(iBinder7);
                }
                PendingIntent pendingIntent2 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                String s5 = parcel0.readString();
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                azug azug3 = this.g(apiMetadata7);
                alfz alfz0 = new alfz(alig0, pendingIntent2, s5, true, this.b, azug3);
                this.d.b(alfz0);
                break;
            }
            case 9: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    alig0 = (iInterface8 instanceof azxs) ? ((azxs)iInterface8) : new azxq(iBinder8);
                }
                PendingIntent pendingIntent3 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                String s6 = parcel0.readString();
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                azug azug4 = this.g(apiMetadata8);
                alfz alfz1 = new alfz(alig0, pendingIntent3, s6, false, this.b, azug4);
                this.d.b(alfz1);
                break;
            }
            case 10: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback");
                    alig0 = (iInterface9 instanceof alhx) ? ((alhx)iInterface9) : new alhv(iBinder9);
                }
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                this.b(((alhx)alig0), s7, s8, apiMetadata9);
                break;
            }
            case 11: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    alig0 = (iInterface10 instanceof azxs) ? ((azxs)iInterface10) : new azxq(iBinder10);
                }
                String s9 = parcel0.readString();
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                this.a(((azxs)alig0), s9, apiMetadata10);
                break;
            }
            case 12: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    alig0 = (iInterface11 instanceof azxs) ? ((azxs)iInterface11) : new azxq(iBinder11);
                }
                String s10 = parcel0.readString();
                boolean z2 = wbz.i(parcel0);
                String s11 = parcel0.readString();
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alht.gr(parcel0);
                this.f(alig0, s10, z2, s11, apiMetadata11);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    private final azug g(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.X);
        azuf0.g(bbdq.B);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }

    private final void h() {
        int v = alht.getCallingPid();
        int v1 = alht.getCallingUid();
        if(cjmf.a(this.a, "android.permission.GET_ACCOUNTS", v, v1, this.b) != -1) {
            return;
        }
        throw new SecurityException("Missing permission android.permission.GET_ACCOUNTS");
    }
}

