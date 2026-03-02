package org.chromium.net;

import java.util.concurrent.Executor;

@Deprecated
public abstract class ExperimentalUrlRequest.Builder extends UrlRequest.Builder {
    public static final int DEFAULT_IDEMPOTENCY = 0;
    public static final int IDEMPOTENT = 1;
    public static final int NOT_IDEMPOTENT = 2;

    public abstract ExperimentalUrlRequest.Builder addHeader(String arg1, String arg2);

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest.Builder addHeader(String s, String s1) {
        return this.addHeader(s, s1);
    }

    public ExperimentalUrlRequest.Builder addRequestAnnotation(Object object0) {
        return this;
    }

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest.Builder addRequestAnnotation(Object object0) {
        return this.addRequestAnnotation(object0);
    }

    public abstract ExperimentalUrlRequest.Builder allowDirectExecutor();

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest.Builder allowDirectExecutor() {
        return this.allowDirectExecutor();
    }

    public abstract ExperimentalUrlRequest build();

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest build() {
        return this.build();
    }

    public abstract ExperimentalUrlRequest.Builder disableCache();

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest.Builder disableCache() {
        return this.disableCache();
    }

    public ExperimentalUrlRequest.Builder disableConnectionMigration() {
        return this;
    }

    public abstract ExperimentalUrlRequest.Builder setHttpMethod(String arg1);

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest.Builder setHttpMethod(String s) {
        return this.setHttpMethod(s);
    }

    public ExperimentalUrlRequest.Builder setIdempotency(int v) {
        return this;
    }

    public abstract ExperimentalUrlRequest.Builder setPriority(int arg1);

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest.Builder setPriority(int v) {
        return this.setPriority(v);
    }

    public ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener requestFinishedInfo$Listener0) {
        return this;
    }

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener requestFinishedInfo$Listener0) {
        return this.setRequestFinishedListener(requestFinishedInfo$Listener0);
    }

    public ExperimentalUrlRequest.Builder setTrafficStatsTag(int v) {
        return this;
    }

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest.Builder setTrafficStatsTag(int v) {
        return this.setTrafficStatsTag(v);
    }

    public ExperimentalUrlRequest.Builder setTrafficStatsUid(int v) {
        return this;
    }

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest.Builder setTrafficStatsUid(int v) {
        return this.setTrafficStatsUid(v);
    }

    public abstract ExperimentalUrlRequest.Builder setUploadDataProvider(UploadDataProvider arg1, Executor arg2);

    @Override  // org.chromium.net.UrlRequest$Builder
    public UrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider0, Executor executor0) {
        return this.setUploadDataProvider(uploadDataProvider0, executor0);
    }
}

