package org.bouncycastle.jcajce.provider.symmetric.util;

import idqm;
import ienq;
import iepk;
import ietb;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.PrivilegedActionException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class GcmSpecUtil {
    private static final Constructor constructor;
    static final Class gcmSpecClass;
    private static final Method iv;
    private static final Method tLen;

    static {
        Method method0;
        Class class0 = ClassUtil.loadClass(GcmSpecUtil.class, "javax.crypto.spec.GCMParameterSpec");
        GcmSpecUtil.gcmSpecClass = class0;
        if(class0 == null) {
            method0 = null;
            GcmSpecUtil.constructor = null;
            GcmSpecUtil.tLen = null;
        }
        else {
            GcmSpecUtil.constructor = GcmSpecUtil.extractConstructor();
            GcmSpecUtil.tLen = GcmSpecUtil.extractMethod("getTLen");
            method0 = GcmSpecUtil.extractMethod("getIV");
        }
        GcmSpecUtil.iv = method0;
    }

    static ienq extractAeadParameters(iepk iepk0, AlgorithmParameterSpec algorithmParameterSpec0) {
        try {
            return (ienq)AccessController.doPrivileged(new GcmSpecUtil.3(iepk0, algorithmParameterSpec0));
        }
        catch(Exception unused_ex) {
            throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
        }
    }

    private static Constructor extractConstructor() {
        try {
            return (Constructor)AccessController.doPrivileged(new GcmSpecUtil.1());
        }
        catch(PrivilegedActionException unused_ex) {
            return null;
        }
    }

    public static ietb extractGcmParameters(AlgorithmParameterSpec algorithmParameterSpec0) {
        try {
            return (ietb)AccessController.doPrivileged(new GcmSpecUtil.4(algorithmParameterSpec0));
        }
        catch(Exception unused_ex) {
            throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
        }
    }

    public static AlgorithmParameterSpec extractGcmSpec(idqm idqm0) {
        try {
            ietb ietb0 = ietb.a(idqm0);
            byte[] arr_b = ietb0.b();
            return (AlgorithmParameterSpec)GcmSpecUtil.constructor.newInstance(((int)(ietb0.a * 8)), arr_b);
        }
        catch(Exception exception0) {
            throw new InvalidParameterSpecException("Construction failed: " + exception0.getMessage());
        }
    }

    private static Method extractMethod(String s) {
        try {
            return (Method)AccessController.doPrivileged(new GcmSpecUtil.2(s));
        }
        catch(PrivilegedActionException unused_ex) {
            return null;
        }
    }

    public static boolean gcmSpecExists() {
        return GcmSpecUtil.gcmSpecClass != null;
    }

    /*
    String Decryptor: 1 succeeded, 1 failed
    - Failure: gcmSpecExtractable()<boolean> @ Lorg/bouncycastle/jcajce/provider/symmetric/ARIA$AlgParamsGCM;->localEngineGetParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;+8Ah
    */
    public static boolean gcmSpecExtractable() {
        return GcmSpecUtil.constructor != null;
    }

    public static boolean isGcmSpec(Class class0) {
        return GcmSpecUtil.gcmSpecClass == class0;
    }

    public static boolean isGcmSpec(AlgorithmParameterSpec algorithmParameterSpec0) {
        return GcmSpecUtil.gcmSpecClass != null && GcmSpecUtil.gcmSpecClass.isInstance(algorithmParameterSpec0);
    }
}

