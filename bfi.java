import java.util.Objects;

public final class bfi implements bkp {
    public final bfq a;

    public bfi(bfq bfq0) {
        this.a = bfq0;
    }

    @Override  // bkp
    public final void a(bkq bkq0) {
        bfq bfq0;
        try {
            bfq0 = this.a;
            bcn bcn0 = bkq0.f();
            Objects.toString((bfq0.a == null ? null : ((int)bfq0.a.a)));
            bcs.h("CaptureNode");
            if(bcn0 == null) {
                bgt bgt1 = bfq0.a;
                if(bgt1 != null) {
                    bcf bcf0 = new bcf("Failed to acquire latest image", null);
                    bfq0.d(new bgx(bgt1.a, bcf0));
                }
            }
            else {
                boj.b();
                if(bfq0.a == null) {
                    Objects.toString(bcn0);
                    bcs.d("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + bcn0.toString());
                    bcn0.close();
                    return;
                }
                bms bms0 = bcn0.e().d();
                if(((Integer)bms0.a(bfq0.a.h)) == null) {
                    bcs.d("CaptureNode", "Discarding ImageProxy which was acquired for another request, mCurrentRequest id = " + bfq0.a.a + ", ImageProxy tagBundle keys = " + bms0.b());
                    bcn0.close();
                    return;
                }
                boj.b();
                ((bgq)j..util.Objects.requireNonNull(bfq0.e)).a.accept(new bgr(bfq0.a, bcn0));
                bgt bgt0 = bfq0.a;
                if(bfq0.f == null || bfq0.f.h.size() <= 1) {
                    bfq0.a = null;
                }
                else if(bfq0.a != null) {
                    bcn0.a();
                    throw null;
                }
                bcs.c("ProcessingRequest", "onImageCaptured: request ID = " + bgt0.a);
                if(bgt0.k != -1 && bgt0.k != 100) {
                    bgt0.k = 100;
                    boj.b();
                    if(!bgt0.l.e) {
                        throw null;
                    }
                }
                bgw bgw0 = bgt0.l;
                boj.b();
                if(!bgw0.e) {
                    if(!bgw0.f) {
                        bgw0.e();
                    }
                    bgw0.c.b(null);
                }
            }
        }
        catch(IllegalStateException illegalStateException0) {
            bgt bgt2 = bfq0.a;
            if(bgt2 != null) {
                bcf bcf1 = new bcf("Failed to acquire latest image", illegalStateException0);
                bfq0.d(new bgx(bgt2.a, bcf1));
            }
        }
    }
}

