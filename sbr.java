import android.content.Context;
import java.util.concurrent.CancellationException;

final class sbr extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final sbv f;
    final ryh g;
    private Object h;

    public sbr(sbv sbv0, ryh ryh0, ibrl ibrl0) {
        this.f = sbv0;
        this.g = ryh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((sbr)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new sbr(this.f, this.g, ibrl0);
        ibrl1.h = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        icih icih2;
        Object object9;
        Object object8;
        icig icig0;
        Object object6;
        sbv sbv1;
        Object object5;
        icih icih1;
        Object object4;
        Object object1 = ibrx.a;
        switch(this.e) {
            case 0: {
                ibnx.b(object0);
                icih icih0 = (icih)this.h;
                object4 = this.g;
                sbv sbv0 = this.f;
                try {
                    Context context0 = sbv0.d();
                    ibuq.e(context0, "access$getApplicationContext(...)");
                    rzq.a(context0);
                    this.h = icih0;
                    this.a = object4;
                    this.b = object4;
                    this.c = sbv0;
                    this.d = object4;
                    this.e = 1;
                    if(sbv0.c.f(this) != object1) {
                        goto label_32;
                    }
                    break;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object4;
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), cancellationException0);
                    throw cancellationException0;
                }
                catch(sbw sbw0) {
                    object2 = object4;
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), sbw0);
                    throw sbw0;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    object3 = object4;
                    object2 = object3;
                    sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), throwable0);
                    throw new sbw(((rrc)object3), throwable0);
                }
            label_32:
                icih1 = icih0;
                object5 = object4;
                sbv1 = sbv0;
                object6 = object5;
                goto label_50;
            }
            case 1: {
                ryh ryh0 = (ryh)this.d;
                sbv1 = (sbv)this.c;
                object6 = this.b;
                Object object7 = this.a;
                icih1 = (icih)this.h;
                try {
                    ibnx.b(object0);
                    object5 = ryh0;
                    object4 = object7;
                    goto label_50;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object6;
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), cancellationException0);
                    throw cancellationException0;
                }
                catch(sbw sbw0) {
                    object2 = object6;
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), sbw0);
                    throw sbw0;
                }
                catch(Throwable throwable0) {
                }
                object2 = object6;
                object3 = object7;
                sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
                sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), throwable0);
                throw new sbw(((rrc)object3), throwable0);
                try {
                label_50:
                    ryf ryf0 = sbv1.c;
                    rxv rxv0 = ryf0.c(((ryv)object5));
                    if(ryf0.c(((ryv)object5)).p()) {
                        sct.c("OnboardingTaskServiceServer", a.i(object5, "Task(", ") is already complete. Closing metadata observer."));
                        rnv rnv1 = rxv0.g();
                        if(rnv1 == null) {
                            rnv1 = new rnv();
                        }
                        this.h = object4;
                        this.a = object6;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = 2;
                        if(icih1.a(rnv1, this) != object1) {
                            return ibom.a;
                        }
                    }
                    else {
                        ibuq.f(object5, "token");
                        rrb rrb0 = new rrb(((rrc)object5));
                        icgv icgv0 = (icgv)ryf0.d.get(rrb0);
                        icig0 = icgv0 == null ? null : new icia(icgv0, false);
                        if(icig0 == null) {
                            sct.e("OnboardingTaskServiceServer", a.a(rqy.a(((rrc)object5)), "Metadata flow not found for node ", "."));
                            throw new IllegalStateException("Metadata cannot be found.");
                        }
                        rnv rnv0 = rxv0.g();
                        if(rnv0 == null) {
                            rnv0 = new rnv();
                        }
                        this.h = icih1;
                        this.a = object4;
                        this.b = object6;
                        this.c = object5;
                        this.d = icig0;
                        this.e = 3;
                        if(icih1.a(rnv0, this) != object1) {
                            object8 = object5;
                            object9 = object6;
                            icih2 = icih1;
                            goto label_124;
                        }
                    }
                    break;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object6;
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), cancellationException0);
                    throw cancellationException0;
                }
                catch(sbw sbw0) {
                    object2 = object6;
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), sbw0);
                    throw sbw0;
                }
                catch(Throwable throwable2) {
                    throwable0 = throwable2;
                    object3 = object4;
                    object2 = object6;
                    sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), throwable0);
                    throw new sbw(((rrc)object3), throwable0);
                }
                return ibom.a;
            }
            case 2: {
                object2 = this.a;
                object3 = (rrc)this.h;
                try {
                    ibnx.b(object0);
                    return ibom.a;
                }
                catch(CancellationException cancellationException0) {
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), cancellationException0);
                    throw cancellationException0;
                }
                catch(sbw sbw0) {
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), sbw0);
                    throw sbw0;
                }
                catch(Throwable throwable0) {
                    sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), throwable0);
                    throw new sbw(((rrc)object3), throwable0);
                }
            }
            case 3: {
                icig icig1 = (icig)this.d;
                object8 = (ryh)this.c;
                object9 = this.b;
                Object object10 = this.a;
                icih2 = (icih)this.h;
                try {
                    ibnx.b(object0);
                    icig0 = icig1;
                    object4 = object10;
                    goto label_124;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object9;
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), cancellationException0);
                    throw cancellationException0;
                }
                catch(sbw sbw0) {
                    object2 = object9;
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), sbw0);
                    throw sbw0;
                }
                catch(Throwable throwable0) {
                }
                object2 = object9;
                object3 = object10;
                sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
                sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), throwable0);
                throw new sbw(((rrc)object3), throwable0);
                try {
                label_124:
                    sbq sbq0 = new sbq(((ryh)object8), icih2);
                    this.h = object4;
                    this.a = object9;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = 4;
                    if(icig0.oR(sbq0, this) != object1) {
                        return ibom.a;
                    }
                    break;
                }
                catch(CancellationException cancellationException0) {
                    object2 = object9;
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), cancellationException0);
                    throw cancellationException0;
                }
                catch(sbw sbw0) {
                    object2 = object9;
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), sbw0);
                    throw sbw0;
                }
                catch(Throwable throwable3) {
                    throwable0 = throwable3;
                    object3 = object4;
                    object2 = object9;
                }
                sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
                sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), throwable0);
                throw new sbw(((rrc)object3), throwable0);
            }
            default: {
                object2 = this.a;
                object3 = (rrc)this.h;
                try {
                    ibnx.b(object0);
                    return ibom.a;
                }
                catch(CancellationException cancellationException0) {
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), cancellationException0);
                    throw cancellationException0;
                }
                catch(sbw sbw0) {
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), sbw0);
                    throw sbw0;
                }
                catch(Throwable throwable0) {
                    sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
                    sct.f("OnboardingTaskServiceServer", "Failure observing task metadata for node " + rqy.a(((rrc)object2)), throwable0);
                    throw new sbw(((rrc)object3), throwable0);
                }
            }
        }
        return object1;
    }
}

