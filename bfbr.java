import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

public final class bfbr extends uq implements bfbs {
    public static final int t;
    private final bfbg u;
    private final TextView v;

    public bfbr(View view0, bfbg bfbg0) {
        ibuq.f(view0, "itemView");
        super(view0);
        this.u = bfbg0;
        View view1 = view0.findViewById(0x7F0B1822);  // id:list_item_secondary_text
        ibuq.e(view1, "findViewById(...)");
        this.v = (TextView)view1;
    }

    @Override  // bfbs
    public final void D(gqlt gqlt0, bfbt bfbt0) {
        ibuq.f(gqlt0, "affiliatedGroup");
        this.u.a(gqlt0);
        Resources resources0 = this.v.getContext().getResources();
        this.v.setText(resources0.getQuantityString(0x7F130068, ((ggna)gqlt0.c).c, new Object[]{((int)((ggna)gqlt0.c).c)}));  // plurals:pwm_password_list_entry_account_num
        bfbq bfbq0 = new bfbq(bfbt0, gqlt0);
        this.a.setOnClickListener(bfbq0);
    }
}

