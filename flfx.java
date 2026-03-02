import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.ArrayList;

public final class flfx implements Runnable {
    public final flfy a;
    public final gged_interceptors b;
    public final AccountContext c;

    public flfx(flfy flfy0, gged_interceptors gged0, AccountContext accountContext0) {
        this.a = flfy0;
        this.b = gged0;
        this.c = accountContext0;
    }

    @Override
    public final void run() {
        fmga fmga1;
        gfsx gfsx0;
        hnub hnub0;
        flfy flfy0;
        AccountContext accountContext0;
        ArrayList arrayList0 = new ArrayList(flce.c().a());
        ggdy ggdy0 = new ggdy();
        gged_interceptors gged0 = this.b;
        int v = gged0.size();
        int v1 = 0;
        while(true) {
            accountContext0 = this.c;
            flfy0 = this.a;
            if(v1 >= v) {
                break;
            }
            fmga fmga0 = (fmga)gged0.get(v1);
            if(fmga0.j != -1 && arrayList0.contains(Integer.valueOf(fmga0.j))) {
                fmfr fmfr0 = fmga0.f;
                if(fmfr0.a() == 1) {
                    byte[] arr_b = fmfr0.e().toByteArray();
                    flwi flwi0 = flfy0.d;
                    try {
                        byte[] arr_b1 = Base64.decode(arr_b, 8);
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hnqr.a), arr_b1, 0, arr_b1.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        hnub0 = ((hnqr)hftv0).c;
                    }
                    catch(IllegalArgumentException | hfur unused_ex) {
                        gfsx0 = gfqx.a;
                        goto label_27;
                    }
                    if(hnub0 == null) {
                        hnub0 = hnub.a;
                    }
                    gfsx gfsx1 = gfsx.m(hnub0);
                    flsl flsl0 = flsl.a(flwi0.b);
                    gfsx0 = flxc.c(gfsx1, accountContext0, flwi0.b, flwi0.f, flsl0);
                label_27:
                    if(gfsx0.i() && ((flub)gfsx0.d()).g().k.a() != fmfz.c) {
                        fmga1 = ((flub)gfsx0.d()).g();
                    }
                    else {
                        fmfm fmfm0 = new fmfm(fmga0);
                        fmfm0.c(-1);
                        fmga1 = fmfm0.a();
                    }
                    ggdy0.i(fmga1);
                    flsl flsl1 = flsl.a(flfy0.c);
                    fmai fmai0 = fmaj.a();
                    fmai0.g(10012);
                    fmai0.n(accountContext0.c().f());
                    fmai0.o(accountContext0.d().toStringUtf8());
                    fmai0.p(fmga0.a);
                    fmai0.q(fmga0.j);
                    flsl1.b(fmai0.a());
                }
            }
            ++v1;
        }
        flfy0.a.b(accountContext0).aa(ggdy0.h());
    }
}

