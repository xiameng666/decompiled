package org.chromium.net;

import java.nio.ByteBuffer;

public abstract class BidirectionalStream.Callback {
    public void onCanceled(BidirectionalStream bidirectionalStream0, UrlResponseInfo urlResponseInfo0) {
    }

    public abstract void onFailed(BidirectionalStream arg1, UrlResponseInfo arg2, CronetException arg3);

    public abstract void onReadCompleted(BidirectionalStream arg1, UrlResponseInfo arg2, ByteBuffer arg3, boolean arg4);

    public abstract void onResponseHeadersReceived(BidirectionalStream arg1, UrlResponseInfo arg2);

    public void onResponseTrailersReceived(BidirectionalStream bidirectionalStream0, UrlResponseInfo urlResponseInfo0, UrlResponseInfo.HeaderBlock urlResponseInfo$HeaderBlock0) {
    }

    public abstract void onStreamReady(BidirectionalStream arg1);

    public abstract void onSucceeded(BidirectionalStream arg1, UrlResponseInfo arg2);

    public abstract void onWriteCompleted(BidirectionalStream arg1, UrlResponseInfo arg2, ByteBuffer arg3, boolean arg4);
}

