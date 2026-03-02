package org.chromium.net;

import java.nio.ByteBuffer;

public abstract class BidirectionalStream {
    public abstract void cancel();

    public abstract void flush();

    public abstract boolean isDone();

    public abstract void read(ByteBuffer arg1);

    public abstract void start();

    public abstract void write(ByteBuffer arg1, boolean arg2);
}

