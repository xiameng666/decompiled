import android.accounts.Account;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeRequest;
import com.google.android.gms.romanesco.model.RestoreSuggestionEntity;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.SourceStats;
import java.util.ArrayList;
import java.util.List;

public final class egul implements evpo {
    public final eguv a;
    public final List b;
    public final Account c;

    public egul(eguv eguv0, List list0, Account account0) {
        this.a = eguv0;
        this.b = list0;
        this.c = account0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        String s = ((RestoreSuggestionEntity)this.b.get(0)).a;
        List list0 = (List)evql0.j();
        for(Object object0: list0) {
            BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity0 = (BackedUpContactsPerDeviceEntity)object0;
            if(backedUpContactsPerDeviceEntity0.a.equals(s)) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: ((BackedUpContactsPerDeviceEntity)list0.get(0)).g()) {
                    arrayList0.add(((SourceStats)object1).c());
                }
                eguv eguv0 = this.a;
                ArrayList arrayList1 = new ArrayList();
                for(Object object2: arrayList0) {
                    arrayList1.add(new ClassifyAccountTypeRequest(((String)object2), null));
                }
                return eguv0.y.b.a(arrayList1).c(new eguf(backedUpContactsPerDeviceEntity0, this.c));
            }
        }
        ((ggtj)eguv.a.i()).x("No backup entity found suggested device backup.");
        return evrg.d(null);
    }
}

