import android.content.Context;
import com.google.android.gms.phenotype.Flag;
import j..util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

public final class eiui implements Closeable {
    public final List a;
    final fpkv b;
    private static final bboh c;
    private final Context d;
    private final long e;
    private final Map f;
    private final Set g;
    private final fple h;

    static {
        eiui.c = bboh.b("PhSharedDirectoryWriter", bbcu.al);
    }

    public eiui(Context context0, long v) {
        this.f = new HashMap();
        this.g = new HashSet();
        this.a = new ArrayList();
        this.h = new fple();
        this.b = new fpkv();
        this.d = context0;
        this.e = v;
    }

    public static void a(Context context0, String s, eiog eiog0) {
        ByteString hfsf1;
        ByteString hfsf0;
        try {
            eiok eiok0 = eiog0.b((eiog0.f() ? "SELECT secret, device_encrypted_secret FROM android_packages WHERE name = ?1;" : "SELECT secret, deviceEncryptedSecret FROM StorageInfos WHERE androidPackageName = ?1;")).h(new Object[]{s}).i();
            if(eiok0 != null) {
                try {
                    hfsf0 = ByteString.copyFrom(eiok0.k(0));
                    hfsf1 = ByteString.copyFrom(eiok0.k(1));
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(eiok0, throwable0);
                    throw throwable0;
                }
                eiok0.close();
                goto label_13;
            }
        }
        catch(RuntimeException runtimeException0) {
            a.e(eiui.c.i(), "Failed to get shared dir secrets for Android package: %s.", s, runtimeException0);
        }
        return;
        try {
        label_13:
            gftb.r(wzm.e(new File(context0.getDir("phenotype_shared", 0), new fplb(hfsf0, "", "").b().toString())), "Failed to delete directory");
        }
        catch(RuntimeException runtimeException1) {
            a.e(eiui.c.i(), "Failed to delete the CE shared dir for Android package: %s.", s, runtimeException1);
        }
        try {
            gftb.r(wzm.e(new File(fhcd.a(context0).getDir("phenotype_shared", 0), new fplb(hfsf1, "", "").b().toString())), "Failed to delete directory");
        }
        catch(RuntimeException runtimeException2) {
            a.e(eiui.c.i(), "Failed to delete the DE shared dir for Android package: %s.", s, runtimeException2);
        }
    }

