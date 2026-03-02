import android.accounts.Account;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import dagger.internal.InstanceFactory;
import j..util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class dcrd {
    public final cumy a;
    public final icig b;
    public ichm c;
    private dcst d;
    private final dcrp e;
    private final dctc f;
    private final icta g;

    public dcrd(dcrp dcrp0, dctc dctc0) {
        ibuq.f(dcrp0, "cloudSharingSessionManagerFactory");
        ibuq.f(dctc0, "rpcClientFactory");
        super();
        this.e = dcrp0;
        this.f = dctc0;
        this.a = new cumy(((int)hvqs.Q()));
        this.g = new icta();
        this.b = new icib(new dcqv(this, null));
    }

    public final dcrn a(dcst dcst0) {
        cumy cumy0 = this.a;
        if(!cumy0.k(dcst0)) {
            dcvz.a.e().p("No corresponding active cloud sharing session found.", new Object[0]);
            return null;
        }
        return (dcrn)cumy0.a(dcst0);
    }

    public final Object b(ibrl ibrl0) {
        icta icta1;
        dcrb dcrb0;
        if((ibrl0 instanceof dcrb)) {
            dcrb0 = (dcrb)ibrl0;
            int v = dcrb0.d;
            if((v & 0x80000000) == 0) {
                dcrb0 = new dcrb(this, ibrl0);
            }
            else {
                dcrb0.d = v - 0x80000000;
            }
        }
        else {
            dcrb0 = new dcrb(this, ibrl0);
        }
        Object object0 = dcrb0.b;
        Object object1 = ibrx.a;
        switch(dcrb0.d) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.g;
                dcrb0.e = icta0;
                dcrb0.d = 1;
                if(icta0.b(dcrb0) != object1) {
                    icta1 = icta0;
                    goto label_23;
                }
                return object1;
            }
            case 1: {
                icta1 = dcrb0.e;
                ibnx.b(object0);
                try {
                label_23:
                    this.d = null;
                    Collection collection0 = this.a.e();
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object2: collection0) {
                        if(((dcrq)((dcrn)object2).c.b()).c) {
                            arrayList0.add(object2);
                        }
                    }
                    Object object3 = arrayList0.iterator();
                    goto label_37;
                label_34:
                    object3 = dcrb0.a;
                    icta1 = dcrb0.e;
                    ibnx.b(object0);
                    while(true) {
                    label_37:
                        if(!((Iterator)object3).hasNext()) {
                            goto label_49;
                        }
                        Object object4 = ((Iterator)object3).next();
                        dcrb0.e = icta1;
                        dcrb0.a = object3;
                        dcrb0.d = 2;
                        if(((dcrn)object4).c(dcrb0) == object1) {
                            return object1;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                goto label_34;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta1.d();
        throw throwable0;
    label_49:
        icta1.d();
        return ibom.a;
    }

    public final Object c(byte[] arr_b, List list0, Account account0, String s, ibrl ibrl0) {
        Object object10;
        byte[] arr_b7;
        Object object9;
        Object object8;
        icta icta2;
        dcst dcst1;
        gzbx gzbx1;
        Charset charset1;
        ProtoLiteBuilder hftp5;
        byte[] arr_b1;
        String s1;
        Object object4;
        Object object3;
        icta icta0;
        Object object1;
        dcrc dcrc0;
        if((ibrl0 instanceof dcrc)) {
            dcrc0 = (dcrc)ibrl0;
            int v = dcrc0.g;
            if((v & 0x80000000) == 0) {
                dcrc0 = new dcrc(this, ibrl0);
            }
            else {
                dcrc0.g = v - 0x80000000;
            }
        }
        else {
            dcrc0 = new dcrc(this, ibrl0);
        }
        Object object0 = dcrc0.e;
        ibrx ibrx0 = ibrx.a;
        switch(dcrc0.g) {
            case 0: {
                ibnx.b(object0);
                if(list0.size() > 1000) {
                    object1 = dctf.h;
                }
                else {
                    long v1 = 0L;
                    for(Object object2: list0) {
                        v1 += ((dcsk)object2).a();
                    }
                    object1 = v1 > 10000000000L ? dctf.i : null;
                }
                if(object1 != null) {
                    return object1;
                }
                icta0 = this.g;
                dcrc0.h = arr_b;
                object3 = list0;
                dcrc0.a = object3;
                object4 = account0;
                dcrc0.b = object4;
                s1 = s;
                dcrc0.c = s1;
                dcrc0.d = icta0;
                dcrc0.g = 1;
                if(icta0.b(dcrc0) == ibrx0) {
                    return ibrx0;
                }
                arr_b1 = arr_b;
                goto label_52;
            }
            case 1: {
                icta icta1 = (icta)dcrc0.d;
                String s2 = (String)dcrc0.c;
                object4 = dcrc0.b;
                Object object5 = dcrc0.a;
                arr_b1 = dcrc0.h;
                ibnx.b(object0);
                s1 = s2;
                object3 = object5;
                icta0 = icta1;
                try {
                label_52:
                    dcst dcst0 = dcss.a(arr_b1);
                    if(ibuq.m(this.d, dcst0)) {
                        dcvz.a.a().p("Cloud sharing session already created and active.", new Object[0]);
                        object10 = dctf.a;
                    }
                    else if(this.d == null) {
                        dcta dcta0 = this.f.a(((Account)object4));
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzbx.a).v_newBuilder();
                        ibuq.f(hftp0, "builder");
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzbt.a).v_newBuilder();
                        ibuq.f(hftp1, "builder");
                        String s3 = dcss.a(arr_b1).a;
                        ibuq.f(s3, "value");
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gzbt gzbt0 = (gzbt)hftp1.b_message;
                        s3.getClass();
                        gzbt0.b = s3;
                        dcsr dcsr0 = new dcsr(arr_b1);
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gzbw.a).v_newBuilder();
                        ibuq.f(hftp2, "builder");
                        ibuq.f(s1, "value");
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gzbw gzbw0 = (gzbw)hftp2.b_message;
                        s1.getClass();
                        gzbw0.b = s1;
                        ProtoLiteMessage hftv0 = hftp2.N_build();
                        ibuq.e(hftv0, "build(...)");
                        ibuq.f(((gzbw)hftv0), "metadata");
                        gmno gmno0 = (gmno)dcsr0.d.a();
                        byte[] arr_b2 = ((gzbw)hftv0).toBytesArray();
                        String s4 = dcss.a(dcsr0.a).a;
                        try {
                            Charset charset0 = ibyo.a;
                            byte[] arr_b3 = s4.getBytes(charset0);
                            ibuq.e(arr_b3, "getBytes(...)");
                            ByteString hfsf0 = hfxt.a(dcsq.b(gmno0, arr_b2, arr_b3));
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((gzbt)hftp1.b_message).e = hfsf0;
                            Iterator iterator1 = ((List)object3).iterator();
                            while(iterator1.hasNext()) {
                                Object object6 = iterator1.next();
                                List list1 = DesugarCollections.unmodifiableList(((gzbt)hftp1.b_message).c);
                                ibuq.e(list1, "getFileList(...)");
                                new hfxu(list1);
                                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gzbp.a).v_newBuilder();
                                ibuq.f(hftp3, "builder");
                                String s5 = ((dcsk)object6).a.a();
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                ((gzbp)hftp3.b_message).b = s5;
                                long v2 = ((dcsk)object6).a();
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                ((gzbp)hftp3.b_message).d = v2;
                                String s6 = ((gzbp)hftp3.b_message).b;
                                ibuq.e(s6, "getId(...)");
                                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gzbu.a).v_newBuilder();
                                ibuq.f(hftp4, "builder");
                                Attachment attachment0 = ((dcsk)object6).b;
                                if((attachment0 instanceof FileAttachment)) {
                                    ibuq.f(((FileAttachment)attachment0), "<this>");
                                    dbyt dbyt0 = dbys.a(((ProtoLiteMessage)dcje.a).v_newBuilder());
                                    hftp5 = hftp1;
                                    charset1 = charset0;
                                    dbyt0.c(((FileAttachment)attachment0).g);
                                    ibuq.e(((FileAttachment)attachment0).a, "getFileName(...)");
                                    dbyt0.f(((FileAttachment)attachment0).a);
                                    dbyt0.i(dcuz.a(((FileAttachment)attachment0).b));
                                    dbyt0.h(((FileAttachment)attachment0).c);
                                    ibuq.e(((FileAttachment)attachment0).f, "getMimeType(...)");
                                    dbyt0.e(((FileAttachment)attachment0).f);
                                    String s7 = ((FileAttachment)attachment0).h;
                                    if(s7 != null) {
                                        dbyt0.g(s7);
                                    }
                                    dbyt0.b(((FileAttachment)attachment0).j);
                                    dbyt0.d(((FileAttachment)attachment0).k);
                                    dcje dcje0 = dbyt0.a();
                                    ibuq.f(dcje0, "value");
                                    if(!hftp4.b_message.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    gzbu gzbu0 = (gzbu)hftp4.b_message;
                                    dcje0.getClass();
                                    gzbu0.c = dcje0;
                                    gzbu0.b = 1;
                                }
                                else {
                                    hftp5 = hftp1;
                                    charset1 = charset0;
                                    if((attachment0 instanceof TextAttachment)) {
                                        ibuq.f(((TextAttachment)attachment0), "<this>");
                                        dcnm dcnm0 = dcnl.a(((ProtoLiteMessage)dcjv.a).v_newBuilder());
                                        dcnm0.b(((TextAttachment)attachment0).f);
                                        ibuq.e(((TextAttachment)attachment0).e, "getTextTitle(...)");
                                        dcnm0.e(((TextAttachment)attachment0).e);
                                        dcnm0.f(dcuz.b(((TextAttachment)attachment0).b));
                                        dcnm0.d(((TextAttachment)attachment0).c);
                                        dcnm0.c(((TextAttachment)attachment0).g);
                                        dcjv dcjv0 = dcnm0.a();
                                        ibuq.f(dcjv0, "value");
                                        if(!hftp4.b_message.isImmutable()) {
                                            hftp4.ensureMutable();
                                        }
                                        gzbu gzbu1 = (gzbu)hftp4.b_message;
                                        dcjv0.getClass();
                                        gzbu1.c = dcjv0;
                                        gzbu1.b = 2;
                                        String s8 = ((TextAttachment)attachment0).a;
                                        ibuq.e(s8, "getTextBody(...)");
                                        ibuq.f(s8, "value");
                                        if(!hftp4.b_message.isImmutable()) {
                                            hftp4.ensureMutable();
                                        }
                                        gzbu gzbu2 = (gzbu)hftp4.b_message;
                                        s8.getClass();
                                        gzbu2.d = 7;
                                        gzbu2.e = s8;
                                    }
                                    else if((attachment0 instanceof WifiCredentialsAttachment)) {
                                        ibuq.f(((WifiCredentialsAttachment)attachment0), "<this>");
                                        dcnx dcnx0 = dcnw.a(((ProtoLiteMessage)dckc.a).v_newBuilder());
                                        dcnx0.b(((WifiCredentialsAttachment)attachment0).f);
                                        ibuq.e(((WifiCredentialsAttachment)attachment0).a, "getSsid(...)");
                                        dcnx0.d(((WifiCredentialsAttachment)attachment0).a);
                                        dcnx0.c(dcuz.c(((WifiCredentialsAttachment)attachment0).b));
                                        dckc dckc0 = dcnx0.a();
                                        ibuq.f(dckc0, "value");
                                        if(!hftp4.b_message.isImmutable()) {
                                            hftp4.ensureMutable();
                                        }
                                        gzbu gzbu3 = (gzbu)hftp4.b_message;
                                        dckc0.getClass();
                                        gzbu3.c = dckc0;
                                        gzbu3.b = 3;
                                        ibuq.f(((WifiCredentialsAttachment)attachment0), "<this>");
                                        dcnv dcnv0 = dcnu.a(((ProtoLiteMessage)dcjz.a).v_newBuilder());
                                        String s9 = ((WifiCredentialsAttachment)attachment0).d;
                                        if(s9 != null) {
                                            dcnv0.c(s9);
                                        }
                                        dcnv0.b(((WifiCredentialsAttachment)attachment0).e);
                                        dcjz dcjz0 = dcnv0.a();
                                        ibuq.f(dcjz0, "value");
                                        if(!hftp4.b_message.isImmutable()) {
                                            hftp4.ensureMutable();
                                        }
                                        gzbu gzbu4 = (gzbu)hftp4.b_message;
                                        dcjz0.getClass();
                                        gzbu4.e = dcjz0;
                                        gzbu4.d = 8;
                                    }
                                }
                                byte[] arr_b4 = ((dcsk)object6).c;
                                if(arr_b4 != null) {
                                    ByteString hfsf1 = hfxt.a(arr_b4);
                                    if(!hftp4.b_message.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    ((gzbu)hftp4.b_message).f = hfsf1;
                                }
                                ProtoLiteMessage hftv1 = hftp4.N_build();
                                ibuq.e(hftv1, "build(...)");
                                ibuq.f(s6, "fileId");
                                ibuq.f(((gzbu)hftv1), "metadata");
                                gmno gmno1 = (gmno)dcsr0.e.a();
                                byte[] arr_b5 = ((gzbu)hftv1).toBytesArray();
                                byte[] arr_b6 = s6.getBytes(charset1);
                                ibuq.e(arr_b6, "getBytes(...)");
                                ByteString hfsf2 = hfxt.a(dcsq.b(gmno1, arr_b5, arr_b6));
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                ((gzbp)hftp3.b_message).c = hfsf2;
                                ProtoLiteMessage hftv2 = hftp3.N_build();
                                ibuq.e(hftv2, "build(...)");
                                ibuq.f(((gzbp)hftv2), "value");
                                if(!hftp5.b_message.isImmutable()) {
                                    hftp5.ensureMutable();
                                }
                                gzbt gzbt1 = (gzbt)hftp5.b_message;
                                ((gzbp)hftv2).getClass();
                                hfuo hfuo0 = gzbt1.c;
                                if(!hfuo0.c()) {
                                    gzbt1.c = ProtoLiteMessage.E(hfuo0);
                                }
                                gzbt1.c.add(((gzbp)hftv2));
                                iterator1 = iterator1;
                                hftp1 = hftp5;
                                charset0 = charset1;
                                object4 = object4;
                                object3 = object3;
                            }
                            ProtoLiteMessage hftv3 = hftp1.N_build();
                            ibuq.e(hftv3, "build(...)");
                            ibuq.f(((gzbt)hftv3), "value");
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gzbx gzbx0 = (gzbx)hftp0.b_message;
                            ((gzbt)hftv3).getClass();
                            gzbx0.c = (gzbt)hftv3;
                            gzbx0.b |= 1;
                            ProtoLiteMessage hftv4 = hftp0.N_build();
                            ibuq.e(hftv4, "build(...)");
                            gzbx1 = (gzbx)hftv4;
                            dcrc0.h = arr_b1;
                            dcrc0.a = object3;
                            dcrc0.b = object4;
                            icta0 = icta0;
                        }
                        catch(Throwable throwable0) {
                            icta0 = icta0;
                            icta2 = icta0;
                            goto label_292;
                        }
                        dcrc0.c = icta0;
                        dcst1 = dcst0;
                        dcrc0.d = dcst1;
                        dcrc0.g = 2;
                        Object object7 = dcta0.b(gzbx1, dcrc0);
                        if(object7 != ibrx0) {
                            icta2 = icta0;
                            object8 = object3;
                            object9 = object4;
                            arr_b7 = arr_b1;
                            object0 = object7;
                            goto label_278;
                        }
                        return ibrx0;
                    }
                    else {
                        object10 = dctf.d;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                }
                icta2 = icta0;
                goto label_292;
            }
            case 2: {
                dcst1 = (dcst)dcrc0.d;
                icta2 = (icta)dcrc0.c;
                object9 = dcrc0.b;
                Object object11 = dcrc0.a;
                byte[] arr_b8 = dcrc0.h;
                try {
                    ibnx.b(object0);
                    object8 = object11;
                    arr_b7 = arr_b8;
                label_278:
                    object10 = (dctf)object0;
                    if(object10 == dctf.a) {
                        dcst dcst2 = dcss.a(arr_b7);
                        icck icck0 = ((dcub)this.e.a.c).a();
                        dcrn dcrn0 = new dcrn(((dctc)((InstanceFactory)this.e.a.a).a), ((dcsj)((InstanceFactory)this.e.a.b).a), icck0, ((Account)object9), dcst2, ((List)object8), arr_b7);
                        this.d = dcst1;
                        dcst dcst3 = dcss.a(arr_b7);
                        this.a.h(dcst3, dcrn0);
                        ichm ichm0 = this.c;
                        if(ichm0 != null) {
                            dcrd.d(ichm0, dcrn0);
                        }
                    }
                    icta0 = icta2;
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_292:
                icta2.d();
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta0.d();
        return object10;
    }

    public static final void d(ichm ichm0, dcrn dcrn0) {
        icig icig0 = icjj.a(new dcqy(dcrn0.c));
        dcqz dcqz0 = new dcqz(ichm0, null);
        icig icig1 = ickq.b(dcrn0.c, dcqz0);
        icir.d(new iclx(new dcrq(dcrv.a, ibps.a, true), icig1, new dcra(ichm0, icig0, null)), ichm0);
    }
}

