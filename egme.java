import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;

public final class egme extends eglx {
    @Override  // eglx
    public final boolean a(Context context0, eglu eglu0) {
        hwxo hwxo0 = hwxo.a;
        if(!hwxo0.b().k()) {
            return true;
        }
        if(ContentResolver.getMasterSyncAutomatically()) {
            for(Object object0: eglu0.a) {
                if(hwxo0.b().d() && ContentResolver.getIsSyncable(new Account(((String)object0), "com.google"), "com.android.contacts") == 0) {
                    return false;
                }
                if(!ContentResolver.getSyncAutomatically(new Account(((String)object0), "com.google"), "com.android.contacts")) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

