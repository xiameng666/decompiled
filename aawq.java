import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.accountsettings.utils.ButtonConfig;
import java.util.regex.Pattern;

public final class aawq extends de {
    static final Pattern ag;
    ViewGroup ah;
    public aawp ai;
    boolean aj;

    static {
        new baun("AccountSettings", new String[]{"MessageDialog"});
        aawq.ag = Pattern.compile("myaccount\\.google\\.com");
    }

    public aawq() {
        this.aj = false;
    }

    private final void A(ViewGroup viewGroup0) {
        Bundle bundle0 = this.getArguments();
        gftb.check(bundle0);
        TextView textView0 = (TextView)viewGroup0.findViewById(0x7F0B0BF1);  // id:as_message_title
        CharSequence charSequence0 = bundle0.getCharSequence("titleText");
        if(TextUtils.isEmpty(charSequence0)) {
            textView0.setVisibility(8);
        }
        else {
            textView0.setVisibility(0);
            textView0.setText(charSequence0);
        }
        TextView textView1 = (TextView)viewGroup0.findViewById(0x7F0B0BF0);  // id:as_message_text
        CharSequence charSequence1 = bundle0.getCharSequence("msgText");
        gftb.check(charSequence1);
        textView1.setVisibility(0);
        textView1.setText(charSequence1);
        if(this.getString(0x7F1500F2).contentEquals(charSequence1)) {  // string:accountsettings_missing_account "Add one now or use myaccount.google.com 
                                                                       // to manage some settings without an account."
            Linkify.addLinks(textView1, aawq.ag, "https://");
        }
        String s = aawq.C(bundle0, "neutralBtn");
        Button button0 = (Button)viewGroup0.findViewById(0x7F0B0DB9);  // id:button_neutral
        if(TextUtils.isEmpty(s)) {
            button0.setVisibility(8);
        }
        else {
            button0.setText(s);
            button0.setVisibility(0);
            button0.setOnClickListener(new aawm(this));
        }
        String s1 = aawq.C(bundle0, "negativeBtn");
        Button button1 = (Button)viewGroup0.findViewById(0x7F0B0DB8);  // id:button_negative
        if(TextUtils.isEmpty(s1)) {
            button1.setVisibility(8);
        }
        else {
            button1.setText(s1);
            button1.setVisibility(0);
            button1.setOnClickListener(new aawn(this));
        }
        String s2 = aawq.C(bundle0, "positiveBtn");
        Button button2 = (Button)viewGroup0.findViewById(0x7F0B0DBC);  // id:button_positive
        if(!TextUtils.isEmpty(s2)) {
            button2.setText(s2);
            button2.setVisibility(0);
            button2.setOnClickListener(new aawo(this));
            return;
        }
        button2.setVisibility(8);
    }

    private static final View B(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        View view0 = layoutInflater0.inflate(0x7F0E00D6, viewGroup0, false);  // layout:as_message_dialog
        kfe.m(view0);
        view0.setImportantForAccessibility(1);
        return view0;
    }

    private static final String C(Bundle bundle0, String s) {
        ButtonConfig buttonConfig0 = aawq.z(bundle0, s);
        return buttonConfig0 == null ? null : buttonConfig0.a;
    }

    @Override  // de
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        if(!(context0 instanceof aawp)) {
            throw new IllegalStateException("Needs to implement OnClickListener");
        }
        this.ai = (aawp)context0;
    }

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setCancelable(true);
        if(bundle0 != null) {
            this.aj = bundle0.getBoolean("shownAsDialog", this.aj);
        }
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        this.ah = (ViewGroup)aawq.B(((xob)this.requireContext()).getLayoutInflater(), null);
        iv iv0 = new iv(this.requireContext());
        iv0.setView(this.ah);
        iv0.c(true);
        return iv0.create();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        if(this.aj) {
            this.A(this.ah);
            return null;
        }
        return aawq.B(layoutInflater0, viewGroup0);
    }

    @Override  // de
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        if(this.aj) {
            bundle0.putBoolean("shownAsDialog", true);
        }
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ViewGroup viewGroup0 = (ViewGroup)view0;
        this.ah = viewGroup0;
        this.A(viewGroup0);
    }

    @Override  // de
    public final void show(fm fm0, String s) {
        this.aj = true;
        super.show(fm0, s);
    }

    public static aawq y(CharSequence charSequence0, CharSequence charSequence1, ButtonConfig buttonConfig0, ButtonConfig buttonConfig1) {
        Bundle bundle0 = new Bundle();
        if(!TextUtils.isEmpty(charSequence0)) {
            bundle0.putCharSequence("titleText", charSequence0);
        }
        bundle0.putCharSequence("msgText", charSequence1);
        if(buttonConfig0 != null) {
            bundle0.putParcelable("negativeBtn", buttonConfig0);
        }
        bundle0.putParcelable("positiveBtn", buttonConfig1);
        aawq aawq0 = new aawq();
        aawq0.setArguments(bundle0);
        return aawq0;
    }

    public static final ButtonConfig z(Bundle bundle0, String s) {
        Parcelable parcelable0 = bundle0 == null ? null : bundle0.getParcelable(s);
        return (parcelable0 instanceof ButtonConfig) ? ((ButtonConfig)parcelable0) : null;
    }
}

