import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class bmvb extends fyfx implements DialogInterface.OnKeyListener {
    public blrs ag;
    private bnaj ah;
    private bnae ai;

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        this.setStyle(0, 0x7F1615EA);  // style:fingerprintDialog
        super.onCreate(bundle0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.requireDialog().getWindow().setBackgroundDrawableResource(0x7F08041A);  // drawable:fingerprint_dialog_background
        this.requireDialog().setOnKeyListener(this);
        bnad bnad0 = new bnad();
        bnad0.a = bnaf.s;
        bnad0.b = this.getArguments().getInt("SESSION_ID");
        this.ai = bnad0.a();
        this.ah = bnai.b(this.requireContext());
        TextView textView0 = (TextView)this.requireDialog().findViewById(0x1020016);
        textView0.setText(0x7F1511CD);  // string:fido_strong_box_dialog_title "Verify your identity"
        textView0.setGravity(17);
        textView0.setTextAlignment(4);
        View view0 = layoutInflater0.inflate(0x7F0E03A6, viewGroup0, false);  // layout:fido_strongbox_dialog_container
        Button button0 = (Button)view0.findViewById(0x7F0B0DFD);  // id:cancel_button
        button0.setOnClickListener(new bmva(this));
        button0.setText(0x7F1507F2);  // string:common_cancel "Cancel"
        return view0;
    }

    @Override  // de
    public final void onDismiss(DialogInterface dialogInterface0) {
        super.onDismiss(dialogInterface0);
        this.ah.b(this.ai, blgt.I);
        this.ag.a(new bmby("User cancelled"));
    }

    @Override  // android.content.DialogInterface$OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
        if(v == 25 && keyEvent0.getAction() == 0) {
            this.ah.b(this.ai, blgt.H);
            this.ag.b(bmhg.e);
            return true;
        }
        return false;
    }
}

