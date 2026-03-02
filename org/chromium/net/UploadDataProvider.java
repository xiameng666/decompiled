package org.chromium.net;

import java.io.Closeable;
import java.nio.ByteBuffer;

public abstract class UploadDataProvider implements Closeable {
    @Override
    public void close() {
    }

    public abstract long getLength();

    public abstract void read(UploadDataSink arg1, ByteBuffer arg2);

    public abstract void rewind(UploadDataSink arg1);
}

