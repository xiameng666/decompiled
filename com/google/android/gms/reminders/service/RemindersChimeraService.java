package com.google.android.gms.reminders.service;

import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ejts;
import java.util.Collections;

public class RemindersChimeraService extends cjtg {
    public RemindersChimeraService() {
        super(18, "com.google.android.gms.reminders.service.START", Collections.EMPTY_SET, 1, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new ejts(this.l(), (getServiceRequest0.j == null ? null : getServiceRequest0.j.name), getServiceRequest0.f, getServiceRequest0.p));
    }
}

