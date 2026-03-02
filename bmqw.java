import android.content.Context;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class bmqw extends FingerprintManager.AuthenticationCallback {
    public static final bboh a;
    final Runnable b;
    public final Context c;
    public final ImageView d;
    public final TextView e;
    public final bmqv f;
    public CancellationSignal g;
    private final Button h;
    private final Button i;
    private final boolean j;

    static {
        bmqw.a = bnaa.d("FingerprintUiHelper");
    }

    public bmqw(Context context0, ImageView imageView0, TextView textView0, Button button0, Button button1, boolean z, bmqv bmqv0) {
        this.b = new bmqs(this);
        this.c = context0;
        this.d = imageView0;
        this.e = textView0;
        this.h = button0;
        this.i = button1;
        this.j = z;
        this.f = bmqv0;
    }

    public final void a() {
        CancellationSignal cancellationSignal0 = this.g;
        if(cancellationSignal0 != null) {
            cancellationSignal0.cancel();
            this.g = null;
        }
    }

    public final boolean b() {
        FingerprintManager fingerprintManager0 = this.d();
        return fingerprintManager0 != null && fingerprintManager0.isHardwareDetected();
    }

    public final boolean c() {
        FingerprintManager fingerprintManager0 = this.d();
        return fingerprintManager0 != null && fingerprintManager0.hasEnrolledFingerprints();
    }

    private final FingerprintManager d() {
        return this.c.getPackageManager().hasSystemFeature("android.hardware.fingerprint") ? ((FingerprintManager)this.c.getSystemService("fingerprint")) : null;
    }

    private final void e(CharSequence charSequence0) {
        this.d.setImageResource(0x7F080D1C);
        TextView textView0 = this.e;
        textView0.setText(charSequence0);
        textView0.setTextColor(textView0.getResources().getColor(0x7F0602DB, null));  // color:fido_warning_color
        if(this.j) {
            textView0.requestFocus();
            textView0.sendAccessibilityEvent(0x8000);
            return;
        }
        textView0.removeCallbacks(this.b);
        textView0.postDelayed(this.b, 1600L);
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        if(this.g != null) {
            this.e(charSequence0);
            bmqt bmqt0 = new bmqt(this);
            this.d.postDelayed(bmqt0, 1600L);
        }
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationFailed() {
        this.e("Fingerprint not recognized. Try again");
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationHelp(int v, CharSequence charSequence0) {
        this.e(charSequence0);
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult fingerprintManager$AuthenticationResult0) {
        TextView textView0 = this.e;
        textView0.removeCallbacks(this.b);
        ImageView imageView0 = this.d;
        imageView0.setImageResource(0x7F0803FD);  // drawable:fido_ic_fingerprint_success
        textView0.setTextColor(textView0.getResources().getColor(0x7F0602D0, null));  // color:fido_success_color
        textView0.setText("Fingerprint recognized");
        if(this.j) {
            textView0.requestFocus();
            textView0.sendAccessibilityEvent(0x8000);
        }
        this.h.setClickable(false);
        this.i.setClickable(false);
        imageView0.postDelayed(new bmqu(this), 1300L);
    }
}

