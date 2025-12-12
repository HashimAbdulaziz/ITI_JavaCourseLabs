package Lab2;

public class IpChecker {

    public boolean isValid(String ip) {
        return ip.matches("^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$");
    }

}

