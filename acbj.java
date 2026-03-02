import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import java.util.Locale;

public final class acbj {
    public static final bboh a;
    public final acbf b;
    private final Context c;

    static {
        acbj.a = bboh.b("AppInviteAgent", bbcu.aK);
    }

    public acbj(Context context0, acbf acbf0) {
        this.c = context0;
        this.b = acbf0;
    }

    public final hijg a(String s) {
        byte[] arr_b;
        try {
            arr_b = bbmq.ac(this.c, s);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            a.ae(acbj.a.i(), "Caller Package Name not found", packageManager$NameNotFoundException0);
            return null;
        }
        if(arr_b == null) {
            return null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hijg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hijg hijg0 = (hijg)hftp0.b_message;
        s.getClass();
        hijg0.b |= 4;
        hijg0.e = s;
        String s1 = Base64.encodeToString(arr_b, 2);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((hijg)hftv0).b |= 8;
        ((hijg)hftv0).f = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hijg)hftp0.b_message).c = 1;
        ((hijg)hftp0.b_message).b |= 1;
        String s2 = Locale.getDefault().getLanguage();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hijg hijg1 = (hijg)hftp0.b_message;
        s2.getClass();
        hijg1.b |= 0x20;
        hijg1.g = s2;
        return (hijg)hftp0.N_build();
    }

    public final hikv b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hije.a).v_newBuilder();
        int v = azqk.a(this.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hije hije0 = (hije)hftp0.b_message;
        hije0.b |= 1;
        hije0.c = v;
        hije hije1 = (hije)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hikv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hikv hikv0 = (hikv)hftp1.b_message;
        hije1.getClass();
        hikv0.c = hije1;
        hikv0.b |= 1;
        return (hikv)hftp1.N_build();
    }

    public final hijc c(baqr baqr0, String s) {
        int v1;
        if(hour.h()) {
            bboh bboh0 = acbj.a;
            ((ggtj)bboh0.h()).x("Resolving using New Rest API");
            gpco gpco0 = acbh.b(s, baqr0.e, this.c);
            if(gpco0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hijc.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hijc hijc0 = (hijc)hftp0.b_message;
                s.getClass();
                hijc0.b |= 8;
                hijc0.f = s;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hikm.a).v_newBuilder();
                String s1 = gpco0.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s1.getClass();
                ((hikm)hftv0).b |= 2;
                ((hikm)hftv0).d = s1;
                String s2 = gpco0.f;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hikm hikm0 = (hikm)hftp1.b_message;
                s2.getClass();
                hikm0.b |= 1;
                hikm0.c = s2;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hijd.a).v_newBuilder();
                if(!gpco0.d.isEmpty()) {
                    String s3 = gpco0.d;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp2.b_message;
                    s3.getClass();
                    ((hijd)hftv1).b |= 1;
                    ((hijd)hftv1).c = s3;
                    int v = gpco0.e;
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hijd hijd0 = (hijd)hftp2.b_message;
                    hijd0.b |= 2;
                    hijd0.d = v;
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hikm hikm1 = (hikm)hftp1.b_message;
                hijd hijd1 = (hijd)hftp2.N_build();
                hijd1.getClass();
                hikm1.f = hijd1;
                hikm1.b |= 8;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hijc hijc1 = (hijc)hftp0.b_message;
                hikm hikm2 = (hikm)hftp1.N_build();
                hikm2.getClass();
                hijc1.c = hikm2;
                hijc1.b |= 1;
                if((gpco0.b & 1) != 0) {
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hila.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hila hila0 = (hila)hftp3.b_message;
                    s.getClass();
                    hila0.b |= 2;
                    hila0.d = s;
                    gpcr gpcr0 = gpco0.i == null ? gpcr.a : gpco0.i;
                    switch((gpcq.b(gpcr0.g) == 0 ? 1 : gpcq.b(gpcr0.g)) - 2) {
                        case 1: {
                            v1 = 2;
                            break;
                        }
                        case 2: {
                            v1 = 3;
                            break;
                        }
                        default: {
                            v1 = 1;
                        }
                    }
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp3.b_message;
                    ((hila)hftv2).c = v1 - 1;
                    ((hila)hftv2).b |= 1;
                    String s4 = (gpco0.i == null ? gpcr.a : gpco0.i).h;
                    if(!hftv2.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hila hila1 = (hila)hftp3.b_message;
                    s4.getClass();
                    hila1.b |= 4;
                    hila1.e = s4;
                    hila hila2 = (hila)hftp3.N_build();
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hijq.a).v_newBuilder();
                    String s5 = gpco0.h;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp4.b_message;
                    s5.getClass();
                    ((hijq)hftv3).b |= 0x80;
                    ((hijq)hftv3).j = s5;
                    if(!hftv3.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp4.b_message;
                    hila2.getClass();
                    ((hijq)hftv4).h = hila2;
                    ((hijq)hftv4).b |= 0x20;
                    String s6 = (gpco0.i == null ? gpcr.a : gpco0.i).b;
                    if(!hftv4.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp4.b_message;
                    s6.getClass();
                    ((hijq)hftv5).b |= 1;
                    ((hijq)hftv5).c = s6;
                    String s7 = (gpco0.i == null ? gpcr.a : gpco0.i).c;
                    if(!hftv5.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp4.b_message;
                    s7.getClass();
                    ((hijq)hftv6).b |= 2;
                    ((hijq)hftv6).d = s7;
                    String s8 = (gpco0.i == null ? gpcr.a : gpco0.i).d;
                    if(!hftv6.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv7 = hftp4.b_message;
                    s8.getClass();
                    ((hijq)hftv7).b |= 4;
                    ((hijq)hftv7).e = s8;
                    String s9 = (gpco0.i == null ? gpcr.a : gpco0.i).e;
                    if(!hftv7.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv8 = hftp4.b_message;
                    s9.getClass();
                    ((hijq)hftv8).b |= 0x200;
                    ((hijq)hftv8).l = s9;
                    String s10 = (gpco0.i == null ? gpcr.a : gpco0.i).f;
                    if(!hftv8.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hijq hijq0 = (hijq)hftp4.b_message;
                    s10.getClass();
                    hijq0.b |= 0x100;
                    hijq0.k = s10;
                    hijq hijq1 = (hijq)hftp4.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hijc hijc2 = (hijc)hftp0.b_message;
                    hijq1.getClass();
                    hijc2.e = hijq1;
                    hijc2.b |= 4;
                }
                ((ggtj)bboh0.h()).x("Successfully Resolved using Rest API.");
                return (hijc)hftp0.N_build();
            }
            ((ggtj)bboh0.i()).x("Failed to Resolve using Rest API");
            return null;
        }
        bboh bboh1 = acbj.a;
        ((ggtj)bboh1.h()).x("Resolving using deprecated data mixer api");
        String s11 = baqr0.d;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hijb.a).v_newBuilder();
        hijg hijg0 = this.a(s11);
        if(hijg0 == null) {
            ((ggtj)bboh1.i()).x("Error creating ClientIdInfo");
            return null;
        }
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ((hijb)hftp5.b_message).c = hijg0;
        ((hijb)hftp5.b_message).b |= 1;
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hikg.a).v_newBuilder();
        String s12 = gfta.b(s);
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        ProtoLiteMessage hftv9 = hftp6.b_message;
        ((hikg)hftv9).b |= 2;
        ((hikg)hftv9).d = s12;
        if(!hftv9.isImmutable()) {
            hftp6.ensureMutable();
        }
        hikg hikg0 = (hikg)hftp6.b_message;
        hikg0.b |= 1;
        hikg0.c = "";
        hikg hikg1 = (hikg)hftp6.N_build();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        hijb hijb0 = (hijb)hftp5.b_message;
        hikg1.getClass();
        hijb0.d = hikg1;
        hijb0.b |= 4;
        hikv hikv0 = this.b();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        hijb hijb1 = (hijb)hftp5.b_message;
        hikv0.getClass();
        hijb1.e = hikv0;
        hijb1.b |= 8;
        hijb hijb2 = (hijb)hftp5.N_build();
        acbi acbi0 = new acbi(this.b, baqr0, hijb.f, ((MessageLite)hijb2));
        try {
            try {
                acbi0.d();
                goto label_193;
            }
            catch(acbd acbd0) {
            }
            acbd0.a();
        }
        catch(Throwable throwable0) {
            goto label_191;
        }
        hijc hijc3 = (hijc)acbi0.b(hijc.h);
        return null;
    label_191:
        hijc hijc4 = (hijc)acbi0.b(hijc.h);
        throw throwable0;
    label_193:
        hijc hijc5 = (hijc)acbi0.b(hijc.h);
        if(acbi0.e()) {
            ((ggtj)bboh1.i()).z("Accept invitation failed due to error code: %d", acbi0.a());
            return null;
        }
        return hijc5;
    }
}

