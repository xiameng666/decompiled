import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class aoe implements bhv {
    public final CaptureResult a;
    private final bms b;

    public aoe(bms bms0, CaptureResult captureResult0) {
        this.b = bms0;
        this.a = captureResult0;
    }

    @Override  // bhv
    public final long a() {
        Long long0 = (Long)this.a.get(CaptureResult.SENSOR_TIMESTAMP);
        return long0 == null ? -1L : ((long)long0);
    }

    @Override  // bhv
    public final CaptureResult b() {
        return this.a;
    }

    @Override  // bhv
    public final bhq c() {
        Integer integer0 = (Integer)this.a.get(CaptureResult.CONTROL_AE_STATE);
        if(integer0 == null) {
            return bhq.a;
        }
        switch(((int)integer0)) {
            case 0: {
                return bhq.b;
            }
            case 2: {
                return bhq.e;
            }
            case 3: {
                return bhq.f;
            }
            case 4: {
                return bhq.d;
            }
            case 1: 
            case 5: {
                return bhq.c;
            }
            default: {
                Objects.toString(integer0);
                bcs.a("C2CameraCaptureResult", "Undefined ae state: " + integer0.toString());
                return bhq.a;
            }
        }
    }

    @Override  // bhv
    public final bhr d() {
        Integer integer0 = (Integer)this.a.get(CaptureResult.CONTROL_AF_STATE);
        if(integer0 == null) {
            return bhr.a;
        }
        switch(((int)integer0)) {
            case 0: {
                return bhr.b;
            }
            case 2: {
                return bhr.d;
            }
            case 1: 
            case 3: {
                return bhr.c;
            }
            case 4: {
                return bhr.f;
            }
            case 5: {
                return bhr.g;
            }
            case 6: {
                return bhr.e;
            }
            default: {
                Objects.toString(integer0);
                bcs.a("C2CameraCaptureResult", "Undefined af state: " + integer0.toString());
                return bhr.a;
            }
        }
    }

    @Override  // bhv
    public final bhs e() {
        Integer integer0 = (Integer)this.a.get(CaptureResult.CONTROL_AWB_STATE);
        if(integer0 == null) {
            return bhs.a;
        }
        switch(((int)integer0)) {
            case 0: {
                return bhs.b;
            }
            case 1: {
                return bhs.c;
            }
            case 2: {
                return bhs.d;
            }
            case 3: {
                return bhs.e;
            }
            default: {
                Objects.toString(integer0);
                bcs.a("C2CameraCaptureResult", "Undefined awb state: " + integer0.toString());
                return bhs.a;
            }
        }
    }

    @Override  // bhv
    public final bms f() {
        return this.b;
    }

    @Override  // bhv
    public final void g(bnw bnw0) {
        bht.a(this, bnw0);
        try {
            Integer integer0 = (Integer)this.a.get(CaptureResult.JPEG_ORIENTATION);
            if(integer0 != null) {
                bnw0.c(integer0.intValue());
            }
        }
        catch(BufferUnderflowException unused_ex) {
            bcs.d("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        CaptureResult captureResult0 = this.a;
        Long long0 = (Long)captureResult0.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if(long0 != null) {
            bnw0.b("ExposureTime", String.valueOf(((double)(((long)long0))) / ((double)TimeUnit.SECONDS.toNanos(1L))));
        }
        Float float0 = (Float)captureResult0.get(CaptureResult.LENS_APERTURE);
        if(float0 != null) {
            bnw0.b("FNumber", String.valueOf(float0.floatValue()));
        }
        Integer integer1 = (Integer)captureResult0.get(CaptureResult.SENSOR_SENSITIVITY);
        if(integer1 != null) {
            Integer integer2 = (Integer)captureResult0.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if(integer2 != null) {
                integer1 = (int)(((int)integer1) * ((int)(((float)(((int)integer2))) / 100.0f)));
            }
            bnw0.b("SensitivityType", "3");
            bnw0.b("PhotographicSensitivity", String.valueOf(Math.min(0xFFFF, integer1.intValue())));
        }
        Float float1 = (Float)captureResult0.get(CaptureResult.LENS_FOCAL_LENGTH);
        if(float1 != null) {
            bnw0.b("FocalLength", new bob(((long)(((float)float1) * 1000.0f)), 1000L).toString());
        }
        Integer integer3 = (Integer)captureResult0.get(CaptureResult.CONTROL_AWB_MODE);
        if(integer3 != null) {
            bnw0.b("WhiteBalance", ((((int)integer3) == 0 ? 2 : 1) - 1 == 0 ? "0" : "1"));
        }
    }

    @Override  // bhv
    public final int h() {
        Integer integer0 = (Integer)this.a.get(CaptureResult.CONTROL_AF_MODE);
        if(integer0 == null) {
            return 1;
        }
        int v = (int)integer0;
        if(v != 0) {
            if(v == 1 || v == 2) {
                return 3;
            }
            if(v == 3 || v == 4) {
                return 4;
            }
            if(v != 5) {
                Objects.toString(integer0);
                bcs.a("C2CameraCaptureResult", "Undefined af mode: " + integer0.toString());
                return 1;
            }
        }
        return 2;
    }

    @Override  // bhv
    public final int i() {
        Integer integer0 = (Integer)this.a.get(CaptureResult.FLASH_STATE);
        if(integer0 == null) {
            return 1;
        }
        int v = (int)integer0;
        if(v != 0 && v != 1) {
            if(v != 2) {
                if(v != 3 && v != 4) {
                    Objects.toString(integer0);
                    bcs.a("C2CameraCaptureResult", "Undefined flash state: " + integer0.toString());
                    return 1;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }
}

