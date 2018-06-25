package p02_VehiclesExtention.exceptions.distance;

import p02_VehiclesExtention.exceptions.ApplicationException;

public class InvalidDistanceException extends ApplicationException {
    public InvalidDistanceException(String message) {
        super(message);
    }
}
