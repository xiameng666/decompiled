import android.util.Log;
import j..util.DesugarCollections;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class fdpb {
    public static final int a;
    private static final gfud b;
    private final ffar c;
    private final fdpa d;

    static {
        fdpb.b = gfud.e('/');
    }

    public fdpb(ffar ffar0, fdpa fdpa0) {
        this.c = ffar0;
        this.d = fdpa0;
    }

    final fdor a(String s, String s1) {
        String s2;
        if(!hzxv.a.d().k()) {
            throw new fdoz("The feature flag is not enabled");
        }
        ffar ffar0 = this.c;
        s.getClass();
        if(!ffar0.b.containsKey(s)) {
            throw new fdoz("The package\'s paths may not be logged");
        }
        for(Object object0: fdpb.b.l(s1)) {
            s2 = (String)object0;
            if(gfta.c(s2)) {
                continue;
            }
            goto label_11;
        }
        s2 = "";
    label_11:
        ffbj ffbj0 = (ffbj)DesugarCollections.unmodifiableMap(ffar0.b).get(s);
        if(ffbj0 != null) {
            s2.getClass();
            if(ffbj0.b.containsKey(s2)) {
                ggeo ggeo0 = this.d.a;
                ggeo ggeo1 = (ggeo)ggeo0.get(s);
                if(ggeo1 != null && ggeo1.containsKey(s2)) {
                    try {
                        ggeo ggeo2 = (ggeo)ggeo0.get(s);
                        if(ggeo2 == null) {
                            throw new NoSuchElementException("Package does not contain paths with patterns");
                        }
                        Pattern pattern0 = (Pattern)ggeo2.get(s2);
                        if(pattern0 == null) {
                            throw new NoSuchElementException("Pattern not present");
                        }
                        Matcher matcher0 = pattern0.matcher(s1);
                        if(!matcher0.matches()) {
                            if(Log.isLoggable("PathDimensionUtil", 2)) {
                                Log.v("PathDimensionUtil", "extractPathPrefix: Unmatched capture group: " + s1);
                            }
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fdor.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            fdor fdor0 = (fdor)hftp0.b_message;
                            s2.getClass();
                            fdor0.b |= 1;
                            fdor0.c = s2;
                            return (fdor)hftp0.N_build();
                        }
                        try {
                            String s3 = matcher0.group("package");
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fdor.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            fdor fdor1 = (fdor)hftp1.b_message;
                            s2.getClass();
                            fdor1.b |= 1;
                            fdor1.c = s2;
                            if(!gfta.c(s3)) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                fdor fdor2 = (fdor)hftp1.b_message;
                                s3.getClass();
                                fdor2.b |= 2;
                                fdor2.d = s3;
                            }
                            return (fdor)hftp1.N_build();
                        }
                        catch(IllegalArgumentException unused_ex) {
                            if(Log.isLoggable("PathDimensionUtil", 2)) {
                                Log.v("PathDimensionUtil", "extractPathPrefix: Missing package capture: " + s1);
                            }
                            try {
                                String s4 = matcher0.group("path");
                                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fdor.a).v_newBuilder();
                                if(!hftp2.b_message.isImmutable()) {
                                    hftp2.ensureMutable();
                                }
                                fdor fdor3 = (fdor)hftp2.b_message;
                                fdor3.b |= 1;
                                fdor3.c = s2 + s4;
                                return (fdor)hftp2.N_build();
                            }
                            catch(IllegalArgumentException unused_ex) {
                                if(Log.isLoggable("PathDimensionUtil", 2)) {
                                    Log.v("PathDimensionUtil", "extractPathPrefix: Missing package capture: " + s1);
                                }
                                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fdor.a).v_newBuilder();
                                if(!hftp3.b_message.isImmutable()) {
                                    hftp3.ensureMutable();
                                }
                                fdor fdor4 = (fdor)hftp3.b_message;
                                s2.getClass();
                                fdor4.b |= 1;
                                fdor4.c = s2;
                                return (fdor)hftp3.N_build();
                            }
                        }
                    }
                    catch(NoSuchElementException unused_ex) {
                        if(Log.isLoggable("PathDimensionUtil", 3)) {
                            Log.d("PathDimensionUtil", "getLoggablePath: Cannot extract path for " + s1);
                        }
                    }
                }
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)fdor.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                fdor fdor5 = (fdor)hftp4.b_message;
                s2.getClass();
                fdor5.b |= 1;
                fdor5.c = s2;
                return (fdor)hftp4.N_build();
            }
        }
        throw new fdoz("The path may not be logged");
    }

    public final fdor b(String s, String s1) {
        try {
            return this.a(s, s1);
        }
        catch(fdoz fdoz0) {
            if(Log.isLoggable("PathDimensionUtil", 3)) {
                Log.d("PathDimensionUtil", "getLoggablePathOrDefault: Cannot get the path prefix", fdoz0);
            }
            return fdor.a;
        }
    }
}

