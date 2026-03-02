import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.SourceStats;
import java.util.ArrayList;
import java.util.List;

public final class eguf implements evpo {
    public final BackedUpContactsPerDeviceEntity a;
    public final Account b;

    public eguf(BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity0, Account account0) {
        this.a = backedUpContactsPerDeviceEntity0;
        this.b = account0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity0;
        List list0 = (List)evql0.j();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        for(int v = 0; true; ++v) {
            backedUpContactsPerDeviceEntity0 = this.a;
            if(v >= backedUpContactsPerDeviceEntity0.g().size()) {
                break;
            }
            efoy efoy0 = ((ClassifyAccountTypeResult)list0.get(v)).c;
            if(efoy0.equals(efoy.c)) {
                v1 += (int)((SourceStats)backedUpContactsPerDeviceEntity0.g().get(v)).a();
            }
            else if(efoy0.equals(efoy.e)) {
                arrayList0.add(((SourceStats)backedUpContactsPerDeviceEntity0.g().get(v)).c());
                v3 += (int)((SourceStats)backedUpContactsPerDeviceEntity0.g().get(v)).a();
            }
            else {
                SourceStats sourceStats0 = (SourceStats)backedUpContactsPerDeviceEntity0.g().get(v);
                arrayList1.add(sourceStats0.c());
                v2 += (int)sourceStats0.a();
            }
        }
        Object object0 = new Bundle();
        ((Bundle)object0).putString("account_name", this.b.name);
        ((Bundle)object0).putString("device_id", backedUpContactsPerDeviceEntity0.a);
        ((Bundle)object0).putString("device_name", backedUpContactsPerDeviceEntity0.c);
        ((Bundle)object0).putLong("last_backup_time_millis", backedUpContactsPerDeviceEntity0.d.longValue());
        ((Bundle)object0).putLong("last_restore_time_millis", backedUpContactsPerDeviceEntity0.e.longValue());
        ((Bundle)object0).putInt("num_google_contacts", v1);
        ((Bundle)object0).putInt("num_device_contacts", v2);
        ((Bundle)object0).putInt("num_sim_contacts", v3);
        ((Bundle)object0).putStringArrayList("device_contacts_account_types", arrayList1);
        ((Bundle)object0).putStringArrayList("sim_contacts_account_types", arrayList0);
        return object0;
    }
}

