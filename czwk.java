import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ScheduledExecutorService;

public final class czwk extends czlg {
    public final czwn h;
    public final PipedInputStream i;
    private final cumn j;
    private final ScheduledExecutorService k;
    private final PipedInputStream l;
    private final PipedOutputStream m;
    private final PipedOutputStream n;

    public czwk() {
        super("IncomingNfcSocket");
        this.k = cuui.f();
        PipedInputStream pipedInputStream0 = new PipedInputStream(0x1FFFE);
        this.l = pipedInputStream0;
        PipedInputStream pipedInputStream1 = new PipedInputStream(0x1FFFE);
        this.i = pipedInputStream1;
        this.h = null;
        this.j = null;
        this.m = czwk.m(pipedInputStream0);
        this.n = czwk.m(pipedInputStream1);
    }

    public czwk(czwn czwn0) {
        super(czwn0.toString());
        ScheduledExecutorService scheduledExecutorService0 = cuui.f();
        this.k = scheduledExecutorService0;
        PipedInputStream pipedInputStream0 = new PipedInputStream(0x1FFFE);
        this.l = pipedInputStream0;
        PipedInputStream pipedInputStream1 = new PipedInputStream(0x1FFFE);
        this.i = pipedInputStream1;
        this.h = czwn0;
        czwj czwj0 = new czwj(this);
        long v = hvog.a.bk().bN();
        this.j = cumn.c(czkq.a, czwj0, v, scheduledExecutorService0);
        this.m = czwk.m(pipedInputStream0);
        this.n = czwk.m(pipedInputStream1);
    }

    @Override  // czlg
    public final int a() {
        return 7;
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
    public final void h() {
        cuui.h(this.k, "NearFieldCommunicationSocket.dataExecutor");
        cumn cumn0 = this.j;
        if(cumn0 != null) {
            cumn0.b();
        }
        czwn czwn0 = this.h;
        if(czwn0 != null) {
            czwn0.close();
        }
        bbpb.b(this.i);
        bbpb.b(this.m);
        bbpb.b(this.l);
        bbpb.b(this.n);
    }

    public final void k(byte[] arr_b) {
        PipedOutputStream pipedOutputStream0 = this.m;
        if(pipedOutputStream0 != null) {
            try {
                pipedOutputStream0.write(arr_b);
                pipedOutputStream0.flush();
            }
            catch(IOException iOException0) {
                czkq.a.e().f(iOException0).p("NearFieldCommunicationSocket encountered an error when receiving incoming data.", new Object[0]);
            }
            return;
        }
        czkq.a.c().p("NearFieldCommunicationSocket failed to process incoming bytes.", new Object[0]);
    }

    public final byte[] l(int v) {
        try {
            PipedInputStream pipedInputStream0 = this.i;
            if(pipedInputStream0.available() == 0) {
                return new byte[0];
            }
            byte[] arr_b = new byte[v];
            int v1 = pipedInputStream0.read(arr_b);
            if(v1 < 0) {
                bbpb.b(this);
                return new byte[0];
            }
            byte[] arr_b1 = new byte[v1];
            System.arraycopy(arr_b, 0, arr_b1, 0, v1);
            return arr_b1;
        }
        catch(IOException iOException0) {
            czkq.a.e().f(iOException0).p("NearFieldCommunicationSocket encountered an error when reading outgoing data.", new Object[0]);
            bbpb.b(this);
            return new byte[0];
        }
    }

    private static PipedOutputStream m(PipedInputStream pipedInputStream0) {
        try {
            return new PipedOutputStream(pipedInputStream0);
        }
        catch(IOException unused_ex) {
            return null;
        }
    }
}

