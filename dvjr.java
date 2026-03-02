import android.os.SystemClock;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import java.util.HashMap;
import java.util.Map;

public final class dvjr {
    public final bboh a;
    public final gmcg b;
    public final dvit c;
    private static final Map d;
    private final dvgv e;

    static {
        dvjr.d = new HashMap();
    }

    public dvjr(dvgv dvgv0, gmcg gmcg0, dvit dvit0) {
        this.a = bboh.b("Pay", bbcu.cZ);
        this.e = dvgv0;
        this.b = gmcg0;
        this.c = dvit0;
    }

    public final void a(String s, ValuableGroup valuableGroup0) {
        if(hwrq.c() != 0L) {
            long v = SystemClock.elapsedRealtime();
            ggdy ggdy0 = new ggdy();
            gged_interceptors gged0 = valuableGroup0.a;
            int v1 = gged0.size();
            int v2 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                Valuable valuable0 = (Valuable)gged0.get(v3);
                String s1 = valuable0.b;
                Map map0 = dvjr.d;
                Long long0 = (Long)map0.get(s1);
                if(valuable0.x && (long0 == null || v - ((long)long0) >= hwrq.c())) {
                    ggdy0.i(s1);
                    map0.put(s1, Long.valueOf(v));
                }
            }
            gged_interceptors gged1 = ggdy0.h();
            if(!gged1.isEmpty()) {
                dvgv dvgv0 = this.e;
                dvjq dvjq0 = new dvjq(this);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjwr.a).v_newBuilder();
                switch(dvgv0.f.a().d) {
                    case 0: {
                        v2 = 2;
                        break;
                    }
                    case 1: {
                        v2 = 3;
                        break;
                    }
                    case 2: {
                        v2 = 4;
                    }
                }
                if(v2 == 0) {
                    v2 = 1;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hjwr hjwr0 = (hjwr)hftp0.b_message;
                hjwr0.d = hjxb.a(v2);
                hjwr hjwr1 = (hjwr)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvdr.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s.getClass();
                ((gvdr)hftv0).d = s;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                hjwr1.getClass();
                ((gvdr)hftv1).e = hjwr1;
                ((gvdr)hftv1).b |= 1;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gvdr gvdr0 = (gvdr)hftp1.b_message;
                hfuo hfuo0 = gvdr0.c;
                if(!hfuo0.c()) {
                    gvdr0.c = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(gged1, gvdr0.c);
                gvdr gvdr1 = (gvdr)hftp1.N_build();
                dptv.l(dvgv0.d, dpuj.bd, ((MessageLite)gvdr1), ((MessageLite)gvds.a), dvjq0);
            }
        }
    }
}

