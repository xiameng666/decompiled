import android.content.Context;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import java.util.ArrayList;

public final class epzt implements Runnable {
    public final epzx a;
    public final boolean b;
    public final evql c;
    public final evql d;
    public final gmcd e;

    public epzt(epzx epzx0, boolean z, evql evql0, evql evql1, gmcd gmcd0) {
        this.a = epzx0;
        this.b = z;
        this.c = evql0;
        this.d = evql1;
        this.e = gmcd0;
    }

    @Override
    public final void run() {
        epzx epzx0 = this.a;
        if(epzx0.o) {
            baun baun0 = epzx.f;
            baun0.h("Starting Fido flow.", new Object[0]);
            ArrayList arrayList0 = epzx0.j.g;
            if(epzx0.n == null) {
                epzx0.n = new eqcp(epzx0.g, epzx0.p);
            }
            Context context0 = epzx0.g;
            String s = context0.getResources().getQuantityString(0x7F130096, arrayList0.size());  // plurals:smartdevice_d2d_copying_accounts
            epzx0.q.e(s);
            if(epzx0.j.f) {
                epzx0.n.d(arrayList0);
            }
            else {
                epzx0.n.c(arrayList0);
            }
            epzx0.h.z(8);
            epzx0.h.s(4);
            erqh.a();
            String s1 = erqi.a(context0);
            if(s1 == null) {
                baun0.d("Backup account not found.", new Object[0]);
                if(!hyig.a.c().d()) {
                    s1 = "";
                }
            }
            else {
                baun0.d("Backup enabled with account: " + s1, new Object[0]);
            }
            String s2 = Long.toHexString(bbmq.d(context0));
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.ai(s);
            messagePayload0.x(5);
            messagePayload0.am(new SecondDeviceAuthPayload(s1, s2));
            epzx0.n(messagePayload0);
        }
        if(this.b) {
            epzx0.m.c(epzx0.o);
        }
        else if(!epzx0.o) {
            epzx0.l.c();
        }
        evql evql0 = this.c;
        if(evql0 != null) {
            epzx.f.d("Fetching managed account state", new Object[0]);
            bbre bbre0 = new bbre(epzx0.c);
            evql0.v(bbre0, new epzr(epzx0));
            evql0.y(bbre0, new epzs(epzx0));
        }
        evql evql1 = this.d;
        if(evql1 != null) {
            evql1.s(new bbre(epzx0.c), new epzp(epzx0));
        }
        gmcd gmcd0 = this.e;
        if(gmcd0 != null) {
            gmcd0.hB(new epzu(epzx0, gmcd0), new bbre(epzx0.c));
        }
    }
}

