import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelApiChimeraService;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.ArrayList;

public final class alin extends wby implements IInterface, cjug {
    private final SecureChannelApiChimeraService a;
    private final String b;
    private final String c;
    private final cjts d;

    public alin() {
        super("com.google.android.gms.auth.proximity.internal.ISecureChannelService");
    }

    public alin(SecureChannelApiChimeraService secureChannelApiChimeraService0, cjts cjts0, String s, String s1) {
        super("com.google.android.gms.auth.proximity.internal.ISecureChannelService");
        this.b = s;
        this.c = s1;
        this.a = secureChannelApiChimeraService0;
        this.d = cjts0;
    }

    private final azug a(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.X);
        azuf0.g(bbdq.B);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }

    private final void c() {
        int v = alin.getCallingPid();
        int v1 = alin.getCallingUid();
        if(cjmf.a(this.a, "android.permission.BLUETOOTH", v, v1, this.b) != -1) {
            return;
        }
        throw new SecurityException("Missing permission android.permission.BLUETOOTH");
    }

    private final void d() {
        if(alfb.a(this.a)) {
            return;
        }
        throw new SecurityException("Better Together must be enabled on an account to use the SecureChannel API!");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs3;
        azxs azxs1;
        azxs azxs0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                }
                Role role0 = (Role)wbz.a(parcel0, Role.CREATOR);
                ArrayList arrayList0 = parcel0.createTypedArrayList(RemoteDevice.CREATOR);
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alin.gr(parcel0);
                this.c();
                this.d();
                azug azug0 = this.a(apiMetadata0);
                alfx alfx0 = new alfx(azxs0, role0, arrayList0, pendingIntent0, this.b, azug0);
                this.d.b(alfx0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                Role role1 = (Role)wbz.a(parcel0, Role.CREATOR);
                ArrayList arrayList1 = parcel0.createTypedArrayList(RemoteDevice.CREATOR);
                PendingIntent pendingIntent1 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alin.gr(parcel0);
                this.c();
                this.d();
                azug azug1 = this.a(apiMetadata1);
                alha alha0 = new alha(azxs0, role1, arrayList1, pendingIntent1, this.b, azug1);
                this.d.b(alha0);
                break;
            }
            case 4: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                String s = parcel0.readString();
                Role role2 = (Role)wbz.a(parcel0, Role.CREATOR);
                byte[] arr_b = parcel0.createByteArray();
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alin.gr(parcel0);
                this.c();
                this.d();
                alge alge0 = new alge(azxs0, s, role2, arr_b, this.a(apiMetadata2));
                this.d.b(alge0);
                break;
            }
            case 5: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 == null) {
                    azxs1 = null;
                }
                else {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs azxs2 = (iInterface3 instanceof azxs) ? ((azxs)iInterface3) : new azxq(iBinder3);
                    azxs1 = azxs2;
                }
                String s1 = parcel0.readString();
                Role role3 = (Role)wbz.a(parcel0, Role.CREATOR);
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
                    azxs0 = (iInterface4 instanceof alij) ? ((alij)iInterface4) : new alih(iBinder4);
                }
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alin.gr(parcel0);
                this.c();
                this.d();
                aldz aldz0 = new aldz(azxs1, s1, role3, ((alij)azxs0), this.a(apiMetadata3));
                this.d.b(aldz0);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 == null) {
                    azxs3 = null;
                }
                else {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs3 = (iInterface5 instanceof azxs) ? ((azxs)iInterface5) : new azxq(iBinder5);
                }
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
                    azxs0 = (iInterface6 instanceof alij) ? ((alij)iInterface6) : new alih(iBinder6);
                }
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                alin.gr(parcel0);
                this.c();
                this.d();
                alga alga0 = new alga(azxs3, ((alij)azxs0), this.a(apiMetadata4));
                this.d.b(alga0);
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

