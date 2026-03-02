import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.appinvite.AppInviteAcceptInvitationChimeraActivity;

public final class acap extends du {
    acaq a;
    boolean b;
    Intent c;

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            this.c = (Intent)bundle0.getParcelable("fdlIntent");
            this.b = bundle0.getBoolean("taskComplete");
        }
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        xob xob0 = (xob)this.getContext();
        if(this.b) {
            this.y(xob0);
            return;
        }
        if(this.a == null) {
            acaq acaq0 = new acaq(xob0, xob0.getIntent(), new acbc(null), this);
            this.a = acaq0;
            acaq0.execute(new Void[0]);
        }
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        Intent intent0 = this.c;
        if(intent0 != null) {
            bundle0.putParcelable("fdlIntent", intent0);
        }
        bundle0.putBoolean("taskComplete", this.b);
    }

    @Override  // du
    public final void onStop() {
        super.onStop();
        if(this.a != null && !((xob)this.getContext()).isChangingConfigurations()) {
            this.a.cancel(true);
            this.a = null;
        }
    }

    final void y(xob xob0) {
        if(this.b && this.isResumed()) {
            if(this.c != null && acfe.c(xob0, this.c)) {
                try {
                    if(acfe.d(this.c)) {
                        xob0.startActivityForResult(this.c, 0);
                        return;
                    }
                    String s = this.c.getPackage();
                    Intent intent0 = xob0.getIntent();
                    for(Object object0: xob0.getPackageManager().queryIntentActivities(acfe.a, 0xF0000)) {
                        if(TextUtils.equals(s, ((ResolveInfo)object0).activityInfo.packageName)) {
                            String s1 = intent0.hasExtra("com.android.browser.application_id") ? intent0.getStringExtra("com.android.browser.application_id") : "";
                            if(s1 == null || !TextUtils.equals(s1, s)) {
                                Intent intent1 = this.c;
                                Intent intent2 = new Intent("android.intent.action.PICK_ACTIVITY");
                                intent2.putExtra("android.intent.extra.INTENT", intent1);
                                xob0.startActivityForResult(intent2, 1);
                                return;
                            }
                            break;
                        }
                    }
                    xob0.startActivity(this.c);
                    xob0.finish();
                }
                catch(ActivityNotFoundException activityNotFoundException0) {
                    a.ae(AppInviteAcceptInvitationChimeraActivity.j.i(), "Activity not found to handle Intent action", activityNotFoundException0);
                    xob0.finish();
                }
                return;
            }
            xob0.finish();
        }
    }
}

