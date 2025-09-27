package org.kniit.lab1.task2;

public class Main {
    public static void main(String[] args) {
        String url = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";

        // Создаем экземпляр класса SimpleUrl
        SimpleUrl simpleUrl = parseUrl(url);

        // Выводим информацию на экран
        System.out.println(simpleUrl);
    }

    private static SimpleUrl parseUrl(String url) {
        SimpleUrl simpleUrl = new SimpleUrl();

        try {
            // Разбор протокола
            int protocolEnd = url.indexOf("://");
            if (protocolEnd != -1) {
                simpleUrl.setProtocol(url.substring(0, protocolEnd));
                url = url.substring(protocolEnd + 3);
            }

            // Разбор адреса и домена
            int pathStart = url.indexOf("/");
            String hostPart = pathStart != -1 ? url.substring(0, pathStart) : url;

            if (hostPart.contains(".")) {
                simpleUrl.setAddress(hostPart);
                String[] hostParts = hostPart.split("\\.");
                if (hostParts.length >= 2) {
                    simpleUrl.setDomainZone(hostParts[hostParts.length - 1]);
                    simpleUrl.setSiteName(hostParts[0]);
                }
            }

            // Разбор пути
            if (pathStart != -1) {
                String pathPart = url.substring(pathStart + 1);
                int paramsStart = pathPart.indexOf("?");
                String pathWithoutParams = paramsStart != -1 ? pathPart.substring(0, paramsStart) : pathPart;

                // Разбор пути на части
                String[] pathSegments = pathWithoutParams.split("/");
                if (pathSegments.length >= 3) {
                    // Предпоследний элемент - номер (1072)
                    // Последний элемент - имя страницы
                    String webpage = pathSegments[pathSegments.length - 1];
                    if (webpage.contains(".")) {
                        String[] nameParts = webpage.split("\\.");
                        simpleUrl.setWebpageName(webpage);
                        simpleUrl.setWebPageExtension(nameParts[nameParts.length - 1]);
                    } else {
                        simpleUrl.setWebpageName(webpage);
                    }
                }
            }

            // Разбор параметров
            int paramsStart = url.indexOf("?");
            if (paramsStart != -1) {
                String paramsPart = url.substring(paramsStart + 1);
                String[] params = paramsPart.split("&");

                for (String param : params) {
                    String[] keyValue = param.split("=");
                    if (keyValue.length == 2) {
                        switch (keyValue[0]) {
                            case "intParam":
                                simpleUrl.setIntParam(keyValue[1]);
                                break;
                            case "doubleParam":
                                simpleUrl.setDoubleParam(keyValue[1]);
                                break;
                            case "textParameter":
                                simpleUrl.setTextParameter(keyValue[1]);
                                break;
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.err.println("Ошибка при парсинге URL: " + e.getMessage());
        }

        return simpleUrl;
    }
}