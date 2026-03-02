import android.os.Bundle;
import android.view.View;

public final class cbrb extends cbqn {
    public final cbrl b;
    public final cbpz c;

    public cbrb() {
        super(0x7F0E0250);  // layout:create_supervised_user_select_child
        this.b = new cbrl(new cbqz(this));
        this.c = new cbpz(new cbra(this));
    }

    @Override  // cbqn
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.A(0x7F1529F1);  // string:select_child_description "Select a child"
        this.y().e.g(this.getViewLifecycleOwner(), new cbqy(this, view0));
    }
}

