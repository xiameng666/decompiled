import android.accounts.Account;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

public abstract class asdi extends wby implements asdj {
    public asdi() {
        super("com.google.android.gms.backup.migrate.helper.ID2dMigrateHelper");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        asdm asdm7;
        asdh asdh1;
        asdm asdm6;
        asdm asdm5;
        asdm asdm4;
        asdm asdm3;
        asdm asdm2;
        asdh asdh0;
        asdm asdm1;
        asdm asdm0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    asdm1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    asdm1 = (iInterface0 instanceof asdm) ? ((asdm)iInterface0) : new asdm(iBinder0);
                }
                asdi.gr(parcel0);
                this.h(asdm1);
                return true;
            }
            case 2: {
                String s = parcel0.readString();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    asdh0 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IBooleanCallbacks");
                    asdh0 = (iInterface1 instanceof asdh) ? ((asdh)iInterface1) : new asdh(iBinder1);
                }
                asdi.gr(parcel0);
                this.e(s, asdh0);
                return true;
            }
            case 3: {
                String s1 = parcel0.readString();
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    asdm2 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    asdm2 = (iInterface2 instanceof asdm) ? ((asdm)iInterface2) : new asdm(iBinder2);
                }
                asdi.gr(parcel0);
                this.c(s1, parcelFileDescriptor0, asdm2);
                return true;
            }
            case 4: {
                String s2 = parcel0.readString();
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 == null) {
                    asdm3 = null;
                }
                else {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    asdm3 = (iInterface3 instanceof asdm) ? ((asdm)iInterface3) : new asdm(iBinder3);
                }
                asdi.gr(parcel0);
                this.d(s2, asdm3);
                return true;
            }
            case 5: {
                String s3 = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    asdm4 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    asdm4 = (iInterface4 instanceof asdm) ? ((asdm)iInterface4) : new asdm(iBinder4);
                }
                asdi.gr(parcel0);
                this.a(s3, asdm4);
                return true;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 == null) {
                    asdm5 = null;
                }
                else {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    asdm5 = (iInterface5 instanceof asdm) ? ((asdm)iInterface5) : new asdm(iBinder5);
                }
                asdi.gr(parcel0);
                this.l(asdm5);
                return true;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 == null) {
                    asdm6 = null;
                }
                else {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    asdm6 = (iInterface6 instanceof asdm) ? ((asdm)iInterface6) : new asdm(iBinder6);
                }
                asdi.gr(parcel0);
                this.f(asdm6);
                return true;
            }
            case 8: {
                String s4 = parcel0.readString();
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 == null) {
                    asdh1 = null;
                }
                else {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IBooleanCallbacks");
                    asdh1 = (iInterface7 instanceof asdh) ? ((asdh)iInterface7) : new asdh(iBinder7);
                }
                asdi.gr(parcel0);
                this.g(s4, asdh1);
                return true;
            }
            case 9: {
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                byte[] arr_b = parcel0.createByteArray();
                byte[] arr_b1 = parcel0.createByteArray();
                byte[] arr_b2 = parcel0.createByteArray();
                ComponentName componentName0 = (ComponentName)wbz.a(parcel0, ComponentName.CREATOR);
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 == null) {
                    asdm7 = null;
                }
                else {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    asdm7 = (iInterface8 instanceof asdm) ? ((asdm)iInterface8) : new asdm(iBinder8);
                }
                asdi.gr(parcel0);
                this.j(account0, arr_b, arr_b1, arr_b2, componentName0, asdm7);
                return true;
            }
            case 10: {
                Account account1 = (Account)wbz.a(parcel0, Account.CREATOR);
                byte[] arr_b3 = parcel0.createByteArray();
                byte[] arr_b4 = parcel0.createByteArray();
                byte[] arr_b5 = parcel0.createByteArray();
                byte[] arr_b6 = parcel0.createByteArray();
                byte[] arr_b7 = parcel0.createByteArray();
                asdm asdm8 = null;
                int v1 = parcel0.readInt();
                byte[] arr_b8 = parcel0.createByteArray();
                ComponentName componentName1 = (ComponentName)wbz.a(parcel0, ComponentName.CREATOR);
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    asdm8 = (iInterface9 instanceof asdm) ? ((asdm)iInterface9) : new asdm(iBinder9);
                }
                asdi.gr(parcel0);
                this.k(account1, arr_b3, arr_b4, arr_b5, arr_b6, arr_b7, v1, arr_b8, componentName1, asdm8);
                return true;
            }
            case 11: {
                String s5 = parcel0.readString();
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    asdm0 = (iInterface10 instanceof asdm) ? ((asdm)iInterface10) : new asdm(iBinder10);
                }
                asdi.gr(parcel0);
                this.i(s5, asdm0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

