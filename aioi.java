import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.AppRestoreInfo;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import java.util.ArrayList;

public final class aioi extends wby implements aioj, cjug {
    private final cjts a;
    private final aink b;
    private final ainy c;

    public aioi() {
        super("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public aioi(cjts cjts0, aink aink0, ainy ainy0) {
        super("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        this.a = cjts0;
        this.b = aink0;
        this.c = ainy0;
    }

    @Override  // aioj
    public final void a(aiom aiom0, DeleteBytesRequest deleteBytesRequest0) {
        ccmq.a().a(bbdg.mS);
        aiww aiww0 = new aiww(this.b, aiom0, deleteBytesRequest0);
        this.a.b(aiww0);
    }

    @Override  // aioj
    public final void b(aioq aioq0) {
        ccmq.a().a(bbdg.mV);
        aixc aixc0 = new aixc(this.b, aioq0);
        this.a.b(aixc0);
    }

    @Override  // aioj
    public final void c(aiot aiot0) {
        ccmq.a().a(bbdg.mT);
        aixf aixf0 = new aixf(this.b, aiot0);
        this.a.b(aixf0);
    }

    @Override  // aioj
    public final void d(aiow aiow0, RetrieveBytesRequest retrieveBytesRequest0) {
        ccmq.a().a(bbdg.mR);
        aixq aixq0 = new aixq(this.b, aiow0, retrieveBytesRequest0);
        this.a.b(aixq0);
    }

    @Override  // aioj
    public final void e(aioz aioz0, byte[] arr_b) {
        ccmq.a().a(bbdg.mW);
        aixw aixw0 = new aixw(this.b, aioz0, arr_b);
        this.a.b(aixw0);
    }

    @Override  // aioj
    public final void f(aipc aipc0, StoreBytesData storeBytesData0) {
        ccmq.a().a(bbdg.mQ);
        aixz aixz0 = new aixz(this.b, aipc0, storeBytesData0);
        this.a.b(aixz0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        aiow aiow0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
                    aiow0 = (iInterface0 instanceof aiow) ? ((aiow)iInterface0) : new aiou(iBinder0);
                }
                aioi.gr(parcel0);
                ccmq.a().a(bbdg.mR);
                aixn aixn0 = new aixn(this.b, aiow0);
                this.a.b(aixn0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.ISetBlockstoreDataCallback");
                    aiow0 = (iInterface1 instanceof aioz) ? ((aioz)iInterface1) : new aiox(iBinder1);
                }
                byte[] arr_b = parcel0.createByteArray();
                aioi.gr(parcel0);
                this.e(((aioz)aiow0), arr_b);
                break;
            }
            case 4: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IGetBlockstoreDataCallback");
                    aiow0 = (iInterface2 instanceof aioq) ? ((aioq)iInterface2) : new aioo(iBinder2);
                }
                aioi.gr(parcel0);
                this.b(((aioq)aiow0));
                break;
            }
            case 5: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IGetAccessForPackageCallback");
                    aiow0 = (iInterface3 instanceof aion) ? ((aion)iInterface3) : new aion(iBinder3);
                }
                String s = parcel0.readString();
                aioi.gr(parcel0);
                aiwz aiwz0 = new aiwz(this.b, s, ((aion)aiow0));
                this.a.b(aiwz0);
                break;
            }
            case 6: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    aiow0 = (iInterface4 instanceof azxs) ? ((azxs)iInterface4) : new azxq(iBinder4);
                }
                String s1 = parcel0.readString();
                int v1 = parcel0.readInt();
                aioi.gr(parcel0);
                aixt aixt0 = new aixt(this.b, s1, v1, ((azxs)aiow0));
                this.a.b(aixt0);
                break;
            }
            case 7: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    aiow0 = (iInterface5 instanceof azxs) ? ((azxs)iInterface5) : new azxq(iBinder5);
                }
                String s2 = parcel0.readString();
                aioi.gr(parcel0);
                aiwt aiwt0 = new aiwt(this.b, s2, ((azxs)aiow0));
                this.a.b(aiwt0);
                break;
            }
            case 8: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    aiow0 = (iInterface6 instanceof azxs) ? ((azxs)iInterface6) : new azxq(iBinder6);
                }
                String s3 = parcel0.readString();
                int v2 = parcel0.readInt();
                aioi.gr(parcel0);
                aiyc aiyc0 = new aiyc(this.b, s3, v2, ((azxs)aiow0));
                this.a.b(aiyc0);
                break;
            }
            case 9: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    aiow0 = (iInterface7 instanceof azxs) ? ((azxs)iInterface7) : new azxq(iBinder7);
                }
                ArrayList arrayList0 = parcel0.createStringArrayList();
                int v3 = parcel0.readInt();
                AppRestoreInfo appRestoreInfo0 = (AppRestoreInfo)wbz.a(parcel0, AppRestoreInfo.CREATOR);
                aioi.gr(parcel0);
                ccmq.a().a(bbdg.mU);
                aixi aixi0 = new aixi(this.c, arrayList0, v3, appRestoreInfo0, aiow0);
                this.a.b(aixi0);
                break;
            }
            case 10: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
                    aiow0 = (iInterface8 instanceof aipc) ? ((aipc)iInterface8) : new aipa(iBinder8);
                }
                StoreBytesData storeBytesData0 = (StoreBytesData)wbz.a(parcel0, StoreBytesData.CREATOR);
                aioi.gr(parcel0);
                this.f(((aipc)aiow0), storeBytesData0);
                break;
            }
            case 11: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IIsEndToEndEncryptionAvailableCallback");
                    aiow0 = (iInterface9 instanceof aiot) ? ((aiot)iInterface9) : new aior(iBinder9);
                }
                aioi.gr(parcel0);
                this.c(((aiot)aiow0));
                break;
            }
            case 12: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
                    aiow0 = (iInterface10 instanceof aiow) ? ((aiow)iInterface10) : new aiou(iBinder10);
                }
                RetrieveBytesRequest retrieveBytesRequest0 = (RetrieveBytesRequest)wbz.a(parcel0, RetrieveBytesRequest.CREATOR);
                aioi.gr(parcel0);
                this.d(aiow0, retrieveBytesRequest0);
                break;
            }
            case 13: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IDeleteBytesCallback");
                    aiow0 = (iInterface11 instanceof aiom) ? ((aiom)iInterface11) : new aiok(iBinder11);
                }
                DeleteBytesRequest deleteBytesRequest0 = (DeleteBytesRequest)wbz.a(parcel0, DeleteBytesRequest.CREATOR);
                aioi.gr(parcel0);
                this.a(((aiom)aiow0), deleteBytesRequest0);
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

