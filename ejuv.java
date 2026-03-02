import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.ExternalApplicationLinkEntity;
import com.google.android.gms.reminders.model.LocationEntity;
import com.google.android.gms.reminders.model.LocationGroupEntity;
import com.google.android.gms.reminders.model.RecurrenceInfoEntity;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskIdEntity;

public final class ejuv implements Parcelable.Creator {
    public static void a(TaskEntity taskEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, taskEntity0.a, v, false);
        baub.F(parcel0, 3, taskEntity0.b);
        baub.v(parcel0, 4, taskEntity0.c, false);
        baub.t(parcel0, 6, taskEntity0.k, v, false);
        baub.t(parcel0, 7, taskEntity0.m, v, false);
        baub.t(parcel0, 8, taskEntity0.l, v, false);
        baub.z(parcel0, 9, taskEntity0.f);
        baub.z(parcel0, 11, taskEntity0.g);
        baub.I(parcel0, 12, taskEntity0.e);
        baub.t(parcel0, 13, taskEntity0.n, v, false);
        baub.I(parcel0, 15, taskEntity0.o);
        baub.i(parcel0, 16, taskEntity0.p, false);
        baub.t(parcel0, 17, taskEntity0.q, v, false);
        baub.i(parcel0, 18, taskEntity0.r, false);
        baub.I(parcel0, 19, taskEntity0.d);
        baub.F(parcel0, 20, taskEntity0.s);
        baub.z(parcel0, 22, taskEntity0.h);
        baub.z(parcel0, 23, taskEntity0.i);
        baub.I(parcel0, 24, taskEntity0.j);
        baub.t(parcel0, 26, taskEntity0.t, v, false);
        baub.I(parcel0, 27, taskEntity0.u);
        baub.I(parcel0, 1001, taskEntity0.v);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TaskIdEntity taskIdEntity0 = null;
        Integer integer0 = null;
        String s = null;
        Long long0 = null;
        Long long1 = null;
        Boolean boolean0 = null;
        Boolean boolean1 = null;
        Boolean boolean2 = null;
        Boolean boolean3 = null;
        Long long2 = null;
        DateTimeEntity dateTimeEntity0 = null;
        DateTimeEntity dateTimeEntity1 = null;
        LocationEntity locationEntity0 = null;
        LocationGroupEntity locationGroupEntity0 = null;
        Long long3 = null;
        byte[] arr_b = null;
        RecurrenceInfoEntity recurrenceInfoEntity0 = null;
        byte[] arr_b1 = null;
        Integer integer1 = null;
        ExternalApplicationLinkEntity externalApplicationLinkEntity0 = null;
        Long long4 = null;
        Long long5 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    taskIdEntity0 = (TaskIdEntity)baua.m(parcel0, v1, TaskIdEntity.CREATOR);
                    break;
                }
                case 3: {
                    integer0 = baua.q(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 6: {
                    dateTimeEntity0 = (DateTimeEntity)baua.m(parcel0, v1, DateTimeEntity.CREATOR);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 7: {
                    locationEntity0 = (LocationEntity)baua.m(parcel0, v1, LocationEntity.CREATOR);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 8: {
                    dateTimeEntity1 = (DateTimeEntity)baua.m(parcel0, v1, DateTimeEntity.CREATOR);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 9: {
                    boolean0 = baua.n(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 11: {
                    boolean1 = baua.n(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 12: {
                    long1 = baua.r(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 13: {
                    locationGroupEntity0 = (LocationGroupEntity)baua.m(parcel0, v1, LocationGroupEntity.CREATOR);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 15: {
                    long3 = baua.r(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 16: {
                    arr_b = baua.E(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 17: {
                    recurrenceInfoEntity0 = (RecurrenceInfoEntity)baua.m(parcel0, v1, RecurrenceInfoEntity.CREATOR);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 18: {
                    arr_b1 = baua.E(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 19: {
                    long0 = baua.r(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 20: {
                    integer1 = baua.q(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 22: {
                    boolean2 = baua.n(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 23: {
                    boolean3 = baua.n(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 24: {
                    long2 = baua.r(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 26: {
                    externalApplicationLinkEntity0 = (ExternalApplicationLinkEntity)baua.m(parcel0, v1, ExternalApplicationLinkEntity.CREATOR);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 27: {
                    long4 = baua.r(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                case 1001: {
                    long5 = baua.r(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                    taskIdEntity0 = taskIdEntity0;
                }
            }
        }
        baua.A(parcel0, v);
        return new TaskEntity(taskIdEntity0, integer0, s, long0, long1, boolean0, boolean1, boolean2, boolean3, long2, dateTimeEntity0, dateTimeEntity1, locationEntity0, locationGroupEntity0, long3, arr_b, recurrenceInfoEntity0, arr_b1, integer1, externalApplicationLinkEntity0, long4, long5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TaskEntity[v];
    }
}

