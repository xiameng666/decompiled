import com.google.android.gms.pay.pass.idcard.view.components.PresentationBottomSheet;

final class dukb implements ibtw {
    final PresentationBottomSheet a;

    public dukb(PresentationBottomSheet presentationBottomSheet0) {
        this.a = presentationBottomSheet0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        fyx fyx1;
        cvq cvq1;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        PresentationBottomSheet presentationBottomSheet0 = this.a;
        Object object2 = ((goz)object0).k();
        Object object3 = gop.a;
        if(object2 == object3) {
            object2 = gqe.a(ibru.a, ((goz)object0));
            ((goz)object0).R(object2);
        }
        presentationBottomSheet0.a = (icck)object2;
        presentationBottomSheet0.b = cvf.d(0, ((goz)object0), 0, 1);
        presentationBottomSheet0.c = fsr.e(true, ((goz)object0), 6, 2);
        ((goz)object0).M(0x6E3C21FE);
        Object object4 = ((goz)object0).k();
        if(object4 == object3) {
            gpx gpx0 = new gpx(new dujz(presentationBottomSheet0), null);
            ((goz)object0).R(gpx0);
            object4 = gpx0;
        }
        ((goz)object0).A();
        presentationBottomSheet0.d = (gui)object4;
        gui gui0 = presentationBottomSheet0.d;
        if(gui0 == null) {
            ibuq.j("showBottomSheet");
            gui0 = null;
        }
        if(((Boolean)gui0.a()).booleanValue()) {
            dukt dukt0 = presentationBottomSheet0.a();
            ((goz)object0).M(5004770);
            boolean z = ((goz)object0).Z(presentationBottomSheet0);
            Object object5 = ((goz)object0).k();
            if(z || object5 == object3) {
                object5 = new duka(presentationBottomSheet0);
                ((goz)object0).R(object5);
            }
            ((goz)object0).A();
            cvq cvq0 = presentationBottomSheet0.b;
            if(cvq0 == null) {
                ibuq.j("scrollState");
                cvq1 = null;
            }
            else {
                cvq1 = cvq0;
            }
            fyx fyx0 = presentationBottomSheet0.c;
            if(fyx0 == null) {
                ibuq.j("sheetState");
                fyx1 = null;
            }
            else {
                fyx1 = fyx0;
            }
            dukr.e(null, dukt0, ((ibts)(((ibwx)object5))), cvq1, fyx1, ((goz)object0), 0);
            presentationBottomSheet0.d();
            return ibom.a;
        }
        presentationBottomSheet0.b();
        return ibom.a;
    }
}

