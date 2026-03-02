import android.graphics.RectF;
import android.text.Layout;
import java.text.Bidi;

public final class jcg {
    public static final int a(jcf jcf0, Layout layout0, jbx jbx0, int v, RectF rectF0, jcl jcl0, ibtw ibtw0, boolean z) {
        float f7;
        int v37;
        int v24;
        float f5;
        int v33;
        jbw[] arr_jbw1;
        int v25;
        float f2;
        jbw[] arr_jbw;
        float f1;
        float f;
        int v1 = layout0.getLineTop(v);
        int v2 = layout0.getLineBottom(v);
        int v3 = layout0.getLineStart(v);
        int v4 = layout0.getLineEnd(v);
        if(v3 != v4) {
            int v5 = v4 - v3;
            int v6 = v5 + v5;
            float[] arr_f = new float[v6];
            int v7 = jcf0.m(v);
            int v8 = jcf0.j(v);
            int v9 = v8 - v7;
            if(v6 < v9 + v9) {
                jie.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
            }
            jbt jbt0 = new jbt(jcf0);
            boolean z1 = jcf0.n(v) == 1;
            int v10 = 0;
            while(v7 < v8) {
                boolean z2 = jcf0.r(v7);
                if(z1 && !z2) {
                    f = jbt0.a(v7);
                    f1 = jbt0.b(v7 + 1);
                }
                else if(z1) {
                    f1 = jbt0.c(v7);
                    f = jbt0.d(v7 + 1);
                }
                else if(z2) {
                    f1 = jbt0.a(v7);
                    f = jbt0.b(v7 + 1);
                }
                else {
                    f = jbt0.c(v7);
                    f1 = jbt0.d(v7 + 1);
                }
                arr_f[v10] = f;
                arr_f[v10 + 1] = f1;
                v10 += 2;
                ++v7;
            }
            Layout layout1 = jbx0.a;
            int v11 = layout1.getLineStart(v);
            int v12 = layout1.getLineEnd(v);
            int v13 = jbx0.b(v11, false);
            int v14 = jbx0.c(v13);
            Bidi bidi0 = jbx0.e(v13);
            if(bidi0 == null) {
                arr_jbw = new jbw[]{new jbw(v11, v12, layout1.isRtlCharAt(v11))};
            }
            else {
                Bidi bidi1 = bidi0.createLineBidi(v11 - v14, v12 - v14);
                if(bidi1 == null) {
                    arr_jbw = new jbw[]{new jbw(v11, v12, layout1.isRtlCharAt(v11))};
                }
                else {
                    int v15 = bidi1.getRunCount();
                    arr_jbw = new jbw[v15];
                    int v16 = 0;
                    while(v16 < v15) {
                        int v17 = bidi1.getRunStart(v16) + v11;
                        int v18 = bidi1.getRunLimit(v16) + v11;
                        boolean z3 = bidi1.getRunLevel(v16) % 2 == 1 ? true : 0;
                        arr_jbw[v16] = new jbw(v17, v18, z3);
                        ++v16;
                        bidi1 = bidi1;
                    }
                }
            }
            ibwk ibwk0 = z ? ibpg.S(arr_jbw) : new ibwk(ibpg.w(arr_jbw), 0, -1);
            int v19 = ibwk0.b;
            int v20 = ibwk0.a;
            int v21 = ibwk0.c;
            if((v21 <= 0 || v20 > v19) && (v21 >= 0 || v19 > v20)) {
                return -1;
            }
            while(true) {
                jbw jbw0 = arr_jbw[v20];
                boolean z4 = jbw0.c;
                if(z4) {
                    int v22 = jbw0.b - 1 - v3;
                    f2 = arr_f[v22 + v22];
                }
                else {
                    int v23 = jbw0.a - v3;
                    f2 = arr_f[v23 + v23];
                }
                float f3 = z4 ? jcg.b(jbw0.a, v3, arr_f) : jcg.b(jbw0.b - 1, v3, arr_f);
                if(z) {
                    if(jcg.c(rectF0, f2, f3)) {
                        if((!z4 && rectF0.left <= f2) || z4 && (rectF0.right >= f3)) {
                            v25 = jbw0.a;
                            v24 = v21;
                        }
                        else {
                            int v26 = jbw0.a;
                            v25 = jbw0.b;
                            while(true) {
                                v24 = v21;
                                if(v25 - v26 <= 1) {
                                    break;
                                }
                                int v27 = (v25 + v26) / 2;
                                int v28 = v27 - v3;
                                float f4 = arr_f[v28 + v28];
                                int v29 = v27;
                                if((!z4 && f4 > rectF0.left) || z4 && (f4 < rectF0.right)) {
                                    v25 = v29;
                                }
                                else {
                                    v26 = v29;
                                }
                                v21 = v24;
                            }
                            if(!z4) {
                                v25 = v26;
                            }
                        }
                        int v30 = jcl0.a(v25);
                        if(v30 == -1) {
                            arr_jbw1 = arr_jbw;
                            goto label_171;
                        }
                        else {
                            int v31 = jcl0.d(v30);
                            int v32 = jbw0.b;
                            if(v31 < v32) {
                                arr_jbw1 = arr_jbw;
                                v33 = ibwt.g(v31, jbw0.a);
                                RectF rectF1 = new RectF(0.0f, ((float)v1), 0.0f, ((float)v2));
                                int v34 = ibwt.h(v30, v32);
                                while(true) {
                                    if(z4) {
                                        int v35 = v34 - 1 - v3;
                                        f5 = arr_f[v35 + v35];
                                    }
                                    else {
                                        int v36 = v33 - v3;
                                        f5 = arr_f[v36 + v36];
                                    }
                                    rectF1.left = f5;
                                    rectF1.right = z4 ? jcg.b(v33, v3, arr_f) : jcg.b(v34 - 1, v3, arr_f);
                                    if(((Boolean)ibtw0.a(rectF1, rectF0)).booleanValue()) {
                                        goto label_172;
                                    }
                                    v33 = jcl0.b(v33);
                                    if(v33 == -1 || v33 >= v32) {
                                        goto label_171;
                                    }
                                    v34 = ibwt.h(jcl0.a(v33), v32);
                                }
                            }
                            else {
                                arr_jbw1 = arr_jbw;
                                goto label_171;
                            }
                        }
                    }
                    else {
                        v24 = v21;
                        arr_jbw1 = arr_jbw;
                        goto label_171;
                    }
                    goto label_129;
                }
                else {
                label_129:
                    v24 = v21;
                    arr_jbw1 = arr_jbw;
                    if(jcg.c(rectF0, f2, f3)) {
                        if((!z4 && rectF0.right >= f3) || z4 && (rectF0.left <= f2)) {
                            v37 = jbw0.b - 1;
                        }
                        else {
                            int v38 = jbw0.a;
                            v37 = jbw0.b;
                            while(v37 - v38 > 1) {
                                int v39 = (v37 + v38) / 2;
                                int v40 = v39 - v3;
                                float f6 = arr_f[v40 + v40];
                                if((!z4 && f6 > rectF0.right) || z4 && (f6 < rectF0.left)) {
                                    v37 = v39;
                                }
                                else {
                                    v38 = v39;
                                }
                            }
                            if(!z4) {
                                v37 = v38;
                            }
                        }
                        int v41 = jcl0.d(v37 + 1);
                        if(v41 == -1) {
                            goto label_171;
                        }
                        else {
                            int v42 = jcl0.a(v41);
                            int v43 = jbw0.a;
                            if(v42 > v43) {
                                int v44 = ibwt.h(v42, jbw0.b);
                                RectF rectF2 = new RectF(0.0f, ((float)v1), 0.0f, ((float)v2));
                                int v45 = ibwt.g(v41, v43);
                                while(true) {
                                    if(z4) {
                                        int v46 = v44 - 1 - v3;
                                        f7 = arr_f[v46 + v46];
                                    }
                                    else {
                                        int v47 = v45 - v3;
                                        f7 = arr_f[v47 + v47];
                                    }
                                    rectF2.left = f7;
                                    rectF2.right = z4 ? jcg.b(v45, v3, arr_f) : jcg.b(v44 - 1, v3, arr_f);
                                    if(((Boolean)ibtw0.a(rectF2, rectF0)).booleanValue()) {
                                        v33 = v44;
                                        break;
                                    }
                                    v44 = jcl0.c(v44);
                                    if(v44 == -1 || v44 <= v43) {
                                        goto label_171;
                                    }
                                    v45 = ibwt.g(jcl0.d(v44), v43);
                                }
                            }
                            else {
                                goto label_171;
                            }
                        }
                    }
                    else {
                    label_171:
                        v33 = -1;
                    }
                }
            label_172:
                if(v33 >= 0) {
                    return v33;
                }
                if(v20 == v19) {
                    break;
                }
                v20 += v24;
                arr_jbw = arr_jbw1;
                v21 = v24;
            }
        }
        return -1;
    }

    private static final float b(int v, int v1, float[] arr_f) {
        int v2 = v - v1;
        return arr_f[v2 + v2 + 1];
    }

    private static final boolean c(RectF rectF0, float f, float f1) {
        return f1 >= rectF0.left && f <= rectF0.right;
    }
}

