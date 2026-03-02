import android.text.TextUtils;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public final class bcsa implements bcsg {
    public static final baun a;
    public final BlockingQueue b;
    public final hofs c;
    public final bbxx d;
    public final bcrd e;
    public final bcsi f;
    private final bcse g;
    private long h;
    private final bcry i;

    static {
        bcsa.a = bcrh.a("verifier");
    }

    public bcsa(hofs hofs0, bbxx bbxx0, bcrd bcrd0, bcse bcse0) {
        ArrayBlockingQueue arrayBlockingQueue0 = new ArrayBlockingQueue(1);
        super();
        this.h = 0L;
        this.i = new bcry(this);
        this.c = hofs0;
        this.d = bbxx0;
        this.e = bcrd0;
        this.g = bcse0;
        this.b = arrayBlockingQueue0;
        this.f = new bcsi(bcqx.a(AppContextProvider.a()));
    }

    @Override  // bcsg
    public final hofs a() {
        hofs hofs0;
        baun baun0 = bcsa.a;
        baun0.j("do verification", new Object[0]);
        this.g.c(this.i);
        try {
            hoer hoer0 = this.c.c == 4 ? ((hoer)this.c.d) : hoer.a;
            hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
            hogd hogd0 = hobj0.g == null ? hogd.a : hobj0.g;
            long v = (hogd0.c == null ? hfwn.a : hogd0.c).b;
            hoer hoer1 = this.c.c == 4 ? ((hoer)this.c.d) : hoer.a;
            hobj hobj1 = hoer1.c == null ? hobj.a : hoer1.c;
            hogd hogd1 = hobj1.g == null ? hogd.a : hobj1.g;
            long v1 = v - (hogd1.d == null ? hfwn.a : hogd1.d).b;
            hofs0 = (hofs)this.b.poll(Math.min(hrfs.d(), v1), TimeUnit.SECONDS);
            baun0.j("Found verification %s", new Object[]{hofs0});
        }
        catch(InterruptedException interruptedException0) {
            this.g();
            this.f(gmfx.cm, "blocking queue failure");
            throw new bcrc("blocking queue failure", gmfx.aA, false, interruptedException0);
        }
        if(hofs0 != null) {
            this.g();
            if(hrel.c()) {
                bcrg.e();
                if(bcrg.d(hofs0)) {
                    this.f.f(this.e, 4, System.currentTimeMillis() - this.h);
                }
            }
            return hofs0;
        }
        this.g();
        this.f.a(this.e, this.c, gmfz.l);
        baun0.m("No message received in time", new Object[0]);
        hobo hobo0 = bcsa.e("", "");
        return this.d.j(this.e, this.c, hobo0);
    }

    @Override  // bcsg
    public final hofs b() {
        return this.c;
    }

    @Override  // bcsg
    public final String c() {
        hoer hoer0 = this.c.c == 4 ? ((hoer)this.c.d) : hoer.a;
        hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
        return (hobj0.e == null ? hobk.a : hobj0.e).b;
    }

    @Override  // bcsg
    public final void d() {
        this.h = System.currentTimeMillis();
        if(hrel.c()) {
            this.f.e(this.e, 4);
        }
    }

    public static hobo e(String s, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hoby.a).v_newBuilder();
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hoby hoby0 = (hoby)hftp0.b_message;
            s.getClass();
            hoby0.c = s;
        }
        if(!TextUtils.isEmpty(s1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hoby hoby1 = (hoby)hftp0.b_message;
            s1.getClass();
            hoby1.b = s1;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hobo.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hobo hobo0 = (hobo)hftp1.b_message;
        hoby hoby2 = (hoby)hftp0.N_build();
        hoby2.getClass();
        hobo0.c = hoby2;
        hobo0.b = 1;
        return (hobo)hftp1.N_build();
    }

    public final void f(gmfx gmfx0, String s) {
        if(hrel.c()) {
            this.f.d(this.e, 4, gmfx0, s);
        }
    }

    private final void g() {
        this.g.d(this.i);
    }
}

