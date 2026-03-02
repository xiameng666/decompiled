import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.common.api.Status;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j..util.Objects;

public final class bmqj extends fyfx {
    static final ggeo ag;
    public static final ggeo ah;
    public bmuz ai;
    public bxpb aj;
    public BottomSheetBehavior ak;
    private View al;

    static {
        ggek ggek0 = new ggek();
        Integer integer0 = (int)5;
        ggek0.i(integer0, "creation");
        Integer integer1 = (int)2;
        ggek0.i(integer1, "passkeys_selection_multiple");
        Integer integer2 = (int)1;
        ggek0.i(integer2, "passkeys_selection_single");
        Integer integer3 = (int)3;
        ggek0.i(integer3, "passkeys_decrypt");
        Integer integer4 = (int)9;
        ggek0.i(integer4, "not_found");
        Integer integer5 = (int)10;
        ggek0.i(integer5, "account_selection");
        Integer integer6 = (int)6;
        ggek0.i(integer6, "creation_error");
        Integer integer7 = (int)7;
        ggek0.i(integer7, "creation_error_no_lskf");
        Integer integer8 = (int)16;
        ggek0.i(integer8, "authentication_error");
        Integer integer9 = (int)8;
        ggek0.i(integer9, "creation_consent");
        Integer integer10 = (int)11;
        ggek0.i(integer10, "nfc_key_discovered");
        Integer integer11 = (int)12;
        ggek0.i(integer11, "nfc_remove_key");
        Integer integer12 = (int)17;
        ggek0.i(integer12, "lockscreen_prompt");
        Integer integer13 = (int)18;
        ggek0.i(integer13, "lockscreen_error");
        Integer integer14 = (int)19;
        ggek0.i(integer14, "secure_transaction");
        bmqj.ag = ggek0.b();
        ggek ggek1 = new ggek();
        ggek1.i(integer0, new bmqa());
        ggek1.i(integer2, new bmqg());
        ggek1.i(integer1, new bmqh());
        ggek1.i(integer3, new bmqi());
        ggek1.i(integer4, new bmpq());
        ggek1.i(integer5, new bmpr());
        ggek1.i(integer6, new bmps());
        ggek1.i(integer7, new bmpt());
        ggek1.i(integer8, new bmpu());
        ggek1.i(integer9, new bmpv());
        ggek1.i(integer10, new bmqb());
        ggek1.i(integer11, new bmqc());
        ggek1.i(integer12, new bmqd());
        ggek1.i(integer13, new bmqe());
        ggek1.i(integer14, new bmqf());
        bmqj.ah = ggek1.b();
    }

    public final void A(blhf blhf0) {
        int v = this.requireArguments().getInt("session_id", 0);
        if(v == 0) {
            return;
        }
        bnad bnad0 = new bnad();
        bnad0.a = bnaf.b;
        bnad0.b = v;
        bnad0.e = blwt.m(this.ai.x) ? "FIDO2_CHIMERA_ACTIVITY_REGISTRATION" : "FIDO2_CHIMERA_ACTIVITY_ASSERTION";
        bnae bnae0 = bnad0.a();
        new bnah(this.al.getContext()).n(bnae0, blhf0);
    }

