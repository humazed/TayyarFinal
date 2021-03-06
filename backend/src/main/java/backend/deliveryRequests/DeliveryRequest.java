package backend.deliveryRequests;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

/**
 * Created by Muhammad on 16/08/2017.
 */
@Entity
public class DeliveryRequest {
    @Id
    public Long id;
    public Long customerId;
    public Long driverId;
    public Long merchantId;
    //time info;
    //location info
    public boolean merchantAcceptsOrder = false;
    public boolean driverAcceptsOrder = false;
    public boolean driverConfirmedPickUP = false;
    public boolean orderDelivered = false;
    List<OrderItem> orderItems = new ArrayList<>();
    public List<Long> driversWhoRefusedIDs = new ArrayList<>();
    public String generalInstructions;

    public DeliveryRequest(Long customerId, Long merchantId,
                           List<OrderItem> orderItems,String generalInstructions) {
        this.customerId = customerId;
        this.merchantId = merchantId;
        this.orderItems = orderItems;
        this.generalInstructions = generalInstructions;
    }

    public DeliveryRequest() {
    }

    public void save() {
        ofy().save().entity(this).now();
    }

    public static DeliveryRequest getDeliveryRequestByID(Long deliveryRequestID) {
        Key<DeliveryRequest> deliveryRequestKey = Key.create(DeliveryRequest.class, deliveryRequestID);
        return ObjectifyService.ofy().load().key(deliveryRequestKey).now();
    }

    public void addDriverWhoRefused(Long id) {
        this.driversWhoRefusedIDs.add(id);
        save();
    }
}
