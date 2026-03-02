import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class aabx extends RecyclerView {
    public aabx(Context context0) {
        super(context0);
        this.ap(new LinearLayoutManager());
    }

    public aabx(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.ap(new LinearLayoutManager());
    }

    public final LinearLayoutManager aM() {
        LinearLayoutManager linearLayoutManager0 = (LinearLayoutManager)this.n;
        if(linearLayoutManager0 != null) {
            return linearLayoutManager0;
        }
        throw new IllegalStateException();
    }

    @Override  // android.support.v7.widget.RecyclerView
    public final void ap(tx tx0) {
        gftb.check(tx0);
        gftb.f(tx0 instanceof LinearLayoutManager, "LinearRecyclerView requires a LinearLayoutManager, but got %s", tx0.getClass().getName());
        super.ap(tx0);
    }

    @Override  // android.support.v7.widget.RecyclerView
    public final tx h() {
        return this.aM();
    }
}

