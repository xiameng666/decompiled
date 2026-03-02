import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;

public final class fbzy extends gcyu {
    public static fbzy A(Context context0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gevv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gevv)hftp0.b_message).k = 0;
        ((gevv)hftp0.b_message).b |= 0x80;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gevv gevv0 = (gevv)hftp0.b_message;
        "Cancel Purchase".getClass();
        gevv0.b |= 8;
        gevv0.f = "Cancel Purchase";
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gfgr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gfgr gfgr0 = (gfgr)hftp1.b_message;
        "Are you sure you want to cancel your purchase and lose any updates made to your account?".getClass();
        gfgr0.b |= 4;
        gfgr0.f = "Are you sure you want to cancel your purchase and lose any updates made to your account?";
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gevv gevv1 = (gevv)hftp0.b_message;
        gfgr gfgr1 = (gfgr)hftp1.N_build();
        gfgr1.getClass();
        hfuo hfuo0 = gevv1.g;
        if(!hfuo0.c()) {
            gevv1.g = ProtoLiteMessage.E(hfuo0);
        }
        gevv1.g.add(gfgr1);
        String s = context0.getString(0x1040013);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gevv gevv2 = (gevv)hftp0.b_message;
        s.getClass();
        gevv2.b |= 0x20;
        gevv2.i = s;
        String s1 = context0.getString(0x1040009);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gevv gevv3 = (gevv)hftp0.b_message;
        s1.getClass();
        gevv3.b |= 0x40;
        gevv3.j = s1;
        return fbzy.B(((gevv)hftp0.N_build()));
    }

    public static fbzy B(gevv gevv0) {
        fbzy fbzy0 = new fbzy();
        if(gevu.a(gevv0.k) != 0 && gevu.a(gevv0.k) != 1) {
            throw new IllegalArgumentException("ConfirmationDialogFragment should only be used for DEFAULT display type");
        }
        if(gevv0.g.size() == 0 && (gevv0.b & 16) == 0) {
            throw new IllegalArgumentException("At least one message or extra warning text must be provided.");
        }
        if(gevv0.i.isEmpty() && gevv0.j.isEmpty()) {
            throw new IllegalArgumentException("At least one button must be provided.");
        }
        Bundle bundle0 = new Bundle();
        gciq.j(bundle0, "argDialogProto", ((MessageLite)gevv0));
        fbzy0.setArguments(bundle0);
        return fbzy0;
    }

    private final Button D(int v, String s, int v1) {
        Button button0 = (Button)this.ah.findViewById(v);
        if(!TextUtils.isEmpty(s)) {
            button0.setVisibility(0);
            button0.setText(s);
            button0.setOnClickListener(new fbzx(this, v1));
        }
        return button0;
    }

    @Override  // de
    public final void onStart() {
        super.onStart();
        TextView textView0 = (TextView)this.ah.findViewById(0x7F0B22B8);  // id:title
        if(textView0 != null) {
            textView0.setSingleLine(false);
            textView0.setLineSpacing(this.getResources().getDimension(0x7F071473), 1.0f);  // dimen:wallet_confirmation_dialog_line_spacing_extra
        }
    }

    @Override  // gcyu
    protected final Dialog y() {
        if(hzmr.a.b().a()) {
            LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
            View view0 = layoutInflater0.inflate(0x7F0E0D27, null);  // layout:wallet_fragment_confirmation_dialog
            this.C(((LinearLayout)view0.findViewById(0x7F0B114C)), layoutInflater0);  // id:dialog_message_container
            gcxz gcxz0 = new gcxz(this.getContext());
            gcxz0.h(this.ag.f);
            gcxz0.i(view0);
            gcxz0.f(this.ag.i, this);
            gcxz0.d(this.ag.j, this);
            this.ah = (kc)gcxz0.a();
            this.ah.setOnShowListener(this);
            return this.ah;
        }
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(new int[]{0x7F0400B3});  // attr:alertDialogTheme
        int v = typedArray0.getResourceId(0, 0x7F160F21);  // style:Theme_Wallet_Material_Light_Alert_Dialog
        typedArray0.recycle();
        this.ah = new kc(this.getContext(), v);
        this.ah.setContentView(0x7F0E0D27);  // layout:wallet_fragment_confirmation_dialog
        this.ah.setTitle(this.ag.f);
        this.C(((LinearLayout)this.ah.findViewById(0x7F0B114C)), LayoutInflater.from(this.getContext()));  // id:dialog_message_container
        Button button0 = this.D(0x7F0B0DFD, this.ag.j, 2);  // id:cancel_button
        Button button1 = this.D(0x7F0B0F87, this.ag.i, 1);  // id:confirm_button
        button0.setTextColor(gdcb.b(this.getContext(), 0x7F040296));  // attr:colorAccent
        gdcb.I(this.getContext(), button1);
        return this.ah;
    }

    @Override  // gcyu
    protected final View z(LinearLayout linearLayout0, LayoutInflater layoutInflater0, gfgr gfgr0) {
        View view0 = (LinearLayout)layoutInflater0.inflate(0x7F0E0E1B, linearLayout0, false);  // layout:wallet_view_confirmation_dialog_text_with_image
        InfoMessageView infoMessageView0 = (InfoMessageView)((LinearLayout)view0).findViewById(0x7F0B171A);  // id:info_message_text
        infoMessageView0.r(this);
        infoMessageView0.p(gfgr0);
        infoMessageView0.setId(this.ak.a());
        ((ImageWithCaptionView)((LinearLayout)view0).findViewById(0x7F0B1719)).o(((gfgo)gfgr0.d.get(0)), gcio.c(this.getContext()));  // id:info_message_image
        return view0;
    }
}

