import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jeb.synthetic.TWR;

public final class egoo extends du {
    private final ehjx a;
    private final Map b;
    private Spinner c;

    public egoo() {
        this.a = ehjh.a;
        this.b = new HashMap();
    }

    public final void A(Account account0, Bundle bundle0) {
        try {
            ContentResolver.setSyncAutomatically(account0, "com.google.android.gms.people", true);
            ContentResolver.requestSync(account0, "com.google.android.gms.people", bundle0);
            egon egon0 = new egon(this, this.getContext(), account0);
            egon0.b = ContentResolver.addStatusChangeListener(4, egon0);
        }
        catch(Exception exception0) {
            egig.c("MenagerieDebugSettings", String.format("Request sync (%s) failed", account0), exception0);
            throw exception0;
        }
    }

    public static final Bundle B() {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("expedited", true);
        bundle0.putBoolean("force", true);
        return bundle0;
    }

    private final void C(View view0, int v, Runnable runnable0) {
        ((Button)view0.findViewById(v)).setOnClickListener(new egol(this, runnable0));
    }

    private static final void D(SQLiteDatabase sQLiteDatabase0, String s, String s1) {
        sQLiteDatabase0.execSQL("DELETE FROM sync_tokens WHERE owner_id = ? AND name = ?", new String[]{s, s1});
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0594, viewGroup0, false);  // layout:menagerie_settings
        this.C(view0, 0x7F0B18E9, () -> {
            SQLiteDatabase sQLiteDatabase0 = SQLiteDatabase.openDatabase(this.getContext().getDatabasePath("pluscontacts.db").toString(), null, 0);
            try {
                Iterator iterator0 = this.y().iterator();
                while(true) {
                label_2:
                    if(!iterator0.hasNext()) {
                        goto label_21;
                    }
                    Object object0 = iterator0.next();
                    Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT _id FROM owners WHERE account_name = ?1", new String[]{((Account)object0).name});
                    ArrayList arrayList0 = new ArrayList();
                    while(cursor0.moveToNext()) {
                        arrayList0.add(Long.toString(cursor0.getLong(0)));
                    }
                    cursor0.close();
                    for(Object object1: arrayList0) {
                        egoo.D(sQLiteDatabase0, ((String)object1), "people");
                        egoo.D(sQLiteDatabase0, ((String)object1), "gaiamap");
                        egoo.D(sQLiteDatabase0, ((String)object1), "autocomplete");
                    }
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(sQLiteDatabase0, throwable0);
                throw throwable0;
            }
            goto label_2;
        label_21:
            if(sQLiteDatabase0 != null) {
                sQLiteDatabase0.close();
            }
            for(Object object2: this.y()) {
                this.A(((Account)object2), egoo.B());
            }
        });
        this.C(view0, 0x7F0B18EB, new egoi(this));  // id:menagerie_settings_periodic_sync
        this.C(view0, 0x7F0B18EA, new egoj(this));  // id:menagerie_settings_initial_sync
        this.C(view0, 0x7F0B18EC, new egok(this));  // id:menagerie_settings_tickle_sync
        this.c = (Spinner)view0.findViewById(0x7F0B18E8);  // id:menagerie_settings_account_spinner
        return view0;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(this.getContext(), 0x1090008);
        arrayAdapter0.setDropDownViewResource(0x1090009);
        arrayAdapter0.add("All Accounts");
        Context context0 = this.getContext();
        ggqj ggqj0 = this.a.e(context0).om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            arrayAdapter0.add(((Account)object0).name);
            this.b.put(((Account)object0).name, ((Account)object0));
        }
        this.c.setAdapter(arrayAdapter0);
    }

    public final List y() {
        String s = (String)this.c.getSelectedItem();
        if(s.equals("All Accounts")) {
            return gged_interceptors.i(this.b.values());
        }
        return this.b.containsKey(s) ? gged_interceptors.l(((Account)this.b.get(s))) : ggna.a;
    }

    // Detected as a lambda impl.
    public final void z() {
        SQLiteDatabase sQLiteDatabase0 = SQLiteDatabase.openDatabase(this.getContext().getDatabasePath("pluscontacts.db").toString(), null, 0);
        try {
            Iterator iterator0 = this.y().iterator();
            while(true) {
            label_2:
                if(!iterator0.hasNext()) {
                    goto label_21;
                }
                Object object0 = iterator0.next();
                Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT _id FROM owners WHERE account_name = ?1", new String[]{((Account)object0).name});
                ArrayList arrayList0 = new ArrayList();
                while(cursor0.moveToNext()) {
                    arrayList0.add(Long.toString(cursor0.getLong(0)));
                }
                cursor0.close();
                for(Object object1: arrayList0) {
                    egoo.D(sQLiteDatabase0, ((String)object1), "people");
                    egoo.D(sQLiteDatabase0, ((String)object1), "gaiamap");
                    egoo.D(sQLiteDatabase0, ((String)object1), "autocomplete");
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(sQLiteDatabase0, throwable0);
            throw throwable0;
        }
        goto label_2;
    label_21:
        if(sQLiteDatabase0 != null) {
            sQLiteDatabase0.close();
        }
        for(Object object2: this.y()) {
            this.A(((Account)object2), egoo.B());
        }
    }
}

