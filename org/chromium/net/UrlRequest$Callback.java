package org.chromium.net;

import java.nio.ByteBuffer;

public abstract class UrlRequest.Callback {
    public void onCanceled(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0) {
    }

    public abstract void onFailed(UrlRequest arg1, UrlResponseInfo arg2, CronetException arg3);

    public abstract void onReadCompleted(UrlRequest arg1, UrlResponseInfo arg2, ByteBuffer arg3);

    public abstract void onRedirectReceived(UrlRequest arg1, UrlResponseInfo arg2, String arg3);

    public abstract void onResponseStarted(UrlRequest arg1, UrlResponseInfo arg2);

    public abstract void onSucceeded(UrlRequest arg1, UrlResponseInfo arg2);
}

