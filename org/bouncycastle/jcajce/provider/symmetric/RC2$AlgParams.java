package org.bouncycastle.jcajce.provider.symmetric;

import idqm;
import idqt;
import idvl;
import iftq;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;

public class RC2.AlgParams extends BaseAlgorithmParameters {
    private static final short[] ekb;
    private byte[] iv;
    private int parameterVersion;
    private static final short[] table;

    static {
        RC2.AlgParams.table = new short[]{0xBD, 86, 0xEA, 0xF2, 0xA2, 0xF1, 0xAC, 42, 0xB0, 0x93, 209, 0x9C, 27, 51, 0xFD, 0xD0, 0x30, 4, 0xB6, 220, 0x7D, 0xDF, 50, 75, 0xF7, 203, 69, 0x9B, 49, 0xBB, 33, 90, 65, 0x9F, 0xE1, 0xD9, 74, 77, 0x9E, 0xDA, 0xA0, 104, 44, 0xC3, 39, 0x5F, 0x80, 54, 62, 0xEE, 0xFB, 0x95, 26, 0xFE, 206, 0xA8, 52, 0xA9, 19, 0xF0, 0xA6, 0x3F, 0xD8, 12, 120, 36, 0xAF, 35, 82, 0xC1, 103, 23, 0xF5, 102, 0x90, 0xE7, 0xE8, 7, 0xB8, 0x60, 72, 230, 30, 83, 0xF3, 0x92, 0xA4, 0x72, 140, 8, 21, 110, 0x86, 0, 0x84, 0xFA, 0xF4, 0x7F, 0x8A, 66, 25, 0xF6, 0xDB, 205, 20, 0x8D, 80, 18, 0xBA, 60, 6, 78, 0xEC, 0xB3, 53, 17, 0xA1, 0x88, 0x8E, 43, 0x94, 0x99, 0xB7, 0x71, 0x74, 0xD3, 0xE4, 0xBF, 58, 0xDE, 150, 14, 0xBC, 10, 0xED, 0x77, 0xFC, 55, 107, 3, 0x79, 0x89, 98, 0xC6, 0xD7, 0xC0, 210, 0x7C, 106, 0x8B, 34, 0xA3, 91, 5, 93, 2, 0x75, 0xD5, 97, 0xE3, 24, 0x8F, 85, 81, 0xAD, 0x1F, 11, 94, 0x85, 0xE5, 0xC2, 87, 99, 202, 61, 108, 180, 0xC5, 204, 0x70, 0xB2, 0x91, 89, 13, 71, 0x20, 200, 0x4F, 88, 0xE0, 1, 0xE2, 22, 56, 0xC4, 0x6F, 59, 15, 101, 70, 190, 0x7E, 45, 0x7B, 130, 0xF9, 0x40, 0xB5, 29, 0x73, 0xF8, 0xEB, 38, 0xC7, 0x87, 0x97, 37, 84, 0xB1, 40, 170, 0x98, 0x9D, 0xA5, 100, 109, 0x7A, 0xD4, 16, 0x81, 68, 0xEF, 73, 0xD6, 0xAE, 46, 0xDD, 0x76, 92, 0x2F, 0xA7, 28, 201, 9, 105, 0x9A, 0x83, 0xCF, 41, 57, 0xB9, 0xE9, 76, 0xFF, 67, 0xAB};
        RC2.AlgParams.ekb = new short[]{93, 190, 0x9B, 0x8B, 17, 0x99, 110, 77, 89, 0xF3, 0x85, 0xA6, 0x3F, 0xB7, 0x83, 0xC5, 0xE4, 0x73, 107, 58, 104, 90, 0xC0, 71, 0xA0, 100, 52, 12, 0xF1, 0xD0, 82, 0xA5, 0xB9, 30, 150, 67, 65, 0xD8, 0xD4, 44, 0xDB, 0xF8, 7, 0x77, 42, 202, 0xEB, 0xEF, 16, 28, 22, 13, 56, 0x72, 0x2F, 0x89, 0xC1, 0xF9, 0x80, 0xC4, 109, 0xAE, 0x30, 61, 206, 0x20, 99, 0xFE, 230, 26, 0xC7, 0xB8, 80, 0xE8, 36, 23, 0xFC, 37, 0x6F, 0xBB, 106, 0xA3, 68, 83, 0xD9, 0xA2, 1, 0xAB, 0xBC, 0xB6, 0x1F, 0x98, 0xEE, 0x9A, 0xA7, 45, 0x4F, 0x9E, 0x8E, 0xAC, 0xE0, 0xC6, 73, 70, 41, 0xF4, 0x94, 0x8A, 0xAF, 0xE1, 91, 0xC3, 0xB3, 0x7B, 87, 209, 0x7C, 0x9C, 0xED, 0x87, 0x40, 140, 0xE2, 203, 0x93, 20, 201, 97, 46, 0xE5, 204, 0xF6, 94, 0xA8, 92, 0xD6, 0x75, 0x8D, 98, 0x95, 88, 105, 0x76, 0xA1, 74, 0xB5, 85, 9, 120, 51, 130, 0xD7, 0xDD, 0x79, 0xF5, 27, 11, 0xDE, 38, 33, 40, 0x74, 4, 0x97, 86, 0xDF, 60, 0xF0, 55, 57, 220, 0xFF, 6, 0xA4, 0xEA, 66, 8, 0xDA, 180, 0x71, 0xB0, 0xCF, 18, 0x7A, 78, 0xFA, 108, 29, 0x84, 0, 200, 0x7F, 0x91, 69, 170, 43, 0xC2, 0xB1, 0x8F, 0xD5, 0xBA, 0xF2, 0xAD, 25, 0xB2, 103, 54, 0xF7, 15, 10, 0x92, 0x7D, 0xE3, 0x9D, 0xE9, 0x90, 62, 35, 39, 102, 19, 0xEC, 0x81, 21, 0xBD, 34, 0xBF, 0x9F, 0x7E, 0xA9, 81, 75, 76, 0xFB, 2, 0xD3, 0x70, 0x86, 49, 0xE7, 59, 5, 3, 84, 0x60, 72, 101, 24, 210, 205, 0x5F, 50, 0x88, 14, 53, 0xFD};
    }

