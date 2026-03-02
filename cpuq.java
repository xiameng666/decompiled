import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

public final class cpuq extends wby implements cjug, cpur {
    private final Context a;
    private final String b;
    private final String c;
    private final fjtv d;
    private final cpwx e;
    private final cpws f;
    private final fkbg g;
    private final cjts h;
    private final int i;
    private final fgvt j;
    private final int k;

    public cpuq() {
        super("com.google.android.gms.mdd.IMobileDataDownloadService");
    }

    public cpuq(Context context0, fjtv fjtv0, cpwx cpwx0, cpws cpws0, fkbg fkbg0, cjts cjts0, int v, int v1, fgvt fgvt0, String s, String s1) {
        super("com.google.android.gms.mdd.IMobileDataDownloadService");
        this.b = s;
        this.c = s1;
        this.a = context0;
        this.d = fjtv0;
        this.e = cpwx0;
        this.f = cpws0;
        this.g = fkbg0;
        this.h = cjts0;
        this.i = v;
        this.k = v1;
        this.j = fgvt0;
    }

    @Override  // cpur
    public final void a(azxs azxs0, FileGroupRequest fileGroupRequest0, ApiMetadata apiMetadata0) {
        boolean z;
        ccmq.a().a(bbdg.wK);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cM);
        azuf0.g(bbdq.au);
        String s = this.b;
        azuf0.d(s);
        azuf0.c(this.c);
        int v = this.k;
        switch(v) {
            case 0: {
                throw null;
            }
            case 3: {
                z = true;
                break;
            }
            default: {
                z = false;
            }
        }
        azuf0.h(z);
        azug azug0 = azuf0.a();
        cpyh cpyh0 = new cpyh(this.d, fileGroupRequest0, s, this.i, v, this.g, azxs0, true, azug0);
        this.h.b(cpyh0);
    }

    @Override  // cpur
    public final void b(azxs azxs0, ApiMetadata apiMetadata0) {
        boolean z = true;
        int v = this.k;
        switch(v) {
            case 0: {
                throw null;
            }
            case 1: {
                break;
            }
            default: {
                if(!azqk.e(this.a)) {
                    throw new SecurityException("Access denied");
                }
            }
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cM);
        azuf0.g(bbdq.au);
        azuf0.d(this.b);
        azuf0.c(this.c);
        if(v != 3) {
            z = false;
        }
        azuf0.h(z);
        azug azug0 = azuf0.a();
        cpxe cpxe0 = new cpxe(this.e, azxs0, azug0);
        this.h.b(cpxe0);
    }

    @Override  // cpur
    public final void c(azxs azxs0, ApiMetadata apiMetadata0) {
        boolean z = true;
        int v = this.k;
        switch(v) {
            case 0: {
                throw null;
            }
            case 1: {
                break;
            }
            default: {
                if(!azqk.e(this.a)) {
                    throw new SecurityException("Access denied");
                }
            }
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cM);
        azuf0.g(bbdq.au);
        azuf0.d(this.b);
        azuf0.c(this.c);
        if(v != 3) {
            z = false;
        }
        azuf0.h(z);
        azug azug0 = azuf0.a();
        cpxu cpxu0 = new cpxu(this.d, this.f, azxs0, azug0);
        this.h.b(cpxu0);
    }

    @Override  // cpur
    public final void d(azxs azxs0, FileGroupRequest fileGroupRequest0, ApiMetadata apiMetadata0) {
        boolean z;
        ccmq.a().a(bbdg.wL);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cM);
        azuf0.g(bbdq.au);
        String s = this.b;
        azuf0.d(s);
        azuf0.c(this.c);
        int v = this.k;
        switch(v) {
            case 0: {
                throw null;
            }
            case 3: {
                z = true;
                break;
            }
            default: {
                z = false;
            }
        }
        azuf0.h(z);
        azug azug0 = azuf0.a();
        cpyh cpyh0 = new cpyh(this.d, fileGroupRequest0, s, this.i, v, this.g, azxs0, false, azug0);
        this.h.b(cpyh0);
    }

    @Override  // cpur
    public final void e(boolean z, azxs azxs0, ApiMetadata apiMetadata0) {
        boolean z1 = true;
        int v = this.k;
        switch(v) {
            case 0: {
                throw null;
            }
            case 1: {
                break;
            }
            default: {
                if(!azqk.e(this.a)) {
                    throw new SecurityException("Access denied");
                }
            }
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cM);
        azuf0.g(bbdq.au);
        azuf0.d(this.b);
        azuf0.c(this.c);
        if(v != 3) {
            z1 = false;
        }
        azuf0.h(z1);
        azug azug0 = azuf0.a();
        cpxl cpxl0 = new cpxl(this.d, z, this.g, azxs0, azug0);
        this.h.b(cpxl0);
    }

    @Override  // cpur
    public final void f(cpul cpul0, FileGroupRequest fileGroupRequest0, ApiMetadata apiMetadata0) {
        boolean z;
        ccmq.a().a(bbdg.wJ);
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cM);
        azuf0.g(bbdq.au);
        String s = this.b;
        azuf0.d(s);
        azuf0.c(this.c);
        int v = this.k;
        switch(v) {
            case 0: {
                throw null;
            }
            case 3: {
                z = true;
                break;
            }
            default: {
                z = false;
            }
        }
        azuf0.h(z);
        azug azug0 = azuf0.a();
        cpyc cpyc0 = new cpyc(this.d, this.f, fileGroupRequest0, s, this.i, v, this.g, cpul0, azug0);
        this.h.b(cpyc0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs1;
        azxs azxs0;
        boolean z = false;
        cpul cpul0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.mdd.IMddFileGroupCallback");
                    cpul0 = (iInterface0 instanceof cpul) ? ((cpul)iInterface0) : new cpuj(iBinder0);
                }
                FileGroupRequest fileGroupRequest0 = (FileGroupRequest)wbz.a(parcel0, FileGroupRequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                this.f(cpul0, fileGroupRequest0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    cpul0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                this.b(((azxs)cpul0), apiMetadata1);
                break;
            }
            case 3: {
                boolean z1 = wbz.i(parcel0);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    cpul0 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                this.e(z1, ((azxs)cpul0), apiMetadata2);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    cpul0 = (iInterface3 instanceof azxs) ? ((azxs)iInterface3) : new azxq(iBinder3);
                }
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                this.i(((azxs)cpul0), apiMetadata3);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    azxs0 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface4 instanceof azxs) ? ((azxs)iInterface4) : new azxq(iBinder4);
                }
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                if(!azqk.e(this.a)) {
                    throw new SecurityException("Access denied");
                }
                azuf azuf0 = azug.b(apiMetadata4);
                azuf0.f(azud.a);
                azuf0.e(bbdp.cM);
                azuf0.g(bbdq.au);
                azuf0.d(this.b);
                azuf0.c(this.c);
                int v1 = this.k;
                if(v1 == 3) {
                    z = true;
                }
                if(v1 == 0) {
                    throw null;
                }
                azuf0.h(z);
                azug azug0 = azuf0.a();
                cpxu cpxu0 = new cpxu(this.d, this.f, azxs0, azug0);
                this.h.b(cpxu0);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 == null) {
                    azxs1 = null;
                }
                else {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs azxs2 = (iInterface5 instanceof azxs) ? ((azxs)iInterface5) : new azxq(iBinder5);
                    azxs1 = azxs2;
                }
                OverrideFileGroupRequest overrideFileGroupRequest0 = (OverrideFileGroupRequest)wbz.a(parcel0, OverrideFileGroupRequest.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                if(azqk.e(this.a)) {
                    azuf azuf1 = azug.b(apiMetadata5);
                    azuf1.f(azud.a);
                    azuf1.e(bbdp.cM);
                    azuf1.g(bbdq.au);
                    azuf1.d(this.b);
                    azuf1.c(this.c);
                    int v2 = this.k;
                    if(v2 == 3) {
                        z = true;
                    }
                    if(v2 == 0) {
                        throw null;
                    }
                    azuf1.h(z);
                    azug azug1 = azuf1.a();
                    batl.s(this.f);
                    cpxg cpxg0 = new cpxg(this.d, this.f, overrideFileGroupRequest0, azxs1, azug1);
                    this.h.b(cpxg0);
                    break;
                }
                fkbp.c("%s : Cannot call Diagnostics API on a non-debug build", "Service");
                throw new SecurityException("Access denied");
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    cpul0 = (iInterface6 instanceof azxs) ? ((azxs)iInterface6) : new azxq(iBinder6);
                }
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                this.c(((azxs)cpul0), apiMetadata6);
                break;
            }
            case 8: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    cpul0 = (iInterface7 instanceof azxs) ? ((azxs)iInterface7) : new azxq(iBinder7);
                }
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                this.h(((azxs)cpul0), apiMetadata7);
                break;
            }
            case 9: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    cpul0 = (iInterface8 instanceof azxs) ? ((azxs)iInterface8) : new azxq(iBinder8);
                }
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                this.j(((azxs)cpul0), apiMetadata8);
                break;
            }
            case 10: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
                    cpul0 = (iInterface9 instanceof cpuo) ? ((cpuo)iInterface9) : new cpum(iBinder9);
                }
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                this.g(((cpuo)cpul0), apiMetadata9);
                break;
            }
            case 11: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.mdd.IMddFileGroupCallback");
                    if((iInterface10 instanceof cpul)) {
                        cpul cpul1 = (cpul)iInterface10;
                    }
                }
                FileGroupRequest fileGroupRequest1 = (FileGroupRequest)wbz.a(parcel0, FileGroupRequest.CREATOR);
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                break;
            }
            case 12: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    cpul0 = (iInterface11 instanceof azxs) ? ((azxs)iInterface11) : new azxq(iBinder11);
                }
                FileGroupRequest fileGroupRequest2 = (FileGroupRequest)wbz.a(parcel0, FileGroupRequest.CREATOR);
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                this.a(((azxs)cpul0), fileGroupRequest2, apiMetadata11);
                break;
            }
            case 13: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    cpul0 = (iInterface12 instanceof azxs) ? ((azxs)iInterface12) : new azxq(iBinder12);
                }
                FileGroupRequest fileGroupRequest3 = (FileGroupRequest)wbz.a(parcel0, FileGroupRequest.CREATOR);
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cpuq.gr(parcel0);
                this.d(((azxs)cpul0), fileGroupRequest3, apiMetadata12);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // cpur
    public final void g(cpuo cpuo0, ApiMetadata apiMetadata0) {
        boolean z = true;
        int v = this.k;
        switch(v) {
            case 0: {
                throw null;
            }
            case 1: {
                break;
            }
            default: {
                if(!azqk.e(this.a)) {
                    throw new SecurityException("Access denied");
                }
            }
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cM);
        azuf0.g(bbdq.au);
        azuf0.d(this.b);
        azuf0.c(this.c);
        if(v != 3) {
            z = false;
        }
        azuf0.h(z);
        azug azug0 = azuf0.a();
        cpxo cpxo0 = new cpxo(this.d, cpuo0, azug0);
        this.h.b(cpxo0);
    }

    @Override  // cpur
    public final void h(azxs azxs0, ApiMetadata apiMetadata0) {
        boolean z = true;
        int v = this.k;
        switch(v) {
            case 0: {
                throw null;
            }
            case 1: {
                break;
            }
            default: {
                if(!azqk.e(this.a)) {
                    throw new SecurityException("Access denied");
                }
            }
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cM);
        azuf0.g(bbdq.au);
        azuf0.d(this.b);
        azuf0.c(this.c);
        if(v != 3) {
            z = false;
        }
        azuf0.h(z);
        azug azug0 = azuf0.a();
        cpxs cpxs0 = new cpxs(this.d, this.e, azxs0, azug0);
        this.h.b(cpxs0);
    }

    @Override  // cpur
    public final void i(azxs azxs0, ApiMetadata apiMetadata0) {
        boolean z = true;
        int v = this.k;
        switch(v) {
            case 0: {
                throw null;
            }
            case 1: {
                break;
            }
            default: {
                if(!azqk.e(this.a)) {
                    throw new SecurityException("Access denied");
                }
            }
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cM);
        azuf0.g(bbdq.au);
        azuf0.d(this.b);
        azuf0.c(this.c);
        if(v != 3) {
            z = false;
        }
        azuf0.h(z);
        azug azug0 = azuf0.a();
        cpye cpye0 = new cpye(this.d, azxs0, azug0);
        this.h.b(cpye0);
    }

    @Override  // cpur
    public final void j(azxs azxs0, ApiMetadata apiMetadata0) {
        boolean z = true;
        int v = this.k;
        switch(v) {
            case 0: {
                throw null;
            }
            case 1: {
                break;
            }
            default: {
                if(!azqk.e(this.a)) {
                    throw new SecurityException("Access denied");
                }
            }
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.cM);
        azuf0.g(bbdq.au);
        azuf0.d(this.b);
        azuf0.c(this.c);
        if(v != 3) {
            z = false;
        }
        azuf0.h(z);
        azug azug0 = azuf0.a();
        cpxw cpxw0 = new cpxw(this.d, azxs0, azug0);
        this.h.b(cpxw0);
    }
}

