import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import j..util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class asf {
    public final Executor a;
    public int b;
    private final aow c;
    private final ayu d;
    private final boolean e;
    private final blp f;
    private final ScheduledExecutorService g;
    private final boolean h;

    public asf(aow aow0, awp awp0, blp blp0, Executor executor0, ScheduledExecutorService scheduledExecutorService0) {
        boolean z = true;
        this.b = 1;
        this.c = aow0;
        Integer integer0 = (Integer)awp0.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if(integer0 == null || ((int)integer0) != 2) {
            z = false;
        }
        this.h = z;
        this.a = executor0;
        this.g = scheduledExecutorService0;
        this.f = blp0;
        this.d = new ayu(blp0);
        Objects.requireNonNull(awp0);
        this.e = ayb.a(new aqo(awp0));
    }

    final arf a(int v, int v1, int v2) {
        boolean z1;
        blp blp0 = this.f;
        ayg ayg0 = new ayg(blp0);
        aow aow0 = this.c;
        arf arf0 = new arf(this.b, this.a, this.g, aow0, this.h, ayg0);
        ScheduledExecutorService scheduledExecutorService0 = this.g;
        Executor executor0 = this.a;
        if(v == 0) {
            arf0.b(new aqs(aow0));
        }
        if(v1 == 3) {
            arf0.b(new ary(aow0, executor0, scheduledExecutorService0, new ayt(blp0)));
        }
        else if(this.e) {
            boolean z = this.d.a;
            if(!z && this.b != 3 && v2 != 1) {
                arf0.b(new aqr(aow0, v1, ayg0));
            }
            else {
                if(z) {
                    z1 = false;
                }
                else {
                    int v3 = aow0.f.a.get();
                    bcs.h("Camera2CameraControlImp");
                    z1 = v3 <= 0;
                }
                arf0.b(new ase(aow0, v1, executor0, scheduledExecutorService0, z1));
            }
        }
        java.util.Objects.toString(arf0.i);
        bcs.h("Camera2CapturePipeline");
        return arf0;
    }

    static gmcd b(aow aow0, ari ari0) {
        arj arj0 = new arj(ari0);
        aow0.h(arj0);
        aqn aqn0 = new aqn(aow0, arj0);
        arj0.b.hB(aqn0, aow0.b);
        return arj0.b;
    }

    static gmcd c(long v, ScheduledExecutorService scheduledExecutorService0, aow aow0, ari ari0) {
        return bpt.l(TimeUnit.NANOSECONDS.toMillis(v), scheduledExecutorService0, asf.b(aow0, ari0));
    }

    static boolean d(TotalCaptureResult totalCaptureResult0, boolean z) {
        boolean z3;
        boolean z2;
        int v;
        boolean z1;
        if(totalCaptureResult0 == null) {
            return false;
        }
        aoe aoe0 = new aoe(bms.a, totalCaptureResult0);
        switch(aoe0.h()) {
            case 1: 
            case 2: {
                z1 = true;
                break;
            }
            default: {
                bhr bhr0 = aoe0.d();
                z1 = bju.a.contains(bhr0);
            }
        }
        CaptureResult captureResult0 = aoe0.a;
        Integer integer0 = (Integer)captureResult0.get(CaptureResult.CONTROL_AE_MODE);
        if(integer0 == null) {
            v = 1;
        }
        else {
            v = 3;
            switch(((int)integer0)) {
                case 0: {
                    v = 2;
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    v = 4;
                    break;
                }
                case 3: {
                    v = 5;
                    break;
                }
                case 4: {
                    v = 6;
                    break;
                }
                case 5: {
                    v = 7;
                    break;
                }
                default: {
                    v = 1;
                }
            }
        }
        if(!z) {
            if(v == 2) {
                z2 = true;
            }
            else {
                bhq bhq1 = aoe0.c();
                z2 = bju.c.contains(bhq1);
            }
        }
        else if(v != 2) {
            bhq bhq0 = aoe0.c();
            z2 = bju.d.contains(bhq0);
        }
        else {
            z2 = true;
        }
        Integer integer1 = (Integer)captureResult0.get(CaptureResult.CONTROL_AWB_MODE);
        if(integer1 == null || ((int)integer1) != 0) {
            bhs bhs0 = aoe0.e();
            z3 = bju.b.contains(bhs0);
        }
        else {
            z3 = true;
        }
        java.util.Objects.toString(aoe0.c());
        java.util.Objects.toString(aoe0.d());
        java.util.Objects.toString(aoe0.e());
        bcs.h("ConvergenceUtils");
        return z1 && z2 && z3;
    }

    static boolean e(int v, TotalCaptureResult totalCaptureResult0) {
        bcs.h("Camera2CapturePipeline");
        switch(v) {
            case 0: {
                Integer integer0 = totalCaptureResult0 == null ? null : ((Integer)totalCaptureResult0.get(CaptureResult.CONTROL_AE_STATE));
                java.util.Objects.toString(integer0);
                bcs.h("Camera2CapturePipeline");
                return integer0 != null && ((int)integer0) == 4;
            }
            case 2: {
                return false;
            }
            case 1: 
            case 3: {
                return true;
            }
            default: {
                throw new AssertionError(v);
            }
        }
    }
}

