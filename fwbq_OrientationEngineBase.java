import java.io.PrintWriter;

public abstract class fwbq_OrientationEngineBase {
    protected final Object lock;
    protected fwbr_OrientationEngineRequest orientationEngineRequest_;
    protected long l;

    protected fwbq_OrientationEngineBase() {
        this.lock = new Object();
        this.orientationEngineRequest_ = fwbr_OrientationEngineRequest.a;
        this.l = 20000L;
    }

    public abstract gkqs a_getEngineType();

    public abstract void b_release();

    protected abstract void c_dump(PrintWriter arg1);

    protected abstract void d_updateOutputSamplingPeriod();

    protected abstract void e_onSensorEvent(fwcb_SensorFrame arg1);

    public abstract void f_registerCallback(fwbg_OrientationCallback arg1);

    public void i_dispatchOrientationResult(fwbr_OrientationEngineRequest fwbr0, fwcb_SensorFrame fwcb0) {
        synchronized(this.lock) {
            this.orientationEngineRequest_ = fwbr0;
            long v1 = fwbr0.samplingPeriodMicros_;
            if(!fwbr0.a() && v1 != this.l) {
                this.l = v1;
                this.d_updateOutputSamplingPeriod();
            }
            this.e_onSensorEvent(fwcb0);
        }
    }

    public final boolean m() {
        synchronized(this.lock) {
        }
        return this.orientationEngineRequest_.a() ^ 1;
    }
}

