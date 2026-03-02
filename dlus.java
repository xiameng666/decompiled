import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.pay.GetSeFeatureReadinessStatusRequest;
import com.google.android.gms.pay.SeServiceProvider;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.Collection;
import java.util.List;

public final class dlus implements fsac {
    public final dmtl a;
    public static final int b;
    private static final bboh c;
    private final Context d;
    private final du e;
    private final edle f;
    private final Account g;
    private final AccountInfo h;
    private final dlvj i;
    private final dmdi j;
    private final domj k;
    private final dmsn l;
    private final edss m;
    private final dluw n;
    private final etgl o;
    private final azts p;

    static {
        dlus.c = bboh.b("Pay", bbcu.cZ);
    }

    public dlus(Context context0, du du0, edle edle0, etgl etgl0, azts azts0, Account account0, AccountInfo accountInfo0, dlvj dlvj0, dmdi dmdi0, domj domj0, dmsn dmsn0, dmtl dmtl0, edss edss0, dluw dluw0) {
        this.d = context0;
        this.e = du0;
        this.f = edle0;
        this.o = etgl0;
        this.p = azts0;
        this.g = account0;
        this.h = accountInfo0;
        this.i = dlvj0;
        this.j = dmdi0;
        this.k = domj0;
        this.l = dmsn0;
        this.a = dmtl0;
        this.m = edss0;
        this.n = dluw0;
    }

    // Detected as a lambda impl.
    public final void a() {
        du du0 = this.e.getParentFragmentManager().h("PAY_DIALOG_FRAGMENT");
        eflz eflz0 = (du0 instanceof eflz) ? ((eflz)du0) : null;
        if(eflz0 != null) {
            eflz0.dismiss();
        }
    }

