import android.accounts.Account;
import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.util.Base64;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class cqig {
    public static volatile cqig a;
    public final ckcq b;
    public final cqif c;
    public final hnos d;
    private final ckcq e;
    private final hnos f;
    private final cqim g;

    public cqig(Context context0, ckcq ckcq0, ckcq ckcq1, cqif cqif0, cqim cqim0) {
        hnos hnos2;
        String s1;
        String s;
        this.b = ckcq0;
        this.e = ckcq1;
        this.c = cqif0;
        hnok hnok0 = new hnok();
        fhbw fhbw0 = new fhbw();
        fhbw0.a(hnok0);
        fhad fhad0 = fhae.a();
        fhad0.b(context0);
        fhae fhae0 = fhad0.a();
        gphc gphc0 = gphd.a();
        gphc0.b(2.0);
        gphc0.c(1.0f);
        gphc0.d(2);
        gphc0.e(60.0f);
        gphc0.f(gged_interceptors.l(iaph.o));
        gphg gphg0 = gphf.a(new ggoh(gphb.a("google.internal.fmd.FmdApiService", gphc0.a())));
        cmly cmly0 = cmma.c(fhae0, fhbw0);
        cmly0.a(gphg0);
        hnos hnos0 = hnot.a(cmma.e(new cmlz(cmly0), 6150, -1).a(hnpg.n));
        iakp iakp0 = gpho.a;
        switch(hxvi.a.e().f()) {
            case "autopush": {
                s = "autopush-findmydevice-pa.sandbox.googleapis.com";
                break;
            }
            case "staging": {
                s = "staging-findmydevice-pa.sandbox.googleapis.com";
                break;
            }
            default: {
                s = "findmydevice-pa.googleapis.com";
            }
        }
        hnos hnos1 = (hnos)hnos0.q(iakp0, s);
        List list0 = bbmn.h(context0, "com.google.android.gms");
        if(list0.isEmpty()) {
            cqqt.d("No accounts found for FMD API", new Object[0]);
            s1 = null;
        }
        else {
            s1 = ((Account)list0.get(0)).name;
        }
        if(gfta.c(s1)) {
            hnos2 = hnos1;
        }
        else {
            gpie gpie0 = new gpie(null);
            gpie0.b(new ggoh("https://www.googleapis.com/auth/android_device_manager"));
            gpig gpig0 = new gpig(gpie0.a());
            hnos hnos3 = (hnos)hnos1.q(gpji.g, gpig0);
            gphs gphs0 = new gphs(s1, "google");
            hnos2 = (hnos)hnos3.q(gphs.a, gphs0);
        }
        this.d = hnos2;
        Preconditions.b(context0);
        gpir gpir0 = new gpir(((gpiq)DoubleCheck.b(new gpil(DoubleCheck.b(new gpik(InstanceFactory.a(context0))))).get()));
        hnos hnos4 = (hnos)hnos1.q(gpji.g, gpir0);
        gpjh gpjh0 = gpjg.a("AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        hnos hnos5 = (hnos)hnos4.q(gpji.g, gpjh0);
        gphs gphs1 = new gphs(null, "pseudonymous");
        this.f = (hnos)hnos5.q(gphs.a, gphs1);
        this.g = cqim0;
    }

    public final gmcd a(hltz[] arr_hltz, Location location0, hltp hltp0, hltq hltq0, String s, hltu hltu0, boolean z) {
        cqqt.c("Sending remote payload with xrpc: [%s, %s]", new Object[]{Arrays.toString(arr_hltz), s});
        hlua hlua0 = hlua.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlua0).v_newBuilder();
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlua hlua1 = (hlua)hftp0.b_message;
            s.getClass();
            hlua1.b |= 2;
            hlua1.d = s;
        }
        List list0 = Arrays.asList(arr_hltz);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlua hlua2 = (hlua)hftp0.b_message;
        hfuf hfuf0 = hlua2.e;
        if(!hfuf0.c()) {
            hlua2.e = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: list0) {
            hlua2.e.i(((hltz)object0).P);
        }
        Iterator iterator1 = Arrays.asList(arr_hltz).iterator();
        while(true) {
            if(!iterator1.hasNext()) {
                if(location0 != null) {
                    List list1 = Arrays.asList(arr_hltz);
                    if(!list1.isEmpty() && list1.get(0) == hltz.a) {
                        hgzq hgzq0 = cqil.a(hgzp.g, this.g.a);
                        cewk.v().j(((ProtoLiteMessage)hgzq0));
                    }
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlts.a).v_newBuilder();
                    float f = location0.getAccuracy();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hlts hlts0 = (hlts)hftp1.b_message;
                    hlts0.b |= 4;
                    hlts0.e = f;
                    double f1 = location0.getLatitude();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hlts hlts1 = (hlts)hftp1.b_message;
                    hlts1.b |= 2;
                    hlts1.d = f1;
                    double f2 = location0.getLongitude();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hlts hlts2 = (hlts)hftp1.b_message;
                    hlts2.b |= 1;
                    hlts2.c = f2;
                    long v1 = location0.getTime();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hlts hlts3 = (hlts)hftp1.b_message;
                    hlts3.b |= 16;
                    hlts3.f = v1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlua hlua3 = (hlua)hftp0.b_message;
                    hlts hlts4 = (hlts)hftp1.N_build();
                    hlts4.getClass();
                    hlua3.c = hlts4;
                    hlua3.b |= 1;
                }
                if(hltu0 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hlua)hftp0.b_message).f = hltu0;
                    ((hlua)hftp0.b_message).b |= 8;
                }
                if(hltp0 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hlua)hftp0.b_message).g = hltp0;
                    ((hlua)hftp0.b_message).b |= 16;
                }
                if(hltq0 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hlua)hftp0.b_message).h = hltq0;
                    ((hlua)hftp0.b_message).b |= 0x20;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlua hlua4 = (hlua)hftp0.b_message;
                hlua4.b |= 0x40;
                hlua4.i = z;
                break;
            }
            Object object1 = iterator1.next();
            int v = ((hltz)object1).ordinal();
            if(v == 1 || v == 2 || (v == 7 || v == 8) || (v == 9 || v == 11 || v == 13 || v == 22 || v == 40)) {
                break;
            }
        }
        if(hxvi.n()) {
            cqqt.c("sendRemotePayloadData %s", new Object[]{Base64.encodeToString(((hlua)hftp0.N_build()).toBytesArray(), 2)});
        }
        hnos hnos0 = (hnos)this.f.q(cmlp.a, this.e);
        hlua hlua5 = (hlua)hftp0.N_build();
        iakr iakr0 = hnos0.a;
        gRPCMethodDescriptor iaoj0 = hnot.b;
        if(iaoj0 == null) {
            synchronized(hnot.class) {
                iaoj0 = hnot.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.fmd.FmdApiService", "RemotePayload");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlua0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlub.a));
                    iaoj0 = iaog0.build();
                    hnot.b = iaoj0;
                }
            }
        }
        gmcd gmcd0 = ibjw.a(iakr0.a(iaoj0, hnos0.b), hlua5);
        cqid cqid0 = new cqid();
        return glyi.g(gmcd0, Exception.class, cqid0, gmap.a);
    }

    public static void b(String s, Throwable throwable0) {
        while((throwable0 instanceof ExecutionException) && throwable0.getCause() != null) {
            throwable0 = throwable0.getCause();
        }
        if((throwable0 instanceof iapn)) {
            String s1 = ((iapn)throwable0).a.t.name();
            String s2 = ((iapn)throwable0).a.u;
            if(s2 == null) {
                s2 = "";
            }
            cqqt.a("Failed to call %s with error: %s, %s", new Object[]{s, s1, s2});
            return;
        }
        cqqt.b(throwable0, "Failed to send %s", new Object[]{s});
    }
}

