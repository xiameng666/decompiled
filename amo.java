import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class amo extends de {
    final Handler ag;
    final Runnable ah;
    amj ai;
    public int aj;
    public int ak;
    public ImageView al;
    TextView am;

    public amo() {
        this.ag = new Handler(Looper.getMainLooper());
        this.ah = new amk(this);
    }

    @Override  // de
    public final void onCancel(DialogInterface dialogInterface0) {
        this.ai.l(true);
    }

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        amj amj0 = alo.b(this, this.getArguments().getBoolean("host_activity", true));
        this.ai = amj0;
        if(amj0.y == null) {
            amj0.y = new lqi();
        }
        amj0.y.g(this, new amm(this));
        amj amj1 = this.ai;
        if(amj1.z == null) {
            amj1.z = new lqi();
        }
        amj1.z.g(this, new amn(this));
        this.aj = this.y(0x7F0402C1);  // attr:colorError
        this.ak = this.y(0x1010038);
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        iv iv0 = new iv(this.requireContext());
        iv0.setTitle(this.ai.g());
        View view0 = LayoutInflater.from(iv0.getContext()).inflate(0x7F0E03B1, null);  // layout:fingerprint_dialog_layout
        TextView textView0 = (TextView)view0.findViewById(0x7F0B13EC);  // id:fingerprint_subtitle
        if(textView0 != null) {
            CharSequence charSequence0 = this.ai.f();
            if(TextUtils.isEmpty(charSequence0)) {
                textView0.setVisibility(8);
            }
            else {
                textView0.setVisibility(0);
                textView0.setText(charSequence0);
            }
        }
        TextView textView1 = (TextView)view0.findViewById(0x7F0B13E8);  // id:fingerprint_description
        if(textView1 != null) {
            CharSequence charSequence1 = this.ai.c();
            if(TextUtils.isEmpty(charSequence1)) {
                textView1.setVisibility(8);
            }
            else {
                textView1.setVisibility(0);
                textView1.setText(charSequence1);
            }
        }
        this.al = (ImageView)view0.findViewById(0x7F0B13EA);  // id:fingerprint_icon
        this.am = (TextView)view0.findViewById(0x7F0B13E9);  // id:fingerprint_error
        amj amj0 = this.ai;
        CharSequence charSequence2 = ams.b(amj0.p) ? this.getString(0x7F15093D) : amj0.e();  // string:confirm_device_credential_password "Use password"
        iv0.o(charSequence2, new aml(this));
        iv0.setView(view0);
        Dialog dialog0 = iv0.create();
        dialog0.setCanceledOnTouchOutside(false);
        return dialog0;
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        this.ag.removeCallbacksAndMessages(null);
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        this.ai.x = 0;
        this.ai.r();
        this.ai.m(this.getString(0x7F1511F8));  // string:fingerprint_dialog_touch_sensor "Touch the fingerprint sensor"
    }

    private final int y(int v) {
        Context context0 = this.getContext();
        if(context0 == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(v, typedValue0, true);
        TypedArray typedArray0 = context0.obtainStyledAttributes(typedValue0.data, new int[]{v});
        int v1 = typedArray0.getColor(0, 0);
        typedArray0.recycle();
        return v1;
    }
}

