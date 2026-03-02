import android.hardware.camera2.TotalCaptureResult;

final class aqr implements arg {
    public final aow a;
    public final ayg b;
    private final int c;
    private boolean d;

    public aqr(aow aow0, int v, ayg ayg0) {
        this.d = false;
        this.a = aow0;
        this.c = v;
        this.b = ayg0;
    }

    @Override  // arg
    public final gmcd a(TotalCaptureResult totalCaptureResult0) {
        if(asf.e(this.c, totalCaptureResult0)) {
            bcs.h("Camera2CapturePipeline");
            this.d = true;
            return bpt.f(bpf.a(jqy.a(new aqp(this))), new aqq(), bol.a());
        }
        return bpt.b(Boolean.valueOf(false));
    }

    @Override  // arg
    public final void b() {
        if(this.d) {
            bcs.h("Camera2CapturePipeline");
            this.a.c.c(false, true);
            this.b.b = false;
        }
    }

    @Override  // arg
    public final boolean c() {
        return this.c == 0;
    }
}

