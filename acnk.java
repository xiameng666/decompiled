import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.appstate.service.AppStateAndroidChimeraService;
import com.google.android.gms.common.data.DataHolder;

public final class acnk extends wby implements IInterface, cjug {
    public final String a;
    private final Context b;
    private final baqr c;

    public acnk() {
        super("com.google.android.gms.appstate.internal.IAppStateService");
    }

    public acnk(Context context0, baqr baqr0, String s) {
        super("com.google.android.gms.appstate.internal.IAppStateService");
        this.b = context0;
        this.c = baqr0;
        this.a = s;
    }

    private static boolean a(int v) {
        return v >= 0 && v < 4;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        boolean z = false;
        Integer integer0 = (int)4;
        Integer integer1 = (int)0x40000;
        acnj acnj0 = null;
        switch(v) {
            case 5001: {
                parcel1.writeNoException();
                parcel1.writeInt(0x40000);
                return true;
            }
            case 5002: {
                parcel1.writeNoException();
                parcel1.writeInt(4);
                return true;
            }
            case 5003: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    acnj0 = (iInterface0 instanceof acnj) ? ((acnj)iInterface0) : new acnj(iBinder0);
                }
                int v1 = parcel0.readInt();
                byte[] arr_b = parcel0.createByteArray();
                acnk.gr(parcel0);
                batl.n(acnk.a(v1), "State key is out of bounds: %d is not between 0 and %d", new Object[]{v1, integer0});
                if(arr_b != null) {
                    if(arr_b.length <= 0x40000) {
                        z = true;
                    }
                    batl.n(z, "App state data is too large (%d bytes). The maximum is %d", new Object[]{((int)arr_b.length), integer1});
                }
                if(acnj0 != null) {
                    try {
                        acnj0.a(v1, new DataHolder(DataHolder.a, 3));
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                parcel1.writeNoException();
                return true;
            }
            case 5004: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    acnj0 = (iInterface1 instanceof acnj) ? ((acnj)iInterface1) : new acnj(iBinder1);
                }
                int v2 = parcel0.readInt();
                acnk.gr(parcel0);
                batl.t(acnj0, "Must provide a valid callback object");
                batl.n(acnk.a(v2), "State key is out of bounds: %d is not between 0 and %d", new Object[]{v2, integer0});
                try {
                    acnj0.a(v2, new DataHolder(DataHolder.a, 3));
                }
                catch(RemoteException unused_ex) {
                }
                parcel1.writeNoException();
                return true;
            }
            case 5005: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    acnj0 = (iInterface2 instanceof acnj) ? ((acnj)iInterface2) : new acnj(iBinder2);
                }
                acnk.gr(parcel0);
                batl.t(acnj0, "Must provide a valid callback object");
                try {
                    DataHolder dataHolder0 = new DataHolder(DataHolder.a, 3);
                    Parcel parcel2 = acnj0.jo();
                    wbz.f(parcel2, dataHolder0);
                    acnj0.jp(5002, parcel2);
                }
                catch(RemoteException unused_ex) {
                }
                parcel1.writeNoException();
                return true;
            }
            case 5006: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    acnj0 = (iInterface3 instanceof acnj) ? ((acnj)iInterface3) : new acnj(iBinder3);
                }
                int v3 = parcel0.readInt();
                String s = parcel0.readString();
                byte[] arr_b1 = parcel0.createByteArray();
                acnk.gr(parcel0);
                batl.t(acnj0, "Must provide a valid callback object");
                batl.n(acnk.a(v3), "State key is out of bounds: %d is not between 0 and %d", new Object[]{v3, integer0});
                batl.t(s, "Must provide a non-null resolved version");
                if(arr_b1 != null) {
                    if(arr_b1.length <= 0x40000) {
                        z = true;
                    }
                    batl.n(z, "App state data is too large (%d bytes). The maximum is %d", new Object[]{((int)arr_b1.length), integer1});
                }
                try {
                    acnj0.a(v3, new DataHolder(DataHolder.a, 3));
                }
                catch(RemoteException unused_ex) {
                }
                parcel1.writeNoException();
                return true;
            }
            case 5007: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    acnj0 = (iInterface4 instanceof acnj) ? ((acnj)iInterface4) : new acnj(iBinder4);
                }
                int v4 = parcel0.readInt();
                acnk.gr(parcel0);
                batl.t(acnj0, "Must provide a valid callback object");
                batl.n(acnk.a(v4), "State key is out of bounds: %d is not between 0 and %d", new Object[]{v4, integer0});
                try {
                    Parcel parcel3 = acnj0.jo();
                    parcel3.writeInt(6);
                    parcel3.writeInt(v4);
                    acnj0.jp(5003, parcel3);
                }
                catch(RemoteException unused_ex) {
                }
                parcel1.writeNoException();
                return true;
            }
            case 5008: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    acnj0 = (iInterface5 instanceof acnj) ? ((acnj)iInterface5) : new acnj(iBinder5);
                }
                acnk.gr(parcel0);
                bbmn.j(this.b, this.c.d);
                synchronized(AppStateAndroidChimeraService.b) {
                    AppStateAndroidChimeraService.a.clear();
                }
                if(acnj0 != null) {
                    try {
                        acnj0.jp(5004, acnj0.jo());
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                parcel1.writeNoException();
                return true;
            }
            case 5009: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    acnj0 = (iInterface6 instanceof acnj) ? ((acnj)iInterface6) : new acnj(iBinder6);
                }
                acnk.gr(parcel0);
                if(Process.myUid() != Binder.getCallingUid()) {
                    throw new SecurityException();
                }
                batl.t(acnj0, "Must provide a valid callback object");
                try {
                    Parcel parcel4 = acnj0.jo();
                    parcel4.writeInt(0);
                    acnj0.jp(5005, parcel4);
                }
                catch(RemoteException unused_ex) {
                }
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

