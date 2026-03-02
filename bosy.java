import j..time.Duration;
import j..time.Instant;
import java.util.Random;

public final class bosy implements glzn {
    public final boul a;

    public bosy(boul boul0) {
        this.a = boul0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        boul boul0 = this.a;
        long v = boul0.f.d().toEpochMilli();
        int v1 = ((fqzl)object0).b;
        if((v1 & 0x100) != 0 && (v1 & 0x200) != 0) {
            hfwn hfwn0 = ((fqzl)object0).q;
            if(hfwn0 == null) {
                hfwn0 = hfwn.a;
            }
            if(Duration.between(hfyg.d(hfwn0), Instant.ofEpochMilli(v)).compareTo(Duration.ofHours(Math.max(boul.c.toHours(), hsxv.a.y().ah()))) < 0) {
                fqzf fqzf0 = ((fqzl)object0).p;
                if(fqzf0 == null) {
                    fqzf0 = fqzf.a;
                }
                return gmbu.i(fqzf0);
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fqzf.a).v_newBuilder();
        Random random0 = boul0.g;
        long v2 = random0.nextLong();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqzf fqzf1 = (fqzf)hftp0.b_message;
        fqzf1.b |= 1;
        fqzf1.c = v2;
        long v3 = random0.nextLong();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqzf fqzf2 = (fqzf)hftp0.b_message;
        fqzf2.b |= 2;
        fqzf2.d = v3;
        fqzf fqzf3 = (fqzf)hftp0.N_build();
        bosw bosw0 = new bosw(boul0, hfyn.h(v), fqzf3);
        return gdta.g(boul0.j.b(bosw0, gmap.a)).h(new bosx(fqzf3), gmap.a);
    }
}

