import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import j..util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

final class fdzt implements Runnable {
    final ayux a;
    final ayux b;
    final fdzv c;
    private final InputStream d;
    private final String e;
    private final fdzr f;
    private final fdzb g;
    private final fdwj h;
    private final fdpd i;
    private final fens j;
    private final fdzw k;
    private final boolean l;
    private final esaa m;
    private final fdzp n;
    private final brzr o;
    private final fdzy p;

    public fdzt(fdzv fdzv0, InputStream inputStream0, feyl feyl0, fdzr fdzr0, fdzb fdzb0, fdpd fdpd0, fens fens0, esaa esaa0, brzr brzr0) {
        Objects.requireNonNull(fdzv0);
        this.c = fdzv0;
        super();
        this.k = new fdzw();
        this.p = new fdzy();
        this.d = inputStream0;
        this.e = feyl0.c;
        String s = fdzv0.a;
        fdwk fdwk0 = feyl0.f == 0 ? new fdwk(s) : new fdwm(s);
        this.h = fdwk0;
        this.f = fdzr0;
        this.g = fdzb0;
        this.i = fdpd0;
        this.j = fens0;
        this.l = feaa.h(Build.VERSION.SDK_INT, feyl0.m);
        this.a = fdob.b().a(fdnx.n);
        this.b = fdob.b().a(fdnx.p);
        this.o = brzr0;
        if(iaah.a.c().c()) {
            this.n = new fdzp(esaa0);
            this.m = null;
            return;
        }
        this.n = null;
        this.m = esaa0;
    }

