import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public final class czvs implements Runnable {
    public final czwf a;
    public final byte[] b;
    public final String c;

    public czvs(czwf czwf0, byte[] arr_b, String s) {
        this.a = czwf0;
        this.b = arr_b;
        this.c = s;
    }

    @Override
    public final void run() {
        String s3;
        czwf czwf0 = this.a;
        if(czwf0.o()) {
            byte[] arr_b = this.b;
            String s = bbmu.c(arr_b);
            ggpj ggpj0 = czwf.a;
            Iterator iterator0 = ggpj0.h().iterator();
            String s1 = null;
            czwe czwe0 = null;
            String s2 = s;
            while(true) {
                s3 = this.c;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                String s4 = (String)object0;
                if(Arrays.equals(arr_b, czvl.c(s4, s3))) {
                    czwe czwe1 = (czwe)ggpj0.a(s4, Integer.valueOf(czwf0.b.a()));
                    if(czwe1 != null) {
                        s1 = s4;
                        czwe0 = czwe1;
                    }
                }
            }
            try {
                if(czwe0 != null && s1 != null) {
                    czkq.a.b().l("[%s] Accept new virtual socket request service ID : %s, hash salt : %s, hash key : %s on medium %d", "MultiplexSocket", s1, s3, s2, Integer.valueOf(czwf0.b.a()));
                    czwf0.c.d(arr_b, s3, gytp.b);
                    czkq.a.d().j("[%s] establishVirtualSocket after local device accept the connection with serviceId=%s, serviceIdHashSalt=%s", "MultiplexSocket", s1, s3);
                    czwe0.a(s1, czwf0.a(s1, s3));
                    return;
                }
                cunf cunf0 = czkq.a;
                cunf cunf1 = cunf0.b();
                Integer integer0 = czwf0.b.a();
                try {
                    cunf1.k("[%s] There\'s no client listening for hash salt : %s, hash key : %s, on medium : %d", "MultiplexSocket", s3, s2, integer0);
                    s2 = s2;
                }
                catch(IOException iOException0) {
                    s2 = s2;
                    goto label_38;
                }
                cunf0.b().i("[%s] Dump incomingConnectionCallbacks : %s", "MultiplexSocket", ggpj0.toString());
                czwf0.c.d(arr_b, s3, gytp.c);
                return;
            }
            catch(IOException iOException0) {
            }
        label_38:
            czkq.a.c().f(iOException0).i("[%s] Failed to send a CONNECTION_RESPONSE frame for service ID Hash Key %s.", "MultiplexSocket", s2);
            return;
        }
        czkq.a.e().i("[%s] Received a CONNECTION_REQUEST frame on medium %d but status is disabled, ignore it.", "MultiplexSocket", Integer.valueOf(czwf0.b.a()));
    }
}