    public final void B(boolean z) {
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                if(z) {
                    window0.addFlags(2);
                    return;
                }
                window0.clearFlags(2);
            }
        }
    }

    private final DisplayMetrics C() {
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        ((xnz)this.requireContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics0);
        return displayMetrics0;
    }

    private final void D(Bundle bundle0) {
        this.ai = (bmuz)new lso(((xnz)this.requireContext())).a(bmuz.class);
        if(!hsvd.c()) {
            this.z();
        }
        this.aj = new bxpb(this.getChildFragmentManager(), this.al, this.C().heightPixels, new bmpw(), bundle0);
        this.ai.f.g(((xnz)this.requireContext()), new bmpx(this));
        this.ai.c.g(((xnz)this.requireContext()), new bmpy(this));
        this.ai.g.g(((xnz)this.requireContext()), new bmpz(this));
    }

    @Override  // de
    public final int getTheme() {
        return 0x7F160401;  // style:FidoBottomSheetDialogDayNightTheme
    }

    @Override  // de
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        if(hsvd.c()) {
            this.D(bundle0);
        }
    }

    @Override  // de
    public final void onCancel(DialogInterface dialogInterface0) {
        blhf blhf0;
        if(!((xnz)this.requireContext()).isChangingConfigurations()) {
            Integer integer0 = (Integer)this.ai.g.ij();
            if(integer0 == null) {
                this.A(blhf.a);
            }
            else {
                switch(((int)integer0)) {
                    case 1: {
                        blhf0 = blhf.o;
                        break;
                    }
                    case 2: {
                        blhf0 = blhf.q;
                        break;
                    }
                    case 3: {
                        blhf0 = blhf.m;
                        break;
                    }
                    case 5: {
                        blhf0 = blhf.c;
                        break;
                    }
                    case 6: {
                        blhf0 = blhf.X;
                        break;
                    }
                    case 7: {
                        blhf0 = blhf.V;
                        break;
                    }
                    case 8: {
                        blhf0 = blhf.j;
                        break;
                    }
                    case 9: {
                        blhf0 = blhf.aa;
                        break;
                    }
                    case 10: {
                        blhf0 = blhf.g;
                        break;
                    }
                    case 16: {
                        blhf0 = blhf.ac;
                        break;
                    }
                    case 17: {
                        blhf0 = blhf.Q;
                        break;
                    }
                    case 19: {
                        blhf0 = blhf.S;
                        break;
                    }
                    default: {
                        blhf0 = blhf.a;
                    }
                }
                this.A(blhf0);
            }
            if(Objects.equals(integer0, Integer.valueOf(19))) {
                this.ai.w(new bmuy(Status.f, gfqx.a));
                return;
            }
            if(Objects.equals(integer0, Integer.valueOf(7))) {
                this.ai.z(Boolean.valueOf(true));
                return;
            }
            if(Objects.equals(integer0, Integer.valueOf(6))) {
                this.ai.z(Boolean.valueOf(true));
                return;
            }
            if(Objects.equals(integer0, Integer.valueOf(16))) {
                this.ai.z(Boolean.valueOf(true));
                return;
            }
            this.ai.q(new bmux(Status.f, gfqx.a, gfqx.a, gfqx.a, gfqx.a, gfqx.a));
        }
    }

    @Override  // du
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.z();
    }

    @Override  // fyfx
    public final Dialog onCreateDialog(Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        fyfv fyfv0 = (fyfv)dialog0;
        fyfv0.setOnShowListener(new bmpp(this, fyfv0));
        return dialog0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.al = layoutInflater0.inflate(0x7F0E037D, viewGroup0, false);  // layout:fido_bottom_sheet
        if(!hsvd.c()) {
            this.D(bundle0);
        }
        return this.al;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        if(hsvd.c()) {
            this.z();
        }
    }

    @Override  // de
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.aj.d(bundle0);
    }

    public static bmqj y(int v, int v1) {
        bmqj bmqj0 = new bmqj();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("start_ui", v1);
        bundle0.putInt("session_id", v);
        bmqj0.setArguments(bundle0);
        return bmqj0;
    }

    public final void z() {
        int v2;
        if(this.isAdded()) {
            int v = this.C().widthPixels;
            int v1 = this.getResources().getDimensionPixelSize(0x7F07065B);  // dimen:fido_bottom_sheet_gm3_lower_width_threshold
            if(v > this.getResources().getDimensionPixelSize(0x7F07065D)) {  // dimen:fido_bottom_sheet_gm3_upper_width_threshold
                v2 = this.getResources().getDimensionPixelSize(0x7F07065A);  // dimen:fido_bottom_sheet_gm3_adjusted_larger_width
            }
            else if(v > v1) {
                int v3 = this.getResources().getDimensionPixelSize(0x7F07065C);  // dimen:fido_bottom_sheet_gm3_side_margins
                v2 = v - (v3 + v3);
            }
            else {
                v2 = -1;
            }
            Dialog dialog0 = this.getDialog();
            if(dialog0 != null) {
                Window window0 = dialog0.getWindow();
                if(window0 != null) {
                    window0.setLayout(v2, -1);
                }
            }
        }
    }
}

