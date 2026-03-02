import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;

public final class ebzr implements dnqb {
    public static final bboh a;
    public String b;
    public dxyx c;
    public ease d;
    public bbng e;
    public gmcg f;
    public ebst g;
    public frli h;
    public azts i;
    private AccountInfo j;
    private dygd k;

    static {
        ebzr.a = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        this.j();
        gfsx gfsx0 = dlmj.a(context0);
        if(!gfsx0.i()) {
            ((ggtj)ebzr.a.j()).x("TransferEmoneyCardsTaskOperation: Active account not found!");
            return 2;
        }
        this.j = (AccountInfo)gfsx0.d();
        AccountInfo accountInfo0 = this.j;
        frli frli0 = null;
        if(accountInfo0 == null) {
            ibuq.j("accountInfo");
            accountInfo0 = null;
        }
        Account account0 = new Account(accountInfo0.b, "com.google");
        frli frli1 = this.c().a(account0, this.g());
        this.h = frli1;
        if(frli1 == null) {
            ibuq.j("dataStore");
            frli1 = null;
        }
        this.k = (dygd)frli1.a().get();
        Bundle bundle0 = cllr0.b;
        dzbc dzbc0 = dzbc.b((bundle0 == null ? 0 : bundle0.getInt("KEY_TRANSFER_EMONEY_CARDS_SCREEN")));
        if(dzbc0 == dzbc.b) {
            ebst ebst0 = this.e();
            String s = account0.name;
            ibuq.e(s, "name");
            ebst0.a(s, 204497);
            dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
            AccountInfo accountInfo1 = this.j;
            if(accountInfo1 == null) {
                ibuq.j("accountInfo");
                accountInfo1 = null;
            }
            ibuq.e(accountInfo1.b, "getAccountName(...)");
            dyfx0.b(accountInfo1.b);
            dygd dygd0 = this.k;
            if(dygd0 == null) {
                ibuq.j("transferStatus");
                dygd0 = null;
            }
            dyoi dyoi0 = dygd0.c == null ? dyoi.a : dygd0.c;
            ibuq.e(dyoi0, "getUploadMfiCardsResponse(...)");
            ibuq.f(dyoi0, "<this>");
            hfuo hfuo0 = dyoi0.b;
            ibuq.e(hfuo0, "getCardUploadResultsList(...)");
            ibym ibym0 = new ibym(new ibxm(ibpo.aA(hfuo0), true, new dyum()), new dyun());
            dyoe dyoe0 = dyod.a(((dyoa)((ProtoLiteMessage)dyoc.a).v_newBuilder()));
            dyoa dyoa0 = dyoe0.a;
            if(!dyoa0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)dyoa0).ensureMutable();
            }
            dyoc.c(((dyoc)dyoa0.b_message));
            dyoe0.c();
            dyoe0.b(ibxv.j(ibym0));
            dyfx0.g(dyoe0.a());
            dyfv dyfv0 = dyfx0.a();
            this.h().ba(dyfv0.toBytesArray()).v(this.f(), new ebzg(this));
            frli frli2 = this.h;
            if(frli2 == null) {
                ibuq.j("dataStore");
            }
            else {
                frli0 = frli2;
            }
            ((glyq)frli0.b(new ebzi(new ebzh(this)), this.f())).u();
            return 0;
        }
        if(dzbc0 == dzbc.c) {
            ebst ebst1 = this.e();
            String s1 = account0.name;
            ibuq.e(s1, "name");
            ebst1.a(s1, 204498);
            String s2 = bundle0 == null ? null : bundle0.getString("KEY_DEFAULT_TRANSIT_CARD_CID");
            int v = bundle0 == null ? 0 : bundle0.getInt("KEY_ORIGIN");
            gurm gurm0 = gurm.b(v) == null ? gurm.a : gurm.b(v);
            dyfx dyfx1 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
            AccountInfo accountInfo2 = this.j;
            if(accountInfo2 == null) {
                ibuq.j("accountInfo");
                accountInfo2 = null;
            }
            ibuq.e(accountInfo2.b, "getAccountName(...)");
            dyfx1.b(accountInfo2.b);
            dygd dygd1 = this.k;
            if(dygd1 == null) {
                ibuq.j("transferStatus");
                dygd1 = null;
            }
            dyfl dyfl0 = dygd1.d == null ? dyfl.a : dygd1.d;
            ibuq.e(dyfl0, "getDownloadMfiCardsResponse(...)");
            ibuq.f(dyfl0, "<this>");
            hfuo hfuo1 = dyfl0.b;
            ibuq.e(hfuo1, "getCardDownloadResultsList(...)");
            ibym ibym1 = new ibym(new ibxm(ibpo.aA(hfuo1), true, new dyuo()), new dyup());
            dyfh dyfh0 = dyfg.a(((ProtoLiteMessage)dyff.a).v_newBuilder());
            dyfh0.f();
            dyfh0.e(ibxv.j(ibym1));
            dyff dyff0 = dyfh0.a();
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dyff0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dyff0));
            dyfh dyfh1 = dyfg.a(hftp0);
            if(s2 != null) {
                dyfh1.b(s2);
            }
            dyfh1.d(dyfe.b);
            dyfh1.c(gurm0);
            dyfx1.c(dyfh1.a());
            dyfv dyfv1 = dyfx1.a();
            this.h().ba(dyfv1.toBytesArray()).v(this.f(), new ebzn(this));
            frli frli3 = this.h;
            if(frli3 == null) {
                ibuq.j("dataStore");
            }
            else {
                frli0 = frli3;
            }
            ((glyq)frli0.b(new ebzp(new ebzo(this)), this.f())).u();
            return 0;
        }
        ((ggtj)ebzr.a.j()).x("TransferEmoneyCardsTaskOperation: No specified screen found!");
        return 2;
    }

    @Override  // dnqb
    public final void b(Context context0) {
        ibuq.f(context0, "context");
        this.j();
        gfsx gfsx0 = dlmj.a(context0);
        if(!gfsx0.i()) {
            return;
        }
        frli frli0 = this.c().a(new Account(((AccountInfo)gfsx0.d()).b, "com.google"), this.g());
        this.h = frli0;
        frli frli1 = null;
        if(frli0 == null) {
            ibuq.j("dataStore");
            frli0 = null;
        }
        ((glyq)dxyx.c(frli0, this.f())).u();
        frli frli2 = this.h;
        if(frli2 == null) {
            ibuq.j("dataStore");
        }
        else {
            frli1 = frli2;
        }
        ((glyq)dxyx.b(frli1, this.f())).u();
    }

    public final dxyx c() {
        dxyx dxyx0 = this.c;
        if(dxyx0 != null) {
            return dxyx0;
        }
        ibuq.j("dataStoreProvider");
        return null;
    }

    public final ease d() {
        ease ease0 = this.d;
        if(ease0 != null) {
            return ease0;
        }
        ibuq.j("listenerManager");
        return null;
    }

    public final ebst e() {
        ebst ebst0 = this.g;
        if(ebst0 != null) {
            return ebst0;
        }
        ibuq.j("emoneyOperationUtils");
        return null;
    }

    public final gmcg f() {
        gmcg gmcg0 = this.f;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("highSpeedExecutor");
        return null;
    }

    public final String g() {
        String s = this.b;
        if(s != null) {
            return s;
        }
        ibuq.j("environment");
        return null;
    }

    public final azts h() {
        azts azts0 = this.i;
        if(azts0 != null) {
            return azts0;
        }
        ibuq.j("firstPartyPayClient");
        return null;
    }

    public final void i() {
        if(this.e != null) {
            return;
        }
        ibuq.j("clock");
    }

    private final void j() {
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebqw(domv0).inject(this);
    }
}

