import android.net.NetworkCapabilities;
import java.util.concurrent.TimeUnit;

public final class egym {
    public static egym a;
    public final ehjx b;
    private static long c;

    static {
    }

    private egym() {
        this.b = ehjh.a;
        egym.c = 0L;
    }

    public static egym a() {
        synchronized(egym.class) {
            if(egym.a == null) {
                egym.a = new egym();
            }
        }
        return egym.a;
    }

    public static int b(NetworkCapabilities networkCapabilities0) {
        if(networkCapabilities0 == null) {
            return 1;
        }
        if(networkCapabilities0.hasTransport(1)) {
            return 2;
        }
        if(networkCapabilities0.hasTransport(0)) {
            return 8;
        }
        if(networkCapabilities0.hasTransport(2)) {
            return 9;
        }
        return networkCapabilities0.hasTransport(3) ? 7 : 1;
    }

    public static void c(int v, int v1, String s) {
        if(hwzm.a.b().f() && System.currentTimeMillis() - egym.c <= TimeUnit.SECONDS.toMillis(hwzm.a.b().c())) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gioz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gioz)hftv0).c = 1;
        ((gioz)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gioz)hftv1).d = v - 1;
        ((gioz)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gioz)hftp0.b_message).e = v1 - 1;
        ((gioz)hftp0.b_message).b |= 4;
        gioz gioz0 = (gioz)hftp0.N_build();
        efpr.a().d(gioz0, s);
        egym.c = System.currentTimeMillis();
    }
}

