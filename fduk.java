import android.util.Log;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class fduk implements fdwx {
    final Map a;
    final fdzv b;
    public febe c;
    public final AtomicReference d;
    public final boolean e;
    public final fdye f;

    public fduk(fdzv fdzv0, boolean z, fdye fdye0) {
        this.a = new ConcurrentHashMap();
        this.c = null;
        this.d = new AtomicReference();
        this.b = fdzv0;
        this.e = z;
        this.f = fdye0;
    }

    public final void a(fdsh fdsh0) {
        this.d.set(fdsh0);
    }

    public final boolean b(String s, feyp feyp0) {
        String s1;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffau ffau0 = (ffau)hftp0.b_message;
        feyp0.getClass();
        ffau0.q = feyp0;
        ffau0.b |= 0x4000;
        ffau ffau1 = (ffau)hftp0.N_build();
        Map map0 = this.a;
        fdwy fdwy0 = (fdwy)map0.get(s);
        if(fdwy0 == null) {
            if(Log.isLoggable("ControlPlaneTransport", 5)) {
                Log.w("ControlPlaneTransport", "Could not find a writer for nodeId " + s + "\nWriters: [" + new gfss(", ").b(map0.keySet()) + "]");
            }
            return false;
        }
        fduk.d("Sending message to node %s, contents: %s", new Object[]{s, feyp0});
        try {
            fdwy0.c(1, 0L, ffau1, null);
            return true;
        }
        catch(IOException | InterruptedException exception0) {
            ffmn.g("ControlPlaneTransport", exception0, "Received exception when sending message", new Object[0]);
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            if(Log.isLoggable("ControlPlaneTransport", 2)) {
                int v = feyo.a(feyp0.c);
                if(v == 0) {
                    s1 = "UNKNOWN";
                }
                else {
                    switch(v) {
                        case 1: {
                            s1 = "UNKNOWN";
                            break;
                        }
                        case 2: {
                            s1 = "TERMINATE_ASSOCIATION";
                            break;
                        }
                        case 3: {
                            s1 = "SUSPEND_SYNC";
                            break;
                        }
                        case 4: {
                            s1 = "RESUME_SYNC";
                            break;
                        }
                        case 5: {
                            s1 = "MIGRATION_FAILED";
                            break;
                        }
                        case 6: {
                            s1 = "ACCOUNT_MATCHING";
                            break;
                        }
                        default: {
                            s1 = "MIGRATION_CANCELLED";
                        }
                    }
                }
                Log.v("ControlPlaneTransport", String.format("Writing ControlMessage %s to node %s failed.", s1, s), exception0);
            }
            exception0.printStackTrace();
            return false;
        }
    }

    public final boolean c(String s, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)feyp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((feyp)hftp0.b_message).c = v - 1;
        ((feyp)hftp0.b_message).b |= 1;
        return this.b(s, ((feyp)hftp0.N_build()));
    }

    private static void d(String s, Object[] arr_object) {
        if(Log.isLoggable("ControlPlaneTransport", 3)) {
            Log.d("ControlPlaneTransport", String.format(s, arr_object));
        }
    }

    @Override  // fdwx
    public final void f(String s, ffau ffau0, fdwt fdwt0) {
        if((ffau0.b & 0x4000) != 0) {
            feyp feyp0 = ffau0.q == null ? feyp.a : ffau0.q;
            fduk.d("Received message from node %s, contents: %s", new Object[]{s, ffau0});
            int v = feyo.a(feyp0.c);
            int v1 = 1;
            if(v == 0) {
                v = 1;
            }
            switch(v - 1) {
                case 1: {
                    this.b.m(s, true, "Control Plane", null);
                    ffem.d(ffem.a());
                    return;
                }
                case 2: {
                    ffem.f(ffem.a(), s);
                    this.b.i(s);
                    return;
                }
                case 3: {
                    this.b.l(s);
                    ffem.d(ffem.a());
                    return;
                }
                case 4: {
                    if(Log.isLoggable("ControlPlaneTransport", 3)) {
                        fduk.d("Handling migration failed message from node : %s", new Object[]{s});
                    }
                    fdzv fdzv0 = this.b;
                    ffmn.d("Wear_Transport", "cancelMigrationByNodeId, nodeId=%s, sendMessage=%s", new Object[]{s, Boolean.valueOf(false)});
                    fczq fczq0 = fdzv0.b(s);
                    ffmn.a("Wear_Transport", "cancelMigrationByNodeId, targetConfig=%s", new Object[]{fczq0});
                    if(fczq0 == null) {
                        ffmn.f("Wear_Transport", "Cannot cancel config - could not find a config with nodeId %s", new Object[]{s});
                        return;
                    }
                    if(!fczq0.n) {
                        ffmn.f("Wear_Transport", "Cannot cancel config - config %s is not migrating", new Object[]{fczq0});
                        return;
                    }
                    fdzv0.a(fczq0, false);
                    return;
                }
                case 5: {
                    febe febe0 = this.c;
                    if(febe0 != null) {
                        febe0.d((feyp0.d == null ? fewy.a : feyp0.d));
                        return;
                    }
                    break;
                }
                case 6: {
                    if(Log.isLoggable("ControlPlaneTransport", 3)) {
                        Log.d("ControlPlaneTransport", "Handling migration cancelled message from node : " + s);
                    }
                    fczq fczq1 = this.b.b(s);
                    if(fczq1 == null) {
                        ffmn.f("Wear_Transport", "handleMigrationCancelledAsOldPhone: no connectionConfig found for node: %s", new Object[]{s});
                        return;
                    }
                    ffmn.d("Wear_Transport", "Handling migration cancelled as old phone, sourceNodeId: %s, config: %s", new Object[]{s, fczq1});
                    fczt.a().b(-9, fczq1.c);
                    return;
                }
                default: {
                    if(Log.isLoggable("ControlPlaneTransport", 5)) {
                        int v2 = feyo.a(feyp0.c);
                        if(v2 != 0) {
                            v1 = v2;
                        }
                        Log.w("ControlPlaneTransport", a.as(((byte)v1), ((byte)-1), ((byte)"Unknown message type in ControlMessage: ")));
                    }
                }
            }
        }
    }

    @Override  // fdwx
    public final void g(String s, fdww fdww0) {
    }

    @Override  // fdwx
    public final void h(fdwy fdwy0, fdww fdww0) {
        this.a.put(((fdzb)fdwy0).a.a, fdwy0);
    }

    @Override  // fdwx
    public final void i(String s) {
        ffmn.d("ControlPlaneTransport", "onMessageWriterRemoved(%s)", new Object[]{s});
        this.a.remove(s);
    }

    @Override  // fdwx
    public final boolean j() {
        return true;
    }
}

