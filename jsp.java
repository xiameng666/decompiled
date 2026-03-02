import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

public class jsp extends View {
    public int[] c;
    public int d;
    protected final Context e;
    public String f;
    protected String g;
    public final HashMap h;
    public jrt i;

    public jsp(Context context0) {
        super(context0);
        this.c = new int[0x20];
        this.h = new HashMap();
        this.e = context0;
        this.a(null);
    }

    public jsp(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c = new int[0x20];
        this.h = new HashMap();
        this.e = context0;
        this.a(attributeSet0);
    }

    public jsp(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = new int[0x20];
        this.h = new HashMap();
        this.e = context0;
        this.a(attributeSet0);
    }

    protected void a(AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, jtg.b);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == 35) {
                    String s = typedArray0.getString(35);
                    this.f = s;
                    this.i(s);
                }
                else if(v2 == 36) {
                    String s1 = typedArray0.getString(36);
                    this.g = s1;
                    this.j(s1);
                }
            }
            typedArray0.recycle();
        }
    }

    private final void b(String s) {
        int v1;
        if(s != null && s.length() != 0 && this.e != null) {
            String s1 = s.trim();
            ConstraintLayout constraintLayout0 = (this.getParent() instanceof ConstraintLayout) ? ((ConstraintLayout)this.getParent()) : null;
            int v = 0;
            if(this.isInEditMode() && constraintLayout0 != null) {
                Object object0 = constraintLayout0.f(s1);
                v1 = (object0 instanceof Integer) ? ((int)(((Integer)object0))) : 0;
            }
            else {
                v1 = 0;
            }
            if(v1 == 0) {
                v1 = constraintLayout0 == null ? 0 : this.e(constraintLayout0, s1);
            }
            if(v1 == 0) {
                try {
                    v = jtf.class.getField(s1).getInt(null);
                    goto label_18;
                label_17:
                    v = v1;
                }
                catch(Exception unused_ex) {
                }
            }
            else {
                goto label_17;
            }
        label_18:
            if(v == 0) {
                v = this.e.getResources().getIdentifier(s1, "id", "com.google.android.gms");
            }
            if(v != 0) {
                this.h.put(Integer.valueOf(v), s1);
                this.d(v);
                return;
            }
            Log.w("ConstraintHelper", a.a(s1, "Could not find id of \"", "\""));
        }
    }

    public void c(jro jro0, boolean z) {
    }

    private final void d(int v) {
        if(v == this.getId()) {
            return;
        }
        int[] arr_v = this.c;
        if(this.d + 1 > arr_v.length) {
            this.c = Arrays.copyOf(arr_v, arr_v.length + arr_v.length);
        }
        int v1 = this.d;
        this.c[v1] = v;
        this.d = v1 + 1;
    }

    public final int e(ConstraintLayout constraintLayout0, String s) {
        if(s != null) {
            Resources resources0 = this.e.getResources();
            if(resources0 != null) {
                int v = constraintLayout0.getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    View view0 = constraintLayout0.getChildAt(v1);
                    if(view0.getId() != -1) {
                        try {
                            String s1 = null;
                            s1 = resources0.getResourceEntryName(view0.getId());
                        }
                        catch(Resources.NotFoundException unused_ex) {
                        }
                        if(s.equals(s1)) {
                            return view0.getId();
                        }
                    }
                }
            }
        }
        return 0;
    }

    protected final void f() {
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null && (viewParent0 instanceof ConstraintLayout)) {
            this.g(((ConstraintLayout)viewParent0));
        }
    }

    protected void g(ConstraintLayout constraintLayout0) {
        int v = this.getVisibility();
        float f = this.getElevation();
        for(int v1 = 0; v1 < this.d; ++v1) {
            View view0 = constraintLayout0.a(this.c[v1]);
            if(view0 != null) {
                view0.setVisibility(v);
                if((f > 0.0f)) {
                    view0.setTranslationZ(view0.getTranslationZ() + f);
                }
            }
        }
    }

    protected void h(ConstraintLayout constraintLayout0) {
    }

    public final void i(String s) {
        this.f = s;
        if(s == null) {
            return;
        }
        int v = 0;
        this.d = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.b(s.substring(v, v1));
            v = v1 + 1;
        }
        this.b(s.substring(v));
    }

    protected final void j(String s) {
        this.g = s;
        if(s == null) {
            return;
        }
        int v = 0;
        this.d = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.n(s.substring(v, v1));
            v = v1 + 1;
        }
        this.n(s.substring(v));
    }

    public final void k(int[] arr_v) {
        this.f = null;
        this.d = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            this.d(arr_v[v]);
        }
    }

    public final void l() {
        if(this.i != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            if((viewGroup$LayoutParams0 instanceof jsr)) {
                ((jsr)viewGroup$LayoutParams0).av = this.i;
            }
        }
    }

    public void m() {
    }

    private final void n(String s) {
        if(s != null && s.length() != 0 && this.e != null) {
            String s1 = s.trim();
            ConstraintLayout constraintLayout0 = (this.getParent() instanceof ConstraintLayout) ? ((ConstraintLayout)this.getParent()) : null;
            if(constraintLayout0 == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int v = constraintLayout0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = constraintLayout0.getChildAt(v1);
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                if((viewGroup$LayoutParams0 instanceof jsr) && s1.equals(((jsr)viewGroup$LayoutParams0).ac)) {
                    if(view0.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + view0.getClass().getSimpleName() + " must have an ID");
                    }
                    else {
                        this.d(view0.getId());
                    }
                }
            }
        }
    }

    @Override  // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String s = this.f;
        if(s != null) {
            this.i(s);
        }
        String s1 = this.g;
        if(s1 != null) {
            this.j(s1);
        }
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    @Override  // android.view.View
    public final void setTag(int v, Object object0) {
        super.setTag(v, object0);
        if(object0 == null && this.f == null) {
            this.d(v);
        }
    }
}

