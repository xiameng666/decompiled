import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class aaje implements lqj {
    public final aajp a;

    public aaje(aajp aajp0) {
        this.a = aajp0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        SwipeRefreshLayout swipeRefreshLayout0 = this.a.ai;
        if(swipeRefreshLayout0.b != z) {
            swipeRefreshLayout0.k(z);
        }
    }
}

