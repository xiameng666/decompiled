import android.content.Context;
import android.widget.TextView;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.ui.AccountChipView;
import com.google.android.gms.common.widget.phone.SnackbarLayout;

public final class ahka {
    public static void a(Context context0, SnackbarLayout snackbarLayout0, Credential credential0) {
        AccountChipView accountChipView0 = (AccountChipView)snackbarLayout0.findViewById(0x7F0B0A69);  // id:account_chip_view
        if(accountChipView0 != null) {
            accountChipView0.b(ahjd.a(credential0));
        }
        TextView textView0 = (TextView)snackbarLayout0.findViewById(0x7F0B1044);  // id:credentials_auto_signin_tv_title
        if(textView0 != null) {
            textView0.setText(String.format("Signed in as %1$s", credential0.a).trim());
            return;
        }
        accountChipView0.c("Google Smart Lock");
    }
}