    @Override
    public final void run() {
        ayuy ayuy0;
        ffau ffau1;
        String s = this.e;
        Thread.currentThread().setName("Wear:Reader-" + s);
        ProtoLiteBuilder hftp0 = null;
        try {
            try {
                while(!Thread.interrupted()) {
                    if(hftp0 == null) {
                        hftp0 = ((ProtoLiteMessage)ffav.a).v_newBuilder();
                    }
                    fdzp fdzp0 = this.n;
                    if(fdzp0 == null) {
                        esaa esaa0 = this.m;
                        if(esaa0 != null && esaa0.l()) {
                            esaa0.g();
                        }
                    }
                    else if(fdzp0.a != null && fdzp0.a.l()) {
                        ffmn.e("Wear_Transport", "Scheduling a wake lock release in %dms", new Object[]{iaah.b()});
                        fdzo fdzo0 = new fdzo(fdzp0);
                        long v = iaah.b();
                        fdzp0.c = fdzp0.b.g(fdzo0, v, TimeUnit.MILLISECONDS);
                        gfsx.m(fdzp0.c);
                    }
                    int v1 = feaa.j(this.k, this.d, hftp0, this.f, this.i);
                    if(fdzp0 == null) {
                        esaa esaa2 = this.m;
                        if(esaa2 != null) {
                            esaa2.b();
                        }
                    }
                    else {
                        esaa esaa1 = fdzp0.a;
                        if(esaa1 != null) {
                            if(fdzp0.c != null && !fdzp0.c.isDone()) {
                                fdzp0.c.cancel(false);
                                ffmn.a("Wear_Transport", "Cancelling the in-progress wakelock release operation", new Object[0]);
                                boolean z = fdzp0.c.isCancelled();
                                fdzp0.c = null;
                                if(!z) {
                                    ffmn.e("Wear_Transport", "Acquiring the wake lock", new Object[0]);
                                    esaa1.b();
                                }
                            }
                            else {
                                ffmn.e("Wear_Transport", "Acquiring the wake lock", new Object[0]);
                                esaa1.b();
                            }
                        }
                    }
                    gdqs gdqs0 = brzr.o(this.o, "readMessage");
                    try {
                        int v2 = ((ffav)hftp0.b_message).f;
                        if(v2 == 1) {
                            ffmn.e("Wear_Transport", "only one message piece", new Object[0]);
                            ffau1 = feaa.c(((ffav)hftp0.N_build()));
                            if(hftp0.a_defaultInstance.isImmutable()) {
                                throw new IllegalArgumentException("Default instance must be immutable.");
                            }
                            hftp0.b_message = hftp0.P_newInstance();
                        }
                        else {
                            fdzy fdzy0 = this.p;
                            ffav ffav0 = (ffav)hftp0.N_build();
                            if(Log.isLoggable("wearable", 3) || Log.isLoggable("WearableVerbose", 2)) {
                                Log.d("wearable", "incoming message piece: " + feaa.f(ffav0));
                            }
                            batl.c(ffav0.f > 1, "processIncomingMessagePiece called with single-piece message.");
                            int v3 = ffav0.g;
                            if(v3 == -1) {
                                throw new IOException("Message piece has an invalid queue id.");
                            }
                            SparseArray sparseArray0 = fdzy0.a;
                            List list0 = (List)sparseArray0.get(v3);
                            if(list0 != null && !((ffav)list0.get(0)).d.equals(ffav0.d)) {
                                throw new IOException(a.aA(list0, "WearableReader: Message digest mismatch after ", " pieces."));
                            }
                            if(list0 == null) {
                                list0 = new ArrayList(ffav0.f);
                                sparseArray0.put(ffav0.g, list0);
                            }
                            list0.add(ffav0);
                            if(list0.size() != ffav0.e) {
                                int v4 = ffav0.e;
                                list0.clear();
                                sparseArray0.delete(ffav0.g);
                                throw new IOException("Message piece received out of order; expected: " + list0.size() + " but got: " + v4);
                            }
                            if(list0.size() >= ffav0.f) {
                                if(Log.isLoggable("wearable", 3) || Log.isLoggable("WearableVerbose", 2)) {
                                    Log.d("wearable", "Message pieces are all here - reconstructing message.");
                                }
                                ffau ffau0 = feaa.d(list0);
                                if(Log.isLoggable("wearable", 2) || Log.isLoggable("WearableVerbose", 2)) {
                                    Log.v("wearable", "Message reconstruct completed, returning message: " + ffau0);
                                }
                                list0.clear();
                                sparseArray0.delete(ffav0.g);
                                ffau1 = ffau0;
                            }
                            else {
                                if(Log.isLoggable("wearable", 3) || Log.isLoggable("WearableVerbose", 2)) {
                                    Log.d("wearable", a.s(feaa.f(ffav0), list0.size(), "Message not completed yet, number of pieces received: ", " for message piece: "));
                                }
                                ffau1 = null;
                            }
                            hftp0 = null;
                        }
                        if(ffau1 != null) {
                            fdyj fdyj0 = this.h.a(ffau1, v1);
                            ffau ffau2 = fdyj0.a;
                            fdvw fdvw0 = feaa.b(ffau2);
                            fdzv fdzv0 = this.c;
                            fdzv0.b.a(fdvw0, "bytesRecv", v1);
                            fdzv0.b.a(fdvw0, "msgsRecv", 1);
                            fdvw fdvw1 = fdvw0;
                            fdob.b().c(fdvw0.b, fdvw0.a, ((long)v1), false);
                            if((ffau2.b & 0x400) == 0) {
                                if(this.l) {
                                    this.g.f = true;
                                    this.g.f();
                                }
                                if(fdyj0.c) {
                                    if(hzvy.d()) {
                                        ffmn.a("Wear_Transport", "Message received: %d message pieces, %d bytes in total, %s", new Object[]{v2, ((int)fdyj0.d), fdvw1});
                                    }
                                    fens fens0 = this.j;
                                    if(fens0 != null) {
                                        ayuy0 = ayvf.b;
                                        this.b.a(0L, 1L, ayuy0);
                                        if(fens0.b(ffau2)) {
                                            goto label_118;
                                        }
                                        else {
                                            ffau2 = fens0.a(ffau2);
                                        }
                                    }
                                    gftb.check(ffau2);
                                    if((ffau2.b & 0x4000) != 0) {
                                        ffmn.a("Wear_Transport", "Received control plane message: %s", new Object[]{ffau2});
                                        if(fdzv0.j == null) {
                                            ffmn.d("Wear_Transport", "Control plane transport is null, even though phone switching is enabled. Instantiating a new one to handle the incoming message.", new Object[0]);
                                            fdzv0.c().a(ffgp.a());
                                        }
                                    }
                                    for(Object object0: fdzv0.h) {
                                        ((fdwx)object0).f(s, ffau2, fdyj0.b);
                                    }
                                    if(gdqs0 == null) {
                                        continue;
                                    label_118:
                                        this.a.a(0L, 1L, ayuy0);
                                        if(gdqs0 == null) {
                                            continue;
                                        }
                                    }
                                }
                                else if(gdqs0 == null) {
                                    continue;
                                }
                            }
                            else {
                                ffmn.e("Wear_Transport", "Heartbeat message received.", new Object[0]);
                                if(gdqs0 == null) {
                                    continue;
                                }
                            }
                        }
                        else if(gdqs0 == null) {
                            continue;
                        }
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(gdqs0, throwable1);
                        throw throwable1;
                    }
                    gdqs0.close();
                }
                this.f.f("reader was stopped");
                ffmn.a("Wear_Transport", "WearableReader is finished.", new Object[0]);
            }
            catch(IOException iOException0) {
                String s1 = a.ac(iOException0, "reader threw IOException: ");
                ffmn.a("Wear_Transport", "%s", new Object[]{s1});
                this.f.f(s1);
            }
            catch(Exception exception0) {
                String s2 = a.ao(exception0, "reader threw unexpected exception: ");
                ffmn.a("Wear_Transport", "%s", new Object[]{s2});
                this.f.f(s2);
            }
        }
        catch(Throwable throwable0) {
            this.h.b();
            fdzp fdzp1 = this.n;
            if(fdzp1 == null) {
                esaa esaa3 = this.m;
                if(esaa3 != null && esaa3.l()) {
                    esaa3.g();
                }
            }
            else {
                fdzp1.a();
            }
            throw throwable0;
        }
        this.h.b();
        fdzp fdzp2 = this.n;
        if(fdzp2 != null) {
            fdzp2.a();
            return;
        }
        esaa esaa4 = this.m;
        if(esaa4 != null && esaa4.l()) {
            esaa4.g();
        }
    }
}

