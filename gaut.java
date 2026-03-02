import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;
import java.util.Locale;
import jeb.synthetic.TWR;

public final class gaut implements ibth {
    public final gavf a;
    public final hdvf b;
    public final boolean c;

    public gaut(gavf gavf0, hdvf hdvf0, boolean z) {
        this.a = gavf0;
        this.b = hdvf0;
        this.c = z;
    }

    @Override  // ibth
    public final Object a() {
        hdul hdul1;
        gavf gavf0 = this.a;
        gatj gatj0 = gavf0.b;
        hcst hcst0 = gawz.a(this.b, gatj0.e, gatj0.g, gatj0.f);
        Long long0 = (hcst0.b & 2) == 0 || this.c ? null : ((long)hcst0.f);
        int v = hcss.a(hcst0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v - 1 == 1) {
            hcsw hcsw0 = hcst0.c == 2 ? ((hcsw)hcst0.d) : hcsw.a;
            gavf0.i().q((hcsw0.c == null ? hdul.a : hcsw0.c), long0);
        }
        else {
            switch(v - 1) {
                case 2: {
                    hcsx hcsx0 = hcst0.c == 3 ? ((hcsx)hcst0.d) : hcsx.a;
                    gasv gasv0 = gavf0.i();
                    hdut hdut0 = hcsx0.b == null ? hdut.a : hcsx0.b;
                    hdul hdul0 = gasv0.f("BE_PC_07");
                    gdqb gdqb0 = gayy.a("update_partial_page");
                    gatj gatj1 = gasv0.a.a;
                    gayt gayt0 = gatj1.f;
                    try {
                        gdqs gdqs0 = gayt0.a("update_partial_page");
                        try {
                            gasv0.o = false;
                            if(gasv0.u == 3) {
                                gasv0.aZ();
                                gasv0.o = true;
                            }
                            gdqb gdqb1 = gayy.a("update_partial_page_proto");
                            try(gdqs gdqs1 = gayt0.a("update_partial_page_proto")) {
                                gasv0.c = (hdul)gavs.a("BE_PC_09", gatj1.g, new gasu(gasv0, hdul0, hdut0));
                                hdul1 = gasv0.c;
                            }
                            catch(Throwable throwable2) {
                                TWR.safeClose$NT(gdqb1, throwable2);
                                throw throwable2;
                            }
                            gdqb1.close();
                            gasv0.o(hdul1);
                            gast gast0 = gasv0.a;
                            gasm gasm0 = gast0.e;
                            gasm0.j(gast0.a.j, (hdul1.c == null ? hdrl.a : hdul1.c), hdul1.d, long0);
                            gasm0.f(hdul1.i);
                            if(long0 != null) {
                                gasm0.h(gged_interceptors.l(long0));
                            }
                            gatc gatc0 = gast0.c.c;
                            ArrayList arrayList0 = gatc0.c;
                            int v4 = arrayList0.size();
                            for(int v5 = 0; v5 < v4; ++v5) {
                                ((gatb)arrayList0.get(v5)).f.G();
                            }
                            gatc0.b();
                            try(gdqb gdqb2 = gayy.a("update_partial_page_managers"); gdqs gdqs2 = gayt0.a("update_partial_page_managers")) {
                                gbdr gbdr0 = gast0.g;
                                hdus hdus0 = hdut0.j;
                                if(hdus0 == null) {
                                    hdus0 = hdus.a;
                                }
                                gbdr0.d(hdus0);
                                gast0.b.p(hdut0.f, hdut0.g, hdut0.h, hdut0.i);
                                gasv0.i(hdul1);
                                if(gasv0.o) {
                                    gasv0.bb();
                                    gasv0.o = false;
                                }
                            }
                        }
                        catch(Throwable throwable1) {
                            TWR.safeClose$NT(gdqs0, throwable1);
                            throw throwable1;
                        }
                        gdqs0.close();
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(gdqb0, throwable0);
                        throw throwable0;
                    }
                    gdqb0.close();
                    if(gasv0.m) {
                        gasv0.j();
                    }
                    if(long0 != null) {
                        gasv0.a.e.c();
                        return ibom.a;
                    }
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    if(v - 1 != 5) {
                        gaym gaym0 = gatj0.g;
                        Locale locale0 = Locale.US;
                        int v3 = hcss.a(hcst0.e);
                        if(v3 != 0) {
                            v1 = v3;
                        }
                        gavs.d("BE_WC_03", gaym0, String.format(locale0, "Unknown flow instruction: %s", ((int)(v1 - 1))));
                        return ibom.a;
                    }
                    hcsv hcsv0 = hcst0.c == 6 ? ((hcsv)hcst0.d) : hcsv.a;
                    xob xob0 = gatj0.b;
                    hfuo hfuo0 = hcsv0.c;
                    Account[] arr_account = AccountManager.get(xob0).getAccountsByType("com.google");
                    for(int v2 = 0; v2 < arr_account.length; ++v2) {
                        Account account0 = arr_account[v2];
                        if(hfuo0.contains(account0.name)) {
                            byte[] arr_b = hcsv0.b.toByteArray();
                            gavf0.q.a.getIntent().putExtra("encryptedParams", arr_b);
                            fbxy fbxy0 = BuyFlowConfig.b(gavf0.q.h);
                            fbxw fbxw0 = ApplicationParameters.b(gavf0.q.h.b);
                            fbxw0.d(account0);
                            fbxy0.b(fbxw0.a);
                            gavf0.q.h = fbxy0.a();
                            gavf0.q.c.f(gavf0.q.h, arr_b);
                            return ibom.a;
                        }
                    }
                    xob0.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(hcsv0.d)));
                    xob0.finish();
                    return ibom.a;
                }
            }
        }
        return ibom.a;
    }
}

