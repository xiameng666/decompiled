import android.net.Uri;
import com.google.android.gms.growth.featuredrops.activity.FeatureDropsProofingChimeraActivity;
import java.util.concurrent.TimeUnit;

public final class bvni implements Runnable {
    public final FeatureDropsProofingChimeraActivity a;

    public bvni(FeatureDropsProofingChimeraActivity featureDropsProofingChimeraActivity0) {
        this.a = featureDropsProofingChimeraActivity0;
    }

    @Override
    public final void run() {
        hgnn hgnn0;
        FeatureDropsProofingChimeraActivity featureDropsProofingChimeraActivity0;
        try {
            featureDropsProofingChimeraActivity0 = this.a;
            bvnu bvnu0 = featureDropsProofingChimeraActivity0.k;
            Number number0 = null;
            if(bvnu0 == null) {
                ibuq.j("featureDropsCoordinator");
                bvnu0 = null;
            }
            String s = featureDropsProofingChimeraActivity0.m();
            String s1 = featureDropsProofingChimeraActivity0.n();
            hgoe hgoe0 = hgod.a(((ProtoLiteMessage)hgoc.a).v_newBuilder());
            long v = Long.parseLong(featureDropsProofingChimeraActivity0.o());
            ProtoLiteBuilder hftp0 = hgoe0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgoc hgoc0 = (hgoc)hftp0.b_message;
            hgoc0.b |= 1;
            hgoc0.c = v;
            if(featureDropsProofingChimeraActivity0.getIntent() == null) {
                ((ggtj)featureDropsProofingChimeraActivity0.q.j()).x("Empty intent.");
            }
            else if(featureDropsProofingChimeraActivity0.getIntent().hasExtra("experiment_group_id")) {
                Long long0 = featureDropsProofingChimeraActivity0.getIntent().getLongExtra("experiment_group_id", 0L);
                if(long0.longValue() != 0L) {
                    number0 = long0;
                }
            }
            else {
                Uri uri0 = featureDropsProofingChimeraActivity0.getIntent().getData();
                if(uri0 != null) {
                    String s2 = uri0.getQueryParameter("experiment_group_id");
                    if(s2 != null) {
                        number0 = ibzk.g(s2);
                    }
                }
            }
            int v1 = 2;
            if(number0 != null) {
                long v2 = number0.longValue();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgoc hgoc1 = (hgoc)hftp0.b_message;
                hgoc1.b |= 2;
                hgoc1.d = v2;
            }
            String s3 = featureDropsProofingChimeraActivity0.A("experiment_arm_name");
            if(s3 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgoc hgoc2 = (hgoc)hftp0.b_message;
                hgoc2.b |= 4;
                hgoc2.e = s3;
            }
            String s4 = featureDropsProofingChimeraActivity0.A("sub_type_key");
            if(s4 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgoc hgoc3 = (hgoc)hftp0.b_message;
                hgoc3.b |= 8;
                hgoc3.f = s4;
            }
            hgoc hgoc4 = hgoe0.a();
            boolean z = featureDropsProofingChimeraActivity0.I("show_only_eligible_features");
            ibuq.f(s, "accountName");
            ibuq.f(hgoc4, "campaignContext");
            bvns bvns0 = new bvns(s, hgoc4, null, s1, null, 20);
            bvpl bvpl0 = bvnu0.c;
            hgoi hgoi0 = hgoi.a;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgoi0).v_newBuilder();
            ibuq.f(hftp1, "builder");
            hgoc hgoc5 = bvns0.b;
            ibuq.f(hgoc5, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgoi hgoi1 = (hgoi)hftp1.b_message;
            hgoc5.getClass();
            hgoi1.c = hgoc5;
            hgoi1.b |= 1;
            switch(bvnu0.b().ordinal()) {
                case 1: {
                    hgnn0 = hgnn.c;
                    break;
                }
                case 2: {
                    hgnn0 = hgnn.b;
                    break;
                }
                default: {
                    hgnn0 = hgnn.a;
                }
            }
            ibuq.f(hgnn0, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgoi hgoi2 = (hgoi)hftp1.b_message;
            hgoi2.e = hgnn0.a();
            hgoi2.b |= 4;
            String s5 = bvns0.d == null ? "" : bvns0.d;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((hgoi)hftv0).b |= 8;
            ((hgoi)hftv0).f = s5;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgoi hgoi3 = (hgoi)hftp1.b_message;
            hgoi3.b |= 16;
            hgoi3.g = z;
            hgnp hgnp0 = bvnu0.a();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgml.a).v_newBuilder();
            int v3 = hgnp0.b;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            ((hgml)hftv1).b = v3;
            String s6 = hgnp0.c;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            s6.getClass();
            ((hgml)hftv2).c = s6;
            String s7 = hgnp0.d;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp2.b_message;
            s7.getClass();
            ((hgml)hftv3).d = s7;
            int v4 = hgnp0.e;
            if(!hftv3.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp2.b_message;
            ((hgml)hftv4).e = v4;
            boolean z1 = hgnp0.f;
            if(!hftv4.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp2.b_message;
            ((hgml)hftv5).f = z1;
            int v5 = hgnp0.g;
            if(!hftv5.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp2.b_message;
            ((hgml)hftv6).g = v5;
            String s8 = hgnp0.h;
            if(!hftv6.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv7 = hftp2.b_message;
            s8.getClass();
            ((hgml)hftv7).h = s8;
            String s9 = hgnp0.i;
            if(!hftv7.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv8 = hftp2.b_message;
            s9.getClass();
            ((hgml)hftv8).i = s9;
            String s10 = hgnp0.j;
            if(!hftv8.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv9 = hftp2.b_message;
            s10.getClass();
            ((hgml)hftv9).j = s10;
            String s11 = hgnp0.k;
            if(!hftv9.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv10 = hftp2.b_message;
            s11.getClass();
            ((hgml)hftv10).k = s11;
            String s12 = hgnp0.l;
            if(!hftv10.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv11 = hftp2.b_message;
            s12.getClass();
            ((hgml)hftv11).l = s12;
            int v6 = hgnp0.m;
            if(!hftv11.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv12 = hftp2.b_message;
            ((hgml)hftv12).m = v6;
            int v7 = hgnp0.n;
            if(!hftv12.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv13 = hftp2.b_message;
            ((hgml)hftv13).n = v7;
            int v8 = hgnp0.o;
            if(!hftv13.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv14 = hftp2.b_message;
            ((hgml)hftv14).o = v8;
            String s13 = hgnp0.p;
            if(!hftv14.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv15 = hftp2.b_message;
            s13.getClass();
            ((hgml)hftv15).p = s13;
            String s14 = hgnp0.q;
            if(!hftv15.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv16 = hftp2.b_message;
            s14.getClass();
            ((hgml)hftv16).q = s14;
            String s15 = hgnp0.r;
            if(!hftv16.isImmutable()) {
                hftp2.ensureMutable();
            }
            hgml hgml0 = (hgml)hftp2.b_message;
            s15.getClass();
            hgml0.r = s15;
            hgml hgml1 = (hgml)hftp2.N_build();
            ibuq.e(hgml1, "apply(...)");
            ibuq.f(hgml1, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgoi hgoi4 = (hgoi)hftp1.b_message;
            hgml1.getClass();
            hgoi4.d = hgml1;
            hgoi4.b |= 2;
            ProtoLiteMessage hftv17 = hftp1.N_build();
            ibuq.e(hftv17, "build(...)");
            ibuq.f(((hgoi)hftv17), "request");
            ibuq.f(bvns0.a, "accountName");
            bvpn bvpn0 = new bvpn(bvpl0.a, cmlp.a, ckhs.b);
            baqr baqr0 = bvpl.a(bvns0.a);
            if(bvpn.c == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)hgoi0));
                ibjh ibjh1 = new ibjh(((MessageLite)hgoj.a));
                bvpn.c = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.googlegrowth.flexagon.v1.FlexagonApi/GetProofingFlow", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            hgoj hgoj0 = (hgoj)bvpn0.d.callUnaryWithAuth(bvpn.c, baqr0, ((hgoi)hftv17), ((long)bvpn.a), TimeUnit.MILLISECONDS, bvpn0.e);
            hgok hgok0 = hgoj0.b == null ? hgok.a : hgoj0.b;
            if((hgok0.b == 1 ? ((hgmr)hgok0.c) : hgmr.a).b.isEmpty()) {
                ((ggtj)bvnu.a.i()).x("Empty backend response");
            }
            else {
                hgok hgok1 = hgoj0.b == null ? hgok.a : hgoj0.b;
                hfuo hfuo0 = (hgok1.b == 1 ? ((hgmr)hgok1.c) : hgmr.a).b;
                bvnu0.e.a(hfuo0);
                bvnu0.d.a(hfuo0);
                v1 = 0;
            }
            featureDropsProofingChimeraActivity0.runOnUiThread(new bvng(v1, featureDropsProofingChimeraActivity0));
        }
        catch(Exception exception0) {
            featureDropsProofingChimeraActivity0.runOnUiThread(new bvnh(featureDropsProofingChimeraActivity0, exception0));
        }
    }
}

