import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.auth.api.credentials.ulp.ui.UlpUpgradeChimeraActivity;
import j..util.Objects;
import java.util.regex.Pattern;

public final class ahgu extends WebViewClient {
    final UlpUpgradeChimeraActivity a;

    public ahgu(UlpUpgradeChimeraActivity ulpUpgradeChimeraActivity0) {
        Objects.requireNonNull(ulpUpgradeChimeraActivity0);
        this.a = ulpUpgradeChimeraActivity0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
        return this.shouldOverrideUrlLoading(webView0, webResourceRequest0.getUrl().toString());
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        if(Pattern.compile(hpnf.a.b().a()).matcher(s).find()) {
            return false;
        }
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
        this.a.startActivity(intent0);
        return true;
    }
}

