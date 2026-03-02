import android.content.Context;
import android.net.wifi.WifiManager;

public final class czld {
    public final czvk a;
    public final czrl b;
    public final dadn c;
    public final czlo d;
    public final czph e;
    public final czri f;
    public final dabo g;
    public final dacj h;
    public final czzs i;
    public final daar j;
    public final czmm k;
    public final czln l;
    public final czxc m;
    public final czvb n;
    public final czva o;
    public final czut p;
    public final czuz q;
    public final czly r;
    public final czkc s;
    public final dacl t;

    public czld(Context context0) {
        Context context1 = context0.getApplicationContext();
        if(bbqa.c()) {
            try {
                context1 = cjmg.a(context1, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            }
            catch(SecurityException securityException0) {
                czkq.a.c().f(securityException0).p("Failed to renounce location permissions.", new Object[0]);
            }
        }
        czvk czvk0 = new czvk();
        this.a = czvk0;
        this.b = new czrl(context0, czvk0);
        dadn dadn0 = new dadn(context1, czvk0);
        this.c = dadn0;
        this.d = new czlo(context0);
        this.e = new czph(context0, czvk0);
        this.f = new czri(context0, czvk0);
        this.g = new dabo(context1, dadn0, czvk0);
        dacl dacl0 = dack.a(context1);
        this.h = new dacj(context1, ((WifiManager)context1.getSystemService("wifi")), czvk0, new cuqs(context1), dacl0);
        this.i = new czzs(context1, czvk0);
        this.j = new daar(context1, dadn0, czvk0);
        czos czos0 = hvol.a.r().cH() ? new czos(context0, czvk0) : new czno(context0, czvk0);
        this.k = czos0;
        this.l = new czln(context0);
        this.m = new czxc(context1);
        this.n = new czvb(context1, czvk0);
        this.o = new czva(context1, czvk0);
        this.p = new czut(context1, czvk0);
        this.q = new czuz(context1, czvk0);
        this.r = new czly(context0);
        this.s = czkc.b(context1);
        dacl dacl1 = dack.a(context1);
        this.t = dacl1;
        dacl1.p();
        dacl1.o();
        dacl1.q();
    }
}

