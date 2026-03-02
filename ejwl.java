import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import com.google.android.gms.reminders.model.TimeEntity;
import java.util.ArrayList;

public final class ejwl extends ejvt {
    private final CustomizedSnoozePresetEntity h;

    public ejwl(ejtq ejtq0, String s, String s1, CustomizedSnoozePresetEntity customizedSnoozePresetEntity0, azug azug0) {
        super(ejtq0, s, s1, "SetCustomizedSnoozePreset", azug0);
        this.h = customizedSnoozePresetEntity0;
    }

    @Override  // ejvt
    public final void f(Context context0) {
        super.f(context0);
        if(!ejxl.a(context0)) {
            ejxl.b(context0);
        }
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        CustomizedSnoozePresetEntity customizedSnoozePresetEntity0 = this.h;
        TimeEntity timeEntity0 = customizedSnoozePresetEntity0.a;
        if(timeEntity0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gefv.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gefv)hftp0.b_message).c = 1;
            ((gefv)hftp0.b_message).b |= 1;
            gecj gecj0 = ejxi.b(timeEntity0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gefv gefv0 = (gefv)hftp0.b_message;
            gecj0.getClass();
            gefv0.d = gecj0;
            gefv0.b |= 8;
            arrayList1.add(((gefv)hftp0.N_build()));
        }
        TimeEntity timeEntity1 = customizedSnoozePresetEntity0.b;
        if(timeEntity1 != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gefv.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gefv)hftp1.b_message).c = 2;
            ((gefv)hftp1.b_message).b |= 1;
            gecj gecj1 = ejxi.b(timeEntity1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gefv gefv1 = (gefv)hftp1.b_message;
            gecj1.getClass();
            gefv1.d = gecj1;
            gefv1.b |= 8;
            arrayList1.add(((gefv)hftp1.N_build()));
        }
        TimeEntity timeEntity2 = customizedSnoozePresetEntity0.c;
        if(timeEntity2 != null) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gefv.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gefv)hftp2.b_message).c = 3;
            ((gefv)hftp2.b_message).b |= 1;
            gecj gecj2 = ejxi.b(timeEntity2);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gefv gefv2 = (gefv)hftp2.b_message;
            gecj2.getClass();
            gefv2.d = gecj2;
            gefv2.b |= 8;
            arrayList1.add(((gefv)hftp2.N_build()));
        }
        if(!arrayList1.isEmpty()) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gefw.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gefw gefw0 = (gefw)hftp3.b_message;
            hfuo hfuo0 = gefw0.b;
            if(!hfuo0.c()) {
                gefw0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList1, gefw0.b);
            arrayList0.add(this.c(11, ((MessageLite)(((gefw)hftp3.N_build())))));
        }
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        ContentValues contentValues0 = new ContentValues();
        CustomizedSnoozePresetEntity customizedSnoozePresetEntity0 = this.h;
        TimeEntity timeEntity0 = customizedSnoozePresetEntity0.a;
        if(timeEntity0 != null) {
            contentValues0.put("morning_customized_time", Long.valueOf(ejtc.a(timeEntity0)));
        }
        TimeEntity timeEntity1 = customizedSnoozePresetEntity0.b;
        if(timeEntity1 != null) {
            contentValues0.put("afternoon_customized_time", Long.valueOf(ejtc.a(timeEntity1)));
        }
        TimeEntity timeEntity2 = customizedSnoozePresetEntity0.c;
        if(timeEntity2 != null) {
            contentValues0.put("evening_customized_time", Long.valueOf(ejtc.a(timeEntity2)));
        }
        if(contentValues0.size() > 0) {
            arrayList0.add(ContentProviderOperation.newUpdate(ejtu.a).withSelection("account_name=?", new String[]{this.b}).withValues(contentValues0).build());
        }
    }
}

