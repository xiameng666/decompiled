import java.util.LinkedHashSet;

public final class cywm implements kar {
    public final cywo a;

    public cywm(cywo cywo0) {
        this.a = cywo0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        Object object1;
        cycj cycj0 = (cycj)object0;
        LinkedHashSet linkedHashSet0 = this.a.a;
        try {
            cycj0.d.k(linkedHashSet0);
            object1 = ibom.a;
        }
        catch(Throwable throwable0) {
            object1 = ibnx.a(throwable0);
        }
        Throwable throwable1 = ibnw.a(object1);
        if(throwable1 == null) {
            return;
        }
        ((ggtj)cyjh.a.g().s(throwable1)).R("%s: removeDevicesFromCurrentBroadcast for %s meet exception!", "LeAudioSharingManager", ibpo.aK(linkedHashSet0, null, null, null, new cybm(), 0x1F));
    }
}

