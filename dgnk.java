import android.net.Uri;
import java.io.File;

final class dgnk extends ibsl implements ibtw {
    int a;
    final dgnb b;
    final dgop c;
    final cuwu d;

    public dgnk(dgnb dgnb0, dgop dgop0, cuwu cuwu0, ibrl ibrl0) {
        this.b = dgnb0;
        this.c = dgop0;
        this.d = cuwu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgnk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgnk(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        Boolean boolean0 = Boolean.valueOf(true);
        Object object2 = null;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                if(ibuq.m(this.b, dgmu.a)) {
                    long v = hvqs.al();
                    dgnj dgnj0 = new dgnj(this.c, null);
                    this.a = 1;
                    object0 = icfo.c(v, dgnj0, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_15;
                }
                else {
                    goto label_16;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_15:
                if(((dgnb)object0) == null || !this.c.j(((dgnb)object0), this.d)) {
                    try {
                    label_16:
                        this.a = 2;
                        if(this.c.i.a(this.d.i, this) == object1) {
                            return object1;
                        }
                    }
                    catch(Throwable throwable0) {
                    label_20:
                        if(hvrc.f()) {
                            cunf cunf0 = dcvz.a;
                            cunf cunf1 = cunf0.e();
                            long v1 = this.d.i;
                            cunf1.i("Received payload is unknown with id %d of type FILE. Deleting.", new Long(v1), new Integer(this.d.j));
                            cuws cuws0 = this.d.l;
                            if(cuws0 != null) {
                                File file0 = cuws0.a;
                                if(file0 != null) {
                                    object2 = Boolean.valueOf(file0.delete());
                                }
                            }
                            if(ibuq.m(object2, boolean0)) {
                                cunf0.b().h("Successfully deleted a file payload with id %d.", new Long(v1));
                            }
                            else {
                                cunf0.e().h("Failed to delete file payload with id %d.", new Long(v1));
                            }
                        }
                        else {
                            cuws cuws1 = this.d.l;
                            if(cuws1 != null) {
                                Uri uri0 = cuws1.d;
                                if(uri0 != null) {
                                    if(ibuq.m(uri0.getScheme(), "file")) {
                                        object2 = uri0;
                                    }
                                    if(object2 != null) {
                                        jyr.a(((Uri)object2)).delete();
                                    }
                                }
                            }
                        }
                        throw throwable0;
                    }
                label_45:
                    if(hvrc.f()) {
                        cunf cunf2 = dcvz.a;
                        cunf cunf3 = cunf2.e();
                        long v2 = this.d.i;
                        cunf3.i("Received payload is unknown with id %d of type FILE. Deleting.", new Long(v2), new Integer(this.d.j));
                        cuws cuws2 = this.d.l;
                        if(cuws2 != null) {
                            File file1 = cuws2.a;
                            if(file1 != null) {
                                object2 = Boolean.valueOf(file1.delete());
                            }
                        }
                        if(ibuq.m(object2, boolean0)) {
                            cunf2.b().h("Successfully deleted a file payload with id %d.", new Long(v2));
                            return ibom.a;
                        }
                        cunf2.e().h("Failed to delete file payload with id %d.", new Long(v2));
                        return ibom.a;
                    }
                    cuws cuws3 = this.d.l;
                    if(cuws3 != null) {
                        Uri uri1 = cuws3.d;
                        if(uri1 != null) {
                            if(ibuq.m(uri1.getScheme(), "file")) {
                                object2 = uri1;
                            }
                            if(object2 != null) {
                                jyr.a(((Uri)object2)).delete();
                            }
                        }
                    }
                }
                break;
            }
            default: {
                try {
                    ibnx.b(object0);
                    goto label_45;
                }
                catch(Throwable throwable0) {
                    goto label_20;
                }
            }
        }
        return ibom.a;
    }
}

