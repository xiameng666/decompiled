import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.CustomizedSnoozePreset;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Recurrence;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;
import java.util.ArrayList;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import jeb.synthetic.TWR;

public abstract class ejvt extends ejvr {
    protected final String b;
    protected final String c;
    protected ejth d;
    protected CustomizedSnoozePreset e;
    protected Context f;
    protected final ejtq g;

    public ejvt(ejtq ejtq0, String s, String s1, String s2, azug azug0) {
        super(ejtq0, s2, azug0);
        this.g = ejtq0;
        this.b = s;
        this.c = s1;
    }

    protected int b() {
        return 13;
    }

    protected final ContentProviderOperation c(int v, MessageLite hfvm0) {
        return ContentProviderOperation.newInsert(ejtw.a).withValue("account_id", Long.valueOf(this.d.a)).withValue("operation_api", Integer.valueOf(v)).withValue("operation_request", hfvm0.toBytesArray()).build();
    }

    protected final gefz d() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gefz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gefz gefz0 = (gefz)hftp0.b_message;
        this.c.getClass();
        gefz0.b |= 2;
        gefz0.d = this.c;
        return (gefz)hftp0.N_build();
    }

    protected final String e(ArrayList arrayList0, TaskEntity taskEntity0) {
        ContentValues contentValues0 = ejxh.a(taskEntity0);
        String s = contentValues0.getAsString("client_assigned_id");
        if(TextUtils.isEmpty(s)) {
            s = UUID.randomUUID().toString();
            contentValues0.put("client_assigned_id", s);
        }
        contentValues0.put("account_id", Long.valueOf(this.d.a));
        contentValues0.put("snoozed", Boolean.valueOf(this.s(taskEntity0, false)));
        if(contentValues0.getAsLong("created_time_millis") == null) {
            contentValues0.put("created_time_millis", Long.valueOf(System.currentTimeMillis()));
        }
        arrayList0.add(ContentProviderOperation.newAssertQuery(ejtz.a).withSelection("client_assigned_id=? AND account_id=? AND deleted=?", new String[]{s, String.valueOf(this.d.a), "0"}).withExpectedCount(0).build());
        arrayList0.add(ContentProviderOperation.newInsert(ejtz.a).withValues(contentValues0).build());
        return s;
    }

    @Override  // cjtm
    public void f(Context context0) {
        this.n(context0, true);
    }

    protected final void g(ArrayList arrayList0, String s) {
        arrayList0.add(ContentProviderOperation.newAssertQuery(ejtz.a).withSelection("client_assigned_id=? AND account_id=? AND deleted=?", new String[]{s + "/master", String.valueOf(this.d.a), "0"}).withExpectedCount(0).build());
    }

    protected final void h(ArrayList arrayList0, TaskEntity taskEntity0) {
        ejve ejve0;
        RecurrenceEndEntity recurrenceEndEntity0;
        double f;
        Task task0 = taskEntity0;
        if(task0.d == null) {
            ejuu ejuu0 = new ejuu(task0);
            ejuu0.b = System.currentTimeMillis();
            task0 = ejuu0.a();
        }
        Recurrence recurrence0 = task0.g().a();
        ejuo ejuo0 = new ejuo(recurrence0);
        batl.s(recurrence0);
        batl.s(recurrence0.e());
        batl.s(recurrence0.e().a());
        RecurrenceEnd recurrenceEnd0 = recurrence0.d();
        if(recurrenceEnd0 != null && recurrenceEnd0.e() != null) {
            int v = (int)recurrenceEnd0.e();
            int v1 = (int)recurrence0.i();
            switch(v1) {
                case 0: {
                    f = 1.0;
                    break;
                }
                case 1: {
                    f = 7.0;
                    break;
                }
                case 2: {
                    f = 31.0;
                    break;
                }
                case 3: {
                    f = 365.0;
                    break;
                }
                default: {
                    throw new IllegalStateException("Unrecognized frequency: " + v1);
                }
            }
            recurrenceEndEntity0 = new RecurrenceEndEntity(null, Math.min(v, ((int)(((double)ejvg.a(v1)) / f))), null, null, true);
        }
        else {
            DateTime dateTime0 = ejvd.f(recurrence0.e().a(), ejvg.a(recurrence0.i().intValue()));
            if(recurrenceEnd0 != null && recurrenceEnd0.c() != null && ejvd.a(recurrence0.d().c(), dateTime0) < 0) {
                dateTime0 = recurrence0.d().c();
            }
            recurrenceEndEntity0 = new RecurrenceEndEntity(((DateTime)(dateTime0 == null ? null : dateTime0.l())), null, null, null, true);
        }
        ejuo0.d = recurrenceEndEntity0;
        RecurrenceEntity recurrenceEntity0 = new RecurrenceEntity(ejuo0.a, ejuo0.b, ejuo0.c, ejuo0.d, ejuo0.e, ejuo0.f, ejuo0.g, ejuo0.h, true);
        Integer integer0 = recurrenceEntity0.a;
        batl.s(integer0);
        switch(((int)integer0)) {
            case 0: {
                ejve0 = new ejve(recurrenceEntity0);
                break;
            }
            case 1: {
                ejve0 = new ejvj(recurrenceEntity0);
                break;
            }
            case 2: {
                ejve0 = new ejvf(recurrenceEntity0);
                break;
            }
            case 3: {
                ejve0 = new ejvk(recurrenceEntity0);
                break;
            }
            default: {
                Objects.toString(integer0);
                throw new IllegalStateException("Unrecognized frequency: " + integer0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        while(ejve0.hasNext()) {
            Object object0 = ejve0.next();
            DateTime dateTime1 = (DateTime)object0;
            if(this.x(dateTime1)) {
                String s = task0.g().e();
                ejuh ejuh0 = new ejuh(dateTime1);
                ejuh0.d = null;
                if(Boolean.TRUE.equals(dateTime1.c())) {
                    ejuh0.c(null);
                    ejuh0.b(null);
                }
                long v2 = ejvd.d(ejuh0.a());
                ejuu ejuu1 = new ejuu(task0);
                ejuu1.a = new TaskIdEntity(s + "/" + v2, null);
                ejuu1.b(dateTime1);
                ContentValues contentValues0 = ejxh.a(new TaskEntity(ejuu1.a()));
                contentValues0.put("account_id", Long.valueOf(this.d.a));
                contentValues0.put("snoozed", Boolean.valueOf(this.s(task0, true)));
                arrayList0.add(ContentProviderOperation.newInsert(ejtz.a).withValues(contentValues0).build());
                arrayList1.add(dateTime1);
            }
        }
        if(!arrayList1.isEmpty()) {
            ejuu ejuu2 = new ejuu(task0);
            ejuu2.b(((DateTime)arrayList1.get(0)));
            Task task1 = ejuu2.a();
            String s1 = ((TaskEntity)task1).q.e();
            ContentValues contentValues1 = ejxh.a(((TaskEntity)task1));
            contentValues1.put("account_id", Long.valueOf(this.d.a));
            contentValues1.put("snoozed", Boolean.valueOf(this.s(task1, true)));
            contentValues1.put("client_assigned_id", s1 + "/master");
            ejxh.b(contentValues1, "recurrence_master", Boolean.valueOf(true));
            this.g(arrayList0, s1);
            arrayList0.add(ContentProviderOperation.newInsert(ejtz.a).withValues(contentValues1).build());
        }
    }

    protected final void i(ArrayList arrayList0, TaskId taskId0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("deleted", Integer.valueOf(1));
        arrayList0.add(ContentProviderOperation.newUpdate(ejtz.a).withValues(contentValues0).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", this.t(taskId0)).build());
    }

    @Override  // ejvr
    public final void j(Status status0) {
        this.g.d(status0, ApiMetadata.b);
    }

    protected abstract void k(ArrayList arg1);

    protected final void l(ArrayList arrayList0, String s, UpdateRecurrenceOptions updateRecurrenceOptions0) {
        if(updateRecurrenceOptions0.a != 0) {
            Long long0 = updateRecurrenceOptions0.c;
            if(long0 != null) {
                String[] arr_s = {String.valueOf(this.d.a), s, "1", "0"};
                ContentValues contentValues0 = new ContentValues();
                ejxk.b(contentValues0, ejxi.c(ejvd.e(long0.longValue(), TimeZone.getDefault())), "recurrence_end_");
                arrayList0.add(ContentProviderOperation.newUpdate(ejtz.a).withValues(contentValues0).withSelection("account_id=? AND recurrence_id=? AND recurrence_master=? AND deleted=?", arr_s).build());
            }
        }
    }

    protected abstract void m(ArrayList arg1);

    protected final boolean n(Context context0, boolean z) {
        CustomizedSnoozePresetEntity customizedSnoozePresetEntity0;
        this.f = context0;
        String s = this.b;
        ejth ejth0 = ejte.b(context0, s);
        this.d = ejth0;
        if(ejth0 == null) {
            Status status0 = new Status(6000);
            this.g.d(status0, ApiMetadata.b);
            return false;
        }
        Cursor cursor0 = context0.getContentResolver().query(ejtu.a, new String[]{"morning_customized_time", "afternoon_customized_time", "evening_customized_time"}, "account_name=?", new String[]{s}, null);
        CustomizedSnoozePreset customizedSnoozePreset0 = null;
        if(cursor0 != null) {
            try {
                if(cursor0.moveToNext()) {
                    customizedSnoozePresetEntity0 = new CustomizedSnoozePresetEntity(ejtc.b(cursor0.getLong(0)), ejtc.b(cursor0.getLong(1)), ejtc.b(cursor0.getLong(2)));
                    goto label_17;
                }
                else {
                    goto label_20;
                }
                goto label_21;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        label_17:
            cursor0.close();
            customizedSnoozePreset0 = customizedSnoozePresetEntity0;
            goto label_21;
        label_20:
            cursor0.close();
        }
    label_21:
        this.e = customizedSnoozePreset0;
        ArrayList arrayList0 = new ArrayList();
        this.m(arrayList0);
        this.k(arrayList0);
        int v = bbeh.c(this.f.getContentResolver(), arrayList0, "RemindersApiOp") ? 0 : this.b();
        Status status1 = new Status(v);
        this.g.d(status1, ApiMetadata.b);
        if(z && v == 0) {
            ejws.f(this.d);
            return true;
        }
        return v == 0;
    }

    protected final boolean s(Task task0, boolean z) {
        if(task0.I() != null) {
            return task0.I().booleanValue();
        }
        if(task0.i() != null && task0.i().booleanValue()) {
            return false;
        }
        if(task0.j() != null && task0.j().booleanValue()) {
            return false;
        }
        return z ? true : task0.a() != null && this.x(task0.a()) || (task0.e() != null || task0.f() != null);
    }

    protected final String[] t(TaskId taskId0) {
        return new String[]{taskId0.a(), String.valueOf(this.d.a)};
    }

    protected final String[] u(String s, UpdateRecurrenceOptions updateRecurrenceOptions0) {
        boolean z = updateRecurrenceOptions0.a == 1;
        String[] arr_s = updateRecurrenceOptions0.b ? ejxf.c(new String[]{String.valueOf(this.d.a), s}, new String[]{"0"}) : new String[]{String.valueOf(this.d.a), s};
        return z ? ejxf.c(arr_s, new String[]{String.valueOf((z ? ejxi.a(updateRecurrenceOptions0) : 0L))}) : arr_s;
    }

    protected static final String v(UpdateRecurrenceOptions updateRecurrenceOptions0) {
        String s = updateRecurrenceOptions0.b ? ejxf.a("account_id=? AND recurrence_id=?", "recurrence_exceptional=?") : "account_id=? AND recurrence_id=?";
        return updateRecurrenceOptions0.a == 1 ? ejxf.a(s, "due_date_millis>=?") : s;
    }

    protected static void w(ProtoLiteBuilder hftp0) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gefy)hftp0.b_message).t = null;
        ((gefy)hftp0.b_message).b &= 0xFFFBFFFF;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gefy)hftv0).c = null;
        ((gefy)hftv0).b &= -2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gefy)hftv1).e = null;
        ((gefy)hftv1).b &= -5;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gefy)hftv2).n = null;
        ((gefy)hftv2).b &= 0xFFFFEFFF;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gefy)hftv3).p = null;
        ((gefy)hftv3).b &= 0xFFFFBFFF;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        gefy gefy0 = (gefy)hftp0.b_message;
        gefy0.b &= 0xFFFFFF7F;
        gefy0.j = false;
    }

    private final boolean x(DateTime dateTime0) {
        DateTime dateTime1 = ejvd.e(System.currentTimeMillis(), TimeZone.getDefault());
        if(dateTime0.a() == null && dateTime0.h() != null) {
            ejuh ejuh0 = new ejuh(dateTime0);
            ejuh0.c(ejxd.c(this.f, this.e, dateTime0.h()));
            dateTime0 = ejuh0.a();
        }
        return Boolean.TRUE.equals(dateTime0.d()) || ejvd.d(dateTime0) > ejvd.d(dateTime1);
    }
}

