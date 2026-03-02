import android.provider.Settings.Global;

public final class bvvo implements ibts {
    public final bvvt a;
    public final hglz b;

    public bvvo(bvvt bvvt0, hglz hglz0) {
        this.a = bvvt0;
        this.b = hglz0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v;
        bvvt bvvt0 = this.a;
        if(((hgni)object0) == null) {
            ((ggtj)bvvt0.q.i()).x("Navigated to null screen.");
            bvvt0.u();
            return ibom.a;
        }
        hglz hglz0 = this.b;
        ca ca0 = new ca(bvvt0.getSupportFragmentManager());
        if(!hglz0.f) {
            hgnj hgnj0 = ((hgni)object0).c;
            if(hgnj0 == null) {
                hgnj0 = hgnj.a;
            }
            ca0.w(String.valueOf(hgnj0.b));
        }
        ibuq.c(hglz0);
        ibuq.f(hglz0, "screenNavigationAction");
        if(Settings.Global.getFloat(bvvt0.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            switch(hglz0.e) {
                case 0: {
                    v = 2;
                    break;
                }
                case 1: {
                    v = 3;
                    break;
                }
                default: {
                    v = 0;
                }
            }
            if(v == 3) {
                switch((hgly.a(hglz0.d) == 0 ? 1 : hgly.a(hglz0.d)) - 2) {
                    case 1: {
                        ca0.B(0x7F0100BE, 0x7F0100C6, 0x7F0100BE, 0x7F0100C6);  // anim:slide_in_from_end
                        break;
                    }
                    case 2: {
                        ca0.B(0x7F0100BD, 0x7F0100C7, 0x7F0100BD, 0x7F0100C7);  // anim:slide_in_from_bottom
                        break;
                    }
                    case 3: {
                        ca0.B(0x7F0100BF, 0x7F0100C5, 0x7F0100BF, 0x7F0100C5);  // anim:slide_in_from_start
                        break;
                    }
                    case 4: {
                        ca0.B(0x7F0100C0, 0x7F0100C4, 0x7F0100C0, 0x7F0100C4);  // anim:slide_in_from_top
                    }
                }
            }
            else {
                switch((hgly.a(hglz0.d) == 0 ? 1 : hgly.a(hglz0.d)) - 2) {
                    case 1: {
                        ca0.B(0x7F0100BE, 0x7F0100C6, 0x7F0100BF, 0x7F0100C5);  // anim:slide_in_from_end
                        break;
                    }
                    case 2: {
                        ca0.B(0x7F0100BD, 0x7F0100C7, 0x7F0100C0, 0x7F0100C4);  // anim:slide_in_from_bottom
                        break;
                    }
                    case 3: {
                        ca0.B(0x7F0100BF, 0x7F0100C5, 0x7F0100BE, 0x7F0100C6);  // anim:slide_in_from_start
                        break;
                    }
                    case 4: {
                        ca0.B(0x7F0100C0, 0x7F0100C4, 0x7F0100BD, 0x7F0100C7);  // anim:slide_in_from_top
                    }
                }
            }
        }
        ca0.G(0x7F0B138E, bvxb.y(((hgni)object0)));  // id:featuredrops_fragment_container
        ca0.b();
        bvvt0.B();
        return ibom.a;
    }
}

