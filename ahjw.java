import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.android.gms.auth.api.credentials.yolo.ui.AccountChipView;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;
import j..util.Objects;

public final class ahjw implements gmbg {
    final CredentialPickerChimeraActivity a;

    public ahjw(CredentialPickerChimeraActivity credentialPickerChimeraActivity0) {
        Objects.requireNonNull(credentialPickerChimeraActivity0);
        this.a = credentialPickerChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.a.m(0, 2);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        TextView textView0;
        if(((gged_interceptors)object0).isEmpty()) {
            this.a.m(1002, 102);
            return;
        }
        CredentialPickerChimeraActivity credentialPickerChimeraActivity0 = this.a;
        credentialPickerChimeraActivity0.n = gfsx.m(((gged_interceptors)object0));
        credentialPickerChimeraActivity0.o.clear();
        credentialPickerChimeraActivity0.o.addAll(gged_interceptors.h(gggq.j(((gged_interceptors)object0), new ahjo())));
        credentialPickerChimeraActivity0.o.notifyDataSetChanged();
        if(credentialPickerChimeraActivity0.l.i()) {
            textView0 = (TextView)credentialPickerChimeraActivity0.findViewById(0x7F0B104A);  // id:credentials_picker_title
            String s = credentialPickerChimeraActivity0.j;
            batl.q(s);
            String s1 = Uri.parse(s).getHost();
            batl.s(s1);
            textView0.setText(String.format("Choose a %1$s account saved with Google Smart Lock", aenh.a(credentialPickerChimeraActivity0, s1)));
        }
        else {
            textView0 = (TextView)credentialPickerChimeraActivity0.findViewById(0x7F0B1046);  // id:credentials_hint_picker_title
        }
        textView0.setVisibility(0);
        AccountChipView accountChipView0 = (AccountChipView)credentialPickerChimeraActivity0.findViewById(0x7F0B0B11);  // id:add_account
        if(credentialPickerChimeraActivity0.a().b) {
            ahjc ahjc0 = new ahjc();
            ahjc0.a(0x7F0806AA, true);
            ahjc0.d = "Add account";
            accountChipView0.b(new ahjd(ahjc0));
            accountChipView0.setOnClickListener(credentialPickerChimeraActivity0);
            accountChipView0.setVisibility(0);
        }
        else {
            accountChipView0.setVisibility(8);
        }
        View view0 = credentialPickerChimeraActivity0.findViewById(0x7F0B0DF8);  // id:cancel
        View view1 = credentialPickerChimeraActivity0.findViewById(0x7F0B0DA2);  // id:button_area
        if(credentialPickerChimeraActivity0.a().c) {
            view1.setVisibility(0);
            view0.setOnClickListener(credentialPickerChimeraActivity0);
        }
        else {
            view1.setVisibility(8);
        }
        if(credentialPickerChimeraActivity0.m.i()) {
            credentialPickerChimeraActivity0.g(((InternalCredentialWrapper)credentialPickerChimeraActivity0.m.d()));
            return;
        }
        credentialPickerChimeraActivity0.p.setEnabled(true);
        credentialPickerChimeraActivity0.q.stop();
        credentialPickerChimeraActivity0.findViewById(0x7F0B1D45).setVisibility(8);  // id:progress_indicator_container
    }
}

