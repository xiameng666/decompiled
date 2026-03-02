import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.people.sync.coreui.ContactsSyncCoreChimeraActivity;

public final class egta implements lqj {
    public final ContactsSyncCoreChimeraActivity a;

    public egta(ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity0) {
        this.a = contactsSyncCoreChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ContactsSyncCoreChimeraActivity contactsSyncCoreChimeraActivity0 = this.a;
        fntm fntm0 = (fntm)contactsSyncCoreChimeraActivity0.k.c.ij();
        ca ca0 = new ca(contactsSyncCoreChimeraActivity0.getSupportFragmentManager());
        ca0.B(0x7F010003, 0x7F010004, 0x7F010003, 0x7F010004);  // anim:abc_popup_enter
        boolean z = true;
        switch(((int)(((Integer)object0)))) {
            case 0: {
                ca0.z(0x7F0B1E9F, new egtw(), "SyncCoreFragment");  // id:root
                break;
            }
            case 1: {
                ca0.z(0x7F0B1E9F, new egrw(), "AccountSyncFragment");  // id:root
                break;
            }
            case 2: {
                ca0.z(0x7F0B1E9F, egsq.y(false), "BackupSyncFragment");  // id:root
                break;
            }
            case 3: {
                if(fntm0 != null) {
                    Account account0 = new Account(fntm0.c, "com.google");
                    Bundle bundle0 = new Bundle();
                    bundle0.putParcelable("account", account0);
                    egxg egxg0 = new egxg();
                    egxg0.setArguments(bundle0);
                    ca0.z(0x7F0B1E9F, egxg0, "TrashContactsFragment");  // id:root
                }
                break;
            }
            case 4: {
                if(fntm0 != null) {
                    Account account1 = new Account(fntm0.c, "com.google");
                    Bundle bundle1 = new Bundle();
                    bundle1.putParcelable("account", account1);
                    egvy egvy0 = new egvy();
                    egvy0.setArguments(bundle1);
                    ca0.z(0x7F0B1E9F, egvy0, "SimImportContainerFragment");  // id:root
                    ca0.q(egvy0);
                }
                break;
            }
            case 5: {
                ca0.z(0x7F0B1E9F, egsq.y(true), "BackupSyncFragment");  // id:root
                break;
            }
            case 6: {
                ca0.z(0x7F0B1E9F, egsq.y(true), "BackupSyncFragment");  // id:root
                z = false;
                break;
            }
            default: {
                return;
            }
        }
        if(!contactsSyncCoreChimeraActivity0.l && z) {
            ca0.w(null);
        }
        contactsSyncCoreChimeraActivity0.l = false;
        ca0.b();
    }
}