    public RC2.AlgParams() {
        this.parameterVersion = 58;
    }

    @Override
    protected byte[] engineGetEncoded() {
        return iftq.j(this.iv);
    }

    @Override
    protected byte[] engineGetEncoded(String s) {
        if(this.isASN1FormatString(s)) {
            return this.parameterVersion == -1 ? new idvl(this.engineGetEncoded()).u() : new idvl(this.parameterVersion, this.engineGetEncoded()).u();
        }
        return s.equals("RAW") ? this.engineGetEncoded() : null;
    }

    @Override
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec0) {
        if((algorithmParameterSpec0 instanceof IvParameterSpec)) {
            this.iv = ((IvParameterSpec)algorithmParameterSpec0).getIV();
            return;
        }
        if(!(algorithmParameterSpec0 instanceof RC2ParameterSpec)) {
            throw new InvalidParameterSpecException("IvParameterSpec or RC2ParameterSpec required to initialise a RC2 parameters algorithm parameters object");
        }
        int v = ((RC2ParameterSpec)algorithmParameterSpec0).getEffectiveKeyBits();
        if(v != -1) {
            this.parameterVersion = v < 0x100 ? RC2.AlgParams.table[v] : v;
        }
        this.iv = ((RC2ParameterSpec)algorithmParameterSpec0).getIV();
    }

    @Override
    protected void engineInit(byte[] arr_b) {
        this.iv = iftq.j(arr_b);
    }

    @Override
    protected void engineInit(byte[] arr_b, String s) {
        if(this.isASN1FormatString(s)) {
            idqm idqm0 = idqm.w(arr_b);
            idvl idvl0 = idqm0 == null ? null : new idvl(idqt.m(idqm0));
            if(idvl0.a() != null) {
                this.parameterVersion = idvl0.a().intValue();
            }
            this.iv = idvl0.b.b;
            return;
        }
        if(!s.equals("RAW")) {
            throw new IOException("Unknown parameters format in IV parameters object");
        }
        this.engineInit(arr_b);
    }

    @Override
    protected String engineToString() {
        return "RC2 Parameters";
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class0) {
        if(class0 == RC2ParameterSpec.class || class0 == AlgorithmParameterSpec.class) {
            int v = this.parameterVersion;
            if(v != -1) {
                return v >= 0x100 ? new RC2ParameterSpec(this.parameterVersion, this.iv) : new RC2ParameterSpec(((int)RC2.AlgParams.ekb[this.parameterVersion]), this.iv);
            }
        }
        if(class0 == IvParameterSpec.class) {
            return new IvParameterSpec(this.iv);
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to RC2 parameters object.");
    }
}

