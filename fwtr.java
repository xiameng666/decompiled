import android.location.LocationManager;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Map;

final class fwtr extends clht {
    final fwtu a;
    private long c;

    public fwtr(fwtu fwtu0, Looper looper0) {
        Objects.requireNonNull(fwtu0);
        this.a = fwtu0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        int v2;
        String s;
        long v8;
        int v7;
        int v6;
        boolean z;
        long v5;
        long v4;
        fvwz fvwz0;
        fwtu fwtu1;
        fvtz fvtz0;
        int v3;
        int v1;
        long v = SystemClock.elapsedRealtime();
        if(message0.arg2 == 0x10E1) {
            v1 = 1;
        }
        else {
            if(message0.arg2 != 8534) {
                throw new RuntimeException(a.aG(message0, "No wakelock mode specified for command "));
            }
            v1 = 0;
        }
        if(v > this.c) {
            this.c = v + 120000L;
            this.a.g(this.a.q);
        }
        switch(message0.what) {
            case 1: {
                goto label_12;
            }
            case 2: {
                goto label_27;
            }
            case 3: {
                try {
                    v3 = message0.arg1;
                    fvtz0 = (fvtz)message0.obj;
                    fwtu1 = this.a;
                    fvwz0 = fwtu1.e;
                    v4 = fvtz0.b;
                    v5 = fvtz0.c;
                    z = fvtz0.f;
                    v6 = (int)Math.min(v4 / 1000L, 0x7FFFFFFFL);
                    v7 = (int)Math.min(v5 / 1000L, 0x7FFFFFFFL);
                    v8 = fvwz0.f();
                    s = "1";
                    v2 = v1;
                    if(v3 != 1) {
                        goto label_43;
                    }
                    goto label_44;
                }
                catch(Exception exception0) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_130;
                }
            label_43:
                s = "0";
                try {
                label_44:
                    fvwz0.a(new fwsm((z ? 0x90 : 4), v8, s + (z ? "(emergency)" : "(non-emergency)"), v6, v7, v4, v5, v3 == 1, z));
                    fwtu1.q.v(fvtz0, v3 == 1);
                    goto label_134;
                }
                catch(Exception exception0) {
                }
                catch(Throwable throwable0) {
                    goto label_131;
                }
                throw exception0;
            }
            case 4: {
                try {
                    this.a.q.C(((fwtk)message0.obj).a, ((fwtk)message0.obj).b, ((fwtk)message0.obj).d, ((fwtk)message0.obj).c);
                    v2 = v1;
                    goto label_134;
                label_51:
                    fwtu fwtu2 = this.a;
                    if(!fwtu2.o) {
                        cjds cjds0 = (cjds)message0.obj;
                        fwso.p(fwtu2.e, cjds0);
                        fwtu2.q.B(cjds0);
                        v2 = v1;
                        goto label_134;
                    label_57:
                        this.a.q.z(((fwtt)message0.obj).a, message0.arg1 != 0);
                        v2 = v1;
                        goto label_134;
                    label_59:
                        fwtu fwtu3 = this.a;
                        if(fwtu3.o) {
                            cjds cjds1 = (cjds)message0.obj;
                            fwso.p(fwtu3.e, cjds1);
                            fwtu3.q.B(cjds1);
                            v2 = v1;
                            goto label_134;
                        label_65:
                            this.a.q.l(fuxc.a(((ActivityRecognitionResult)message0.obj)));
                            v2 = v1;
                            goto label_134;
                        label_67:
                            fwti fwti0 = (fwti)message0.obj;
                            futl futl0 = this.a.r;
                            if(futl0 != null) {
                                int v9 = fwti0.a;
                                fvss fvss0 = fwti0.b;
                                boolean z1 = fwti0.c;
                                boolean z2 = fwti0.d;
                                fwyc fwyc0 = fwti0.e;
                                Map map0 = fwti0.g;
                                futd futd0 = futl0.a;
                                int v10 = futd0.D;
                                futd0.D = v9;
                                futd0.X = fvss0.b;
                                if(!futd0.Y && fwti0.f != null) {
                                    futd0.Y = true;
                                    futd0.ad = futd0.J();
                                    fuzc fuzc0 = futd0.ad;
                                    if(fuzc0 != null) {
                                        futd0.z.d.a = fuzc0;
                                        fuwt fuwt0 = futd0.z.e;
                                        if(fuwt0 != null) {
                                            fuwt0.a = fuzc0;
                                        }
                                    }
                                }
                                long v11 = fvss0.a;
                                futd0.F = v11;
                                futd0.G = fvss0.c;
                                futp futp0 = futd0.J;
                                if(!Objects.equals(fwyc0, futp0.a) || v11 != futp0.d) {
                                    futp0.a = fwyc0;
                                    futp0.d = v11;
                                    futp0.a();
                                }
                                if(futd0.D != 0 && futd0.D < v10) {
                                    futd0.l.M();
                                }
                                if(map0 == null) {
                                    map0 = new ConcurrentHashMap();
                                }
                                futd0.K = map0;
                                if(futd0.M()) {
                                    if(futd0.A == null) {
                                        try {
                                            futd0.A = new fuww(futd0.f.l(fuwu.k), futd0.f.l(fuwu.l));
                                        }
                                        catch(IOException iOException0) {
                                            throw new RuntimeException(iOException0);
                                        }
                                    }
                                    if(futd0.L == null) {
                                        futd0.L = new fuuq();
                                    }
                                }
                                futd0.A(v9 > v10, z1);
                                fuvs fuvs0 = futl0.c;
                                if(fuvs0 != null) {
                                    fuvs0.e.g(z2);
                                    v2 = v1;
                                    goto label_134;
                                label_115:
                                    this.a.q.q(((fvuu)message0.obj));
                                    v2 = v1;
                                    goto label_134;
                                label_117:
                                    ((Runnable)message0.obj).run();
                                    v2 = v1;
                                    goto label_134;
                                label_119:
                                    this.a.q.u(((fwtj)message0.obj).a, ((fwtj)message0.obj).b, ((fwtj)message0.obj).c);
                                    v2 = v1;
                                    goto label_134;
                                label_121:
                                    this.a.q.g();
                                }
                            }
                        }
                    }
                    v2 = v1;
                    goto label_134;
                }
                catch(Exception exception0) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_130;
                }
            }
            case 5: {
                goto label_51;
            }
            case 6: {
                goto label_57;
            }
            case 7: {
                goto label_59;
            }
            case 8: {
                goto label_65;
            }
            case 9: {
                goto label_67;
            }
            case 10: {
                goto label_115;
            }
            case 11: {
                goto label_117;
            }
            case 12: {
                goto label_119;
            }
            case 13: {
                goto label_121;
            }
            default: {
                try {
                    v2 = v1;
                    throw new RuntimeException(a.aG(message0, "unexpected message "));
                label_12:
                    v2 = v1;
                    fwtu fwtu0 = this.a;
                    fwtu0.e.g(2);
                    fxby fxby0 = fwtu0.q;
                    if(fxby0 != null) {
                        fxby0.s(message0.arg1 != 0);
                    }
                    LocationManager locationManager0 = (LocationManager)fwtu0.b.getSystemService("location");
                    locationManager0.removeUpdates((fwtu0.o ? fwtu0.g.c : fwtu0.f.c));
                    jym.a(locationManager0, fwtu0.h);
                    Looper looper0 = Looper.myLooper();
                    if(looper0 != null) {
                        looper0.quit();
                    }
                    fwtu0.e();
                    fwtu0.q = new fxby(new fwtq(this));
                    goto label_134;
                label_27:
                    v2 = v1;
                    this.a.q.h();
                    goto label_134;
                }
                catch(Exception exception0) {
                    throw exception0;
                }
                catch(Throwable throwable0) {
                    goto label_131;
                }
            }
        }
        v2 = v1;
        try {
            throw exception0;
        }
        catch(Throwable throwable0) {
            goto label_131;
        }
    label_130:
        v2 = v1;
    label_131:
        if(v2 != 0) {
            this.a.j.k.j(fwzf.q);
        }
        throw throwable0;
    label_134:
        if(v2 != 0) {
            this.a.j.k.j(fwzf.q);
        }
    }
}

