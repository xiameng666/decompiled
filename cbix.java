import android.util.Base64;
import android.webkit.JavascriptInterface;

public final class cbix {
    private static final bboh a;
    private final cbja b;

    static {
        cbix.a = bboh.b("WebViewBridge", bbcu.ac);
    }

    public cbix(cbja cbja0) {
        this.b = cbja0;
    }

    @JavascriptInterface
    public final void activateProfileOwner() {
        ((ggtj)cbix.a.h()).x("Called activateProfileOwner().");
        this.b.C();
    }

    @JavascriptInterface
    public final void enableKidsSpace() {
        ((ggtj)cbix.a.h()).x("Called enableKidsSpace().");
        this.b.ag();
    }

    @JavascriptInterface
    public final void fetchAppDataList(String s) {
        ibuq.f(s, "packageNames");
        ((ggtj)cbix.a.h()).x("Called fetchAppDataList().");
        byte[] arr_b = Base64.decode(s, 2);
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gvls.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        gvls gvls0 = (gvls)hftv0;
        ibuq.e(gvls0, "parseFrom(...)");
        this.b.S(gvls0);
    }

    @JavascriptInterface
    public final void fetchFailedToBlockAppsList() {
        ((ggtj)cbix.a.h()).x("Called fetchFailedToBlockAppsList().");
        this.b.T();
    }

    @JavascriptInterface
    public final void fetchForcedUpdateAppsList() {
        ((ggtj)cbix.a.h()).x("Called fetchForcedUpdateAppsList().");
        this.b.U();
    }

    @JavascriptInterface
    public final void fetchReviewAppsList() {
        ((ggtj)cbix.a.h()).x("Called fetchReviewAppsList().");
        this.b.V();
    }

    @JavascriptInterface
    public final void fetchSupervisionState() {
        ((ggtj)cbix.a.h()).x("Called fetchSupervisionState().");
        this.b.D();
    }

    @JavascriptInterface
    public final void finishFlow(int v) {
        ((ggtj)cbix.a.h()).z("Called finishFlow(%d)", v);
        this.b.ah(v);
    }

    @JavascriptInterface
    public final void getAccounts() {
        ((ggtj)cbix.a.h()).x("Called getAccounts().");
        this.b.ai();
    }

    @JavascriptInterface
    public final int getLocationMode() {
        ((ggtj)cbix.a.h()).x("Called getLocationMode().");
        return this.b.P() - 1;
    }

    @JavascriptInterface
    public final void goBack() {
        ((ggtj)cbix.a.h()).x("Called goBack().");
        this.b.F();
    }

    @JavascriptInterface
    public final void installKidsSpace() {
        ((ggtj)cbix.a.h()).x("Called installKidsSpace().");
        this.b.ak();
    }

    @JavascriptInterface
    public final boolean isNetworkLocationOptIn() {
        ((ggtj)cbix.a.h()).x("Called isNetworkLocationOptIn().");
        return this.b.O();
    }

    @JavascriptInterface
    public final void notifyBridgeReady() {
        ((ggtj)cbix.a.h()).x("Called notifyBridgeReady().");
        this.b.I();
    }

    @JavascriptInterface
    public final void openHelpArticle(String s, String s1) {
        ibuq.f(s, "contentUrl");
        ibuq.f(s1, "context");
        ((ggtj)cbix.a.h()).x("Called openHelpArticle().");
        this.b.ap(s, s1);
    }

    @JavascriptInterface
    public final void prefetchSupervisionApp() {
        ((ggtj)cbix.a.h()).x("Called prefetchSupervisionApp()");
        this.b.aq();
    }

    @JavascriptInterface
    public final void requestParentApproval(String s) {
        ibuq.f(s, "callerId");
        ((ggtj)cbix.a.h()).x("Called requestParentApproval().");
        this.b.as(s);
    }

    @JavascriptInterface
    public final void saveFlowState(String s) {
        ibuq.f(s, "bridgeFlowState");
        ((ggtj)cbix.a.h()).x("Called saveFlowState().");
        byte[] arr_b = Base64.decode(s, 2);
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gvlp.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        gvlp gvlp0 = (gvlp)hftv0;
        ibuq.e(gvlp0, "parseFrom(...)");
        this.b.L(gvlp0);
    }

    @JavascriptInterface
    public final void selectAccount(String s) {
        ibuq.f(s, "accountName");
        ((ggtj)cbix.a.h()).x("Called selectAccount().");
        this.b.at(s);
    }

    @JavascriptInterface
    public final void showAccountPicker(String s) {
        ibuq.f(s, "continueUrl");
        ((ggtj)cbix.a.h()).B("Called showAccountPicker(\'%s\')", s);
        this.b.av(s);
    }

    @JavascriptInterface
    public final void showClockTimePicker(String s, int v, int v1) {
        ibuq.f(s, "title");
        ((ggtj)cbix.a.h()).X("Called showClockTimePicker(\'%s\', %d, %d)", s, Integer.valueOf(v), Integer.valueOf(v1));
        this.b.Y(s, v, v1);
    }

    @JavascriptInterface
    public final void showDurationTimePicker(String s, int v, int v1) {
        ibuq.f(s, "title");
        ((ggtj)cbix.a.h()).X("Called showDurationTimePicker(\'%s\', %d, %d)", s, Integer.valueOf(v), Integer.valueOf(v1));
        this.b.Z(s, v, v1);
    }

    @JavascriptInterface
    public final void showView() {
        ((ggtj)cbix.a.h()).x("Called showView()");
        this.b.aw();
    }

    @JavascriptInterface
    public final void startAddAccount() {
        ((ggtj)cbix.a.h()).x("Called startAddAccount().");
        this.b.ax();
    }

    @JavascriptInterface
    public final void startGoogleServices() {
        ((ggtj)cbix.a.h()).x("Called startGoogleServices().");
        this.b.aa();
    }
}

