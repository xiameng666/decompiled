import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class aqx implements bpa {
    public final arf a;
    public final List b;
    public final int c;

    public aqx(arf arf0, List list0, int v) {
        this.a = arf0;
        this.b = list0;
        this.c = v;
    }

    // This method was un-flattened
    @Override  // bpa
    public final gmcd a(Object object0) {
        int v1;
        arf arf0;
        TotalCaptureResult totalCaptureResult0 = (TotalCaptureResult)object0;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = this.b.iterator();
        while(true) {
            arf0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            bjm bjm0 = new bjm(((bjo)object1));
            int v = ((bjo)object1).f;
            bhv bhv0 = null;
            if(v == 5) {
                awk awk0 = arf0.e.j;
                if(!awk0.d && !awk0.c) {
                    bcn bcn0 = awk0.a();
                    if(bcn0 == null) {
                        bcs.h("Camera2CapturePipeline");
                    }
                    else {
                        awj awj0 = awk0.i;
                        if(awj0 != null) {
                            Image image0 = bcn0.d();
                            if(awj0.b.get()) {
                                ImageWriter imageWriter0 = awj0.a;
                                if(imageWriter0 != null) {
                                    try {
                                        imageWriter0.queueInputImage(image0);
                                        ImageWriter imageWriter1 = awj0.a;
                                        awi awi0 = new awi(bcn0);
                                        imageWriter1.setOnImageReleasedListener(new bqx(awj0.c, awi0), boc.a());
                                    }
                                    catch(IllegalStateException illegalStateException0) {
                                        bcs.a("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + illegalStateException0.getMessage());
                                        goto label_31;
                                    }
                                    bhv0 = bhw.a(bcn0.e());
                                    goto label_32;
                                }
                            }
                        }
                    label_31:
                        bcs.a("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                    label_32:
                        if(bhv0 == null) {
                            bcn0.close();
                        }
                    }
                }
                v = 5;
            }
            if(bhv0 == null) {
                if(arf0.b == 3 && !arf0.g) {
                    v1 = 4;
                }
                else if(v != -1 && v != 5) {
                    v1 = -1;
                    goto label_47;
                }
                bjm0.b = v1;
            label_47:
                bcs.h("Camera2CapturePipeline");
            }
            else {
                bjm0.d = bhv0;
            }
            if(arf0.f.b && this.c == 0 && arf0.f.a) {
                ans ans0 = new ans();
                ans0.d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(3));
                bjm0.f(ans0.a());
            }
            arrayList0.add(jqy.a(new aqw(bjm0)));
            arrayList1.add(bjm0.b());
        }
        arf0.e.x(arrayList1);
        return bpt.a(arrayList0);
    }
}

