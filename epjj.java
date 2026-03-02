import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.LinearLayout.LayoutParams;

public final class epjj implements TextWatcher {
    public boolean a;
    final epjk b;
    private String c;

    public epjj(epjk epjk0) {
        this.b = epjk0;
        super();
        this.c = "";
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        if(!this.a) {
            String s = String.valueOf(editable0);
            if(!ibuq.m(s, this.c)) {
                if(s.length() == 0) {
                    this.b.y();
                    return;
                }
                this.c = s;
                epjk epjk0 = this.b;
                epji epji0 = epjk0.a;
                RecyclerView recyclerView0 = null;
                if(epji0 == null) {
                    ibuq.j("adapter");
                    epji0 = null;
                }
                ibuq.f(s, "query");
                icbb.b(iccl.b(cclw.e), null, null, new epjh(epji0, s, null), 3);
                if(epjk0.c != 0) {
                    RecyclerView recyclerView1 = epjk0.b;
                    if(recyclerView1 == null) {
                        ibuq.j("recyclerView");
                    }
                    else {
                        recyclerView0 = recyclerView1;
                    }
                    recyclerView0.setLayoutParams(new LinearLayout.LayoutParams(-1, ((int)(((double)epjk0.c) * 0.3))));
                }
            }
        }
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }
}

