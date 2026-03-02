import android.graphics.Bitmap;

public final class dvlr {
    private final fhwb a;
    private final String b;

    public dvlr(fhwb fhwb0, String s) {
        this.a = fhwb0;
        this.b = s;
    }

    public final void a(gjco gjco0, gjct gjct0, gjcr gjcr0, String s) {
        ibuq.f(gjco0, "actionType");
        ibuq.f(gjct0, "result");
        ibuq.f(gjcr0, "placement");
        ibuq.f(s, "valuableId");
        dvlr.c(this, gjco0, gjct0, gjcr0, s);
    }

    public final void b(Bitmap bitmap0, gjcw gjcw0, gjcy gjcy0, Integer integer0, String s, Integer integer1) {
        ibuq.f(gjcw0, "actionType");
        ibuq.f(gjcy0, "result");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjcz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjcz)hftv0).c = gjcy0.e;
        ((gjcz)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjcz)hftp0.b_message).d = gjcw0.e;
        ((gjcz)hftp0.b_message).b |= 2;
        int v = 0;
        int v1 = bitmap0 == null ? 0 : bitmap0.getHeight();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjcz gjcz0 = (gjcz)hftp0.b_message;
        gjcz0.b |= 16;
        gjcz0.g = v1;
        int v2 = bitmap0 == null ? 0 : bitmap0.getWidth();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjcz gjcz1 = (gjcz)hftp0.b_message;
        gjcz1.b |= 8;
        gjcz1.f = v2;
        if(integer0 != null) {
            v = (int)integer0;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gjcz)hftv1).b |= 4;
        ((gjcz)hftv1).e = v;
        if(s != null) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjcz gjcz2 = (gjcz)hftp0.b_message;
            gjcz2.b |= 0x20;
            gjcz2.h = s;
        }
        if(integer1 != null) {
            int v3 = (int)integer1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjcz gjcz3 = (gjcz)hftp0.b_message;
            gjcz3.b |= 0x40;
            gjcz3.i = v3;
        }
        fhwb fhwb0 = this.a;
        fhvz fhvz0 = fhwa.a(0x34CDE);
        gjcd gjcd0 = (gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder();
        if(!gjcd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjcd0).ensureMutable();
        }
        gjce gjce0 = (gjce)gjcd0.b_message;
        gjcz gjcz4 = (gjcz)hftp0.N_build();
        gjcz4.getClass();
        gjce0.i = gjcz4;
        gjce0.b |= 0x400;
        fhvz0.b(douc.a(((gjce)((ProtoLiteBuilder)gjcd0).N_build())));
        fhvz0.c(fhwp.b(this.b));
        fhwb0.a(fhvz0.a());
    }

    public static void c(dvlr dvlr0, gjco gjco0, gjct gjct0, gjcr gjcr0, String s) {
        dvlr0.d(gjco0, gjct0, gjcr0, s, 0);
    }

    public final void d(gjco gjco0, gjct gjct0, gjcr gjcr0, String s, int v) {
        ibuq.f(gjco0, "actionType");
        ibuq.f(gjct0, "result");
        ibuq.f(gjcr0, "placement");
        ibuq.f(s, "valuableId");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjcu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjcu)hftv0).c = gjct0.d;
        ((gjcu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gjcu)hftv1).d = gjco0.e;
        ((gjcu)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gjcu)hftv2).e = gjcr0.h;
        ((gjcu)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        s.getClass();
        ((gjcu)hftv3).b |= 8;
        ((gjcu)hftv3).f = s;
        if(v != 0) {
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjcu)hftp0.b_message).g = v - 1;
            ((gjcu)hftp0.b_message).b |= 16;
        }
        fhwb fhwb0 = this.a;
        fhvz fhvz0 = fhwa.a(0x35220);
        gjcd gjcd0 = (gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder();
        gjcu gjcu0 = (gjcu)hftp0.N_build();
        if(!gjcd0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gjcd0).ensureMutable();
        }
        gjce gjce0 = (gjce)gjcd0.b_message;
        gjcu0.getClass();
        gjce0.j = gjcu0;
        gjce0.b |= 0x1000;
        fhvz0.b(douc.a(((gjce)((ProtoLiteBuilder)gjcd0).N_build())));
        fhvz0.c(fhwp.b(this.b));
        fhwb0.a(fhvz0.a());
    }
}

