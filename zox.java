import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public final class zox extends aaeo {
    public final View a;
    public final LinearLayout e;
    public final aauk f;

    public zox(Context context0, View view0, List list0, aacf aacf0, LinearLayout linearLayout0, zem zem0, aauk aauk0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(new zot(((grug)object0)));
        }
        super(context0, arrayList0, aacf0, zem0);
        this.e = linearLayout0;
        this.f = aauk0;
        this.a = view0;
    }

    @Override  // tk
    public final int dx(int v) {
        return 0x7F0E00B9;  // layout:as_card_action_chip
    }

    @Override  // aaeo
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new zow(this, LayoutInflater.from(this.i).inflate(v, viewGroup0, false), this.j);
    }
}

