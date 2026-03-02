package j$.nio.channels;

import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileLock;
import java.util.concurrent.Future;

public abstract class c implements Channel {
    public abstract void c(boolean arg1);

    public abstract Future e(long arg1, long arg2, boolean arg3);

    public abstract void h(long arg1, long arg2, boolean arg3, Object arg4, f arg5);

    public abstract Future j(ByteBuffer arg1, long arg2);

    public abstract void l(ByteBuffer arg1, long arg2, Object arg3, f arg4);

    public abstract c m(long arg1);

    public abstract FileLock o(long arg1, long arg2, boolean arg3);

    public abstract Future r(ByteBuffer arg1, long arg2);

    public abstract long size();

    public abstract void y(ByteBuffer arg1, long arg2, Object arg3, f arg4);
}

