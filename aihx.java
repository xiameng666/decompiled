import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.auth.authzen.DeviceData;
import com.google.android.gms.auth.authzen.Permit;
import com.google.android.gms.auth.authzen.PermitAccess;
import com.google.android.gms.common.api.Status;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class aihx extends aihu {
    private final aijm a;

    public aihx(aijm aijm0) {
        super("GetSyncedDevices");
        batl.s(aijm0);
        this.a = aijm0;
    }

    @Override  // aihu
    protected final void b(Context context0) {
        DeviceData deviceData0;
        ArrayList arrayList0;
        aijz aijz0 = new aijz(context0);
        try {
            aijz.b.h("Getting all permits...", new Object[0]);
            SQLiteDatabase sQLiteDatabase0 = aijz0.a.a();
            Cursor cursor0 = sQLiteDatabase0.query("permit", null, null, null, null, null, null);
            try {
                if(cursor0.moveToFirst()) {
                    arrayList0 = new ArrayList();
                    while(!cursor0.isAfterLast()) {
                        arrayList0.add(aijz.a(sQLiteDatabase0, cursor0));
                        cursor0.moveToNext();
                    }
                }
                else {
                    arrayList0 = new ArrayList();
                }
            }
            finally {
                cursor0.close();
            }
            int v2 = 0;
            for(Object object0: arrayList0) {
                v2 += ((Permit)object0).a().size();
            }
            if(((long)v2) > hpqx.b()) {
                ArrayList arrayList1 = new ArrayList(arrayList0.size());
                ArrayList arrayList2 = new ArrayList(arrayList0.size());
                for(int v3 = 0; v3 < arrayList0.size() && ((long)arrayList2.size()) < hpqx.b(); ++v3) {
                    Permit permit0 = (Permit)arrayList0.get(v3);
                    if(!permit0.a().isEmpty()) {
                        aihn aihn0 = new aihn();
                        aihn0.a = permit0.b;
                        aihn0.b = permit0.c;
                        aihn0.c = permit0.d;
                        aihn0.d = permit0.e;
                        for(Object object1: DesugarCollections.unmodifiableList(new ArrayList(permit0.i))) {
                            aihn0.a(((String)object1));
                        }
                        arrayList1.add(aihn0);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(permit0.a());
                        arrayList2.add(arrayList3);
                    }
                }
                int v4 = 0;
                for(int v5 = 0; ((long)v4) < hpqx.b(); v5 = (v5 + 1) % arrayList2.size()) {
                    List list0 = (List)arrayList2.get(v5);
                    if(!list0.isEmpty()) {
                        ((aihn)arrayList1.get(v5)).b(((PermitAccess)list0.remove(0)));
                        ++v4;
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList0.size());
                int v6 = arrayList1.size();
                for(int v = 0; v < v6; ++v) {
                    arrayList4.add(new Permit(((aihn)arrayList1.get(v))));
                }
                arrayList0 = arrayList4;
            }
            deviceData0 = new DeviceData(1, arrayList0);
        }
        catch(aijy unused_ex) {
            this.j(Status.d);
            return;
        }
        Bundle bundle0 = new aijp(Status.b, deviceData0).b();
        this.a.a(bundle0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        Bundle bundle0 = new aijp(status0, null).b();
        this.a.a(bundle0);
    }
}

