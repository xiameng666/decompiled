import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dmsy implements View.OnClickListener {
    public final dmtl a;

    public dmsy(dmtl dmtl0) {
        this.a = dmtl0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = ednl.a("com.felicanetworks.mfm.main");
        this.a.b.startActivity(intent0);
    }
}

