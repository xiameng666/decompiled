import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import jeb.synthetic.FIN;

public final class fuzq {
    final fuzo a;
    int b;
    private long c;
    private boolean d;
    private final fuzy e;

    public fuzq(int v) {
        this.a = new fuzo();
        this.c = 0L;
        this.d = false;
        this.b = -1;
        this.e = new fuzy();
        this.b = v;
    }

    final boolean a(boolean z) {
        int v = this.b;
        boolean z1 = false;
        fuzy fuzy0 = this.e;
        long v1 = this.c;
        long v2 = SystemClock.elapsedRealtime();
        boolean z2 = this.d;
        if(!DetectedActivity.d(v, false)) {
            fuzy0.a();
            return false;
        }
        long v3 = v2 - v1;
        humv humv0 = humv.a;
        boolean z3 = Long.compare(v3, humv0.d().o()) > 0;
        if(!humv0.d().Q() || !fuzt.b.contains(Integer.valueOf(v))) {
            z1 = z3;
        }
        else if(z2 && !z && v3 > humv0.d().n()) {
            z1 = true;
        }
        else if(z3 && z) {
            long v4 = fuzy0.a;
            if(v4 == -1L) {
                fuzy0.a = v2;
            }
            else if(v2 - v4 > humv0.d().m()) {
                fuzy0.a();
                z1 = true;
            }
        }
        else {
            fuzy0.a();
            z1 = z3;
        }
        if(z1) {
            fuzy0.a();
        }
        return z1;
    }

    static final boolean b(int v) {
        return v == 0 || v == 16;
    }

    static final boolean c(int v) {
        return huml.c() ? DetectedActivity.c(v) : v == 0;
    }

