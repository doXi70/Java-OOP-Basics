package p02_VehiclesExtention.exceptions.fuel;

import p02_VehiclesExtention.exceptions.ApplicationException;

public class InvalidFuelQuantityException extends ApplicationException {
    public InvalidFuelQuantityException(String message) {
        super(message);
    }
}
