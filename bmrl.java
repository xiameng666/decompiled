import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j..util.Objects;

public final class bmrl extends du {
    public bmuz a;
    public RecyclerView b;
    public View c;

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.c = layoutInflater0.inflate(0x7F0E037B, viewGroup0, false);  // layout:fido_account_selection_fragment
        bmuz bmuz0 = (bmuz)new lso(((xnz)this.requireContext())).a(bmuz.class);
        this.a = bmuz0;
        bmuz0.l(blhf.ao);
        ((TextView)this.c.findViewById(0x7F0B228C)).setText(String.format(this.getString(0x7F151114), this.a.s));  // id:text_view
        this.c.findViewById(0x7F0B13BA).setOnClickListener(new bmrh(this));  // id:fido_passkeys_cancel_button
        this.b = (RecyclerView)this.c.findViewById(0x7F0B1815);  // id:list
        bmqz bmqz0 = new bmqz(new bmri(this));
        lqi lqi0 = this.a.e;
        xnz xnz0 = (xnz)this.requireContext();
        Objects.requireNonNull(bmqz0);
        lqi0.g(xnz0, new bmrj(bmqz0));
        int v = fyho.c(this.requireContext(), 0x7F04033A, 0);  // attr:colorSurfaceContainerHigh
        bxot bxot0 = new bxot();
        bxot0.c = 0x7F0803F7;  // drawable:fido_bottom_border_filled
        bxot0.a = 0x7F08040E;  // drawable:fido_top_border_filled
        bxot0.b = 0x7F080405;  // drawable:fido_middle_border_filled
        bxot0.d = 0x7F08040A;  // drawable:fido_single_border
        bxot0.b(this.requireContext());
        bxot0.e = v;
        bxot0.f = Math.round(this.requireContext().getResources().getDisplayMetrics().density * 16.0f);
        bxou bxou0 = bxot0.a();
        this.b.an(bmqz0);
        this.b.A(bxou0);
        RecyclerView recyclerView0 = this.b;
        recyclerView0.r = true;
        this.requireContext();
        recyclerView0.ap(new LinearLayoutManager());
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(new bmrk(this));
        return this.c;
    }
}

