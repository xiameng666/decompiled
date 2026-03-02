import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.wearable.backup.wear.KeyRecoveryChimeraActivity;
import j..util.Optional;

public final class fcoy implements Runnable {
    public final fcpc a;
    public final Integer b;

    public fcoy(fcpc fcpc0, Integer integer0) {
        this.a = fcpc0;
        this.b = integer0;
    }

    @Override
    public final void run() {
        KeyRecoveryChimeraActivity keyRecoveryChimeraActivity0 = this.a.b;
        keyRecoveryChimeraActivity0.c(this.a.a, true);
        Toast toast0 = Toast.makeText(keyRecoveryChimeraActivity0, keyRecoveryChimeraActivity0.getString((keyRecoveryChimeraActivity0.m.equals(aktu.b) ? 0x7F1535E6 : 0x7F1535E5)), 0);  // string:wear_backup_key_recovery_wrong_pin "Wrong PIN"
        View view0 = toast0.getView();
        if(view0 != null) {
            ((TextView)view0.findViewById(0x102000B)).setTextColor(keyRecoveryChimeraActivity0.getColor(0x7F061396));  // color:wearable_pattern_toast_text_color
        }
        toast0.show();
        Integer integer0 = (Integer)Optional.ofNullable(this.b).orElse(Integer.valueOf(keyRecoveryChimeraActivity0.q + 1));
        keyRecoveryChimeraActivity0.q = (int)integer0;
        KeyRecoveryChimeraActivity.j.j("onInvalidLskf, attempts used: %d", new Object[]{integer0});
        int v = keyRecoveryChimeraActivity0.p - keyRecoveryChimeraActivity0.q;
        switch(v) {
            case 2: {
                v = 2;
                break;
            }
            case 5: {
                break;
            }
            default: {
                return;
            }
        }
        Integer integer1 = v;
        String s = keyRecoveryChimeraActivity0.getString(0x7F1535E1, new Object[]{integer1});  // string:wear_backup_key_recovery_danger_title "%1$d attempts left"
        String s1 = keyRecoveryChimeraActivity0.getString(0x7F1535E0, new Object[]{((int)keyRecoveryChimeraActivity0.q), integer1});  // string:wear_backup_key_recovery_danger_body "You entered an incorrect screen lock 
                                                                                                                                      // %1$d times. After %2$d more attempts, your backup will be deleted."
        keyRecoveryChimeraActivity0.s = true;
        keyRecoveryChimeraActivity0.r.b(new fctb(s, s1, 1, bbqa.a()));
    }
}

