import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

public final class igas extends UrlRequest.Callback {
    private final UrlRequest.Callback a;

    public igas(UrlRequest.Callback urlRequest$Callback0) {
        this.a = urlRequest$Callback0;
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public final void onCanceled(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0) {
        this.a.onCanceled(urlRequest0, urlResponseInfo0);
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public final void onFailed(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0, CronetException cronetException0) {
        this.a.onFailed(urlRequest0, urlResponseInfo0, cronetException0);
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public final void onReadCompleted(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0, ByteBuffer byteBuffer0) {
        this.a.onReadCompleted(urlRequest0, urlResponseInfo0, byteBuffer0);
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public final void onRedirectReceived(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0, String s) {
        this.a.onRedirectReceived(urlRequest0, urlResponseInfo0, s);
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public final void onResponseStarted(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0) {
        this.a.onResponseStarted(urlRequest0, urlResponseInfo0);
    }

    @Override  // org.chromium.net.UrlRequest$Callback
    public final void onSucceeded(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0) {
        this.a.onSucceeded(urlRequest0, urlResponseInfo0);
    }
}

