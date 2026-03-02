import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.contextmanager.internal.RelationFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;

public final class bcwf extends wby implements bcwg, cjug {
    private final String a;
    private final String b;
    private final xsd c;
    private ContextManagerClientInfo d;

    public bcwf() {
        super("com.google.android.gms.contextmanager.internal.IContextManagerService");
    }

    public bcwf(ContextManagerClientInfo contextManagerClientInfo0, String s, String s1) {
        super("com.google.android.gms.contextmanager.internal.IContextManagerService");
        this.a = s;
        this.b = s1;
        this.c = xxe.s();
        this.d = contextManagerClientInfo0;
    }

    @Override  // bcwg
    public final void a(bcwd bcwd0, String s, String s1, String s2, ContextDataFilterImpl contextDataFilterImpl0, ApiMetadata apiMetadata0) {
        int v = this.h(s, s1, s2, 0);
        if(v != 0) {
            xsc.a(bcwd0, v, null);
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.aP);
        azuf0.g(bbdq.I);
        azuf0.d(this.a);
        azuf0.c(this.b);
        azug azug0 = azuf0.a();
        ContextManagerClientInfo contextManagerClientInfo0 = this.d;
        xsd.b(new xsu(bcwd0, contextManagerClientInfo0, contextDataFilterImpl0, azug0), xro.a("GetCurrentContext", this.c.a, contextManagerClientInfo0.b));
    }

    @Override  // bcwg
    public final void b(bcwd bcwd0, String s, String s1, String s2, SnapshotRequest snapshotRequest0, ApiMetadata apiMetadata0) {
        int v = this.h(s, s1, s2, 1);
        if(v != 0) {
            xsc.e(bcwd0, v, null);
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.aP);
        azuf0.g(bbdq.I);
        azuf0.d(this.a);
        azuf0.c(this.b);
        azuf0.h(true);
        azug azug0 = azuf0.a();
        ContextManagerClientInfo contextManagerClientInfo0 = this.d;
        xsd.b(new ycv(bcwd0, contextManagerClientInfo0, snapshotRequest0, azug0), xro.a("GetSnapshot", this.c.a, contextManagerClientInfo0.b));
    }

    @Override  // bcwg
    public final void c(bcwd bcwd0, String s, String s1, String s2, bcwa bcwa0, PendingIntent pendingIntent0, ApiMetadata apiMetadata0) {
        int v = this.h(s, s1, s2, 0);
        if(!bcwf.j(v)) {
            xsc.f(bcwd0, v);
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.aP);
        azuf0.g(bbdq.I);
        azuf0.d(this.a);
        azuf0.c(this.b);
        azug azug0 = azuf0.a();
        ContextManagerClientInfo contextManagerClientInfo0 = this.d;
        xsd.b(new xtb(bcwd0, contextManagerClientInfo0, new xrs(contextManagerClientInfo0, bcwa0, pendingIntent0, null), azug0), xro.a("UnregisterContextListener", this.c.a, contextManagerClientInfo0.b));
    }

    @Override  // bcwg
    public final void d(bcwd bcwd0, String s, String s1, String s2, FenceUpdateRequestImpl fenceUpdateRequestImpl0, ApiMetadata apiMetadata0) {
        int v = this.h(s, s1, s2, 1);
        int v1 = 0;
        if(hrgt.a.w().az()) {
            int v2 = 0;
            ArrayList arrayList0 = fenceUpdateRequestImpl0.a;
            int v3 = arrayList0.size();
            int v4 = 0;
            while(v4 < v3) {
                int v5 = ((UpdateFenceOperation)arrayList0.get(v4)).a;
                ++v4;
                if(v5 == 8) {
                    v2 = 1;
                    break;
                }
            }
            if(v2 != 0) {
                v = this.i(s, s1, s2, 0, ggfp.K("com.google.android.apps.wellbeing", "com.google.android.gms"));
            }
            v1 = v2;
        }
        if(!bcwf.j(v)) {
            xsc.f(bcwd0, v);
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.aP);
        azuf0.g(bbdq.I);
        azuf0.d(this.a);
        azuf0.c(this.b);
        azuf0.h(((boolean)(1 ^ v1)));
        azug azug0 = azuf0.a();
        this.c.a(bcwd0, this.d, fenceUpdateRequestImpl0, azug0);
    }

