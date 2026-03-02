import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

final class aelw extends WebChromeClient {
    @Override  // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage0) {
        ((ggtj)((ggtj)aelz.a.j()).ar(0x2F5)).Y("%s/%s:%d - %s", consoleMessage0.messageLevel(), consoleMessage0.sourceId(), Integer.valueOf(consoleMessage0.lineNumber()), consoleMessage0.message());
        return true;
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView0, boolean z, boolean z1, Message message0) {
        message0.obj = webView0;
        message0.sendToTarget();
        return true;
    }
}

