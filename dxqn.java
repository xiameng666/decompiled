import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dxqn implements View.OnClickListener {
    public final dxqw a;
    public final dzdl b;

    public dxqn(dxqw dxqw0, dzdl dzdl0) {
        this.a = dxqw0;
        this.b = dzdl0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = frxe.a(this.a.requireContext(), ((String)this.b.e.get()), "android.intent.action.VIEW", ((String)this.b.o.get()), null);
        intent0.setFlags(0x10000000);
        this.a.requireContext().startActivity(intent0);
        this.a.S();
    }
}

