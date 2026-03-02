import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream.Builder;
import org.chromium.net.BidirectionalStream.Callback;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest.Builder;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo.Listener;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest.Builder;
import org.chromium.net.UrlRequest.Callback;

public abstract class ifxr extends ExperimentalCronetEngine {
    protected abstract ExperimentalBidirectionalStream b(String arg1, BidirectionalStream.Callback arg2, Executor arg3, String arg4, List arg5, int arg6, boolean arg7, Collection arg8, boolean arg9, int arg10, boolean arg11, int arg12);

    protected abstract ExperimentalUrlRequest c(String arg1, UrlRequest.Callback arg2, Executor arg3, int arg4, Collection arg5, boolean arg6, boolean arg7, boolean arg8, int arg9, boolean arg10, int arg11, RequestFinishedInfo.Listener arg12, long arg13, String arg14, ArrayList arg15, UploadDataProvider arg16, Executor arg17);

    @Override  // org.chromium.net.ExperimentalCronetEngine
    public BidirectionalStream.Builder newBidirectionalStreamBuilder(String s, BidirectionalStream.Callback bidirectionalStream$Callback0, Executor executor0) {
        return super.newBidirectionalStreamBuilder(s, bidirectionalStream$Callback0, executor0);
    }

    @Override  // org.chromium.net.ExperimentalCronetEngine
    public final ExperimentalUrlRequest.Builder newUrlRequestBuilder(String s, UrlRequest.Callback urlRequest$Callback0, Executor executor0) {
        return new igal(s, urlRequest$Callback0, executor0, this);
    }

    @Override  // org.chromium.net.ExperimentalCronetEngine
    public UrlRequest.Builder newUrlRequestBuilder(String s, UrlRequest.Callback urlRequest$Callback0, Executor executor0) {
        return new igal(s, urlRequest$Callback0, executor0, this);
    }
}

