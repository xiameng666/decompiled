import android.content.ContentProviderOperation;
import android.content.ContentValues;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;
import java.util.List;

public final class ejvu extends ejvt {
    private static final gegh h;
    private final List i;

    static {
        gegf gegf0 = (gegf)((ProtoLiteMessage)gegh.a).v_newBuilder();
        gegf0.a(1);
        gegf0.a(2);
        gegf0.a(4);
        gegf0.a(5);
        gegf0.a(6);
        gegf0.a(7);
        gegf0.a(8);
        gegf0.a(9);
        gegf0.a(11);
        gegf0.a(12);
        gegf0.a(14);
        gegf0.a(15);
        gegf0.a(16);
        gegf0.a(17);
        ejvu.h = (gegh)((ProtoLiteBuilder)gegf0).N_build();
    }

    public ejvu(ejtq ejtq0, String s, String s1, List list0, azug azug0) {
        super(ejtq0, s, s1, "BatchUpdateReminder", azug0);
        this.i = list0;
    }

    @Override  // ejvt
    protected final int b() {
        return 6002;
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        if(hxsx.a.h().H()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geds.a).v_newBuilder();
            for(int v = 0; true; ++v) {
                List list0 = this.i;
                if(v >= list0.size()) {
                    break;
                }
                TaskEntity taskEntity0 = (TaskEntity)list0.get(v);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gedr.a).v_newBuilder();
                gefy gefy0 = ejxi.g(taskEntity0);
                if(gefy0 != null) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gedr)hftp1.b_message).e = gefy0;
                    ((gedr)hftp1.b_message).b |= 4;
                }
                gefy gefy1 = ((gedr)hftp1.b_message).e;
                if(gefy1 == null) {
                    gefy1 = gefy.a;
                }
                gedm gedm0 = gefy1.c == null ? gedm.a : gefy1.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                gedm0.getClass();
                ((gedr)hftv0).c = gedm0;
                ((gedr)hftv0).b |= 1;
                gegh gegh0 = ejvu.h;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gedr gedr0 = (gedr)hftp1.b_message;
                gegh0.getClass();
                gedr0.d = gegh0;
                gedr0.b |= 2;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                geds geds0 = (geds)hftp0.b_message;
                gedr gedr1 = (gedr)hftp1.N_build();
                gedr1.getClass();
                hfuo hfuo0 = geds0.d;
                if(!hfuo0.c()) {
                    geds0.d = ProtoLiteMessage.E(hfuo0);
                }
                geds0.d.add(gedr1);
            }
            gefz gefz0 = this.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geds geds1 = (geds)hftp0.b_message;
            gefz0.getClass();
            geds1.c = gefz0;
            geds1.b |= 1;
            arrayList0.add(this.c(10, ((MessageLite)(((geds)hftp0.N_build())))));
            return;
        }
        for(int v1 = 0; true; ++v1) {
            List list1 = this.i;
            if(v1 >= list1.size()) {
                break;
            }
            TaskEntity taskEntity1 = (TaskEntity)list1.get(v1);
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gegi.a).v_newBuilder();
            gefy gefy2 = ejxi.g(taskEntity1);
            if(gefy2 != null) {
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((gegi)hftp2.b_message).g = gefy2;
                ((gegi)hftp2.b_message).b |= 0x40;
            }
            gefy gefy3 = ((gegi)hftp2.b_message).g;
            if(gefy3 == null) {
                gefy3 = gefy.a;
            }
            gedm gedm1 = gefy3.c == null ? gedm.a : gefy3.c;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gegi gegi0 = (gegi)hftp2.b_message;
            gedm1.getClass();
            gegi0.d = gedm1;
            gegi0.b |= 2;
            gefz gefz1 = this.d();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            gefz1.getClass();
            ((gegi)hftv1).c = gefz1;
            ((gegi)hftv1).b |= 1;
            gegh gegh1 = ejvu.h;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            gegh1.getClass();
            ((gegi)hftv2).e = gegh1;
            ((gegi)hftv2).b |= 8;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            gegi gegi1 = (gegi)hftp2.b_message;
            gegi1.b |= 16;
            gegi1.f = false;
            arrayList0.add(this.c(5, ((MessageLite)(((gegi)hftp2.N_build())))));
        }
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        for(Object object0: this.i) {
            ContentValues contentValues0 = ejxh.a(((TaskEntity)object0));
            contentValues0.remove("client_assigned_id");
            contentValues0.remove("client_assigned_thread_id");
            contentValues0.remove("task_list");
            contentValues0.remove("created_time_millis");
            contentValues0.put("snoozed", Boolean.valueOf(this.s(((TaskEntity)object0), false)));
            String[] arr_s = this.t(((TaskEntity)object0).a);
            arrayList0.add(ContentProviderOperation.newAssertQuery(ejtz.a).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", arr_s).withExpectedCount(1).build());
            arrayList0.add(ContentProviderOperation.newAssertQuery(ejtz.a).withSelection(ejxf.a("client_assigned_id=? AND account_id=? AND deleted=0", "recurrence_master=1"), arr_s).withExpectedCount(0).build());
            arrayList0.add(ContentProviderOperation.newUpdate(ejtz.d).withValues(contentValues0).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", arr_s).build());
        }
    }
}

