import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;

public final class blwf extends du implements View.OnClickListener {
    public static final int a;

    static {
        bnaa.f("AuthenticatorAccountRiskFragment");
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        blwe blwe0 = (blwe)new lso(((xnz)this.requireContext())).a(blwe.class);
        if(view0.getId() == 0x7F0B13AD) {  // id:fido_paask_change_password_button
            blwe0.e.ii(Boolean.valueOf(true));
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        String s = this.getArguments().getString("account_name");
        View view0 = layoutInflater0.inflate(0x7F0E0391, viewGroup0, false);  // layout:fido_paask_approval_prompt_no
        view0.findViewById(0x7F0B13AD).setOnClickListener(this);  // id:fido_paask_change_password_button
        blwo.a(this.requireContext(), s, ((Chip)view0.findViewById(0x7F0B13B7)));  // id:fido_paask_user
        return view0;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        xnz xnz0 = (xnz)this.requireContext();
        xnz0.setTitle(this.getText(0x7F15117D));  // string:fido_paask_header "Are you trying to sign in?"
        xnz0.getWindow().getDecorView().sendAccessibilityEvent(0x20);
    }
}

