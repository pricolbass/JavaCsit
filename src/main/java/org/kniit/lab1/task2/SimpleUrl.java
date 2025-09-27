package org.kniit.lab1.task2;

public class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webpageName;
    private String webPageExtension;
    private String intParam;
    private String doubleParam;
    private String textParameter;

    // Конструктор по умолчанию
    public SimpleUrl() {
    }

    // Конструктор со всеми параметрами
    public SimpleUrl(String protocol, String address, String domainZone,
                     String siteName, String webpageName, String webPageExtension,
                     String intParam, String doubleParam, String textParameter) {
        this.protocol = protocol;
        this.address = address;
        this.domainZone = domainZone;
        this.siteName = siteName;
        this.webpageName = webpageName;
        this.webPageExtension = webPageExtension;
        this.intParam = intParam;
        this.doubleParam = doubleParam;
        this.textParameter = textParameter;
    }

    // Геттеры
    public String getProtocol() {
        return protocol;
    }

    public String getAddress() {
        return address;
    }

    public String getDomainZone() {
        return domainZone;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getWebpageName() {
        return webpageName;
    }

    public String getWebPageExtension() {
        return webPageExtension;
    }

    public String getIntParam() {
        return intParam;
    }

    public String getDoubleParam() {
        return doubleParam;
    }

    public String getTextParameter() {
        return textParameter;
    }

    // Сеттеры
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDomainZone(String domainZone) {
        this.domainZone = domainZone;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setWebpageName(String webpageName) {
        this.webpageName = webpageName;
    }

    public void setWebPageExtension(String webPageExtension) {
        this.webPageExtension = webPageExtension;
    }

    public void setIntParam(String intParam) {
        this.intParam = intParam;
    }

    public void setDoubleParam(String doubleParam) {
        this.doubleParam = doubleParam;
    }

    public void setTextParameter(String textParameter) {
        this.textParameter = textParameter;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "protocol = " + protocol + "\n" +
                "address = " + address + "\n" +
                "domainZone = " + domainZone + "\n" +
                "siteName = " + siteName + "\n" +
                "webpageName = " + webpageName + "\n" +
                "webPageExtention = " + webPageExtension + "\n" +
                "intParam = " + intParam + "\n" +
                "doubleParam = " + doubleParam + "\n" +
                "textParameter = " + textParameter;
    }
}