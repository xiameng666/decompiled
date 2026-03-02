import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.DataChannel.Buffer;
import org.webrtc.DataChannel.Observer;
import org.webrtc.DataChannel.State;
import org.webrtc.DataChannel;

public final class czze extends czlg implements DataChannel.Observer {
    public final DataChannel h;
    public final Object i;
    final gmcg j;
    public czyx k;
    public final czjy l;
    private final AtomicBoolean m;
    private final OutputStream n;

    public czze(String s, DataChannel dataChannel0) {
        super(s, 1, 1, -1, 0);
        this.m = new AtomicBoolean(false);
        this.i = new Object();
        this.n = new czzd(this);
        this.h = dataChannel0;
        this.l = new czjy();
        this.j = cuui.d();
        dataChannel0.c();
        long v = dataChannel0.a;
        if(v != 0L) {
            dataChannel0.nativeUnregisterObserver(v);
        }
        dataChannel0.a = dataChannel0.nativeRegisterObserver(this);
    }

    @Override  // czlg
    public final int a() {
        return 9;
    }

    @Override  // czlg
    public final InputStream e() {
        return this.l;
    }

    @Override  // czlg
    public final OutputStream f() {
        return this.n;
    }

    @Override  // czlg
    protected final void h() {
        if(this.l()) {
            return;
        }
        gmcg gmcg0 = this.j;
        if(gmcg0 != null) {
            cuui.h(gmcg0, "WebRtcSocket.singleThreadOffloader");
        }
        this.m.set(true);
        bbpb.b(this.l);
        this.h.d();
        this.k();
        czkq.a.b().p("Closed WebRTC socket.", new Object[0]);
    }

    // Detected as a lambda impl.
    public final void k() {
        synchronized(this.i) {
            this.i.notifyAll();
        }
    }

    public final boolean l() {
        return this.m.get();
    }

    private final void m(Runnable runnable0) {
        this.j.execute(runnable0);
    }

    @Override  // org.webrtc.DataChannel$Observer
    public final void onBufferedAmountChange(long v) {
        if(hvol.ar()) {
            if(this.h.a() < hvog.a.bk().df()) {
                this.m(() -> synchronized(this.i) {
                    this.i.notifyAll();
                });
            }
            return;
        }
        this.m(() -> synchronized(this.i) {
            this.i.notifyAll();
        });
    }

    @Override  // org.webrtc.DataChannel$Observer
    public final void onMessage(DataChannel.Buffer dataChannel$Buffer0) {
        byte[] arr_b = new byte[dataChannel$Buffer0.a.remaining()];
        dataChannel$Buffer0.a.get(arr_b);
        this.m(new czzc(this, arr_b));
    }

    @Override  // org.webrtc.DataChannel$Observer
    public final void onStateChange() {
        DataChannel dataChannel0 = this.h;
        if(dataChannel0.b() == DataChannel.State.b) {
            czyx czyx0 = this.k;
            if(czyx0 != null) {
                czyx0.a(this);
            }
        }
        else if(dataChannel0.b() == DataChannel.State.d) {
            dataChannel0.c();
            dataChannel0.nativeUnregisterObserver(dataChannel0.a);
            dataChannel0.a = 0L;
            czyx czyx1 = this.k;
            if(czyx1 != null) {
                czyx1.b(this);
            }
        }
    }
}

