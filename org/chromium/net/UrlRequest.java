package org.chromium.net;

import java.nio.ByteBuffer;

public abstract class UrlRequest {
    public abstract void cancel();

    public abstract void followRedirect();

    public abstract void getStatus(UrlRequest.StatusListener arg1);

    public abstract boolean isDone();

    public abstract void read(ByteBuffer arg1);

    public abstract void start();
}

