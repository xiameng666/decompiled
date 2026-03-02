import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.owners.ParcelableDeviceOwner;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class eqnu implements gmbg {
    final eqnw a;

    public eqnu(eqnw eqnw0) {
        Objects.requireNonNull(eqnw0);
        this.a = eqnw0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        eqnv eqnv0 = this.a.c;
        if(eqnv0 != null) {
            eqqo.ah.g("Failed to load Google owners", throwable0, new Object[0]);
            ProtoLiteBuilder hftp0 = ((eqqo)eqnv0).ai;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjoh gjoh0 = (gjoh)hftp0.b_message;
            gjoh0.b |= 2;
            gjoh0.d = false;
            ArrayList arrayList0 = new ArrayList(((eqqo)eqnv0).c.size());
            ArrayList arrayList1 = ((eqqo)eqnv0).c;
            int v1 = arrayList1.size();
            for(int v = 0; v < v1; ++v) {
                BootstrapAccount bootstrapAccount0 = (BootstrapAccount)arrayList1.get(v);
                fntl fntl0 = fntm.a();
                fntl0.b(bootstrapAccount0.b);
                arrayList0.add(new ParcelableDeviceOwner(fntl0.a(), null));
            }
            ((eqqo)eqnv0).I(arrayList0);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        eqnv eqnv0 = this.a.c;
        if(eqnv0 != null) {
            ArrayList arrayList0 = ggia.b(((List)object0));
            ProtoLiteBuilder hftp0 = ((eqqo)eqnv0).ai;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjoh gjoh0 = (gjoh)hftp0.b_message;
            gjoh0.b |= 2;
            gjoh0.d = true;
            ArrayList arrayList1 = ggia.b(ggch.j(arrayList0).i(new eqqn(((eqqo)eqnv0))).n());
            eqqo.ah.h("People loaded successfully. Device has %d owners and %d accounts", new Object[]{arrayList0.size(), ((eqqo)eqnv0).c.size()});
            ((eqqo)eqnv0).I(arrayList1);
        }
    }
}

