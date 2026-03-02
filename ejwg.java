import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.LoadRemindersOptions;
import java.util.ArrayList;
import java.util.List;

public final class ejwg extends ejvr {
    private final String b;
    private final LoadRemindersOptions c;
    private ejth d;

    public ejwg(ejtq ejtq0, String s, LoadRemindersOptions loadRemindersOptions0, azug azug0) {
        super(ejtq0, "LoadReminders", azug0);
        this.b = s;
        this.c = loadRemindersOptions0;
    }

    private static String b(int v) {
        return v == 1 ? "due_date_millis ASC" : "created_time_millis DESC";
    }

    @Override  // cjtm
    public final void f(Context context0) {
        DataHolder dataHolder1;
        DataHolder dataHolder0 = null;
        try {
            ejth ejth0 = ejte.b(context0, this.b);
            this.d = ejth0;
            if(ejth0 == null) {
                this.a.d(new Status(6000), ApiMetadata.b);
                return;
            }
            int v = 0;
            LoadRemindersOptions loadRemindersOptions0 = this.c;
            List list0 = loadRemindersOptions0.a;
            if(list0 == null) {
                String s = "deleted=0 AND account_id=" + ejth0.a;
                String[] arr_s = new String[0];
                List list1 = loadRemindersOptions0.b;
                if(list1 != null) {
                    s = s + " AND task_list IN (" + TextUtils.join(",", list1) + ")";
                }
                List list2 = loadRemindersOptions0.m;
                if(list2 != null && !list2.isEmpty()) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    for(int v1 = 0; v1 < list2.size(); ++v1) {
                        if(stringBuilder0.length() != 0) {
                            stringBuilder0.append(" OR ");
                        }
                        stringBuilder0.append("recurrence_id=? ");
                    }
                    arr_s = ejxf.c(arr_s, ((String[])list2.toArray(new String[list2.size()])));
                    s = ejxf.a(s, stringBuilder0.toString());
                }
                if(!loadRemindersOptions0.g) {
                    s = s + " AND archived=0";
                }
                int v2 = loadRemindersOptions0.k;
                if(v2 != -1) {
                    ArrayList arrayList0 = new ArrayList();
                    if(loadRemindersOptions0.a(v2, 0)) {
                        long v3 = System.currentTimeMillis();
                        int v4 = loadRemindersOptions0.c == null || v3 >= ((long)loadRemindersOptions0.c) ? 1 : 0;
                        Long long0 = loadRemindersOptions0.d;
                        if(long0 != null) {
                            if(v3 < ((long)long0)) {
                                v = 1;
                            }
                            v4 &= v;
                        }
                        arrayList0.add((v4 == 0 ? "0" : "(reminder_type=0)"));
                    }
                    if(loadRemindersOptions0.a(v2, 1)) {
                        String s1 = "(reminder_type=1";
                        Long long1 = loadRemindersOptions0.c;
                        if(long1 != null) {
                            s1 = "(reminder_type=1 AND due_date_millis IS NOT NULL  AND due_date_millis>=" + long1;
                        }
                        Long long2 = loadRemindersOptions0.d;
                        if(long2 != null) {
                            s1 = s1 + " AND due_date_millis IS NOT NULL  AND due_date_millis<" + long2;
                        }
                        Long long3 = loadRemindersOptions0.e;
                        if(long3 != null) {
                            s1 = s1 + " AND (due_date_millis IS NULL OR due_date_millis < " + long3 + ")";
                        }
                        Long long4 = loadRemindersOptions0.f;
                        if(long4 != null) {
                            s1 = s1 + " AND (due_date_millis IS NULL OR due_date_millis >= " + long4 + ")";
                        }
                        arrayList0.add(s1 + ")");
                    }
                    if(loadRemindersOptions0.a(v2, 2)) {
                        arrayList0.add("(reminder_type=2)");
                    }
                    s = s + " AND (" + TextUtils.join(" OR ", arrayList0) + ")";
                }
                int v5 = loadRemindersOptions0.h;
                if(v5 == 0) {
                    s = s + " AND (recurrence_master IS NULL OR recurrence_master!=1)";
                }
                else {
                    switch(v5) {
                        case 1: {
                            break;
                        }
                        case 3: {
                            v5 = 3;
                            break;
                        }
                        default: {
                            goto label_67;
                        }
                    }
                    s = (v5 == 3 ? s + " AND (recurrence_master IS NULL OR recurrence_master!=0" + " OR recurrence_exceptional=1" : s + " AND (recurrence_master IS NULL OR recurrence_master!=0") + ")";
                }
            label_67:
                if(loadRemindersOptions0.i) {
                    s = s + " AND (recurrence_exceptional IS NULL OR recurrence_exceptional!=1)";
                }
                if(loadRemindersOptions0.j) {
                    s = s + " AND recurrence_id IS NOT NULL";
                }
                Long long5 = loadRemindersOptions0.n;
                if(long5 != null || loadRemindersOptions0.o != null) {
                    s = s + " AND (fired_time_millis BETWEEN IFNULL(" + long5 + ", 0) AND IFNULL(" + loadRemindersOptions0.o + ", 9223372036854775807) )";
                }
                dataHolder1 = bbeh.d(context0, ejtz.a, null, s, arr_s, ejwg.b(loadRemindersOptions0.l));
            }
            else {
                String[] arr_s1 = {String.valueOf(ejth0.a)};
                StringBuilder stringBuilder1 = new StringBuilder();
                if(!list0.isEmpty()) {
                    while(v < list0.size()) {
                        if(stringBuilder1.length() != 0) {
                            stringBuilder1.append(" OR ");
                        }
                        stringBuilder1.append("client_assigned_id=? ");
                        ++v;
                    }
                    arr_s1 = ejxf.c(arr_s1, ((String[])list0.toArray(new String[list0.size()])));
                }
                dataHolder1 = bbeh.d(context0, ejtz.a, null, ejxf.a("account_id=?", stringBuilder1.toString()), arr_s1, ejwg.b(loadRemindersOptions0.l));
            }
        }
        catch(RemoteException unused_ex) {
            dataHolder1 = null;
            goto label_96;
        }
        catch(Throwable throwable0) {
            goto label_102;
        }
        try {
            try {
                ejtq ejtq0 = this.a;
                ApiMetadata apiMetadata0 = cckf.d(bbdp.ex);
                ejtq0.b(dataHolder1, Status.b, apiMetadata0);
                goto label_105;
            }
            catch(RemoteException unused_ex) {
            }
            try {
            label_96:
                this.a.b(null, Status.d, ApiMetadata.b);
            }
            catch(RemoteException unused_ex) {
            }
        }
        catch(Throwable throwable0) {
            goto label_101;
        }
        try {
            if(dataHolder1 != null) {
                dataHolder1.close();
                return;
            label_101:
                dataHolder0 = dataHolder1;
            label_102:
                if(dataHolder0 != null) {
                    dataHolder0.close();
                }
                throw throwable0;
            label_105:
                if(dataHolder1 != null) {
                    dataHolder1.close();
                }
            }
        }
        catch(NullPointerException nullPointerException0) {
            throw new NullPointerException(Log.getStackTraceString(nullPointerException0));
        }
    }
}

