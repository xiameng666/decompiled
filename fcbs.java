import android.content.Context;
import android.view.LayoutInflater;
import com.google.android.wallet.ui.common.InfoMessageView;

public final class fcbs extends gdbm {
    final InfoMessageView a;

    public fcbs(Context context0) {
        super(context0);
        LayoutInflater.from(this.getContext()).inflate(0x7F0E0E40, this, true);  // layout:wallet_view_instrument_group_title
        this.a = (InfoMessageView)this.findViewById(0x7F0B22B8);  // id:title
        this.m = this.findViewById(0x7F0B1748);  // id:instrument_divider_line
    }

    @Override  // gdbk
    public final CharSequence a() {
        return this.a.getContentDescription();
    }

    @Override  // gdbm
    public final void b(String s) {
        super.b(s);
        this.a.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
    }

    @Override  // gdbm
    public final void c(boolean z, boolean z1) {
        super.c(z, z1);
        this.a.setVisibility((z ? 0 : 8));
    }

    @Override  // gdbm
    public final boolean d() {
        return false;
    }
}