    public final void b(goab goab0, String s, String s1, eiog eiog0) {
        gfsz gfsz3;
        String s8;
        ByteString hfsf4;
        ggeo ggeo0;
        fpkx fpkx2;
        Throwable throwable4;
        String s7;
        Flag[] arr_flag;
        fpkx fpkx1;
        fpky fpky0;
        eioa eioa0;
        gfsz gfsz2;
        gfsz gfsz1;
        ByteString hfsf3;
        String s5;
        fpkx fpkx0;
        eioe eioe0;
        eiok eiok0;
        String s2 = (goab0.c == null ? goau.a : goab0.c).c;
        boolean z = hxkp.c().b.contains(eipn.d(s2));
        gfsz gfsz0 = new gfsz(s, Boolean.valueOf(z));
        Map map0 = this.f;
        ByteString hfsf0 = (ByteString)map0.get(gfsz0);
        if(hfsf0 == null) {
            eiod eiod0 = z ? eiog0.b((eiog0.f() ? "SELECT device_encrypted_secret FROM android_packages WHERE name = ?" : "SELECT deviceEncryptedSecret FROM StorageInfos WHERE androidPackageName = ?")) : eiog0.b((eiog0.f() ? "SELECT secret FROM android_packages WHERE name = ?" : "SELECT secret FROM StorageInfos WHERE androidPackageName = ?"));
            try {
                eiok0 = eiod0.h(new Object[]{s}).i();
            }
            catch(RuntimeException runtimeException0) {
                goto label_19;
            }
            if(eiok0 != null) {
                try {
                    hfsf0 = ByteString.copyFrom(eiok0.k(0));
                    map0.put(gfsz0, hfsf0);
                }
                catch(Throwable throwable0) {
                    try {
                        TWR.safeClose$NT(eiok0, throwable0);
                        throw throwable0;
                    label_15:
                        if(eiok0 != null) {
                            eiok0.close();
                        }
                        goto label_20;
                    }
                    catch(RuntimeException runtimeException0) {
                        goto label_19;
                    }
                }
            }
            goto label_15;
        label_19:
            ((ggtj)((ggtj)eiui.c.i()).s(runtimeException0)).R("Failed to get shared dir secret for android package: %s, P/H config package: %s", s, (goab0.c == null ? goau.a : goab0.c).c);
        }
    label_20:
        ByteString hfsf1 = hfsf0;
        if(hfsf1 != null) {
            String s3 = eitf.d(s2, s1, eiog0, false);
            eite eite0 = eitf.a(s3, eiog0);
            if(s3 != null && eite0 != null) {
                try {
                    if(eiog0.f()) {
                        eioe0 = eiog0.b("SELECT flags_content\nFROM param_partitions\nINNER JOIN experiment_states_to_partitions\n  USING (param_partition_id)\nWHERE experiment_states_to_partitions.experiment_state_id = ?1\n").h(new Object[]{((long)eite0.i)}).f();
                        goto label_27;
                    }
                    goto label_105;
                }
                catch(IOException iOException0) {
                    goto label_128;
                }
                try {
                label_27:
                    ArrayList arrayList0 = new ArrayList();
                    while(eioe0.b()) {
                        byte[] arr_b = eioe0.k(0);
                        eiug eiug0 = new eiug();
                        arrayList0.add(((fpkx)this.b.a(arr_b, eiug0)));
                    }
                    fpkx0 = fpkx.c(arrayList0);
                    goto label_38;
                }
                catch(Throwable throwable1) {
                    try {
                        TWR.safeClose$NT(eioe0, throwable1);
                        throw throwable1;
                    label_38:
                        eioe0.close();
                        if(eiog0.b("SELECT EXISTS (\n  SELECT NULL\n  FROM flag_overrides\n  LEFT OUTER JOIN config_packages\n    USING (config_package_id)\n  INNER JOIN accounts\n    USING (account_id)\n  WHERE\n    (config_packages.name = ?1 OR flag_overrides.config_package_name IS ?1)\n    AND (accounts.name = ?2 OR accounts.name = \'*\')\n    AND active IS 1\n);\n").h(new Object[]{s2, s1}).e(new String[]{"flag_overrides"}).g()) {
                            Map map1 = eiro.g(eiog0, s2, eite0.i);
                            if(hxku.a.b().a()) {
                                ggek ggek0 = new ggek();
                                for(Object object0: map1.entrySet()) {
                                    String s4 = (String)((Map.Entry)object0).getKey();
                                    Flag flag0 = (Flag)((Map.Entry)object0).getValue();
                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fpjo.a).v_newBuilder();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    fpjo fpjo0 = (fpjo)hftp0.b_message;
                                    s4.getClass();
                                    fpjo0.b |= 1;
                                    fpjo0.e = s4;
                                    int v = flag0.h;
                                    if(v == 2) {
                                        boolean z1 = flag0.f();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((fpjo)hftp0.b_message).c = 2;
                                        ((fpjo)hftp0.b_message).d = Boolean.valueOf(z1);
                                    }
                                    else {
                                        switch(v) {
                                            case 1: {
                                                goto label_69;
                                            }
                                            case 3: {
                                                goto label_75;
                                            }
                                            case 4: {
                                                goto label_81;
                                            }
                                        }
                                        s5 = s4;
                                        if(v != 5) {
                                            throw new IllegalStateException("Could not serialize Flag for override: " + flag0);
                                        }
                                        ByteString hfsf2 = ByteString.copyFrom(flag0.g());
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((fpjo)hftp0.b_message).c = 5;
                                        ((fpjo)hftp0.b_message).d = hfsf2;
                                        goto label_94;
                                    label_69:
                                        long v1 = flag0.b();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((fpjo)hftp0.b_message).c = 1;
                                        ((fpjo)hftp0.b_message).d = v1;
                                        goto label_93;
                                    label_75:
                                        double f = flag0.a();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((fpjo)hftp0.b_message).c = 3;
                                        ((fpjo)hftp0.b_message).d = f;
                                        goto label_93;
                                    label_81:
                                        s5 = s4;
                                        String s6 = flag0.d();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((fpjo)hftp0.b_message).c = 4;
                                        ((fpjo)hftp0.b_message).d = s6;
                                        goto label_94;
                                    }
                                label_93:
                                    s5 = s4;
                                label_94:
                                    ggek0.i(s5, ((fpjo)hftp0.N_build()));
                                    hfsf1 = hfsf1;
                                }
                                hfsf3 = hfsf1;
                                gfsz1 = new gfsz(fpkx0, ggek0.g());
                            }
                            else {
                                gfsz1 = new gfsz(fpkx.b(fpkx0, eiui.e(map1.values())), null);
                            label_101:
                                hfsf3 = hfsf1;
                            }
                        }
                        else {
                            gfsz1 = new gfsz(fpkx0, null);
                            goto label_101;
                        }
                        gftb.check(((fpkx)gfsz1.a));
                        gfsz2 = new gfsz(((fpkx)gfsz1.a), ((ggeo)gfsz1.b));
                        goto label_122;
                    label_105:
                        hfsf3 = hfsf1;
                        eioa0 = eiog0.b("SELECT\n  name,\n  CASE\n    WHEN boolVal NOT NULL THEN boolVal\n    WHEN intVal NOT NULL THEN 2\n    WHEN floatVal NOT NULL THEN 3\n    WHEN stringVal NOT NULL THEN 4\n    ELSE 5\n  END,\n  COALESCE(intVal, floatVal, stringVal, extensionVal)\nFROM Flags\nWHERE packageName = ?1 AND user = ?2 AND version = ?3 AND committed = 0\nORDER BY name;\n").h(new Object[]{s2, s1, ((int)eite0.c)}).e(new String[]{"Flags"}).c();
                    }
                    catch(IOException iOException0) {
                        goto label_128;
                    }
                }
                try {
                    fpky0 = new fpky(0);
                    while(true) {
                    label_108:
                        if(!eioa0.b()) {
                            fpkx1 = fpky0.a();
                            if(eiog0.b("SELECT EXISTS(SELECT NULL FROM FlagOverrides)").e(new String[]{"FlagOverrides"}).g()) {
                                arr_flag = eirj.c(eiog0, s2);
                                if(arr_flag == null) {
                                    break;
                                }
                                goto label_114;
                            }
                            goto label_120;
                        }
                        goto label_164;
                    }
                }
                catch(Throwable throwable2) {
                    goto label_117;
                }
                try {
                    arr_flag = new Flag[0];
                }
                catch(Throwable throwable3) {
                    goto label_167;
                }
                try {
                label_114:
                    fpkx1 = fpkx.b(fpkx1, eiui.e(gged_interceptors.k(arr_flag)));
                }
                catch(Throwable throwable2) {
                label_117:
                    s7 = s2;
                    throwable4 = throwable2;
                    goto label_169;
                }
                try {
                label_120:
                    eioa0.close();
                    gfsz2 = new gfsz(fpkx1, null);
                label_122:
                    fpkx2 = (fpkx)gfsz2.a;
                    ggeo0 = (ggeo)gfsz2.b;
                    hfsf4 = goab0.e;
                    s8 = goab0.f;
                }
                catch(IOException iOException0) {
                label_128:
                    s7 = s2;
                    goto label_175;
                }
                if((goab0.b & 8) == 0 && (goab0.b & 2) == 0 && (goab0.b & 4) == 0) {
                    if(eiog0.f()) {
                        eiok eiok1 = eiog0.b("SELECT experiment_token, server_token\nFROM experiment_states\nWHERE experiment_state_id = ?1;\n").h(new Object[]{((long)eite0.i)}).i();
                        try {
                            if(eiok1 == null) {
                                goto label_140;
                            }
                            else if(!eiok1.i(0)) {
                                gfsz3 = new gfsz(ByteString.copyFrom(eiok1.k(0)), eiok1.h(1));
                                goto label_136;
                            }
                            else {
                                goto label_138;
                            }
                            goto label_159;
                        }
                        catch(Throwable throwable5) {
                            goto label_143;
                        }
                    label_136:
                        eiok1.close();
                        goto label_159;
                        try {
                        label_138:
                            ((ggtj)eiui.c.j()).B("[Shared storage enabled] Experiment tokens omitted from Heterodyne response but no tokens were present in the database for %s.", s2);
                            goto label_145;
                        label_140:
                            ((ggtj)eiui.c.j()).B("[Shared storage enabled] Experiment tokens omitted from Heterodyne response but no tokens were present in the database for %s.", s2);
                        }
                        catch(Throwable throwable5) {
                        label_143:
                            TWR.safeClose$NT(eiok1, throwable5);
                            throw throwable5;
                        }
                    label_145:
                        if(eiok1 != null) {
                            eiok1.close();
                        }
                        goto label_158;
                    }
                    else {
                        eiok eiok2 = eiog0.b("SELECT experimentToken, serverToken\nFROM ExperimentTokens\nWHERE packageName = ?1 AND user = ?2 AND version = ?3 AND isCommitted = 0\nLIMIT 1;\n").h(new Object[]{s2, s1, ((int)eite0.c)}).i();
                        try {
                            if(eiok2 == null) {
                                goto label_153;
                            }
                            else {
                                gfsz3 = new gfsz(ByteString.copyFrom(eiok2.k(0)), eiok2.h(1));
                                goto label_151;
                            }
                            goto label_159;
                        }
                        catch(Throwable throwable6) {
                            goto label_156;
                        }
                    label_151:
                        eiok2.close();
                        goto label_159;
                        try {
                        label_153:
                            ((ggtj)eiui.c.j()).B("[Shared storage disabled] Experiment tokens omitted from Heterodyne response but no tokens were present in the database for %s.", s2);
                        }
                        catch(Throwable throwable6) {
                        label_156:
                            TWR.safeClose$NT(eiok2, throwable6);
                            throw throwable6;
                        }
                    label_158:
                        gfsz3 = new gfsz(ByteString.b, "");
                    }
                label_159:
                    hfsf4 = (ByteString)gfsz3.a;
                    s8 = (String)gfsz3.b;
                }
                goau goau0 = goab0.c == null ? goau.a : goab0.c;
                this.a.add(new eiuh(s2, s, s1, (goau0.e == null ? goag.a : goau0.e).c, this.e, hfsf3, s3, z, fpkx2, hfsf4, s8, ggeo0));
                return;
                try {
                label_164:
                    fpky0.b(eioa0.a);
                    goto label_108;
                }
                catch(Throwable throwable3) {
                label_167:
                    throwable4 = throwable3;
                    s7 = s2;
                }
                try {
                label_169:
                    eioa0.close();
                    throw throwable4;
                }
                catch(Throwable throwable7) {
                    try {
                        throwable4.addSuppressed(throwable7);
                        throw throwable4;
                    }
                    catch(IOException iOException0) {
                    }
                }
            label_175:
                ((ggtj)((ggtj)eiui.c.j()).s(iOException0)).R("Failed to read shared dir for P/H package: %s, user: %s from DB", s7, s1);
            }
        }
    }

    public final void c() {
        int v2;
        fpks fpks0;
        ProtoLiteBuilder hftp0;
        ggeo ggeo0;
        ByteString hfsf0;
        long v;
        String s1;
        String s;
        fpkx fpkx0;
        FileOutputStream fileOutputStream0;
        File file3;
        File file2;
        Iterator iterator0 = this.a.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            eiuh eiuh0 = (eiuh)object0;
            try {
                File file0 = eiuh0.h ? fhcd.a(this.d).getDir("phenotype_shared", 0) : this.d.getDir("phenotype_shared", 0);
                try {
                    fplb fplb0 = new fplb(eiuh0.f, eiuh0.a, eiuh0.c);
                    if(file0.getParentFile() != null) {
                        this.d(file0.getParentFile());
                    }
                    this.d(file0);
                    File file1 = new File(file0, fplb0.b().toString());
                    this.d(file1);
                    file2 = new File(file0, fplb0.a().toString());
                    file3 = File.createTempFile(file2.getName(), null, file1);
                    goto label_18;
                }
                catch(RuntimeException runtimeException0) {
                }
            }
            catch(IOException iOException0) {
                goto label_24;
            }
            Iterator iterator1 = iterator0;
            File file4 = null;
            goto label_110;
            try {
            label_18:
                fileOutputStream0 = new FileOutputStream(file3);
            }
            catch(RuntimeException runtimeException0) {
                iterator1 = iterator0;
                goto label_109;
            }
            catch(IOException iOException0) {
            label_24:
                iterator1 = iterator0;
                goto label_116;
            }
            try {
                fpkx0 = eiuh0.i;
                s = eiuh0.g;
                s1 = eiuh0.k;
                v = eiuh0.e;
                hfsf0 = eiuh0.j;
                ggeo0 = eiuh0.l;
                hftp0 = ((ProtoLiteMessage)fpks.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                fpks0 = (fpks)hftv0;
                iterator1 = iterator0;
            }
            catch(Throwable throwable0) {
                try {
                    iterator1 = iterator0;
                    fileOutputStream0.close();
                    throw throwable0;
                }
                catch(Throwable throwable1) {
                    try {
                        throwable0.addSuppressed(throwable1);
                        throw throwable0;
                    }
                    catch(RuntimeException runtimeException0) {
                        goto label_109;
                    }
                    catch(IOException iOException0) {
                        goto label_116;
                    }
                }
            }
            try {
                fpks0.b |= 1;
                fpks0.c = s;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                s1.getClass();
                ((fpks)hftv1).b |= 4;
                ((fpks)hftv1).e = s1;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((fpks)hftv2).b |= 8;
                ((fpks)hftv2).f = v;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp0.b_message;
                hfsf0.getClass();
                ((fpks)hftv3).b |= 2;
                ((fpks)hftv3).d = hfsf0;
                if(ggeo0 != null) {
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fpks fpks1 = (fpks)hftp0.b_message;
                    hfvh hfvh0 = fpks1.g;
                    if(!hfvh0.b) {
                        fpks1.g = hfvh0.a();
                    }
                    fpks1.g.putAll(ggeo0);
                }
                fplj fplj0 = new fplj(fpkx0, ((fpks)hftp0.N_build()));
                Objects.requireNonNull(fplj0.b);
                fplh fplh0 = new fplh(fplj0.b);
                byte[] arr_b = this.h.a(fplh0);
                fpks fpks2 = fplj0.c;
                if(((ProtoLiteMessage)fpks2).isImmutable()) {
                    v2 = ((ProtoLiteMessage)fpks2).t(null);
                    if(v2 < 0) {
                        throw new IllegalStateException("serialized size must be non-negative, was " + v2);
                    }
                }
                else {
                    int v1 = fpks2.memoizedSerializedSize & 0x7FFFFFFF;
                    if(v1 == 0x7FFFFFFF) {
                        v2 = ((ProtoLiteMessage)fpks2).t(null);
                        if(v2 < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + v2);
                        }
                        fpks2.memoizedSerializedSize = fpks2.memoizedSerializedSize & 0x80000000 | v2;
                    }
                    else {
                        v2 = v1;
                    }
                }
                int v3 = Math.min(CodedOutputStream.Y(v2) + 8 + v2 + CodedOutputStream.G(arr_b), 0x1000);
                hfsn hfsn0 = new hfsn(fileOutputStream0, v3);
                ((CodedOutputStream)hfsn0).q(1);
                ((CodedOutputStream)hfsn0).q(0);
                ((CodedOutputStream)hfsn0).writeRawVarint32(v2);
                ((ProtoLiteMessage)fpks2).writeTo(((CodedOutputStream)hfsn0));
                ((CodedOutputStream)hfsn0).ag(arr_b);
                ((CodedOutputStream)hfsn0).flush();
                gftb.v(hfsn0.d > 0x1000 || hfsn0.d == v3, "Buffer size should be min(serializedSize, 4096). Buffer size: %s, Serialized size: %s", v3, hfsn0.d);
                goto label_104;
            }
            catch(Throwable throwable0) {
                try {
                    TWR.safeClose$NT(fileOutputStream0, throwable0);
                    throw throwable0;
                label_104:
                    fileOutputStream0.close();
                    wzm.i(file3);
                    gftb.r(file3.renameTo(file2), "Failed to rename file");
                    goto label_113;
                }
                catch(RuntimeException runtimeException0) {
                }
                catch(IOException iOException0) {
                    goto label_116;
                }
            }
        label_109:
            file4 = file3;
            try {
            label_110:
                if(file4 != null) {
                    file4.delete();
                }
                ((ggtj)((ggtj)eiui.c.i()).s(runtimeException0)).R("Failed to write shared dir response for android package: %s, P/H config package: %s", eiuh0.b, eiuh0.a);
            label_113:
                eiuh0.m = true;
                goto label_118;
            }
            catch(IOException iOException0) {
            }
        label_116:
            eiuh0.n = true;
            ((ggtj)((ggtj)eiui.c.j()).s(iOException0)).B("Failed to write to shared dir for P/H package: %s", eiuh0.a);
        label_118:
            iterator0 = iterator1;
        }
    }

    @Override
    public final void close() {
        this.h.close();
        this.b.close();
    }

    private final void d(File file0) {
        Set set0 = this.g;
        if(set0.contains(file0.getAbsolutePath())) {
            return;
        }
        if(!file0.exists()) {
            gftb.r(file0.mkdir(), "Failed to create directory");
        }
        gftb.r(wzm.h(file0), "Failed to set world executable");
        set0.add(file0.getAbsolutePath());
    }

    private static final ggeo e(Iterable iterable0) {
        if(iterable0 == null) {
            return ggnf.a;
        }
        ggek ggek0 = new ggek();
        for(Object object0: iterable0) {
            Flag flag0 = (Flag)object0;
            int v = flag0.h;
            if(v == 2) {
                Boolean boolean0 = Boolean.valueOf(flag0.f());
                ggek0.i(flag0.b, boolean0);
            }
            else {
                switch(v) {
                    case 1: {
                        Long long0 = flag0.b();
                        ggek0.i(flag0.b, long0);
                        break;
                    }
                    case 3: {
                        Double double0 = flag0.a();
                        ggek0.i(flag0.b, double0);
                        break;
                    }
                    case 4: {
                        String s = flag0.d();
                        ggek0.i(flag0.b, s);
                        break;
                    }
                    case 5: {
                        byte[] arr_b = flag0.g();
                        ggek0.i(flag0.b, arr_b);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Could not serialize Flag for override: " + flag0);
                    }
                }
            }
        }
        return ggek0.g();
    }
}

