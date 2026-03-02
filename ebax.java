import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ebax extends ebav {
    public dlod a;
    public dlob b;
    private final byte[] c;
    private final donp d;
    private final bboh e;

    public ebax(byte[] arr_b, String s, donp donp0, azug azug0) {
        ibuq.f(arr_b, "requestBytes");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        super("PerformBackupRestoreOperation", s, azug0);
        this.c = arr_b;
        this.d = donp0;
        this.e = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // ebaw
    public final void b(Context context0) {
        int v1;
        fsxc fsxc1;
        int v;
        ibuq.f(context0, "context");
        hwhl hwhl0 = hwhl.a;
        if(!hwhl0.b().a()) {
            ((ggtj)this.e.j()).x("PerformBackupRestoreOperation API is disabled");
            byte[] arr_b = dlnz.a(fswz.e).toBytesArray();
            this.d.b(Status.b, arr_b);
            return;
        }
        Parser hfvs0 = (Parser)((ProtoLiteMessage)fsxb.a).jf(7, null);
        fsxb fsxb0 = (fsxb)edoy.a(this.c, hfvs0);
        gfsx gfsx0 = dlmj.a(context0);
        if(!gfsx0.i()) {
            ibuq.c(fsxb0);
            dmgi dmgi0 = dmgi.a();
            if(hwhl0.b().e()) {
                fsxc fsxc0 = fsxd.a(((ProtoLiteMessage)fsxc.a).v_newBuilder()).a();
                ibuq.f(fsxb0, "request");
                ibuq.f(fsxc0, "response");
                ProtoLiteBuilder hftp0 = dloa.a(fsxb0, fsxc0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hage)hftp0.b_message).d = 3;
                hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                hafk0.b(((hage)hftv0));
                dmgi0.b(hafk0.a());
                byte[] arr_b1 = fsxc0.toBytesArray();
                this.d.b(Status.b, arr_b1);
                return;
            }
            ibuq.f(fsxb0, "request");
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hage.a).v_newBuilder();
            if(fsxb0.b == 1) {
                haed haed0 = haec.a(((ProtoLiteMessage)hafw.a).v_newBuilder());
                haed0.b(0L);
                hafw hafw0 = haed0.a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hage hage0 = (hage)hftp1.b_message;
                hafw0.getClass();
                hage0.c = hafw0;
                hage0.b = 1;
            }
            if(fsxb0.b == 2) {
                haef haef0 = haee.a(((ProtoLiteMessage)hafx.a).v_newBuilder());
                haef0.b(((long)(fsxb0.b == 2 ? ((fszp)fsxb0.c) : fszp.a).c.size()));
                hafx hafx0 = haef0.a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hage hage1 = (hage)hftp1.b_message;
                hafx0.getClass();
                hage1.c = hafx0;
                hage1.b = 2;
            }
            if(fsxb0.b == 3) {
                haeh haeh0 = haeg.a(((ProtoLiteMessage)hafy.a).v_newBuilder());
                haeh0.b(((long)(fsxb0.b == 3 ? ((fszt)fsxb0.c) : fszt.a).b.size()));
                hafy hafy0 = haeh0.a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hage hage2 = (hage)hftp1.b_message;
                hafy0.getClass();
                hage2.c = hafy0;
                hage2.b = 6;
            }
            if(fsxb0.b == 4) {
                haej haej0 = haei.a(((ProtoLiteMessage)hafz.a).v_newBuilder());
                haej0.b(((long)(fsxb0.b == 4 ? ((fszv)fsxb0.c) : fszv.a).b.size()));
                hafz hafz0 = haej0.a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hage hage3 = (hage)hftp1.b_message;
                hafz0.getClass();
                hage3.c = hafz0;
                hage3.b = 7;
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((hage)hftv1).e = 7;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hage)hftp1.b_message).d = 2;
            ibuq.e(hftp1, "apply(...)");
            hafk hafk1 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
            ProtoLiteMessage hftv2 = hftp1.N_build();
            ibuq.e(hftv2, "build(...)");
            hafk1.b(((hage)hftv2));
            dmgi0.b(hafk1.a());
            ((ggtj)this.e.i()).x("Could not find active tapandpay account");
            this.d.b(eccq.a, null);
            return;
        }
        AccountInfo accountInfo0 = (AccountInfo)gfsx0.d();
        domw domw0 = this.i;
        dmgr dmgr0 = new dmgr(this.j);
        Context context1 = AppContextProvider.a();
        ibuq.e(context1, "getApplicationContext(...)");
        ibuq.e(accountInfo0.b, "getAccountName(...)");
        ibuq.e(accountInfo0.a, "getAccountId(...)");
        dola dola0 = dlmg.a(context1, accountInfo0.b, accountInfo0.a);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new eaxt(dola0, dmgr0, domw0, domv0, new edop()).inject(this);
        ibuq.c(fsxb0);
        switch(fsxb0.b) {
            case 0: {
                v = 5;
                break;
            }
            case 1: {
                v = 1;
                break;
            }
            case 2: {
                v = 2;
                break;
            }
            case 3: {
                v = 3;
                break;
            }
            case 4: {
                v = 4;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v == 0) {
            throw null;
        }
        if(v - 1 == 0) {
            dlod dlod3 = this.c();
            fszn fszn0 = fsxb0.b == 1 ? ((fszn)fsxb0.c) : fszn.a;
            ibuq.e(fszn0, "getD2DIndex(...)");
            ibuq.f(fszn0, "request");
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(dlod3.a(ascs.b).a());
            arrayList4.addAll(dlod3.a(ascs.c).a());
            fsxe fsxe2 = fsxd.a(((ProtoLiteMessage)fsxc.a).v_newBuilder());
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fszo.a).v_newBuilder();
            ibuq.f(hftp2, "builder");
            List list0 = DesugarCollections.unmodifiableList(((fszo)hftp2.b_message).b);
            ibuq.e(list0, "getItemsList(...)");
            new hfxu(list0);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            fszo fszo0 = (fszo)hftp2.b_message;
            hfuo hfuo3 = fszo0.b;
            if(!hfuo3.c()) {
                fszo0.b = ProtoLiteMessage.E(hfuo3);
            }
            hfrj.E(arrayList4, fszo0.b);
            ProtoLiteMessage hftv3 = hftp2.N_build();
            ibuq.e(hftv3, "build(...)");
            ibuq.f(((fszo)hftv3), "value");
            ProtoLiteBuilder hftp3 = fsxe2.a;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            fsxc fsxc2 = (fsxc)hftp3.b_message;
            ((fszo)hftv3).getClass();
            fsxc2.c = (fszo)hftv3;
            fsxc2.b = 2;
            fsxc1 = fsxe2.a();
        }
        else {
            switch(v - 1) {
                case 1: {
                    dlod dlod0 = this.c();
                    fszp fszp0 = fsxb0.b == 2 ? ((fszp)fsxb0.c) : fszp.a;
                    ibuq.e(fszp0, "getD2DRestore(...)");
                    ibuq.f(fszp0, "request");
                    if(fszp0.b == 0L) {
                        ((ggtj)dlod.a.i()).x("Request is missing target Android ID");
                        fsxc1 = dlnz.a(fswz.f);
                    }
                    else if(fszp0.c.size() == 0) {
                        fsxe fsxe0 = fsxd.a(((ProtoLiteMessage)fsxc.a).v_newBuilder());
                        fsxe0.b(fszr.a(((ProtoLiteMessage)fszq.a).v_newBuilder()).a());
                        fsxc1 = fsxe0.a();
                    }
                    else if(dlod0.b.a()) {
                        ArrayList arrayList0 = new ArrayList();
                        for(Iterator iterator0 = ibqg.c(new ascs[]{ascs.b, ascs.c}).iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                            Object object0 = iterator0.next();
                            ascs ascs0 = (ascs)object0;
                            hfuo hfuo0 = fszp0.c;
                            ibuq.e(hfuo0, "getItemsList(...)");
                            ArrayList arrayList1 = new ArrayList();
                            for(Object object1: hfuo0) {
                                asby asby0 = (asby)object1;
                                ascx ascx0 = asby0.c == 106 ? ((ascx)asby0.d) : ascx.a;
                                if((ascs.b(ascx0.e) == null ? ascs.a : ascs.b(ascx0.e)) == ascs0) {
                                    arrayList1.add(object1);
                                }
                                iterator0 = iterator0;
                            }
                            if(!arrayList1.isEmpty()) {
                                arrayList0.addAll(dlod0.a(ascs0).b(fszp0.b, arrayList1));
                            }
                        }
                        if(arrayList0.isEmpty()) {
                            fsxe fsxe1 = fsxd.a(((ProtoLiteMessage)fsxc.a).v_newBuilder());
                            fsxe1.b(fszr.a(((ProtoLiteMessage)fszq.a).v_newBuilder()).a());
                            fsxc1 = fsxe1.a();
                        }
                        else {
                            fsxc1 = dlnz.a(((fswz)ibpo.R(arrayList0)));
                        }
                    }
                    else {
                        ((ggtj)dlod.a.i()).x("Not connected to the internet. Connection is required for D2D");
                        fsxc1 = dlnz.a(fswz.g);
                    }
                    break;
                }
                case 2: {
                    dlod dlod1 = this.c();
                    fszt fszt0 = fsxb0.b == 3 ? ((fszt)fsxb0.c) : fszt.a;
                    ibuq.e(fszt0, "getD2DTransferFinished(...)");
                    ibuq.f(fszt0, "request");
                    if(hwhl0.b().b()) {
                        if(fszt0.b.size() != 0) {
                            for(Object object2: ibqg.c(new ascs[]{ascs.b, ascs.c})) {
                                ascs ascs1 = (ascs)object2;
                                hfuo hfuo1 = fszt0.b;
                                ibuq.e(hfuo1, "getItemsList(...)");
                                ArrayList arrayList2 = new ArrayList();
                                for(Object object3: hfuo1) {
                                    asby asby1 = (asby)object3;
                                    ascx ascx1 = asby1.c == 106 ? ((ascx)asby1.d) : ascx.a;
                                    if((ascs.b(ascx1.e) == null ? ascs.a : ascs.b(ascx1.e)) == ascs1) {
                                        arrayList2.add(object3);
                                    }
                                }
                                if(!arrayList2.isEmpty()) {
                                    dlod1.a(ascs1).c(arrayList2);
                                }
                            }
                        }
                        fsxc1 = dloc.a();
                    }
                    else {
                        ((ggtj)dlod.a.i()).x("D2dTransferFinishedRequest feature is not yet enabled.");
                        fsxc1 = dlnz.a(fswz.e);
                    }
                    break;
                }
                case 3: {
                    dlod dlod2 = this.c();
                    fszv fszv0 = fsxb0.b == 4 ? ((fszv)fsxb0.c) : fszv.a;
                    ibuq.e(fszv0, "getD2DTransferStarted(...)");
                    ibuq.f(fszv0, "request");
                    if(fszv0.b.size() != 0) {
                        for(Object object4: ibqg.c(new ascs[]{ascs.b, ascs.c})) {
                            ascs ascs2 = (ascs)object4;
                            hfuo hfuo2 = fszv0.b;
                            ibuq.e(hfuo2, "getItemsList(...)");
                            ArrayList arrayList3 = new ArrayList();
                            for(Object object5: hfuo2) {
                                asby asby2 = (asby)object5;
                                ascx ascx2 = asby2.c == 106 ? ((ascx)asby2.d) : ascx.a;
                                if((ascs.b(ascx2.e) == null ? ascs.a : ascs.b(ascx2.e)) == ascs2) {
                                    arrayList3.add(object5);
                                }
                            }
                            if(!arrayList3.isEmpty()) {
                                dlod2.a(ascs2).d(arrayList3);
                            }
                        }
                    }
                    fsxc1 = dloc.b();
                    break;
                }
                case 4: {
                    fsxc1 = dlnz.a(fswz.f);
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        dlob dlob0 = this.b;
        if(dlob0 == null) {
            ibuq.j("backupRestoreLogger");
            dlob0 = null;
        }
        ibuq.f(fsxb0, "request");
        ibuq.f(fsxc1, "response");
        ProtoLiteBuilder hftp4 = dloa.a(fsxb0, fsxc1);
        if(fsxc1.b == 1) {
            fsxa fsxa0 = (fsxa)fsxc1.c;
            ibuq.e(fsxa0, "getError(...)");
            switch((fswz.b(fsxa0.b) == null ? fswz.j : fswz.b(fsxa0.b)).ordinal()) {
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                case 3: {
                    v1 = 5;
                    break;
                }
                case 4: {
                    v1 = 6;
                    break;
                }
                case 5: {
                    v1 = 7;
                    break;
                }
                case 6: {
                    v1 = 8;
                    break;
                }
                case 7: {
                    v1 = 12;
                    break;
                }
                case 8: {
                    v1 = 13;
                    break;
                }
                default: {
                    v1 = 2;
                }
            }
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ((hage)hftp4.b_message).e = v1 - 2;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ((hage)hftp4.b_message).d = 2;
        }
        else {
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ((hage)hftp4.b_message).d = 1;
        }
        hafk hafk2 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        ProtoLiteMessage hftv4 = hftp4.N_build();
        ibuq.e(hftv4, "build(...)");
        hafk2.b(((hage)hftv4));
        hapr hapr0 = hafk2.a();
        dlob0.a.b(hapr0);
        byte[] arr_b2 = fsxc1.toBytesArray();
        this.d.b(Status.b, arr_b2);
    }

    public final dlod c() {
        dlod dlod0 = this.a;
        if(dlod0 != null) {
            return dlod0;
        }
        ibuq.j("d2dHandler");
        return null;
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.b(status0, null);
    }
}

