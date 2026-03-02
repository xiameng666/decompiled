import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class jsr extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    boolean E;
    boolean F;
    public float G;
    public float H;
    public String I;
    float J;
    int K;
    public float L;
    public float M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a;
    public boolean aa;
    public boolean ab;
    public String ac;
    public int ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public int al;
    public int am;
    public int an;
    public int ao;
    public int ap;
    public int aq;
    public float ar;
    public int as;
    public int at;
    public float au;
    public jro av;
    public boolean aw;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public jsr(int v) {
        super(v, -2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0x80000000;
        this.x = 0x80000000;
        this.y = 0x80000000;
        this.z = 0x80000000;
        this.A = 0x80000000;
        this.B = 0x80000000;
        this.C = 0x80000000;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = 0x80000000;
        this.aq = 0x80000000;
        this.ar = 0.5f;
        this.av = new jro();
        this.aw = false;
    }

    public jsr(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0x80000000;
        this.x = 0x80000000;
        this.y = 0x80000000;
        this.z = 0x80000000;
        this.A = 0x80000000;
        this.B = 0x80000000;
        this.C = 0x80000000;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = 0x80000000;
        this.aq = 0x80000000;
        this.ar = 0.5f;
        this.av = new jro();
        this.aw = false;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, jtg.b);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            switch(jsq.a.get(v2)) {
                case 1: {
                    this.Z = typedArray0.getInt(v2, this.Z);
                    break;
                }
                case 2: {
                    int v3 = typedArray0.getResourceId(v2, this.p);
                    this.p = v3;
                    if(v3 == -1) {
                        this.p = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 3: {
                    this.q = typedArray0.getDimensionPixelSize(v2, this.q);
                    break;
                }
                case 4: {
                    float f = typedArray0.getFloat(v2, this.r) % 360.0f;
                    this.r = f;
                    if((f < 0.0f)) {
                        this.r = (360.0f - f) % 360.0f;
                    }
                    break;
                }
                case 5: {
                    this.a = typedArray0.getDimensionPixelOffset(v2, this.a);
                    break;
                }
                case 6: {
                    this.b = typedArray0.getDimensionPixelOffset(v2, this.b);
                    break;
                }
                case 7: {
                    this.c = typedArray0.getFloat(v2, this.c);
                    break;
                }
                case 8: {
                    int v4 = typedArray0.getResourceId(v2, this.e);
                    this.e = v4;
                    if(v4 == -1) {
                        this.e = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 9: {
                    int v5 = typedArray0.getResourceId(v2, this.f);
                    this.f = v5;
                    if(v5 == -1) {
                        this.f = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 10: {
                    int v6 = typedArray0.getResourceId(v2, this.g);
                    this.g = v6;
                    if(v6 == -1) {
                        this.g = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 11: {
                    int v7 = typedArray0.getResourceId(v2, this.h);
                    this.h = v7;
                    if(v7 == -1) {
                        this.h = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 12: {
                    int v8 = typedArray0.getResourceId(v2, this.i);
                    this.i = v8;
                    if(v8 == -1) {
                        this.i = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 13: {
                    int v9 = typedArray0.getResourceId(v2, this.j);
                    this.j = v9;
                    if(v9 == -1) {
                        this.j = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 14: {
                    int v10 = typedArray0.getResourceId(v2, this.k);
                    this.k = v10;
                    if(v10 == -1) {
                        this.k = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 15: {
                    int v11 = typedArray0.getResourceId(v2, this.l);
                    this.l = v11;
                    if(v11 == -1) {
                        this.l = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 16: {
                    int v12 = typedArray0.getResourceId(v2, this.m);
                    this.m = v12;
                    if(v12 == -1) {
                        this.m = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 17: {
                    int v13 = typedArray0.getResourceId(v2, this.s);
                    this.s = v13;
                    if(v13 == -1) {
                        this.s = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 18: {
                    int v14 = typedArray0.getResourceId(v2, this.t);
                    this.t = v14;
                    if(v14 == -1) {
                        this.t = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 19: {
                    int v15 = typedArray0.getResourceId(v2, this.u);
                    this.u = v15;
                    if(v15 == -1) {
                        this.u = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 20: {
                    int v16 = typedArray0.getResourceId(v2, this.v);
                    this.v = v16;
                    if(v16 == -1) {
                        this.v = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 21: {
                    this.w = typedArray0.getDimensionPixelSize(v2, this.w);
                    break;
                }
                case 22: {
                    this.x = typedArray0.getDimensionPixelSize(v2, this.x);
                    break;
                }
                case 23: {
                    this.y = typedArray0.getDimensionPixelSize(v2, this.y);
                    break;
                }
                case 24: {
                    this.z = typedArray0.getDimensionPixelSize(v2, this.z);
                    break;
                }
                case 25: {
                    this.A = typedArray0.getDimensionPixelSize(v2, this.A);
                    break;
                }
                case 26: {
                    this.B = typedArray0.getDimensionPixelSize(v2, this.B);
                    break;
                }
                case 27: {
                    this.aa = typedArray0.getBoolean(v2, this.aa);
                    break;
                }
                case 28: {
                    this.ab = typedArray0.getBoolean(v2, this.ab);
                    break;
                }
                case 29: {
                    this.G = typedArray0.getFloat(v2, this.G);
                    break;
                }
                case 30: {
                    this.H = typedArray0.getFloat(v2, this.H);
                    break;
                }
                case 0x1F: {
                    int v17 = typedArray0.getInt(v2, 0);
                    this.P = v17;
                    if(v17 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                }
                case 0x20: {
                    int v18 = typedArray0.getInt(v2, 0);
                    this.Q = v18;
                    if(v18 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                }
                case 33: {
                    try {
                        this.R = typedArray0.getDimensionPixelSize(v2, this.R);
                    }
                    catch(Exception unused_ex) {
                        if(typedArray0.getInt(v2, this.R) == -2) {
                            this.R = -2;
                        }
                    }
                    break;
                }
                case 34: {
                    try {
                        this.T = typedArray0.getDimensionPixelSize(v2, this.T);
                    }
                    catch(Exception unused_ex) {
                        if(typedArray0.getInt(v2, this.T) == -2) {
                            this.T = -2;
                        }
                    }
                    break;
                }
                case 35: {
                    this.V = Math.max(0.0f, typedArray0.getFloat(v2, this.V));
                    this.P = 2;
                    break;
                }
                case 36: {
                    try {
                        this.S = typedArray0.getDimensionPixelSize(v2, this.S);
                    }
                    catch(Exception unused_ex) {
                        if(typedArray0.getInt(v2, this.S) == -2) {
                            this.S = -2;
                        }
                    }
                    break;
                }
                case 37: {
                    try {
                        this.U = typedArray0.getDimensionPixelSize(v2, this.U);
                    }
                    catch(Exception unused_ex) {
                        if(typedArray0.getInt(v2, this.U) == -2) {
                            this.U = -2;
                        }
                    }
                    break;
                }
                case 38: {
                    this.W = Math.max(0.0f, typedArray0.getFloat(v2, this.W));
                    this.Q = 2;
                    break;
                }
                case 44: {
                    jtc.n(this, typedArray0.getString(v2));
                    break;
                }
                case 45: {
                    this.L = typedArray0.getFloat(v2, this.L);
                    break;
                }
                case 46: {
                    this.M = typedArray0.getFloat(v2, this.M);
                    break;
                }
                case 0x2F: {
                    this.N = typedArray0.getInt(v2, 0);
                    break;
                }
                case 0x30: {
                    this.O = typedArray0.getInt(v2, 0);
                    break;
                }
                case 49: {
                    this.X = typedArray0.getDimensionPixelOffset(v2, this.X);
                    break;
                }
                case 50: {
                    this.Y = typedArray0.getDimensionPixelOffset(v2, this.Y);
                    break;
                }
                case 51: {
                    this.ac = typedArray0.getString(v2);
                    break;
                }
                case 52: {
                    int v19 = typedArray0.getResourceId(v2, this.n);
                    this.n = v19;
                    if(v19 == -1) {
                        this.n = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 53: {
                    int v20 = typedArray0.getResourceId(v2, this.o);
                    this.o = v20;
                    if(v20 == -1) {
                        this.o = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 54: {
                    this.D = typedArray0.getDimensionPixelSize(v2, this.D);
                    break;
                }
                case 55: {
                    this.C = typedArray0.getDimensionPixelSize(v2, this.C);
                    break;
                }
                case 0x40: {
                    jtc.m(this, typedArray0, v2, 0);
                    this.E = true;
                    break;
                }
                case 65: {
                    jtc.m(this, typedArray0, v2, 1);
                    this.F = true;
                    break;
                }
                case 66: {
                    this.ad = typedArray0.getInt(v2, this.ad);
                    break;
                }
                case 67: {
                    this.d = typedArray0.getBoolean(v2, this.d);
                }
            }
        }
        typedArray0.recycle();
        this.a();
    }

    public jsr(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super(viewGroup$LayoutParams0);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0x80000000;
        this.x = 0x80000000;
        this.y = 0x80000000;
        this.z = 0x80000000;
        this.A = 0x80000000;
        this.B = 0x80000000;
        this.C = 0x80000000;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = 0x80000000;
        this.aq = 0x80000000;
        this.ar = 0.5f;
        this.av = new jro();
        this.aw = false;
        if(!(viewGroup$LayoutParams0 instanceof jsr)) {
            return;
        }
        this.a = ((jsr)viewGroup$LayoutParams0).a;
        this.b = ((jsr)viewGroup$LayoutParams0).b;
        this.c = ((jsr)viewGroup$LayoutParams0).c;
        this.d = ((jsr)viewGroup$LayoutParams0).d;
        this.e = ((jsr)viewGroup$LayoutParams0).e;
        this.f = ((jsr)viewGroup$LayoutParams0).f;
        this.g = ((jsr)viewGroup$LayoutParams0).g;
        this.h = ((jsr)viewGroup$LayoutParams0).h;
        this.i = ((jsr)viewGroup$LayoutParams0).i;
        this.j = ((jsr)viewGroup$LayoutParams0).j;
        this.k = ((jsr)viewGroup$LayoutParams0).k;
        this.l = ((jsr)viewGroup$LayoutParams0).l;
        this.m = ((jsr)viewGroup$LayoutParams0).m;
        this.n = ((jsr)viewGroup$LayoutParams0).n;
        this.o = ((jsr)viewGroup$LayoutParams0).o;
        this.p = ((jsr)viewGroup$LayoutParams0).p;
        this.q = ((jsr)viewGroup$LayoutParams0).q;
        this.r = ((jsr)viewGroup$LayoutParams0).r;
        this.s = ((jsr)viewGroup$LayoutParams0).s;
        this.t = ((jsr)viewGroup$LayoutParams0).t;
        this.u = ((jsr)viewGroup$LayoutParams0).u;
        this.v = ((jsr)viewGroup$LayoutParams0).v;
        this.w = ((jsr)viewGroup$LayoutParams0).w;
        this.x = ((jsr)viewGroup$LayoutParams0).x;
        this.y = ((jsr)viewGroup$LayoutParams0).y;
        this.z = ((jsr)viewGroup$LayoutParams0).z;
        this.A = ((jsr)viewGroup$LayoutParams0).A;
        this.B = ((jsr)viewGroup$LayoutParams0).B;
        this.C = ((jsr)viewGroup$LayoutParams0).C;
        this.D = ((jsr)viewGroup$LayoutParams0).D;
        this.G = ((jsr)viewGroup$LayoutParams0).G;
        this.H = ((jsr)viewGroup$LayoutParams0).H;
        this.I = ((jsr)viewGroup$LayoutParams0).I;
        this.J = ((jsr)viewGroup$LayoutParams0).J;
        this.K = ((jsr)viewGroup$LayoutParams0).K;
        this.L = ((jsr)viewGroup$LayoutParams0).L;
        this.M = ((jsr)viewGroup$LayoutParams0).M;
        this.N = ((jsr)viewGroup$LayoutParams0).N;
        this.O = ((jsr)viewGroup$LayoutParams0).O;
        this.aa = ((jsr)viewGroup$LayoutParams0).aa;
        this.ab = ((jsr)viewGroup$LayoutParams0).ab;
        this.P = ((jsr)viewGroup$LayoutParams0).P;
        this.Q = ((jsr)viewGroup$LayoutParams0).Q;
        this.R = ((jsr)viewGroup$LayoutParams0).R;
        this.T = ((jsr)viewGroup$LayoutParams0).T;
        this.S = ((jsr)viewGroup$LayoutParams0).S;
        this.U = ((jsr)viewGroup$LayoutParams0).U;
        this.V = ((jsr)viewGroup$LayoutParams0).V;
        this.W = ((jsr)viewGroup$LayoutParams0).W;
        this.X = ((jsr)viewGroup$LayoutParams0).X;
        this.Y = ((jsr)viewGroup$LayoutParams0).Y;
        this.Z = ((jsr)viewGroup$LayoutParams0).Z;
        this.ae = ((jsr)viewGroup$LayoutParams0).ae;
        this.af = ((jsr)viewGroup$LayoutParams0).af;
        this.ag = ((jsr)viewGroup$LayoutParams0).ag;
        this.ah = ((jsr)viewGroup$LayoutParams0).ah;
        this.al = ((jsr)viewGroup$LayoutParams0).al;
        this.am = ((jsr)viewGroup$LayoutParams0).am;
        this.an = ((jsr)viewGroup$LayoutParams0).an;
        this.ao = ((jsr)viewGroup$LayoutParams0).ao;
        this.ap = ((jsr)viewGroup$LayoutParams0).ap;
        this.aq = ((jsr)viewGroup$LayoutParams0).aq;
        this.ar = ((jsr)viewGroup$LayoutParams0).ar;
        this.ac = ((jsr)viewGroup$LayoutParams0).ac;
        this.ad = ((jsr)viewGroup$LayoutParams0).ad;
        this.av = ((jsr)viewGroup$LayoutParams0).av;
        this.E = ((jsr)viewGroup$LayoutParams0).E;
        this.F = ((jsr)viewGroup$LayoutParams0).F;
    }

    public final void a() {
        this.ah = false;
        this.ae = true;
        this.af = true;
        if(this.width == -2 && this.aa) {
            this.ae = false;
            if(this.P == 0) {
                this.P = 1;
            }
        }
        if(this.height == -2 && this.ab) {
            this.af = false;
            if(this.Q == 0) {
                this.Q = 1;
            }
        }
        if(this.width == -1 || this.width == 0) {
            this.ae = false;
            if(this.width == 0 && this.P == 1) {
                this.width = -2;
                this.aa = true;
            }
        }
        if(this.height == -1 || this.height == 0) {
            this.af = false;
            if(this.height == 0 && this.Q == 1) {
                this.height = -2;
                this.ab = true;
            }
        }
        if(this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.ah = true;
        this.ae = true;
        this.af = true;
        if(!(this.av instanceof jrs)) {
            this.av = new jrs();
        }
        ((jrs)this.av).c(this.Z);
    }

    @Override  // android.view.ViewGroup$MarginLayoutParams
    public final void resolveLayoutDirection(int v) {
        boolean z;
        int v1 = this.leftMargin;
        int v2 = this.rightMargin;
        super.resolveLayoutDirection(v);
        int v3 = this.getLayoutDirection();
        this.an = -1;
        this.ao = -1;
        this.al = -1;
        this.am = -1;
        this.ap = this.w;
        this.aq = this.y;
        float f = this.G;
        this.ar = f;
        int v4 = this.a;
        this.as = v4;
        int v5 = this.b;
        this.at = v5;
        float f1 = this.c;
        this.au = f1;
        if(v3 == 1) {
            int v6 = this.s;
            if(v6 == -1) {
                int v7 = this.t;
                if(v7 == -1) {
                    z = false;
                }
                else {
                    this.ao = v7;
                    z = true;
                }
            }
            else {
                this.an = v6;
                z = true;
            }
            int v8 = this.u;
            if(v8 != -1) {
                this.am = v8;
                z = true;
            }
            int v9 = this.v;
            if(v9 != -1) {
                this.al = v9;
                z = true;
            }
            int v10 = this.A;
            if(v10 != 0x80000000) {
                this.aq = v10;
            }
            int v11 = this.B;
            if(v11 != 0x80000000) {
                this.ap = v11;
            }
            if(z) {
                this.ar = 1.0f - f;
            }
            if(this.ah && this.Z == 1 && this.d) {
                if(f1 != -1.0f) {
                    this.au = 1.0f - f1;
                    this.as = -1;
                    this.at = -1;
                }
                else if(v4 != -1) {
                    this.at = v4;
                    this.as = -1;
                    this.au = -1.0f;
                }
                else if(v5 != -1) {
                    this.as = v5;
                    this.at = -1;
                    this.au = -1.0f;
                }
            }
        }
        else {
            int v12 = this.s;
            if(v12 != -1) {
                this.am = v12;
            }
            int v13 = this.t;
            if(v13 != -1) {
                this.al = v13;
            }
            int v14 = this.u;
            if(v14 != -1) {
                this.an = v14;
            }
            int v15 = this.v;
            if(v15 != -1) {
                this.ao = v15;
            }
            int v16 = this.A;
            if(v16 != 0x80000000) {
                this.ap = v16;
            }
            int v17 = this.B;
            if(v17 != 0x80000000) {
                this.aq = v17;
            }
        }
        if(this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
            int v18 = this.g;
            if(v18 == -1) {
                int v19 = this.h;
                if(v19 != -1) {
                    this.ao = v19;
                    if(this.rightMargin <= 0 && v2 > 0) {
                        this.rightMargin = v2;
                    }
                }
            }
            else {
                this.an = v18;
                if(this.rightMargin <= 0 && v2 > 0) {
                    this.rightMargin = v2;
                }
            }
            int v20 = this.e;
            if(v20 == -1) {
                int v21 = this.f;
                if(v21 != -1) {
                    this.am = v21;
                    if(this.leftMargin <= 0 && v1 > 0) {
                        this.leftMargin = v1;
                    }
                }
            }
            else {
                this.al = v20;
                if(this.leftMargin <= 0 && v1 > 0) {
                    this.leftMargin = v1;
                }
            }
        }
    }
}

