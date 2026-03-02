import java.util.Iterator;

public final class eikk implements ibts {
    public final eikt a;
    public final eiki[] b;

    public eikk(eikt eikt0, eiki[] arr_eiki) {
        this.a = eikt0;
        this.b = arr_eiki;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        oxi oxi0 = (oxi)object0;
        ibuq.f(oxi0, "connection");
        owg owg0 = oxi0.a("UPDATE OR ABORT `DeviceData` SET `macAddress` = ?,`deviceType` = ?,`optionalDeviceData` = ?,`creationTimestampMillis` = ?,`lastUpdatedTimestampMillis` = ?,`alertLifecycleId` = ?,`alertStatus` = ? WHERE `macAddress` = ?");
        okn okn0 = this.a.c;
        try {
            Iterator iterator0 = ibug.a(this.b);
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(object1 != null) {
                    okn0.b(owg0, object1);
                    owg0.k();
                    owg0.i();
                    oqm.a(oxi0);
                }
            }
        }
        catch(Throwable throwable0) {
            ibte.a(owg0, throwable0);
            throw throwable0;
        }
        ibte.a(owg0, null);
        return null;
    }
}

