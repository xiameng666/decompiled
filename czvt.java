import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class czvt implements Runnable {
    public final czwf a;
    public final byte[] b;
    public final String c;
    public final gytu d;

    public czvt(czwf czwf0, byte[] arr_b, String s, gytu gytu0) {
        this.a = czwf0;
        this.b = arr_b;
        this.c = s;
        this.d = gytu0;
    }

    @Override
    public final void run() {
        gmcu gmcu0;
        byte[] arr_b;
        gytq gytq0 = this.d.c == 3 ? ((gytq)this.d.d) : gytq.a;
        Map map0 = this.a.e;
        Iterator iterator0 = map0.keySet().iterator();
    alab1:
        while(true) {
            do {
                arr_b = this.b;
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                String s = (String)object0;
                if(!Arrays.equals(arr_b, czvl.c(s, this.c))) {
                    continue alab1;
                }
                gmcu0 = (gmcu)map0.get(s);
            }
            while(gmcu0 == null);
            gmcu0.q((gytp.b(gytq0.c) == null ? gytp.a : gytp.b(gytq0.c)));
            return;
        }
        czkq.a.e().i("[%s] Received a CONNECTION_RESPONSE frame but no client waiting for service ID Hash Key %s.", "MultiplexSocket", bbmu.c(arr_b));
    }
}

