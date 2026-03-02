import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class cyqh {
    protected final BluetoothDevice a;
    protected final jqt b;
    protected final ScheduledExecutorService c;
    protected final bbng d;
    protected final hfub e;
    public int f;
    protected int g;
    protected int h;
    public int i;
    protected ScheduledFuture j;
    public int k;
    private final kba l;
    private final List m;

    protected cyqh(BluetoothDevice bluetoothDevice0, kba kba0, jqt jqt0, ScheduledExecutorService scheduledExecutorService0, bbng bbng0, hfub hfub0) {
        this.m = new ArrayList();
        this.h = -1;
        this.k = 1;
        this.a = bluetoothDevice0;
        this.l = kba0;
        this.b = jqt0;
        this.c = scheduledExecutorService0;
        this.d = bbng0;
        this.e = hfub0;
    }

    protected final String a() {
        String s = this.b();
        return String.format(Locale.ENGLISH, "%sSendingTask(%s)", s, ((Enum)this.e).name());
    }

    protected abstract String b();

    protected final void c() {
        ScheduledFuture scheduledFuture0 = this.j;
        if(scheduledFuture0 == null) {
            return;
        }
        scheduledFuture0.cancel(false);
        this.j = null;
    }

    protected void d(boolean z) {
    }

    protected void e(boolean z, int v, byte[] arr_b) {
        throw null;
    }

    protected final void f(byte[] arr_b) {
        if(this.i()) {
            ((ggtj)cyjh.a.g().ar(8023)).B("%s: onResponseFail called but task already finished!", this.a());
            return;
        }
        this.c();
        this.k(9);
        if(this.i > this.f) {
            this.h(cyqm.b, arr_b);
            return;
        }
        cyqe cyqe0 = () -> {
            cyqm cyqm0;
            int v;
            if(this.i()) {
                ((ggtj)cyjh.a.g().ar(8028)).B("%s: Send called but task already finished!", this.a());
                return;
            }
            if(this.i > this.f) {
                return;
            }
            this.c();
            ++this.i;
            Object object0 = this.l.a();
            if(object0 != fgme.a) {
                switch(((fgme)object0).ordinal()) {
                    case 1: {
                        v = 5;
                        break;
                    }
                    case 2: {
                        v = 6;
                        break;
                    }
                    default: {
                        v = 7;
                    }
                }
                this.k(v);
                cust cust0 = cyjh.a;
                ((ggtj)cust0.g().ar(8026)).B("%s: Failed to send!", this.a());
                if(this.i > this.f) {
                    switch(((fgme)object0).ordinal()) {
                        case 1: {
                            cyqm0 = cyqm.d;
                            break;
                        }
                        case 2: {
                            cyqm0 = cyqm.j;
                            break;
                        }
                        default: {
                            cyqm0 = cyqm.i;
                        }
                    }
                    this.h(cyqm0, null);
                    return;
                }
                cyqe cyqe0 = new cyqe(this);
                this.j = ((cuuh)this.c).g(cyqe0, ((long)this.g), TimeUnit.MILLISECONDS);
                ((ggtj)cust0.d().ar(8027)).P("%s: Schedule to resend after %dms", this.a(), this.g);
                this.k(2);
                return;
            }
            int v1 = this.h;
            if(v1 > 0) {
                cyqf cyqf0 = new cyqf(this);
                this.j = ((cuuh)this.c).g(cyqf0, ((long)v1), TimeUnit.MILLISECONDS);
                ((ggtj)cyjh.a.d().ar(8025)).P("%s: Schedule to check timeout after %dms", this.a(), this.h);
                this.k(3);
                return;
            }
            this.h(cyqm.a, null);
        };
        this.j = ((cuuh)this.c).g(cyqe0, ((long)this.g), TimeUnit.MILLISECONDS);
        ((ggtj)cyjh.a.d().ar(8022)).P("%s: onResponseFail, Schedule to resend after %dms", this.a(), this.g);
        this.k(2);
    }

    // Detected as a lambda impl.
    protected void g() {
        cyqm cyqm0;
        int v;
        if(this.i()) {
            ((ggtj)cyjh.a.g().ar(8028)).B("%s: Send called but task already finished!", this.a());
            return;
        }
        if(this.i > this.f) {
            return;
        }
        this.c();
        ++this.i;
        Object object0 = this.l.a();
        if(object0 != fgme.a) {
            switch(((fgme)object0).ordinal()) {
                case 1: {
                    v = 5;
                    break;
                }
                case 2: {
                    v = 6;
                    break;
                }
                default: {
                    v = 7;
                }
            }
            this.k(v);
            cust cust0 = cyjh.a;
            ((ggtj)cust0.g().ar(8026)).B("%s: Failed to send!", this.a());
            if(this.i > this.f) {
                switch(((fgme)object0).ordinal()) {
                    case 1: {
                        cyqm0 = cyqm.d;
                        break;
                    }
                    case 2: {
                        cyqm0 = cyqm.j;
                        break;
                    }
                    default: {
                        cyqm0 = cyqm.i;
                    }
                }
                this.h(cyqm0, null);
                return;
            }
            cyqe cyqe0 = new cyqe(this);
            this.j = ((cuuh)this.c).g(cyqe0, ((long)this.g), TimeUnit.MILLISECONDS);
            ((ggtj)cust0.d().ar(8027)).P("%s: Schedule to resend after %dms", this.a(), this.g);
            this.k(2);
            return;
        }
        int v1 = this.h;
        if(v1 > 0) {
            cyqf cyqf0 = new cyqf(this);
            this.j = ((cuuh)this.c).g(cyqf0, ((long)v1), TimeUnit.MILLISECONDS);
            ((ggtj)cyjh.a.d().ar(8025)).P("%s: Schedule to check timeout after %dms", this.a(), this.h);
            this.k(3);
            return;
        }
        this.h(cyqm.a, null);
    }

    protected final void h(cyqm cyqm0, byte[] arr_b) {
        String s2;
        if(this.i()) {
            ((ggtj)cyjh.a.g().ar(8030)).B("%s: setResult called but task already finished!", this.a());
            return;
        }
        this.c();
        jqt jqt0 = this.b;
        int v = 9;
    alab1:
        switch(cyqm0.ordinal()) {
            case 1: {
                int v1 = fgti.b(arr_b);
                if(v1 == 0) {
                    throw null;
                }
                switch(v1 - 1) {
                    case 0: {
                        v = 6;
                        break alab1;
                    }
                    case 1: {
                        v = 7;
                        break alab1;
                    }
                    case 2: {
                        v = 8;
                        break alab1;
                    }
                    case 3: {
                        break alab1;
                    }
                    default: {
                        v = v1 - 1 == 4 ? 10 : 1;
                        break alab1;
                    }
                }
            }
            case 2: {
                v = 11;
                break;
            }
            case 3: {
                v = 15;
                break;
            }
            case 5: {
                v = 10;
                break;
            }
            case 8: {
                v = 17;
                break;
            }
            case 9: {
                v = 16;
                break;
            }
            default: {
                v = 1;
            }
        }
        jqt0.b(new cyql(cyqm0, v));
        this.k(10);
        ggtj ggtj0 = (ggtj)cyjh.a.d().ar(8029);
        String s = this.a();
        String s1 = cyqm0.name();
        long v2 = this.d.b();
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: this.m) {
            Locale locale0 = Locale.ENGLISH;
            Float float0 = (float)(((float)(((cyqg)object0).a - v2)) / 1000.0f);
            switch(((cyqg)object0).b) {
                case 2: {
                    s2 = "WAIT_RESEND";
                    break;
                }
                case 3: {
                    s2 = "WAIT_RESPONSE";
                    break;
                }
                case 4: {
                    s2 = "WAIT_BUSY";
                    break;
                }
                case 5: {
                    s2 = "SEND_FAILED_NO_CONNECTION";
                    break;
                }
                case 6: {
                    s2 = "SEND_FAILED_NO_SESSION_NONCE";
                    break;
                }
                case 7: {
                    s2 = "SEND_FAILED_EXCEPTION";
                    break;
                }
                case 8: {
                    s2 = "RESPONSE_TIMEOUT";
                    break;
                }
                case 9: {
                    s2 = "RESPONSE_NAK";
                    break;
                }
                default: {
                    s2 = "FINISHED";
                }
            }
            stringBuilder0.append(String.format(locale0, "%.3f:%s", float0, s2));
            stringBuilder0.append(",");
        }
        ggtj0.X("%s: setResult to %s, sendLogs:%s", s, s1, stringBuilder0.toString());
    }

    protected final boolean i() {
        return this.k == 10;
    }

    protected final boolean j(BluetoothDevice bluetoothDevice0) {
        return this.a.equals(bluetoothDevice0);
    }

    protected final void k(int v) {
        this.k = v;
        cyqg cyqg0 = new cyqg(v, this.d.b());
        this.m.add(cyqg0);
    }
}

