import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.reminders.AccountState;
import com.google.android.gms.reminders.CreateReminderOptionsInternal;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.ReindexDueDatesOptions;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskIdEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ejts extends wby implements IInterface, cjug {
    final String a;
    final String b;
    final cjts c;
    private final String d;

    public ejts() {
        super("com.google.android.gms.reminders.internal.IRemindersService");
    }

    public ejts(cjts cjts0, String s, String s1, String s2) {
        super("com.google.android.gms.reminders.internal.IRemindersService");
        this.d = s2;
        this.c = cjts0;
        this.b = s1;
        this.a = s;
    }

    public final void a(ejtq ejtq0, List list0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ex);
        azuf0.g(bbdq.Y);
        azuf0.d(this.b);
        azuf0.c(this.d);
        azug azug0 = azuf0.a();
        ejvu ejvu0 = new ejvu(ejtq0, this.a, this.b, list0, azug0);
        this.c.b(ejvu0);
    }

    public final void c(ejtq ejtq0, TaskEntity taskEntity0, CreateReminderOptionsInternal createReminderOptionsInternal0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ex);
        azuf0.g(bbdq.Y);
        azuf0.d(this.b);
        azuf0.c(this.d);
        azug azug0 = azuf0.a();
        ejwa ejwa0 = new ejwa(ejtq0, this.a, this.b, taskEntity0, createReminderOptionsInternal0, azug0);
        this.c.b(ejwa0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ejtq ejtq0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface0 instanceof ejtq) ? ((ejtq)iInterface0) : new ejtq(iBinder0);
                }
                LoadRemindersOptions loadRemindersOptions0 = (LoadRemindersOptions)wbz.a(parcel0, LoadRemindersOptions.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                try {
                    azuf azuf0 = azug.b(apiMetadata0);
                    azuf0.f(azud.a);
                    azuf0.e(bbdp.ex);
                    azuf0.g(bbdq.Y);
                    azuf0.d(this.b);
                    azuf0.c(this.d);
                    azug azug0 = azuf0.a();
                    ejwg ejwg0 = new ejwg(ejtq0, this.a, loadRemindersOptions0, azug0);
                    this.c.b(ejwg0);
                    break;
                }
                catch(NullPointerException nullPointerException0) {
                    throw new NullPointerException(Log.getStackTraceString(nullPointerException0));
                }
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface1 instanceof ejtq) ? ((ejtq)iInterface1) : new ejtq(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf1 = azug.b(apiMetadata1);
                azuf1.f(azud.a);
                azuf1.e(bbdp.ex);
                azuf1.g(bbdq.Y);
                azuf1.d(this.b);
                azuf1.c(this.d);
                azug azug1 = azuf1.a();
                ejvs ejvs0 = new ejvs(this, ejtq0, this.a, azug1);
                this.c.b(ejvs0);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface2 instanceof ejtq) ? ((ejtq)iInterface2) : new ejtq(iBinder2);
                }
                TaskEntity taskEntity0 = (TaskEntity)wbz.a(parcel0, TaskEntity.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                this.c(ejtq0, taskEntity0, CreateReminderOptionsInternal.a, apiMetadata2);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface3 instanceof ejtq) ? ((ejtq)iInterface3) : new ejtq(iBinder3);
                }
                TaskEntity taskEntity1 = (TaskEntity)wbz.a(parcel0, TaskEntity.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                this.a(ejtq0, Collections.singletonList(taskEntity1), apiMetadata3);
                break;
            }
            case 5: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface4 instanceof ejtq) ? ((ejtq)iInterface4) : new ejtq(iBinder4);
                }
                TaskIdEntity taskIdEntity0 = (TaskIdEntity)wbz.a(parcel0, TaskIdEntity.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf2 = azug.b(apiMetadata4);
                azuf2.f(azud.a);
                azuf2.e(bbdp.ex);
                azuf2.g(bbdq.Y);
                azuf2.d(this.b);
                azuf2.c(this.d);
                azug azug2 = azuf2.a();
                ejwc ejwc0 = new ejwc(ejtq0, this.a, this.b, taskIdEntity0, azug2);
                this.c.b(ejwc0);
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface5 instanceof ejtq) ? ((ejtq)iInterface5) : new ejtq(iBinder5);
                }
                TaskIdEntity taskIdEntity1 = (TaskIdEntity)wbz.a(parcel0, TaskIdEntity.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf3 = azug.b(apiMetadata5);
                azuf3.f(azud.a);
                azuf3.e(bbdp.ex);
                azuf3.g(bbdq.Y);
                azuf3.d(this.b);
                azuf3.c(this.d);
                azug azug3 = azuf3.a();
                ejvv ejvv0 = new ejvv(ejtq0, this.a, this.b, taskIdEntity1, azug3);
                this.c.b(ejvv0);
                break;
            }
            case 7: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface6 instanceof ejtq) ? ((ejtq)iInterface6) : new ejtq(iBinder6);
                }
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf4 = azug.b(apiMetadata6);
                azuf4.f(azud.a);
                azuf4.e(bbdp.ex);
                azuf4.g(bbdq.Y);
                azuf4.d(this.b);
                azuf4.c(this.d);
                azug azug4 = azuf4.a();
                ejwf ejwf0 = new ejwf(ejtq0, this.a, azug4);
                this.c.b(ejwf0);
                break;
            }
            case 8: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface7 instanceof ejtq) ? ((ejtq)iInterface7) : new ejtq(iBinder7);
                }
                TaskEntity taskEntity2 = (TaskEntity)wbz.a(parcel0, TaskEntity.CREATOR);
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf5 = azug.b(apiMetadata7);
                azuf5.f(azud.a);
                azuf5.e(bbdp.ex);
                azuf5.g(bbdq.Y);
                azuf5.d(this.b);
                azuf5.c(this.d);
                azug azug5 = azuf5.a();
                ejvz ejvz0 = new ejvz(ejtq0, this.a, this.b, taskEntity2, azug5);
                this.c.b(ejvz0);
                break;
            }
            case 9: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface8 instanceof ejtq) ? ((ejtq)iInterface8) : new ejtq(iBinder8);
                }
                String s = parcel0.readString();
                TaskEntity taskEntity3 = (TaskEntity)wbz.a(parcel0, TaskEntity.CREATOR);
                UpdateRecurrenceOptions updateRecurrenceOptions0 = (UpdateRecurrenceOptions)wbz.a(parcel0, UpdateRecurrenceOptions.CREATOR);
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf6 = azug.b(apiMetadata8);
                azuf6.f(azud.a);
                azuf6.e(bbdp.ex);
                azuf6.g(bbdq.Y);
                azuf6.d(this.b);
                azuf6.c(this.d);
                azug azug6 = azuf6.a();
                ejwm ejwm0 = new ejwm(ejtq0, this.a, this.b, s, taskEntity3, updateRecurrenceOptions0, azug6);
                this.c.b(ejwm0);
                break;
            }
            case 10: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface9 instanceof ejtq) ? ((ejtq)iInterface9) : new ejtq(iBinder9);
                }
                String s1 = parcel0.readString();
                UpdateRecurrenceOptions updateRecurrenceOptions1 = (UpdateRecurrenceOptions)wbz.a(parcel0, UpdateRecurrenceOptions.CREATOR);
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf7 = azug.b(apiMetadata9);
                azuf7.f(azud.a);
                azuf7.e(bbdp.ex);
                azuf7.g(bbdq.Y);
                azuf7.d(this.b);
                azuf7.c(this.d);
                azug azug7 = azuf7.a();
                ejwb ejwb0 = new ejwb(ejtq0, this.a, this.b, s1, updateRecurrenceOptions1, azug7);
                this.c.b(ejwb0);
                break;
            }
            case 11: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface10 instanceof ejtq) ? ((ejtq)iInterface10) : new ejtq(iBinder10);
                }
                String s2 = parcel0.readString();
                TaskEntity taskEntity4 = (TaskEntity)wbz.a(parcel0, TaskEntity.CREATOR);
                UpdateRecurrenceOptions updateRecurrenceOptions2 = (UpdateRecurrenceOptions)wbz.a(parcel0, UpdateRecurrenceOptions.CREATOR);
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf8 = azug.b(apiMetadata10);
                azuf8.f(azud.a);
                azuf8.e(bbdp.ex);
                azuf8.g(bbdq.Y);
                azuf8.d(this.b);
                azuf8.c(this.d);
                azug azug8 = azuf8.a();
                ejvw ejvw0 = new ejvw(ejtq0, this.a, this.b, s2, taskEntity4, updateRecurrenceOptions2, azug8);
                this.c.b(ejvw0);
                break;
            }
            case 12: {
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface11 instanceof ejtq) ? ((ejtq)iInterface11) : new ejtq(iBinder11);
                }
                TaskEntity taskEntity5 = (TaskEntity)wbz.a(parcel0, TaskEntity.CREATOR);
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf9 = azug.b(apiMetadata11);
                azuf9.f(azud.a);
                azuf9.e(bbdp.ex);
                azuf9.g(bbdq.Y);
                azuf9.d(this.b);
                azuf9.c(this.d);
                azug azug9 = azuf9.a();
                ejwi ejwi0 = new ejwi(ejtq0, this.a, this.b, taskEntity5, azug9);
                this.c.b(ejwi0);
                break;
            }
            case 13: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface12 instanceof ejtq) ? ((ejtq)iInterface12) : new ejtq(iBinder12);
                }
                String s3 = parcel0.readString();
                TaskEntity taskEntity6 = (TaskEntity)wbz.a(parcel0, TaskEntity.CREATOR);
                UpdateRecurrenceOptions updateRecurrenceOptions3 = (UpdateRecurrenceOptions)wbz.a(parcel0, UpdateRecurrenceOptions.CREATOR);
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf10 = azug.b(apiMetadata12);
                azuf10.f(azud.a);
                azuf10.e(bbdp.ex);
                azuf10.g(bbdq.Y);
                azuf10.d(this.b);
                azuf10.c(this.d);
                azug azug10 = azuf10.a();
                ejwh ejwh0 = new ejwh(ejtq0, this.a, this.b, s3, taskEntity6, updateRecurrenceOptions3, azug10);
                this.c.b(ejwh0);
                break;
            }
            case 14: {
                ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf11 = azug.b(apiMetadata13);
                azuf11.f(azud.a);
                azuf11.e(bbdp.ex);
                azuf11.g(bbdq.Y);
                azuf11.d(this.b);
                azuf11.c(this.d);
                azug azug11 = azuf11.a();
                ejvy ejvy0 = new ejvy(this, this.a, azug11);
                this.c.b(ejvy0);
                break;
            }
            case 15: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface13 instanceof ejtq) ? ((ejtq)iInterface13) : new ejtq(iBinder13);
                }
                ArrayList arrayList0 = parcel0.createTypedArrayList(TaskEntity.CREATOR);
                ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                this.a(ejtq0, arrayList0, apiMetadata14);
                break;
            }
            case 16: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface14 instanceof ejtq) ? ((ejtq)iInterface14) : new ejtq(iBinder14);
                }
                TaskEntity taskEntity7 = (TaskEntity)wbz.a(parcel0, TaskEntity.CREATOR);
                CreateReminderOptionsInternal createReminderOptionsInternal0 = (CreateReminderOptionsInternal)wbz.a(parcel0, CreateReminderOptionsInternal.CREATOR);
                ApiMetadata apiMetadata15 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                this.c(ejtq0, taskEntity7, createReminderOptionsInternal0, apiMetadata15);
                break;
            }
            case 17: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface15 instanceof ejtq) ? ((ejtq)iInterface15) : new ejtq(iBinder15);
                }
                ApiMetadata apiMetadata16 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf12 = azug.b(apiMetadata16);
                azuf12.f(azud.a);
                azuf12.e(bbdp.ex);
                azuf12.g(bbdq.Y);
                azuf12.d(this.b);
                azuf12.c(this.d);
                azug azug12 = azuf12.a();
                ejwe ejwe0 = new ejwe(ejtq0, this.a, azug12);
                this.c.b(ejwe0);
                break;
            }
            case 18: {
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface16 instanceof ejtq) ? ((ejtq)iInterface16) : new ejtq(iBinder16);
                }
                CustomizedSnoozePresetEntity customizedSnoozePresetEntity0 = (CustomizedSnoozePresetEntity)wbz.a(parcel0, CustomizedSnoozePresetEntity.CREATOR);
                ApiMetadata apiMetadata17 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf13 = azug.b(apiMetadata17);
                azuf13.f(azud.a);
                azuf13.e(bbdp.ex);
                azuf13.g(bbdq.Y);
                azuf13.d(this.b);
                azuf13.c(this.d);
                azug azug13 = azuf13.a();
                ejwl ejwl0 = new ejwl(ejtq0, this.a, this.b, customizedSnoozePresetEntity0, azug13);
                this.c.b(ejwl0);
                break;
            }
            case 19: {
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 != null) {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface17 instanceof ejtq) ? ((ejtq)iInterface17) : new ejtq(iBinder17);
                }
                AccountState accountState0 = (AccountState)wbz.a(parcel0, AccountState.CREATOR);
                ApiMetadata apiMetadata18 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf14 = azug.b(apiMetadata18);
                azuf14.f(azud.a);
                azuf14.e(bbdp.ex);
                azuf14.g(bbdq.Y);
                azuf14.d(this.b);
                azuf14.c(this.d);
                azug azug14 = azuf14.a();
                ejwk ejwk0 = new ejwk(ejtq0, this.a, accountState0, azug14);
                this.c.b(ejwk0);
                break;
            }
            case 20: {
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface18 instanceof ejtq) ? ((ejtq)iInterface18) : new ejtq(iBinder18);
                }
                ApiMetadata apiMetadata19 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf15 = azug.b(apiMetadata19);
                azuf15.f(azud.a);
                azuf15.e(bbdp.ex);
                azuf15.g(bbdq.Y);
                azuf15.d(this.b);
                azuf15.c(this.d);
                azug azug15 = azuf15.a();
                ejwd ejwd0 = new ejwd(ejtq0, this.a, azug15);
                this.c.b(ejwd0);
                break;
            }
            case 21: {
                IBinder iBinder19 = parcel0.readStrongBinder();
                if(iBinder19 != null) {
                    IInterface iInterface19 = iBinder19.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface19 instanceof ejtq) ? ((ejtq)iInterface19) : new ejtq(iBinder19);
                }
                ReindexDueDatesOptions reindexDueDatesOptions0 = (ReindexDueDatesOptions)wbz.a(parcel0, ReindexDueDatesOptions.CREATOR);
                ApiMetadata apiMetadata20 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf16 = azug.b(apiMetadata20);
                azuf16.f(azud.a);
                azuf16.e(bbdp.ex);
                azuf16.g(bbdq.Y);
                azuf16.d(this.b);
                azuf16.c(this.d);
                azug azug16 = azuf16.a();
                ejvx ejvx0 = new ejvx(ejtq0, this.a, reindexDueDatesOptions0, azug16);
                this.c.b(ejvx0);
                break;
            }
            case 22: {
                IBinder iBinder20 = parcel0.readStrongBinder();
                if(iBinder20 != null) {
                    IInterface iInterface20 = iBinder20.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    ejtq0 = (iInterface20 instanceof ejtq) ? ((ejtq)iInterface20) : new ejtq(iBinder20);
                }
                ReindexDueDatesOptions reindexDueDatesOptions1 = (ReindexDueDatesOptions)wbz.a(parcel0, ReindexDueDatesOptions.CREATOR);
                ApiMetadata apiMetadata21 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ejts.gr(parcel0);
                azuf azuf17 = azug.b(apiMetadata21);
                azuf17.f(azud.a);
                azuf17.e(bbdp.ex);
                azuf17.g(bbdq.Y);
                azuf17.d(this.b);
                azuf17.c(this.d);
                azug azug17 = azuf17.a();
                ejwj ejwj0 = new ejwj(ejtq0, this.a, this.b, reindexDueDatesOptions1, azug17);
                this.c.b(ejwj0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

