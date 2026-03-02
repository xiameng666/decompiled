import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

final class fegc extends Thread implements Closeable {
    public final int a;
    public volatile boolean b;
    public volatile boolean c;
    public final Object d;
    private final fekh e;
    private final fczq f;
    private final BluetoothDevice g;
    private final int h;
    private final AtomicBoolean i;

    public fegc(BluetoothDevice bluetoothDevice0, fczq fczq0, fekh fekh0, int v) {
        this.b = false;
        this.c = true;
        this.d = new Object();
        batl.s(bluetoothDevice0);
        this.g = bluetoothDevice0;
        batl.s(fczq0);
        this.f = fczq0;
        this.e = fekh0;
        this.h = 5000;
        this.a = v;
        this.i = new AtomicBoolean(true);
        this.setName("WearableBtBleClientThread-" + fczq0.j);
    }

    final void a() {
        synchronized(this.d) {
            this.c = false;
        }
    }

    private static final void b(int v, String s, Throwable throwable0) {
        ffgp.g().d(v, s, throwable0);
    }

    private static final void c(int v, String s) {
        fegc.b(v, s, null);
    }

    @Override
    public final void close() {
        ffmn.a("BleClientThread", "BleClientThread shutting down", new Object[0]);
        this.b = true;
        this.interrupt();
        gmde.c(this);
    }

    @Override
    public final void run() {
        BluetoothDevice bluetoothDevice0;
        while(!this.b) {
            try {
                Object object0 = this.d;
                synchronized(object0) {
                    if(!this.c) {
                        this.b = true;
                        break;
                    }
                }
                bluetoothDevice0 = this.g;
                fegc.c(2, "Connecting to \"" + bluetoothDevice0.getName() + "\"");
            }
            catch(Throwable throwable0) {
                goto label_64;
            }
            BluetoothSocket bluetoothSocket0 = null;
            try {
                try {
                    ffmn.a("BleClientThread", "doConnection with psm: %d", new Object[]{((int)this.a)});
                    this.e.c();
                }
                catch(feai unused_ex) {
                    goto label_35;
                }
                catch(fdrr unused_ex) {
                    goto label_38;
                }
                catch(IOException iOException0) {
                    goto label_42;
                }
                catch(RuntimeException runtimeException0) {
                    goto label_46;
                }
                try {
                    bluetoothSocket0 = bluetoothDevice0.createL2capChannel(this.a);
                    goto label_17;
                }
                catch(RuntimeException runtimeException1) {
                }
                catch(feai unused_ex) {
                    goto label_35;
                }
                catch(fdrr unused_ex) {
                    goto label_38;
                }
                catch(IOException iOException0) {
                    goto label_42;
                }
                try {
                    try {
                        throw new IOException("Caught RuntimeException when creating the L2CAP socket.", runtimeException1);
                    }
                    catch(feai unused_ex) {
                        goto label_35;
                    }
                    catch(fdrr unused_ex) {
                        goto label_38;
                    }
                    catch(IOException iOException0) {
                        goto label_42;
                    }
                    try {
                    label_17:
                        bluetoothSocket0.connect();
                        goto label_23;
                    }
                    catch(IOException iOException1) {
                    }
                    catch(feai unused_ex) {
                        goto label_35;
                    }
                    catch(fdrr unused_ex) {
                        goto label_38;
                    }
                    try {
                        fdob.k(5);
                        fdob.g(5, ffgp.m(), this.f.h());
                        throw iOException1;
                    label_23:
                        this.e.b();
                        ffmn.a("BleClientThread", "L2CAP socket connected, running sync loop", new Object[0]);
                        fegc.c(3, "Connected, running sync loop");
                        this.f.u = 3;
                        fdzv fdzv0 = ffgp.d();
                        InputStream inputStream0 = bluetoothSocket0.getInputStream();
                        feke feke0 = new feke(this.e, inputStream0);
                        OutputStream outputStream0 = bluetoothSocket0.getOutputStream();
                        fdzv0.p(feke0, new fekf(this.e, outputStream0), this.f);
                        this.e.d("Socket closed");
                        fegc.c(1, "Socket closed");
                        goto label_56;
                    }
                    catch(feai unused_ex) {
                    }
                    catch(fdrr unused_ex) {
                        goto label_38;
                    }
                    catch(IOException iOException0) {
                        goto label_42;
                    }
                }
                catch(RuntimeException runtimeException0) {
                    goto label_46;
                }
            label_35:
                this.e.d("Wire protocol version mismatch!");
                fegc.c(4, "Error: wire protocol version mismatch");
                goto label_56;
            label_38:
                this.e.d("Connection attempted from incorrect client");
                fegc.c(4, "Error: Connection attempted from incorrect client");
                goto label_56;
            label_42:
                fegc.b(1, "Failed to connect", this.e.a(iOException0));
            }
            catch(Throwable throwable1) {
                goto label_53;
            }
            try {
                ffmn.a("BleClientThread", "Connection finished", new Object[0]);
                goto label_57;
            }
            catch(Throwable throwable0) {
                goto label_64;
            }
            try {
            label_46:
                ffmn.a("BleClientThread", "Unexpected runtime exception: %s", new Object[]{runtimeException0});
                IOException iOException2 = new IOException("Unexpected runtime exception", runtimeException0);
                this.e.a(iOException2);
                fegc.b(1, "Unexpected runtime exception", runtimeException0);
            }
            catch(Throwable throwable1) {
                goto label_53;
            }
            try {
                ffmn.a("BleClientThread", "Connection finished", new Object[0]);
                goto label_57;
            label_53:
                ffmn.a("BleClientThread", "Connection finished", new Object[0]);
                ffmm.a(bluetoothSocket0);
                throw throwable1;
            label_56:
                ffmn.a("BleClientThread", "Connection finished", new Object[0]);
            label_57:
                ffmm.a(bluetoothSocket0);
                try {
                    Thread.sleep(this.h);
                }
                catch(InterruptedException unused_ex) {
                    ffmn.f("BleClientThread", "Interrupted", new Object[0]);
                }
            }
            catch(Throwable throwable0) {
            label_64:
                fegc.c(1, "Wear OS BluetoothThread finished");
                AtomicBoolean atomicBoolean0 = this.i;
                synchronized(atomicBoolean0) {
                    atomicBoolean0.set(false);
                }
                throw throwable0;
            }
        }
        fegc.c(1, "Wear OS BluetoothThread finished");
        AtomicBoolean atomicBoolean1 = this.i;
        synchronized(atomicBoolean1) {
            atomicBoolean1.set(false);
        }
    }
}

