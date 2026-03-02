import android.view.KeyEvent;
import java.util.List;

public class crv extends cqq {
    private hwe l;

    public crv(dgg dgg0, ctp ctp0, boolean z, boolean z1, String s, its its0, ibth ibth0) {
        super(dgg0, ctp0, z, z1, s, its0, ibth0);
    }

    @Override  // cqq
    public final hxj C() {
        return null;
    }

    @Override  // cqq
    protected final void F(KeyEvent keyEvent0) {
        this.d.a();
    }

    @Override  // cqq
    protected final void G(KeyEvent keyEvent0) {
    }

    @Override  // cqq
    public final void n() {
        super.n();
        if(this.l != null) {
            this.l = null;
            this.h(false);
        }
    }

    @Override  // cqq
    public final void q(hvt hvt0, hvv hvv0, long v) {
        super.q(hvt0, hvv0, v);
        if(hvv0 == hvv.b) {
            hwe hwe0 = this.l;
            if(hwe0 != null) {
                List list0 = hvt0.a;
                int v1 = list0.size();
                int v2 = 0;
                while(v2 < v1) {
                    if(!hvu.e(((hwe)list0.get(v2)))) {
                        long v3 = ((iqy)iel.a(this, ipa.m)).g();
                        long v4 = ien.g(this).ek(v3);
                        long v5 = (long)Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat(((int)(v4 >> 0x20))) - ((float)(((int)(v >> 0x20))))) / 2.0f);
                        long v6 = (long)Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat(((int)(v4 & 0xFFFFFFFFL))) - ((float)(((int)(v & 0xFFFFFFFFL))))) / 2.0f);
                        int v7 = list0.size();
                        int v8 = 0;
                        while(true) {
                            if(v8 >= v7) {
                                return;
                            }
                            hwe hwe2 = (hwe)list0.get(v8);
                            if(!hwe2.c() && !hvu.g(hwe2, v, v5 << 0x20 | v6 & 0xFFFFFFFFL)) {
                                ++v8;
                                continue;
                            }
                            this.l = null;
                            this.h(false);
                            return;
                        }
                    }
                    ++v2;
                }
                ((hwe)list0.get(0)).b();
                if(this.c) {
                    this.i(hwe0.c, false);
                    this.d.a();
                }
                this.l = null;
            }
            else if(den.e(hvt0, true)) {
                hwe hwe1 = (hwe)hvt0.a.get(0);
                hwe1.b();
                this.l = hwe1;
                if(this.c) {
                    this.j(hwe1.c, false);
                }
            }
        }
        else if(hvv0 == hvv.c && this.l != null) {
            List list1 = hvt0.a;
            int v9 = list1.size();
            for(int v10 = 0; v10 < v9; ++v10) {
                hwe hwe3 = (hwe)list1.get(v10);
                if(hwe3.c() && !ibuq.m(hwe3, this.l)) {
                    this.l = null;
                    this.h(false);
                    return;
                }
            }
        }
    }
}

