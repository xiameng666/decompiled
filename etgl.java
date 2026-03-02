import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;
import com.google.android.gms.tapandpay.firstparty.ReportUnlockRequest;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.SendPollingFrameHandlerEventRequest;
import com.google.android.gms.tapandpay.firstparty.SendTransmissionEventRequest;
import com.google.android.gms.tapandpay.firstparty.SyncDeviceInfoRequest;
import com.google.android.gms.tapandpay.firstparty.TransmissionEvent;
import com.google.android.gms.tapandpay.internal.firstparty.GetTokenDetailsRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetSelectedTokenRequest;
import com.google.android.gms.tapandpay.internal.firstparty.TokenizeAccountRequest;
import com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard;
import com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest;
import java.util.List;
import java.util.UUID;

public final class etgl extends azts implements aztx {
    public final etbt a;

    public etgl(Context context0) {
        super(context0, esen.a, azsx.s, aztr_settings.a);
        this.a = new etbt();
    }

    public final evql cA(int v, String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new etdm(this, v, s);
        azzc0.d = 0x886;
        azzc0.c = new Feature[]{eseb.B};
        return this.iG(azzc0.a());
    }

    public final evql cB(int v, Account account0) {
        GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest0 = new GetQuickAccessWalletConfigRequest();
        getQuickAccessWalletConfigRequest0.a = v;
        getQuickAccessWalletConfigRequest0.b = account0;
        azzc azzc0 = new azzc();
        azzc0.a = new eted(this, getQuickAccessWalletConfigRequest0);
        azzc0.c = new Feature[]{eseb.M};
        azzc0.d = 0x860;
        return this.iG(azzc0.a());
    }

    public final evql cC(int[] arr_v) {
        azzc azzc0 = new azzc();
        azzc0.a = new etdg(this, arr_v);
        azzc0.c = new Feature[]{eseb.U};
        azzc0.b = false;
        azzc0.d = 0x87C;
        return this.iG(azzc0.a());
    }

    public final evql cD(GetTokenDetailsRequest getTokenDetailsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new etcu(this, getTokenDetailsRequest0);
        azzc0.c = new Feature[]{eseb.s};
        azzc0.b = false;
        azzc0.d = 0x875;
        return this.iG(azzc0.a());
    }

    public final evql cE() {
        azzc azzc0 = new azzc();
        azzc0.a = new etcy(this);
        azzc0.d = 0x84C;
        return this.iG(azzc0.a());
    }

    public final evql cF(String s, boolean z, long v) {
        return this.cG(s, z, v, 0);
    }

    public final evql cG(String s, boolean z, long v, int v1) {
        return this.dp(new SetSelectedTokenRequest(s, v, z, v1, SystemClock.elapsedRealtime()));
    }

    public final evql cH(byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new etdv(this, arr_b);
        azzc0.c = new Feature[]{eseb.ai};
        azzc0.b = false;
        azzc0.d = 0x872;
        return this.iG(azzc0.a());
    }

    public final evql cI(byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new etcr(this, arr_b);
        azzc0.c = new Feature[]{eseb.G};
        azzc0.b = false;
        azzc0.d = 2180;
        return this.jn(azzc0.a());
    }

    public final evql cJ(byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new eter(this, arr_b);
        azzc0.c = new Feature[]{eseb.H};
        azzc0.b = false;
        azzc0.d = 0x86E;
        return this.jn(azzc0.a());
    }

    public final evql cK(Activity activity0, int v, TokenizeAccountRequest tokenizeAccountRequest0, Feature[] arr_feature) {
        azzc azzc0 = new azzc();
        azzc0.a = new etda(activity0, v, tokenizeAccountRequest0);
        azzc0.b = false;
        azzc0.c = arr_feature;
        azzc0.d = 2120;
        return this.jn(azzc0.a());
    }

    public final evql cL() {
        azzc azzc0 = new azzc();
        azzc0.a = new eteg(this);
        azzc0.c = new Feature[]{eseb.Q};
        azzc0.d = 0x842;
        return this.iG(azzc0.a());
    }

    public final evql cM(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new etel(this, s);
        azzc0.d = 0x844;
        return this.jn(azzc0.a());
    }

    public final evql cN() {
        azzc azzc0 = new azzc();
        azzc0.a = new eteq();
        azzc0.d = 0x84D;
        return this.jn(azzc0.a());
    }

    public final evql cO(ReportUnlockRequest reportUnlockRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new etcn(reportUnlockRequest0);
        azzc0.c = new Feature[]{eseb.N};
        azzc0.b = false;
        azzc0.d = 0x879;
        return this.jn(azzc0.a());
    }

