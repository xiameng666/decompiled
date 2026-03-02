public final class bgh implements Runnable {
    public final bgs a;
    public final bgr b;

    public bgh(bgs bgs0, bgr bgr0) {
        this.a = bgs0;
        this.b = bgr0;
    }

    @Override
    public final void run() {
        bgr bgr0;
        try {
            bgr0 = this.b;
            bgt bgt0 = bgr0.a;
            Object object0 = this.a.d.a(bgr0);
            int v = ((bsf)object0).c;
            boolean z = true;
            switch(v) {
                case 35: 
                case 0x100: {
                    break;
                }
                case 0x1005: {
                    v = 0x1005;
                    break;
                }
                default: {
                    z = false;
                }
            }
            kay.b(z, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", v));
            bfu.b(((bsf)object0));
            bow.a().execute(new bgo(bgt0));
        }
        catch(Exception exception0) {
            bgr0.b.close();
            bcs.b("ProcessingNode", "process postview input packet failed.", exception0);
        }
    }
}

