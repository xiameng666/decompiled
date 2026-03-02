import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.wallet.PaymentData;

public class dxmj extends lsb implements lom {
    public final frxn a;
    public final frxj b;
    public final Bundle c;
    public final dxqz d;
    public final ftej e;
    public final dyar f;
    public gtlg g;
    public final int h;
    private static final bboh i;
    private final String j;
    private final String k;

    static {
        dxmj.i = bboh.b("Pay", bbcu.cZ);
    }

    public dxmj(Bundle bundle0, dxqz dxqz0, String s, String s1) {
        this.a = new frxn();
        this.b = new frxj(new dxqy(null));
        this.c = bundle0;
        this.d = dxqz0;
        this.j = s;
        this.k = s1;
        this.g = gtny.a(((ProtoLiteMessage)gtlg.a).v_newBuilder()).a();
        ftej ftej0 = dxsy.k(bundle0);
        this.e = ftej0;
        String s2 = bundle0.getString("simplified_topup_screen_type");
        int v = 2;
        if(s2 != null) {
            switch(s2.hashCode()) {
                case -191540763: {
                    if(!s2.equals("CUSTOM_AMOUNT_SCREEN")) {
                        throw new IllegalArgumentException();
                    }
                    v = 3;
                    break;
                }
                case 0x1F661F17: {
                    if(!s2.equals("UNSPECIFIED")) {
                        throw new IllegalArgumentException();
                    }
                    v = 1;
                    break;
                }
                case 1272058810: {
                    if(!s2.equals("PREDEFINED_AMOUNT_SCREEN")) {
                        throw new IllegalArgumentException();
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        else if(ftej0.i.size() <= 0) {
            ((ggtj)dxmj.i.j()).x("No predefined topup amounts specified. Launching custom amount input screen.");
            v = 3;
        }
        this.h = v;
        this.f = new dyar(s, s1);
        this.b();
    }

    public final dxqy a() {
        return (dxqy)this.b.a();
    }

    public void b() {
    }

    public void c(PaymentData paymentData0) {
    }

    public final void e() {
        this.j(dxqy.a(this.a(), null, false, false, 1));
    }

    public void f() {
    }

    public final void g(Intent intent0) {
        this.i(lsc.a(this), new frxf[]{new dxrb(intent0)});
    }

    public final void h(String s, dynd dynd0) {
        this.i(lsc.a(this), new frxf[]{new dxre(s, dynd0)});
    }

    public final void i(icck icck0, frxf[] arr_frxf) {
        this.a.b(icck0, arr_frxf);
    }

    public final void j(dxqy dxqy0) {
        this.b.b(dxqy0);
    }

    public final void k(gtlg gtlg0) {
        ibuq.f(gtlg0, "<set-?>");
        this.g = gtlg0;
    }

    public final void l(ftix ftix0) {
        this.j(dxqy.a(this.a(), ftix0, false, false, 6));
    }

    public static void m(dxmj dxmj0, String s, int v) {
        if(1 == (v & 1)) {
            s = null;
        }
        dxmj0.h(s, null);
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

