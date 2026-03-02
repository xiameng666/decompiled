import android.os.Bundle;
import com.google.android.gms.wearable.backup.phone.RestoreFlowChimeraActivity;

public final class fckp implements lqj {
    public final RestoreFlowChimeraActivity a;

    public fckp(RestoreFlowChimeraActivity restoreFlowChimeraActivity0) {
        this.a = restoreFlowChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        RestoreFlowChimeraActivity.j.h("OnStateChange: " + ((fclm)object0), new Object[0]);
        Bundle bundle0 = new Bundle();
        RestoreFlowChimeraActivity restoreFlowChimeraActivity0 = this.a;
        bundle0.putParcelable("theme", restoreFlowChimeraActivity0.s);
        nry nry0 = restoreFlowChimeraActivity0.r;
        gftb.check(nry0);
        switch(((fclm)object0).ordinal()) {
            case 0: {
                nry0.j(0x7F0B1838, bundle0);  // id:loading_accounts_fragment
                return;
            }
            case 2: {
                nry0.j(0x7F0B1F8D, bundle0);  // id:select_backup_fragment
                return;
            }
            case 4: {
                nry0.j(0x7F0B10BF, bundle0);  // id:decrypt_backup_fragment
                return;
            }
            case 6: {
                nry0.j(0x7F0B1E55, bundle0);  // id:request_charging_fragment
                return;
            }
            case 7: {
                nry0.j(0x7F0B1E70, bundle0);  // id:restore_start_fragment
                return;
            }
            case 8: 
            case 9: 
            case 10: {
                restoreFlowChimeraActivity0.finish();
            }
        }
    }
}

