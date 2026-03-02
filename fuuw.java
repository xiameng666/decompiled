final class fuuw {
    public boolean a;
    public final fwyd b;
    public final fwzm c;
    public final fvns d;
    public final boolean e;
    public final fvwz f;
    public long g;
    public int h;
    public int i;

    public fuuw(fvns fvns0, fwyd fwyd0, fwzm fwzm0, fvwz fvwz0) {
        this.a = false;
        this.b = fwyd0;
        this.c = fwzm0;
        this.d = fvns0;
        this.e = fwzm0.d(fvns0);
        this.f = fvwz0;
    }

    public final void a() {
        if(!this.a) {
            return;
        }
        fybc fybc0 = new fybc("RealSensorService");
        fvkx fvkx0 = fvkx.a(((fwvo)this.c).e, ((fwvn)((fwvo)this.c).b).k, fybc0);
        gftb.check(fvkx0);
        fvkx0.d("ActivityDetectionScheduler", this.d);
        this.a = false;
        this.f.i(70, 0, Integer.numberOfTrailingZeros(this.d.z));
    }
}

