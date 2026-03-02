import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public class rf extends tt {
    public Drawable a;
    private static final int[] b;
    private final int c;
    private final Rect d;

    static {
        rf.b = new int[]{0x1010214};
    }

    public rf(Context context0, int v) {
        this.d = new Rect();
        TypedArray typedArray0 = context0.obtainStyledAttributes(rf.b);
        Drawable drawable0 = typedArray0.getDrawable(0);
        this.a = drawable0;
        if(drawable0 == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArray0.recycle();
        if(v != 0) {
            v = 1;
        }
        this.c = v;
    }

    @Override  // tt
    public final void a(Rect rect0, View view0, RecyclerView recyclerView0, un un0) {
        Drawable drawable0 = this.a;
        if(drawable0 == null) {
            rect0.set(0, 0, 0, 0);
            return;
        }
        if(this.c == 1) {
            rect0.set(0, 0, 0, drawable0.getIntrinsicHeight());
            return;
        }
        rect0.set(0, 0, drawable0.getIntrinsicWidth(), 0);
    }

    @Override  // tt
    public void b(Canvas canvas0, RecyclerView recyclerView0, un un0) {
        int v7;
        int v6;
        int v2;
        int v1;
        int v = 0;
        if(recyclerView0.h() != null && this.a != null) {
            if(this.c == 1) {
                canvas0.save();
                if(recyclerView0.i) {
                    v1 = recyclerView0.getPaddingLeft();
                    v2 = recyclerView0.getWidth() - recyclerView0.getPaddingRight();
                    canvas0.clipRect(v1, recyclerView0.getPaddingTop(), v2, recyclerView0.getHeight() - recyclerView0.getPaddingBottom());
                }
                else {
                    v2 = recyclerView0.getWidth();
                    v1 = 0;
                }
                int v3 = recyclerView0.getChildCount();
                while(v < v3) {
                    View view0 = recyclerView0.getChildAt(v);
                    RecyclerView.U(view0, this.d);
                    int v4 = this.d.bottom + Math.round(view0.getTranslationY());
                    int v5 = v4 - this.a.getIntrinsicHeight();
                    this.a.setBounds(v1, v5, v2, v4);
                    this.a.draw(canvas0);
                    ++v;
                }
                canvas0.restore();
                return;
            }
            canvas0.save();
            if(recyclerView0.i) {
                v6 = recyclerView0.getPaddingTop();
                v7 = recyclerView0.getHeight() - recyclerView0.getPaddingBottom();
                canvas0.clipRect(recyclerView0.getPaddingLeft(), v6, recyclerView0.getWidth() - recyclerView0.getPaddingRight(), v7);
            }
            else {
                v7 = recyclerView0.getHeight();
                v6 = 0;
            }
            int v8 = recyclerView0.getChildCount();
            while(v < v8) {
                View view1 = recyclerView0.getChildAt(v);
                recyclerView0.h();
                RecyclerView.U(view1, this.d);
                int v9 = this.d.right + Math.round(view1.getTranslationX());
                int v10 = v9 - this.a.getIntrinsicWidth();
                this.a.setBounds(v10, v6, v9, v7);
                this.a.draw(canvas0);
                ++v;
            }
            canvas0.restore();
        }
    }
}

