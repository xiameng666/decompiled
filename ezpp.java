import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
import com.google.android.gms.udc.service.UdcApiChimeraService;

public final class ezpp extends wby implements cjug, ezpq {
    public final UdcApiChimeraService a;
    public final baqr b;
    final ezmy c;
    private final cjts d;
    private final String e;

    public ezpp() {
        super("com.google.android.gms.udc.internal.IUdcService");
    }

    public ezpp(UdcApiChimeraService udcApiChimeraService0, cjts cjts0, Account account0, String s, int v) {
        super("com.google.android.gms.udc.internal.IUdcService");
        this.a = udcApiChimeraService0;
        this.d = cjts0;
        this.e = s;
        baqr baqr0 = new baqr();
        baqr0.d = "com.google.android.gms";
        baqr0.e = s;
        baqr0.a = v;
        baqr0.c = account0;
        baqr0.b = account0;
        baqr0.l(hzdc.a.b().c());
        this.b = baqr0;
        this.c = new ezmy(new ezmx(new bbeo(udcApiChimeraService0, hzdc.d(), hzdc.c(), hzdc.a.b().h(), hzdc.a.b().b(), hzdc.a.b().d(), 0x1001)), (account0 == null ? null : new ezts(udcApiChimeraService0, account0.name)));
    }

    @Override  // ezpq
    public final void a(ezpn ezpn0, UdcCacheRequest udcCacheRequest0) {
        ccmq.a().a(bbdg.gV);
        ezqy ezqy0 = new ezqy(this);
        eznr eznr0 = new eznr(this.a, ezpn0, this.b, this.e, ((gful_cronetEngineProvider)ezqy0), udcCacheRequest0);
        this.d.b(eznr0);
    }

    @Override  // ezpq
    public final void b(ezpn ezpn0) {
        ccmq.a().a(bbdg.ha);
        ezqx ezqx0 = new ezqx(this);
        eznj eznj0 = new eznj(this.a, ezpn0, this.b, this.e, ((gful_cronetEngineProvider)ezqx0));
        this.d.b(eznj0);
    }

    public final void c(ezpn ezpn0, UdcSettingsListActivityRequest udcSettingsListActivityRequest0) {
        ccmq.a().a(bbdg.gY);
        UdcApiChimeraService.c();
        ezns ezns0 = new ezns(this.a, ezpn0, this.b, this.e, udcSettingsListActivityRequest0);
        this.d.b(ezns0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ezpn ezpn5;
        ezpn ezpn4;
        ezpn ezpn3;
        ezpn ezpn2;
        ezpn ezpn1;
        ezpn ezpn0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    ezpn1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn1 = (iInterface0 instanceof ezpn) ? ((ezpn)iInterface0) : new ezpl(iBinder0);
                }
                parcel0.createByteArray();
                ezpp.gr(parcel0);
                ccmq.a().a(bbdg.gU);
                ezpn1.k(new Status(4501, "Settings unavailable because the service was shut down", null));
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn0 = (iInterface1 instanceof ezpn) ? ((ezpn)iInterface1) : new ezpl(iBinder1);
                }
                byte[] arr_b = parcel0.createByteArray();
                ezpp.gr(parcel0);
                ccmq.a().a(bbdg.gY);
                UdcApiChimeraService.c();
                ezne ezne0 = new ezne(this.a, ezpn0, this.b, this.e, this.c, arr_b);
                this.d.b(ezne0);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    ezpn2 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn2 = (iInterface2 instanceof ezpn) ? ((ezpn)iInterface2) : new ezpl(iBinder2);
                }
                parcel0.createByteArray();
                ezpp.gr(parcel0);
                ccmq.a().a(bbdg.gX);
                ezpn2.h(new Status(4501, "Settings unavailable because the service was shut down", null));
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 == null) {
                    ezpn3 = null;
                }
                else {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn3 = (iInterface3 instanceof ezpn) ? ((ezpn)iInterface3) : new ezpl(iBinder3);
                }
                parcel0.createByteArray();
                ezpp.gr(parcel0);
                ccmq.a().a(bbdg.gW);
                ezpn3.j(new Status(4501, "Settings unavailable because the service was shut down", null));
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    ezpn4 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn4 = (iInterface4 instanceof ezpn) ? ((ezpn)iInterface4) : new ezpl(iBinder4);
                }
                parcel0.createByteArray();
                ezpp.gr(parcel0);
                ccmq.a().a(bbdg.gT);
                ezpn4.i(new Status(4501, "Settings unavailable because the service was shut down", null));
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 == null) {
                    ezpn5 = null;
                }
                else {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn5 = (iInterface5 instanceof ezpn) ? ((ezpn)iInterface5) : new ezpl(iBinder5);
                }
                ezpp.gr(parcel0);
                ccmq.a().a(bbdg.gY);
                UdcApiChimeraService.c();
                this.c(ezpn5, new UdcSettingsListActivityRequest(null, false));
                break;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn0 = (iInterface6 instanceof ezpn) ? ((ezpn)iInterface6) : new ezpl(iBinder6);
                }
                byte[] arr_b1 = parcel0.createByteArray();
                ezpp.gr(parcel0);
                ccmq.a().a(bbdg.gZ);
                UdcApiChimeraService.c();
                eznf eznf0 = new eznf(this.a, ezpn0, this.b, this.e, this.c, arr_b1);
                this.d.b(eznf0);
                break;
            }
            case 8: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn0 = (iInterface7 instanceof ezpn) ? ((ezpn)iInterface7) : new ezpl(iBinder7);
                }
                UdcCacheRequest udcCacheRequest0 = (UdcCacheRequest)wbz.a(parcel0, UdcCacheRequest.CREATOR);
                ezpp.gr(parcel0);
                this.a(ezpn0, udcCacheRequest0);
                break;
            }
            case 9: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn0 = (iInterface8 instanceof ezpn) ? ((ezpn)iInterface8) : new ezpl(iBinder8);
                }
                UdcSettingsListActivityRequest udcSettingsListActivityRequest0 = (UdcSettingsListActivityRequest)wbz.a(parcel0, UdcSettingsListActivityRequest.CREATOR);
                ezpp.gr(parcel0);
                this.c(ezpn0, udcSettingsListActivityRequest0);
                break;
            }
            case 10: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn0 = (iInterface9 instanceof ezpn) ? ((ezpn)iInterface9) : new ezpl(iBinder9);
                }
                UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest0 = (UdcWriteLocalSettingsRequest)wbz.a(parcel0, UdcWriteLocalSettingsRequest.CREATOR);
                ezpp.gr(parcel0);
                ccmq.a().a(bbdg.gW);
                ezqv ezqv0 = new ezqv(this);
                ezqw ezqw0 = new ezqw(this);
                ezod ezod0 = new ezod(this.a, ezpn0, this.b, this.e, ((gful_cronetEngineProvider)ezqv0), ((gful_cronetEngineProvider)ezqw0), udcWriteLocalSettingsRequest0);
                this.d.b(ezod0);
                break;
            }
            case 11: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn0 = (iInterface10 instanceof ezpn) ? ((ezpn)iInterface10) : new ezpl(iBinder10);
                }
                ezpp.gr(parcel0);
                this.b(ezpn0);
                break;
            }
            case 12: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.udc.internal.IUdcCallbacks");
                    ezpn0 = (iInterface11 instanceof ezpn) ? ((ezpn)iInterface11) : new ezpl(iBinder11);
                }
                ezpp.gr(parcel0);
                ccmq.a().a(bbdg.hb);
                eznk eznk0 = new eznk(this.a, ezpn0, this.b, this.e);
                this.d.b(eznk0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

