import android.content.Context;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class bvnp implements ibth {
    public final bvnu a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public bvnp(bvnu bvnu0, String s, String s1, String s2, Integer integer0) {
        this.a = bvnu0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = integer0;
    }

    @Override  // ibth
    public final Object a() {
        bvns bvns0 = new bvns(this.b, null, this.c, this.d, this.e, 2);
        hgnt hgnt0 = hgnt.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgnt0).v_newBuilder();
        ibuq.f(hftp0, "builder");
        bvnu bvnu0 = this.a;
        hgny hgny0 = bvnu0.b();
        ibuq.f(hgny0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnt hgnt1 = (hgnt)hftp0.b_message;
        hgnt1.e = hgny0.a();
        List list0 = DesugarCollections.unmodifiableList(((hgnt)hftp0.b_message).d);
        ibuq.e(list0, "getInstalledAppsPackagesList(...)");
        new hfxu(list0);
        Context context0 = bvnu0.b;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: htwh.a.b().c().b) {
            String s = (String)object0;
            if(bbmq.U(context0, s)) {
                arrayList0.add(s);
            }
        }
        gged_interceptors gged0 = gged_interceptors.i(arrayList0);
        ibuq.e(gged0, "getAllInstalledAppsInDrop(...)");
        ibuq.f(gged0, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnt hgnt2 = (hgnt)hftp0.b_message;
        hfuo hfuo0 = hgnt2.d;
        if(!hfuo0.c()) {
            hgnt2.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, hgnt2.d);
        String s1 = bvns0.d;
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hgnt)hftp0.b_message).f = s1;
        }
        String s2 = bvns0.c;
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hgnt)hftp0.b_message).g = s2;
        }
        Integer integer0 = bvns0.e;
        if(integer0 != null) {
            int v = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgnt hgnt3 = (hgnt)hftp0.b_message;
            hgnt3.b |= 2;
            hgnt3.h = v;
        }
        hgnp hgnp0 = bvnu0.a();
        ibuq.f(hgnp0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnt hgnt4 = (hgnt)hftp0.b_message;
        hgnp0.getClass();
        hgnt4.c = hgnp0;
        hgnt4.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((hgnt)hftv0), "request");
        ibuq.f(bvns0.a, "accountName");
        bvpn bvpn0 = new bvpn(bvnu0.c.a, cmlp.a, ckhr.b);
        baqr baqr0 = bvpl.a(bvns0.a);
        if(bvpn.b == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hgnt0));
            ibjh ibjh1 = new ibjh(((MessageLite)hgnu.a));
            bvpn.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.googlegrowth.flexagon.v1.FlexagonApi/GetFeatureDropsFlow", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        hgnu hgnu0 = (hgnu)bvpn0.d.callUnaryWithAuth(bvpn.b, baqr0, ((hgnt)hftv0), ((long)bvpn.a), TimeUnit.MILLISECONDS, bvpn0.e);
        ibuq.c(hgnu0);
        try {
            bvnr bvnr0 = new bvnr(new bvnq(hgnu0));
            ((glyq)bvnu0.f.b(bvnr0, gmap.a)).u();
        }
        catch(ExecutionException executionException0) {
            a.ae(bvnu.a.j(), "failed setting is_locale_unsupported in protostore.", executionException0);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(bvnu.a.j(), "failed setting is_locale_unsupported in protostore.", interruptedException0);
        }
        if((hgnu0.b == null ? hgns.a : hgnu0.b).b.isEmpty()) {
            ((ggtj)bvnu.a.i()).x("Empty backend response");
            return new bwdn(bwcj.a);
        }
        hfuo hfuo1 = (hgnu0.b == null ? hgns.a : hgnu0.b).b;
        bvnu0.e.a(hfuo1);
        bvnu0.d.a(hfuo1);
        return bwdq.a;
    }
}

