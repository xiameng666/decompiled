import android.view.KeyEvent;

public final class csc extends cqq implements iek {
    public ibth l;
    public ibth m;
    private final byd n;
    private final byd o;

    public csc(ibth ibth0, dgg dgg0, ctp ctp0, boolean z) {
        super(dgg0, ctp0, false, z, null, null, ibth0);
        this.l = null;
        this.m = null;
        this.n = new byd(null);
        this.o = new byd(null);
    }

    @Override  // cqq
    public final hxj C() {
        return new hxj(null, null, new csb(this));
    }

    @Override  // cqq
    protected final void F(KeyEvent keyEvent0) {
        byd byd0 = this.n;
        long v = hul.b(keyEvent0);
        if(byd0.a(v) != null) {
            iced iced0 = (iced)byd0.a(v);
            boolean z = false;
            if(iced0 != null) {
                if(iced0.y()) {
                    iceb.a(iced0);
                }
                else {
                    z = true;
                }
            }
            byd0.c(v);
            if(z) {
                return;
            }
        }
        this.d.a();
    }

    @Override  // cqq
    protected final void G(KeyEvent keyEvent0) {
        long v = hul.b(keyEvent0);
        if(((cry)this.o.a(v)) == null) {
            return;
        }
        throw null;
    }

    private final void U() {
        int v5;
        long[] arr_v1;
        Object[] arr_object1;
        byd byd1;
        byd byd0 = this.n;
        Object[] arr_object = byd0.c;
        long[] arr_v = byd0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_17;
                }
                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                for(int v4 = 0; v4 < v3; ++v4) {
                    if((v2 & 0xFFL) < 0x80L) {
                        iceb.a(((iced)arr_object[(v1 << 3) + v4]));
                    }
                    v2 >>= 8;
                }
                if(v3 == 8) {
                label_17:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                }
                goto label_20;
            }
        }
        else {
        label_20:
            byd0.d();
            byd1 = this.o;
            arr_object1 = byd1.c;
            arr_v1 = byd1.a;
            v5 = arr_v1.length - 2;
            if(v5 >= 0) {
                goto label_26;
            }
            goto label_42;
        }
    label_26:
        int v6 = 0;
        while(true) {
            long v7 = arr_v1[v6];
            if((~v7 << 7 & v7 & 0x8080808080808080L) != 0x8080808080808080L) {
                int v8 = 8 - (~(v6 - v5) >>> 0x1F);
                int v9 = 0;
                while(v9 < v8) {
                    if((v7 & 0xFFL) >= 0x80L) {
                        v7 >>= 8;
                        ++v9;
                        continue;
                    }
                    cry cry0 = (cry)arr_object1[(v6 << 3) + v9];
                    throw null;
                }
                if(v8 == 8) {
                    goto label_39;
                }
                break;
            }
        label_39:
            if(v6 == v5) {
                break;
            }
            ++v6;
        }
    label_42:
        byd1.d();
    }

    @Override  // hfb
    public final void dM() {
        this.U();
    }

    @Override  // cqq
    public final void e(ivj ivj0) {
    }

    @Override  // cqq
    protected final void l() {
        this.U();
    }
}

