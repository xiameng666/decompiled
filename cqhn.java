import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.google.android.gms.mdm.BaseLockscreenChimeraActivity.1;

public abstract class cqhn extends xob implements View.OnClickListener {
    protected static final IntentFilter j;
    public ImageButton k;
    protected String l;
    protected lvj m;
    protected final BroadcastReceiver n;

    static {
        cqhn.j = new IntentFilter("com.google.android.gms.mdm.DISMISS_MESSAGE");
    }

    public cqhn() {
        this.n = new BaseLockscreenChimeraActivity.1(this);
    }

    public static Intent a(Context context0, String s, String s1, boolean z) {
        Intent intent0 = new Intent().setComponent(new ComponentName(context0, (hxwi.d() ? "com.google.android.gms.mdm.LockscreenBc25Activity" : "com.google.android.gms.mdm.LockscreenActivity")));
        intent0.putExtra("lock_message", s);
        if(!TextUtils.isEmpty(s1)) {
            intent0.putExtra("phone_number", s1);
        }
        intent0.setFlags(0x50800000);
        if(z) {
            intent0.addFlags(0x20000000);
            return intent0;
        }
        intent0.addFlags(0x4000000);
        return intent0;
    }
}