    @Override  // bcwg
    public final void e(bcwd bcwd0, String s, String s1, String s2, InterestUpdateBatchImpl interestUpdateBatchImpl0, ApiMetadata apiMetadata0) {
        int v = this.h(s, s1, s2, 0);
        if(v != 0) {
            xsc.f(bcwd0, v);
            return;
        }
        if(interestUpdateBatchImpl0 == null) {
            xsc.f(bcwd0, 0);
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.aP);
        azuf0.g(bbdq.I);
        azuf0.d(this.a);
        azuf0.c(this.b);
        azug azug0 = azuf0.a();
        ContextManagerClientInfo contextManagerClientInfo0 = this.d;
        xsd.b(new xtf(bcwd0, contextManagerClientInfo0, interestUpdateBatchImpl0, azug0), xro.a("UpdateInterests", this.c.a, contextManagerClientInfo0.b));
    }

    @Override  // bcwg
    public final void f(bcwd bcwd0, String s, String s1, String s2, ContextDataFilterImpl contextDataFilterImpl0, ApiMetadata apiMetadata0) {
        int v = this.h(s, s1, s2, 0);
        if(!bcwf.j(v)) {
            xsc.d(bcwd0, v, null);
            return;
        }
        if(contextDataFilterImpl0 == null) {
            xsc.d(bcwd0, 0, null);
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.aP);
        azuf0.g(bbdq.I);
        azuf0.d(this.a);
        azuf0.c(this.b);
        azug azug0 = azuf0.a();
        ContextManagerClientInfo contextManagerClientInfo0 = this.d;
        xsd.b(new xsw(bcwd0, contextManagerClientInfo0, contextDataFilterImpl0, azug0), xro.a("Read", this.c.a, contextManagerClientInfo0.b));
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bcwd bcwd7;
        bcwd bcwd6;
        bcwd bcwd5;
        bcwd bcwd4;
        bcwd bcwd3;
        bcwd bcwd2;
        bcwd bcwd1;
        bcwd bcwd0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    bcwd1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd1 = (iInterface0 instanceof bcwd) ? ((bcwd)iInterface0) : new bcwb(iBinder0);
                }
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                WriteBatchImpl writeBatchImpl0 = (WriteBatchImpl)wbz.a(parcel0, WriteBatchImpl.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                int v1 = this.h(s, s1, s2, 0);
                if(v1 != 0) {
                    xsc.g(bcwd1, v1, null);
                }
                else if(writeBatchImpl0 == null) {
                    xsc.g(bcwd1, 0, null);
                }
                else {
                    azuf azuf0 = azug.b(apiMetadata0);
                    azuf0.e(bbdp.aP);
                    azuf0.g(bbdq.I);
                    azuf0.d(this.a);
                    azuf0.c(this.b);
                    azug azug0 = azuf0.a();
                    ContextManagerClientInfo contextManagerClientInfo0 = this.d;
                    xsd.b(new xtg(bcwd1, contextManagerClientInfo0, writeBatchImpl0, azug0), xro.a("WriteBatch", this.c.a, contextManagerClientInfo0.b));
                }
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd0 = (iInterface1 instanceof bcwd) ? ((bcwd)iInterface1) : new bcwb(iBinder1);
                }
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                ContextDataFilterImpl contextDataFilterImpl0 = (ContextDataFilterImpl)wbz.a(parcel0, ContextDataFilterImpl.CREATOR);
                RelationFilterImpl relationFilterImpl0 = (RelationFilterImpl)wbz.a(parcel0, RelationFilterImpl.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                this.f(bcwd0, s3, s4, s5, contextDataFilterImpl0, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    bcwd2 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd2 = (iInterface2 instanceof bcwd) ? ((bcwd)iInterface2) : new bcwb(iBinder2);
                }
                String s6 = parcel0.readString();
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                ContextDataFilterImpl contextDataFilterImpl1 = (ContextDataFilterImpl)wbz.a(parcel0, ContextDataFilterImpl.CREATOR);
                RelationFilterImpl relationFilterImpl1 = (RelationFilterImpl)wbz.a(parcel0, RelationFilterImpl.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    bcwd0 = (iInterface3 instanceof bcwa) ? ((bcwa)iInterface3) : new bcvy(iBinder3);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                this.g(bcwd2, s6, s7, s8, contextDataFilterImpl1, ((bcwa)bcwd0), null, apiMetadata2);
                break;
            }
            case 4: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    bcwd3 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd3 = (iInterface4 instanceof bcwd) ? ((bcwd)iInterface4) : new bcwb(iBinder4);
                }
                String s9 = parcel0.readString();
                String s10 = parcel0.readString();
                String s11 = parcel0.readString();
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    bcwd0 = (iInterface5 instanceof bcwa) ? ((bcwa)iInterface5) : new bcvy(iBinder5);
                }
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                this.c(bcwd3, s9, s10, s11, ((bcwa)bcwd0), null, apiMetadata3);
                break;
            }
            case 5: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 == null) {
                    bcwd4 = null;
                }
                else {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd4 = (iInterface6 instanceof bcwd) ? ((bcwd)iInterface6) : new bcwb(iBinder6);
                }
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                String s14 = parcel0.readString();
                ContextDataFilterImpl contextDataFilterImpl2 = (ContextDataFilterImpl)wbz.a(parcel0, ContextDataFilterImpl.CREATOR);
                RelationFilterImpl relationFilterImpl2 = (RelationFilterImpl)wbz.a(parcel0, RelationFilterImpl.CREATOR);
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    bcwd0 = (iInterface7 instanceof bcwa) ? ((bcwa)iInterface7) : new bcvy(iBinder7);
                }
                PendingIntent pendingIntent0 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                this.g(bcwd4, s12, s13, s14, contextDataFilterImpl2, ((bcwa)bcwd0), pendingIntent0, apiMetadata4);
                break;
            }
            case 6: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 == null) {
                    bcwd5 = null;
                }
                else {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd5 = (iInterface8 instanceof bcwd) ? ((bcwd)iInterface8) : new bcwb(iBinder8);
                }
                String s15 = parcel0.readString();
                String s16 = parcel0.readString();
                String s17 = parcel0.readString();
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    bcwd0 = (iInterface9 instanceof bcwa) ? ((bcwa)iInterface9) : new bcvy(iBinder9);
                }
                PendingIntent pendingIntent1 = (PendingIntent)wbz.a(parcel0, PendingIntent.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                this.c(bcwd5, s15, s16, s17, ((bcwa)bcwd0), pendingIntent1, apiMetadata5);
                break;
            }
            case 12: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd0 = (iInterface10 instanceof bcwd) ? ((bcwd)iInterface10) : new bcwb(iBinder10);
                }
                String s18 = parcel0.readString();
                String s19 = parcel0.readString();
                String s20 = parcel0.readString();
                InterestUpdateBatchImpl interestUpdateBatchImpl0 = (InterestUpdateBatchImpl)wbz.a(parcel0, InterestUpdateBatchImpl.CREATOR);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                this.e(bcwd0, s18, s19, s20, interestUpdateBatchImpl0, apiMetadata6);
                break;
            }
            case 13: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd0 = (iInterface11 instanceof bcwd) ? ((bcwd)iInterface11) : new bcwb(iBinder11);
                }
                String s21 = parcel0.readString();
                String s22 = parcel0.readString();
                String s23 = parcel0.readString();
                FenceUpdateRequestImpl fenceUpdateRequestImpl0 = (FenceUpdateRequestImpl)wbz.a(parcel0, FenceUpdateRequestImpl.CREATOR);
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                this.d(bcwd0, s21, s22, s23, fenceUpdateRequestImpl0, apiMetadata7);
                break;
            }
            case 14: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd0 = (iInterface12 instanceof bcwd) ? ((bcwd)iInterface12) : new bcwb(iBinder12);
                }
                String s24 = parcel0.readString();
                String s25 = parcel0.readString();
                String s26 = parcel0.readString();
                ContextDataFilterImpl contextDataFilterImpl3 = (ContextDataFilterImpl)wbz.a(parcel0, ContextDataFilterImpl.CREATOR);
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                this.a(bcwd0, s24, s25, s26, contextDataFilterImpl3, apiMetadata8);
                break;
            }
            case 15: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd0 = (iInterface13 instanceof bcwd) ? ((bcwd)iInterface13) : new bcwb(iBinder13);
                }
                String s27 = parcel0.readString();
                String s28 = parcel0.readString();
                String s29 = parcel0.readString();
                SnapshotRequest snapshotRequest0 = (SnapshotRequest)wbz.a(parcel0, SnapshotRequest.CREATOR);
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                this.b(bcwd0, s27, s28, s29, snapshotRequest0, apiMetadata9);
                break;
            }
            case 16: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 == null) {
                    bcwd6 = null;
                }
                else {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd6 = (iInterface14 instanceof bcwd) ? ((bcwd)iInterface14) : new bcwb(iBinder14);
                }
                String s30 = parcel0.readString();
                String s31 = parcel0.readString();
                String s32 = parcel0.readString();
                FenceQueryRequestImpl fenceQueryRequestImpl0 = (FenceQueryRequestImpl)wbz.a(parcel0, FenceQueryRequestImpl.CREATOR);
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                int v2 = this.h(s30, s31, s32, 1);
                if(v2 == 0) {
                    azuf azuf1 = azug.b(apiMetadata10);
                    azuf1.e(bbdp.aP);
                    azuf1.g(bbdq.I);
                    azuf1.d(this.a);
                    azuf1.c(this.b);
                    azuf1.h(true);
                    azug azug1 = azuf1.a();
                    ContextManagerClientInfo contextManagerClientInfo1 = this.d;
                    xsd.b(new xsv(bcwd6, contextManagerClientInfo1, fenceQueryRequestImpl0, azug1), xro.a("queryFences", this.c.a, contextManagerClientInfo1.b));
                }
                else {
                    xsc.c(bcwd6, v2, null);
                }
                break;
            }
            case 17: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 == null) {
                    bcwd7 = null;
                }
                else {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    bcwd7 = (iInterface15 instanceof bcwd) ? ((bcwd)iInterface15) : new bcwb(iBinder15);
                }
                String s33 = parcel0.readString();
                String s34 = parcel0.readString();
                String s35 = parcel0.readString();
                ContextFenceStub contextFenceStub0 = (ContextFenceStub)wbz.a(parcel0, ContextFenceStub.CREATOR);
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bcwf.gr(parcel0);
                int v3 = this.h(s33, s34, s35, 0);
                if(v3 == 0) {
                    azuf azuf2 = azug.b(apiMetadata11);
                    azuf2.e(bbdp.aP);
                    azuf2.g(bbdq.I);
                    azuf2.d(this.a);
                    azuf2.c(this.b);
                    azug azug2 = azuf2.a();
                    ContextManagerClientInfo contextManagerClientInfo2 = this.d;
                    xsd.b(new xss(bcwd7, contextManagerClientInfo2, contextFenceStub0, azug2), xro.a("evaluateFence", this.c.a, contextManagerClientInfo2.b));
                }
                else {
                    xsc.b(bcwd7, v3, null);
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

    @Override  // bcwg
    public final void g(bcwd bcwd0, String s, String s1, String s2, ContextDataFilterImpl contextDataFilterImpl0, bcwa bcwa0, PendingIntent pendingIntent0, ApiMetadata apiMetadata0) {
        int v = this.h(s, s1, s2, 0);
        if(!bcwf.j(v)) {
            xsc.f(bcwd0, v);
            return;
        }
        if(contextDataFilterImpl0 == null) {
            xsc.f(bcwd0, 0);
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.aP);
        azuf0.g(bbdq.I);
        azuf0.d(this.a);
        azuf0.c(this.b);
        azug azug0 = azuf0.a();
        ContextManagerClientInfo contextManagerClientInfo0 = this.d;
        xsd.b(new xta(bcwd0, contextManagerClientInfo0, new xrs(contextManagerClientInfo0, bcwa0, pendingIntent0, contextDataFilterImpl0), azug0), xro.a("RegisterContextListener", this.c.a, contextManagerClientInfo0.b));
    }

    private final int h(String s, String s1, String s2, int v) {
        return this.i(s, s1, s2, v, null);
    }

    private final int i(String s, String s1, String s2, int v, ggfp ggfp0) {
        String s5;
        String s4;
        String s3;
        if(this.d == null) {
            azql.c(xxe.e()).d(s);
            s3 = s;
            s4 = s1;
            s5 = s2;
            this.d = new ContextManagerClientInfo(s4, s3, Binder.getCallingUid(), s5, 0, 1, Binder.getCallingPid());
        }
        else {
            s3 = s;
            s4 = s1;
            s5 = s2;
        }
        if(TextUtils.isEmpty(s4)) {
            return 7504;
        }
        if(TextUtils.isEmpty(s5)) {
            return 7500;
        }
        if(!TextUtils.equals(s4, this.d.a)) {
            return 7510;
        }
        if(!TextUtils.equals(s5, this.d.d)) {
            return 7511;
        }
        if(v == 0 && this.d.e()) {
            return 7512;
        }
        if(Binder.getCallingUid() != this.d.c) {
            return 7513;
        }
        if(ggfp0 != null && !ggfp0.contains(s3)) {
            xti.d("ContextManagerServiceImpl", "packageName: %s not allowed", s3);
            return 7512;
        }
        return 0;
    }

    private static boolean j(int v) {
        return v == 0;
    }
}

