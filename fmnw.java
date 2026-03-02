import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class fmnw extends tt {
    private final int a;

    public fmnw(int v) {
        this.a = v;
    }

    @Override  // tt
    public final void a(Rect rect0, View view0, RecyclerView recyclerView0, un un0) {
        if((recyclerView0.h() instanceof LinearLayoutManager) && recyclerView0.c(view0) != recyclerView0.m.b() - 1) {
            if(((LinearLayoutManager)recyclerView0.h()).k == 0) {
                if(view0.getLayoutDirection() == 1) {
                    rect0.left = this.a;
                    return;
                }
                rect0.right = this.a;
                return;
            }
            rect0.bottom = this.a;
        }
    }
}

