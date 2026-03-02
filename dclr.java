import com.google.android.gms.nearby.sharing.SettingsReviewChimeraActivity;

public final class dclr implements evqf {
    public final SettingsReviewChimeraActivity a;
    public final boolean b;
    public final long c;
    public final String d;
    public final String e;

    public dclr(SettingsReviewChimeraActivity settingsReviewChimeraActivity0, boolean z, long v, String s, String s1) {
        this.a = settingsReviewChimeraActivity0;
        this.b = z;
        this.c = v;
        this.d = s;
        this.e = s1;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        gzat gzat0 = gzat.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gyqv)hftv0).c = gzat0.j;
        ((gyqv)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp0.b_message;
        gyqv0.b |= 2;
        gyqv0.d = false;
        boolean z = ((Boolean)object0).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gyqv)hftv1).b |= 4;
        ((gyqv)hftv1).e = z;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        String s = this.e;
        SettingsReviewChimeraActivity settingsReviewChimeraActivity0 = this.a;
        gyqv gyqv1 = (gyqv)hftp0.b_message;
        gyqv1.b |= 8;
        gyqv1.f = this.b;
        gyqv gyqv2 = (gyqv)hftp0.N_build();
        boolean z1 = settingsReviewChimeraActivity0.isFinishing();
        ProtoLiteBuilder hftp1 = dcpt.L(0x20);
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyrd.a).v_newBuilder();
        gyza gyza0 = dcpt.x("com.google.android.gms.nearby.sharing.SettingsReviewActivity");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gyrd)hftv2).c = gyza0.n;
        ((gyrd)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gyrd)hftv3).b |= 2;
        ((gyrd)hftv3).d = this.c;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        String s1 = this.d;
        ProtoLiteMessage hftv4 = hftp2.b_message;
        ((gyrd)hftv4).b |= 16;
        ((gyrd)hftv4).f = false;
        if(s1 != null) {
            if(!hftv4.isImmutable()) {
                hftp2.ensureMutable();
            }
            gyrd gyrd0 = (gyrd)hftp2.b_message;
            gyrd0.b |= 4;
            gyrd0.e = s1;
        }
        gyza gyza1 = dcpt.x(bbqr.c(s));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp2.b_message;
        ((gyrd)hftv5).g = gyza1.n;
        ((gyrd)hftv5).b |= 0x20;
        if(!hftv5.isImmutable()) {
            hftp2.ensureMutable();
        }
        gyrd gyrd1 = (gyrd)hftp2.b_message;
        gyrd1.b |= 0x40;
        gyrd1.h = z1;
        gyrd gyrd2 = (gyrd)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp1.b_message;
        gyrd2.getClass();
        gysp0.x = gyrd2;
        gysp0.b |= 0x800000;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp1.b_message;
        gyqv2.getClass();
        gysp1.Y = gyqv2;
        gysp1.c |= 0x800000;
        settingsReviewChimeraActivity0.p(new dcov(((gysp)hftp1.N_build())));
    }
}

