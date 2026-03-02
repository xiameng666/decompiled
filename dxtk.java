import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class dxtk extends dokz {
    public Button a;
    private String b;
    private String c;

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            throw new IllegalStateException("need arguments!");
        }
        this.b = gfta.b(bundle1.getString("arg_button_title"));
        this.c = gfta.b(bundle1.getString("arg_notice_text"));
        if(bundle0 != null) {
            this.b = bundle0.getString("arg_button_title", this.b);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate((edrq.b(this.requireContext()).a().a ? 0x7F0E0C9B : 0x7F0E006C), viewGroup0, false);  // layout:wallet_add_money_notice_fragment
        TextView textView0 = (TextView)view0.findViewById(0x7F0B05FE);  // id:Notice
        if(!TextUtils.isEmpty(this.c)) {
            textView0.setText(this.c);
        }
        Button button0 = (Button)view0.findViewById(0x7F0B0040);  // id:AddMoneyButton
        this.a = button0;
        button0.setText(this.b);
        this.a.setOnClickListener(new dxti(this));
        return view0;
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putString("arg_button_title", this.b);
    }

    public final void y() {
        this.a.setEnabled(false);
    }

    public final void z(String s) {
        this.b = s;
        this.a.setText(s);
    }
}

