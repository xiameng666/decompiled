import android.content.Context;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class ehhp extends ehhs {
    private final Set d;
    private final ehco e;
    private final boolean f;
    private final boolean g;
    private ehhv h;
    private final ehib i;

    public ehhp(ehco ehco0, ehbg ehbg0, ehga ehga0, egzp egzp0, Uri uri0, ehim ehim0, efur efur0, String s) {
        super("FSA2_ApiContactsReader", ehbg0, ehga0, egzp0, uri0, ehim0);
        this.d = new HashSet();
        this.e = ehco0;
        egiv.R();
        egiv.R();
        hwzc hwzc0 = hwzc.a;
        boolean z = hwzc0.c().ar();
        Boolean.valueOf(z).getClass();
        this.f = z;
        egiv.R();
        boolean z1 = hwzc0.c().ae();
        Boolean.valueOf(z1).getClass();
        this.g = z1;
        if(z) {
            int v = (int)hwzc0.c().L();
            Integer.valueOf(v).getClass();
            double f = hwzc0.c().a();
            Double.valueOf(f).getClass();
            int v1 = (int)hwzc0.c().s();
            Integer.valueOf(v1).getClass();
            this.h = new ehhv(v, f, v1);
        }
        this.i = new ehib(efur0, s);
    }

    @Override  // ehhs
    protected final ehaa a() {
        egyn egyn0 = this.a.a.b();
        String s = null;
        String s1 = (egyn0.b & 1) == 0 ? null : egyn0.c;
        if((egyn0.b & 2) != 0) {
            s = egyn0.d;
        }
        return new ehaa(s1, s);
    }

    @Override  // ehhs
    protected final void b() {
        this.a.d(null);
    }

    @Override  // ehhs
    protected final void c() {
        ehim ehim0 = this.b;
        boolean z = true;
        ((ehiv)ehim0).m = true;
        boolean z1 = hxcf.d();
        boolean z2 = hxau.c();
        if(!this.c && !z1) {
            if(z2) {
                z2 = true;
                goto label_10;
            }
            return;
        }
    label_10:
        ehbg ehbg0 = this.a;
        boolean z3 = ehbg0.i();
        if(z1 && !z3) {
            ((ehiv)ehim0).B = true;
            ehim0.p();
        }
        boolean z4 = ehbg0.h();
        if(z2 && !z4) {
            ehim0.o();
        }
        long v = System.currentTimeMillis();
        if(!z2 || z4) {
            z = false;
        }
        ehbg0.c(v, z1 && !z3, z);
    }

    @Override  // ehhs
    protected final boolean d(Object object0) {
        String s = ((egzv)object0).a;
        Set set0 = this.d;
        if(set0.contains(s)) {
            return false;
        }
        set0.add(s);
        return true;
    }

    @Override  // ehhs
    protected final int e() {
        return 3;
    }

    @Override  // ehhs
    protected final ehaa f(ehaa ehaa0, boolean z, ehhr ehhr0) {
        gsto gsto0;
        int v3;
        int v;
        boolean z1 = this.f;
        if(z1 && z) {
            this.h.a();
        }
        ehco ehco0 = this.e;
        if(!this.g) {
            if(z1) {
                int v1 = this.h.d;
                this.h.d = Math.min(((int)(((double)v1) * this.h.b)), this.h.c);
                v = v1;
            }
            else {
                egiv.R();
                v = (int)egiv.O();
            }
        }
        else if(this.i.a.F(this.i.b)) {
            egiv.R();
            v = (int)hwzc.a.c().H();
            Integer.valueOf(v).getClass();
        }
        else {
            egiv.R();
            v = (int)egiv.O();
        }
        gsuj gsuj0 = gsuj.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsuj0).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gsui.a).v_newBuilder();
        String s = ehaa0.a;
        if(s != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gsui)hftp1.b_message).b = s;
        }
        egiv.R();
        Context context0 = ehco0.i;
        hxgv hxgv0 = hxgv.a;
        if(hxgv0.b().a() && ehjo.a(context0) == 1) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gsui gsui0 = (gsui)hftp1.b_message;
            gsui0.c = gsuh.a(3);
        }
        else {
            ehje ehje0 = ehco0.g;
            hwzc hwzc0 = hwzc.a;
            if(hwzc0.c().am() && ehje0.b && (!hxgv0.b().b() || ehjo.a(context0) == 1)) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gsui gsui1 = (gsui)hftp1.b_message;
                gsui1.c = gsuh.a(3);
            }
            else {
                boolean z2 = hwzc0.c().aF();
                Boolean.valueOf(z2).getClass();
                if(z2) {
                    int v2 = (int)hwzc0.c().n();
                    Integer.valueOf(v2).getClass();
                    switch(v2) {
                        case 0: {
                            v3 = 2;
                            break;
                        }
                        case 1: {
                            v3 = 3;
                            break;
                        }
                        case 2: {
                            v3 = 4;
                            break;
                        }
                        default: {
                            v3 = 0;
                        }
                    }
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gsui gsui2 = (gsui)hftp1.b_message;
                    gsui2.c = gsuh.a(v3);
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsuj gsuj1 = (gsuj)hftp0.b_message;
        gsui gsui3 = (gsui)hftp1.N_build();
        gsui3.getClass();
        gsuj1.e = gsui3;
        gsuj1.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gsuj)hftv0).c = v;
        String s1 = ehco0.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsuj gsuj2 = (gsuj)hftp0.b_message;
        s1.getClass();
        gsuj2.j = s1;
        gssn gssn0 = ehco.h();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        gssn0.getClass();
        ((gsuj)hftv1).i = gssn0;
        ((gsuj)hftv1).b |= 16;
        String s2 = ehaa0.b;
        if(s2 != null) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsuj)hftp0.b_message).d = s2;
        }
        gsts gsts0 = ehco0.f;
        if(gsts0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsuj)hftp0.b_message).g = gsts0;
            ((gsuj)hftp0.b_message).b |= 4;
        }
        gsua gsua0 = (gsua)((ProtoLiteMessage)gsub.b).v_newBuilder();
        hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
        hftf0.a(ehco0.f());
        hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
        gsua0.k();
        if(!gsua0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gsua0).ensureMutable();
        }
        gsub gsub0 = (gsub)gsua0.b_message;
        hftg0.getClass();
        gsub0.d = hftg0;
        gsub0.c |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsuj gsuj3 = (gsuj)hftp0.b_message;
        gsub gsub1 = (gsub)((ProtoLiteBuilder)gsua0).N_build();
        gsub1.getClass();
        gsuj3.f = gsub1;
        gsuj3.b |= 2;
        gstq gstq0 = ehco.i();
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gstq0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)gstq0));
        boolean z3 = hwzc.a.c().aW();
        Boolean.valueOf(z3).getClass();
        if(z3) {
            if(!((gstp)hftp2).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gstp)hftp2))).ensureMutable();
            }
            ((gstq)((gstp)hftp2).b_message).e = hfty.a;
            ((gstp)hftp2).a();
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsuj gsuj4 = (gsuj)hftp0.b_message;
        gstq gstq1 = (gstq)((ProtoLiteBuilder)(((gstp)hftp2))).N_build();
        gstq1.getClass();
        gsuj4.h = gstq1;
        gsuj4.b |= 8;
        ehco0.d.a();
        try {
            egke egke0 = ehco0.b;
            baqr baqr0 = ehco0.a;
            gsuj gsuj5 = (gsuj)hftp0.N_build();
            try {
                egkd egkd0 = new egkd(egke0.b, cmlp.a, cksy.b);
                long v4 = (long)egke0.a;
                if(egkd.d == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gsuj0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gsto.a));
                    egkd.d = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/SyncPeople", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gsto0 = (gsto)egkd0.o.callUnaryWithAuth(egkd.d, baqr0, gsuj5, v4, TimeUnit.MILLISECONDS, egkd0.p);
            }
            catch(acse | iapl exception0) {
                egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                throw exception0;
            }
            ehco0.d.c("FSA_syncPeople", (gsto0 == null ? 0 : gsto0.b.size()), ehcw.a(((MessageLite)gsto0)));
            if(gsto0 != null) {
                int v5 = (gsto0.f == null ? gsrk.a : gsto0.f).b;
                ehim ehim0 = ehco0.e;
                gjgi gjgi0 = gjgi.b;
                ehim0.v(gjgi0, 2, 3, v5);
                if(z) {
                    int v6 = gsto0.e;
                    if(!((ehiv)ehim0).y && (!hxbk.j() || !((ehiv)ehim0).A)) {
                        ehco0.h.e(true, gjgi0, v6);
                    }
                    else {
                        ehco0.h.e(true, gjgi0, v5);
                    }
                }
            }
            if(gsto0 == null) {
                egig.b("FSA2_ContactSyncGrpc", "Received null API-contact response");
                return null;
            }
            egig.e("FSA2_ContactSyncGrpc", "Received non-null API-contact response");
            ehaa ehaa1 = new ehaa(gsto0.d, gsto0.c);
            if(gsto0.b.size() == 0) {
                return ehaa1;
            }
            Iterator iterator0 = gsto0.b.iterator();
            while(true) {
            label_166:
                if(!iterator0.hasNext()) {
                    return ehaa1;
                }
                Object object0 = iterator0.next();
                gdmq gdmq0 = (gdmq)object0;
                if(gdmq0 == null) {
                    egig.e("FSA2_ContactSyncGrpc", "Ignoring null API person");
                }
                else {
                    for(Object object1: ehig.b(gdmq0)) {
                        String s3 = (String)object1;
                        egzv egzv0 = ehcu.a(gdmq0, s3, ehco0.j, ehco0.k, ((ehiv)ehco0.e).C);
                        if(egzv0 == null) {
                            egig.m("FSA2_ContactSyncGrpc", "Skipping invalid/unexpected API person {id=%s}", new Object[]{s3});
                        }
                        else if(!egzv0.h && ehjs.i(egzv0.w)) {
                            egig.m("FSA2_ContactSyncGrpc", "Skipping Other contact {id=%s}", new Object[]{s3});
                        }
                        else {
                            ehhr0.a(egzv0);
                        }
                    }
                }
            }
        }
        catch(acse acse0) {
            egig.c("FSA2_ContactSyncGrpc", "getContacts() failed", acse0);
            throw new ehfh(acse0);
        }
        catch(iapl iapl0) {
            egig.c("FSA2_ContactSyncGrpc", "getContacts() failed", iapl0);
            ehco0.d.d("FSA_syncPeople", iapl0);
            throw iapl0;
        }
        goto label_166;
    }
}

