import java.io.PrintWriter;

public class gpug extends gpua {
    private final ISensorFusionProcessor b;
    private final int c;

    public gpug(ISensorFusionProcessor gpuv0, int v) {
        this.b = gpuv0;
        this.c = v;
        this.a = new ISensorFusionProcessor[]{gpuv0};
    }

    @Override  // gpua
    public final void d(long v, gptu_Position gptu0) {
        boolean z;
        switch(this.c - 1) {
            case 0: {
                z = gptu0.t();
                break;
            }
            case 1: {
                z = gptu0.u();
                break;
            }
            default: {
                z = gptu0.s();
            }
        }
        if(z) {
            this.b.d(v, gptu0);
        }
    }

    @Override  // gpua
    public final long r() {
        return this.b.r();
    }

    @Override  // gpua
    public final gptu_Position s() {
        gpts_PositionProvider gpts0;
        gptu_Position gptu0 = this.b.s();
        if(gptu0 != null) {
            PositionBuilder gptr0 = gptu0.g();
            switch(this.c - 1) {
                case 0: {
                    gpts0 = gpts_PositionProvider.ECHO_GPS;
                    break;
                }
                case 1: {
                    gpts0 = gpts_PositionProvider.ECHO_WIFI;
                    break;
                }
                default: {
                    gpts0 = gpts_PositionProvider.ECHO_CELL;
                }
            }
            gptr0.flpSensorFusion = gpts0;
            return new gptu_Position(gptr0);
        }
        return null;
    }

    @Override  // gpua
    public final void t(long v, PrintWriter printWriter0) {
        String s;
        switch(this.c) {
            case 1: {
                s = "GPS";
                break;
            }
            case 2: {
                s = "WIFI";
                break;
            }
            default: {
                s = "CELL";
            }
        }
        printWriter0.println(a.a(s, "FilteringFusion based on ", " position."));
    }
}