    public final evql cP(TransmissionEvent transmissionEvent0) {
        SendTransmissionEventRequest sendTransmissionEventRequest0 = new SendTransmissionEventRequest();
        sendTransmissionEventRequest0.a = transmissionEvent0;
        azzc azzc0 = new azzc();
        azzc0.a = new eteb(this, sendTransmissionEventRequest0);
        azzc0.c = new Feature[]{eseb.ah};
        azzc0.b = false;
        azzc0.d = 0x84F;
        return this.jn(azzc0.a());
    }

    public final evql cQ(String s) {
        return this.cR(s, true);
    }

    public final evql cR(String s, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new etco(this, s, z);
        azzc0.c = new Feature[]{eseb.a};
        azzc0.d = 0x84A;
        return this.jn(azzc0.a());
    }

    public final evql cS(String s) {
        return this.dp(new SetSelectedTokenRequest(s, 0L, true, 0, 0L));
    }

    public final evql cT(NotificationSettings notificationSettings0) {
        azzc azzc0 = new azzc();
        azzc0.a = new etdq(this, notificationSettings0);
        azzc0.c = new Feature[]{eseb.a};
        azzc0.d = 0x892;
        return this.jn(azzc0.a());
    }

    public final evql cU(boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new etej(z);
        azzc0.c = new Feature[]{eseb.aj};
        azzc0.b = false;
        azzc0.d = 0x876;
        return this.iG(azzc0.a());
    }

    public final evql cV(SyncDeviceInfoRequest syncDeviceInfoRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new etdc(syncDeviceInfoRequest0);
        azzc0.c = new Feature[]{eseb.ab};
        azzc0.b = false;
        azzc0.d = 0x865;
        return this.jn(azzc0.a());
    }

    public final evql cW(Activity activity0, int v, etbu etbu0) {
        etat etat0 = new etat(activity0, v);
        azzc azzc0 = new azzc();
        azzc0.a = new etcx(etbu0.a, etat0);
        azzc0.c = new Feature[]{eseb.ag};
        azzc0.d = 0x849;
        return this.jn(azzc0.a());
    }

    public final void cX(Activity activity0, int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new etcw(activity0, v);
        azzc0.d = 0x84B;
        this.iG(azzc0.a());
    }

    public final void cY(Activity activity0, int v, String s) {
        azzc azzc0 = new azzc();
        azzc0.d = 0x854;
        azzc0.a = new eten(s, activity0, v);
        this.jn(azzc0.a());
    }

    public final void cZ(byte[] arr_b, esel esel0) {
        azyf azyf0 = this.iD(esel0, "tapAndPayServiceListener_1");
        String s = UUID.randomUUID().toString();
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new etdn(this, s, arr_b, azyf0);
        azyq0.b = new etdo(this, s, arr_b);
        azyq0.d = new Feature[]{eseb.c};
        azyq0.e = 0x880;
        this.iH(azyq0.a());
    }

    public final evql cz(boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new etee(this, z);
        azzc0.c = new Feature[]{eseb.a};
        azzc0.b = false;
        azzc0.d = 0x847;
        return this.iG(azzc0.a());
    }

    public final void da(long v) {
        azzc azzc0 = new azzc();
        azzc0.a = new etdk(this, v);
        azzc0.c = new Feature[]{eseb.e};
        azzc0.b = false;
        azzc0.d = 0x862;
        this.jn(azzc0.a());
    }

    public final void db(Activity activity0, Account account0, int v, byte[] arr_b, int v1) {
        TokenizeAccountRequest tokenizeAccountRequest0 = new TokenizeAccountRequest();
        tokenizeAccountRequest0.c = account0.name;
        tokenizeAccountRequest0.a = v;
        tokenizeAccountRequest0.d = arr_b;
        this.cK(activity0, v1, tokenizeAccountRequest0, new Feature[]{eseb.L});
    }

    public final void dc(esek esek0) {
        azyf azyf0 = this.iD(esek0, "tapAndPayDataChangedListener");
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new etea(azyf0);
        azyq0.b = new etec();
        azyq0.e = 0x86A;
        this.iH(azyq0.a());
    }

    public final void dd(esek esek0) {
        this.jm(azyg.a(esek0, "tapAndPayDataChangedListener"), 0x869);
    }

    public final void de(esel esel0) {
        this.jm(azyg.a(esel0, "tapAndPayServiceListener_1"), 0x881);
    }

    public final void df() {
        this.do(0);
    }

    public final void dg() {
        azzc azzc0 = new azzc();
        azzc0.a = new etdd();
        azzc0.d = 0x853;
        this.iG(azzc0.a());
    }

