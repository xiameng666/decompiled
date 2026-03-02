package org.chromium.net;

import java.util.Collection;

public abstract class RequestFinishedInfo {
    public static final int CANCELED = 2;
    public static final int FAILED = 1;
    public static final int SUCCEEDED;

    public abstract Collection getAnnotations();

    public abstract CronetException getException();

    public abstract int getFinishedReason();

    public abstract RequestFinishedInfo.Metrics getMetrics();

    public abstract UrlResponseInfo getResponseInfo();

    public abstract String getUrl();
}

