package org.studyeasy.Interfaces;

public class Iphone8 implements Phone{
    @Override
    public String processor() {
        return "A11";
    }

    @Override
    public String OS() {
        return "IOS";
    }

    @Override
    public int spaceINGB() {
        return 64;
    }
}
