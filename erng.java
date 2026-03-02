import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.setupdesign.GlifLayout;

public final class erng extends du {
    public int a;
    private String ag;
    private String ah;
    private String ai;
    Drawable b;
    public ernf c;
    private GlifLayout d;

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        du du0 = this.getParentFragment();
        if(du0 != null) {
            try {
                this.c = (ernf)du0;
                return;
            }
            catch(ClassCastException classCastException0) {
                throw new RuntimeException("Containing fragment must implement WifiPasswordFragment.Listener", classCastException0);
            }
        }
        try {
            this.c = (ernf)context0;
        }
        catch(ClassCastException classCastException1) {
            throw new RuntimeException("Containing activity must implement WifiPasswordFragment.Listener", classCastException1);
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            bundle1 = Bundle.EMPTY;
        }
        this.a = bundle1.getInt("smartdevice.id");
        String s = bundle1.getString("smartdevice.title");
        batl.s(s);
        this.ag = s;
        String s1 = bundle1.getString("smartdevice.message");
        batl.s(s1);
        this.ah = s1;
        this.ai = bundle1.getString("smartdevice.nextButtonText");
        if(bundle1.containsKey("icon")) {
            this.b = this.requireContext().getDrawable(bundle1.getInt("icon"));
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        if(hoxb.d()) {
            Context context0 = this.getContext();
            batl.s(context0);
            layoutInflater0 = layoutInflater0.cloneInContext(context0);
            layoutInflater0.setFactory2(new bagp());
        }
        GlifLayout glifLayout0 = (GlifLayout)layoutInflater0.inflate(0x7F0E09E6, viewGroup0, false);  // layout:smartdevice_glif_text_confirmation
        this.d = glifLayout0;
        gaff gaff0 = (gaff)glifLayout0.t(gaff.class);
        gafg gafg0 = new gafg(this.d.getContext());
        gafg0.b(0x7F152F99);  // string:sud_next_button_label "Next"
        gafg0.c = 5;
        gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
        gaff0.c(gafg0.a());
        return this.d;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        this.d.b(this.ag);
        Drawable drawable0 = this.b;
        if(drawable0 != null) {
            this.d.M(drawable0);
        }
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0F8A);  // id:confirmation_text
        if(hoxb.d()) {
            this.d.K(this.ah);
            textView0.setVisibility(8);
        }
        else {
            textView0.setText(this.ah);
        }
        gafh gafh0 = ((gaff)this.d.t(gaff.class)).k;
        gafh0.d(this.ai);
        gafh0.f = new erne(this);
    }

    public static erng y(String s, String s1, String s2) {
        return erng.z(s, s1, s2, null);
    }

    public static erng z(String s, String s1, String s2, Integer integer0) {
        batl.s(s);
        batl.s(s1);
        batl.s(s2);
        erng erng0 = new erng();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("smartdevice.id", 0);
        bundle0.putString("smartdevice.title", s);
        bundle0.putString("smartdevice.message", s1);
        bundle0.putString("smartdevice.nextButtonText", s2);
        bundle0.putBoolean("showButton", true);
        if(integer0 != null) {
            bundle0.putInt("icon", 0x7F080B4A);
        }
        erng0.setArguments(bundle0);
        return erng0;
    }
}

