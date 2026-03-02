import android.content.pm.Signature;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;

public final class aisv extends wby implements aisw, cjug {
    private final cjts a;
    private final aisi b;

    public aisv() {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
    }

    public aisv(cjts cjts0, aisi aisi0) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        this.a = cjts0;
        this.b = aisi0;
    }

    @Override  // aisw
    public final void a(CreateRestoreCredentialRequest createRestoreCredentialRequest0, aisn aisn0) {
        ibuq.f(createRestoreCredentialRequest0, "request");
        ibuq.f(aisn0, "callback");
        ccmq.a().a(bbdg.na);
        aitq aitq0 = new aitq(this.b, createRestoreCredentialRequest0, aisn0);
        this.a.b(aitq0);
    }

    @Override  // aisw
    public final void b(String s, Signature[] arr_signature, aisq aisq0) {
        ibuq.f(s, "packageName");
        ibuq.f(arr_signature, "signatures");
        ibuq.f(aisq0, "callback");
        aits aits0 = new aits(this.b, s, arr_signature, aisq0);
        this.a.b(aits0);
    }

    @Override  // aisw
    public final void c(GetRestoreCredentialRequest getRestoreCredentialRequest0, aist aist0) {
        ibuq.f(getRestoreCredentialRequest0, "request");
        ibuq.f(aist0, "callback");
        ccmq.a().a(bbdg.mZ);
        aitu aitu0 = new aitu(this.b, getRestoreCredentialRequest0, aist0);
        this.a.b(aitu0);
    }

    @Override  // aisw
    public final void d(String s, Signature[] arr_signature, byte[] arr_b, boolean z, aisz aisz0) {
        ibuq.f(s, "packageName");
        ibuq.f(arr_signature, "signatures");
        ibuq.f(arr_b, "restoreKey");
        ibuq.f(aisz0, "callback");
        aitw aitw0 = new aitw(this.b, s, arr_signature, arr_b, z, aisz0);
        this.a.b(aitw0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object0;
        aisn aisn0;
        aist aist0;
        switch(v) {
            case 2: {
                GetRestoreCredentialRequest getRestoreCredentialRequest0 = (GetRestoreCredentialRequest)wbz.a(parcel0, GetRestoreCredentialRequest.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    aist0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
                    aist0 = (iInterface0 instanceof aist) ? ((aist)iInterface0) : new aisr(iBinder0);
                }
                aisv.gr(parcel0);
                this.c(getRestoreCredentialRequest0, aist0);
                break;
            }
            case 3: {
                CreateRestoreCredentialRequest createRestoreCredentialRequest0 = (CreateRestoreCredentialRequest)wbz.a(parcel0, CreateRestoreCredentialRequest.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    aisn0 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
                    aisn0 = (iInterface1 instanceof aisn) ? ((aisn)iInterface1) : new aisl(iBinder1);
                }
                aisv.gr(parcel0);
                this.a(createRestoreCredentialRequest0, aisn0);
                break;
            }
            case 4: {
                ClearRestoreCredentialRequest clearRestoreCredentialRequest0 = (ClearRestoreCredentialRequest)wbz.a(parcel0, ClearRestoreCredentialRequest.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    object0 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback");
                    object0 = (iInterface2 instanceof aisk) ? ((aisk)iInterface2) : new aisk(iBinder2);
                }
                aisv.gr(parcel0);
                ibuq.f(clearRestoreCredentialRequest0, "request");
                ibuq.f(object0, "callback");
                ccmq.a().a(bbdg.nb);
                aito aito0 = new aito(this.b, clearRestoreCredentialRequest0, ((aisk)object0));
                this.a.b(aito0);
                break;
            }
            case 5: {
                aisq aisq0 = null;
                String s = parcel0.readString();
                Signature[] arr_signature = (Signature[])parcel0.createTypedArray(Signature.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetPrivateRestoreCredentialKeyCallback");
                    aisq0 = (iInterface3 instanceof aisq) ? ((aisq)iInterface3) : new aiso(iBinder3);
                }
                aisv.gr(parcel0);
                this.b(s, arr_signature, aisq0);
                break;
            }
            case 6: {
                aisz aisz0 = null;
                String s1 = parcel0.readString();
                Signature[] arr_signature1 = (Signature[])parcel0.createTypedArray(Signature.CREATOR);
                byte[] arr_b = parcel0.createByteArray();
                boolean z = wbz.i(parcel0);
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.ISetPrivateRestoreCredentialKeyCallback");
                    aisz0 = (iInterface4 instanceof aisz) ? ((aisz)iInterface4) : new aisx(iBinder4);
                }
                aisv.gr(parcel0);
                this.d(s1, arr_signature1, arr_b, z, aisz0);
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

