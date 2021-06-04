package com.latihan;

public class CentralJava {
    String regenciName;
    String cityName;
    String ipmCount;
    int districtCount;
    double incomeCount;
    double wideCount;

    public CentralJava(String regenci, String city, String ipm, int district, double income, double wide) {
        regenciName = regenci;
        cityName = city;
        ipmCount = ipm;
        districtCount = district;
        incomeCount = income;
        wideCount = wide;
    }
    
    public static void main(String[] args) {
        CentralJava brebes = new CentralJava("Brebes", "-", "high", 30, 3000000, 230.4039);

        System.out.println("Regency = " + brebes.regenciName);
        System.out.println("City = " + brebes.cityName);
        System.out.println("ipm = " + brebes.ipmCount);
        System.out.println("district = " + brebes.districtCount);
        System.out.println("income = " + brebes.incomeCount);
        System.out.println("wide = " + brebes.wideCount);

    }
}
