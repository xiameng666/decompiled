package org.chromium.net;

import java.util.Date;

public abstract class RequestFinishedInfo.Metrics {
    public abstract Date getConnectEnd();

    public abstract Date getConnectStart();

    public abstract Date getDnsEnd();

    public abstract Date getDnsStart();

    public abstract Date getPushEnd();

    public abstract Date getPushStart();

    public abstract Long getReceivedByteCount();

    public abstract Date getRequestEnd();

    public abstract Date getRequestStart();

    public abstract Date getResponseStart();

    public abstract Date getSendingEnd();

    public abstract Date getSendingStart();

    public abstract Long getSentByteCount();

    public abstract boolean getSocketReused();

    public abstract Date getSslEnd();

    public abstract Date getSslStart();

    public abstract Long getTotalTimeMs();

    public abstract Long getTtfbMs();
}

