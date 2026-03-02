import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

final class cztl extends OutputStream {
    public static final AtomicInteger a;
    public byte[] b;
    public final AtomicBoolean c;
    Boolean d;
    private final gelh e;
    private final DataOutputStream f;

    static {
        cztl.a = new AtomicInteger(0);
    }

    public cztl(byte[] arr_b, gelh gelh0, OutputStream outputStream0) {
        this.c = new AtomicBoolean(false);
        this.d = null;
        this.b = arr_b;
        this.e = gelh0;
        if(outputStream0 == null) {
            this.f = null;
            return;
        }
        this.f = new DataOutputStream(new BufferedOutputStream(outputStream0));
    }

    final void a(byte[] arr_b) {
        gelf gelf0 = this.b(arr_b);
        if(gelf0 != null) {
            try {
                gelf0.get(hvog.a.bk().E(), TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException | ExecutionException | TimeoutException exception0) {
                if((exception0 instanceof InterruptedException)) {
                    Thread.currentThread().interrupt();
                }
                throw new IOException("BleSocketOutputStream write data but timeout");
            }
        }
    }

    final gelf b(byte[] arr_b) {
        byte[] arr_b1 = czsx.c(czsx.a, arr_b);
        if(arr_b1 != null) {
            return this.c(arr_b1);
        }
        throw new IOException("BleSocketOutputStream failed to create a BlePacket");
    }

    private final gelf c(byte[] arr_b) {
        DataOutputStream dataOutputStream0 = this.f;
        if(dataOutputStream0 != null) {
            dataOutputStream0.writeInt(arr_b.length);
            dataOutputStream0.write(arr_b);
            dataOutputStream0.flush();
            return null;
        }
        gelh gelh0 = this.e;
        if(gelh0 != null) {
            return gelh0.l(arr_b);
        }
        throw new IOException("BleSocketOutputStream illegal state, both gattSocket and l2capOutputStream are null!");
    }

    @Override
    public final void close() {
        AtomicBoolean atomicBoolean0 = this.c;
        if(!atomicBoolean0.compareAndSet(false, true)) {
            return;
        }
        synchronized(atomicBoolean0) {
            atomicBoolean0.notifyAll();
        }
    }

    @Override
    public final void write(int v) {
        this.write(new byte[]{((byte)v)});
    }

    @Override
    public final void write(byte[] arr_b) {
        this.write(arr_b, 0, arr_b.length);
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = czsx.c(this.b, Arrays.copyOfRange(arr_b, v, v1 + v));
        if(arr_b1 == null) {
            throw new IOException("BleSocketOutputStream failed to create a BlePacket");
        }
        gelf gelf0 = this.c(arr_b1);
        if(gelf0 == null) {
            if(!hvol.ax() || this.d != null && !this.d.booleanValue()) {
                return;
            }
            AtomicInteger atomicInteger0 = cztl.a;
            atomicInteger0.addAndGet(arr_b1.length);
            synchronized(atomicInteger0) {
                if(((long)atomicInteger0.get()) > hvog.V()) {
                    try {
                        atomicInteger0.wait(hvog.a.bk().bo());
                        if(this.d == null) {
                            this.d = Boolean.valueOf(false);
                        }
                    }
                    catch(InterruptedException unused_ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            return;
        }
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        gelf0.b(new cztj(this, atomicBoolean0));
        AtomicBoolean atomicBoolean1 = this.c;
        synchronized(atomicBoolean1) {
            while(!gelf0.isDone() && !atomicBoolean1.get()) {
                try {
                    atomicBoolean1.wait();
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
        if(atomicBoolean0.get()) {
            return;
        }
        throw new IOException("BleSocketOutputStream failed to write data");
    }
}

