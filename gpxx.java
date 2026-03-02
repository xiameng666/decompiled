public abstract class gpxx implements IMotionModel {
    public gpxm_Observation d;

    @Override  // IMotionModel
    public void a_isExpectedModel() {
    }

    @Override  // IMotionModel
    public void c() {
        this.d = null;
    }

    @Override  // IMotionModel
    public final void e() {
        this.d = null;
    }
}

