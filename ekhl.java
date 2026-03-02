import com.google.android.gms.romanesco.ui.restore.promo.ContactsRestoreChimeraActivity;

public final class ekhl implements lqj {
    public final ContactsRestoreChimeraActivity a;

    public ekhl(ContactsRestoreChimeraActivity contactsRestoreChimeraActivity0) {
        this.a = contactsRestoreChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        ContactsRestoreChimeraActivity contactsRestoreChimeraActivity0 = this.a;
        ca ca0 = new ca(contactsRestoreChimeraActivity0.getSupportFragmentManager());
        ca0.B(0x7F010003, 0x7F010004, 0x7F010003, 0x7F010004);  // anim:abc_popup_enter
        switch(((int)(((Integer)object0)))) {
            case 0: {
                ca0.z(0x7F0B1E9F, new ekit(), "TAG_ACCOUNT_RESTORE_FRAGMENT");  // id:root
                break;
            }
            case 1: {
                ca0.z(0x7F0B1E9F, new ekia(), "TAG_CONTACTS_RESTORE_CONTACTS_FRAGMENT");  // id:root
                break;
            }
            case 2: {
                ca0.z(0x7F0B1E9F, new ekjb(), "TAG_CONTACT_RESTORE_PROGRESS_FRAGMENT");  // id:root
                break;
            }
            case 3: {
                ca0.z(0x7F0B1E9F, new ekho(), "TAG_CONTACT_RESTORE_COMPLETE_FRAGMENT");  // id:root
                break;
            }
            default: {
                return;
            }
        }
        if(!contactsRestoreChimeraActivity0.j) {
            ca0.w(null);
        }
        contactsRestoreChimeraActivity0.j = false;
        ca0.b();
    }
}