    public final fuzp d(ActivityRecognitionResult activityRecognitionResult0, boolean z, boolean z1, boolean z2) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        DetectedActivity detectedActivity0 = activityRecognitionResult0.e();
        int v1 = 0;
        if(!huml.c() && DetectedActivity.c(detectedActivity0.a())) {
            detectedActivity0 = new DetectedActivity(0, detectedActivity0.e);
        }
        int v2 = detectedActivity0.a();
        int v3 = detectedActivity0.e;
        if(z2) {
            if(this.b == 3) {
                goto label_105;
            }
            fuzp fuzp0 = this.e(3);
            FIN.finallyExec$NT(v);
            return fuzp0;
        }
        if(this.b != 0 && !huml.c() && Float.compare(0.0f, ((float)humv.a.d().a())) >= 0) {
            fuzp fuzp1 = this.e(0);
            FIN.finallyExec$NT(v);
            return fuzp1;
        }
        if(!fuzq.b(v2)) {
            boolean z3 = fuzq.g(activityRecognitionResult0);
            if(z1) {
                goto label_24;
            }
            if(humv.a.d().J() && z3) {
                if(v2 == 6) {
                    v2 = 6;
                    goto label_30;
                }
            label_24:
                this.d = z1;
                if(huml.c()) {
                    v1 = 16;
                }
                fuzp fuzp2 = this.e(v1);
                FIN.finallyExec$NT(v);
                return fuzp2;
            }
        }
    label_30:
        int v4 = this.b;
        if(v2 == v4) {
            this.f(v4);
            fuzp fuzp3 = new fuzp(1, -1);
            FIN.finallyExec$NT(v);
            return fuzp3;
        }
        switch(v2) {
            case 1: {
                humv humv0 = humv.a;
                if(humv0.d().K() && z) {
                    v1 = 1;
                }
                int v7 = (int)humv0.d().b();
                int v8 = (int)humv0.d().q();
                if(v1 == 0 && (v3 >= v7 && !fuzq.c(this.b) || this.a.a(1) >= v8 || this.a(z1))) {
                    fuzp fuzp7 = this.e(1);
                    FIN.finallyExec$NT(v);
                    return fuzp7;
                }
                this.a.b(1);
                fuzp fuzp8 = new fuzp(1, -1);
                FIN.finallyExec$NT(v);
                return fuzp8;
            }
            case 3: {
                int v11 = (int)humv.c();
                int v12 = (int)humv.a.d().C();
                int v13 = (int)humv.a.d().A();
                int v14 = (int)humv.a.d().B();
                if(!this.a(z1)) {
                    if(!fuzq.c(this.b) && v3 >= v11) {
                        fuzo fuzo1 = this.a;
                        if(fuzo1.c == 3) {
                            v1 = fuzo1.b;
                        }
                        if(v1 < v12) {
                            goto label_87;
                        }
                    }
                    else {
                    label_87:
                        if((fuzq.c(this.b) || this.a.a(3) < v13) && (this.b != 7 && this.b != 8 || this.a.a(3) < v14)) {
                            this.a.c(v3);
                            fuzp fuzp11 = new fuzp(1, -1);
                            FIN.finallyExec$NT(v);
                            return fuzp11;
                        }
                    }
                }
                fuzp fuzp12 = this.e(3);
                FIN.finallyExec$NT(v);
                return fuzp12;
            }
            case 4: {
                fuzo fuzo2 = this.a;
                if(fuzo2.a(3) > 0) {
                    fuzo2.c(0);
                }
                fuzp fuzp13 = new fuzp(1, -1);
                FIN.finallyExec$NT(v);
                return fuzp13;
            }
            case 5: {
            label_105:
                fuzp fuzp15 = new fuzp(1, -1);
                FIN.finallyExec$NT(v);
                return fuzp15;
            }
            case 6: {
                if(v4 == 0) {
                    fuzp fuzp14 = this.e(7);
                    FIN.finallyExec$NT(v);
                    return fuzp14;
                }
                goto label_105;
            }
            case 2: 
            case 7: 
            case 8: {
                humv humv1 = humv.a;
                int v9 = (int)humv1.d().c();
                int v10 = (int)humv1.d().s();
                if(v3 < v9) {
                    fuzo fuzo0 = this.a;
                    if(fuzo0.a(2) < v10 && !this.a(z1) && (!humv1.d().M() || !fuzq.b(this.b))) {
                        fuzo0.b(2);
                        fuzp fuzp9 = new fuzp(1, -1);
                        FIN.finallyExec$NT(v);
                        return fuzp9;
                    }
                }
                fuzp fuzp10 = this.e(v2);
                FIN.finallyExec$NT(v);
                return fuzp10;
            }
            case 0: 
            case 16: {
                boolean z4 = fuzq.g(activityRecognitionResult0);
                int v5 = (int)humv.a.d().e();
                int v6 = (int)humv.a.d().u();
                if(!z4 && (z || v3 < v5 && this.a.a(v2) < v6)) {
                    this.a.b(v2);
                    fuzp fuzp5 = new fuzp(1, -1);
                    FIN.finallyExec$NT(v);
                    return fuzp5;
                }
                fuzp fuzp6 = this.e(v2);
                FIN.finallyExec$NT(v);
                return fuzp6;
            }
            case 17: {
                if(huml.c()) {
                    int v15 = (int)humv.a.d().d();
                    int v16 = (int)humv.a.d().t();
                    if(v3 < v15) {
                        fuzo fuzo3 = this.a;
                        if(fuzo3.a(17) < v16) {
                            fuzo3.b(17);
                            fuzp fuzp16 = new fuzp(1, -1);
                            FIN.finallyCodeBegin$NT(v);
                            return fuzp16;
                        }
                    }
                    fuzp fuzp17 = this.e(17);
                    FIN.finallyExec$NT(v);
                    return fuzp17;
                }
                throw new IllegalStateException("IN_RAIL_VEHICLE classification should never be used for non road and rail filter.");
            }
            default: {
                fuzp fuzp4 = new fuzp(1, -1);
                FIN.finallyExec$NT(v);
                return fuzp4;
            }
        }
    }

    private final fuzp e(int v) {
        this.f(v);
        return new fuzp(2, v);
    }

    private final void f(int v) {
        this.b = v;
        this.a.a = 0;
        this.a.b = 0;
        this.a.c = -1;
        if(v == 0 || v == 16 || v == 17) {
            this.c = SystemClock.elapsedRealtime();
        }
        if(!fuzq.b(this.b)) {
            this.d = false;
        }
    }

    private static final boolean g(ActivityRecognitionResult activityRecognitionResult0) {
        return ((long)cmmq.c(activityRecognitionResult0.b())) >= humv.a.d().z();
    }
}

