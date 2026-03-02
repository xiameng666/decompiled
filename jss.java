import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class jss {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final ConstraintLayout h;

    public jss(ConstraintLayout constraintLayout0, ConstraintLayout constraintLayout1) {
        this.h = constraintLayout0;
        super();
        this.a = constraintLayout1;
    }

    public final void a(jro jro0, jrx jrx0) {
        int v24;
        int v18;
        int v17;
        int v16;
        int v11;
        int v6;
        if(jro0 != null) {
            if(jro0.ai == 8) {
                goto label_117;
            }
            if(jro0.V != null) {
                int v = jrx0.i;
                int v1 = jrx0.j;
                int v2 = jrx0.a;
                int v3 = jrx0.b;
                int v4 = this.b + this.c;
                int v5 = this.d;
                Object object0 = jro0.ah;
                if(v == 0) {
                    throw null;
                }
                switch(v - 1) {
                    case 0: {
                        v6 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
                        break;
                    }
                    case 1: {
                        v6 = ViewGroup.getChildMeasureSpec(this.f, v5, -2);
                        break;
                    }
                    case 2: {
                        v6 = ViewGroup.getChildMeasureSpec(this.f, v5, -2);
                        int v7 = jro0.t;
                        if(jrx0.h == 1 || jrx0.h == 2) {
                            int v8 = ((View)object0).getMeasuredHeight();
                            if(jrx0.h == 2 || v7 != 1 || v8 == jro0.h() || (object0 instanceof jte) || jro0.e()) {
                                v6 = View.MeasureSpec.makeMeasureSpec(jro0.j(), 0x40000000);
                            }
                        }
                        break;
                    }
                    case 3: {
                        int v9 = this.f;
                        int v10 = jro0.K == null ? 0 : jro0.K.f;
                        jrn jrn0 = jro0.M;
                        if(jrn0 != null) {
                            v10 += jrn0.f;
                        }
                        v6 = ViewGroup.getChildMeasureSpec(v9, v5 + v10, -1);
                        break;
                    }
                    default: {
                        v6 = 0;
                    }
                }
                if(v1 == 0) {
                    throw null;
                }
                switch(v1 - 1) {
                    case 0: {
                        v11 = View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
                        break;
                    }
                    case 1: {
                        v11 = ViewGroup.getChildMeasureSpec(this.g, v4, -2);
                        break;
                    }
                    case 2: {
                        v11 = ViewGroup.getChildMeasureSpec(this.g, v4, -2);
                        int v14 = jro0.u;
                        if(jrx0.h == 1 || jrx0.h == 2) {
                            int v15 = ((View)object0).getMeasuredWidth();
                            if(jrx0.h == 2 || v14 != 1 || v15 == jro0.j() || (object0 instanceof jte) || jro0.f()) {
                                v11 = View.MeasureSpec.makeMeasureSpec(jro0.h(), 0x40000000);
                            }
                        }
                        break;
                    }
                    default: {
                        if(v1 - 1 == 3) {
                            int v12 = this.g;
                            int v13 = jro0.K == null ? 0 : jro0.L.f;
                            if(jro0.M != null) {
                                v13 += jro0.N.f;
                            }
                            v11 = ViewGroup.getChildMeasureSpec(v12, v4 + v13, -1);
                        }
                        else {
                            v11 = 0;
                        }
                    }
                }
                jro jro1 = jro0.V;
                if(jro1 != null && jru.b(this.h.e, 0x100) && ((View)object0).getMeasuredWidth() == jro0.j() && ((View)object0).getMeasuredWidth() < jro1.j() && ((View)object0).getMeasuredHeight() == jro0.h() && ((View)object0).getMeasuredHeight() < jro1.h() && ((View)object0).getBaseline() == jro0.ac && !jro0.M() && jss.b(jro0.I, v6, jro0.j()) && jss.b(jro0.J, v11, jro0.h())) {
                    jrx0.c = jro0.j();
                    jrx0.d = jro0.h();
                    jrx0.e = jro0.ac;
                    return;
                }
                boolean z = v == 3 && jro0.Y > 0.0f;
                boolean z1 = v1 == 3 && jro0.Y > 0.0f;
                if(object0 != null) {
                    jsr jsr0 = (jsr)((View)object0).getLayoutParams();
                    if(jrx0.h != 1 && jrx0.h != 2 && v == 3 && jro0.t == 0 && v1 == 3 && jro0.u == 0) {
                        v16 = 0;
                        v17 = 0;
                        v18 = 0;
                    }
                    else {
                        if((object0 instanceof jth) && (jro0 instanceof jrv)) {
                            ((jth)object0).b(((jrv)jro0), v6, v11);
                        }
                        else {
                            ((View)object0).measure(v6, v11);
                        }
                        jro0.C(v6, v11);
                        int v19 = ((View)object0).getMeasuredWidth();
                        int v20 = ((View)object0).getMeasuredHeight();
                        v16 = ((View)object0).getBaseline();
                        v17 = jro0.w <= 0 ? v19 : Math.max(jro0.w, v19);
                        int v21 = jro0.x;
                        if(v21 > 0) {
                            v17 = Math.min(v21, v17);
                        }
                        v18 = jro0.z <= 0 ? v20 : Math.max(jro0.z, v20);
                        int v22 = jro0.A;
                        if(v22 > 0) {
                            v18 = Math.min(v22, v18);
                        }
                        if(!jru.b(this.h.e, 1)) {
                            if(z && (v1 == 1 || v1 == 4)) {
                                v17 = (int)(((float)v18) * jro0.Y + 0.5f);
                            }
                            else if(z1 && (v == 1 || v == 4)) {
                                v18 = (int)(((float)v17) / jro0.Y + 0.5f);
                            }
                        }
                        if(v19 != v17 || v20 != v18) {
                            if(v19 != v17) {
                                v6 = View.MeasureSpec.makeMeasureSpec(v17, 0x40000000);
                            }
                            if(v20 != v18) {
                                v11 = View.MeasureSpec.makeMeasureSpec(v18, 0x40000000);
                            }
                            ((View)object0).measure(v6, v11);
                            jro0.C(v6, v11);
                            v17 = ((View)object0).getMeasuredWidth();
                            v18 = ((View)object0).getMeasuredHeight();
                            v16 = ((View)object0).getBaseline();
                        }
                    }
                    jrx0.g = v17 != jrx0.a || v18 != jrx0.b;
                    int v23 = jsr0.ag | (v16 == -1 ? 0 : 1);
                    if(v23 == 0) {
                        v24 = v16;
                    }
                    else if(v16 != -1) {
                        if(jro0.ac != v16) {
                            jrx0.g = true;
                        }
                        v24 = v16;
                    }
                    else {
                        v24 = -1;
                    }
                    jrx0.c = v17;
                    jrx0.d = v18;
                    jrx0.f = v23;
                    jrx0.e = v24;
                    return;
                label_117:
                    jrx0.c = 0;
                    jrx0.d = 0;
                    jrx0.e = 0;
                }
            }
        }
    }

    private static final boolean b(int v, int v1, int v2) {
        if(v == v1) {
            return true;
        }
        int v3 = View.MeasureSpec.getMode(v);
        return View.MeasureSpec.getMode(v1) == 0x40000000 && (v3 == 0x80000000 || v3 == 0) && v2 == View.MeasureSpec.getSize(v1);
    }
}

