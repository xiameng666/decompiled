import android.net.Uri.Builder;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;

public final class fdxw implements Runnable {
    public final fdxz a;
    public final String b;
    public final String c;

    public fdxw(fdxz fdxz0, String s, String s1) {
        this.a = fdxz0;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final void run() {
        AtomicReference atomicReference0 = this.a.d;
        fdvl fdvl0 = (fdvl)atomicReference0.get();
        String s = this.b;
        fcez fcez0 = fdur.c(fdvl0, s, "/enrolled");
        if(fcez0 != null) {
            String s1 = this.c;
            String s2 = fcez0.e("networkId", "absent");
            if(!s2.equals(s1)) {
                ffmn.f("pairingservice", "Not deleting enrolled dataitem as present network ID %s does not match expected network ID %s", new Object[]{s2, s1});
                return;
            }
            fdpl fdpl0 = ffgp.a;
            Uri uri0 = new Uri.Builder().scheme("wear").authority(s).path("/enrolled").build();
            ((fdvl)atomicReference0.get()).j(fdpl0, uri0, false);
        }
    }
}

