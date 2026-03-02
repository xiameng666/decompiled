import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.kids.AppContextProvider;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

final class cbnz implements cbob {
    @Override  // cbob
    public final gvnc a(gvmz gvmz0, Context context0, String s, ckcq ckcq0, gvmk gvmk0, cboa cboa0) {
        Context context1 = context0;
        ibuq.f(gvmz0, "request");
        ibuq.f(context1, "context");
        ibuq.f(s, "accountName");
        ibuq.f(ckcq0, "collectionDefinition");
        ibuq.f(gvmk0, "apiRequestHeader");
        ibuq.f(cboa0, "rpcClientIdentifier");
        switch(cboa0.ordinal()) {
            case 0: {
                cbju.a(context0, s);
                cbod cbod0 = new cbod(s);
                cboh cboh0 = cboj.a;
                if(cboh.b == null) {
                    synchronized(cboh0) {
                        if(cboh.b == null) {
                            cboh.b = new cboi();
                        }
                    }
                }
                ggfp ggfp0 = ggfp.K(huip.d(), huip.c());
                ibuq.f(ggfp0, "scopes");
                if(context1 == null) {
                    context1 = AppContextProvider.a();
                    ibuq.e(context1, "getApplicationContext(...)");
                }
                gpie gpie0 = new gpie(null);
                gpie0.b(ggfp0);
                gpig gpig0 = new gpig(gpie0.a());
                fhbw fhbw0 = new fhbw();
                fhbw0.a(new cblz());
                fhad fhad0 = fhae.a();
                fhad0.b(context1);
                gvmx gvmx0 = (gvmx)gvmy.a(cmma.g(0x1A02, -1, fhad0.a(), fhbw0).a(gvqy.aS)).p(((iakw[])Arrays.copyOf(cboi.a(context1), 2)));
                String s1 = huip.e();
                gvmx gvmx1 = (gvmx)gvmx0.q(gpho.a, s1);
                gphs gphs0 = new gphs(cbod0.a, "google");
                gvmx gvmx2 = (gvmx)((gvmx)gvmx1.q(gphs.a, gphs0)).q(gpji.g, gpig0);
                fhbw fhbw1 = new fhbw();
                fhbw1.a(new cblz());
                fhad fhad1 = fhae.a();
                fhad1.b(context1);
                iakr iakr0 = cmma.g(0x1A02, -1, fhad1.a(), fhbw1).a(gvqy.aS);
                gvmw gvmw0 = (gvmw)((gvmw)gvmw.k(new gvmu(), iakr0)).p(((iakw[])Arrays.copyOf(cboi.a(context1), 2)));
                String s2 = huip.e();
                gvmw gvmw1 = (gvmw)gvmw0.q(gpho.a, s2);
                gphs gphs1 = new gphs(cbod0.a, "google");
                gvmw gvmw2 = (gvmw)((gvmw)((gvmw)gvmw1.q(gphs.a, gphs1)).q(gpji.g, gpig0)).q(cmlp.a, ckcq0);
                iakw[] arr_iakw = new iakw[1];
                ibuq.e(gvmk.d, "messageSetExtension");
                arr_iakw[0] = new gpmx(new cboc(((MessageLite)gvmk0), gvmk.d));
                gvmw gvmw3 = (gvmw)gvmw2.p(arr_iakw);
                iakr iakr1 = gvmw3.a;
                gRPCMethodDescriptor iaoj0 = gvmy.a;
                if(iaoj0 == null) {
                    synchronized(gvmy.class) {
                        iaoj0 = gvmy.a;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.kidsmanagement.v1.KidsManagementService", "ListMembers");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gvmz.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gvnc.a));
                            iaoj0 = iaog0.build();
                            gvmy.a = iaoj0;
                        }
                    }
                }
                gvnc gvnc0 = (gvnc)ibjw.b(iakr1, iaoj0, gvmw3.b, gvmz0);
                ibuq.e(gvnc0, "blockingCall(...)");
                return gvnc0;
            }
            case 1: {
                cbju.a(context0, s);
                ibuq.f(context1, "context");
                ibuq.f(s, "accountName");
                ibuq.f(gvmk0, "customizedApiHeader");
                ibuq.f(context1, "context");
                ibuq.f(s, "accountName");
                Account account0 = new Account(s, "com.google");
                baqr baqr0 = new baqr();
                baqr0.a = Process.myUid();
                baqr0.c = account0;
                baqr0.b = account0;
                baqr0.e = "com.google.android.gms";
                baqr0.d = "com.google.android.gms";
                String s3 = gpnb.a(((gvmk0 instanceof gvmk) ? 0xD4EB4DC : 0));
                batl.c(((boolean)(TextUtils.isEmpty(s3) ^ 1)), "name cannot be empty");
                batl.t(gvmk0, "message cannot be null");
                byte[] arr_b = ((MessageLite)gvmk0).toBytesArray();
                if(!baqr0.g.containsKey("binary_headers")) {
                    baqr0.g.putBundle("binary_headers", new Bundle());
                }
                baqr0.g.getBundle("binary_headers").putByteArray(s3, arr_b);
                for(Object object0: ibpo.g(new String[]{huip.d(), huip.c()})) {
                    baqr0.l(((String)object0));
                }
                cbnx cbnx0 = new cbnx(((cbnx)((cbjv)cbka.a.a()).a), cmlp.a, ckcq0);
                if(cbnx.a == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gvmz.a));
                    ibjh ibjh1 = new ibjh(((MessageLite)gvnc.a));
                    cbnx.a = new gRPCMethodDescriptor(gRPCMethodType.a, "google.kidsmanagement.v1.KidsManagementService/ListMembers", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gvnc gvnc1 = (gvnc)cbnx0.b.callUnaryWithAuth(cbnx.a, baqr0, gvmz0, 20000L, TimeUnit.MILLISECONDS, cbnx0.c);
                ibuq.e(gvnc1, "blockingCall(...)");
                return gvnc1;
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

