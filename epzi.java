import android.app.PendingIntent;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.SourceAccountExportController.ExportReceiver;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class epzi implements Runnable {
    final String[] a;
    final SourceAccountExportController.ExportReceiver b;

    public epzi(SourceAccountExportController.ExportReceiver sourceAccountExportController$ExportReceiver0, String[] arr_s) {
        this.a = arr_s;
        Objects.requireNonNull(sourceAccountExportController$ExportReceiver0);
        this.b = sourceAccountExportController$ExportReceiver0;
        super();
    }

    @Override
    public final void run() {
        String[] arr_s = this.a;
        epzj epzj0 = this.b.a;
        if(arr_s != null) {
            List list0 = Arrays.asList(arr_s);
            if(epzj0.g.containsAll(list0)) {
                Object[] arr_object = {Arrays.toString(arr_s)};
                epzj.a.j("Skipping broadcast. Already processed %s", arr_object);
                return;
            }
        }
        baun baun0 = epzj.a;
        baun0.j("Handling authenticatorIds %s", new Object[]{Arrays.toString(arr_s)});
        adtu adtu0 = new adtu();
        adtu0.c(2);
        AccountTransferMsg accountTransferMsg0 = new AccountTransferMsg(adtu0);
        evql evql0 = epzj0.c.b(accountTransferMsg0);
        Status status0 = erqf.b(evql0);
        AccountTransferMsg accountTransferMsg1 = status0.e() ? ((AccountTransferMsg)evql0.j()) : null;
        baun0.j("exportAccounts(RETRIEVE_DATA) %s", new Object[]{status0});
        if(status0.i == 20501) {
            baun0.j("No data available", new Object[0]);
            return;
        }
        if(accountTransferMsg1 == null) {
            epzj0.d("Retrieved data was null");
            return;
        }
        ArrayList arrayList0 = accountTransferMsg1.c;
        ArrayList arrayList1 = new ArrayList();
        AccountTransferProgress accountTransferProgress0 = accountTransferMsg1.e;
        if(accountTransferProgress0 != null && epzj0.h == 0) {
            epzj0.h = ((bzs)accountTransferProgress0.g()).d_num;
            List list1 = accountTransferProgress0.b;
            if(list1 != null) {
                for(Object object0: list1) {
                    ((frpe)epzj0.i.l.mr()).b(new Object[]{((String)object0)});
                }
            }
        }
        for(int v = 0; v < arrayList0.size(); ++v) {
            AuthenticatorAnnotatedData authenticatorAnnotatedData0 = (AuthenticatorAnnotatedData)arrayList0.get(v);
            epzj0.g.add(authenticatorAnnotatedData0.f);
            AuthenticatorTransferInfo authenticatorTransferInfo0 = authenticatorAnnotatedData0.c;
            epzj0.f.add(authenticatorTransferInfo0.c);
            PendingIntent pendingIntent0 = authenticatorTransferInfo0.f;
            baun0.d("Processing %s, status %d", new Object[]{authenticatorTransferInfo0.c, ((int)authenticatorTransferInfo0.d)});
            if(pendingIntent0 == null) {
                arrayList1.add(authenticatorAnnotatedData0);
            }
            else {
                baun0.j("Found pendingIntent %s", new Object[]{pendingIntent0});
                epzj0.e.incrementAndGet();
                epzj0.b.b();
                epzj0.b.c(pendingIntent0);
            }
        }
        MessagePayload messagePayload0 = new MessagePayload();
        adtu adtu1 = new adtu();
        adtu1.a(arrayList1);
        adtu1.b(accountTransferProgress0);
        messagePayload0.s(new AccountTransferPayload(new AccountTransferMsg(adtu1)));
        epzj0.b.f(messagePayload0);
    }
}

