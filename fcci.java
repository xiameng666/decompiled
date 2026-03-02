import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class fcci extends tt {
    final Drawable a;
    final Rect b;
    private final fccm c;
    private final int d;

    public fcci(fccm fccm0, Context context0) {
        this.b = new Rect();
        this.c = fccm0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(new int[]{0x7F04044B});  // attr:dividerDrawable
        int v = 0;
        Drawable drawable0 = typedArray0.getDrawable(0);
        this.a = drawable0;
        if(drawable0 != null) {
            v = drawable0.getIntrinsicHeight();
        }
        this.d = v;
        typedArray0.recycle();
    }

    @Override  // tt
    public final void a(Rect rect0, View view0, RecyclerView recyclerView0, un un0) {
        int v = recyclerView0.o(view0).c();
        int v1 = this.c.a(v).a;
        int v2 = hcfe.a(this.c.d(v1).d);
        if(v2 == 0) {
            v2 = 1;
        }
        if(v2 - 1 != 0 && v2 - 1 != 2) {
            super.a(rect0, view0, recyclerView0, un0);
            return;
        }
        rect0.set(0, this.d, 0, 0);
    }

    @Override  // tt
    public final void b(Canvas canvas0, RecyclerView recyclerView0, un un0) {
        int v = recyclerView0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = recyclerView0.getChildAt(v1);
            int v2 = recyclerView0.o(view0).c();
            int v3 = this.c.a(v2).a;
            int v4 = hcfe.a(this.c.d(v3).d);
            if(v4 == 0) {
                v4 = 1;
            }
            if(v4 - 1 == 0 || v4 - 1 == 2) {
                Drawable drawable0 = this.a;
                if(drawable0 != null) {
                    RecyclerView.U(view0, this.b);
                    int v5 = this.b.top + Math.round(view0.getTranslationY());
                    drawable0.setBounds(this.b.left, v5, this.b.right, this.d + v5);
                    drawable0.draw(canvas0);
                }
            }
        }
    }
}

