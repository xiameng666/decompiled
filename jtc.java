import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class jtc {
    public static final int[] a;
    private static final SparseIntArray b;
    private static final SparseIntArray c;
    private final HashMap d;
    private final HashMap e;

    static {
        jtc.a = new int[]{0, 4, 8};
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        jtc.b = sparseIntArray0;
        SparseIntArray sparseIntArray1 = new SparseIntArray();
        jtc.c = sparseIntArray1;
        sparseIntArray0.append(82, 25);
        sparseIntArray0.append(83, 26);
        sparseIntArray0.append(85, 29);
        sparseIntArray0.append(86, 30);
        sparseIntArray0.append(92, 36);
        sparseIntArray0.append(91, 35);
        sparseIntArray0.append(0x3F, 4);
        sparseIntArray0.append(62, 3);
        sparseIntArray0.append(58, 1);
        sparseIntArray0.append(60, 91);
        sparseIntArray0.append(59, 92);
        sparseIntArray0.append(101, 6);
        sparseIntArray0.append(102, 7);
        sparseIntArray0.append(70, 17);
        sparseIntArray0.append(71, 18);
        sparseIntArray0.append(72, 19);
        sparseIntArray0.append(54, 99);
        sparseIntArray0.append(0, 27);
        sparseIntArray0.append(87, 0x20);
        sparseIntArray0.append(88, 33);
        sparseIntArray0.append(69, 10);
        sparseIntArray0.append(68, 9);
        sparseIntArray0.append(106, 13);
        sparseIntArray0.append(109, 16);
        sparseIntArray0.append(107, 14);
        sparseIntArray0.append(104, 11);
        sparseIntArray0.append(108, 15);
        sparseIntArray0.append(105, 12);
        sparseIntArray0.append(0x5F, 40);
        sparseIntArray0.append(80, 39);
        sparseIntArray0.append(0x4F, 41);
        sparseIntArray0.append(94, 42);
        sparseIntArray0.append(78, 20);
        sparseIntArray0.append(93, 37);
        sparseIntArray0.append(67, 5);
        sparseIntArray0.append(81, 87);
        sparseIntArray0.append(90, 87);
        sparseIntArray0.append(84, 87);
        sparseIntArray0.append(61, 87);
        sparseIntArray0.append(57, 87);
        sparseIntArray0.append(5, 24);
        sparseIntArray0.append(7, 28);
        sparseIntArray0.append(23, 0x1F);
        sparseIntArray0.append(24, 8);
        sparseIntArray0.append(6, 34);
        sparseIntArray0.append(8, 2);
        sparseIntArray0.append(3, 23);
        sparseIntArray0.append(4, 21);
        sparseIntArray0.append(0x60, 0x5F);
        sparseIntArray0.append(73, 0x60);
        sparseIntArray0.append(2, 22);
        sparseIntArray0.append(13, 43);
        sparseIntArray0.append(26, 44);
        sparseIntArray0.append(21, 45);
        sparseIntArray0.append(22, 46);
        sparseIntArray0.append(20, 60);
        sparseIntArray0.append(18, 0x2F);
        sparseIntArray0.append(19, 0x30);
        sparseIntArray0.append(14, 49);
        sparseIntArray0.append(15, 50);
        sparseIntArray0.append(16, 51);
        sparseIntArray0.append(17, 52);
        sparseIntArray0.append(25, 53);
        sparseIntArray0.append(97, 54);
        sparseIntArray0.append(74, 55);
        sparseIntArray0.append(98, 56);
        sparseIntArray0.append(75, 57);
        sparseIntArray0.append(99, 58);
        sparseIntArray0.append(76, 59);
        sparseIntArray0.append(0x40, 61);
        sparseIntArray0.append(66, 62);
        sparseIntArray0.append(65, 0x3F);
        sparseIntArray0.append(28, 0x40);
        sparseIntArray0.append(0x79, 65);
        sparseIntArray0.append(35, 66);
        sparseIntArray0.append(0x7A, 67);
        sparseIntArray0.append(0x71, 0x4F);
        sparseIntArray0.append(1, 38);
        sparseIntArray0.append(0x70, 68);
        sparseIntArray0.append(100, 69);
        sparseIntArray0.append(77, 70);
        sparseIntArray0.append(0x6F, 97);
        sparseIntArray0.append(0x20, 71);
        sparseIntArray0.append(30, 72);
        sparseIntArray0.append(0x1F, 73);
        sparseIntArray0.append(33, 74);
        sparseIntArray0.append(29, 75);
        sparseIntArray0.append(0x72, 76);
        sparseIntArray0.append(89, 77);
        sparseIntArray0.append(0x7B, 78);
        sparseIntArray0.append(56, 80);
        sparseIntArray0.append(55, 81);
        sparseIntArray0.append(0x74, 82);
        sparseIntArray0.append(120, 83);
        sparseIntArray0.append(0x77, 84);
        sparseIntArray0.append(0x76, 85);
        sparseIntArray0.append(0x75, 86);
        sparseIntArray1.append(85, 6);
        sparseIntArray1.append(85, 7);
        sparseIntArray1.append(0, 27);
        sparseIntArray1.append(89, 13);
        sparseIntArray1.append(92, 16);
        sparseIntArray1.append(90, 14);
        sparseIntArray1.append(87, 11);
        sparseIntArray1.append(91, 15);
        sparseIntArray1.append(88, 12);
        sparseIntArray1.append(78, 40);
        sparseIntArray1.append(71, 39);
        sparseIntArray1.append(70, 41);
        sparseIntArray1.append(77, 42);
        sparseIntArray1.append(69, 20);
        sparseIntArray1.append(76, 37);
        sparseIntArray1.append(60, 5);
        sparseIntArray1.append(72, 87);
        sparseIntArray1.append(75, 87);
        sparseIntArray1.append(73, 87);
        sparseIntArray1.append(57, 87);
        sparseIntArray1.append(56, 87);
        sparseIntArray1.append(5, 24);
        sparseIntArray1.append(7, 28);
        sparseIntArray1.append(23, 0x1F);
        sparseIntArray1.append(24, 8);
        sparseIntArray1.append(6, 34);
        sparseIntArray1.append(8, 2);
        sparseIntArray1.append(3, 23);
        sparseIntArray1.append(4, 21);
        sparseIntArray1.append(0x4F, 0x5F);
        sparseIntArray1.append(0x40, 0x60);
        sparseIntArray1.append(2, 22);
        sparseIntArray1.append(13, 43);
        sparseIntArray1.append(26, 44);
        sparseIntArray1.append(21, 45);
        sparseIntArray1.append(22, 46);
        sparseIntArray1.append(20, 60);
        sparseIntArray1.append(18, 0x2F);
        sparseIntArray1.append(19, 0x30);
        sparseIntArray1.append(14, 49);
        sparseIntArray1.append(15, 50);
        sparseIntArray1.append(16, 51);
        sparseIntArray1.append(17, 52);
        sparseIntArray1.append(25, 53);
        sparseIntArray1.append(80, 54);
        sparseIntArray1.append(65, 55);
        sparseIntArray1.append(81, 56);
        sparseIntArray1.append(66, 57);
        sparseIntArray1.append(82, 58);
        sparseIntArray1.append(67, 59);
        sparseIntArray1.append(59, 62);
        sparseIntArray1.append(58, 0x3F);
        sparseIntArray1.append(28, 0x40);
        sparseIntArray1.append(105, 65);
        sparseIntArray1.append(34, 66);
        sparseIntArray1.append(106, 67);
        sparseIntArray1.append(0x60, 0x4F);
        sparseIntArray1.append(1, 38);
        sparseIntArray1.append(97, 98);
        sparseIntArray1.append(0x5F, 68);
        sparseIntArray1.append(83, 69);
        sparseIntArray1.append(68, 70);
        sparseIntArray1.append(0x20, 71);
        sparseIntArray1.append(30, 72);
        sparseIntArray1.append(0x1F, 73);
        sparseIntArray1.append(33, 74);
        sparseIntArray1.append(29, 75);
        sparseIntArray1.append(98, 76);
        sparseIntArray1.append(74, 77);
        sparseIntArray1.append(107, 78);
        sparseIntArray1.append(55, 80);
        sparseIntArray1.append(54, 81);
        sparseIntArray1.append(100, 82);
        sparseIntArray1.append(104, 83);
        sparseIntArray1.append(103, 84);
        sparseIntArray1.append(102, 85);
        sparseIntArray1.append(101, 86);
        sparseIntArray1.append(94, 97);
    }

    public jtc() {
        this.d = new HashMap();
        this.e = new HashMap();
    }

    public static int a(TypedArray typedArray0, int v, int v1) {
        int v2 = typedArray0.getResourceId(v, v1);
        return v2 == -1 ? typedArray0.getInt(v, -1) : v2;
    }

    public final jsx b(int v) {
        HashMap hashMap0 = this.e;
        Integer integer0 = v;
        if(!hashMap0.containsKey(integer0)) {
            hashMap0.put(integer0, new jsx());
        }
        return (jsx)hashMap0.get(integer0);
    }

    public final void c(ConstraintLayout constraintLayout0) {
        this.t(constraintLayout0);
        constraintLayout0.f = null;
        constraintLayout0.requestLayout();
    }

    public final void d(int v, int v1) {
        HashMap hashMap0 = this.e;
        Integer integer0 = v;
        if(hashMap0.containsKey(integer0)) {
            jsx jsx0 = (jsx)hashMap0.get(integer0);
            if(jsx0 != null) {
                switch(v1) {
                    case 3: {
                        jsx0.d.o = -1;
                        jsx0.d.n = -1;
                        jsx0.d.J = 0;
                        jsx0.d.P = 0x80000000;
                        return;
                    }
                    case 4: {
                        jsx0.d.p = -1;
                        jsx0.d.q = -1;
                        jsx0.d.K = 0;
                        jsx0.d.R = 0x80000000;
                        return;
                    }
                    case 5: {
                        jsx0.d.r = -1;
                        jsx0.d.s = -1;
                        jsx0.d.t = -1;
                        jsx0.d.N = 0;
                        jsx0.d.U = 0x80000000;
                        return;
                    }
                    default: {
                        jsy jsy0 = jsx0.d;
                        if(v1 != 6) {
                            jsy0.w = -1;
                            jsy0.x = -1;
                            jsy0.L = 0;
                            jsy0.S = 0x80000000;
                            return;
                        }
                        jsy0.u = -1;
                        jsy0.v = -1;
                        jsy0.M = 0;
                        jsy0.T = 0x80000000;
                    }
                }
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout0) {
        HashMap hashMap4;
        Integer integer1;
        HashMap hashMap1;
        int v3;
        jtc jtc0 = this;
        int v = constraintLayout0.getChildCount();
        HashMap hashMap0 = jtc0.e;
        hashMap0.clear();
        int v1 = 0;
        while(v1 < v) {
            View view0 = constraintLayout0.getChildAt(v1);
            jsr jsr0 = (jsr)view0.getLayoutParams();
            int v2 = view0.getId();
            if(v2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer integer0 = v2;
            if(!hashMap0.containsKey(integer0)) {
                hashMap0.put(integer0, new jsx());
            }
            jsx jsx0 = (jsx)hashMap0.get(integer0);
            if(jsx0 == null) {
                v3 = v;
                hashMap1 = hashMap0;
            }
            else {
                HashMap hashMap2 = jtc0.d;
                HashMap hashMap3 = new HashMap();
                Class class0 = view0.getClass();
                for(Object object0: hashMap2.keySet()) {
                    String s = (String)object0;
                    jso jso0 = (jso)hashMap2.get(s);
                    try {
                        if(s.equals("BackgroundColor")) {
                            integer1 = ((ColorDrawable)view0.getBackground()).getColor();
                            hashMap4 = hashMap0;
                            goto label_39;
                        }
                        else {
                            goto label_41;
                        }
                        goto label_52;
                    }
                    catch(NoSuchMethodException noSuchMethodException0) {
                        hashMap4 = hashMap0;
                        Log.e("TransitionLayout", class0.getName() + " must have a method " + s, noSuchMethodException0);
                        goto label_52;
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        hashMap4 = hashMap0;
                        Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName(), illegalAccessException0);
                        goto label_52;
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                        hashMap4 = hashMap0;
                        goto label_51;
                    }
                    try {
                    label_39:
                        hashMap3.put(s, new jso(jso0, integer1));
                        goto label_52;
                    label_41:
                        hashMap4 = hashMap0;
                        hashMap3.put(s, new jso(jso0, class0.getMethod("getMap" + s, null).invoke(view0, null)));
                        goto label_52;
                    }
                    catch(NoSuchMethodException noSuchMethodException0) {
                        Log.e("TransitionLayout", class0.getName() + " must have a method " + s, noSuchMethodException0);
                        goto label_52;
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName(), illegalAccessException0);
                        goto label_52;
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                    }
                label_51:
                    Log.e("TransitionLayout", " Custom Attribute \"" + s + "\" not found on " + class0.getName(), invocationTargetException0);
                label_52:
                    v = v;
                    hashMap0 = hashMap4;
                }
                v3 = v;
                hashMap1 = hashMap0;
                jsx0.f = hashMap3;
                jsx0.a = v2;
                jsy jsy0 = jsx0.d;
                jsy0.j = jsr0.e;
                jsy0.k = jsr0.f;
                jsy0.l = jsr0.g;
                jsy0.m = jsr0.h;
                jsy0.n = jsr0.i;
                jsy0.o = jsr0.j;
                jsy0.p = jsr0.k;
                jsy0.q = jsr0.l;
                jsy0.r = jsr0.m;
                jsy0.s = jsr0.n;
                jsy0.t = jsr0.o;
                jsy0.u = jsr0.s;
                jsy0.v = jsr0.t;
                jsy0.w = jsr0.u;
                jsy0.x = jsr0.v;
                jsy0.y = jsr0.G;
                jsy0.z = jsr0.H;
                jsy0.A = jsr0.I;
                jsy0.B = jsr0.p;
                jsy0.C = jsr0.q;
                jsy0.D = jsr0.r;
                jsy0.E = jsr0.X;
                jsy0.F = jsr0.Y;
                jsy0.G = jsr0.Z;
                jsy0.h = jsr0.c;
                jsy0.f = jsr0.a;
                jsy0.g = jsr0.b;
                jsy0.d = jsr0.width;
                jsy0.e = jsr0.height;
                jsy0.H = jsr0.leftMargin;
                jsy0.I = jsr0.rightMargin;
                jsy0.J = jsr0.topMargin;
                jsy0.K = jsr0.bottomMargin;
                jsy0.N = jsr0.D;
                jsy0.V = jsr0.M;
                jsy0.W = jsr0.L;
                jsy0.Y = jsr0.O;
                jsy0.X = jsr0.N;
                jsy0.an = jsr0.aa;
                jsy0.ao = jsr0.ab;
                jsy0.Z = jsr0.P;
                jsy0.aa = jsr0.Q;
                jsy0.ab = jsr0.T;
                jsy0.ac = jsr0.U;
                jsy0.ad = jsr0.R;
                jsy0.ae = jsr0.S;
                jsy0.af = jsr0.V;
                jsy0.ag = jsr0.W;
                jsy0.am = jsr0.ac;
                jsy0.P = jsr0.x;
                jsy0.R = jsr0.z;
                jsy0.O = jsr0.w;
                jsy0.Q = jsr0.y;
                jsy0.T = jsr0.A;
                jsy0.S = jsr0.B;
                jsy0.U = jsr0.C;
                jsy0.aq = jsr0.ad;
                jsy0.L = jsr0.getMarginEnd();
                jsy0.M = jsr0.getMarginStart();
                jsx0.b.b = view0.getVisibility();
                jsx0.b.d = view0.getAlpha();
                jtb jtb0 = jsx0.e;
                jtb0.c = view0.getRotation();
                jtb0.d = view0.getRotationX();
                jtb0.e = view0.getRotationY();
                jtb0.f = view0.getScaleX();
                jtb0.g = view0.getScaleY();
                float f = view0.getPivotX();
                float f1 = view0.getPivotY();
                if((((double)f) != 0.0) || ((double)f1) != 0.0) {
                    jtb0.h = f;
                    jtb0.i = f1;
                }
                jtb0.k = view0.getTranslationX();
                jtb0.l = view0.getTranslationY();
                jtb0.m = view0.getTranslationZ();
                if(jtb0.n) {
                    jtb0.o = view0.getElevation();
                }
                if((view0 instanceof Barrier)) {
                    jsy0.ap = ((Barrier)view0).b.b;
                    jsy0.ak = Arrays.copyOf(((Barrier)view0).c, ((Barrier)view0).d);
                    jsy0.ah = ((Barrier)view0).a;
                    jsy0.ai = ((Barrier)view0).b.c;
                }
            }
            ++v1;
            jtc0 = this;
            v = v3;
            hashMap0 = hashMap1;
            continue;
        }
    }

    public final void f(jtc jtc0) {
        HashMap hashMap0 = this.e;
        hashMap0.clear();
        HashMap hashMap1 = jtc0.e;
        for(Object object0: hashMap1.keySet()) {
            Integer integer0 = (Integer)object0;
            jsx jsx0 = (jsx)hashMap1.get(integer0);
            if(jsx0 != null) {
                hashMap0.put(integer0, jsx0.a());
            }
        }
    }

    public final void g(Context context0, int v) {
        this.e(((ConstraintLayout)LayoutInflater.from(context0).inflate(v, null)));
    }

    public final void h(int v, int v1, int v2, int v3) {
        HashMap hashMap0 = this.e;
        Integer integer0 = v;
        if(!hashMap0.containsKey(integer0)) {
            hashMap0.put(integer0, new jsx());
        }
        jsx jsx0 = (jsx)hashMap0.get(integer0);
        if(jsx0 == null) {
            return;
        }
        switch(v1) {
            case 1: {
                if(v3 == 1) {
                    jsx0.d.j = v2;
                    jsx0.d.k = -1;
                    return;
                }
                if(v3 != 2) {
                    throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"left to ")));
                }
                jsx0.d.k = v2;
                jsx0.d.j = -1;
                return;
            }
            case 2: {
                if(v3 == 1) {
                    jsx0.d.l = v2;
                    jsx0.d.m = -1;
                    return;
                }
                if(v3 != 2) {
                    throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                }
                jsx0.d.m = v2;
                jsx0.d.l = -1;
                return;
            }
            case 3: {
                if(v3 == 3) {
                    jsx0.d.n = v2;
                    jsx0.d.o = -1;
                    jsx0.d.r = -1;
                    jsx0.d.s = -1;
                    jsx0.d.t = -1;
                    return;
                }
                if(v3 != 4) {
                    throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                }
                jsx0.d.o = v2;
                jsx0.d.n = -1;
                jsx0.d.r = -1;
                jsx0.d.s = -1;
                jsx0.d.t = -1;
                return;
            }
            case 4: {
                if(v3 == 4) {
                    jsx0.d.q = v2;
                    jsx0.d.p = -1;
                    jsx0.d.r = -1;
                    jsx0.d.s = -1;
                    jsx0.d.t = -1;
                    return;
                }
                if(v3 != 3) {
                    throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                }
                jsx0.d.p = v2;
                jsx0.d.q = -1;
                jsx0.d.r = -1;
                jsx0.d.s = -1;
                jsx0.d.t = -1;
                return;
            }
            case 5: {
                switch(v3) {
                    case 3: {
                        jsx0.d.s = v2;
                        jsx0.d.q = -1;
                        jsx0.d.p = -1;
                        jsx0.d.n = -1;
                        jsx0.d.o = -1;
                        return;
                    }
                    case 4: {
                        jsx0.d.t = v2;
                        jsx0.d.q = -1;
                        jsx0.d.p = -1;
                        jsx0.d.n = -1;
                        jsx0.d.o = -1;
                        return;
                    }
                    case 5: {
                        jsx0.d.r = v2;
                        jsx0.d.q = -1;
                        jsx0.d.p = -1;
                        jsx0.d.n = -1;
                        jsx0.d.o = -1;
                        return;
                    }
                    default: {
                        throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                    }
                }
            }
            case 6: {
                if(v3 == 6) {
                    jsx0.d.v = v2;
                    jsx0.d.u = -1;
                    return;
                }
                if(v3 != 7) {
                    throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                }
                jsx0.d.u = v2;
                jsx0.d.v = -1;
                return;
            }
            default: {
                if(v3 == 7) {
                    jsx0.d.x = v2;
                    jsx0.d.w = -1;
                    return;
                }
                if(v3 != 6) {
                    throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                }
                jsx0.d.w = v2;
                jsx0.d.x = -1;
            }
        }
    }

    public final void i(int v, int v1, int v2, int v3, int v4) {
        jsy jsy1;
        jsy jsy0;
        HashMap hashMap0 = this.e;
        Integer integer0 = v;
        if(!hashMap0.containsKey(integer0)) {
            hashMap0.put(integer0, new jsx());
        }
        jsx jsx0 = (jsx)hashMap0.get(integer0);
        if(jsx0 == null) {
            return;
        }
        switch(v1) {
            case 1: {
                if(v3 == 1) {
                    jsx0.d.j = v2;
                    jsx0.d.k = -1;
                    jsx0.d.H = v4;
                    return;
                }
                if(v3 != 2) {
                    throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"Left to ")));
                }
                jsx0.d.k = v2;
                jsx0.d.j = -1;
                jsx0.d.H = v4;
                return;
            }
            case 2: {
                if(v3 == 1) {
                    jsx0.d.l = v2;
                    jsx0.d.m = -1;
                    jsx0.d.I = v4;
                    return;
                }
                if(v3 != 2) {
                    throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                }
                jsx0.d.m = v2;
                jsx0.d.l = -1;
                jsx0.d.I = v4;
                return;
            }
            case 3: {
                if(v3 == 3) {
                    jsy0 = jsx0.d;
                    jsy0.n = v2;
                    jsy0.o = -1;
                }
                else {
                    if(v3 != 4) {
                        throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                    }
                    jsy0 = jsx0.d;
                    jsy0.o = v2;
                    jsy0.n = -1;
                }
                jsy0.r = -1;
                jsy0.s = -1;
                jsy0.t = -1;
                jsx0.d.J = v4;
                return;
            }
            case 4: {
                if(v3 == 4) {
                    jsy1 = jsx0.d;
                    jsy1.q = v2;
                    jsy1.p = -1;
                }
                else {
                    if(v3 != 3) {
                        throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                    }
                    jsy1 = jsx0.d;
                    jsy1.p = v2;
                    jsy1.q = -1;
                }
                jsy1.r = -1;
                jsy1.s = -1;
                jsy1.t = -1;
                jsx0.d.K = v4;
                return;
            }
            case 5: {
                switch(v3) {
                    case 3: {
                        jsx0.d.s = v2;
                        jsx0.d.q = -1;
                        jsx0.d.p = -1;
                        jsx0.d.n = -1;
                        jsx0.d.o = -1;
                        return;
                    }
                    case 4: {
                        jsx0.d.t = v2;
                        jsx0.d.q = -1;
                        jsx0.d.p = -1;
                        jsx0.d.n = -1;
                        jsx0.d.o = -1;
                        return;
                    }
                    case 5: {
                        jsx0.d.r = v2;
                        jsx0.d.q = -1;
                        jsx0.d.p = -1;
                        jsx0.d.n = -1;
                        jsx0.d.o = -1;
                        return;
                    }
                    default: {
                        throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                    }
                }
            }
            case 6: {
                if(v3 == 6) {
                    jsx0.d.v = v2;
                    jsx0.d.u = -1;
                    jsx0.d.M = v4;
                    return;
                }
                if(v3 != 7) {
                    throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                }
                jsx0.d.u = v2;
                jsx0.d.v = -1;
                jsx0.d.M = v4;
                return;
            }
            default: {
                if(v3 == 7) {
                    jsx0.d.x = v2;
                    jsx0.d.w = -1;
                    jsx0.d.L = v4;
                    return;
                }
                if(v3 != 6) {
                    throw new IllegalArgumentException(jtc.y(((byte)v3), ((byte)"right to ")));
                }
                jsx0.d.w = v2;
                jsx0.d.x = -1;
                jsx0.d.L = v4;
            }
        }
    }

    public final void j(int v, int v1) {
        this.b(v).d.d = v1;
    }

    public final void k(Context context0, int v) {
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            for(int v1 = xmlResourceParser0.getEventType(); true; v1 = xmlResourceParser0.next()) {
                switch(v1) {
                    case 1: {
                        return;
                    }
                    case 2: {
                        String s = xmlResourceParser0.getName();
                        jsx jsx0 = jtc.w(context0, Xml.asAttributeSet(xmlResourceParser0), false);
                        if(s.equalsIgnoreCase("Guideline")) {
                            jsx0.d.b = true;
                        }
                        this.e.put(Integer.valueOf(jsx0.a), jsx0);
                    }
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
            Log.e("ConstraintSet", "Error parsing resource: " + v, xmlPullParserException0);
        }
        catch(IOException iOException0) {
            Log.e("ConstraintSet", "Error parsing resource: " + v, iOException0);
        }
    }

    public final void l(Context context0, XmlPullParser xmlPullParser0) {
        try {
            int v = xmlPullParser0.getEventType();
            jsx jsx0 = null;
        alab1:
            while(true) {
                switch(v) {
                    case 0: {
                        xmlPullParser0.getName();
                        goto label_347;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        switch(xmlPullParser0.getName()) {
                            case "Barrier": {
                                jsx0 = jtc.w(context0, Xml.asAttributeSet(xmlPullParser0), false);
                                jsx0.d.aj = 1;
                                goto label_347;
                            }
                            case "Constraint": {
                                jsx0 = jtc.w(context0, Xml.asAttributeSet(xmlPullParser0), false);
                                goto label_347;
                            }
                            case "ConstraintOverride": {
                                jsx0 = jtc.w(context0, Xml.asAttributeSet(xmlPullParser0), true);
                                goto label_347;
                            }
                            case "CustomAttribute": 
                            case "CustomMethod": {
                                if(jsx0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                HashMap hashMap0 = jsx0.f;
                                TypedArray typedArray4 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), jtg.d);
                                int v14 = typedArray4.getIndexCount();
                                int v16 = 0;
                                boolean z = false;
                                String s = null;
                                Boolean boolean0 = null;
                                for(int v15 = 0; v15 < v14; ++v15) {
                                    int v17 = typedArray4.getIndex(v15);
                                    if(v17 == 0) {
                                        s = typedArray4.getString(0);
                                        if(s != null && s.length() > 0) {
                                            s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
                                        }
                                    }
                                    else {
                                        switch(v17) {
                                            case 1: {
                                                boolean0 = Boolean.valueOf(typedArray4.getBoolean(1, false));
                                                v16 = 6;
                                                break;
                                            }
                                            case 2: {
                                                boolean0 = typedArray4.getColor(2, 0);
                                                v16 = 4;
                                                break;
                                            }
                                            case 3: {
                                                boolean0 = typedArray4.getColor(3, 0);
                                                v16 = 3;
                                                break;
                                            }
                                            case 4: {
                                                boolean0 = typedArray4.getDimension(4, 0.0f);
                                                v16 = 7;
                                                break;
                                            }
                                            case 5: {
                                                boolean0 = typedArray4.getFloat(5, NaNf);
                                                v16 = 2;
                                                break;
                                            }
                                            case 6: {
                                                boolean0 = typedArray4.getInteger(6, -1);
                                                v16 = 1;
                                                break;
                                            }
                                            case 7: {
                                                boolean0 = TypedValue.applyDimension(1, typedArray4.getDimension(7, 0.0f), context0.getResources().getDisplayMetrics());
                                                v16 = 7;
                                                break;
                                            }
                                            case 9: {
                                                boolean0 = typedArray4.getString(9);
                                                v16 = 5;
                                                break;
                                            }
                                            case 10: {
                                                s = typedArray4.getString(10);
                                                z = true;
                                                break;
                                            }
                                            default: {
                                                if(v17 == 8) {
                                                    int v18 = typedArray4.getResourceId(8, -1);
                                                    if(v18 == -1) {
                                                        v18 = typedArray4.getInt(8, -1);
                                                    }
                                                    boolean0 = v18;
                                                    v16 = 8;
                                                }
                                            }
                                        }
                                    }
                                }
                                if(s != null && boolean0 != null) {
                                    hashMap0.put(s, new jso(s, v16, boolean0, z));
                                }
                                typedArray4.recycle();
                                goto label_347;
                            }
                            case "Guideline": {
                                jsx0 = jtc.w(context0, Xml.asAttributeSet(xmlPullParser0), false);
                                jsx0.d.b = true;
                                jsx0.d.c = true;
                                goto label_347;
                            }
                            case "Layout": {
                                if(jsx0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                jsy jsy0 = jsx0.d;
                                TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), jtg.e);
                                jsy0.c = true;
                                int v2 = typedArray0.getIndexCount();
                                for(int v3 = 0; v3 < v2; ++v3) {
                                    int v4 = typedArray0.getIndex(v3);
                                    SparseIntArray sparseIntArray0 = jsy.a;
                                    switch(sparseIntArray0.get(v4)) {
                                        case 1: {
                                            jsy0.r = jtc.a(typedArray0, v4, jsy0.r);
                                            break;
                                        }
                                        case 2: {
                                            jsy0.K = typedArray0.getDimensionPixelSize(v4, jsy0.K);
                                            break;
                                        }
                                        case 3: {
                                            jsy0.q = jtc.a(typedArray0, v4, jsy0.q);
                                            break;
                                        }
                                        case 4: {
                                            jsy0.p = jtc.a(typedArray0, v4, jsy0.p);
                                            break;
                                        }
                                        case 5: {
                                            jsy0.A = typedArray0.getString(v4);
                                            break;
                                        }
                                        case 6: {
                                            jsy0.E = typedArray0.getDimensionPixelOffset(v4, jsy0.E);
                                            break;
                                        }
                                        case 7: {
                                            jsy0.F = typedArray0.getDimensionPixelOffset(v4, jsy0.F);
                                            break;
                                        }
                                        case 8: {
                                            jsy0.L = typedArray0.getDimensionPixelSize(v4, jsy0.L);
                                            break;
                                        }
                                        case 9: {
                                            jsy0.x = jtc.a(typedArray0, v4, jsy0.x);
                                            break;
                                        }
                                        case 10: {
                                            jsy0.w = jtc.a(typedArray0, v4, jsy0.w);
                                            break;
                                        }
                                        case 11: {
                                            jsy0.R = typedArray0.getDimensionPixelSize(v4, jsy0.R);
                                            break;
                                        }
                                        case 12: {
                                            jsy0.S = typedArray0.getDimensionPixelSize(v4, jsy0.S);
                                            break;
                                        }
                                        case 13: {
                                            jsy0.O = typedArray0.getDimensionPixelSize(v4, jsy0.O);
                                            break;
                                        }
                                        case 14: {
                                            jsy0.Q = typedArray0.getDimensionPixelSize(v4, jsy0.Q);
                                            break;
                                        }
                                        case 15: {
                                            jsy0.T = typedArray0.getDimensionPixelSize(v4, jsy0.T);
                                            break;
                                        }
                                        case 16: {
                                            jsy0.P = typedArray0.getDimensionPixelSize(v4, jsy0.P);
                                            break;
                                        }
                                        case 17: {
                                            jsy0.f = typedArray0.getDimensionPixelOffset(v4, jsy0.f);
                                            break;
                                        }
                                        case 18: {
                                            jsy0.g = typedArray0.getDimensionPixelOffset(v4, jsy0.g);
                                            break;
                                        }
                                        case 19: {
                                            jsy0.h = typedArray0.getFloat(v4, jsy0.h);
                                            break;
                                        }
                                        case 20: {
                                            jsy0.y = typedArray0.getFloat(v4, jsy0.y);
                                            break;
                                        }
                                        case 21: {
                                            jsy0.e = typedArray0.getLayoutDimension(v4, jsy0.e);
                                            break;
                                        }
                                        case 22: {
                                            jsy0.d = typedArray0.getLayoutDimension(v4, jsy0.d);
                                            break;
                                        }
                                        case 23: {
                                            jsy0.H = typedArray0.getDimensionPixelSize(v4, jsy0.H);
                                            break;
                                        }
                                        case 24: {
                                            jsy0.j = jtc.a(typedArray0, v4, jsy0.j);
                                            break;
                                        }
                                        case 25: {
                                            jsy0.k = jtc.a(typedArray0, v4, jsy0.k);
                                            break;
                                        }
                                        case 26: {
                                            jsy0.G = typedArray0.getInt(v4, jsy0.G);
                                            break;
                                        }
                                        case 27: {
                                            jsy0.I = typedArray0.getDimensionPixelSize(v4, jsy0.I);
                                            break;
                                        }
                                        case 28: {
                                            jsy0.l = jtc.a(typedArray0, v4, jsy0.l);
                                            break;
                                        }
                                        case 29: {
                                            jsy0.m = jtc.a(typedArray0, v4, jsy0.m);
                                            break;
                                        }
                                        case 30: {
                                            jsy0.M = typedArray0.getDimensionPixelSize(v4, jsy0.M);
                                            break;
                                        }
                                        case 0x1F: {
                                            jsy0.u = jtc.a(typedArray0, v4, jsy0.u);
                                            break;
                                        }
                                        case 0x20: {
                                            jsy0.v = jtc.a(typedArray0, v4, jsy0.v);
                                            break;
                                        }
                                        case 33: {
                                            jsy0.J = typedArray0.getDimensionPixelSize(v4, jsy0.J);
                                            break;
                                        }
                                        case 34: {
                                            jsy0.o = jtc.a(typedArray0, v4, jsy0.o);
                                            break;
                                        }
                                        case 35: {
                                            jsy0.n = jtc.a(typedArray0, v4, jsy0.n);
                                            break;
                                        }
                                        case 36: {
                                            jsy0.z = typedArray0.getFloat(v4, jsy0.z);
                                            break;
                                        }
                                        case 37: {
                                            jsy0.W = typedArray0.getFloat(v4, jsy0.W);
                                            break;
                                        }
                                        case 38: {
                                            jsy0.V = typedArray0.getFloat(v4, jsy0.V);
                                            break;
                                        }
                                        case 39: {
                                            jsy0.X = typedArray0.getInt(v4, jsy0.X);
                                            break;
                                        }
                                        case 40: {
                                            jsy0.Y = typedArray0.getInt(v4, jsy0.Y);
                                            break;
                                        }
                                        case 41: {
                                            jtc.m(jsy0, typedArray0, v4, 0);
                                            break;
                                        }
                                        case 42: {
                                            jtc.m(jsy0, typedArray0, v4, 1);
                                            break;
                                        }
                                        case 61: {
                                            jsy0.B = jtc.a(typedArray0, v4, jsy0.B);
                                            break;
                                        }
                                        case 62: {
                                            jsy0.C = typedArray0.getDimensionPixelSize(v4, jsy0.C);
                                            break;
                                        }
                                        case 0x3F: {
                                            jsy0.D = typedArray0.getFloat(v4, jsy0.D);
                                            break;
                                        }
                                        case 69: {
                                            jsy0.af = typedArray0.getFloat(v4, 1.0f);
                                            break;
                                        }
                                        case 70: {
                                            jsy0.ag = typedArray0.getFloat(v4, 1.0f);
                                            break;
                                        }
                                        case 71: {
                                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                            break;
                                        }
                                        case 72: {
                                            jsy0.ah = typedArray0.getInt(v4, jsy0.ah);
                                            break;
                                        }
                                        case 73: {
                                            jsy0.ai = typedArray0.getDimensionPixelSize(v4, jsy0.ai);
                                            break;
                                        }
                                        case 74: {
                                            jsy0.al = typedArray0.getString(v4);
                                            break;
                                        }
                                        case 75: {
                                            jsy0.ap = typedArray0.getBoolean(v4, jsy0.ap);
                                            break;
                                        }
                                        case 76: {
                                            jsy0.aq = typedArray0.getInt(v4, jsy0.aq);
                                            break;
                                        }
                                        case 77: {
                                            jsy0.s = jtc.a(typedArray0, v4, jsy0.s);
                                            break;
                                        }
                                        case 78: {
                                            jsy0.t = jtc.a(typedArray0, v4, jsy0.t);
                                            break;
                                        }
                                        case 0x4F: {
                                            jsy0.U = typedArray0.getDimensionPixelSize(v4, jsy0.U);
                                            break;
                                        }
                                        case 80: {
                                            jsy0.N = typedArray0.getDimensionPixelSize(v4, jsy0.N);
                                            break;
                                        }
                                        case 81: {
                                            jsy0.Z = typedArray0.getInt(v4, jsy0.Z);
                                            break;
                                        }
                                        case 82: {
                                            jsy0.aa = typedArray0.getInt(v4, jsy0.aa);
                                            break;
                                        }
                                        case 83: {
                                            jsy0.ac = typedArray0.getDimensionPixelSize(v4, jsy0.ac);
                                            break;
                                        }
                                        case 84: {
                                            jsy0.ab = typedArray0.getDimensionPixelSize(v4, jsy0.ab);
                                            break;
                                        }
                                        case 85: {
                                            jsy0.ae = typedArray0.getDimensionPixelSize(v4, jsy0.ae);
                                            break;
                                        }
                                        case 86: {
                                            jsy0.ad = typedArray0.getDimensionPixelSize(v4, jsy0.ad);
                                            break;
                                        }
                                        case 87: {
                                            jsy0.an = typedArray0.getBoolean(v4, jsy0.an);
                                            break;
                                        }
                                        case 88: {
                                            jsy0.ao = typedArray0.getBoolean(v4, jsy0.ao);
                                            break;
                                        }
                                        case 89: {
                                            jsy0.am = typedArray0.getString(v4);
                                            break;
                                        }
                                        case 90: {
                                            jsy0.i = typedArray0.getBoolean(v4, jsy0.i);
                                            break;
                                        }
                                        case 91: {
                                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v4) + "   " + sparseIntArray0.get(v4));
                                            break;
                                        }
                                        default: {
                                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v4) + "   " + sparseIntArray0.get(v4));
                                        }
                                    }
                                }
                                typedArray0.recycle();
                                goto label_347;
                            }
                            case "Motion": {
                                if(jsx0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                jsz jsz0 = jsx0.c;
                                TypedArray typedArray1 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), jtg.f);
                                jsz0.b = true;
                                int v5 = typedArray1.getIndexCount();
                                for(int v6 = 0; v6 < v5; ++v6) {
                                    int v7 = typedArray1.getIndex(v6);
                                    switch(jsz.a.get(v7)) {
                                        case 1: {
                                            jsz0.j = typedArray1.getFloat(v7, jsz0.j);
                                            break;
                                        }
                                        case 2: {
                                            jsz0.f = typedArray1.getInt(v7, jsz0.f);
                                            break;
                                        }
                                        case 3: {
                                            jsz0.e = typedArray1.peekValue(v7).type == 3 ? typedArray1.getString(v7) : jrj.a[typedArray1.getInteger(v7, 0)];
                                            break;
                                        }
                                        case 4: {
                                            jsz0.g = typedArray1.getInt(v7, 0);
                                            break;
                                        }
                                        case 5: {
                                            jsz0.c = jtc.a(typedArray1, v7, jsz0.c);
                                            break;
                                        }
                                        case 6: {
                                            jsz0.d = typedArray1.getInteger(v7, jsz0.d);
                                            break;
                                        }
                                        case 7: {
                                            jsz0.h = typedArray1.getFloat(v7, jsz0.h);
                                            break;
                                        }
                                        case 8: {
                                            jsz0.l = typedArray1.getInteger(v7, jsz0.l);
                                            break;
                                        }
                                        case 9: {
                                            jsz0.k = typedArray1.getFloat(v7, jsz0.k);
                                            break;
                                        }
                                        case 10: {
                                            switch(typedArray1.peekValue(v7).type) {
                                                case 1: {
                                                    jsz0.n = typedArray1.getResourceId(v7, -1);
                                                    break;
                                                }
                                                case 3: {
                                                    jsz0.m = typedArray1.getString(v7);
                                                    if(jsz0.m.indexOf("/") > 0) {
                                                        jsz0.n = typedArray1.getResourceId(v7, -1);
                                                    }
                                                    break;
                                                }
                                                default: {
                                                    typedArray1.getInteger(v7, jsz0.n);
                                                }
                                            }
                                        }
                                    }
                                }
                                typedArray1.recycle();
                                goto label_347;
                            }
                            case "PropertySet": {
                                if(jsx0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                jta jta0 = jsx0.b;
                                TypedArray typedArray2 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), jtg.g);
                                jta0.a = true;
                                int v8 = typedArray2.getIndexCount();
                                for(int v9 = 0; v9 < v8; ++v9) {
                                    int v10 = typedArray2.getIndex(v9);
                                    if(v10 == 1) {
                                        jta0.d = typedArray2.getFloat(1, jta0.d);
                                    }
                                    else if(v10 == 0) {
                                        int v11 = typedArray2.getInt(0, jta0.b);
                                        jta0.b = v11;
                                        jta0.b = jtc.a[v11];
                                    }
                                    else {
                                        switch(v10) {
                                            case 3: {
                                                jta0.e = typedArray2.getFloat(3, jta0.e);
                                                break;
                                            }
                                            case 4: {
                                                jta0.c = typedArray2.getInt(4, jta0.c);
                                            }
                                        }
                                    }
                                }
                                typedArray2.recycle();
                                goto label_347;
                            }
                            case "Transform": {
                                if(jsx0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                jtb jtb0 = jsx0.e;
                                TypedArray typedArray3 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), jtg.i);
                                jtb0.b = true;
                                int v12 = typedArray3.getIndexCount();
                                for(int v1 = 0; v1 < v12; ++v1) {
                                    int v13 = typedArray3.getIndex(v1);
                                    switch(jtb.a.get(v13)) {
                                        case 1: {
                                            jtb0.c = typedArray3.getFloat(v13, jtb0.c);
                                            break;
                                        }
                                        case 2: {
                                            jtb0.d = typedArray3.getFloat(v13, jtb0.d);
                                            break;
                                        }
                                        case 3: {
                                            jtb0.e = typedArray3.getFloat(v13, jtb0.e);
                                            break;
                                        }
                                        case 4: {
                                            jtb0.f = typedArray3.getFloat(v13, jtb0.f);
                                            break;
                                        }
                                        case 5: {
                                            jtb0.g = typedArray3.getFloat(v13, jtb0.g);
                                            break;
                                        }
                                        case 6: {
                                            jtb0.h = typedArray3.getDimension(v13, jtb0.h);
                                            break;
                                        }
                                        case 7: {
                                            jtb0.i = typedArray3.getDimension(v13, jtb0.i);
                                            break;
                                        }
                                        case 8: {
                                            jtb0.k = typedArray3.getDimension(v13, jtb0.k);
                                            break;
                                        }
                                        case 9: {
                                            jtb0.l = typedArray3.getDimension(v13, jtb0.l);
                                            break;
                                        }
                                        case 10: {
                                            jtb0.m = typedArray3.getDimension(v13, jtb0.m);
                                            break;
                                        }
                                        case 11: {
                                            jtb0.n = true;
                                            jtb0.o = typedArray3.getDimension(v13, jtb0.o);
                                            break;
                                        }
                                        case 12: {
                                            jtb0.j = jtc.a(typedArray3, v13, jtb0.j);
                                        }
                                    }
                                }
                                typedArray3.recycle();
                                goto label_347;
                            }
                            default: {
                                goto label_347;
                            }
                        }
                    }
                    case 3: {
                        String s1 = xmlPullParser0.getName().toLowerCase(Locale.ROOT);
                        break;
                    }
                    default: {
                        goto label_347;
                    }
                }
                switch(s1) {
                    case "constraint": 
                    case "constraintoverride": 
                    case "guideline": {
                        this.e.put(Integer.valueOf(jsx0.a), jsx0);
                        jsx0 = null;
                    label_347:
                        v = xmlPullParser0.next();
                        break;
                    }
                    case "constraintset": {
                        break alab1;
                    }
                    default: {
                        goto label_347;
                    }
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
            Log.e("ConstraintSet", "Error parsing XML resource", xmlPullParserException0);
        }
        catch(IOException iOException0) {
            Log.e("ConstraintSet", "Error parsing XML resource", iOException0);
        }
    }

    static void m(Object object0, TypedArray typedArray0, int v, int v1) {
        boolean z = true;
        int v2 = 0;
        switch(typedArray0.peekValue(v).type) {
            case 3: {
                String s = typedArray0.getString(v);
                if(s != null) {
                    int v4 = s.indexOf(61);
                    if(v4 > 0 && v4 < s.length() - 1) {
                        String s1 = s.substring(0, v4);
                        String s2 = s.substring(v4 + 1);
                        if(s2.length() > 0) {
                            String s3 = s1.trim();
                            String s4 = s2.trim();
                            if("ratio".equalsIgnoreCase(s3)) {
                                if((object0 instanceof jsr)) {
                                    if(v1 == 0) {
                                        ((jsr)object0).width = 0;
                                    }
                                    else {
                                        ((jsr)object0).height = 0;
                                    }
                                    jtc.n(((jsr)object0), s4);
                                    return;
                                }
                                if((object0 instanceof jsy)) {
                                    ((jsy)object0).A = s4;
                                    return;
                                }
                                if((object0 instanceof jsw)) {
                                    ((jsw)object0).c(5, s4);
                                    return;
                                }
                            }
                            else if("weight".equalsIgnoreCase(s3)) {
                                try {
                                    float f = Float.parseFloat(s4);
                                    if((object0 instanceof jsr)) {
                                        if(v1 == 0) {
                                            ((jsr)object0).width = 0;
                                            ((jsr)object0).L = f;
                                            return;
                                        }
                                        ((jsr)object0).height = 0;
                                        ((jsr)object0).M = f;
                                        return;
                                    }
                                    if((object0 instanceof jsy)) {
                                        if(v1 == 0) {
                                            ((jsy)object0).d = 0;
                                            ((jsy)object0).W = f;
                                            return;
                                        }
                                        ((jsy)object0).e = 0;
                                        ((jsy)object0).V = f;
                                        return;
                                    }
                                    if((object0 instanceof jsw)) {
                                        if(v1 == 0) {
                                            ((jsw)object0).b(23, 0);
                                            ((jsw)object0).a(39, f);
                                            return;
                                        }
                                        ((jsw)object0).b(21, 0);
                                        ((jsw)object0).a(40, f);
                                        return;
                                    }
                                }
                                catch(NumberFormatException unused_ex) {
                                }
                            }
                            else if("parent".equalsIgnoreCase(s3)) {
                                try {
                                    float f1 = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(s4)));
                                    if((object0 instanceof jsr)) {
                                        if(v1 == 0) {
                                            ((jsr)object0).width = 0;
                                            ((jsr)object0).V = f1;
                                            ((jsr)object0).P = 2;
                                            return;
                                        }
                                        ((jsr)object0).height = 0;
                                        ((jsr)object0).W = f1;
                                        ((jsr)object0).Q = 2;
                                        return;
                                    }
                                    if((object0 instanceof jsy)) {
                                        if(v1 == 0) {
                                            ((jsy)object0).d = 0;
                                            ((jsy)object0).af = f1;
                                            ((jsy)object0).Z = 2;
                                            return;
                                        }
                                        ((jsy)object0).e = 0;
                                        ((jsy)object0).ag = f1;
                                        ((jsy)object0).aa = 2;
                                        return;
                                    }
                                    if((object0 instanceof jsw)) {
                                        if(v1 == 0) {
                                            ((jsw)object0).b(23, 0);
                                            ((jsw)object0).b(54, 2);
                                            return;
                                        }
                                        ((jsw)object0).b(21, 0);
                                        ((jsw)object0).b(55, 2);
                                        return;
                                    }
                                }
                                catch(NumberFormatException unused_ex) {
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 5: {
                z = false;
                v2 = typedArray0.getDimensionPixelSize(v, 0);
            label_94:
                if((object0 instanceof jsr)) {
                    if(v1 == 0) {
                        ((jsr)object0).width = v2;
                        ((jsr)object0).aa = z;
                        return;
                    }
                    ((jsr)object0).height = v2;
                    ((jsr)object0).ab = z;
                    return;
                }
                if((object0 instanceof jsy)) {
                    if(v1 == 0) {
                        ((jsy)object0).d = v2;
                        ((jsy)object0).an = z;
                        return;
                    }
                    ((jsy)object0).e = v2;
                    ((jsy)object0).ao = z;
                    return;
                }
                if((object0 instanceof jsw)) {
                    if(v1 == 0) {
                        ((jsw)object0).b(23, v2);
                        ((jsw)object0).d(80, z);
                        return;
                    }
                    ((jsw)object0).b(21, v2);
                    ((jsw)object0).d(81, z);
                    return;
                }
                break;
            }
            default: {
                int v3 = typedArray0.getInt(v, 0);
                if(v3 == -4) {
                    v2 = -2;
                }
                else if(v3 != -2 && v3 != -1) {
                    z = false;
                }
                else {
                    z = false;
                    v2 = v3;
                }
                goto label_94;
            }
        }
        try {
        }
        catch(NumberFormatException unused_ex) {
        }
    }

    static void n(jsr jsr0, String s) {
        int v5;
        int v = -1;
        float f = NaNf;
        if(s != null) {
            int v1 = s.indexOf(44);
            int v2 = s.length();
            int v3 = 0;
            if(v1 > 0 && v1 < v2 - 1) {
                String s1 = s.substring(0, v1);
                if(!s1.equalsIgnoreCase("W")) {
                    v3 = s1.equalsIgnoreCase("H") ? 1 : -1;
                }
                int v4 = v3;
                v3 = v1 + 1;
                v5 = v4;
            }
            else {
                v5 = -1;
            }
            int v6 = s.indexOf(58);
            if(v6 >= 0 && v6 < v2 - 1) {
                String s2 = s.substring(v3, v6);
                String s3 = s.substring(v6 + 1);
                if(s2.length() > 0 && s3.length() > 0) {
                    try {
                        float f1 = Float.parseFloat(s2);
                        float f2 = Float.parseFloat(s3);
                        if((f1 > 0.0f) && (f2 > 0.0f)) {
                            if(v5 == 1) {
                                f = Math.abs(f2 / f1);
                            }
                            else {
                                f = Math.abs(f1 / f2);
                                v = v5;
                                goto label_32;
                            label_28:
                                String s4 = s.substring(v3);
                                if(s4.length() > 0) {
                                    f = Float.parseFloat(s4);
                                }
                            }
                        }
                        v = v5;
                        goto label_32;
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
            }
            else {
                goto label_28;
            }
            v = v5;
        }
    label_32:
        jsr0.I = s;
        jsr0.J = f;
        jsr0.K = v;
    }

    public final void o(int v, String s) {
        this.b(v).d.A = s;
    }

    public final void p(int v, float f) {
        this.b(v).d.y = f;
    }

    public final void q(int v, int v1) {
        this.b(v).d.X = v1;
    }

    public final void r(int v, int v1, int v2) {
        jsx jsx0 = this.b(v);
        if(v1 != 3) {
            jsx0.d.K = v2;
            return;
        }
        jsx0.d.J = v2;
    }

    public final void s(int v, int v1) {
        this.b(v).b.b = v1;
    }

    public final void t(ConstraintLayout constraintLayout0) {
        int v5;
        HashMap hashMap4;
        HashSet hashSet2;
        Method method0;
        int v4;
        String s3;
        HashMap hashMap3;
        String s;
        int v = constraintLayout0.getChildCount();
        HashMap hashMap0 = this.e;
        HashSet hashSet0 = new HashSet(hashMap0.keySet());
        int v1 = 0;
        while(v1 < v) {
            View view0 = constraintLayout0.getChildAt(v1);
            int v2 = view0.getId();
            Integer integer0 = v2;
            if(!hashMap0.containsKey(integer0)) {
                try {
                    s = "UNKNOWN";
                    s = view0.getContext().getResources().getResourceEntryName(view0.getId());
                }
                catch(Exception unused_ex) {
                }
                Log.w("ConstraintSet", "id unknown " + s);
                goto label_139;
            }
            if(v2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap hashMap1 = this.e;
            if(hashMap1.containsKey(integer0)) {
                hashSet0.remove(integer0);
                jsx jsx0 = (jsx)hashMap1.get(integer0);
                if(jsx0 == null) {
                    goto label_139;
                }
                else {
                    if((view0 instanceof Barrier)) {
                        jsy jsy0 = jsx0.d;
                        jsy0.aj = 1;
                        ((Barrier)view0).setId(v2);
                        ((Barrier)view0).a = jsy0.ah;
                        ((Barrier)view0).b(jsy0.ai);
                        ((Barrier)view0).b.b = jsy0.ap;
                        int[] arr_v = jsy0.ak;
                        if(arr_v == null) {
                            String s1 = jsy0.al;
                            if(s1 != null) {
                                jsy0.ak = jtc.v(((Barrier)view0), s1);
                                ((Barrier)view0).k(jsy0.ak);
                            }
                        }
                        else {
                            ((Barrier)view0).k(arr_v);
                        }
                    }
                    jsr jsr0 = (jsr)view0.getLayoutParams();
                    jsr0.a();
                    jsx0.b(jsr0);
                    HashMap hashMap2 = jsx0.f;
                    Class class0 = view0.getClass();
                    for(Object object0: hashMap2.keySet()) {
                        String s2 = (String)object0;
                        jso jso0 = (jso)hashMap2.get(s2);
                        HashSet hashSet1 = hashSet0;
                        if(jso0.a) {
                            hashMap3 = hashMap0;
                            s3 = s2;
                        }
                        else {
                            hashMap3 = hashMap0;
                            s3 = "set" + s2;
                        }
                        try {
                            int v3 = jso0.h - 1;
                            if(jso0.h != 0) {
                                switch(v3) {
                                    case 0: {
                                        goto label_55;
                                    }
                                    case 1: {
                                        goto label_58;
                                    }
                                    case 2: {
                                        goto label_61;
                                    }
                                    case 3: {
                                        goto label_64;
                                    }
                                    case 4: {
                                        goto label_70;
                                    }
                                    case 5: {
                                        goto label_72;
                                    }
                                    case 6: {
                                        goto label_74;
                                    }
                                    case 7: {
                                        goto label_76;
                                    }
                                }
                            }
                            v4 = v1;
                            throw null;
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            v4 = v1;
                            Log.e("TransitionLayout", class0.getName() + " must have a method " + s3, noSuchMethodException0);
                            goto label_99;
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            v4 = v1;
                            Log.e("TransitionLayout", " Custom Attribute \"" + s2 + "\" not found on " + class0.getName(), illegalAccessException0);
                            goto label_99;
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            v4 = v1;
                            goto label_98;
                        }
                        hashSet0 = hashSet1;
                        hashMap0 = hashMap3;
                        continue;
                        try {
                        label_55:
                            v4 = v1;
                            class0.getMethod(s3, Integer.TYPE).invoke(view0, ((int)jso0.c));
                            goto label_99;
                        label_58:
                            v4 = v1;
                            class0.getMethod(s3, Float.TYPE).invoke(view0, ((float)jso0.d));
                            goto label_99;
                        label_61:
                            v4 = v1;
                            class0.getMethod(s3, Integer.TYPE).invoke(view0, ((int)jso0.g));
                            goto label_99;
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            Log.e("TransitionLayout", class0.getName() + " must have a method " + s3, noSuchMethodException0);
                            goto label_99;
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            Log.e("TransitionLayout", " Custom Attribute \"" + s2 + "\" not found on " + class0.getName(), illegalAccessException0);
                            goto label_99;
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            goto label_98;
                        }
                        try {
                        label_64:
                            method0 = class0.getMethod(s3, Drawable.class);
                            v4 = v1;
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            v4 = v1;
                            Log.e("TransitionLayout", class0.getName() + " must have a method " + s3, noSuchMethodException0);
                            goto label_99;
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            v4 = v1;
                            Log.e("TransitionLayout", " Custom Attribute \"" + s2 + "\" not found on " + class0.getName(), illegalAccessException0);
                            goto label_99;
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            v4 = v1;
                            goto label_98;
                        }
                        try {
                            ColorDrawable colorDrawable0 = new ColorDrawable();
                            colorDrawable0.setColor(jso0.g);
                            method0.invoke(view0, colorDrawable0);
                            goto label_99;
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            Log.e("TransitionLayout", class0.getName() + " must have a method " + s3, noSuchMethodException0);
                            goto label_99;
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            Log.e("TransitionLayout", " Custom Attribute \"" + s2 + "\" not found on " + class0.getName(), illegalAccessException0);
                            goto label_99;
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            goto label_98;
                        }
                        try {
                        label_70:
                            class0.getMethod(s3, CharSequence.class).invoke(view0, jso0.e);
                            hashSet0 = hashSet1;
                            hashMap0 = hashMap3;
                            continue;
                        label_72:
                            class0.getMethod(s3, Boolean.TYPE).invoke(view0, Boolean.valueOf(jso0.f));
                            hashSet0 = hashSet1;
                            hashMap0 = hashMap3;
                            continue;
                        label_74:
                            class0.getMethod(s3, Float.TYPE).invoke(view0, ((float)jso0.d));
                            hashSet0 = hashSet1;
                            hashMap0 = hashMap3;
                            continue;
                        label_76:
                            class0.getMethod(s3, Integer.TYPE).invoke(view0, ((int)jso0.c));
                            hashSet0 = hashSet1;
                            hashMap0 = hashMap3;
                            continue;
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            v4 = v1;
                            Log.e("TransitionLayout", class0.getName() + " must have a method " + s3, noSuchMethodException0);
                            goto label_99;
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            v4 = v1;
                            Log.e("TransitionLayout", " Custom Attribute \"" + s2 + "\" not found on " + class0.getName(), illegalAccessException0);
                            goto label_99;
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            v4 = v1;
                            goto label_98;
                        }
                        try {
                            v4 = v1;
                            throw null;
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            Log.e("TransitionLayout", class0.getName() + " must have a method " + s3, noSuchMethodException0);
                            goto label_99;
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            Log.e("TransitionLayout", " Custom Attribute \"" + s2 + "\" not found on " + class0.getName(), illegalAccessException0);
                            goto label_99;
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                        }
                    label_98:
                        Log.e("TransitionLayout", " Custom Attribute \"" + s2 + "\" not found on " + class0.getName(), invocationTargetException0);
                    label_99:
                        hashSet0 = hashSet1;
                        hashMap0 = hashMap3;
                        v1 = v4;
                    }
                    hashSet2 = hashSet0;
                    hashMap4 = hashMap0;
                    v5 = v1;
                    view0.setLayoutParams(jsr0);
                    jta jta0 = jsx0.b;
                    if(jta0.c == 0) {
                        view0.setVisibility(jta0.b);
                    }
                    view0.setAlpha(jta0.d);
                    jtb jtb0 = jsx0.e;
                    view0.setRotation(jtb0.c);
                    view0.setRotationX(jtb0.d);
                    view0.setRotationY(jtb0.e);
                    view0.setScaleX(jtb0.f);
                    view0.setScaleY(jtb0.g);
                    if(jtb0.j == -1) {
                        if(!Float.isNaN(jtb0.h)) {
                            view0.setPivotX(jtb0.h);
                        }
                        if(!Float.isNaN(jtb0.i)) {
                            view0.setPivotY(jtb0.i);
                        }
                    }
                    else {
                        View view1 = ((View)view0.getParent()).findViewById(jtb0.j);
                        if(view1 != null) {
                            int v6 = view1.getTop() + view1.getBottom();
                            float f = (float)(view1.getLeft() + view1.getRight());
                            float f1 = (float)v6;
                            if(view0.getRight() - view0.getLeft() > 0 && view0.getBottom() - view0.getTop() > 0) {
                                float f2 = (float)view0.getLeft();
                                float f3 = (float)view0.getTop();
                                view0.setPivotX(f / 2.0f - f2);
                                view0.setPivotY(f1 / 2.0f - f3);
                            }
                        }
                    }
                    view0.setTranslationX(jtb0.k);
                    view0.setTranslationY(jtb0.l);
                    view0.setTranslationZ(jtb0.m);
                    if(jtb0.n) {
                        view0.setElevation(jtb0.o);
                    }
                }
            }
            else {
            label_139:
                hashSet2 = hashSet0;
                hashMap4 = hashMap0;
                v5 = v1;
            }
            v1 = v5 + 1;
            hashSet0 = hashSet2;
            hashMap0 = hashMap4;
            continue;
        }
        for(Object object1: hashSet0) {
            Integer integer1 = (Integer)object1;
            jsx jsx1 = (jsx)this.e.get(integer1);
            if(jsx1 != null) {
                jsy jsy1 = jsx1.d;
                if(jsy1.aj == 1) {
                    Barrier barrier0 = new Barrier(constraintLayout0.getContext());
                    barrier0.setId(integer1.intValue());
                    int[] arr_v1 = jsy1.ak;
                    if(arr_v1 == null) {
                        String s4 = jsy1.al;
                        if(s4 != null) {
                            jsy1.ak = jtc.v(barrier0, s4);
                            barrier0.k(jsy1.ak);
                        }
                    }
                    else {
                        barrier0.k(arr_v1);
                    }
                    barrier0.a = jsy1.ah;
                    barrier0.b(jsy1.ai);
                    jsr jsr1 = new jsr(-2);
                    barrier0.l();
                    jsx1.b(jsr1);
                    constraintLayout0.addView(barrier0, jsr1);
                }
                if(jsy1.b) {
                    Guideline guideline0 = new Guideline(constraintLayout0.getContext());
                    guideline0.setId(integer1.intValue());
                    jsr jsr2 = new jsr(-2);
                    jsx1.b(jsr2);
                    constraintLayout0.addView(guideline0, jsr2);
                }
            }
        }
        for(int v7 = 0; v7 < v; ++v7) {
            View view2 = constraintLayout0.getChildAt(v7);
            if((view2 instanceof jsp)) {
                ((jsp)view2).h(constraintLayout0);
            }
        }
    }

    public final jsx u() {
        Integer integer0 = (int)0x7F0B23B7;  // id:uiflow_summary_card_expanded_body
        return this.e.containsKey(integer0) ? ((jsx)this.e.get(integer0)) : null;
    }

    private static final int[] v(View view0, String s) {
        int v2;
        String[] arr_s = s.split(",");
        Context context0 = view0.getContext();
        int[] arr_v = new int[arr_s.length];
        int v = 0;
        int v1 = 0;
        while(v < arr_s.length) {
            String s1 = arr_s[v].trim();
            try {
                v2 = 0;
                v2 = jtf.class.getField(s1).getInt(null);
            }
            catch(Exception unused_ex) {
            }
            if(v2 == 0) {
                v2 = context0.getResources().getIdentifier(s1, "id", "com.google.android.gms");
            }
            if(v2 == 0) {
                if(view0.isInEditMode() && (view0.getParent() instanceof ConstraintLayout)) {
                    Object object0 = ((ConstraintLayout)view0.getParent()).f(s1);
                    if(object0 != null && (object0 instanceof Integer)) {
                        v2 = (int)(((Integer)object0));
                        goto label_18;
                    }
                }
                v2 = 0;
            }
        label_18:
            arr_v[v1] = v2;
            ++v;
            ++v1;
        }
        return v1 == arr_s.length ? arr_v : Arrays.copyOf(arr_v, v1);
    }

    private static final jsx w(Context context0, AttributeSet attributeSet0, boolean z) {
        int v3;
        jsx jsx0 = new jsx();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, (z ? jtg.c : jtg.a));
        int v = 0;
        if(z) {
            int v1 = typedArray0.getIndexCount();
            jsw jsw0 = new jsw();
            jsx0.g = jsw0;
            jsz jsz0 = jsx0.c;
            jsz0.b = false;
            jsy jsy0 = jsx0.d;
            jsy0.c = false;
            jta jta0 = jsx0.b;
            jta0.a = false;
            jtb jtb0 = jsx0.e;
            jtb0.b = false;
            while(v < v1) {
                int v2 = typedArray0.getIndex(v);
                switch(jtc.c.get(v2)) {
                    case 2: {
                        v3 = v1;
                        jsw0.b(2, typedArray0.getDimensionPixelSize(v2, jsy0.K));
                        break;
                    }
                    case 5: {
                        v3 = v1;
                        jsw0.c(5, typedArray0.getString(v2));
                        break;
                    }
                    case 6: {
                        v3 = v1;
                        jsw0.b(6, typedArray0.getDimensionPixelOffset(v2, jsy0.E));
                        break;
                    }
                    case 7: {
                        v3 = v1;
                        jsw0.b(7, typedArray0.getDimensionPixelOffset(v2, jsy0.F));
                        break;
                    }
                    case 8: {
                        v3 = v1;
                        jsw0.b(8, typedArray0.getDimensionPixelSize(v2, jsy0.L));
                        break;
                    }
                    case 11: {
                        v3 = v1;
                        jsw0.b(11, typedArray0.getDimensionPixelSize(v2, jsy0.R));
                        break;
                    }
                    case 12: {
                        v3 = v1;
                        jsw0.b(12, typedArray0.getDimensionPixelSize(v2, jsy0.S));
                        break;
                    }
                    case 13: {
                        v3 = v1;
                        jsw0.b(13, typedArray0.getDimensionPixelSize(v2, jsy0.O));
                        break;
                    }
                    case 14: {
                        v3 = v1;
                        jsw0.b(14, typedArray0.getDimensionPixelSize(v2, jsy0.Q));
                        break;
                    }
                    case 15: {
                        v3 = v1;
                        jsw0.b(15, typedArray0.getDimensionPixelSize(v2, jsy0.T));
                        break;
                    }
                    case 16: {
                        v3 = v1;
                        jsw0.b(16, typedArray0.getDimensionPixelSize(v2, jsy0.P));
                        break;
                    }
                    case 17: {
                        v3 = v1;
                        jsw0.b(17, typedArray0.getDimensionPixelOffset(v2, jsy0.f));
                        break;
                    }
                    case 18: {
                        v3 = v1;
                        jsw0.b(18, typedArray0.getDimensionPixelOffset(v2, jsy0.g));
                        break;
                    }
                    case 19: {
                        v3 = v1;
                        jsw0.a(19, typedArray0.getFloat(v2, jsy0.h));
                        break;
                    }
                    case 20: {
                        v3 = v1;
                        jsw0.a(20, typedArray0.getFloat(v2, jsy0.y));
                        break;
                    }
                    case 21: {
                        v3 = v1;
                        jsw0.b(21, typedArray0.getLayoutDimension(v2, jsy0.e));
                        break;
                    }
                    case 22: {
                        v3 = v1;
                        jsw0.b(22, jtc.a[typedArray0.getInt(v2, jta0.b)]);
                        break;
                    }
                    case 23: {
                        v3 = v1;
                        jsw0.b(23, typedArray0.getLayoutDimension(v2, jsy0.d));
                        break;
                    }
                    case 24: {
                        v3 = v1;
                        jsw0.b(24, typedArray0.getDimensionPixelSize(v2, jsy0.H));
                        break;
                    }
                    case 27: {
                        v3 = v1;
                        jsw0.b(27, typedArray0.getInt(v2, jsy0.G));
                        break;
                    }
                    case 28: {
                        v3 = v1;
                        jsw0.b(28, typedArray0.getDimensionPixelSize(v2, jsy0.I));
                        break;
                    }
                    case 0x1F: {
                        v3 = v1;
                        jsw0.b(0x1F, typedArray0.getDimensionPixelSize(v2, jsy0.M));
                        break;
                    }
                    case 34: {
                        v3 = v1;
                        jsw0.b(34, typedArray0.getDimensionPixelSize(v2, jsy0.J));
                        break;
                    }
                    case 37: {
                        v3 = v1;
                        jsw0.a(37, typedArray0.getFloat(v2, jsy0.z));
                        break;
                    }
                    case 38: {
                        v3 = v1;
                        int v4 = typedArray0.getResourceId(v2, jsx0.a);
                        jsx0.a = v4;
                        jsw0.b(38, v4);
                        break;
                    }
                    case 39: {
                        v3 = v1;
                        jsw0.a(39, typedArray0.getFloat(v2, jsy0.W));
                        break;
                    }
                    case 40: {
                        v3 = v1;
                        jsw0.a(40, typedArray0.getFloat(v2, jsy0.V));
                        break;
                    }
                    case 41: {
                        v3 = v1;
                        jsw0.b(41, typedArray0.getInt(v2, jsy0.X));
                        break;
                    }
                    case 42: {
                        v3 = v1;
                        jsw0.b(42, typedArray0.getInt(v2, jsy0.Y));
                        break;
                    }
                    case 43: {
                        v3 = v1;
                        jsw0.a(43, typedArray0.getFloat(v2, jta0.d));
                        break;
                    }
                    case 44: {
                        v3 = v1;
                        jsw0.d(44, true);
                        jsw0.a(44, typedArray0.getDimension(v2, jtb0.o));
                        break;
                    }
                    case 45: {
                        v3 = v1;
                        jsw0.a(45, typedArray0.getFloat(v2, jtb0.d));
                        break;
                    }
                    case 46: {
                        v3 = v1;
                        jsw0.a(46, typedArray0.getFloat(v2, jtb0.e));
                        break;
                    }
                    case 0x2F: {
                        v3 = v1;
                        jsw0.a(0x2F, typedArray0.getFloat(v2, jtb0.f));
                        break;
                    }
                    case 0x30: {
                        v3 = v1;
                        jsw0.a(0x30, typedArray0.getFloat(v2, jtb0.g));
                        break;
                    }
                    case 49: {
                        v3 = v1;
                        jsw0.a(49, typedArray0.getDimension(v2, jtb0.h));
                        break;
                    }
                    case 50: {
                        v3 = v1;
                        jsw0.a(50, typedArray0.getDimension(v2, jtb0.i));
                        break;
                    }
                    case 51: {
                        v3 = v1;
                        jsw0.a(51, typedArray0.getDimension(v2, jtb0.k));
                        break;
                    }
                    case 52: {
                        v3 = v1;
                        jsw0.a(52, typedArray0.getDimension(v2, jtb0.l));
                        break;
                    }
                    case 53: {
                        v3 = v1;
                        jsw0.a(53, typedArray0.getDimension(v2, jtb0.m));
                        break;
                    }
                    case 54: {
                        v3 = v1;
                        jsw0.b(54, typedArray0.getInt(v2, jsy0.Z));
                        break;
                    }
                    case 55: {
                        v3 = v1;
                        jsw0.b(55, typedArray0.getInt(v2, jsy0.aa));
                        break;
                    }
                    case 56: {
                        v3 = v1;
                        jsw0.b(56, typedArray0.getDimensionPixelSize(v2, jsy0.ab));
                        break;
                    }
                    case 57: {
                        v3 = v1;
                        jsw0.b(57, typedArray0.getDimensionPixelSize(v2, jsy0.ac));
                        break;
                    }
                    case 58: {
                        v3 = v1;
                        jsw0.b(58, typedArray0.getDimensionPixelSize(v2, jsy0.ad));
                        break;
                    }
                    case 59: {
                        v3 = v1;
                        jsw0.b(59, typedArray0.getDimensionPixelSize(v2, jsy0.ae));
                        break;
                    }
                    case 60: {
                        v3 = v1;
                        jsw0.a(60, typedArray0.getFloat(v2, jtb0.c));
                        break;
                    }
                    case 62: {
                        v3 = v1;
                        jsw0.b(62, typedArray0.getDimensionPixelSize(v2, jsy0.C));
                        break;
                    }
                    case 0x3F: {
                        v3 = v1;
                        jsw0.a(0x3F, typedArray0.getFloat(v2, jsy0.D));
                        break;
                    }
                    case 0x40: {
                        v3 = v1;
                        jsw0.b(0x40, jtc.a(typedArray0, v2, jsz0.c));
                        break;
                    }
                    case 65: {
                        v3 = v1;
                        if(typedArray0.peekValue(v2).type == 3) {
                            jsw0.c(65, typedArray0.getString(v2));
                        }
                        else {
                            jsw0.c(65, jrj.a[typedArray0.getInteger(v2, 0)]);
                        }
                        break;
                    }
                    case 66: {
                        v3 = v1;
                        jsw0.b(66, typedArray0.getInt(v2, 0));
                        break;
                    }
                    case 67: {
                        v3 = v1;
                        jsw0.a(67, typedArray0.getFloat(v2, jsz0.j));
                        break;
                    }
                    case 68: {
                        v3 = v1;
                        jsw0.a(68, typedArray0.getFloat(v2, jta0.e));
                        break;
                    }
                    case 69: {
                        v3 = v1;
                        jsw0.a(69, typedArray0.getFloat(v2, 1.0f));
                        break;
                    }
                    case 70: {
                        v3 = v1;
                        jsw0.a(70, typedArray0.getFloat(v2, 1.0f));
                        break;
                    }
                    case 71: {
                        v3 = v1;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    }
                    case 72: {
                        v3 = v1;
                        jsw0.b(72, typedArray0.getInt(v2, jsy0.ah));
                        break;
                    }
                    case 73: {
                        v3 = v1;
                        jsw0.b(73, typedArray0.getDimensionPixelSize(v2, jsy0.ai));
                        break;
                    }
                    case 74: {
                        v3 = v1;
                        jsw0.c(74, typedArray0.getString(v2));
                        break;
                    }
                    case 75: {
                        v3 = v1;
                        jsw0.d(75, typedArray0.getBoolean(v2, jsy0.ap));
                        break;
                    }
                    case 76: {
                        v3 = v1;
                        jsw0.b(76, typedArray0.getInt(v2, jsz0.f));
                        break;
                    }
                    case 77: {
                        v3 = v1;
                        jsw0.c(77, typedArray0.getString(v2));
                        break;
                    }
                    case 78: {
                        v3 = v1;
                        jsw0.b(78, typedArray0.getInt(v2, jta0.c));
                        break;
                    }
                    case 0x4F: {
                        v3 = v1;
                        jsw0.a(0x4F, typedArray0.getFloat(v2, jsz0.h));
                        break;
                    }
                    case 80: {
                        v3 = v1;
                        jsw0.d(80, typedArray0.getBoolean(v2, jsy0.an));
                        break;
                    }
                    case 81: {
                        v3 = v1;
                        jsw0.d(81, typedArray0.getBoolean(v2, jsy0.ao));
                        break;
                    }
                    case 82: {
                        v3 = v1;
                        jsw0.b(82, typedArray0.getInteger(v2, jsz0.d));
                        break;
                    }
                    case 83: {
                        v3 = v1;
                        jsw0.b(83, jtc.a(typedArray0, v2, jtb0.j));
                        break;
                    }
                    case 84: {
                        v3 = v1;
                        jsw0.b(84, typedArray0.getInteger(v2, jsz0.l));
                        break;
                    }
                    case 85: {
                        v3 = v1;
                        jsw0.a(85, typedArray0.getFloat(v2, jsz0.k));
                        break;
                    }
                    case 86: {
                        v3 = v1;
                        TypedValue typedValue0 = typedArray0.peekValue(v2);
                        if(typedValue0.type == 1) {
                            int v5 = typedArray0.getResourceId(v2, -1);
                            jsz0.n = v5;
                            jsw0.b(89, v5);
                            if(jsz0.n != -1) {
                                jsw0.b(88, -2);
                            }
                        }
                        else if(typedValue0.type == 3) {
                            jsz0.m = typedArray0.getString(v2);
                            jsw0.c(90, jsz0.m);
                            if(jsz0.m.indexOf("/") > 0) {
                                int v6 = typedArray0.getResourceId(v2, -1);
                                jsz0.n = v6;
                                jsw0.b(89, v6);
                                jsw0.b(88, -2);
                            }
                            else {
                                jsw0.b(88, -1);
                            }
                        }
                        else {
                            jsw0.b(88, typedArray0.getInteger(v2, jsz0.n));
                        }
                        break;
                    }
                    case 87: {
                        v3 = v1;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + jtc.b.get(v2));
                        break;
                    }
                    case 93: {
                        v3 = v1;
                        jsw0.b(93, typedArray0.getDimensionPixelSize(v2, jsy0.N));
                        break;
                    }
                    case 94: {
                        v3 = v1;
                        jsw0.b(94, typedArray0.getDimensionPixelSize(v2, jsy0.U));
                        break;
                    }
                    case 0x5F: {
                        v3 = v1;
                        jtc.m(jsw0, typedArray0, v2, 0);
                        break;
                    }
                    case 0x60: {
                        v3 = v1;
                        jtc.m(jsw0, typedArray0, v2, 1);
                        break;
                    }
                    case 97: {
                        v3 = v1;
                        jsw0.b(97, typedArray0.getInt(v2, jsy0.aq));
                        break;
                    }
                    case 98: {
                        v3 = v1;
                        if(typedArray0.peekValue(v2).type == 3) {
                            typedArray0.getString(v2);
                        }
                        else {
                            jsx0.a = typedArray0.getResourceId(v2, jsx0.a);
                        }
                        break;
                    }
                    case 99: {
                        jsw0.d(99, typedArray0.getBoolean(v2, jsy0.i));
                        v3 = v1;
                        break;
                    }
                    default: {
                        v3 = v1;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + jtc.b.get(v2));
                    }
                }
                ++v;
                v1 = v3;
            }
        }
        else {
            int v7 = typedArray0.getIndexCount();
            for(int v8 = 0; v8 < v7; ++v8) {
                int v9 = typedArray0.getIndex(v8);
                if(v9 != 1 && (v9 != 23 && v9 != 24)) {
                    jsx0.c.b = true;
                    jsx0.d.c = true;
                    jsx0.b.a = true;
                    jsx0.e.b = true;
                }
                SparseIntArray sparseIntArray0 = jtc.b;
                switch(sparseIntArray0.get(v9)) {
                    case 1: {
                        jsx0.d.r = jtc.a(typedArray0, v9, jsx0.d.r);
                        break;
                    }
                    case 2: {
                        jsx0.d.K = typedArray0.getDimensionPixelSize(v9, jsx0.d.K);
                        break;
                    }
                    case 3: {
                        jsx0.d.q = jtc.a(typedArray0, v9, jsx0.d.q);
                        break;
                    }
                    case 4: {
                        jsx0.d.p = jtc.a(typedArray0, v9, jsx0.d.p);
                        break;
                    }
                    case 5: {
                        jsx0.d.A = typedArray0.getString(v9);
                        break;
                    }
                    case 6: {
                        jsx0.d.E = typedArray0.getDimensionPixelOffset(v9, jsx0.d.E);
                        break;
                    }
                    case 7: {
                        jsx0.d.F = typedArray0.getDimensionPixelOffset(v9, jsx0.d.F);
                        break;
                    }
                    case 8: {
                        jsx0.d.L = typedArray0.getDimensionPixelSize(v9, jsx0.d.L);
                        break;
                    }
                    case 9: {
                        jsx0.d.x = jtc.a(typedArray0, v9, jsx0.d.x);
                        break;
                    }
                    case 10: {
                        jsx0.d.w = jtc.a(typedArray0, v9, jsx0.d.w);
                        break;
                    }
                    case 11: {
                        jsx0.d.R = typedArray0.getDimensionPixelSize(v9, jsx0.d.R);
                        break;
                    }
                    case 12: {
                        jsx0.d.S = typedArray0.getDimensionPixelSize(v9, jsx0.d.S);
                        break;
                    }
                    case 13: {
                        jsx0.d.O = typedArray0.getDimensionPixelSize(v9, jsx0.d.O);
                        break;
                    }
                    case 14: {
                        jsx0.d.Q = typedArray0.getDimensionPixelSize(v9, jsx0.d.Q);
                        break;
                    }
                    case 15: {
                        jsx0.d.T = typedArray0.getDimensionPixelSize(v9, jsx0.d.T);
                        break;
                    }
                    case 16: {
                        jsx0.d.P = typedArray0.getDimensionPixelSize(v9, jsx0.d.P);
                        break;
                    }
                    case 17: {
                        jsx0.d.f = typedArray0.getDimensionPixelOffset(v9, jsx0.d.f);
                        break;
                    }
                    case 18: {
                        jsx0.d.g = typedArray0.getDimensionPixelOffset(v9, jsx0.d.g);
                        break;
                    }
                    case 19: {
                        jsx0.d.h = typedArray0.getFloat(v9, jsx0.d.h);
                        break;
                    }
                    case 20: {
                        jsx0.d.y = typedArray0.getFloat(v9, jsx0.d.y);
                        break;
                    }
                    case 21: {
                        jsx0.d.e = typedArray0.getLayoutDimension(v9, jsx0.d.e);
                        break;
                    }
                    case 22: {
                        int v10 = typedArray0.getInt(v9, jsx0.b.b);
                        jsx0.b.b = v10;
                        jsx0.b.b = jtc.a[v10];
                        break;
                    }
                    case 23: {
                        jsx0.d.d = typedArray0.getLayoutDimension(v9, jsx0.d.d);
                        break;
                    }
                    case 24: {
                        jsx0.d.H = typedArray0.getDimensionPixelSize(v9, jsx0.d.H);
                        break;
                    }
                    case 25: {
                        jsx0.d.j = jtc.a(typedArray0, v9, jsx0.d.j);
                        break;
                    }
                    case 26: {
                        jsx0.d.k = jtc.a(typedArray0, v9, jsx0.d.k);
                        break;
                    }
                    case 27: {
                        jsx0.d.G = typedArray0.getInt(v9, jsx0.d.G);
                        break;
                    }
                    case 28: {
                        jsx0.d.I = typedArray0.getDimensionPixelSize(v9, jsx0.d.I);
                        break;
                    }
                    case 29: {
                        jsx0.d.l = jtc.a(typedArray0, v9, jsx0.d.l);
                        break;
                    }
                    case 30: {
                        jsx0.d.m = jtc.a(typedArray0, v9, jsx0.d.m);
                        break;
                    }
                    case 0x1F: {
                        jsx0.d.M = typedArray0.getDimensionPixelSize(v9, jsx0.d.M);
                        break;
                    }
                    case 0x20: {
                        jsx0.d.u = jtc.a(typedArray0, v9, jsx0.d.u);
                        break;
                    }
                    case 33: {
                        jsx0.d.v = jtc.a(typedArray0, v9, jsx0.d.v);
                        break;
                    }
                    case 34: {
                        jsx0.d.J = typedArray0.getDimensionPixelSize(v9, jsx0.d.J);
                        break;
                    }
                    case 35: {
                        jsx0.d.o = jtc.a(typedArray0, v9, jsx0.d.o);
                        break;
                    }
                    case 36: {
                        jsx0.d.n = jtc.a(typedArray0, v9, jsx0.d.n);
                        break;
                    }
                    case 37: {
                        jsx0.d.z = typedArray0.getFloat(v9, jsx0.d.z);
                        break;
                    }
                    case 38: {
                        jsx0.a = typedArray0.getResourceId(v9, jsx0.a);
                        break;
                    }
                    case 39: {
                        jsx0.d.W = typedArray0.getFloat(v9, jsx0.d.W);
                        break;
                    }
                    case 40: {
                        jsx0.d.V = typedArray0.getFloat(v9, jsx0.d.V);
                        break;
                    }
                    case 41: {
                        jsx0.d.X = typedArray0.getInt(v9, jsx0.d.X);
                        break;
                    }
                    case 42: {
                        jsx0.d.Y = typedArray0.getInt(v9, jsx0.d.Y);
                        break;
                    }
                    case 43: {
                        jsx0.b.d = typedArray0.getFloat(v9, jsx0.b.d);
                        break;
                    }
                    case 44: {
                        jsx0.e.n = true;
                        jsx0.e.o = typedArray0.getDimension(v9, jsx0.e.o);
                        break;
                    }
                    case 45: {
                        jsx0.e.d = typedArray0.getFloat(v9, jsx0.e.d);
                        break;
                    }
                    case 46: {
                        jsx0.e.e = typedArray0.getFloat(v9, jsx0.e.e);
                        break;
                    }
                    case 0x2F: {
                        jsx0.e.f = typedArray0.getFloat(v9, jsx0.e.f);
                        break;
                    }
                    case 0x30: {
                        jsx0.e.g = typedArray0.getFloat(v9, jsx0.e.g);
                        break;
                    }
                    case 49: {
                        jsx0.e.h = typedArray0.getDimension(v9, jsx0.e.h);
                        break;
                    }
                    case 50: {
                        jsx0.e.i = typedArray0.getDimension(v9, jsx0.e.i);
                        break;
                    }
                    case 51: {
                        jsx0.e.k = typedArray0.getDimension(v9, jsx0.e.k);
                        break;
                    }
                    case 52: {
                        jsx0.e.l = typedArray0.getDimension(v9, jsx0.e.l);
                        break;
                    }
                    case 53: {
                        jsx0.e.m = typedArray0.getDimension(v9, jsx0.e.m);
                        break;
                    }
                    case 54: {
                        jsx0.d.Z = typedArray0.getInt(v9, jsx0.d.Z);
                        break;
                    }
                    case 55: {
                        jsx0.d.aa = typedArray0.getInt(v9, jsx0.d.aa);
                        break;
                    }
                    case 56: {
                        jsx0.d.ab = typedArray0.getDimensionPixelSize(v9, jsx0.d.ab);
                        break;
                    }
                    case 57: {
                        jsx0.d.ac = typedArray0.getDimensionPixelSize(v9, jsx0.d.ac);
                        break;
                    }
                    case 58: {
                        jsx0.d.ad = typedArray0.getDimensionPixelSize(v9, jsx0.d.ad);
                        break;
                    }
                    case 59: {
                        jsx0.d.ae = typedArray0.getDimensionPixelSize(v9, jsx0.d.ae);
                        break;
                    }
                    case 60: {
                        jsx0.e.c = typedArray0.getFloat(v9, jsx0.e.c);
                        break;
                    }
                    case 61: {
                        jsx0.d.B = jtc.a(typedArray0, v9, jsx0.d.B);
                        break;
                    }
                    case 62: {
                        jsx0.d.C = typedArray0.getDimensionPixelSize(v9, jsx0.d.C);
                        break;
                    }
                    case 0x3F: {
                        jsx0.d.D = typedArray0.getFloat(v9, jsx0.d.D);
                        break;
                    }
                    case 0x40: {
                        jsx0.c.c = jtc.a(typedArray0, v9, jsx0.c.c);
                        break;
                    }
                    case 65: {
                        jsx0.c.e = typedArray0.peekValue(v9).type == 3 ? typedArray0.getString(v9) : jrj.a[typedArray0.getInteger(v9, 0)];
                        break;
                    }
                    case 66: {
                        jsx0.c.g = typedArray0.getInt(v9, 0);
                        break;
                    }
                    case 67: {
                        jsx0.c.j = typedArray0.getFloat(v9, jsx0.c.j);
                        break;
                    }
                    case 68: {
                        jsx0.b.e = typedArray0.getFloat(v9, jsx0.b.e);
                        break;
                    }
                    case 69: {
                        jsx0.d.af = typedArray0.getFloat(v9, 1.0f);
                        break;
                    }
                    case 70: {
                        jsx0.d.ag = typedArray0.getFloat(v9, 1.0f);
                        break;
                    }
                    case 71: {
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    }
                    case 72: {
                        jsx0.d.ah = typedArray0.getInt(v9, jsx0.d.ah);
                        break;
                    }
                    case 73: {
                        jsx0.d.ai = typedArray0.getDimensionPixelSize(v9, jsx0.d.ai);
                        break;
                    }
                    case 74: {
                        jsx0.d.al = typedArray0.getString(v9);
                        break;
                    }
                    case 75: {
                        jsx0.d.ap = typedArray0.getBoolean(v9, jsx0.d.ap);
                        break;
                    }
                    case 76: {
                        jsx0.c.f = typedArray0.getInt(v9, jsx0.c.f);
                        break;
                    }
                    case 77: {
                        jsx0.d.am = typedArray0.getString(v9);
                        break;
                    }
                    case 78: {
                        jsx0.b.c = typedArray0.getInt(v9, jsx0.b.c);
                        break;
                    }
                    case 0x4F: {
                        jsx0.c.h = typedArray0.getFloat(v9, jsx0.c.h);
                        break;
                    }
                    case 80: {
                        jsx0.d.an = typedArray0.getBoolean(v9, jsx0.d.an);
                        break;
                    }
                    case 81: {
                        jsx0.d.ao = typedArray0.getBoolean(v9, jsx0.d.ao);
                        break;
                    }
                    case 82: {
                        jsx0.c.d = typedArray0.getInteger(v9, jsx0.c.d);
                        break;
                    }
                    case 83: {
                        jsx0.e.j = jtc.a(typedArray0, v9, jsx0.e.j);
                        break;
                    }
                    case 84: {
                        jsx0.c.l = typedArray0.getInteger(v9, jsx0.c.l);
                        break;
                    }
                    case 85: {
                        jsx0.c.k = typedArray0.getFloat(v9, jsx0.c.k);
                        break;
                    }
                    case 86: {
                        TypedValue typedValue1 = typedArray0.peekValue(v9);
                        if(typedValue1.type == 1) {
                            jsx0.c.n = typedArray0.getResourceId(v9, -1);
                        }
                        else if(typedValue1.type == 3) {
                            jsz jsz1 = jsx0.c;
                            jsz1.m = typedArray0.getString(v9);
                            if(jsz1.m.indexOf("/") > 0) {
                                jsz1.n = typedArray0.getResourceId(v9, -1);
                            }
                        }
                        else {
                            typedArray0.getInteger(v9, jsx0.c.n);
                        }
                        break;
                    }
                    case 87: {
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v9) + "   " + sparseIntArray0.get(v9));
                        break;
                    }
                    case 91: {
                        jsx0.d.s = jtc.a(typedArray0, v9, jsx0.d.s);
                        break;
                    }
                    case 92: {
                        jsx0.d.t = jtc.a(typedArray0, v9, jsx0.d.t);
                        break;
                    }
                    case 93: {
                        jsx0.d.N = typedArray0.getDimensionPixelSize(v9, jsx0.d.N);
                        break;
                    }
                    case 94: {
                        jsx0.d.U = typedArray0.getDimensionPixelSize(v9, jsx0.d.U);
                        break;
                    }
                    case 0x5F: {
                        jtc.m(jsx0.d, typedArray0, v9, 0);
                        break;
                    }
                    case 0x60: {
                        jtc.m(jsx0.d, typedArray0, v9, 1);
                        break;
                    }
                    case 97: {
                        jsx0.d.aq = typedArray0.getInt(v9, jsx0.d.aq);
                        break;
                    }
                    default: {
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v9) + "   " + sparseIntArray0.get(v9));
                    }
                }
            }
            jsy jsy1 = jsx0.d;
            if(jsy1.al != null) {
                jsy1.ak = null;
            }
        }
        typedArray0.recycle();
        return jsx0;
    }

    private static final String x(int v) {
        switch(v) {
            case 1: {
                return "left";
            }
            case 2: {
                return "right";
            }
            case 3: {
                return "top";
            }
            case 4: {
                return "bottom";
            }
            case 5: {
                return "baseline";
            }
            case 6: {
                return "start";
            }
            default: {
                return "end";
            }
        }
    }

    private static String y(byte b, String s) {
        return s + jtc.x(b) + " undefined";
    }
}

