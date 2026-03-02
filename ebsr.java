import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;

public final class ebsr implements dnqb {
    public String a;
    public dxyx b;
    public ease c;
    public bbng d;
    public gmcg e;
    public eefw f;
    public dzrd g;
    public dygd h;
    public static final int i;
    private static final bboh j;
    private AccountInfo k;
    private frli l;

    static {
        ebsr.j = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        byte[] arr_b;
        String s6;
        String s5;
        String s;
        Bundle bundle0 = cllr0.b;
        if(bundle0 == null) {
            s = "";
        }
        else {
            s = bundle0.getString("KEY_WEAR_ACCOUNT_NAME");
            if(s == null) {
                s = "";
            }
        }
        String s1 = dlmj.b(context0, s);
        if(s1 == null) {
            s1 = "";
        }
        AccountInfo accountInfo0 = new AccountInfo(s1, s, 0);
        this.k = accountInfo0;
        String s2 = accountInfo0.b;
        ibuq.e(s2, "getAccountName(...)");
        AccountInfo accountInfo1 = this.k;
        AccountInfo accountInfo2 = null;
        if(accountInfo1 == null) {
            ibuq.j("accountInfo");
            accountInfo1 = null;
        }
        String s3 = accountInfo1.a;
        ibuq.e(s3, "getAccountId(...)");
        if(bundle0 == null) {
            s5 = "";
        }
        else {
            String s4 = bundle0.getString("KEY_WEAR_NODE_ID");
            s5 = s4 == null ? "" : s4;
        }
        this.h(s2, s3, s5, (bundle0 == null ? 0L : bundle0.getLong("KEY_WEAR_ANDROID_ID")));
        AccountInfo accountInfo3 = this.k;
        if(accountInfo3 == null) {
            ibuq.j("accountInfo");
            accountInfo3 = null;
        }
        Account account0 = new Account(accountInfo3.b, "com.google");
        frli frli0 = this.c().a(account0, this.e());
        this.l = frli0;
        if(frli0 == null) {
            ibuq.j("dataStore");
            frli0 = null;
        }
        dygd dygd0 = (dygd)frli0.a().get();
        this.h = dygd0;
        if(dygd0 == null) {
            ibuq.j("transferStatus");
            dygd0 = null;
        }
        if((dygd0.b & 2) == 0) {
            s6 = null;
        }
        else {
            hfuo hfuo0 = (dygd0.d == null ? dyfl.a : dygd0.d).b;
            ibuq.e(hfuo0, "getCardDownloadResultsList(...)");
            dyfk dyfk0 = (dyfk)ibpo.ab(hfuo0);
            s6 = dyfk0 == null ? null : dyfk0.c;
        }
        if(s6 == null) {
            ebsr.g(this, dyfj.c);
            return 0;
        }
        int v = bundle0 == null ? 0 : bundle0.getInt("KEY_ORIGIN");
        gurm gurm0 = gurm.b(v) == null ? gurm.a : gurm.b(v);
        if(bundle0 == null) {
            arr_b = new byte[0];
        }
        else {
            arr_b = bundle0.getByteArray("KEY_AUDIT_TOKEN");
            if(arr_b == null) {
                arr_b = new byte[0];
            }
        }
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        int v1 = bundle0 == null ? 0 : bundle0.getInt("KEY_SERVICE_PROVIDER");
        dyna dyna0 = dyna.b(v1) == null ? dyna.a : dyna.b(v1);
        evll evll0 = evlk.a(((ProtoLiteMessage)evlj.a).v_newBuilder());
        AccountInfo accountInfo4 = this.k;
        if(accountInfo4 == null) {
            ibuq.j("accountInfo");
            accountInfo4 = null;
        }
        ibuq.e(accountInfo4.b, "getAccountName(...)");
        evll0.b(accountInfo4.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)evjv.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(dyna0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        evjv evjv0 = (evjv)hftp0.b_message;
        evjv0.b = dyna0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((evjv)hftp0.b_message).c = s6;
        ibuq.f(gurm0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        evjv evjv1 = (evjv)hftp0.b_message;
        evjv1.d = gurm0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((evjv)hftp0.b_message).e = hfsf0;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((evjv)hftv0), "value");
        ProtoLiteBuilder hftp1 = evll0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        evlj evlj0 = (evlj)hftp1.b_message;
        ((evjv)hftv0).getClass();
        evlj0.c = (evjv)hftv0;
        evlj0.b = 55;
        evlj evlj1 = evll0.a();
        frli frli1 = this.l;
        if(frli1 == null) {
            ibuq.j("dataStore");
            frli1 = null;
        }
        ((glyq)frli1.b(new ebsi(new ebsg(this)), this.d())).u();
        eefw eefw0 = this.f;
        if(eefw0 == null) {
            ibuq.j("wearPayClient");
            eefw0 = null;
        }
        AccountInfo accountInfo5 = this.k;
        if(accountInfo5 == null) {
            ibuq.j("accountInfo");
        }
        else {
            accountInfo2 = accountInfo5;
        }
        evql evql0 = eefw0.a(eekn.e(accountInfo2.b, evlj1));
        evql0.y(this.d(), new ebsk(new ebsj(this)));
        evql0.v(this.d(), (/* MISSING LAMBDA PARAMETER */) -> this.f(dyfj.c, null));
        return 0;
    }

    @Override  // dnqb
    public final void b(Context context0) {
        ibuq.f(context0, "context");
        gfsx gfsx0 = dlmj.a(context0);
        if(!gfsx0.i()) {
            ((ggtj)ebsr.j.j()).x("DownloadSePrepaidCardOnWearOperation: Active account not found!");
            return;
        }
        AccountInfo accountInfo0 = (AccountInfo)gfsx0.d();
        this.k = accountInfo0;
        frli frli0 = null;
        if(accountInfo0 == null) {
            ibuq.j("accountInfo");
            accountInfo0 = null;
        }
        String s = accountInfo0.b;
        ibuq.e(s, "getAccountName(...)");
        AccountInfo accountInfo1 = this.k;
        if(accountInfo1 == null) {
            ibuq.j("accountInfo");
            accountInfo1 = null;
        }
        ibuq.e(accountInfo1.a, "getAccountId(...)");
        this.h(s, accountInfo1.a, "", 0L);
        dxyx dxyx0 = this.c();
        AccountInfo accountInfo2 = this.k;
        if(accountInfo2 == null) {
            ibuq.j("accountInfo");
            accountInfo2 = null;
        }
        frli frli1 = dxyx0.a(new Account(accountInfo2.b, "com.google"), this.e());
        this.l = frli1;
        if(frli1 == null) {
            ibuq.j("dataStore");
        }
        else {
            frli0 = frli1;
        }
        ((glyq)dxyx.b(frli0, this.d())).u();
    }

    public final dxyx c() {
        dxyx dxyx0 = this.b;
        if(dxyx0 != null) {
            return dxyx0;
        }
        ibuq.j("dataStoreProvider");
        return null;
    }

    public final gmcg d() {
        gmcg gmcg0 = this.e;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("highSpeedExecutor");
        return null;
    }

    public final String e() {
        String s = this.a;
        if(s != null) {
            return s;
        }
        ibuq.j("environment");
        return null;
    }

    public final void f(dyfj dyfj0, String s) {
        frli frli0 = this.l;
        ease ease0 = null;
        if(frli0 == null) {
            ibuq.j("dataStore");
            frli0 = null;
        }
        ((glyq)frli0.b(new ebsh(new ebsq(this, s, dyfj0)), this.d())).u();
        ease ease1 = this.c;
        if(ease1 == null) {
            ibuq.j("listenerManager");
        }
        else {
            ease0 = ease1;
        }
        ease0.a();
    }

    private final void h(String s, String s1, String s2, long v) {
        Context context0 = AppContextProvider.a();
        ibuq.e(context0, "getApplicationContext(...)");
        dola dola0 = dlmg.a(context0, s, s1);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebku(dola0, new eefy(s2, v), domv0).inject(this);
    }
}

