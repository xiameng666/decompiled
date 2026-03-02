import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dxhu {
    public static final int a;
    private static final bboh b;

    static {
        dxhu.b = bboh.b("Pay", bbcu.cZ);
    }

    public static final boolean a(String s, String s1) {
        ibuq.f(s, "packageName");
        ibuq.f(s1, "accountName");
        return hwqe.a.b().c() && (!hwqe.a.b().d() || !s.equals("com.google.android.gms") && !s.equals("com.google.android.gms.apitest.pay.test_target") && !s.equals("com.google.android.apps.walletnfcrel") && !s.equals("com.google.commerce.tapandpay.dev")) ? dxhu.b(ccug.a(s), s1) : true;
    }

    private static final boolean b(int v, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfnk.b).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfnk)hftp0.b_message).c |= 8;
        ((hfnk)hftp0.b_message).g = v;
        hfnh hfnh0 = hflf.a(((hfnk)hftp0.N_build()));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfnp.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfng.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hfng hfng0 = (hfng)hftp2.b_message;
        s.getClass();
        hfng0.b |= 2;
        hfng0.c = s;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfnp hfnp0 = (hfnp)hftp1.b_message;
        hfng hfng1 = (hfng)hftp2.N_build();
        hfng1.getClass();
        hfnp0.c = hfng1;
        hfnp0.b |= 1;
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        hfnp hfnp1 = (hfnp)hftv0;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfnl.a).v_newBuilder();
        hfnn hfnn0 = (hfnn)((ProtoLiteMessage)hfno.a).v_newBuilder();
        hwqe hwqe0 = hwqe.a;
        hfnn0.a(((int)hwqe0.b().a()));
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hfnl hfnl0 = (hfnl)hftp3.b_message;
        hfno hfno0 = (hfno)((ProtoLiteBuilder)hfnn0).N_build();
        hfno0.getClass();
        hfnl0.c = hfno0;
        hfnl0.b |= 1;
        ProtoLiteMessage hftv1 = hftp3.N_build();
        ibuq.e(hftv1, "build(...)");
        hfnl hfnl1 = (hfnl)hftv1;
        hftr hftr0 = (hftr)((ProtoLiteMessage)hfni.a).v_newBuilder();
        hftr0.do(hfmf.a);
        ProtoLiteMessage hftv2 = ((ProtoLiteBuilder)hftr0).N_build();
        ibuq.e(hftv2, "build(...)");
        hfni hfni0 = (hfni)hftv2;
        try {
            return ((hfnm)cjwk.a.a(hfnh0, hfnp1, hfnl1, hfni0).get(hwqe0.b().b(), TimeUnit.SECONDS)).c;
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dxhu.b.j(), "Error getting policy due to InterruptedException.", interruptedException0);
            return false;
        }
        catch(ExecutionException executionException0) {
            a.ae(dxhu.b.j(), "Error getting policy due to ExecutionException.", executionException0);
            return false;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dxhu.b.j(), "Error getting policy due to timeout.", timeoutException0);
            return false;
        }
    }
}

