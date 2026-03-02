import android.content.Context;
import android.os.Parcel;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;

public final class eirl extends eiqt {
    public static final int a;
    private static final gful_cronetEngineProvider b;
    private final eiqg c;
    private final String d;
    private final eiro e;

    static {
        eirl.b = gfus.a(((gful_cronetEngineProvider)new eirk()));
    }

    public eirl(eiqg eiqg0, String s, String s1, String s2, String s3) {
        super("GetConfigurationSnapshotOperationCall", hlse.g);
        batl.s(eiqg0);
        this.c = eiqg0;
        this.d = s;
        this.e = new eiro(s, s1, s2, s3);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        String s = this.e.a;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 1;
            hlrh0.c = s;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        Configurations configurations0 = this.e.c(context0, eiox0);
        boolean z = false;
        try {
            this.c.f(Status.b, configurations0);
            goto label_13;
        }
        catch(TransactionTooLargeException unused_ex) {
            try {
                ((ggtj)((bboh)eirl.b.mr()).i()).B("Configuration snapshot too large %s", new gpnd(gpnc.b, this.d));
                throw new eioz(0x7349, "Configuration snapshot too large. See go/ph-configuration-snapshot-too-large. Config package: " + this.d);
            }
            catch(Throwable throwable1) {
                throwable0 = throwable1;
                z = true;
            }
        }
        catch(Throwable throwable0) {
        }
        this.m(configurations0, z);
        throw throwable0;
    label_13:
        this.m(configurations0, false);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.f(status0, null);
    }

    private final void m(Configurations configurations0, boolean z) {
        if(!ccze.b(chlr.v())) {
            return;
        }
        Parcel parcel0 = Parcel.obtain();
        eily.a(configurations0, parcel0, 0);
        int v1 = parcel0.dataSize();
        parcel0.recycle();
        Configuration[] arr_configuration = configurations0.d;
        int v2 = 0;
        int v3 = 0;
        for(int v = 0; v < arr_configuration.length; ++v) {
            Configuration configuration0 = arr_configuration[v];
            v3 += configuration0.b.length;
            v2 += configuration0.c.length;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlrn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hlrn)hftv0).b |= 1;
        ((hlrn)hftv0).c = v1;
        String s = this.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s.getClass();
        ((hlrn)hftv1).b |= 8;
        ((hlrn)hftv1).f = s;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hlrn)hftv2).b |= 2;
        ((hlrn)hftv2).d = v3;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hlrn)hftv3).b |= 4;
        ((hlrn)hftv3).e = v2;
        if(z) {
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlrn hlrn0 = (hlrn)hftp0.b_message;
            hlrn0.b |= 16;
            hlrn0.g = true;
        }
        chlr chlr0 = chlr.v();
        hlsc hlsc0 = (hlsc)((ProtoLiteMessage)hlsf.a).v_newBuilder();
        if(!hlsc0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlsc0).ensureMutable();
        }
        hlsf hlsf0 = (hlsf)hlsc0.b_message;
        hlrn hlrn1 = (hlrn)hftp0.N_build();
        hlrn1.getClass();
        hlsf0.k = hlrn1;
        hlsf0.b |= 0x100;
        cczb cczb0 = chlr0.c(((ProtoLiteMessage)(((hlsf)((ProtoLiteBuilder)hlsc0).N_build()))));
        cczb0.c = (int)hlse.Y.Z;
        cczb0.a();
    }
}

