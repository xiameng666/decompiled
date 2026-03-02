import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class aagb implements lqj {
    public final aahd a;

    public aagb(aahd aahd0) {
        this.a = aahd0;
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

