import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

public final class bfbk extends uq implements bfbl {
    final bfbg t;
    final TextView u;
    public static final int v;

    public bfbk(View view0) {
        super(view0);
        this.t = new bfbg(view0);
        this.u = (TextView)view0.findViewById(0x7F0B1822);  // id:list_item_secondary_text
    }

    @Override  // bfbl
    public final void D(gqlt gqlt0, Boolean boolean0, bfxv bfxv0) {
        this.t.a(gqlt0);
        Resources resources0 = this.u.getContext().getResources();
        this.u.setText(resources0.getQuantityString(0x7F130068, ((ggna)gqlt0.c).c, new Object[]{((int)((ggna)gqlt0.c).c)}));  // plurals:pwm_password_list_entry_account_num
        bfbj bfbj0 = new bfbj(bfxv0, gqlt0, boolean0);
        this.a.setOnClickListener(bfbj0);
    }
}