    public final void dh(SendPollingFrameHandlerEventRequest sendPollingFrameHandlerEventRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new etes(sendPollingFrameHandlerEventRequest0);
        azzc0.c = new Feature[]{eseb.J};
        azzc0.b = false;
        azzc0.d = 0x88D;
        this.jn(azzc0.a());
    }

    public final evql di(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new eteo(this, s);
        azzc0.c = new Feature[]{eseb.j};
        azzc0.d = 0x859;
        return this.jn(azzc0.a());
    }

    public final void dj(int v, Account account0, List list0) {
        SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest0 = new SetQuickAccessWalletCardsRequest();
        setQuickAccessWalletCardsRequest0.a = v;
        setQuickAccessWalletCardsRequest0.b = account0;
        setQuickAccessWalletCardsRequest0.c = (QuickAccessWalletCard[])list0.toArray(new QuickAccessWalletCard[0]);
        azzc azzc0 = new azzc();
        azzc0.a = new etep(setQuickAccessWalletCardsRequest0);
        azzc0.c = new Feature[]{eseb.M};
        azzc0.d = 0x861;
        this.jn(azzc0.a());
    }

    public final evql dk(int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new etck(v);
        azzc0.c = new Feature[]{eseb.U};
        azzc0.b = false;
        azzc0.d = 0x87B;
        return this.iG(azzc0.a());
    }

    public final evql dl(Activity activity0, long v, int v1) {
        TokenizeAccountRequest tokenizeAccountRequest0 = new TokenizeAccountRequest();
        tokenizeAccountRequest0.a = 1;
        tokenizeAccountRequest0.b = v;
        return this.cK(activity0, v1, tokenizeAccountRequest0, new Feature[]{eseb.ae});
    }

    public final void dm(Activity activity0, TokenizeAccountRequest tokenizeAccountRequest0, int v) {
        this.cK(activity0, v, tokenizeAccountRequest0, new Feature[]{eseb.ae});
    }

    public final void dn() {
        azzc azzc0 = new azzc();
        azzc0.a = new etdz(this);
        azzc0.c = new Feature[]{eseb.e};
        azzc0.b = false;
        azzc0.d = 0x863;
        this.jn(azzc0.a());
    }

    public final void do(int v) {
        this.dp(new SetSelectedTokenRequest(null, -1L, true, v, 0L));
    }

    private final evql dp(SetSelectedTokenRequest setSelectedTokenRequest0) {
        azzc azzc0 = new azzc();
        azzc0.a = new etde(this, setSelectedTokenRequest0);
        azzc0.d = 0x843;
        return this.jn(azzc0.a());
    }

    public final azua e(String s) {
        azua azua0 = new etbg(this.a, this.D, s);
        this.D.c(((azvc)azua0));
        return azua0;
    }

    public final azua f() {
        azua azua0 = new etba(this.a, this.D);
        this.D.c(((azvc)azua0));
        return azua0;
    }

    public final azua g() {
        azua azua0 = new etbe(this.a, this.D);
        this.D.c(((azvc)azua0));
        return azua0;
    }

    public final azua h(RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest0) {
        azua azua0 = new etbf(this.a, this.D, retrieveInAppPaymentCredentialRequest0);
        this.D.c(((azvc)azua0));
        return azua0;
    }

    public final evql i() {
        azzc azzc0 = new azzc();
        azzc0.d = 2130;
        azzc0.a = new etdh();
        return this.jn(azzc0.a());
    }

    public final evql j() {
        azzc azzc0 = new azzc();
        azzc0.a = new etdy(this);
        azzc0.d = 0x845;
        return this.iG(azzc0.a());
    }

    public final evql k(Account account0, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new etdf(this, z, account0);
        azzc0.c = new Feature[]{eseb.l};
        azzc0.d = 0x841;
        return this.iG(azzc0.a());
    }

    public final evql l(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new etdj(this, s);
        azzc0.d = 0x851;
        return this.iG(azzc0.a());
    }

    public final evql m(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new etdw(this, s);
        azzc0.c = new Feature[]{eseb.j};
        azzc0.d = 0x85A;
        return this.iG(azzc0.a());
    }

    public final evql n() {
        azzc azzc0 = new azzc();
        azzc0.a = new etef(this);
        azzc0.c = new Feature[]{eseb.D};
        azzc0.d = 0x887;
        return this.iG(azzc0.a());
    }

    public final evql o() {
        azzc azzc0 = new azzc();
        azzc0.a = new etem(this);
        azzc0.c = new Feature[]{eseb.p};
        azzc0.b = false;
        azzc0.d = 2150;
        return this.iG(azzc0.a());
    }
}

