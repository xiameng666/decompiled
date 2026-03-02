import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity;

public final class bvun implements View.OnClickListener {
    public final GrowthWebViewChimeraActivity a;

    public bvun(GrowthWebViewChimeraActivity growthWebViewChimeraActivity0) {
        this.a = growthWebViewChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.findViewById(0x7F0B1E39).setClickable(false);  // id:remind_me_later
        Intent intent0 = this.a.getIntent();
        String s = intent0 == null || !intent0.hasExtra("treatment_name") ? "" : intent0.getStringExtra("treatment_name");
        bvug bvug0 = new bvug(this.a, s);
        gmbu.t(glzd.f(gmbt.h(this.a.l.b(bvug0)), new bvuh(this.a), gmap.a), new bvmt(new bvui(this.a)), gmap.a);
    }
}

