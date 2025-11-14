package AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employe {

    private Address address;

    @Autowired
    @Qualifier("address")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employe() {
        super();
    }

    @Override
    public String toString() {
        return "Employe{" +
                "address=" + address +
                '}';
    }
}
