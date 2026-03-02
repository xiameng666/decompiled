import android.accounts.Account;

final class desz implements ibtx {
    final devp a;
    final ibth b;

    public desz(devp devp0, ibth ibth0) {
        this.a = devp0;
        this.b = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$DesktopScaffold");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        dfeo dfeo0 = this.a.a.b;
        Account account0 = (Account)devq.a(dfeo0);
        String s = (String)devq.a(this.a.a.a);
        if(s == null) {
            s = "";
        }
        Account account1 = (Account)devq.a(dfeo0);
        String s1 = account1 == null ? null : account1.name;
        demm.a(account0, s, dls.x(cqx.c(cru.d(hfc.e, false, null, null, null, this.b, 15), fpu.a(((goz)object1)).D), 68.0f, 0.0f, 2), s1, null, false, ((goz)object1), 0, 0x30);
        return ibom.a;
    }
}

