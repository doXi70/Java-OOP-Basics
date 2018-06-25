package p02_VehiclesExtention.exceptions.fuel;

import p02_VehiclesExtention.exceptions.ApplicationException;

public class InvalidTankCapacityException extends ApplicationException {
    public InvalidTankCapacityException(String message) {
        super(message);
    }
}
