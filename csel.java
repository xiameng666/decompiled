import android.view.View.OnClickListener;
import android.view.View;

final class csel implements View.OnClickListener {
    private final View a;

    public csel(View view0) {
        this.a = view0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.setVisibility(8);
        crxn.c().Q(72, null, "R.id.user_notice_card", hhct.cn, System.currentTimeMillis(), csfi.a());
    }
}