    @Override  // fsac
    public final void b(List list0) {
        byte[] arr_b;
        String s;
        boolean z;
        ibuq.f(list0, "bulletinActions");
        for(Object object0: list0) {
            hjrq hjrq0 = (hjrq)object0;
            int v = hjrq0.b;
            if(v == 2) {
                z = dpti.e(((hjor)hjrq0.c), this.d, this.g, this.h, this.e);
            }
            else {
                hjrp hjrp0 = v == 1 ? ((hjrp)hjrq0.c) : hjrp.a;
                boolean z1 = false;
                ibuq.e(hjrp0, "getAction(...)");
                int v1 = hjro.a(hjrp0.b).ordinal();
                Collection collection0 = null;
            alab1:
                switch(v1) {
                    case 10: {
                    label_159:
                        du du0 = this.e;
                        lps lps0 = du0.getViewLifecycleOwner();
                        ibuq.e(lps0, "getViewLifecycleOwner(...)");
                        Account account0 = this.g;
                        hjut hjut0 = hjrp0.b == 11 ? ((hjut)hjrp0.c) : hjut.a;
                        hjus hjus0 = hjus.b(hjut0.c) == null ? hjus.g : hjus.b(hjut0.c);
                        ibuq.e(hjus0, "getKycState(...)");
                        ibuq.f(lps0, "viewLifecycleOwner");
                        ibuq.f(hjus0, "kycState");
                        icbb.b(lpt.a(lps0), null, null, new edsr(this.m, account0, hjus0, null), 3);
                        int v2 = hjrp0.b;
                        if(((v2 == 11 ? ((hjut)hjrp0.c) : hjut.a).b & 1) != 0) {
                            hjut hjut1 = v2 == 11 ? ((hjut)hjrp0.c) : hjut.a;
                            z = dpti.e((hjut1.d == null ? hjor.a : hjut1.d), this.d, account0, null, du0);
                            break;
                        }
                    label_174:
                        z = true;
                        break;
                    }
                    case 13: {
                        ((ggtj)dlus.c.j()).B("Unhandled action %s", hjro.a(hjrp0.b).name());
                        z = false;
                        break;
                    }
                    case 15: {
                        ibuq.f(hjrp0, "action");
                        eflw eflw1 = new eflw();
                        eflw1.p = 0x7F0805C4;  // drawable:gs_mark_email_unread_vd_theme_24
                        hjtd hjtd0 = hjrp0.b == 17 ? ((hjtd)hjrp0.c) : hjtd.a;
                        eflw1.b = (hjtd0.d == null ? hjtc.a : hjtd0.d).b;
                        int v3 = hjrp0.b;
                        hjtd hjtd1 = v3 == 17 ? ((hjtd)hjrp0.c) : hjtd.a;
                        eflw1.c = (hjtd1.d == null ? hjtc.a : hjtd1.d).c;
                        hjtd hjtd2 = v3 == 17 ? ((hjtd)hjrp0.c) : hjtd.a;
                        eflw1.d = (hjtd2.d == null ? hjtc.a : hjtd2.d).d;
                        hjtd hjtd3 = v3 == 17 ? ((hjtd)hjrp0.c) : hjtd.a;
                        eflw1.e = (hjtd3.d == null ? hjtc.a : hjtd3.d).e;
                        eflw1.y = new dlux(((dlvb)this.n), hjrp0);
                        eflw1.z = new dluy(((dlvb)this.n));
                        eflw1.a().I(((dlvb)this.n).b.getParentFragmentManager(), "email_optin_confirmation_dialog");
                        z = true;
                        break;
                    }
                    case 17: {
                        z = true;
                        break;
                    }
                    default: {
                        if(v1 == 21) {
                            eflw eflw0 = new eflw();
                            eflw0.e();
                            eflw0.a().I(this.e.getParentFragmentManager(), "PAY_DIALOG_FRAGMENT");
                            GetSeFeatureReadinessStatusRequest getSeFeatureReadinessStatusRequest0 = new GetSeFeatureReadinessStatusRequest();
                            SeServiceProvider seServiceProvider0 = new SeServiceProvider();
                            seServiceProvider0.a = 6;
                            getSeFeatureReadinessStatusRequest0.c = seServiceProvider0;
                            getSeFeatureReadinessStatusRequest0.a = this.g;
                            getSeFeatureReadinessStatusRequest0.b = 1;
                            evql evql2 = this.p.aL(getSeFeatureReadinessStatusRequest0);
                            evql2.b(new dluq(new dlup(this)));
                            evql2.A((/* MISSING LAMBDA PARAMETER */) -> {
                                du du0 = this.e.getParentFragmentManager().h("PAY_DIALOG_FRAGMENT");
                                eflz eflz0 = (du0 instanceof eflz) ? ((eflz)du0) : null;
                                if(eflz0 != null) {
                                    eflz0.dismiss();
                                }
                            });
                            goto label_174;
                        }
                        else {
                            switch(v1) {
                                case 0: {
                                    this.o.i();
                                    goto label_174;
                                }
                                case 1: {
                                    this.e.startActivity(edot.a);
                                    goto label_174;
                                }
                                case 2: {
                                    this.f.a();
                                    goto label_174;
                                }
                                case 3: {
                                    Intent intent0 = new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY");
                                    this.e.startActivity(intent0);
                                    goto label_174;
                                }
                                case 4: {
                                    hjsu hjsu0 = hjrp0.b == 5 ? ((hjsu)hjrp0.c) : hjsu.a;
                                    switch((hjst.b(hjsu0.b) == null ? hjst.d : hjst.b(hjsu0.b)).ordinal()) {
                                        case 1: {
                                            evql evql0 = this.i.b.l();
                                            evql0.b(new dlvh(this.i));
                                            evql0.A(new dlvi());
                                            goto label_174;
                                        }
                                        case 2: {
                                            evql evql1 = this.i.b.l();
                                            evql1.b(new dlvd(this.i));
                                            evql1.A(new dlve());
                                            goto label_174;
                                        }
                                        case 0: 
                                        case 3: {
                                            ggtj ggtj0 = (ggtj)dlus.c.j();
                                            hjsu hjsu1 = hjrp0.b == 5 ? ((hjsu)hjrp0.c) : hjsu.a;
                                            ggtj0.B("Unhandled delete pass action %s", (hjst.b(hjsu1.b) == null ? hjst.d : hjst.b(hjsu1.b)));
                                            z = false;
                                            break alab1;
                                        }
                                        default: {
                                            throw new ibnq();
                                        }
                                    }
                                }
                                case 5: {
                                    Intent intent1 = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                                    this.e.startActivity(intent1);
                                    goto label_174;
                                }
                                case 6: {
                                    dmdi dmdi0 = this.j;
                                    dxev dxev0 = dmdi0.g();
                                    if(dxev0 != null) {
                                        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
                                        if(hkhr0 != null) {
                                            hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                                            if(hkhh0 != null) {
                                                hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
                                                if(hkir0 != null) {
                                                    s = hkir0.c;
                                                    goto label_60;
                                                }
                                            }
                                        }
                                    }
                                    s = null;
                                label_60:
                                    if(s == null) {
                                        ((ggtj)dlus.c.j()).x("Tokenize action invoked without valid clientTokenId");
                                    }
                                    else {
                                        dokz dokz0 = (this.e instanceof dokz) ? ((dokz)this.e) : null;
                                        if(dokz0 != null) {
                                            xob xob0 = dokz0.an();
                                            if(xob0 != null) {
                                                Activity activity0 = xob0.getContainerActivity();
                                                if(activity0 != null) {
                                                    hjvx hjvx0 = hjrp0.b == 7 ? ((hjvx)hjrp0.c) : hjvx.a;
                                                    switch((hjvw.b(hjvx0.b) == null ? hjvw.e : hjvw.b(hjvx0.b)).ordinal()) {
                                                        case 1: {
                                                            etbu etbu0 = new etbu();
                                                            etbu0.a(s);
                                                            etbu0.c(4);
                                                            etbu0.g(2);
                                                            etbu0.j(this.k.a());
                                                            dxev dxev1 = dmdi0.g();
                                                            if(dxev1 != null) {
                                                                hkhr hkhr1 = dxev1.c == null ? hkhr.b : dxev1.c;
                                                                if(hkhr1 != null) {
                                                                    hjwt hjwt0 = hkhr1.d == null ? hjwt.a : hkhr1.d;
                                                                    if(hjwt0 != null) {
                                                                        arr_b = hjwt0.toBytesArray();
                                                                        goto label_89;
                                                                    }
                                                                }
                                                            }
                                                            arr_b = null;
                                                        label_89:
                                                            etbu0.m(arr_b);
                                                            if(hwfk.c()) {
                                                                dxev dxev2 = dmdi0.g();
                                                                if(dxev2 != null) {
                                                                    hkhr hkhr2 = dxev2.c == null ? hkhr.b : dxev2.c;
                                                                    if(hkhr2 != null) {
                                                                        hjqn hjqn0 = hkhr2.e == null ? hjqn.a : hkhr2.e;
                                                                        if(hjqn0 != null) {
                                                                            collection0 = hjqn0.toBytesArray();
                                                                        }
                                                                    }
                                                                }
                                                                etbu0.l(((byte[])collection0));
                                                            }
                                                            this.o.cW(activity0, 201, etbu0);
                                                            goto label_174;
                                                        }
                                                        case 2: {
                                                            dxev dxev3 = dmdi0.g();
                                                            this.l.h(dxev3, false);
                                                            goto label_174;
                                                        }
                                                        case 3: {
                                                            dxev dxev4 = dmdi0.g();
                                                            this.l.h(dxev4, true);
                                                            goto label_174;
                                                        }
                                                        default: {
                                                            ggtj ggtj1 = (ggtj)dlus.c.j();
                                                            hjvx hjvx1 = hjrp0.b == 7 ? ((hjvx)hjrp0.c) : hjvx.a;
                                                            ggtj1.B("Unhandled tokenization %s", (hjvw.b(hjvx1.b) == null ? hjvw.e : hjvw.b(hjvx1.b)));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z = false;
                                    break alab1;
                                }
                                case 7: {
                                    dxev dxev5 = this.j.g();
                                    if(dxev5 != null) {
                                        hkhr hkhr3 = dxev5.c == null ? hkhr.b : dxev5.c;
                                        if(hkhr3 != null) {
                                            collection0 = hkhr3.n;
                                        }
                                    }
                                    if(collection0 != null && !collection0.isEmpty()) {
                                        hjuo hjuo0 = hjrp0.b == 8 ? ((hjuo)hjrp0.c) : hjuo.a;
                                        hkid hkid0 = hkid.b(hjuo0.b) == null ? hkid.z : hkid.b(hjuo0.b);
                                        ibuq.e(hkid0, "getActionType(...)");
                                        if(!collection0.isEmpty()) {
                                            for(Object object1: collection0) {
                                                hkid hkid1 = hkid.b(((hkhs)object1).c);
                                                if(hkid1 == null) {
                                                    hkid1 = hkid.z;
                                                }
                                                if(hkid1 != hkid0) {
                                                    continue;
                                                }
                                                this.l.f(dxev5, hkid0);
                                                goto label_174;
                                            }
                                        }
                                        ((ggtj)dlus.c.j()).B("No matching action found of type %s", hkid0);
                                    }
                                    else {
                                        ((ggtj)dlus.c.j()).x("Handle payment action invoked without valid actions");
                                    }
                                    z = false;
                                    break alab1;
                                }
                                case 8: {
                                    dmdi dmdi1 = this.j;
                                    dxev dxev6 = dmdi1.g();
                                    hjse hjse0 = hjrp0.b == 9 ? ((hjse)hjrp0.c) : hjse.a;
                                    switch((hjsd.b(hjse0.b) == null ? hjsd.d : hjsd.b(hjse0.b)).ordinal()) {
                                        case 1: {
                                            if(dmdi1.h() == 2) {
                                                z1 = true;
                                            }
                                            this.a.b(dxev6, z1);
                                            goto label_174;
                                        }
                                        case 2: {
                                            this.a.c(dxev6);
                                            goto label_174;
                                        }
                                        default: {
                                            ggtj ggtj2 = (ggtj)dlus.c.j();
                                            hjse hjse1 = hjrp0.b == 9 ? ((hjse)hjrp0.c) : hjse.a;
                                            ggtj2.B("Unhandled set card default status %s", (hjsd.b(hjse1.b) == null ? hjsd.d : hjsd.b(hjse1.b)));
                                            z = false;
                                            break alab1;
                                        }
                                    }
                                }
                                default: {
                                    ((ggtj)dlus.c.j()).B("Unhandled action %s", hjro.a(hjrp0.b).name());
                                    z = false;
                                    break alab1;
                                }
                            }
                        }
                        goto label_159;
                    }
                }
            }
            if(z) {
                return;
            }
        }
        ((ggtj)dlus.c.i()).x("Unable to handle any of the actions");
    }
}

