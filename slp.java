import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

@Deprecated
public final class slp extends tt {
    public Drawable a;
    private int b;
    private int c;
    private int d;

    public slp() {
    }

    public slp(Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(slr.d);
        Drawable drawable0 = typedArray0.getDrawable(1);
        int v = typedArray0.getDimensionPixelSize(0, 0);
        int v1 = typedArray0.getInt(2, 0);
        typedArray0.recycle();
        this.c(drawable0);
        this.b = v;
        this.d = v1;
    }

    @Override  // tt
    public final void a(Rect rect0, View view0, RecyclerView recyclerView0, un un0) {
        if(this.d(view0, recyclerView0)) {
            rect0.bottom = this.b == 0 ? this.c : this.b;
        }
    }

    @Override  // tt
    public final void b(Canvas canvas0, RecyclerView recyclerView0, un un0) {
        if(this.a != null) {
            int v = recyclerView0.getChildCount();
            int v1 = recyclerView0.getWidth();
            int v2 = this.b == 0 ? this.c : this.b;
            for(int v3 = 0; v3 < v; ++v3) {
                View view0 = recyclerView0.getChildAt(v3);
                if(this.d(view0, recyclerView0)) {
                    int v4 = ((int)view0.getY()) + view0.getHeight();
                    this.a.setBounds(0, v4, v1, v4 + v2);
                    this.a.draw(canvas0);
                }
            }
        }
    }

    public final void c(Drawable drawable0) {
        this.c = drawable0 == null ? 0 : drawable0.getIntrinsicHeight();
        this.a = drawable0;
    }

    private final boolean d(View view0, RecyclerView recyclerView0) {
        uq uq0 = recyclerView0.o(view0);
        int v = uq0.c();
        int v1 = recyclerView0.m.b() - 1;
        if((uq0 instanceof slo) && !((slo)uq0).b()) {
            if(this.d != 1 && v != v1) {
                goto label_7;
            }
            return false;
        }
        else if(this.d != 0) {
        label_7:
            if(v < v1) {
                uq uq1 = recyclerView0.m(v + 1);
                return !(uq1 instanceof slo) || ((slo)uq1).a();
            }
        }
        return true;
    }
}

