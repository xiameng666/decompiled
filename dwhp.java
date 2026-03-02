import android.content.Context;
import android.net.Uri;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public final class dwhp extends lsb implements lom {
    public static final bboh a;
    public final frxn b;
    public final Context c;
    public final ibrt d;
    public final dvgq e;
    public gged_interceptors f;
    public gged_interceptors g;
    public int h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public acp m;
    private final String n;
    private final fhwb o;
    private final domj p;

    static {
        dwhp.a = bboh.b(new ibuk(dwhd.class).c(), bbcu.cZ);
    }

    public dwhp(String s, Context context0, ibrt ibrt0, fhwb fhwb0, domj domj0, dvgq dvgq0) {
        this.b = new frxn();
        this.n = s;
        this.c = context0;
        this.d = ibrt0;
        this.o = fhwb0;
        this.p = domj0;
        this.e = dvgq0;
        ibuq.e(ggna.a, "of(...)");
        this.f = ggna.a;
        ibuq.e(ggna.a, "of(...)");
        this.g = ggna.a;
        this.h = 2;
        this.i = "";
        this.j = "";
        this.k = "";
    }

    public final gkbe a() {
        if(this.l) {
            gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
            gjiy gjiy0 = gjix.a(((ProtoLiteMessage)gkbc.a).v_newBuilder());
            gjiy0.d(gkbb.c);
            gjiy0.b(this.i);
            gjiy0.c(this.j);
            String s = this.k;
            ibuq.f(s, "value");
            ProtoLiteBuilder hftp0 = gjiy0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkbc gkbc0 = (gkbc)hftp0.b_message;
            s.getClass();
            gkbc0.b |= 8;
            gkbc0.f = s;
            gjzs0.d(gjiy0.a());
            return gjzs0.a();
        }
        gjzs gjzs1 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
        gjiy gjiy1 = gjix.a(((ProtoLiteMessage)gkbc.a).v_newBuilder());
        gjiy1.d(gkbb.b);
        gjiy1.b(this.i);
        gjiy1.c(this.j);
        gjzs1.d(gjiy1.a());
        return gjzs1.a();
    }

    public final void b(gged_interceptors gged0) {
        ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            ibuq.c(((Uri)object0));
            arrayList0.add(dvky.a(this.c, this.n, ((Uri)object0)));
        }
        this.g = ggdx.a(arrayList0);
        icck icck0 = lsc.a(this);
        dwhl dwhl0 = new dwhl(this, null);
        icbb.b(icck0, this.d, null, dwhl0, 2);
    }

    public final void c() {
        gjcd gjcd0 = (gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder();
        String s = this.p.a();
        long v = ghfs.a.c(s, StandardCharsets.UTF_8).c();
        if(!gjcd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjcd0).ensureMutable();
        }
        gjce gjce0 = (gjce)gjcd0.b_message;
        gjce0.b |= 1;
        gjce0.c = v;
        gkbe gkbe0 = this.a();
        if(!gjcd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjcd0).ensureMutable();
        }
        gjce gjce1 = (gjce)gjcd0.b_message;
        gkbe0.getClass();
        gjce1.g = gkbe0;
        gjce1.b |= 0x100;
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)gjcd0).N_build();
        ibuq.e(hftv0, "build(...)");
        fhvz fhvz0 = fhwa.a(0x37879);
        fhvz0.c(fhwp.b(this.n));
        fhvz0.b(douc.a(((gjce)hftv0)));
        fhwa fhwa0 = fhvz0.a();
        this.o.a(fhwa0);
    }

    public final void e(icck icck0, frxf[] arr_frxf) {
        this.b.b(icck0, arr_frxf);
    }

    public final void f() {
        icck icck0 = lsc.a(this);
        dwho dwho0 = new dwho(this, null);
        icbb.b(icck0, this.d, null, dwho0, 2);
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        lol.b(lps0);
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        lol.d(lps0);
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }
}

