import android.os.Bundle;
import android.view.View;

public final class cbrs extends cbqn {
    public final acp b;
    public boolean c;

    public cbrs() {
        super(0x7F0E024F);  // layout:create_supervised_user
        this.b = this.registerForActivityResult(new adt(), new cbrp(this));
    }

    public final void E() {
        this.c = true;
        this.z();
    }

    @Override  // cbqn
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.A(0x7F1509C2);  // string:create_supervised_user_subheader "Set up a child user to get access to parental 
                             // controls and a more personalized experience"
        this.B(new cbrm(this));
        this.y().b();
        this.y().e.g(this.getViewLifecycleOwner(), new cbrr(new cbrn(this)));
    }
}

