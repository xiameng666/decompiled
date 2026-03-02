import android.content.Context;
import android.content.Intent;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.util.ArrayList;

public final class fcsc extends adc {
    @Override  // adc
    public final Intent a(Context context0, Object object0) {
        if(((fext)object0) == null) {
            throw new IllegalStateException("Backup status is required to create account picker intent");
        }
        ArrayList arrayList0 = (ArrayList)Collection.-EL.stream(((fext)object0).d).map(new fcsa()).collect(Collectors.toCollection(new fcsb()));
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupAccountPickerActivity").putStringArrayListExtra("account_names", arrayList0);
    }

    @Override  // adc
    public final Object b(int v, Intent intent0) {
        return v == -1 && intent0 != null ? intent0.getStringExtra("selected_account_name") : null;
    }
}

