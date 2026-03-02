import android.view.View;

public final class bfzl implements lqj {
    public final bgad a;
    public final View b;
    public final bdzc c;

    public bfzl(bgad bgad0, View view0, bdzc bdzc0) {
        this.a = bgad0;
        this.b = view0;
        this.c = bdzc0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            bgad bgad0 = this.a;
            if(jwq.c(bgad0.requireContext())) {
                this.b.findViewById(0x7F0B1D77).setVisibility(0);  // id:pwm_create_shortcut_layout
                this.b.findViewById(0x7F0B1D77).setOnClickListener(new bfzp(this.c, bgad0));  // id:pwm_create_shortcut_layout
            }
        }
    }
}

