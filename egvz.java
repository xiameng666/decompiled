import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;

public final class egvz implements egwa {
    private final lqd a;

    public egvz() {
        this.a = new lqi(ggna.a);
    }

    @Override  // egwa
    public final lqd a(AccountWithDataSet accountWithDataSet0) {
        return this.a;
    }

    @Override  // egwa
    public final evql b(ImportSimContactsRequest importSimContactsRequest0) {
        if(importSimContactsRequest0.a.isEmpty()) {
            return evrg.d(Integer.valueOf(0));
        }
        throw new UnsupportedOperationException("importSimContacts not supported on this device");
    }

    @Override  // egwa
    public final gmcd c(int v) {
        return gmbu.h(new UnsupportedOperationException("Cannot load SIM contacts"));
    }

    @Override  // egwa
    public final CharSequence d(int v) {
        return null;
    }

    @Override  // egwa
    public final CharSequence e(int v) {
        return null;
    }

    @Override  // egwa
    public final String f(int v) {
        return null;
    }

    @Override  // egwa
    public final evql g(ImportSimContactsRequest importSimContactsRequest0) {
        return evrg.d(Integer.valueOf(-2));
    }
}

