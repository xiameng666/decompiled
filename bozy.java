import android.accounts.Account;
import com.google.android.gms.findmydevice.spot.locationreporting.LocationReportUploadIntentOperation;
import java.util.concurrent.TimeUnit;

public final class bozy implements glzn {
    public final LocationReportUploadIntentOperation a;
    public final boolean b;
    public final int c;
    public final gfsx d;
    public final String e;
    public final boolean f;
    public final bhmw g;

    public bozy(LocationReportUploadIntentOperation locationReportUploadIntentOperation0, boolean z, int v, gfsx gfsx0, String s, boolean z1, bhmw bhmw0) {
        this.a = locationReportUploadIntentOperation0;
        this.b = z;
        this.c = v;
        this.d = gfsx0;
        this.e = s;
        this.f = z1;
        this.g = bhmw0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        LocationReportUploadIntentOperation locationReportUploadIntentOperation0 = this.a;
        String s = this.e;
        int v = this.c;
        if(this.b) {
            ((ggtj)((ggtj)((ggtj)LocationReportUploadIntentOperation.a.h()).o(5, TimeUnit.MINUTES)).ar(4841)).x("Uploading owner sightings.");
            Account account0 = (Account)this.d.d();
            locationReportUploadIntentOperation0.c.a(bbdg.iR);
            boov boov0 = locationReportUploadIntentOperation0.c(account0);
            gtck gtck0 = gtcl.a(((gpgz)boov0.S.get()).a(gteg.d));
            String s1 = hojd.c();
            gtck gtck1 = (gtck)gtck0.q(gpho.a, s1);
            gpig gpig0 = gpig.b();
            gtck gtck2 = (gtck)((gtck)((gtck)gtck1.q(gpji.g, gpig0)).q(gphs.a, new gphs((boov0.a == null || gfta.c(boov0.a.name) ? "no-account" : boov0.a.name), "google"))).q(cmlp.a, ckfl.b);
            gtdt gtdt0 = gtdt.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtdt0).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gtdt gtdt1 = (gtdt)hftp0.b_message;
            ((ByteString)object0).getClass();
            gtdt1.b = (ByteString)object0;
            gtdt gtdt2 = (gtdt)hftp0.N_build();
            iakr iakr0 = gtck2.a;
            gRPCMethodDescriptor iaoj0 = gtcl.b;
            if(iaoj0 == null) {
                synchronized(gtcl.class) {
                    iaoj0 = gtcl.b;
                    if(iaoj0 == null) {
                        gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                        iaog0.methodType = gRPCMethodType.a;
                        iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotReportingService", "UploadOwnerScans");
                        iaog0.setSampledToLocalTracing();
                        iaog0.requestMarshaller = new ibjh(((MessageLite)gtdt0));
                        iaog0.responseMarshaller = new ibjh(((MessageLite)gtdu.a));
                        gRPCMethodDescriptor iaoj1 = iaog0.build();
                        gtcl.b = iaoj1;
                        iaoj0 = iaoj1;
                    }
                }
            }
            gdta gdta0 = gdta.g(gdta.g(bnka.a(ibjw.a(iakr0.a(iaoj0, gtck2.b), gtdt2), "uploadOwnerScans")).h(new bnlh(), gmap.a));
            bpaa bpaa0 = new bpaa(s, v);
            return gdta0.f(Throwable.class, bpaa0, gmap.a).h(new bpab(s, v), gmap.a);
        }
        ((ggtj)((ggtj)((ggtj)LocationReportUploadIntentOperation.a.h()).o(5, TimeUnit.MINUTES)).ar(4839)).x("Uploading crowdsourced sightings.");
        ggeo ggeo0 = ggeo.l("encryptedBatchData", hfxi.a(((ByteString)object0), ghjc.d));
        String s2 = this.g.a(ggeo0);
        locationReportUploadIntentOperation0.c.a(bbdg.iQ);
        gtck gtck3 = (gtck)locationReportUploadIntentOperation0.i.a.q(cmlp.a, ckfa.b);
        gtdz gtdz0 = gtdz.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtdz0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        boolean z = this.f;
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gtdz)hftv0).b = z;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((ByteString)object0).getClass();
        ((gtdz)hftv1).c = (ByteString)object0;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtdz gtdz1 = (gtdz)hftp1.b_message;
        s2.getClass();
        gtdz1.d = s2;
        gtdz gtdz2 = (gtdz)hftp1.N_build();
        iakr iakr1 = gtck3.a;
        gRPCMethodDescriptor iaoj2 = gtcl.a;
        if(iaoj2 == null) {
            synchronized(gtcl.class) {
                iaoj2 = gtcl.a;
                if(iaoj2 == null) {
                    gRPCMethodDescriptorBuilder iaog1 = gRPCMethodDescriptor.newBuilder();
                    iaog1.methodType = gRPCMethodType.a;
                    iaog1.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.spot.v1.SpotReportingService", "UploadScans");
                    iaog1.setSampledToLocalTracing();
                    iaog1.requestMarshaller = new ibjh(((MessageLite)gtdz0));
                    iaog1.responseMarshaller = new ibjh(((MessageLite)gteb.a));
                    gRPCMethodDescriptor iaoj3 = iaog1.build();
                    gtcl.a = iaoj3;
                    iaoj2 = iaoj3;
                }
            }
        }
        gdta gdta1 = gdta.g(gdta.g(bnka.a(ibjw.a(iakr1.a(iaoj2, gtck3.b), gtdz2), "uploadScans")));
        bozu bozu0 = new bozu(z, s, v);
        return gdta1.f(Throwable.class, bozu0, gmap.a).i(new bozv(locationReportUploadIntentOperation0, z, s, v), locationReportUploadIntentOperation0.h);
    }
}

