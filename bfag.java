import android.database.Cursor;
import android.net.Uri;
import java.util.List;

public final class bfag extends ibsl implements ibtw {
    int a;
    final bfah b;
    final Uri c;

    public bfag(bfah bfah0, Uri uri0, ibrl ibrl0) {
        this.b = bfah0;
        this.c = uri0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bfag)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bfag(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        bezw bezw0;
        bfbd bfbd0;
        Cursor cursor0;
        Object object1 = ibrx.a;
        int v = this.a;
        Boolean boolean0 = Boolean.valueOf(true);
        gqsm gqsm0 = null;
        ibnx.b(object0);
        if(v == 0) {
            bfah bfah0 = this.b;
            bfah0.g.l(boolean0);
            Uri uri0 = this.c;
            try {
                cursor0 = ((bfbb)bfah0.b).b.getContentResolver().query(uri0, new String[]{"_display_name", "flags"}, null, null, null);
                if(cursor0 == null) {
                    goto label_32;
                }
                else {
                    goto label_11;
                }
                goto label_33;
            }
            catch(SecurityException securityException0) {
                goto label_31;
            }
            try {
            label_11:
                Cursor cursor1 = cursor0.moveToFirst() ? cursor0 : null;
                if(cursor1 == null) {
                    bfbd0 = null;
                    goto label_28;
                }
                else {
                    int v1 = cursor1.getColumnIndex("_display_name");
                    if(v1 != -1) {
                        String s = cursor1.getString(v1);
                        int v2 = cursor1.getColumnIndex("flags");
                        boolean z = v2 != -1 && (cursor1.getInt(v2) & 4) != 0;
                        ibuq.c(s);
                        bfbd0 = new bfbd(s, z);
                        goto label_28;
                    }
                    goto label_21;
                }
                goto label_33;
            }
            catch(Throwable throwable0) {
                goto label_26;
            }
            try {
            label_21:
                ibsx.a(cursor0, null);
                goto label_32;
            }
            catch(SecurityException securityException0) {
                goto label_31;
            }
            try {
                bfbd0 = null;
                goto label_28;
            }
            catch(Throwable throwable0) {
                try {
                label_26:
                    ibsx.a(cursor0, throwable0);
                    throw throwable0;
                label_28:
                    ibsx.a(cursor0, null);
                    goto label_33;
                }
                catch(SecurityException securityException0) {
                }
            }
        label_31:
            a.ae(bfbb.a.i(), "Unable to query the import file name", securityException0);
        label_32:
            bfbd0 = null;
        label_33:
            if(bfbd0 == null) {
                bezw0 = bezp.a;
                bfah0.m.l(boolean0);
                goto label_71;
            }
            bfah0.e = uri0;
            bfah0.f = bfbd0.a;
            bfah0.s.l(Boolean.valueOf(bfbd0.b));
            this.a = 1;
            object0 = bfah0.a(uri0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if((((bfad)object0) instanceof bfab)) {
            bezw0 = ((bfab)(((bfad)object0))).a;
            this.b.m.l(boolean0);
        }
        else {
            if(!(((bfad)object0) instanceof bfac)) {
                throw new ibnq();
            }
            List list0 = ibpo.ak(((bfac)(((bfad)object0))).a.b, ((bfac)(((bfad)object0))).b.b);
            List list1 = ((bfac)(((bfad)object0))).b.a;
            int v3 = list1.size();
            int v4 = list0.size();
            if(v3 != 0) {
                if(v3 == 0) {
                    bezw0 = new bezo(list0);
                }
                else if(v4 == 0) {
                    bezw0 = new bezn(list1);
                }
                else {
                    bezw0 = new bezu(list1, list0);
                }
            }
            else if(v4 == 0) {
                bezw0 = bezt.a;
            }
            else {
                bezw0 = new bezo(list0);
            }
            if(list1.isEmpty()) {
                this.b.m.l(boolean0);
            }
            else {
                this.b.d = list1;
                this.b.k.l(boolean0);
            }
        }
    label_71:
        bfah bfah1 = this.b;
        if(!(bezw0 instanceof bezn) && !(bezw0 instanceof bezu)) {
            if(ibuq.m(bezw0, bezs.a)) {
                gqsm0 = gqsm.Nm;
            }
            else if(ibuq.m(bezw0, bezv.a)) {
                gqsm0 = gqsm.Nn;
            }
            else if(ibuq.m(bezw0, bezt.a)) {
                gqsm0 = gqsm.Nl;
            }
            else {
                if(!ibuq.m(bezw0, bezp.a) && !ibuq.m(bezw0, bezq.a) && !ibuq.m(bezw0, bezr.a) && !(bezw0 instanceof bezo)) {
                    throw new ibnq();
                }
                gqsm0 = gqsm.Ni;
            }
        }
        if(gqsm0 != null) {
            bfah1.c.c(gqsm0);
        }
        bfah1.i.l(bezw0);
        bfah1.g.l(Boolean.valueOf(false));
        return ibom.a;
    }
}

