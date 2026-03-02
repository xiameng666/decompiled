import com.google.android.location.collectionlib.SensorTimestampCalibrator.CalibrationSensorListener;
import j..util.Objects;

final class fvny implements Runnable {
    final fvnz a;

    public fvny(fvnz fvnz0) {
        Objects.requireNonNull(fvnz0);
        this.a = fvnz0;
        super();
    }

    @Override
    public final void run() {
        fvnz fvnz0 = this.a;
        synchronized(fvnz0.d) {
            if(!fvnz0.f) {
                SensorTimestampCalibrator.CalibrationSensorListener sensorTimestampCalibrator$CalibrationSensorListener0 = fvnz0.e;
                if(sensorTimestampCalibrator$CalibrationSensorListener0 != null) {
                    sensorTimestampCalibrator$CalibrationSensorListener0.a = true;
                    fvnz0.b(false, 0L);
                    fvnz0.e = null;
                }
            }
        }
    }
}

