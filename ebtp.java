import com.google.android.gms.common.api.Status;

public final class ebtp implements ibts {
    public final ebts a;
    public final ficj b;

    public ebtp(ebts ebts0, ficj ficj0) {
        this.a = ebts0;
        this.b = ficj0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        byte[] arr_b = (byte[])object0;
        ficj ficj0 = this.b;
        ebts ebts0 = this.a;
        try {
            hftc hftc0 = hftc.a();
            dyfy dyfy0 = dyfy.a;
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyfy0), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((dyfy)hftv0), "parseFrom(...)");
            int v = dyif.a((((dyfy)hftv0).b == 8 ? ((dyig)((dyfy)hftv0).c) : dyig.a).b);
            if(v == 0) {
                throw null;
            }
            switch(v - 1) {
                case 0: {
                    ebts0.d(dymv.b);
                    ebwx.a(ebts0.c, 0L, true, false, 10);
                    byte[] arr_b1 = ebtr.a().toBytesArray();
                    ebts0.b.b(Status.b, arr_b1);
                    break;
                }
                case 1: {
                    ebts0.d(dymv.c);
                    donp donp1 = ebts0.b;
                    Status status1 = Status.b;
                    ibuq.f(ebts0.c, "context");
                    dyga dyga1 = dyfz.a(((ProtoLiteMessage)dyfy0).v_newBuilder());
                    dygs dygs1 = dygr.a(((ProtoLiteMessage)dygq.a).v_newBuilder());
                    dygu dygu1 = dygt.a(((ProtoLiteMessage)dygp.a).v_newBuilder());
                    ibuq.e("Complete your phone setup", "getString(...)");
                    dygu1.e("Complete your phone setup");
                    String s1 = ebts0.c.getString(0x7F152120, new Object[]{"Osaifu-Keitai Settings"});  // string:pay_se_error_chip_not_initialized_subtitle "To use e-money cards on your 
                                                                                                        // phone, complete the last step of your phone setup with %1$s"
                    ibuq.e(s1, "getString(...)");
                    dygu1.c(s1);
                    ibuq.e("Complete setup", "getString(...)");
                    dygu1.b("Complete setup");
                    ibuq.e("Cancel", "getString(...)");
                    dygu1.d("Cancel");
                    dygs1.b(dygu1.a());
                    hfsw hfsw0 = hfsx.a(((ProtoLiteMessage)hfsw.a).v_newBuilder()).a();
                    ibuq.f(hfsw0, "value");
                    ProtoLiteBuilder hftp1 = dygs1.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    dygq dygq1 = (dygq)hftp1.b_message;
                    hfsw0.getClass();
                    dygq1.d = hfsw0;
                    dygq1.c = 3;
                    dyga1.b(dygs1.a());
                    donp1.b(status1, dyga1.a().toBytesArray());
                    break;
                }
                default: {
                    switch(v - 1) {
                        case 2: {
                            ebts0.d(dymv.c);
                            donp donp0 = ebts0.b;
                            Status status0 = Status.b;
                            dyig dyig0 = ((dyfy)hftv0).b == 8 ? ((dyig)((dyfy)hftv0).c) : dyig.a;
                            ByteString hfsf0 = (dyig0.b == 3 ? ((dyie)dyig0.c) : dyie.a).b;
                            ibuq.e(hfsf0, "getIntent(...)");
                            ibuq.f(ebts0.c, "context");
                            ibuq.f(hfsf0, "intent");
                            dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy0).v_newBuilder());
                            dygs dygs0 = dygr.a(((ProtoLiteMessage)dygq.a).v_newBuilder());
                            dygu dygu0 = dygt.a(((ProtoLiteMessage)dygp.a).v_newBuilder());
                            ibuq.e("Complete your phone setup", "getString(...)");
                            dygu0.e("Complete your phone setup");
                            String s = ebts0.c.getString(0x7F152120, new Object[]{"Osaifu-Keitai"});  // string:pay_se_error_chip_not_initialized_subtitle "To use e-money cards on your 
                                                                                                      // phone, complete the last step of your phone setup with %1$s"
                            ibuq.e(s, "getString(...)");
                            dygu0.c(s);
                            ibuq.e("Complete setup", "getString(...)");
                            dygu0.b("Complete setup");
                            ibuq.e("Cancel", "getString(...)");
                            dygu0.d("Cancel");
                            dygs0.b(dygu0.a());
                            ibuq.f(hfsf0, "value");
                            ProtoLiteBuilder hftp0 = dygs0.a;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            dygq dygq0 = (dygq)hftp0.b_message;
                            hfsf0.getClass();
                            dygq0.c = 4;
                            dygq0.d = hfsf0;
                            dyga0.b(dygs0.a());
                            donp0.b(status0, dyga0.a().toBytesArray());
                            break;
                        }
                        case 3: {
                            ebts0.d(dymv.c);
                            ((ggtj)ebts.a.i()).x("Status not set in MfiSignInAndInitializeChipResponse");
                            ebts0.b.x(eccq.b);
                            break;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                }
            }
            ficj0.c(1);
            ficj0.close();
        }
        catch(hfur hfur0) {
            ebts0.c(hfur0, ficj0);
        }
        return ibom.a;
    }
}

