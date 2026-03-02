import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public final class jto extends ViewGroup.MarginLayoutParams {
    public jtl a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Rect p;
    private boolean q;

    public jto(int v) {
        super(v, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public jto(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        jtl jtl0;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, jti.b);
        this.c = typedArray0.getInteger(0, 0);
        this.f = typedArray0.getResourceId(1, -1);
        this.d = typedArray0.getInteger(2, 0);
        this.e = typedArray0.getInteger(6, -1);
        this.g = typedArray0.getInt(5, 0);
        this.h = typedArray0.getInt(4, 0);
        boolean z = typedArray0.hasValue(3);
        this.b = z;
        if(z) {
            String s = typedArray0.getString(3);
            if(TextUtils.isEmpty(s)) {
                jtl0 = null;
            }
            else {
                if(s.startsWith(".")) {
                    s = "com.google.android.gms" + s;
                }
                else if(s.indexOf(46) < 0) {
                    String s1 = CoordinatorLayout.a;
                    if(!TextUtils.isEmpty(s1)) {
                        s = s1 + '.' + s;
                    }
                }
                try {
                    ThreadLocal threadLocal0 = CoordinatorLayout.c;
                    Map map0 = (Map)threadLocal0.get();
                    if(map0 == null) {
                        map0 = new HashMap();
                        threadLocal0.set(map0);
                    }
                    Constructor constructor0 = (Constructor)map0.get(s);
                    if(constructor0 == null) {
                        constructor0 = Class.forName(s, false, context0.getClassLoader()).getConstructor(CoordinatorLayout.b);
                        constructor0.setAccessible(true);
                        map0.put(s, constructor0);
                    }
                    jtl0 = (jtl)constructor0.newInstance(context0, attributeSet0);
                }
                catch(Exception exception0) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + s, exception0);
                }
            }
            this.a = jtl0;
        }
        typedArray0.recycle();
        jtl jtl1 = this.a;
        if(jtl1 != null) {
            jtl1.a(this);
        }
    }

    public jto(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super(viewGroup$LayoutParams0);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public jto(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        super(viewGroup$MarginLayoutParams0);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public jto(jto jto0) {
        super(jto0);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public final void a() {
        this.o = false;
    }

    public final void b(jtl jtl0) {
        jtl jtl1 = this.a;
        if(jtl1 != jtl0) {
            if(jtl1 != null) {
                jtl1.b();
            }
            this.a = jtl0;
            this.b = true;
            if(jtl0 != null) {
                jtl0.a(this);
            }
        }
    }

    public final void c(int v, boolean z) {
        if(v != 0) {
            this.q = z;
            return;
        }
        this.n = z;
    }

    public final boolean d(int v) {
        return v == 0 ? this.n : this.q;
    }
}

