import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class rl extends ListView {
    public boolean a;
    rk b;
    private final Rect c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private ri i;
    private final boolean j;
    private boolean k;
    private kie l;

    public rl(Context context0, boolean z) {
        super(context0, null, 0x7F040494);  // attr:dropDownListViewStyle
        this.c = new Rect();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.j = z;
        this.setCacheColorHint(0);
    }

    public final boolean a(MotionEvent motionEvent0, int v) {
        boolean z1;
        int v11;
        boolean z2;
        int v1 = motionEvent0.getActionMasked();
        boolean z = false;
        switch(v1) {
            case 1: {
                z1 = false;
                goto label_8;
            }
            case 2: {
                z1 = true;
            label_8:
                int v2 = motionEvent0.findPointerIndex(v);
                if(v2 >= 0) {
                    int v3 = (int)motionEvent0.getX(v2);
                    int v4 = (int)motionEvent0.getY(v2);
                    int v5 = this.pointToPosition(v3, v4);
                    if(v5 == -1) {
                        z = true;
                    }
                    else {
                        View view0 = this.getChildAt(v5 - this.getFirstVisiblePosition());
                        this.k = true;
                        this.drawableHotspotChanged(((float)v3), ((float)v4));
                        if(!this.isPressed()) {
                            this.setPressed(true);
                        }
                        this.layoutChildren();
                        int v6 = this.h;
                        if(v6 != -1) {
                            View view1 = this.getChildAt(v6 - this.getFirstVisiblePosition());
                            if(view1 != null && view1 != view0 && view1.isPressed()) {
                                view1.setPressed(false);
                            }
                        }
                        this.h = v5;
                        view0.drawableHotspotChanged(((float)v3) - ((float)view0.getLeft()), ((float)v4) - ((float)view0.getTop()));
                        if(!view0.isPressed()) {
                            view0.setPressed(true);
                        }
                        Drawable drawable0 = this.getSelector();
                        if(drawable0 == null) {
                            z2 = false;
                        }
                        else if(v5 != -1) {
                            z2 = true;
                        }
                        else {
                            z2 = false;
                            v5 = -1;
                        }
                        if(z2) {
                            drawable0.setVisible(false, false);
                        }
                        int v7 = view0.getLeft();
                        int v8 = view0.getTop();
                        int v9 = view0.getRight();
                        int v10 = view0.getBottom();
                        this.c.set(v7, v8, v9, v10);
                        this.c.left -= this.d;
                        this.c.top -= this.e;
                        this.c.right += this.f;
                        this.c.bottom += this.g;
                        if(Build.VERSION.SDK_INT >= 33) {
                            v11 = this.isSelectedChildViewEnabled();
                        }
                        else {
                            Field field0 = rj.a;
                            if(field0 == null) {
                                v11 = 0;
                            }
                            else {
                                try {
                                    v11 = field0.getBoolean(this);
                                }
                                catch(IllegalAccessException illegalAccessException0) {
                                    illegalAccessException0.printStackTrace();
                                    v11 = 0;
                                }
                            }
                        }
                        if(view0.isEnabled() != v11) {
                            if(Build.VERSION.SDK_INT >= 33) {
                                this.setSelectedChildViewEnabled(((boolean)(v11 ^ 1)));
                            }
                            else {
                                Field field1 = rj.a;
                                if(field1 != null) {
                                    try {
                                        field1.set(this, Boolean.valueOf(((boolean)(v11 ^ 1))));
                                    }
                                    catch(IllegalAccessException illegalAccessException1) {
                                        illegalAccessException1.printStackTrace();
                                    }
                                }
                            }
                            if(v5 != -1) {
                                this.refreshDrawableState();
                            }
                        }
                        if(z2) {
                            float f = this.c.exactCenterX();
                            float f1 = this.c.exactCenterY();
                            drawable0.setVisible(this.getVisibility() == 0, false);
                            drawable0.setHotspot(f, f1);
                        }
                        Drawable drawable1 = this.getSelector();
                        if(drawable1 != null && v5 != -1) {
                            drawable1.setHotspot(((float)v3), ((float)v4));
                        }
                        this.c(false);
                        this.refreshDrawableState();
                        if(v1 == 1) {
                            this.performItemClick(view0, v5, this.getItemIdAtPosition(v5));
                        }
                        z1 = true;
                    }
                }
                else {
                    z1 = false;
                }
                break;
            }
            case 3: {
                z1 = false;
                break;
            }
            default: {
                z1 = true;
            }
        }
        if(!z1 || z) {
            this.k = false;
            this.setPressed(false);
            this.drawableStateChanged();
            View view2 = this.getChildAt(this.h - this.getFirstVisiblePosition());
            if(view2 != null) {
                view2.setPressed(false);
            }
        }
        if(z1) {
            if(this.l == null) {
                this.l = new kie(this);
            }
            this.l.c(true);
            this.l.onTouch(this, motionEvent0);
            return z1;
        }
        kie kie0 = this.l;
        if(kie0 != null) {
            kie0.c(false);
        }
        return z1;
    }

    public final int b(int v, int v1) {
        int v2 = this.getListPaddingTop() + this.getListPaddingBottom();
        int v3 = this.getDividerHeight();
        Drawable drawable0 = this.getDivider();
        ListAdapter listAdapter0 = this.getAdapter();
        if(listAdapter0 == null) {
            return v2;
        }
        if(v3 <= 0 || drawable0 == null) {
            v3 = 0;
        }
        int v4 = listAdapter0.getCount();
        int v5 = 0;
        View view0 = null;
        for(int v6 = 0; v5 < v4; v6 = v7 == v6 ? v6 : v7) {
            int v7 = listAdapter0.getItemViewType(v5);
            if(v7 != v6) {
                view0 = null;
            }
            view0 = listAdapter0.getView(v5, view0, this);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                viewGroup$LayoutParams0 = this.generateDefaultLayoutParams();
                view0.setLayoutParams(viewGroup$LayoutParams0);
            }
            view0.measure(v, (viewGroup$LayoutParams0.height <= 0 ? 0 : View.MeasureSpec.makeMeasureSpec(viewGroup$LayoutParams0.height, 0x40000000)));
            view0.forceLayout();
            if(v5 > 0) {
                v2 += v3;
            }
            v2 += view0.getMeasuredHeight();
            if(v2 >= v1) {
                return v1;
            }
            ++v5;
        }
        return v2;
    }

    private final void c(boolean z) {
        ri ri0 = this.i;
        if(ri0 != null) {
            ri0.a = z;
        }
    }

    private final void d() {
        Drawable drawable0 = this.getSelector();
        if(drawable0 != null && this.k && this.isPressed()) {
            drawable0.setState(this.getDrawableState());
        }
    }

    @Override  // android.widget.ListView
    protected final void dispatchDraw(Canvas canvas0) {
        Rect rect0 = this.c;
        if(!rect0.isEmpty()) {
            Drawable drawable0 = this.getSelector();
            if(drawable0 != null) {
                drawable0.setBounds(rect0);
                drawable0.draw(canvas0);
            }
        }
        super.dispatchDraw(canvas0);
    }

    @Override  // android.widget.AbsListView
    protected final void drawableStateChanged() {
        if(this.b != null) {
            return;
        }
        super.drawableStateChanged();
        this.c(true);
        this.d();
    }

    @Override  // android.view.ViewGroup
    public final boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    @Override  // android.view.View
    public final boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    @Override  // android.view.View
    public final boolean isFocused() {
        return this.j || super.isFocused();
    }

    @Override  // android.view.View
    public final boolean isInTouchMode() {
        return this.j && this.a || super.isInTouchMode();
    }

    @Override  // android.widget.ListView
    protected final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 10) {
            if(this.b == null) {
                rk rk0 = new rk(this);
                this.b = rk0;
                rk0.a.post(rk0);
            }
            v = 10;
        }
        boolean z = super.onHoverEvent(motionEvent0);
        if(v != 7 && v != 9) {
            this.setSelection(-1);
            return z;
        }
        int v1 = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
        if(v1 != -1 && v1 != this.getSelectedItemPosition()) {
            View view0 = this.getChildAt(v1 - this.getFirstVisiblePosition());
            if(view0.isEnabled()) {
                this.requestFocus();
                if(rh.d) {
                    try {
                        Integer integer0 = v1;
                        Integer integer1 = (int)-1;
                        rh.a.invoke(this, integer0, view0, Boolean.valueOf(false), integer1, integer1);
                        rh.b.invoke(this, integer0);
                        rh.c.invoke(this, integer0);
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        illegalAccessException0.printStackTrace();
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                        invocationTargetException0.printStackTrace();
                    }
                }
                else {
                    this.setSelectionFromTop(v1, view0.getTop() - this.getTop());
                }
            }
            this.d();
        }
        return z;
    }

    @Override  // android.widget.AbsListView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            this.h = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
        }
        rk rk0 = this.b;
        if(rk0 != null) {
            rk0.a.b = null;
            rk0.a.removeCallbacks(rk0);
        }
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // android.widget.AbsListView
    public final void setSelector(Drawable drawable0) {
        ri ri0 = drawable0 == null ? null : new ri(drawable0);
        this.i = ri0;
        super.setSelector(ri0);
        Rect rect0 = new Rect();
        if(drawable0 != null) {
            drawable0.getPadding(rect0);
        }
        this.d = rect0.left;
        this.e = rect0.top;
        this.f = rect0.right;
        this.g = rect0.bottom;
    }
}

