import android.content.SyncStats;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class ehez extends ehem {
    private final egzo j;

    public ehez(ehim ehim0, ehfx ehfx0, ehfy ehfy0, ehfw ehfw0, egzp egzp0, ehab ehab0, ehcq ehcq0, ehfk ehfk0, ehfq ehfq0, ehdl ehdl0, ehft ehft0, egzo egzo0) {
        super(girk.c, ehfx0, ehfy0, ehfw0, ehim0, egzp0, ehab0, ehcq0, ehfk0, ehfq0, ehdl0, ehft0);
        this.j = egzo0;
    }

    @Override  // ehem
    protected final gfsx a(egzx egzx0) {
        gfsx gfsx0;
        String s = egzx0.k;
        if(gfta.c(s)) {
            throw new iapl(iaph.d.a().f("Request contains an invalid argument."));
        }
        if(ehhy.b(s)) {
            gfsx0 = gfsx.m(ehez.n(s, "Group ID cannot belong to a system group."));
        }
        else if(ehhy.a(s)) {
            gfsx0 = gfqx.a;
        }
        else {
            gfsx0 = gfsx.m(ehez.n(s, "Invalid group ID."));
        }
        if(!gfsx0.i()) {
            if(!hxcc.g()) {
                return gfqx.a;
            }
            String s1 = egzx0.m;
            if(gfta.c(s1)) {
                throw new iapl(iaph.d.a().f("Request contains an invalid argument."));
            }
            if(s1.trim().isEmpty()) {
                return gfsx.m(ehez.n(s, "Name is missing."));
            }
            return ((long)s1.length()) > hxcc.d() ? gfsx.m(ehez.n(s, "Name is too long.")) : gfqx.a;
        }
        return gfsx0;
    }

    @Override  // ehem
    protected final List b(List list0) {
        gsul gsul0;
        if(list0 != null && !list0.isEmpty()) {
            gsuk gsuk0 = gsuk.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsuk0).v_newBuilder();
            List list1 = Arrays.asList(ehct.c(list0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsuk gsuk1 = (gsuk)hftp0.b_message;
            hfuo hfuo0 = gsuk1.c;
            if(!hfuo0.c()) {
                gsuk1.c = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list1, gsuk1.c);
            if(ehjs.h(((hims[])DesugarCollections.unmodifiableList(((gsuk)hftp0.b_message).c).toArray(new hims[0])))) {
                return Collections.EMPTY_LIST;
            }
            gstc gstc0 = ehcq.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ehcq ehcq0 = this.d;
            ProtoLiteMessage hftv0 = hftp0.b_message;
            gstc0.getClass();
            ((gsuk)hftv0).h = gstc0;
            ((gsuk)hftv0).b |= 8;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsts gsts0 = ehcq0.f;
            gsuk gsuk2 = (gsuk)hftp0.b_message;
            gsts0.getClass();
            gsuk2.f = gsts0;
            gsuk2.b |= 4;
            if(hwyi.z() && ehcq0.i.b() && !ehcq.c(list0)) {
                hftg hftg0 = hftg.a;
                hftf hftf0 = (hftf)((ProtoLiteMessage)hftg0).v_newBuilder();
                gged_interceptors gged0 = ehcq.h;
                hftf0.a(gged0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gsuk gsuk3 = (gsuk)hftp0.b_message;
                hftg hftg1 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
                hftg1.getClass();
                gsuk3.d = hftg1;
                gsuk3.b |= 1;
                hftf hftf1 = (hftf)((ProtoLiteMessage)hftg0).v_newBuilder();
                hftf1.a(gged0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gsuk gsuk4 = (gsuk)hftp0.b_message;
                hftg hftg2 = (hftg)((ProtoLiteBuilder)hftf1).N_build();
                hftg2.getClass();
                gsuk4.e = hftg2;
                gsuk4.b |= 2;
            }
            egiv.R();
            boolean z = hwzc.a.c().as();
            Boolean.valueOf(z).getClass();
            if(z) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gsuk)hftp0.b_message).g = 2;
            }
            ehcq0.d.a();
            try {
                egke egke0 = ehcq0.b;
                baqr baqr0 = ehcq0.a;
                gsuk gsuk5 = (gsuk)hftp0.N_build();
                try {
                    egkd egkd0 = new egkd(egke0.b, cmlp.a, cksz.b);
                    long v = (long)egke0.a;
                    if(egkd.g == null) {
                        ibjh ibjh0 = new ibjh(((MessageLite)gsuk0));
                        ibjh ibjh1 = new ibjh(((MessageLite)gsul.a));
                        egkd.g = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/UpdateContactGroups", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                    }
                    gsul0 = (gsul)egkd0.o.callUnaryWithAuth(egkd.g, baqr0, gsuk5, v, TimeUnit.MILLISECONDS, egkd0.p);
                }
                catch(acse | iapl exception0) {
                    egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                    throw exception0;
                }
                ehcq0.d.c("FSA_updateContactGroups", list0.size(), ehcw.a(((MessageLite)gsul0)));
            }
            catch(iapl iapl0) {
                ehcq0.d.d("FSA_updateContactGroups", iapl0);
                throw iapl0;
            }
            if(gsul0 == null) {
                throw new ehfb(1);
            }
            ehcq.b(gsul0.b, list0.size());
            return gsul0.b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override  // ehem
    protected final void c(List list0, List list1, List list2) {
        for(Object object0: list0) {
            egzx egzx0 = (egzx)object0;
            if(!egzx0.f()) {
                list2.add(egzx0);
            }
            else if(hwyi.a.e().N() && egzx0.e()) {
                list2.add(egzx0);
            }
            else {
                list1.add(egzx0);
            }
        }
    }

    @Override  // ehem
    protected final void j(egzx egzx0, himv himv0) {
        SyncStats syncStats0;
        try {
            egzx egzx1 = ehcu.c(himv0, this.j);
            if(hwyi.z() && egzx1 != null && egzx1.d()) {
                egzx1 = ehcu.b(egzx1, this.c.g(egzx1.r));
            }
            this.i(egzx1, egzx0);
        }
        catch(iapl iapl0) {
            iaph iaph0 = iapl0.a.t;
            switch(iaph0.ordinal()) {
                case 3: {
                    egiv.R();
                    if(egiv.f().booleanValue()) {
                        SyncStats syncStats1 = ((ehiv)this.e).a.stats;
                        ++syncStats1.numParseExceptions;
                    }
                    else {
                        syncStats0 = ((ehiv)this.e).a.stats;
                        ++syncStats0.numIoExceptions;
                    }
                    break;
                }
                case 5: {
                    if(hwyi.z()) {
                        this.a.h(egzx0);
                        return;
                    }
                    this.a.e(egzx0.h);
                    return;
                }
                case 6: 
                case 9: 
                case 12: 
                case 15: {
                    SyncStats syncStats2 = ((ehiv)this.e).a.stats;
                    ++syncStats2.numParseExceptions;
                    break;
                }
                default: {
                    syncStats0 = ((ehiv)this.e).a.stats;
                    ++syncStats0.numIoExceptions;
                }
            }
            ehez.m(iapl0, gged_interceptors.l(egzx0));
            this.d(iapl0, iaph0.name(), 1);
            this.g(egzx0);
        }
    }

    @Override  // ehem
    protected final void k(List list0) {
        for(Object object0: list0) {
            egzx egzx0 = (egzx)object0;
            if(hwyi.z()) {
                this.a.d(egzx0, false);
            }
            else {
                this.a.c(egzx0.h);
            }
        }
        this.f(list0);
    }

    private static himv n(String s, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)himv.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)himq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        himq himq0 = (himq)hftp1.b_message;
        s.getClass();
        himq0.b |= 1;
        himq0.c = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        himv himv0 = (himv)hftp0.b_message;
        himq himq1 = (himq)hftp1.N_build();
        himq1.getClass();
        himv0.c = himq1;
        himv0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((himv)hftv0).b |= 2;
        ((himv)hftv0).d = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((himv)hftp0.b_message).g = 3;
        ((himv)hftp0.b_message).b |= 16;
        return (himv)hftp0.N_build();
    }
}

