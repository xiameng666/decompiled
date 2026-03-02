import java.util.List;

public final class bput implements glzn {
    public final bpvj a;
    public final fqzp b;
    public final String c;

    public bput(bpvj bpvj0, fqzp fqzp0, String s) {
        this.a = bpvj0;
        this.b = fqzp0;
        this.c = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fqxp.a).v_newBuilder();
        ggeo ggeo0 = ghlm.l(this.b.b, ((List)object0)).i(new bpva()).c(new bpvb()).c(new bpvc(this.b)).i(new bpva()).c(new bpvd()).f();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqxp fqxp0 = (fqxp)hftp0.b_message;
        hfvh hfvh0 = fqxp0.b;
        if(!hfvh0.b) {
            fqxp0.b = hfvh0.a();
        }
        fqxp0.b.putAll(ggeo0);
        fqxp fqxp1 = (fqxp)hftp0.N_build();
        if(fqxp1.b.size() == 0) {
            ((ggtj)bpvj.a.h()).x("No owner keys to send.");
            return gmbx.a;
        }
        ((ggtj)bpvj.a.h()).z("Sending %d owner keys.", fqxp1.b.size());
        byte[] arr_b = fqxp1.toBytesArray();
        return gdta.g(fhra.b(((bptx)this.a.c).c.h(this.c, "/findmydevice/spot-owner-keys-response", arr_b))).h(new bptt(), gmap.a);
    }
}

