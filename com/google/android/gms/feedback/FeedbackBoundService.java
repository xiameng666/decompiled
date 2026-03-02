package com.google.android.gms.feedback;

import bbcu;
import bbdg;
import bboh;
import bleg;
import ccmq;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class FeedbackBoundService extends cjtg {
    public static final bboh a;

    static {
        FeedbackBoundService.a = bboh.b("gf_FeedbackService", bbcu.D);
    }

    public FeedbackBoundService() {
        super(29, "com.google.android.gms.feedback.internal.IFeedbackService", ggnj.a, 2, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new bleg(this, this.l(), getServiceRequest0.f));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        ccmq.a().a(bbdg.rT);
    }
}

