import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;
import j..util.Optional;

public final class cscu extends du {
    public static final int a;
    private xob b;

    static {
        bboh.b("MobileDataPlan", bbcu.ck);
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.b = (xob)context0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0532, viewGroup0, false);  // layout:loading_caption_view
        if(((String)Optional.ofNullable(this.getArguments()).map(new csct()).orElse("start_esim")).equals("start_mpd")) {
            ((TextView)view0.findViewById(0x7F0B183A)).setText(this.getString(0x7F150F80));  // id:loading_caption
            return view0;
        }
        MobileDataPlanDetailChimeraActivity.a(this, this.b);
        ((TextView)view0.findViewById(0x7F0B183A)).setText(this.getString(0x7F150F7F));  // id:loading_caption
        return view0;
    }
}

