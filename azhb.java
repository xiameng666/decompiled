import android.os.ConditionVariable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.CancellationException;

final class azhb extends clck {
    public final hfse a;
    clcq b;
    Exception c;
    public final ConditionVariable d;
    private final WritableByteChannel e;

    public azhb() {
        hfse hfse0 = new hfse(0x80);
        this.a = hfse0;
        this.e = Channels.newChannel(hfse0);
        this.d = new ConditionVariable();
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        this.b = clcq0;
        this.d.open();
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        if(gfsx0.i()) {
            this.b = (clcq)gfsx0.d();
        }
        this.c = clbw0;
        this.d.open();
    }

    @Override  // clck
    public final void e(clcn clcn0, clcq clcq0) {
        clcn0.d(ByteBuffer.allocateDirect(0x1000));
    }

    @Override  // clck
    public final void f(gfsx gfsx0) {
        this.c = new CancellationException();
        this.d.open();
    }

    @Override  // clck
    public final void gg(clcn clcn0, clcq clcq0, ByteBuffer byteBuffer0) {
        byteBuffer0.flip();
        this.e.write(byteBuffer0);
        byteBuffer0.clear();
        clcn0.d(byteBuffer0);
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        throw new IOException("Did not expect a redirect to: " + s);
    }
}

