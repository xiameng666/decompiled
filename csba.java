import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class csba implements View.OnClickListener {
    public final csbe a;

    public csba(csbe csbe0) {
        this.a = csbe0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        csbe csbe0 = this.a;
        if(hvlq.h()) {
            csbe0.y();
            return;
        }
        if(cjmf.b(csbe0.a, "android.permission.WRITE_EMBEDDED_SUBSCRIPTIONS") == 0 && !cslj.a()) {
            csbe0.y();
            return;
        }
        View view1 = csbe0.getView();
        batl.s(view1);
        view1.findViewById(0x7F0B12CF).setVisibility(0);  // id:esim_instruction_page
        view1.findViewById(0x7F0B12BE).setVisibility(8);  // id:esim_download_page
        TextView textView0 = (TextView)view1.findViewById(0x7F0B12D3);  // id:esim_instruction_title
        String s = csbe0.c.getString("esim_carrier_name");
        batl.s(s);
        textView0.setText(csbe0.getString(0x7F150F74, new Object[]{s}));  // string:esim_instruction_title "Instructions to set up %s as primary SIM"
        ImageView imageView0 = (ImageView)view1.findViewById(0x7F0B12CC);  // id:esim_instruction_gif
        txc.d(csbe0.a).h(hvlq.a.d().h()).k(imageView0);
        ((Button)view1.findViewById(0x7F0B12CE)).setOnClickListener(new csbc(csbe0));  // id:esim_instruction_next_button
        csbe0.a.getOnBackPressedDispatcher().c(csbe0, new csbd(csbe0));
        csbe0.b.l(hhct.en);
    }
}

