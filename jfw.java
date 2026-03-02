import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo.Builder;
import android.view.inputmethod.InputMethodManager;

@ibni
public final class jfw {
    public final Object a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public jhk h;
    public jbe i;
    public jgz j;
    public ibts k;
    public hka l;
    public hka m;
    private final hvp n;
    private final CursorAnchorInfo.Builder o;
    private final float[] p;
    private final Matrix q;
    private final jgo r;

    public jfw(hvp hvp0, jgo jgo0) {
        this.n = hvp0;
        this.r = jgo0;
        this.a = new Object();
        this.k = jfv.a;
        this.o = new CursorAnchorInfo.Builder();
        this.p = hmb.f();
        this.q = new Matrix();
    }

    public final void a() {
        int v13;
        int v12;
        boolean z9;
        boolean z8;
        boolean z7;
        jgo jgo1;
        boolean z4;
        jgo jgo0 = this.r;
        InputMethodManager inputMethodManager0 = jgo0.a();
        View view0 = jgo0.a;
        if(!inputMethodManager0.isActive(view0)) {
            return;
        }
        this.k.a(new hmb(this.p));
        this.n.e(this.p);
        hkp.a(this.q, this.p);
        CursorAnchorInfo.Builder cursorAnchorInfo$Builder0 = this.o;
        jhk jhk0 = this.h;
        ibuq.c(jhk0);
        jgz jgz0 = this.j;
        ibuq.c(jgz0);
        jbe jbe0 = this.i;
        ibuq.c(jbe0);
        hka hka0 = this.l;
        ibuq.c(hka0);
        hka hka1 = this.m;
        ibuq.c(hka1);
        boolean z = this.d;
        boolean z1 = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        cursorAnchorInfo$Builder0.reset();
        cursorAnchorInfo$Builder0.setMatrix(this.q);
        int v = jbk.d(jhk0.c);
        cursorAnchorInfo$Builder0.setSelectionRange(v, jbk.c(jhk0.c));
        if(z && v >= 0) {
            int v1 = jgz0.a(v);
            hka hka2 = jbe0.m(v1);
            z4 = z1;
            float f = ibwt.f(hka2.b, 0.0f, ((int)(jbe0.c >> 0x20)));
            float f1 = hka2.c;
            boolean z5 = jft.a(hka0, f, f1);
            float f2 = hka2.e;
            boolean z6 = jft.a(hka0, f, f2);
            int v2 = jbe0.q(v1);
            int v3 = z5 || z6 ? 1 : 0;
            if(!z5 || !z6) {
                v3 |= 2;
            }
            if(v2 == 2) {
                v3 |= 4;
            }
            jgo1 = jgo0;
            z7 = z3;
            z8 = z2;
            cursorAnchorInfo$Builder0.setInsertionMarkerLocation(f, f1, f2, f2, v3);
        }
        else {
            jgo1 = jgo0;
            z8 = z2;
            z7 = z3;
            z4 = z1;
        }
        if(z4) {
            jbk jbk0 = jhk0.d;
            int v4 = -1;
            int v5 = jbk0 == null ? -1 : jbk.d(jbk0.b);
            if(jbk0 != null) {
                v4 = jbk.c(jbk0.b);
            }
            int v6 = v4;
            if(v5 >= 0 && v5 < v6) {
                cursorAnchorInfo$Builder0.setComposingText(v5, jhk0.a().subSequence(v5, v6));
                int v7 = jgz0.a(v5);
                int v8 = jgz0.a(v6);
                float[] arr_f = new float[(v8 - v7) * 4];
                z9 = z8;
                long v9 = jbl.a(v7, v8);
                jbe0.b.l(v9, arr_f);
                while(v5 < v6) {
                    int v10 = jgz0.a(v5);
                    int v11 = (v10 - v7) * 4;
                    hka hka3 = new hka(arr_f[v11], arr_f[v11 + 1], arr_f[v11 + 2], arr_f[v11 + 3]);
                    boolean z10 = hka0.i(hka3);
                    float f3 = hka3.b;
                    float f4 = hka3.c;
                    if(jft.a(hka0, f3, f4)) {
                        v12 = z10;
                        if(jft.a(hka0, hka3.d, hka3.e)) {
                            v13 = v12;
                            goto label_80;
                        }
                    }
                    else {
                        v12 = z10;
                    }
                    v13 = v12 | 2;
                label_80:
                    if(jbe0.q(v10) == 2) {
                        v13 |= 4;
                    }
                    cursorAnchorInfo$Builder0.addCharacterBounds(v5, f3, f4, hka3.d, hka3.e, v13);
                    ++v5;
                    v6 = v6;
                    arr_f = arr_f;
                    v7 = v7;
                }
            }
            else {
                z9 = z8;
            }
        }
        else {
            z9 = z8;
        }
        if(Build.VERSION.SDK_INT >= 33 && z9) {
            cursorAnchorInfo$Builder0.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(hmn.b(hka1)).setHandwritingBounds(hmn.b(hka1)).build());
        }
        if(Build.VERSION.SDK_INT >= 34 && z7 && !hka0.h()) {
            int v14 = jbe0.h(hka0.c);
            int v15 = jbe0.h(hka0.e);
            if(v14 > v15) {
                goto label_102;
            }
            while(true) {
                cursorAnchorInfo$Builder0.addVisibleLineBounds(jbe0.b(v14), jbe0.d(v14), jbe0.c(v14), jbe0.a(v14));
                if(v14 == v15) {
                    break;
                }
                ++v14;
            }
        }
    label_102:
        CursorAnchorInfo cursorAnchorInfo0 = cursorAnchorInfo$Builder0.build();
        jgo1.a().updateCursorAnchorInfo(view0, cursorAnchorInfo0);
        this.c = false;
    }
}

