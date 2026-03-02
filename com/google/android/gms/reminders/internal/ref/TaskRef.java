package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.android.gms.reminders.model.Task;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskId;
import ejub;
import ejuv;

public class TaskRef extends ejub implements Task {
    private boolean f;
    private TaskIdRef g;
    private boolean h;
    private DateTimeRef i;
    private boolean j;
    private DateTimeRef k;
    private boolean l;
    private LocationRef m;
    private boolean n;
    private LocationGroupRef o;
    private boolean p;
    private RecurrenceInfoRef q;
    private boolean r;
    private ExternalApplicationLinkRef s;

    public TaskRef(DataHolder dataHolder0, int v) {
        super(dataHolder0, v, "");
        this.f = false;
        this.h = false;
        this.j = false;
        this.l = false;
        this.n = false;
        this.p = false;
        this.r = false;
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Boolean I() {
        return Boolean.valueOf(this.t(this.p("snoozed")));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Integer J() {
        return this.n(this.p("experiment"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Integer K() {
        return this.n(this.p("task_list"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Long L() {
        return this.o(this.p("archived_time_ms"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Long M() {
        return this.o(this.p("created_time_millis"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Long N() {
        return this.o(this.p("due_date_millis"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Long O() {
        return this.o(this.p("fired_time_millis"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Long P() {
        return this.o(this.p("location_snoozed_until_ms"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Long Q() {
        return this.o(this.p("snoozed_time_millis"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final String R() {
        return this.r(this.p("title"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final byte[] S() {
        return this.w(this.p("assistance"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final byte[] T() {
        return this.w(this.p("extensions"));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final DateTime a() {
        if(!this.h) {
            this.h = true;
            DataHolder dataHolder0 = this.a;
            String s = this.d;
            if(DateTimeRef.k(dataHolder0, this.b, this.e, s + "due_date_")) {
                this.i = null;
                return this.i;
            }
            this.i = new DateTimeRef(dataHolder0, this.b, s + "due_date_");
        }
        return this.i;
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final DateTime c() {
        if(!this.j) {
            this.j = true;
            DataHolder dataHolder0 = this.a;
            String s = this.d;
            if(DateTimeRef.k(dataHolder0, this.b, this.e, s + "event_date_")) {
                this.k = null;
                return this.k;
            }
            this.k = new DateTimeRef(dataHolder0, this.b, s + "event_date_");
        }
        return this.k;
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final ExternalApplicationLink d() {
        if(!this.r) {
            this.r = true;
            DataHolder dataHolder0 = this.a;
            int v = this.b;
            int v1 = this.e;
            String s = this.d;
            if(dataHolder0.f(ExternalApplicationLinkRef.G(s, "link_application"), v, v1) && dataHolder0.f(ExternalApplicationLinkRef.G(s, "link_id"), v, v1)) {
                this.s = null;
                return this.s;
            }
            this.s = new ExternalApplicationLinkRef(dataHolder0, this.b, s);
        }
        return this.s;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Location e() {
        if(!this.l) {
            this.l = true;
            DataHolder dataHolder0 = this.a;
            int v = this.b;
            int v1 = this.e;
            String s = this.d;
            if(dataHolder0.f(LocationRef.G(s, "lat"), v, v1) && dataHolder0.f(LocationRef.G(s, "lng"), v, v1) && dataHolder0.f(LocationRef.G(s, "name"), v, v1) && dataHolder0.f(LocationRef.G(s, "radius_meters"), v, v1) && dataHolder0.f(LocationRef.G(s, "location_type"), v, v1) && FeatureIdProtoRef.d(dataHolder0, v, v1, s + "location_") && dataHolder0.f(LocationRef.G(s, "display_address"), v, v1) && AddressRef.j(dataHolder0, v, v1, s + "address_") && dataHolder0.f(LocationRef.G(s, "location_alias_id"), v, v1)) {
                this.m = null;
                return this.m;
            }
            this.m = new LocationRef(dataHolder0, this.b, s);
        }
        return this.m;
    }

    @Override  // bakp
    public final boolean equals(Object object0) {
        if(!(object0 instanceof Task)) {
            return false;
        }
        return this == object0 ? true : TaskEntity.m(this, ((Task)object0));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final LocationGroup f() {
        if(!this.n) {
            this.n = true;
            DataHolder dataHolder0 = this.a;
            int v = this.b;
            int v1 = this.e;
            String s = this.d;
            if(dataHolder0.f(LocationGroupRef.G(s, "location_query"), v, v1) && dataHolder0.f(LocationGroupRef.G(s, "location_query_type"), v, v1) && ChainInfoRef.d(dataHolder0, v, v1, s) && CategoryInfoRef.e(dataHolder0, v, v1, s)) {
                this.o = null;
                return this.o;
            }
            this.o = new LocationGroupRef(dataHolder0, this.b, s);
        }
        return this.o;
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final RecurrenceInfo g() {
        if(!this.p) {
            this.p = true;
            DataHolder dataHolder0 = this.a;
            int v = this.b;
            int v1 = this.e;
            String s = this.d;
            if(RecurrenceRef.j(dataHolder0, v, v1, s) && dataHolder0.f(RecurrenceInfoRef.G(s, "recurrence_id"), v, v1) && dataHolder0.f(RecurrenceInfoRef.G(s, "recurrence_master"), v, v1) && dataHolder0.f(RecurrenceInfoRef.G(s, "recurrence_exceptional"), v, v1)) {
                this.q = null;
                return this.q;
            }
            this.q = new RecurrenceInfoRef(dataHolder0, this.b, s);
        }
        return this.q;
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final TaskId h() {
        if(!this.f) {
            this.f = true;
            DataHolder dataHolder0 = this.a;
            int v = this.b;
            int v1 = this.e;
            String s = this.d;
            if(dataHolder0.f(TaskIdRef.G(s, "client_assigned_id"), v, v1) && dataHolder0.f(TaskIdRef.G(s, "client_assigned_thread_id"), v, v1)) {
                this.g = null;
                return this.g;
            }
            this.g = new TaskIdRef(dataHolder0, this.b, s);
        }
        return this.g;
    }

    @Override  // bakp
    public final int hashCode() {
        return TaskEntity.b(this);
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Boolean i() {
        return Boolean.valueOf(this.t(this.p("archived")));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Boolean j() {
        return Boolean.valueOf(this.t(this.p("deleted")));
    }

    @Override  // com.google.android.gms.reminders.model.Task
    public final Boolean k() {
        return Boolean.valueOf(this.t(this.p("pinned")));
    }

    @Override  // bakp, bakw
    public final Object l() {
        return new TaskEntity(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejuv.a(new TaskEntity(this), parcel0, v);
    }
}

