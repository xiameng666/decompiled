import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public final class ehco extends ehcl {
    public final ehdl h;
    public final Context i;
    public final egzo j;
    public final egzz k;
    private static final gssm[] l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;

    static {
        ehco.l = new gssm[]{gssm.g};
    }

    public ehco(Context context0, baqr baqr0, egke egke0, String s, bbng bbng0, gfug gfug0, ehim ehim0, gsts gsts0, ehje ehje0, ehdl ehdl0, egzz egzz0, ehbg ehbg0) {
        super(context0, baqr0, egke0, s, bbng0, gfug0, ehim0, gsts0, ehje0);
        this.h = ehdl0;
        this.i = context0;
        this.j = egzo.a();
        this.k = egzz0;
        boolean z = hxcf.d();
        this.m = z;
        boolean z1 = hxcf.a.b().b();
        this.n = z1;
        if(z && (!z1 || ehbg0.i())) {
            ehim0.p();
        }
        boolean z2 = hxau.c();
        this.o = z2;
        boolean z3 = hxau.a.b().e();
        this.p = z3;
        if(!z2 || z3 && !ehbg0.h()) {
            return;
        }
        ehim0.o();
    }

    public final egzv a(gdmq gdmq0, String s) {
        gsuq gsuq0;
        gsup gsup0 = gsup.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsup0).v_newBuilder();
        String s1 = gdmq0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((gsup)hftv0).c = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsup gsup1 = (gsup)hftp0.b_message;
        gdmq0.getClass();
        gsup1.d = gdmq0;
        gsup1.b |= 1;
        hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
        hftf0.a(this.j());
        hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hftg0.getClass();
        ((gsup)hftv1).e = hftg0;
        ((gsup)hftv1).b |= 2;
        gsuc gsuc0 = gsuc.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsup gsup2 = (gsup)hftp0.b_message;
        gsup2.f = gsuc0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsup)hftp0.b_message).g = false;
        gssr gssr0 = this.e(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsup gsup3 = (gsup)hftp0.b_message;
        gssr0.getClass();
        gsup3.h = gssr0;
        gsup3.b |= 4;
        this.d.a();
        try {
            egke egke0 = this.b;
            baqr baqr0 = this.a;
            gsup gsup4 = (gsup)hftp0.N_build();
            try {
                egkd egkd0 = new egkd(egke0.b, cmlp.a, ckta.b);
                long v = (long)egke0.a;
                if(egkd.c == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gsup0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gsuq.a));
                    egkd.c = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/UpdatePerson", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gsuq0 = (gsuq)egkd0.o.callUnaryWithAuth(egkd.c, baqr0, gsup4, v, TimeUnit.MILLISECONDS, egkd0.p);
            }
            catch(acse | iapl exception0) {
                egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                throw exception0;
            }
            this.d.c("FSA_updatePerson", 1, ehcw.a(((MessageLite)gsuq0)));
            if(gsuq0 != null && (gsuq0.b & 1) != 0 && ((gsuq0.c == null ? gstw.a : gsuq0.c).b & 2) != 0) {
                gstw gstw0 = gsuq0.c;
                if((1 & (gstw0 == null ? gstw.a : gstw0).b) != 0) {
                    if(gstw0 == null) {
                        gstw0 = gstw.a;
                    }
                    if((gstw0.c == null ? hhna.a : gstw0.c).b == iaph.a.r) {
                        gstw gstw1 = gsuq0.c == null ? gstw.a : gsuq0.c;
                        return ehcu.a((gstw1.d == null ? gdmq.a : gstw1.d), s, this.j, this.k, ((ehiv)this.e).C);
                    }
                    egig.b("FSA2_ContactSyncGrpc", "Failed to updatePerson: Failed to insertPerson, responseStatus is not OK.");
                    throw new ehfd(3);
                }
            }
            egig.b("FSA2_ContactSyncGrpc", "Unexpected null result returned by updatePerson People API");
            throw new ehfd(3);
        }
        catch(iapl iapl0) {
            this.d.d("FSA_updatePerson", iapl0);
            throw iapl0;
        }
    }

    public final ehcm b(LinkedHashMap linkedHashMap0) {
        return this.d(linkedHashMap0, this.k(linkedHashMap0, false, new HashMap()));
    }

    public final ehcm c(LinkedHashMap linkedHashMap0, HashMap hashMap0) {
        return this.d(linkedHashMap0, this.k(linkedHashMap0, true, hashMap0));
    }

    public final ehcm d(LinkedHashMap linkedHashMap0, gsrq[] arr_gsrq) {
        Iterator iterator3;
        Iterator iterator1;
        gsrt gsrt0;
        gsrr gsrr0 = gsrr.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsrr0).v_newBuilder();
        List list0 = Arrays.asList(arr_gsrq);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsrr gsrr1 = (gsrr)hftp0.b_message;
        hfuo hfuo0 = gsrr1.c;
        if(!hfuo0.c()) {
            gsrr1.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, gsrr1.c);
        String s = null;
        gssr gssr0 = this.e(null);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsrr gsrr2 = (gsrr)hftp0.b_message;
        gssr0.getClass();
        gsrr2.e = gssr0;
        gsrr2.b |= 2;
        hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
        hftf0.a(this.j());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsrr gsrr3 = (gsrr)hftp0.b_message;
        hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
        hftg0.getClass();
        gsrr3.d = hftg0;
        gsrr3.b |= 1;
        gsrr gsrr4 = (gsrr)hftp0.N_build();
        this.d.a();
        try {
            baqr baqr0 = this.a;
            try {
                egkd egkd0 = new egkd(this.b.b, cmlp.a, cksk.b);
                if(egkd.n == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gsrr0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gsrt.a));
                    egkd.n = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/BulkInsertContacts", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gsrt0 = (gsrt)egkd0.o.callUnaryWithAuth(egkd.n, baqr0, gsrr4, 30000L, TimeUnit.MILLISECONDS, egkd0.p);
            }
            catch(acse | iapl exception0) {
                egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                throw exception0;
            }
            this.d.c("FSA_bulkInsertContacts", 1, ehcw.a(((MessageLite)gsrt0)));
        }
        catch(iapl iapl0) {
            this.d.d("FSA_bulkInsertContacts", iapl0);
            throw iapl0;
        }
        if(gsrt0 != null && gsrt0.b.size() == gsrr4.c.size()) {
            Iterator iterator0 = linkedHashMap0.entrySet().iterator();
            ArrayList arrayList0 = new ArrayList();
            LinkedHashMap linkedHashMap1 = new LinkedHashMap();
            ArrayList arrayList1 = new ArrayList();
            int v = 0;
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                gstw gstw0 = ((gsrs)gsrt0.b.get(v)).b;
                if(gstw0 == null) {
                    gstw0 = gstw.a;
                }
                if((gstw0.b & 2) != 0) {
                    gstw gstw1 = ((gsrs)gsrt0.b.get(v)).b;
                    if(gstw1 == null) {
                        gstw1 = gstw.a;
                    }
                    if((gstw1.b & 1) != 0) {
                        gstw gstw2 = ((gsrs)gsrt0.b.get(v)).b;
                        if(gstw2 == null) {
                            gstw2 = gstw.a;
                        }
                        int v1 = (gstw2.c == null ? hhna.a : gstw2.c).b;
                        if(v1 == iaph.a.r) {
                            gstw gstw3 = ((gsrs)gsrt0.b.get(v)).b;
                            if(gstw3 == null) {
                                gstw3 = gstw.a;
                            }
                            gdmq gdmq0 = gstw3.d == null ? gdmq.a : gstw3.d;
                            if(gdmq0 == null) {
                                iterator1 = iterator0;
                            }
                            else if((gdmq0.b & 2) == 0) {
                                iterator1 = iterator0;
                            }
                            else {
                                gdmx gdmx0 = gdmq0.d == null ? gdmx.a : gdmq0.d;
                                long v2 = -1L;
                                String s1 = null;
                                for(Object object1: (gdmx0.f == null ? gdmb.a : gdmx0.f).b) {
                                    gdni gdni0 = (gdni)object1;
                                    switch(gdll.a(gdni0.c)) {
                                        case 0: {
                                            iterator3 = iterator0;
                                            break;
                                        }
                                        case 3: {
                                            iterator3 = iterator0;
                                            long v3 = gdni0.f;
                                            if(v2 < v3) {
                                                s1 = gdni0.d;
                                                v2 = v3;
                                            }
                                            break;
                                        }
                                        default: {
                                            iterator3 = iterator0;
                                        }
                                    }
                                    iterator0 = iterator3;
                                }
                                iterator1 = iterator0;
                                s = s1;
                            }
                            egzv egzv0 = ehcu.a(gdmq0, s, this.j, this.k, ((ehiv)this.e).C);
                            String s2 = Long.toHexString(((Long)map$Entry0.getValue()).longValue());
                            if(!egzv0.a.equals(s2)) {
                                throw new ehfd(3);
                            }
                            ehhm ehhm0 = ehhn.a();
                            ehhm0.b(egzv0);
                            ehhm0.a = (egzv)map$Entry0.getKey();
                            arrayList0.add(ehhm0.a());
                            ++v;
                            iterator0 = iterator1;
                            s = null;
                            continue;
                        }
                        else {
                            iterator1 = iterator0;
                            egig.b("FSA2_ContactSyncGrpc", "Failed to bulk insert contacts, responseStatus is not OK.");
                            linkedHashMap1.put(((egzv)map$Entry0.getKey()), ((Long)map$Entry0.getValue()));
                            if(v1 == iaph.d.r) {
                                arrayList1.add(((egzv)map$Entry0.getKey()));
                            }
                        }
                        ++v;
                        iterator0 = iterator1;
                        s = null;
                        continue;
                    }
                }
                egig.b("FSA2_ContactSyncGrpc", "Failed to bulk insert contacts.");
                throw new ehfd(3);
            }
            return new ehcm(arrayList0, linkedHashMap1, arrayList1);
        }
        egig.b("FSA2_ContactSyncGrpc", "Failed to bulk insert contacts.");
        throw new ehfd(3);
    }

    public final gssr e(String s) {
        gssq gssq0 = (gssq)((ProtoLiteMessage)gssr.a).v_newBuilder();
        if(!TextUtils.isEmpty(s)) {
            gssq0.a(s);
        }
        egiv.R();
        Boolean.valueOf(true).getClass();
        gssn gssn0 = ehco.h();
        if(!gssq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gssq0).ensureMutable();
        }
        gssr gssr0 = (gssr)gssq0.b_message;
        gssn0.getClass();
        gssr0.e = gssn0;
        gssr0.b |= 4;
        gsts gsts0 = this.f;
        if(!gssq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gssq0).ensureMutable();
        }
        gssr gssr1 = (gssr)gssq0.b_message;
        gsts0.getClass();
        gssr1.f = gsts0;
        gssr1.b |= 8;
        gsua gsua0 = (gsua)((ProtoLiteMessage)gsub.b).v_newBuilder();
        gsua0.k();
        hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
        hftf0.a(this.f());
        hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
        if(!gsua0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsua0).ensureMutable();
        }
        gsub gsub0 = (gsub)gsua0.b_message;
        hftg0.getClass();
        gsub0.d = hftg0;
        gsub0.c |= 1;
        if(!gssq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gssq0).ensureMutable();
        }
        gssr gssr2 = (gssr)gssq0.b_message;
        gsub gsub1 = (gsub)((ProtoLiteBuilder)gsua0).N_build();
        gsub1.getClass();
        gssr2.d = gsub1;
        gssr2.b |= 2;
        gstq gstq0 = ehco.i();
        if(!gssq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gssq0).ensureMutable();
        }
        gssr gssr3 = (gssr)gssq0.b_message;
        gstq0.getClass();
        gssr3.h = gstq0;
        gssr3.b |= 0x20;
        return (gssr)((ProtoLiteBuilder)gssq0).N_build();
    }

    public final List f() {
        boolean z = ((ehiv)this.e).C;
        boolean z1 = ((ehiv)this.e).D;
        return this.j.e == 2 ? ehcn.a(ehcn.b, z, z1, true) : ehcn.a(ehcn.d, z, z1, true);
    }

    public final void g(List list0, String s) {
        gsse gsse0;
        if(list0.isEmpty()) {
            return;
        }
        gssd gssd0 = gssd.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gssd0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gssd gssd1 = (gssd)hftp0.b_message;
        hfuo hfuo0 = gssd1.c;
        if(!hfuo0.c()) {
            gssd1.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, gssd1.c);
        gsts gsts0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gssd gssd2 = (gssd)hftp0.b_message;
        gsts0.getClass();
        gssd2.e = gsts0;
        gssd2.b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hill.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hill)hftp1.b_message).e = 6;
        ((hill)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hilc.a).v_newBuilder();
        String s1 = gfqz.c(Build.MANUFACTURER);
        String s2 = gfrd.b.d(gfrd.d, s1) + " - " + Build.MODEL;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hilc hilc0 = (hilc)hftp2.b_message;
        hilc0.b |= 1;
        hilc0.c = s2;
        hilc hilc1 = (hilc)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hill hill0 = (hill)hftp1.b_message;
        hilc1.getClass();
        hill0.d = hilc1;
        hill0.c = 3;
        hill hill1 = (hill)hftp1.N_build();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hilj.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hilj hilj0 = (hilj)hftp3.b_message;
        hill1.getClass();
        hilj0.c = hill1;
        hilj0.b |= 1;
        hilj hilj1 = (hilj)hftp3.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gssd gssd3 = (gssd)hftp0.b_message;
        hilj1.getClass();
        gssd3.d = hilj1;
        gssd3.b |= 1;
        gssd gssd4 = (gssd)hftp0.N_build();
        try {
            this.d.a();
            egke egke0 = this.b;
            baqr baqr0 = this.a;
            try {
                egkd egkd0 = new egkd(egke0.b, cmlp.a, cksn.b);
                long v = (long)egke0.a;
                if(egkd.b == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gssd0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gsse.a));
                    egkd.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/DeletePeople", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gsse0 = (gsse)egkd0.o.callUnaryWithAuth(egkd.b, baqr0, gssd4, v, TimeUnit.MILLISECONDS, egkd0.p);
            }
            catch(acse | iapl exception0) {
                egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                throw exception0;
            }
            this.d.c(s, list0.size(), ehcw.a(((MessageLite)gsse0)));
        }
        catch(acse acse0) {
            egig.c("FSA2_ContactSyncGrpc", "deleteContactIds() failed.", acse0);
            throw acse0;
        }
        catch(iapl iapl0) {
            egig.c("FSA2_ContactSyncGrpc", "deleteContactIds() failed.", iapl0);
            this.d.d(s, iapl0);
            throw iapl0;
        }
    }

    public static final gssn h() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gssn.a).v_newBuilder();
        List list0 = Arrays.asList(ehco.l);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gssn gssn0 = (gssn)hftp0.b_message;
        hfuf hfuf0 = gssn0.b;
        if(!hfuf0.c()) {
            gssn0.b = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: list0) {
            gssn0.b.i(((gssm)object0).a());
        }
        return (gssn)hftp0.N_build();
    }

    public static final gstq i() {
        gstp gstp0 = (gstp)((ProtoLiteMessage)gstq.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gstv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gstv)hftp0.b_message).b = 2;
        if(!gstp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gstp0).ensureMutable();
        }
        gstq gstq0 = (gstq)gstp0.b_message;
        gstv gstv0 = (gstv)hftp0.N_build();
        gstv0.getClass();
        gstq0.c = gstv0;
        gstq0.b |= 1;
        if(hxde.c()) {
            gsrx gsrx0 = (gsrx)((ProtoLiteMessage)gsry.a).v_newBuilder();
            gsrx0.a();
            if(!gstp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gstp0).ensureMutable();
            }
            gstq gstq1 = (gstq)gstp0.b_message;
            gsry gsry0 = (gsry)((ProtoLiteBuilder)gsrx0).N_build();
            gsry0.getClass();
            gstq1.d = gsry0;
            gstq1.b |= 4;
        }
        egiv.R();
        boolean z = hwzc.a.c().aX();
        Boolean.valueOf(z).getClass();
        if(z) {
            gstp0.a();
        }
        return (gstq)((ProtoLiteBuilder)gstp0).N_build();
    }

    private final List j() {
        boolean z = ((ehiv)this.e).C;
        boolean z1 = ((ehiv)this.e).D;
        return this.j.e == 2 ? ehcn.a(ehcn.a, z, z1, false) : ehcn.a(ehcn.c, z, z1, false);
    }

    private final gsrq[] k(LinkedHashMap linkedHashMap0, boolean z, HashMap hashMap0) {
        gsrq[] arr_gsrq = new gsrq[linkedHashMap0.size()];
        int v = 0;
        for(Object object0: linkedHashMap0.keySet()) {
            egzv egzv0 = (egzv)object0;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsrq.a).v_newBuilder();
            gdmq gdmq0 = z ? ehct.b(egzv0, ((List)hashMap0.get(egzv0)), ((ehiv)this.e).C) : ehct.a(egzv0, ((ehiv)this.e).C);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsrq gsrq0 = (gsrq)hftp0.b_message;
            gdmq0.getClass();
            gsrq0.c = gdmq0;
            gsrq0.b |= 1;
            long v1 = (long)(((Long)linkedHashMap0.get(egzv0)));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsrq)hftp0.b_message).d = v1;
            arr_gsrq[v] = (gsrq)hftp0.N_build();
            ++v;
        }
        return arr_gsrq;
    }
}

