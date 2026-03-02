import android.net.Uri;
import java.io.File;

final class dgnl extends ibsl implements ibtw {
    int a;
    final dgop b;
    final cuwu c;

    public dgnl(dgop dgop0, cuwu cuwu0, ibrl ibrl0) {
        this.b = dgop0;
        this.c = cuwu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgnl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgnl(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        Boolean boolean0 = Boolean.valueOf(true);
        Object object2 = null;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                this.a = 1;
                if(this.b.i.a(this.c.i, this) == object1) {
                    return object1;
                }
                goto label_38;
            }
            catch(Throwable throwable0) {
            label_11:
                cuwu cuwu0 = this.c;
                if(cuwu0.j == 2) {
                    if(hvrc.f()) {
                        cunf cunf0 = dcvz.a;
                        cunf cunf1 = cunf0.e();
                        long v = cuwu0.i;
                        cunf1.i("Received payload is unknown with id %d of type FILE. Deleting.", new Long(v), new Integer(2));
                        cuws cuws0 = cuwu0.l;
                        if(cuws0 != null) {
                            File file0 = cuws0.a;
                            if(file0 != null) {
                                object2 = Boolean.valueOf(file0.delete());
                            }
                        }
                        if(ibuq.m(object2, boolean0)) {
                            cunf0.b().h("Successfully deleted a file payload with id %d.", new Long(v));
                        }
                        else {
                            cunf0.e().h("Failed to delete file payload with id %d.", new Long(v));
                        }
                    }
                    else {
                        cuws cuws1 = cuwu0.l;
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
                }
                throw throwable0;
            }
            return object1;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                goto label_11;
            }
        }
    label_38:
        cuwu cuwu1 = this.c;
        if(cuwu1.j == 2) {
            if(hvrc.f()) {
                cunf cunf2 = dcvz.a;
                cunf cunf3 = cunf2.e();
                long v1 = cuwu1.i;
                cunf3.i("Received payload is unknown with id %d of type FILE. Deleting.", new Long(v1), new Integer(2));
                cuws cuws2 = cuwu1.l;
                if(cuws2 != null) {
                    File file1 = cuws2.a;
                    if(file1 != null) {
                        object2 = Boolean.valueOf(file1.delete());
                    }
                }
                if(ibuq.m(object2, boolean0)) {
                    cunf2.b().h("Successfully deleted a file payload with id %d.", new Long(v1));
                    return ibom.a;
                }
                cunf2.e().h("Failed to delete file payload with id %d.", new Long(v1));
                return ibom.a;
            }
            cuws cuws3 = cuwu1.l;
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
        return ibom.a;
    }
}

