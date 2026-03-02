import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import j..util.Objects;
import java.util.Locale;

final class eppy extends WebChromeClient {
    public eppy(epqa epqa0) {
        Objects.requireNonNull(epqa0);
        super();
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage0) {
        String s = String.format(Locale.getDefault(), "%s/%s:%d - %s", consoleMessage0.messageLevel(), consoleMessage0.sourceId(), consoleMessage0.lineNumber(), consoleMessage0.message());
        epqa.a.d(s, new Object[0]);
        return true;
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView0, boolean z, boolean z1, Message message0) {
        message0.obj = webView0;
        message0.sendToTarget();
        return true;
    }
}

